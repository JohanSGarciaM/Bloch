package arsw.proyect.model;

import java.io.Serializable;

public class Position implements Serializable{

    int x;
    int y;
    Object placeHolder = null;
    Status status  = Status.EMPTY;


    public Position(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return status;
    }

    public Object getPlaceHolder(){
        return placeHolder;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void placePlayer(Player placeHolder){
        this.placeHolder = placeHolder;
        setStatus(Status.PLAYER);
    }

    @Override
    public String toString(){
        return "{placeholder: }"+ placeHolder+ ", status: "+status+"}";
    }

    public void placeBit(Bit placeHolder) {
        this.placeHolder = placeHolder;
        setStatus(Status.BIT);
    }
}
