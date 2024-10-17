module com.bekvizz.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bekvizz.sudokugame to javafx.fxml;
    exports com.bekvizz.sudokugame;
}