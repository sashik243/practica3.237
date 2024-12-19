module ru.polkovnikova.polkovnikova_task18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task18 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task18;
}