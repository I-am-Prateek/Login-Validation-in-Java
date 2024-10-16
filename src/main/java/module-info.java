module com.example.loginpagebypratik {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.loginpagebypratik to javafx.fxml;
    exports com.example.loginpagebypratik;
}