package Kalluri.Maheshbabu;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class KalluriGlobalVariables {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties porp = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Bablu\\Mahesh\\Maheshbabu\\src\\test\\java\\kalluri.properties");
		porp.load(fis);
		porp.getProperty("browser");
		
		System.out.println(porp.getProperty("browser"));
		System.out.println(porp.getProperty("surname"));

		porp.setProperty("browser", "firefox");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Bablu\\Mahesh\\Maheshbabu\\src\\test\\java\\kalluri.properties");
		porp.store(fos, null);
		System.out.println(porp.getProperty("browser"));

		
		}

}
