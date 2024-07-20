/**
 * Sample Skeleton for 'MainWindow.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class MainWindowController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cb1"
    private CheckBox cb1; // Value injected by FXMLLoader

    @FXML
    void selection(ActionEvent event) {
println "Box activated!"
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cb1 != null : "fx:id=\"cb1\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }
}

return new MainWindowController()
