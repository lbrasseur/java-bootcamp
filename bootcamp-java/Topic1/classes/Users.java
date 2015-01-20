package classes;

public class Users {

	private String name, surname, telephoneNum, creditCardNum, deliverAdd, email, username, password;
	private String rol = "guest";
	private boolean mailist = false;
	
	public Users(){
		
	}

	public Users(String name, String surname, String rol, String telephoneNum,
			String creditCardNum, String deliverAdd, String email,
			String username, String password, boolean mailist) {
		super();
		this.name = name;
		this.surname = surname;
		this.rol = rol;
		this.telephoneNum = telephoneNum;
		this.creditCardNum = creditCardNum;
		this.deliverAdd = deliverAdd;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mailist = mailist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTelephoneNum() {
		return telephoneNum;
	}

	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public String getDeliverAdd() {
		return deliverAdd;
	}

	public void setDeliverAdd(String deliverAdd) {
		this.deliverAdd = deliverAdd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isMailist() {
		return mailist;
	}

	public void setMailist(boolean mailist) {
		this.mailist = mailist;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", surname=" + surname + ", rol=" + rol
				+ ", telephoneNum=" + telephoneNum + ", creditCardNum="
				+ creditCardNum + ", deliverAdd=" + deliverAdd + ", email="
				+ email + ", username=" + username + ", mailist=" + mailist
				+ "]";
	}
	
}
