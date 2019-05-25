import java.sql.*;
public class jdbc2
{
public static void main(String args[])
{
ResultSet r;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:employee");
//our data source name is employee
Statement st=c.createStatement();
System.out.println("111,murgan,32,37000");
st.executeUpdate("delete into employee values(111,'murgan',32,37000)");
r=st.executeQuery("select * from employee");
System.out.println("Id\tName\tAge\tSalary");
System.out.println("*********************************");
while(r.next())
System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getInt(3)+"\t"+r.getInt(4));
c.close();
}
catch(Exception e){}
}
}
