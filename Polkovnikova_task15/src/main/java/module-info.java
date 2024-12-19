module ru.polkovnikova.polkovnikova_task15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task15 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task15;
}