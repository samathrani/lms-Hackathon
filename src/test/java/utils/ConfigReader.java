package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {
	
	Properties prop;

	public ConfigReader() {

		try {
			FileInputStream fis = new FileInputStream("/Users/ezhilvanan/eclipse-workspace/SDET/lms-Hackathon/src/test/resources/TestData/config.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
 			e.printStackTrace();
		}
	}
	public String getfirstName() {

		String  firstName= prop.getProperty("firstName");
		return firstName ;
	}
	
	public String getlastName() {

		String lastName = prop.getProperty("lastName");
		return lastName;
	}
	
   public int getaddress() {

		int address = Integer.parseInt(prop.getProperty("address"));
		return address;
	}
	
   public String getstreetName() {

		String streetName = prop.getProperty("streetName");
		return streetName;
	}
	
   public String getcity() {

		String city = prop.getProperty("city");
		return city;
	}
   
   public String getstate() {

		String state = prop.getProperty("state");
		return state;
	}
   public int getzip() {

		int zip = Integer.parseInt(prop.getProperty("zip"));
		return zip;
   }
   
   public String getbirthDate() {

		String birthDate = prop.getProperty("birthDate");
		return birthDate;
	}
   public String getuserName() {

		String userName = prop.getProperty("userName");
		return userName;
	}
   public String getpassword() {

		String password = prop.getProperty("password");
		return password ;
	}
   
   public int getphone() {

		int phone = Integer.parseInt(prop.getProperty("phone"));
		return phone;
  }
   public String getemail() {

		String email = prop.getProperty("email");
		return email;
	}
   public String existinguserName() {

		String userName = prop.getProperty("existinguserName");
		return userName;
	}
  public String getinvalidpassword() {

		String password = prop.getProperty("invalidpassword");
		return password ;
	}
  
  public int getinvalidphone() {

		int phone = Integer.parseInt(prop.getProperty("invalidphone"));
		return phone;
 }
  public String getinvalidemail() {

		String email = prop.getProperty("invalidemail");
		return email;
	}
  
   
   @Test
	public void readPropFiles() {
	   getfirstName();
		System.out.println("getbaseurl() is" + getfirstName());
		getbirthDate();
		System.out.println("getJobDescription() is" + getbirthDate());
		getzip();
		System.out.println("getJobDescription() is" + 	getzip());
	} 
   
   
   
   
   
   
}
