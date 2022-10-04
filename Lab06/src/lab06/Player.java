/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author wallr
 */
public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
    
    // set and get hp
    public void setHP(double HP){
         this.HP += HP;
      if(this.HP < 0){
          this.HP = 0;
      }
        
    }
    public double getHP(){
        return HP;
    }
    // set and get mp
     public void setMP(double MP){
        this.MP += MP;
    }
    public double getMP(){
        return MP;
    }
    // set and get EXP
      public void setEXP(double EXP){
        this.EXP += EXP;
    }
    public double getEXP(){asaaaaa
        return EXP;
    }
    // set and get Money
    public void setMoney(double Money){
        this.Money += Money;
    }
    public double getMoney(){
        return Money;
    }
    
      public void setATK(double ATK){
        this.ATK += ATK;
    }
    public double getATK(){
        return ATK;
    }
    
    @Override
    public String toString(){
        return "HP : "+HP+" MP : "+MP+"  ATK : "+ATK;
    }
    
    public abstract void attack(Player p);
    public abstract void attacked(double n);
    
}
