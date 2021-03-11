
package assignment2;

public class Member {
    private String fname;
    private String lname;
    private double numgames;
    private double numwins;
    private double numloss;
    private int memnum;
    //constructors
    public Member(int memnum,String fname,String lname){
    this.memnum=memnum;
    this.fname=fname;
    this.lname=lname;
    numgames=0;
    numwins=0;
    numloss=numgames-numwins;
    }
    public Member(int memnum,String fname,String lname,double numgames,double numwins){
    this.memnum=memnum;
    this.fname=fname;
    this.lname=lname;
    this.numgames=numgames;
    this.numwins=numwins;
    numloss=numgames-numwins;
    }
    //Additional construct
    public Member(String fname,String lname,double numgames,double numwins){
    this.fname=fname;
    this.lname=lname;
    this.numgames=numgames;
    this.numwins=numwins;
    }

    //methods
    public void setfName(String fname){
    this.fname=fname;
    }
    public String getfName(){
    return fname;
    }

    public int getMemNum(){return memnum;}

    public void setlName(String lname){
    this.lname=lname;
    }
    public String getlName(){
    return lname;
    }

    public void setNumGames(double numgames){
    this.numgames=numgames;
    }
    public double getNumGames(){
    return numgames;
    }

    public void setNumWins(double numwins){
    this.numwins=numwins;
    }
    public double getNumWins(){
    return numwins;
    }

    public void setNumLoss(double numloss){this.numloss=numloss;}
    public double getNumLoss(){
    return numloss;
    }


    public double getWinRate(){
    double rate=Math.round((numwins/numgames)*100);
    return rate;
    }

    //to String
    public String toString(){
    String s="Member Number: "+getMemNum()+"\n"
            +"First Name: "+getfName()+"\n"
            +"Last Name: "+getlName()+"\n"
            +"Number of Games: "+getNumGames()+"\n"
            +"Number of Wins: "+getNumWins()+"\n"
            +"Number of Losses: "+getNumLoss()+"\n"
            +"Win Rate: "+getWinRate()+" %"+"\n";
    return s;
    }
//-------------   
}
