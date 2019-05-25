import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class calc extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2,t3;
Button add1,sub,mul,div;
public void init()
{
l1=new Label("First No");
add(l1);
l2=new Label("Second No");
add(l2);
t1=new TextField(10);
add(t1);
t2=new TextField(10);
add(t2);
add1=new Button("+");
add(add1);
add1.addActionListener(this);
sub=new Button("-");
add(sub);
sub.addActionListener(this);
mul=new Button("*");
add(mul);
mul.addActionListener(this);
div=new Button("/");
add(div);
div.addActionListener(this);
t3=new TextField(10);
add(t3);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==add1)
{
int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
t3.setText(String.valueOf(sum));
}
if(e.getSource()==sub)
{
int sum=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
t3.setText(String.valueOf(sum));
}
if(e.getSource()==mul)
{
int sum=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
t3.setText(String.valueOf(sum));
}
if(e.getSource()==div)
{
int sum=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
t3.setText(String.valueOf(sum));
}
}
}
/*
<applet code=calc.class width=200 height=150>
</applet>
*/



