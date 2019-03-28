package agenda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

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
        chamarTela("Inclusao");
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
    
    private void chamarTela(String arquivoView){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(arquivoView + ".fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ ex.getMessage());
        }
    }
    
}
