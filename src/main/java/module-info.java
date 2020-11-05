module com.mycompany.coba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.coba to javafx.fxml;
    exports com.mycompany.coba;
}
