














/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author wallr
 */public class Pigeon extends Bird{
    private static int numberOfPigeon;
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon += 1;
    }
    public void eat(String food){
        if(food.equals("worm")){
            this.setWeight(0.5);
        }else if(food.equals("seed")){
            this.setWeight(0.2);
        }else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public String toString(){
        return "Pigeon "+this.getWeight()+" kg and "+this.getHeight()+" cm. There are "+numberOfPigeon+" pigeons.";
    }
    public void fly(){
        this.setWeight(-0.25);
        if(this.getWeight()>=5){
            System.out.println("Fly Fly");
        }else{
            System.out.println("I’m hungry.");
        }
    }
    public void takeOff(){
        this.setWeight(-0.5);
        if(this.getWeight()>=5){
            System.out.println("Take Off");
        }else{
            System.out.println("I’m hungry.");
        }
    }
    public void landing(){
        this.setWeight(-0.5);
        if(this.getWeight()>=5){
            System.out.println("Landing");
        }else{
            System.out.println("I’m hungry.");
        }
    }
}