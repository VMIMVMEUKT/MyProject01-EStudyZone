package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBManager extends CaptchaManager implements DB{
    //  This function is used to get connection
    public Connection getCon()
    {
        Connection con=null;
        try
        {
           Class.forName(DRIVER_URL);
           con=DriverManager.getConnection(DRIVER_NAME,USER_NAME,USER_PASSWORD);
        }
        catch(Exception ex)
                {
                    con=null;
                    System.out.println("Error : "+ex); 
                }
        return con;
    }
    
//    This funciton is used to insert , update and delete operation
    public boolean executeNoneQuery(String sql)
    {
        boolean status=false;
        try {
            PreparedStatement ps= getCon().prepareStatement(sql);
            int n=ps.executeUpdate();
            status=(n>0)?true:false;
            
        } catch (Exception e) {
            status=false;
        }
       return status;
    }
    
//    This fuction is used to select records from database
    public ResultSet getResult(String sql)
    {
        ResultSet rs;
            try {
            PreparedStatement ps= getCon().prepareStatement(sql);
            rs=ps.executeQuery();
     
            
        } catch (Exception e) {
        rs=null;
        }
       return rs;
    }
            
//    This function is used to auto increment id
    public  int getAutoIncrement(String fieldname,String tablename)
    {
        int id;
        try {
           ResultSet rs= getResult("select nvl(max("+fieldname+"),0)+1 from "+tablename);
           rs.next();
           id=rs.getInt(1);
        } catch (Exception e) {
            id=0;
        }
        return id;
    }
    
  //   This function is used to get current date
    public String getCurrentDate()
    {
      java.util.Date d=new java.util.Date();
      java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
      return sdf.format(d);
    }
    
     public String getCuurentTime()
    {
      java.util.Date d=new java.util.Date();
      java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("hh:mm:ss");
      return sdf.format(d);
    }
    
}
