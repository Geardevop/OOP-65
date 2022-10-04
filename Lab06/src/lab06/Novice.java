/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wallr
 */
public class Novice extends Player{
    public Novice(){
       setHP(10);
       setMP(10);
       setATK(5);
    }
    // ???????????????????????
    public void addEquipment(Item i ){
        
        i.use(this);//this ?????
    }
    @Override
    public void attack(Player p){
        p.attacked(this.getATK());
    }
    @Override
    public void attacked(double n){
        this.setHP(-n);
    }
}
