package com.bekvizz.sudokugame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ImageView myGif;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        System.out.println("up");
        myGif.setY(y-=5);
    }
    public void down(ActionEvent e) {
        System.out.println("down");
        myGif.setY(y+=5);
    }
    public void left(ActionEvent e) {
        System.out.println("left");
        myGif.setX(x-=5);
    }
    public void right(ActionEvent e) {
        System.out.println("right");
        myGif.setX(x+=5);
    }
}