import java.awt.*;
public class menu
{
public static void main(String args[]) 
{
Frame f=new Frame("my notepad");
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
filemenu.add(new1);
filemenu.add(open);
filemenu.add(save);
filemenu.add(saveas);
filemenu.add(print);
filemenu.add(exit);

MenuItem undo=new MenuItem("Undo");
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
MenuItem replace=new MenuItem("Replace");
editmenu.add(undo);
editmenu.add(copy);
editmenu.add(paste);
editmenu.add(replace);

MenuItem wordwrap=new MenuItem("Wordwrap");
MenuItem font=new MenuItem("Font");
formatmenu.add(wordwrap);
formatmenu.add(font);

MenuItem statusbar=new MenuItem("StatusBar");
viewmenu.add(statusbar);

MenuItem viewhelp=new MenuItem("View Help");
MenuItem aboutnotepad=new MenuItem("About Notepad");
helpmenu.add(viewhelp);
helpmenu.add(aboutnotepad);
}
}



