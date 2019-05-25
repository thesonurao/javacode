import java.awt.*;
class bf extends Frame
{
bf(String s)
{
super(s);
setSize(300,140);
setLayout(new FlowLayout());
for(int i=1;i<9;i++)
add(new Button("Button No"+i));
setVisible(true);
}
}
class test
{
public static void main(String args[])
{
bf b =new bf("Flow layout");
}
}
