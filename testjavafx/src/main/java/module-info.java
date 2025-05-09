module testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens testjavafx to javafx.fxml;
    exports testjavafx;
}
