package ice_hrm.com.utility;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class PropertyHandling  {
   Properties prop;
   
   
   public PropertyHandling() {
	   try {
		   //config Properties file path
		   String filePath=System.getProperty("user.dir") + "//target//config.properties";
		   FileInputStream file=new FileInputStream(filePath);
		   prop=new Properties();
		   prop.load(file);
	   }catch(IOException e) {
	     throw new RuntimeException(e);
	      
   }   
}
   public String getProperty(String key) {
	   String value=prop.getProperty(key);
	   System.out.println(value);
	   return value;
   }
}