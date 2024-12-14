/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author SITHUM YT
 */
public class Observerble {
    
    private Observer[] obs;

    private static Observerble ob;
    private final MainController main;
//    private final Helicopter heli;
//    private final Tank tank;
//    private final Submarine sub;

    public Observerble() {
        obs=new Observer[3];
        obs[0]=new Helicopter();
        obs[1]=new Submarine();
        obs[2]=new Tank();
        
        ob = this;
        main = new MainController();
//        heli = (Helicopter) obs[0];
//        tank = (Tank) obs[2];
//        sub = (Submarine) obs[1];
    }

    public static Observerble getReference() {
        return ob;
    }
    
    public void setLevel(int value, String Vtype) {
        for (Observer  ob1: obs) {
            if(ob1.getName().equals(Vtype)|| Vtype.equals("All")){
               ob1.setPosition(value);
            }
        }
        
//        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
//            heli.setPosition(value);
//        }
//        if (Vtype.equals("Tank") || Vtype.equals("All")) {
//            tank.setPosition(value);
//        }
//        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
//            sub.setPosition(value);
//        }
        
    }

    public void setMessage(String text, String Vtype) {
        for (Observer ob1 : obs) {
            if(ob1.getName().equals(Vtype)||Vtype.equals("All")){
                ob1.setMessage(text);
            }
        }
//        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
//            heli.setMessage(text);
//        }
//        if (Vtype.equals("Tank") || Vtype.equals("All")) {
//            tank.setMessage(text);
//        }
//        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
//            sub.setMessage(text);
//        }
    }

    public void getMessage(String msg) {
        main.getMessage(msg);
    }

    public void setArea(boolean selected, String Vtype) {
        for (Observer ob1 : obs) {
            if(ob1.getName().equals(Vtype)||Vtype.equals("All")){
                ob1.setArea(selected);
            }
        }
//        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
//            heli.setArea(selected);
//        }
//        if (Vtype.equals("Tank") || Vtype.equals("All")) {
//            tank.setArea(selected);
//        }
//        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
//            sub.setArea(selected);
//        }
    }
}
