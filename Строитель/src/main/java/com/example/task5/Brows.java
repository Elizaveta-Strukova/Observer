package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Brows extends Line {
    public Brows(){
        setStroke(Color.BLACK);
        super.setStrokeWidth(2);
    }
    public void HappyLeftBrow(){
        super.setStartY(150);
        super.setEndY(150);


        setStartX(200 - 65);
        setEndX(150 + 25);
        setStroke(Color.BLACK);

       // super.setStartX(pane.getWidth() / 2 - 65);
        //super.setEndX(pane.getWidth() / 2 - 25);

    }

    public void HappyRightBrow(){
        super.setStartY(150);
        super.setEndY(150);

        setStartX(220);
        setEndX(260);

        //super.setStartX(pane.getWidth() / 2 + 20);
        //super.setEndX(pane.getWidth() / 2 + 60);
    }

    public void AngryLeftBrow(){
        super.setStartY(150);
        super.setEndY(160);

        setStartX(200 - 65);
        setEndX(200 - 25);


        //super.setStartX(pane.getWidth() / 2 - 65);
        //super.setEndX(pane.getWidth() / 2 - 25);

    }
    public void AngryRightBrow(){
        super.setStartY(160);
        super.setEndY(150);


        setStartX(200 + 20);
        setEndX(200 + 60);
        //super.setStartX(pane.getWidth() / 2 + 20);
        //super.setEndX(pane.getWidth() / 2 + 60);
    }

    public void SadLeftBrow(){
        super.setStartY(160);
        super.setEndY(137);

        setStartX(200 - 65);
        setEndX(200 - 25);

        //super.setStartX(pane.getWidth() / 2 - 65);
        //super.setEndX(pane.getWidth() / 2 - 25);

    }

    public void SadRightBrow(){
        super.setStartY(137);
        super.setEndY(150);

        setStartX(200 + 20);
        setEndX(200 + 60);

        //super.setStartX(pane.getWidth() / 2 + 20);
        //super.setEndX(pane.getWidth() / 2 + 60);
    }

}