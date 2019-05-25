import java.sql.*;
public class jdbc1
{
public static void main(String args[])
{
ResultSet r;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:student");
//our data source name is student
Statement st=c.createStatement();
r=st.executeQuery("select * from stu");
System.out.println("Reg no\tName\tClass\tMarks");
System.out.println("*********************************");
while(r.next())
System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3)+"\t"+r.getInt(4));
}
catch(SQLException e)
{
System.out.println("SQL ERROR:"+e);
}
catch(Exception e)
{
System.out.println("ERROR:"+e);
}
}
}

