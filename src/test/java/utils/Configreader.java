package stepDefinition;

import java.io.FileInputStream;
import java.util.Properties;

public class Configreader {

       static Properties prop;
		static String url;
		
		
		public Configreader(){
			
			 try {
					FileInputStream fis= new FileInputStream("C:\\Users\\amitf\\Desktop\\backuplms\\src\\test\\resources\\Configs\\config.properties");
					prop= new Properties();
					prop.load(fis);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Exception is: "+ e.getMessage());
				}
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
        
        
        
       
}
