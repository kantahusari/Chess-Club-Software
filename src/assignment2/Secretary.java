package assignment2;
import java.util.*;
public class Secretary {
    MemberManager mm;
    public Secretary(int maxmem){
    mm=new MemberManager(maxmem);
    }

    public boolean addMember(int num,String fname,String lname,double games,double wins){
    return mm.addMem(num,fname,lname,games,wins);
    }
    public boolean deleteMem(int memnum){
    return mm.delMem(memnum);
    }

    public boolean updategames(int memnum,double games){
    return mm.updateMemGames(memnum, games);
    }
    public boolean updatewins(int memnum,double wins){
    return mm.updateMemNumWins(memnum, wins);
    }
    public boolean updateloss(int memnum,double loss){
    return mm.updateMemNumLoss(memnum, loss);
    }
    
    public int findmem(int memnum){
    return mm.findMem(memnum);
    }
    public String memlist(){
    return mm.MemList();
    }
    public String viewmem(int memnum){
    return mm.viewMem(memnum);
    }
    public String showBest(){
    return mm.bestmem();
    }
    public String mostwins(){
    return mm.Mostwins();
    }     
}
