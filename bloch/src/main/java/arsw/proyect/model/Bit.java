package arsw.proyect.model;

import java.io.Serializable;

public class Bit implements Serializable{


    private int x;
    private int y;
    private String color;

    public Bit(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getColor(){
        return color;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void eated(){
        this.x = -1;
        this.y = -1;
        this.color = null;
    }

    @Override
    public String toString(){
        return "Bit{" +
                "x=" + x +
                ", y=" + y +
                "color=" + color +
                "}";
    }

}
