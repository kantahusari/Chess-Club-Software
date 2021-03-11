package assignment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.text.Text;
import javafx.scene.control.ScrollPane;
//--------------
public class Assignment2 extends Application implements EventHandler<ActionEvent>{
Secretary sec=new Secretary(1000);
//main Scenes
Scene Home, Members,Stat,Updateinfo;
//Members Scenes
Scene add,delete;
//Statistics Scenes
Scene viewmembynum,viewall,viewbest,viewmost;
//Update Scenes
Scene updategame,updatewin,updateloss;
//--------------
TextField field0,field1,field2,field3,field4,df0,
vmemnum,upmemnum,newgamenum,memnumwin,nnumwinin,memnumlin,nnumlosin;
//--------------
Button MM,Statistics,Update,Add,Delete,Back,addmemb,Back0,
delmem,delBack,View_Mem,View_Mems,View_Best,vbest,View_Most,vmost,Tohome,
vmem,viewallmembut,vBack,vaBack,vbBack,vmBack,update_game,Update_win,update_loss,go_home,
upgameb,upBack0,nnumwinup,upBack1,nnumlosup,upBack2;
//--------------
Label
MainWindow,Member,memnum,fname,lname,numgames,numwins,addmemstat,vbdelete,delmemstat,
numgameupdatestat,numwinupdatestat,numlossupdatestat,viewmeminfolbl,viewallmemslbl,viewbestmemlbl,viewmostwinlbl,
memnum0,Stats,memlist,viewmem,viewAll,
viewbes,viewmos,Updates,memnumsel0,ngamenum,memnumsel1,nnumwin,memnumsel2,nnumloss;
//--------------
ScrollPane sp,vbestsp,vmostwinsp;
//--------------
public void start(Stage primaryStage) {
//Stage Setup:
Stage mainwindow=new Stage();
mainwindow.setTitle("Chess Club - Java Assignment");
//mainwindow.setFullScreen(true);
mainwindow.setX(150);
mainwindow.setY(150);
mainwindow.setWidth(550);
mainwindow.setHeight(550);
//Scenes:
//Home
MainWindow= new Label("Welcome To Chess Club");
MM= new Button("Member Management");
Statistics= new Button("Statistics");
Update= new Button("Update");
MM.setOnAction(e -> mainwindow.setScene(Members));
Statistics.setOnAction(e -> mainwindow.setScene(Stat));
Update.setOnAction(e -> mainwindow.setScene(Updateinfo));
VBox layout1 = new VBox(10);
layout1.getChildren().addAll(MainWindow, MM,Statistics,Update);
Home= new Scene(layout1);
//--------------------------------------------------------------------
//Members
Member= new Label("Member Management");
Add= new Button("Add Member");
Delete= new Button("Delete Member");
Back= new Button("Home");
Back.setOnAction(e -> mainwindow.setScene(Home));
Add.setOnAction(e ->mainwindow.setScene(add));
Delete.setOnAction(e ->mainwindow.setScene(delete));
VBox layout2= new VBox(10);
layout2.getChildren().addAll(Member,Add,Delete, Back);
Members= new Scene(layout2);
//add Member
memnum=new Label("Member Number");
field0=new TextField();
fname=new Label("First Name");
field1=new TextField();
lname=new Label("Last Name");
field2=new TextField();
numgames=new Label("Number Of Games");
field3=new TextField();
numwins=new Label("Number Of Wins");
field4=new TextField();
addmemstat=new Label("");
addmemb=new Button("Add");
addmemb.setOnAction(this);
Back0=new Button("Back");
Back0.setOnAction(e ->mainwindow.setScene(Members));
VBox addmem=new VBox(10);
addmem.getChildren().addAll(memnum,field0,fname,field1,lname,field2,numgames,field3,numwins,field4,addmemstat,addmemb,Back0);
add=new Scene(addmem);
//delete Member
memnum0=new Label("Select Member Number");
df0=new TextField();
delmemstat=new Label();
delmem=new Button("Delete Member");
delmem.setOnAction(this);
delBack=new Button("Back");
delBack.setOnAction(e ->mainwindow.setScene(Members));
VBox delmem0=new VBox(10);
delmem0.getChildren().addAll(memnum0,df0,delmemstat,delmem,delBack);
delete=new Scene(delmem0);
//--------------------------------------------------------------------
//Stat
Stats=new Label("Statistics");
View_Mem=new Button("View Member");
View_Mems=new Button("View All Members");
View_Best=new Button("View Best Member");
View_Most=new Button("View Member(s) With Most Wins");
Tohome= new Button("Home");
Tohome.setOnAction(e -> mainwindow.setScene(Home));
View_Mem.setOnAction(e -> mainwindow.setScene(viewmembynum));
View_Mems.setOnAction(e -> mainwindow.setScene(viewall));
View_Best.setOnAction(e -> mainwindow.setScene(viewbest));
View_Most.setOnAction(e -> mainwindow.setScene(viewmost));
VBox layout3=new VBox(10);
layout3.getChildren().addAll(Stats,View_Mem,View_Mems,View_Best,View_Most,Tohome);
Stat=new Scene(layout3);
//view member
viewmem=new Label("Select Member Number");
vmemnum=new TextField();
vmem=new Button("View");
vBack=new Button("Back");
vmem.setOnAction(this);
viewmeminfolbl=new Label();
vBack.setOnAction(e -> mainwindow.setScene(Stat));
VBox vmemvox=new VBox(10);
vmemvox.getChildren().addAll(viewmem,vmemnum,vmem,vBack,viewmeminfolbl);
viewmembynum=new Scene(vmemvox);
//view All members
viewAll=new Label("View All Members");
viewallmembut=new Button("View All Members");
viewallmembut.setOnAction(this);
vaBack=new Button("Back");
VBox showarea=new VBox();
viewallmemslbl=new Label();
showarea.getChildren().addAll(viewallmemslbl);
sp=new ScrollPane();
sp.setPrefViewportHeight(300);
sp.setContent(showarea);
vaBack.setOnAction(e ->mainwindow.setScene(Stat));
VBox valmem=new VBox(10);
valmem.getChildren().addAll(viewAll,viewallmembut,vaBack,sp);
viewall=new Scene(valmem);
//view best
viewbes=new Label("View Best Members");
vbest=new Button("View Best Member");
vbest.setOnAction(this);
vbBack=new Button("Back");
VBox showbest=new VBox(10);
viewbestmemlbl=new Label();
showbest.getChildren().addAll(viewbestmemlbl);
vbestsp=new ScrollPane();
vbestsp.setPrefViewportHeight(300);
vbestsp.setContent(showbest);
vbBack.setOnAction(e ->mainwindow.setScene(Stat));
VBox vbmem=new VBox(10);
vbmem.getChildren().addAll(viewbes,vbest,vbBack,vbestsp);
viewbest=new Scene(vbmem);
//view most
viewmos=new Label("View Member(s) With Most Wins");
vmost=new Button("View Member of Most Wins");
vmost.setOnAction(this);
vmBack=new Button("Back");
VBox showmost=new VBox(10);
viewmostwinlbl=new Label();
showmost.getChildren().addAll(viewmostwinlbl);
vmostwinsp=new ScrollPane();
vmostwinsp.setPrefViewportHeight(300);
vmostwinsp.setContent(showmost);
vmBack.setOnAction(e ->mainwindow.setScene(Stat));
VBox vmmem=new VBox(10);
vmmem.getChildren().addAll(viewmos,vmost,vmBack,vmostwinsp);
viewmost=new Scene(vmmem);
//--------------------------------------------------------------------
//update
Updates=new Label("Update Member Info");
update_game=new Button("Update Game");
Update_win=new Button("Update Win");
update_loss=new Button("Update Loss");
go_home=new Button("Home");
go_home.setOnAction(e -> mainwindow.setScene(Home));
update_game.setOnAction(e -> mainwindow.setScene(updategame));
Update_win.setOnAction(e -> mainwindow.setScene(updatewin));
update_loss.setOnAction(e -> mainwindow.setScene(updateloss));
VBox layout4=new VBox(10);
layout4.getChildren().addAll(Updates,update_game,Update_win,update_loss,go_home);
Updateinfo=new Scene(layout4);
//update game
memnumsel0=new Label("Select Member Number");
upmemnum=new TextField();
ngamenum=new Label("New Number Of Games");
newgamenum=new TextField();
numgameupdatestat=new Label();
upgameb=new Button("Update");
upgameb.setOnAction(this);
upBack0=new Button("Back");
upBack0.setOnAction(e -> mainwindow.setScene(Updateinfo));
VBox upgamescene=new VBox(10);
upgamescene.getChildren().addAll(memnumsel0,upmemnum,ngamenum,newgamenum,numgameupdatestat,upgameb,upBack0);
updategame=new Scene(upgamescene);
//update wins
memnumsel1=new Label("Select Member Number");
memnumwin=new TextField();
nnumwin=new Label("New Number Of Wins");
nnumwinin=new TextField();
numwinupdatestat=new Label();
nnumwinup=new Button("Update");
nnumwinup.setOnAction(this);
upBack1=new Button("Back");
upBack1.setOnAction(e -> mainwindow.setScene(Updateinfo));
VBox upnumwinscene=new VBox(10);
upnumwinscene.getChildren().addAll(memnumsel1,memnumwin,nnumwin,nnumwinin,numwinupdatestat,nnumwinup,upBack1);
updatewin=new Scene(upnumwinscene);
//update Loss
memnumsel2=new Label("Select Member Number");
memnumlin=new TextField();
nnumloss=new Label("New Number Of Loss");
nnumlosin=new TextField();
numlossupdatestat=new Label();
nnumlosup=new Button("Update");
nnumlosup.setOnAction(this);
upBack2=new Button("Back");
upBack2.setOnAction(e -> mainwindow.setScene(Updateinfo));
VBox upnumlosscene=new VBox(10);
upnumlosscene.getChildren().addAll(memnumsel2,memnumlin,nnumloss,nnumlosin,numlossupdatestat,nnumlosup,upBack2);
updateloss=new Scene(upnumlosscene);
//--------------------------------------------------------------------
mainwindow.setScene(Home);
mainwindow.show();
//--------------------------------------------------------------------
}
public void handle(ActionEvent e){
//add member
if (e.getSource()==addmemb) {
int addmemnum=Integer.valueOf(field0.getText());
String addfname=String.valueOf(field1.getText());
String addlaname=String.valueOf(field2.getText());
double addnumgames=Double.valueOf(field3.getText());
double addnumwins=Double.valueOf(field4.getText());
if (sec.addMember(addmemnum, addfname, addlaname, addnumgames, addnumwins)) {
addmemstat.setText("Member Added Successfully");
field0.clear();
field1.clear();
field2.clear();
field3.clear();
field4.clear();
}else{
addmemstat.setText("Member Was not Added");
field0.clear();
field1.clear();
field2.clear();
field3.clear();
field4.clear();
}
}
//Delete Member
if (e.getSource()==delmem) {
int delmemnum=Integer.valueOf(df0.getText());
if (sec.deleteMem(delmemnum)) {
delmemstat.setText("Member Deleted Successfully");
df0.clear();
}else{
delmemstat.setText("Member Was Not Deleted");
df0.clear();
}
}
//Update Game number
if (e.getSource()==upgameb) {
numgameupdatestat.setText("");
int upgamesmemnum;
upgamesmemnum=Integer.valueOf(upmemnum.getText());
double newnumgames;
newnumgames=Integer.valueOf(newgamenum.getText());
if (sec.updategames(upgamesmemnum, newnumgames)) {
numgameupdatestat.setText("Updating game Success");
upmemnum.clear();
newgamenum.clear();
}else{
numgameupdatestat.setText("Updating game Not Success");
upmemnum.clear();
newgamenum.clear();
}
}
//update winf number
if (e.getSource()==nnumwinup) {
int upwinsmemnum;
upwinsmemnum=Integer.valueOf(memnumwin.getText());
double newnumwins;
newnumwins=Integer.valueOf(nnumwinin.getText());
if (sec.updatewins(upwinsmemnum, newnumwins)) {
numwinupdatestat.setText("Updating Wins Success");
memnumlin.clear();
nnumwinin.clear();
}else{
numwinupdatestat.setText("Updating Wins Not Success");
memnumlin.clear();
nnumwinin.clear();
}
}
//updateloss number
if (e.getSource()==nnumlosup) {
int uplossmemnum;
uplossmemnum=Integer.valueOf(memnumwin.getText());
double newnumloss;
newnumloss=Integer.valueOf(nnumlosin.getText());
if (sec.updateloss(uplossmemnum, newnumloss)) {
numlossupdatestat.setText("Updating Loss Success");
memnumwin.clear();
nnumlosin.clear();
}else{
numlossupdatestat.setText("Updating Loss Not Success");
memnumwin.clear();
nnumlosin.clear();
}
}
//View All Members
if(e.getSource()==viewallmembut)
{
    viewallmemslbl.setText(sec.memlist());
}
//view member
if (e.getSource()==vmem) {
int memnuminfo;
memnuminfo=Integer.valueOf(vmemnum.getText());
if (sec.findmem(memnuminfo)!=-1) {
viewmeminfolbl.setText(sec.viewmem(memnuminfo));
vmemnum.clear();
}else if(sec.findmem(memnuminfo)==-1){
viewmeminfolbl.setText("Member Not Found");
vmemnum.clear();
}
}
//view Best
if (e.getSource()==vbest)
{
viewbestmemlbl.setText(sec.showBest());
}

if (e.getSource()==vmost)
{
viewmostwinlbl.setText(sec.mostwins());
}

//------------------------------
}

public static void main(String[] args) {
launch(args);
}
}
