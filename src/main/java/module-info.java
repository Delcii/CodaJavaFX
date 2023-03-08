module com.example.coda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coda to javafx.fxml;
    exports com.example.coda;
}