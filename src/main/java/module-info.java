module app.uilocal_homeassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.uilocal_homeassignment to javafx.fxml;
    exports app.uilocal_homeassignment;
}