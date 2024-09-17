package org.exam.helper;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;

public class PathHelper {
	
	public static final String filePath="C:\\Users\\rutuj\\OneDrive\\Desktop\\seminar\\questionbank";
	public static String completePath="";
	public static Properties p= new Properties();
	
	
	public PathHelper() {
		try {
		Path currentDirectoryPath=FileSystems.getDefault().getPath("");
		String currentDirectoryName=currentDirectoryPath.toAbsolutePath().toString();
		 completePath=currentDirectoryName+"\\src\\resources\\db.properties";
		 FileInputStream finf=new FileInputStream(completePath);
		 p.load(finf);
		
	}
		catch(Exception ex) {
			System.out.println("error is"+ex);
		}
	}
}
