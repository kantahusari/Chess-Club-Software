package assignment2;

public class MemberManager {
    private int maxmebers;
    private int nummembers;
    private double bestrate;
    private double mostwins;
    private Member [] mlist;

    public MemberManager(int max){
    this.maxmebers=max;
    nummembers=0;
    bestrate=0;
    mostwins=0;
    mlist=new Member[max];
    }
    public boolean addMem(int memnum,String fname,String lname,double numgames,double numwins){
        if (findMem(memnum)==-1) {
            if (nummembers<maxmebers) {
                Member m=new Member(memnum,fname,lname,numgames,numwins);
                mlist[nummembers]=m;
                nummembers++;
                return true;
            }    
        }
        return false;
    }
    public boolean delMem(int memnum){
    int loc=findMem(memnum);
    if(loc==-1){return false;}
    mlist[loc]=mlist[nummembers-1];
    nummembers--;
    return true;
    }
    public int findMem(int memnum){
    for(int i=0;i<nummembers;i++){
        if (mlist[i].getMemNum()==memnum) {
            return i;//found
        }
    }
    return -1;//not found
    }

    public boolean updateMemGames(int memnum,double numgames){
    for(int i=0;i<nummembers;i++){
        if (mlist[i].getMemNum()==memnum) {
            mlist[i].setNumGames(numgames);
            mlist[i].setNumLoss(numgames-mlist[i].getNumWins());

          return true;  
        }
    }
    return false;
    }
    public boolean updateMemNumWins(int memnum,double numwins){
        for(int i=0;i<nummembers;i++){
        if (mlist[i].getMemNum()==memnum) {
            mlist[i].setNumWins(numwins);
        //int newlossnum=(mlist[i].getNumGames())-numwins;
           mlist[i].setNumLoss((mlist[i].getNumGames())-numwins);
          return true;  
        }
    }
    return false;
    }
    public boolean updateMemNumLoss(int memnum,double numloss){
            for(int i=0;i<nummembers;i++){
        if (mlist[i].getMemNum()==memnum) {
            mlist[i].setNumLoss(numloss); 
            mlist[i].setNumWins(mlist[i].getNumGames()-numloss);
          return true;  
        }
    }
    return false;
    }

    public String viewMem(int memnum){
        if (findMem(memnum)!=-1) {
                 String s="";
        for (int i = 0; i < nummembers; i++) {
            if (mlist[i].getMemNum()==memnum) {
                s+=mlist[i].toString();
            }
            }
        return s;   
        }
return "Member Not Found";
    }
    public String bestmem(){
    String s="____BEST Member(s)____\n";
    for(int i=0;i<nummembers;i++){
        if (mlist[i].getWinRate()>bestrate) {
            bestrate=mlist[i].getWinRate();
        }
    }
        for (int i = 0; i < nummembers; i++) {
            if (mlist[i].getWinRate()==bestrate) {
                s+="\nMember Number: "+mlist[i].getMemNum()+"\n"
                + "First Name: "+mlist[i].getfName()+"\n"
                +"Last Name: "+mlist[i].getlName()+"\n"
                +"Win Rate: "+mlist[i].getWinRate()+" %"+"\n";
            }
        }
    return s;
    }    
    public String Mostwins(){
    String s="____Members With Most Wins____\n";
        for(int i=0;i<nummembers;i++){
        if (mlist[i].getNumWins()>mostwins) {
            mostwins=mlist[i].getNumWins();
        }
    }
                for (int i = 0; i < nummembers; i++) {
            if (mlist[i].getNumWins()==mostwins) {
                s+="\nMember Number: "+mlist[i].getMemNum()+"\n"
                + "First Name: "+mlist[i].getfName()+"\n"
                +"Last Name: "+mlist[i].getlName()+"\n"
                +"Wins: "+mlist[i].getNumWins()+"\n";
            }
        }
    return s;
    }
    public String MemList(){
    String s="";
    for(int i=0;i<nummembers;i++){
    s+=mlist[i].toString()+"\n";
    }
    return s;
    }
}
