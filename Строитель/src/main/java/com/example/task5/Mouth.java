package com.example.task5;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Mouth extends Arc {
    public Mouth(){

    }

    public void SadMouth(){
       // setCenterX(pane.getWidth() / 2);
        //setCenterY(pane.getHeight() / 2 + 65);

        setCenterX(200 );
        setCenterY(200 + 65);

        setRadiusX(10.0);
        setRadiusY(40.0);

        setStartAngle(0);
        setLength(180.0);

        setFill(null);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.OPEN);
    }

    public void AngryMouth(){

        //setCenterX(pane.getWidth() / 2);
        //setCenterY(pane.getHeight() / 2 + 50);

        setCenterX(200 );
        setCenterY(200 + 50);

        setRadiusX(40.0);
        setRadiusY(20.0);

        setStartAngle(360);
        setLength(180.0);

        setFill(null);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.OPEN);

    }


    public void HappyMouth(){
       // setCenterX(pane.getWidth() / 2);
        //setCenterY(pane.getHeight() / 2 + 20);

        setCenterX(200);
        setCenterY(200 + 20);

        setRadiusX(40.0);
        setRadiusY(20.0);

        setStartAngle(-180);
        setLength(180.0);

        setFill(null);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.OPEN);
    }

}