package com.example.task5;

import com.example.task5.Brows;
import com.example.task5.Eyes;
import com.example.task5.Head;
import com.example.task5.Mouth;
import javafx.scene.layout.Pane;
import com.example.task5.Builder;
import com.example.task5.smileAgrigator;

public class SadSmileBuilder implements Builder {
    private smileAgrigator agrigator = new smileAgrigator();

   /* public SadSmileBuilder() {
        setHeight(400);
        setWidth(400);
    }*/

    @Override
    public void buildHead() {
        Head head = new Head();
        head.sadSmiley();
        agrigator.setHead(head);
    }

    @Override
    public void buildBrows() {
        Brows[] browns = new Brows[]{
                new Brows(),
                new Brows()
        };

        browns[0].SadLeftBrow();
        browns[1].SadRightBrow();

        agrigator.setBrows(browns);
    }

    @Override
    public void buildEyes() {
        Eyes[] eyes = new Eyes[]{
                new Eyes(),
                new Eyes()
        };

        eyes[0].LeftEye();
        eyes[1].RightEye();

        agrigator.setEyes(eyes);
    }

    @Override
    public void buildMouth() {
        Mouth mouth = new Mouth();
        mouth.SadMouth();
        agrigator.setMouth(mouth);
    }
    @Override
    public void buildNose(){
        Nose nose = new Nose();
        agrigator.setNose(nose);
    }
    @Override
    public smileAgrigator getSmile() {
        return agrigator;
    }
}
