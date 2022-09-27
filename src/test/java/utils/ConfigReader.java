package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;



public class ConfigReader {
	
	Properties prop;

	public ConfigReader() {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\amitf\\eclipse-workspace\\lms-Hackathon\\src\\test\\resources\\Configs\\config.properties");
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
  
        public String headers() {
			String he=prop.getProperty("header");
			return he;
		}
	
     public String footers() {
			String fu=prop.getProperty("footer");
			return fu;
		}
     public String search() {
 			String se=prop.getProperty("searchentry");
 			return se;
 		}
     public String name() {
			String na=prop.getProperty("assignname");
			return na;
		}
	
     public String grade() {
			String gr=prop.getProperty("assigngrade");
			return gr;
		}
     public String intotaltwo() {
			String to=prop.getProperty("totaltwo");
			return to;
		}
     public String pagetotal() {
			String pg=prop.getProperty("title");
			return pg;
		}
     public String intotalzero() {
			String tot=prop.getProperty("totalzero");
			return tot;
		}

     public String namereq() {
			String req=prop.getProperty("namerequ");
			return req;
		}
     public String assname() {
			String ss=prop.getProperty("newassname");
			return ss;
		}
     public String desc() {
			String ds=prop.getProperty("newdesc");
			return ds;
		}
     public int due() {
			int df=Integer.parseInt(prop.getProperty("duedat"));
			return df;
		}
     public String entryshow() {
			String dss=prop.getProperty("showentry");
			return dss;
		}
     public String entryone() {
			String dssd=prop.getProperty("oneentry");
			return dssd;
		}
     public String entrythree() {
			String dssde=prop.getProperty("threeentry");
			return dssde;
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
