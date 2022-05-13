package com.test;

public class Transport {

    public float speed, weigth;
    public  String color;
    public byte[] coordinate;

    public void setValues(float _speed, float _weigth, String _color, byte[] _coordinate){
     speed = _speed;
     weigth = _weigth;
     color = _color;
     coordinate = _coordinate;
    }
    public String getValues() {
        String info = "object speed: " + speed + "; Weight: " + weigth + "; Color: = " + color + ";\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++){
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
