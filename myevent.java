import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class myevent extends Applet implements ActionListener
{
Button b;
public void init()
{
b=new Button("press me");
add(b);
b.ActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
b.setLabel("pressed");
}
}
/*
<applet code="myevent.class" width=200 height=200>
</applet>
*/

