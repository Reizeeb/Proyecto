package sample;

import com.sun.org.apache.bcel.internal.generic.Select;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller {

    @FXML
    private Button boton0;
    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button botone1;
    @FXML
    private Button botonv;
    @FXML
    private Button c1;
    @FXML
    private Button c2;
    @FXML
    private Button c3;
    @FXML
    private RadioButton Rad1;
    @FXML
    private RadioButton Rad2;
    @FXML
    private RadioButton Rad3;
    @FXML
    private RadioButton Rad4;
    @FXML
    private TableView tabla1;
    @FXML
    private TableColumn column;
    @FXML
    private TableColumn column1;
    @FXML
    private TableColumn column2;
    @FXML
    private TextField TxtFld;


    @FXML
    private void seguir(ActionEvent siguiente) throws IOException {

        Stage stage = null;
        Parent root = null;
        if (siguiente.getSource() == boton1) {
            stage = (Stage) boton1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana2.fxml"));
        } else if (siguiente.getSource() == boton2) {
            stage = (Stage) boton2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana3.fxml"));
        } else if (siguiente.getSource() == boton3) {
            stage = (Stage) boton3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("tabla.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void exit(ActionEvent salir) throws IOException {
        Stage stage = null;
        Parent root = null;
        if (salir.getSource() == boton0) {
            System.exit(0);
        } else if (salir.getSource() == botone1) {
            stage = (Stage) botone1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana.fxml"));
        } else if (salir.getSource() == botonv) {
            stage = (Stage) botonv.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana3.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void AbrirMenu(ActionEvent e) throws IOException {
        Stage stage = null;
        Parent root = null;
        if (Rad1.isSelected() == true) {
            stage = (Stage) Rad1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("MAC.fxml"));
        } else if (Rad2.isSelected() == true) {
            stage = (Stage) Rad2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("TACO.fxml"));
        } else if (Rad3.isSelected() == true) {
            stage = (Stage) Rad3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("KFC.fxml"));
        } else if (Rad4.isSelected() == true) {
            stage = (Stage) Rad4.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("DONLEE.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //*Esto es el parse de un String a Float con los botones de los combos//
    @FXML private void factura(ActionEvent pago) throws IOException {
    }

    if(pago.getSource()==c1)

    {
        String Comb1 = c1.getText();
        float Combo1 = Float.parseFloat(Comb1);
    }

    else if(pago.getSource()==c2)

    {
        String Comb2 = c2.getText();
        float Combo2 = Float.parseFloat(Comb2);
    }

    else if(pago.getSource()==c3)

    {
        String Comb3 = c3.getText();
        float Combo3 = Float.parseFloat(Comb3);
    }
    public class FacturacionFormularioController implements Initializable {
        TableView<float>TableViewCombo
        column1.add(c1,c2,c3)
        column2.add(TxtFld)

        double total = 0d;
        TableViewCombo.getItems().forEach(c1,c2,c3 ->
        total += c1,c2,c3.getPrecio());
    }


}





