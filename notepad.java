import java.io.*;
import java.awt.*;
public class notepad
{
public static void main(String args[]) 
{
Frame f=("Notepad");
MenuBar main=new MenuBar();
f.setMenuBar(main);
Menu filemenu=new Menu("File");
Menu editmenu=new Menu("Edit");
Menu formatmenu=new Menu("Format");
Menu viewmenu=new Menu("View");
Menu helpmenu=new Menu("Help");
main.add(filemenu);
main.add(editmenu);
main.add(formatmenu);
main.add(viewmenu);
main.add(helpmenu);

MenuItem new1=new MenuItem("New");
MenuItem open=new MenuItem("Open");
MenuItem save=new MenuItem("Save");
MenuItem saveas=new MenuItem("Saveas");
MenuItem print=new MenuItem("Print");
MenuItem exit=new MenuItem("Exit");
file.add(new1);
file.add(open);
file.add(save);
file.add(saveas);
file.add(print);
file.add(exit);

MenuItem cut=new MenuItem("Undo");
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
MenuItem replace=new MenuItem("Replace");
edit.add(undo);
edit.add(copy);
edit.add(paste);
edit.add(replace);

MenuItem wordwrap=new MenuItem("Wordwrap");
MenuItem font=new MenuItem("Font");
format.add(wordwrap);
format.add(font);

MenuItem statusbar=new MenuItem("StatusBar");
view.add(statusbar);

MenuItem viewhelp=new MenuItem("View Help");
MenuItem aboutnotepad=new MenuItem("About Notepad");
help.add(viewhelp);
help.add(aboutnotepad);
}
}



