package arsw.proyect.model;

import java.io.Serializable;

public class Player  implements Serializable {

        private int x;
        private int y;
        private String color;


        public Player(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void setXY(int x, int y){
            this.x = x;
            this.y = y;
        }

        public String getColor(){
            return this.color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public void moveUp(){
            this.y = y - 1;
        }

        public void moveDown(){
            this.y = y + 1;
        }

        public void moveLeft(){
            this.x = x - 1;
        }

        public void moveRight(){
            this.x = x + 1;
        }

        @Override
        public String toString(){
            return color;
        }

}
