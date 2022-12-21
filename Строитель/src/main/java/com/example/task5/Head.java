package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.concurrent.BlockingDeque;

public class Head extends Circle {

    public Head(){
        super(100);
        //setHeight(400);
        //setWidth(400);
//        setCenterX(pane.getWidth() / 2);
//        setCenterY(pane.getHeight() / 2);
        setCenterX(200);
        setCenterY(200);
        setStroke(Color.BLACK);
        setStrokeWidth(4);

    }

    public void HappySmiley(){ setFill(Color.GREEN);
    }
    public void sadSmiley(){
        setFill(Color.LIGHTBLUE);
    }

    public void angrySmiley(){
        setFill(Color.RED);
    }
}