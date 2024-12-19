module ru.polkovnikova.polkovnikova_task20 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.polkovnikova.polkovnikova_task20 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task20;
}