module com.example.fileanddots {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.fileanddots to javafx.fxml;
    exports com.example.fileanddots;
}