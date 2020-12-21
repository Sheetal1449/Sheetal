package com.HybridFrameworkDemo.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
 static Properties pro;
	public static String getPropertyFromConfig(String key)
	{
		createInstance();
		return pro.getProperty(key);
	}
	
	public static Properties createInstance() {
		
		if(pro==null)
		{
			pro=new Properties();
			try {
				pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Config/config.property")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pro;
					}
		else {
			return pro;
		}
	}
	
}
