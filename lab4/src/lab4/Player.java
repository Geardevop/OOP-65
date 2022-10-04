/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wallr
 */
public class Player {
    private String name ;
    private String team;
    
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setTeam(String t){
        team = t;
        
    }
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Player p){
        if(this.team.equals(p.team)){
            return true;}
        else{return false;}
    }
   
}