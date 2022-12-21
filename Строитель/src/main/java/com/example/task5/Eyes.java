package com.example.task5;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eyes extends Circle {
    public Eyes(){

        super(15, Color.BLACK);
    }

    public void LeftEye(){

        //super.setCenterX(pane.getWidth() / 2 - 40);
        //super.setCenterY(pane.getHeight() / 2 - 20);

        setCenterX(200 - 40);
        setCenterY(200 - 20);
    }

    public void RightEye(){

        //super.setCenterX(pane.getWidth() / 2 + 40);
        //super.setCenterY(pane.getHeight() / 2 - 20);

        setCenterX(200 + 40);
        setCenterY(200 - 20);
    }

}
