package agenda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author 8rux40
 */
public class MenuController implements Initializable {

    @FXML
    public MenuItem miInclusao;
    @FXML
    public MenuItem miEdicao;
    @FXML
    public MenuItem miExclusao;
    @FXML
    public MenuItem miListagem;
    @FXML
    public MenuItem miSair;
    @FXML
    public MenuItem miDesenvolvedor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void onMiInclusaoAction(ActionEvent event) {
    }

    @FXML
    public void onMiEdicaoAction(ActionEvent event) {
    }

    @FXML
    public void onMiExclusaoAction(ActionEvent event) {
    }

    @FXML
    public void onMiListagemAction(ActionEvent event) {
    }

    @FXML
    public void onMiSairAction(ActionEvent event) {
    }

    @FXML
    public void onMiDesenvolvedor(ActionEvent event) {
    }
    
}
