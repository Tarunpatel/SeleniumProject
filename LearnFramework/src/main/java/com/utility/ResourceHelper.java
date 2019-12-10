package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {

		public static String getBaseResourcePath() {
			String path = System.getProperty("user.dir");
			System.out.println(path);
			return path;
		}
		
		public static InputStream getResourcePathInputStream(String path) throws FileNotFoundException{
			return new FileInputStream(ResourceHelper.getResourcePath(path));
		}
		
		public static String getResourcePath(String path) {
	        String basePath = System.getProperty("user.dir");
	        System.out.println(basePath +"/"+ path);
			return basePath +"/"+ path;
		}
	}



