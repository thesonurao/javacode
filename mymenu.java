import java.awt.*;
public class mymenu
{
public static void main(String args[])
{
Frame f=new Frame("This is test for Menu");
MenuBar main=new MenuBar();
f.setMenuBar(main);
Menu filemenu=new Menu("File");
Menu editmenu=new Menu("File");
Menu helpmenu=new Menu("Help");
main.add(filemenu);
main.add(editmenu);
main.add(helpmenu);

MenuItem new1=new MenuItem("New");
MenuItem open=new MenuItem("Open");
MenuItem save=new MenuItem("Save");
MenuItem close=new MenuItem("Close");
MenuItem line=new MenuItem("-");
CheckboxMenuItem print=new CheckboxMenuItem("Print");
MenuItem exit=new MenuItem("Exit");
filemenu.add(new1);
filemenu.add(open);
filemenu.add(save);
filemenu.add(close);
filemenu.add(line);
filemenu.add(print);
filemenu.add(exit);
MenuItem cut=new MenuItem("Cut");
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
MenuItem line1=new MenuItem("-");
MenuItem undo=new MenuItem("Undo");
editmenu.add(cut);
editmenu.add(copy);
editmenu.add(paste);
editmenu.add(line1);
editmenu.add(undo);
undo.setEnabled(false);
Menu more=new Menu("More");
helpmenu.add(more);
more.add("commands");
more.add("about");
f.setSize(200,200);
f.setVisible(true);
}
}


