package resusable;

import java.util.Properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;  
public class Base 
{
	@Test
public void invoceDriver() throws Exception
{
	String filePath="Properties/demo.properties";
	FileInputStream fileInput=new FileInputStream(filePath); //for read file inputs
	
	Properties pr=new Properties();
	
	pr.load(fileInput);
     String url=pr.getProperty("url");
     String s2=pr.getProperty("browser");
     
     System.out.println(url);
     System.out.println(s2);
}
}
