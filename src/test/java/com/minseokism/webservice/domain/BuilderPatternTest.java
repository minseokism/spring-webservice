package com.minseokism.webservice.domain;

public class BuilderPatternTest {

    public static void main(String[] args) {
        Rects rects = new Rects.Builder(200,400).margin(4).padding(10).build();

    }
}

