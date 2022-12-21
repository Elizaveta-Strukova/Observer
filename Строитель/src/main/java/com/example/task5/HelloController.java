package com.example.task5;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    Director director = new Director();
    @FXML
    VBox vb;
    smileAgrigator agrigator;

    public void Sad() {
        vb.getChildren().clear();
        agrigator = director.build(new SadSmileBuilder());

        vb.getChildren().add(agrigator);
    }

    public void Happy() {
        vb.getChildren().clear();

        agrigator = director.build(new HappySmileBuilder());
        vb.getChildren().add(agrigator);
    }

    public void Angry() {
        vb.getChildren().clear();

        agrigator = director.build(new AngrySmileBuilder());
        vb.getChildren().add(agrigator);
    }
    public void Clear() {
        vb.getChildren().clear();
    }
}