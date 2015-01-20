package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Marcos Dalmasso
 * 
 * @category Auxiliary static methods.
 */
public class Auxiliary {

	/**
	 * @param path The path to the file with credentials.
	 * @return c Connection to DB.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection makeConnection(String pathConfig) {
		String[] config = readConfig(pathConfig);
		if (config == null)
			return null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found when trying to create the class com.mysql.jdbc.Driver");
			e.printStackTrace();
		}

		Connection c = null;

		try {
			c = DriverManager.getConnection("jdbc:mysql://" + config[0].trim()
					+ ":" + config[1].trim() + "/" + config[2].trim(),
					config[3].trim(), config[4].trim());
			return c;
		} catch (SQLException e) {
			System.out.println("Error creating DB connection. " + e.toString());
		}
		return null;
	}
	
	/**
	 * 
	 * @param path The path with credentials to connect to the DB.
	 * @return config The configuration.
	 * @throws FileNotFoundException.
	 */
	private static String[] readConfig(String path){
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream(path);
			Scanner sc = new Scanner(fis);
			if (!sc.hasNextLine()){
				System.out.println("Corrupt file - Blank file.");
				return null;
			}
			
			String linea = sc.nextLine();
			sc.close();
			String config[] = linea.split(":");
			
			if (config.length != 5){
				System.out.println("Corrupt file - Invalid file format.");
				return null;
			}
			return config;
			
		}
		catch (FileNotFoundException e){
			System.out.println("File not found at:" + path);
			return null;
		}
		finally {
			if (fis != null)
				try {fis.close();} catch (Exception e){}
		}
	}
	
	/**
	 * @param c The connection to DB.
	 * @return An ArrayList with all the products into the DB.
	 * @throws SQLException.
	 */
	
	public static ArrayList<Products> readProducts(Connection c){

		ResultSet res = doQuery(c, "SELECT * FROM shoppingcart.products");

		if (res == null)
			return null;

		ArrayList<Products> products = new ArrayList<Products>();
		
		try{
			while (res.next()){
				Products p = new Products(
						res.getString("description"),
						res.getDouble("price"));
				products.add(p);
			}	
		}
		catch (SQLException e){
			System.out.println(e.toString());
			return null;
		}
		return products;
	}
	
	/**
	 * 
	 * @param c The connection to DB.
	 * @param str Sentence to execute.
	 * @return The ResultSet of the query executed.
	 * @throws SQLException.
	 */
	public static ResultSet doQuery (Connection c, String str){
		try{
			Statement s = c.createStatement();
			try {
				ResultSet r = s.executeQuery(str);
				return r;
			}
			catch (SQLException e){
				System.out.println(e.toString());
				e.printStackTrace();
				return null;
			}
			
		}
		catch (SQLException e){
			System.out.println(e.toString());
			e.printStackTrace();
			return null;
		}
	}
}