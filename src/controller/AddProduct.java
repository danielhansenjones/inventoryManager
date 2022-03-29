package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Inventory;
import model.Part;
import model.Product;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProduct implements Initializable {
    Stage stage;
    Parent scene;
    @FXML
    private TableView <Product> tableViewAddProductAdd;
    @FXML
    private TableColumn<Product, Integer> tableViewAddProductAddIDColumn;
    @FXML
    private TableColumn <Product, String>tableViewAddProductAddNameColumn;
    @FXML
    private TableColumn <Product, Integer>tableViewAddProductAddInvColumn;
    @FXML
    private TableColumn <Product, Double>tableViewAddProductAddPriceColumn;
  
    @FXML
    private TableView tableViewAddProductDelete;
    @FXML
    private TableColumn tableViewAddProductDeleteIDColumn;
    @FXML
    private TableColumn tableViewAddProductDeleteNameColumn;
    @FXML
    private TableColumn tableViewAddProductDeleteInvColumn;
    @FXML
    private TableColumn tableViewAddProductDeletePriceColumn;

    @FXML
    private Button buttonAddProductSearch;
    @FXML
    private Button buttonAddProductAdd;
    @FXML
    private Button buttonAddProductDelete;
    @FXML
    private Button buttonAddProductCancel;
    @FXML
    private Button buttonAddProductSave;
    @FXML
    private Button buttonAddProductClear;


    @FXML
    private TextField textFieldAddProductName;
    @FXML
    private TextField textFieldAddProductInv;
    @FXML
    private TextField textFieldAddProductPrice;
    @FXML
    private TextField textFieldAddProductMin;
    @FXML
    private TextField textFieldAddProductSearch;
    @FXML
    private TextField textFieldAddProductMax;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
