package com.bekvizz.sudokugame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sudoku-view.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image(getClass().getResourceAsStream("iconSudoku.png"));
        //scene.getStylesheets().add(getClass().getResource("general-style.css").toExternalForm());
        String generalStyle = this.getClass().getResource("general-style.css").toExternalForm();
        scene.getStylesheets().add(generalStyle);
        stage.getIcons().add(icon);
        stage.setTitle("Sudoku Game");

        /*Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.DARKOLIVEGREEN);
        Image icon = new Image(getClass().getResourceAsStream("iconSudoku.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Sudoku Game");

        Text text = new Text();
        text.setText("A piece of some text...");
        text.setUnderline(true);
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Arial",50));
        text.setFill(Color.ORANGERED);

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(300);
        line.setEndY(100);
        line.setStrokeWidth(10);
        line.setStroke(Color.INDIANRED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(450);
        rectangle.setY(450);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.WHITESMOKE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        rectangle.setCursor(Cursor.CROSSHAIR);
        rectangle.setEffect(new DropShadow(5,5,5,Color.BLACK));

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                100.0,300.0);
        triangle.setFill(Color.WHITESMOKE);

        Circle circle = new Circle();
        circle.setCenterX(80);
        circle.setCenterY(80);
        circle.setRadius(20);
        circle.setFill(Color.YELLOW);

        Image image = new Image(getClass().getResourceAsStream("Princess-Luna-royal.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(319.75);
        imageView.setFitHeight(280.25);
        imageView.setFitWidth(186.125);
        imageView.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.DARKSLATEBLUE, 3,0,3,0));


        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);*/

        stage.setScene(scene);
        stage.show();
    }
}