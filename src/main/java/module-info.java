module com.example.infinity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.infinity to javafx.fxml;
    exports com.example.infinity;
}