module org.app.oop_library {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.app.oop_library to javafx.fxml;
    exports org.app.oop_library;
}