package com.prgguru.jersey;
//Change these parameters according to your DB
public class Constants {
	//public static String dbClass = "com.mysql.jdbc.Driver";
	public static String dbClass = "org.sqlite.JDBC";
	private static String dbName= "//usr/share/tomcat/webapps/useraccount/WEB-INF/classes/useraccount.db";
	//public static String dbUrl = "jdbc:mysql://localhost:3306/"+dbName;
	public static String dbUrl = "jdbc:sqlite:"+dbName;
	public static String dbUser = "root";
	public static String dbPwd = "password";
}
