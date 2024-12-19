module ru.polkovnikova.polkovnikova_task17 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task17 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task17;
}