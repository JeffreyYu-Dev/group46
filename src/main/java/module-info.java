module com.group46 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.group46 to javafx.fxml;
    exports com.group46;
}
