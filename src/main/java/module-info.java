module com.example.project1ucode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project1ucode to javafx.fxml;
    exports com.example.project1ucode;
}