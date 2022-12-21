package com.example.task5;

import com.example.task5.Brows;
import com.example.task5.Eyes;
import com.example.task5.Head;
import com.example.task5.Mouth;
import javafx.scene.layout.Pane;


public class smileAgrigator extends Pane {

    public void setHead(Head head) {
        getChildren().add(head);
    }

    public void setEyes(Eyes[] eyes) {
        for (Eyes eye : eyes) {
            getChildren().add(eye);
        }
    }

    public void setMouth(Mouth mouth) {
        getChildren().add(mouth);
    }

    public void setBrows(Brows[] brows) {
        for (Brows brow : brows) {
            getChildren().addAll(brow);
        }
    }

    public void setNose(Nose nose) {
        getChildren().add(nose);
    }
}
