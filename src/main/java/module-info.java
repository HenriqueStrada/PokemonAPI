module com.senac.pokemonapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.senac.pokemonapi to javafx.fxml;
    exports com.senac.pokemonapi;
}