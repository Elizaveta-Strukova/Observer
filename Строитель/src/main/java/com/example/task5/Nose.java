package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Nose extends Line {

    public Nose(){
        setStroke(Color.BLACK);
        super.setStrokeWidth(4);


       //super.setStartY(pane.getWidth() / 2 + 10);
       // super.setStartX(pane.getWidth() / 2 );

       // super.setEndY(pane.getWidth() / 2 - 10);
       // super.setEndX(pane.getWidth() / 2 );


        setStartX(200);
        setStartY(200 + 10);
        setEndX(200);
        setEndY(200 - 10);
        //setCenterY(200 + 50);
    }
}
