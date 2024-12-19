module ru.polkovnikova.plkovnikova_task16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.plkovnikova_task16 to javafx.fxml;
    exports ru.polkovnikova.plkovnikova_task16;
}