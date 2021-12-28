module com.example.pr8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr8 to javafx.fxml;
    exports com.example.pr8;
}