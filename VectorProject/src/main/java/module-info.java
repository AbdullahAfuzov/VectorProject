module org.example.vectorproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.vectorproject to javafx.fxml;
    exports org.example.vectorproject;
}