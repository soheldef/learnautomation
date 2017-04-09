package ReadExcelData;

import lib.ExcelFile_Config;

public class ReadExcelData {	
      ExcelFile_Config con=new ExcelFile_Config("F:\\Selenium\\workspace\\LoarnAutomation_Excel\\UserInfo.xlsx");
      
      public String getusername(){
    	  String user =con.getdata(0,0,0);
          return user;
          
  	  }
      public String getpassword(){
    	  String pass =con.getdata(0,0,1);
          return pass;
  	  }

	

}
