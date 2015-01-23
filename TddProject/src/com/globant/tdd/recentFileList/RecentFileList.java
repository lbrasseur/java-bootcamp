package com.globant.tdd.recentFileList;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecentFileList {
	
	ArrayList<String> recentFileList = new ArrayList <String>();
	private final int listSize = 15; //change cache size as you wish.
	
	public void addFilesToRecenList(Files file){
		if(recentFileList.contains(file.getName())){
			recentFileList.remove(file.getName());
		}
		if(recentFileList.size()==listSize){
			recentFileList.remove(0);
			recentFileList.add(file.getName());
			return;
		}
		recentFileList.add(file.getName());
	}

	@Test
	public void testFirstRun() {
		assertEquals(new ArrayList<String>(), recentFileList);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void testAddingFile() {
		addFilesToRecenList(new Files("svchost1"));
		assertEquals(new ArrayList<String>() {{add("svchost1");}}, recentFileList);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void testAddingExistingFile() {
		addFilesToRecenList(new Files("svchost1"));
		addFilesToRecenList(new Files("svchost2"));
		addFilesToRecenList(new Files("svchost3"));
		addFilesToRecenList(new Files("svchost4"));
		addFilesToRecenList(new Files("svchost5"));
		addFilesToRecenList(new Files("svchost6"));
		addFilesToRecenList(new Files("svchost4"));
		assertEquals(new ArrayList<String>() {{add("svchost1");add("svchost2");
			add("svchost3");add("svchost5");add("svchost6");add("svchost4");}}, recentFileList);
	}
	
	@SuppressWarnings("serial")
	@Test
	public void testAddingFileToFullList() {
		addFilesToRecenList(new Files("svchost1"));
		addFilesToRecenList(new Files("svchost2"));
		addFilesToRecenList(new Files("svchost3"));
		addFilesToRecenList(new Files("svchost4"));
		addFilesToRecenList(new Files("svchost5"));
		addFilesToRecenList(new Files("svchost6"));
		addFilesToRecenList(new Files("svchost7"));
		addFilesToRecenList(new Files("svchost8"));
		addFilesToRecenList(new Files("svchost9"));
		addFilesToRecenList(new Files("svchost10"));
		addFilesToRecenList(new Files("svchost11"));
		addFilesToRecenList(new Files("svchost12"));
		addFilesToRecenList(new Files("svchost13"));
		addFilesToRecenList(new Files("svchost14"));
		addFilesToRecenList(new Files("svchost15"));
		addFilesToRecenList(new Files("svchost16"));
		assertEquals(new ArrayList<String>() {{add("svchost2");
			add("svchost3");add("svchost4");add("svchost5");add("svchost6");
			add("svchost7");add("svchost8");add("svchost9");add("svchost10");
			add("svchost11");add("svchost12");add("svchost13");add("svchost14");
			add("svchost15");add("svchost16");}}, recentFileList);
	}

	@SuppressWarnings("serial")
	@Test
	public void testAddingExistingFileToFullList() {
		addFilesToRecenList(new Files("svchost1"));
		addFilesToRecenList(new Files("svchost2"));
		addFilesToRecenList(new Files("svchost3"));
		addFilesToRecenList(new Files("svchost4"));
		addFilesToRecenList(new Files("svchost5"));
		addFilesToRecenList(new Files("svchost6"));
		addFilesToRecenList(new Files("svchost7"));
		addFilesToRecenList(new Files("svchost8"));
		addFilesToRecenList(new Files("svchost9"));
		addFilesToRecenList(new Files("svchost10"));
		addFilesToRecenList(new Files("svchost11"));
		addFilesToRecenList(new Files("svchost12"));
		addFilesToRecenList(new Files("svchost13"));
		addFilesToRecenList(new Files("svchost14"));
		addFilesToRecenList(new Files("svchost15"));
		addFilesToRecenList(new Files("svchost9"));
		assertEquals(new ArrayList<String>() {{add("svchost1");add("svchost2");
			add("svchost3");add("svchost4");add("svchost5");add("svchost6");
			add("svchost7");add("svchost8");add("svchost10");
			add("svchost11");add("svchost12");add("svchost13");add("svchost14");
			add("svchost15");add("svchost9");}}, recentFileList);
	}
}
