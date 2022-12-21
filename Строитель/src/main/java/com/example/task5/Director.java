package com.example.task5;

public class Director {

    public smileAgrigator build(Builder builder) {
        builder.buildHead();
        builder.buildBrows();
        builder.buildEyes();
        builder.buildMouth();
        builder.buildNose();
        return builder.getSmile();
    }

}