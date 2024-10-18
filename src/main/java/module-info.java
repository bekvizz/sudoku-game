module com.bekvizz.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;


    opens com.bekvizz.sudokugame to javafx.fxml;
    exports com.bekvizz.sudokugame;
}