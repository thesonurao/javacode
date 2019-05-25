import java.io.*;
import java.sql.*;
public class jdbcoperations
{//class begin
static connection c;
public static void main(String args[])throws Exception
{//main begin
int ch;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader=new BufferedReader(i);
try
{
c=DriverManager.getConnection("jdbc:odbc:student");
do
{
System.out.println("\t\t\t\t Menu");
System.out.println("\t\t\t\t1.View");
System.out.println("\t\t\t\t2. Clear");
System.out.println("\t\t\t\t3.Insert");
System.out.println("\t\t\t\t4.Modify");
System.out.println("\t\t\t\t5.Delete");
System.out.println("\t\t\t\t6.Exit");
System.out.println("enter your choice:");
ch=	interger.parseInt(b.readline());
switch(ch)
{
case 1:
{
display();
break;
}
case 2:
{
clrscr();
break;
}
case 3:
{
insert();
display();
break;
}
case 4:
{
modify();
display();
break;
}
case 5:
{
delete();
display();
break;
}
case 6:
{
System.out.println("\t\t\t\tThank you");
System.exit(0);
}
default:
System.out.println("invalid input");
}
}
while(ch!=6);
}
catch(Exception e)
{}
}
static void display()
{
try
{
ResultSet r;
int row=0;
Staement stu=c.createStatement();
r=stu.executeQuery("select * from stu");
System.out.println("Reg no\tName\tClass\tMarks");
System.out.println("*********************************");
while(r.next())
System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3)+"\t"+r.getInt(4));
c.close();
}
catch(SQLException e){}
}
//for clear the screen
static void clrscr()
{
for(int k=1;k<25;k++)
System.out.println();
}
//insert the record 111,murgan,mca2,90
static void insert()
{
try
{
int row;
Statement ins_stu;
ins_stu=c.createStatement();
System.out.println("111,murgan,mca2,90");
row=ins_stu.executeUpdate("insert into stu values(111,'murgan','mca2',90)");
c.commit();
System.out.println("No of Rows inserted="+row);
}
catch(SQLException e)
{
System.out.println("Error ion insert[May be primary]\n"+e);
}
}
//update the record where regno=111,mark=100
static void modify()
{
try
{
System.out.println("111,murgan,mca2,change 90 to 100");
int row;
Statement modi_stu;
modi_stu=c.createStatement();
row=modi_stu.executeUpdate("update stu set mark=100 where regno=111");
c.commit();
System.out.println("No of Row updated="+row);
}
catch(SQLException e)
{
System.out.println("Error in modify\n"+e);
}
}
//delete the record 111,murgan,mca2,90
static void delete()
{
try
{
System.out.println("111,murgan,mca2,90");
int row;
Statement del_stu;
del_stu=c.createStatement();
row=del_stu.executeUpdate("delete from stu where regno=111");
if(row>0)
{
c.commit();
System.out.println("No of Row deleted="+row);
}
else
{
System.out.println("Record not found");
}
}
catch(SQLException e)
{
System.out.println("Error in delete:"+e);
}
}
}//Class end