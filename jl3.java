import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jl3 extends JApplet implements ActionListener
{
String msg="";
JLabel jl;
public void init()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
ImageIcon ii1=new ImageIcon("1.gif");
setBackground(Color.cyan);
jl=new JLabel("Dear Friend");
JButton jb1=new JButton("Morning",ii1);
jb1.setActionCommand("Good Morning to You");
jb1.addActionListener(this);
jb1.setToolTipText("Click Morning Button");
jb1.setMnemonic('M');
JButton jb2=new JButton("Evening",ii1);
jb2.setActionCommand("Good Evening to You");
jb2.addActionListener(this);
jb2.setToolTipText("Click Evening Button");
jb2.setMnemonic('E');
JButton jb3=new JButton("Night",ii1);
jb3.setActionCommand("Good Night to You");
jb3.addActionListener(this);
jb3.setToolTipText("Click Night Button");
jb3.setMnemonic('N');
c.add(jb1);
c.add(jb2);
c.add(jb3);
c.add(jl);
}
public void actionPerformed(ActionEvent ae)
{
jl.setText(ae.getActionCommand());
}
}
/*
<applet code="jl3.class" width=600 height=200>
</applet>
*/


