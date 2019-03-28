package agenda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 8rux40
 */
public class InclusaoController implements Initializable {

    @FXML
    public TextField txtNome;
    @FXML
    public TextField txtEmail;
    @FXML
    public TextField txtTelefone;
    @FXML
    public Button btnGravar;
    @FXML
    public Button btnCancelar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void onBtnGravarAction(ActionEvent event) {
    }

    @FXML
    public void onBtnCancelarAction(ActionEvent event) {
    }
    
}
