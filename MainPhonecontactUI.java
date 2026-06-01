
package main.phonecontactui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainPhonecontactUI extends Application {
    // TableView
    private TableView<Contact> table;

    // Data List
    private ObservableList<Contact> contactList =
            FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {

        
        Label title = new Label("Phone Contact Manager");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        
        TextField nameField = new TextField();
        nameField.setPromptText("Enter Name");

        TextField phoneField = new TextField();
        phoneField.setPromptText("Enter Phone Number");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter Email");

      
        Button addBtn = new Button("Add");
        Button updateBtn = new Button("Update");
        Button deleteBtn = new Button("Delete");
        Button clearBtn = new Button("Clear");

        addBtn.setPrefWidth(100);
        updateBtn.setPrefWidth(100);
        deleteBtn.setPrefWidth(100);
        clearBtn.setPrefWidth(100);

     
        table = new TableView<>();

        TableColumn<Contact, String> nameCol =
                new TableColumn<>("Name");
        nameCol.setMinWidth(180);
        nameCol.setCellValueFactory(
                new PropertyValueFactory<>("name"));

        TableColumn<Contact, String> phoneCol =
                new TableColumn<>("Phone");
        phoneCol.setMinWidth(180);
        phoneCol.setCellValueFactory(
                new PropertyValueFactory<>("phone"));

        TableColumn<Contact, String> emailCol =
                new TableColumn<>("Email");
        emailCol.setMinWidth(220);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email"));

        table.setItems(contactList);

        table.getColumns().addAll(nameCol, phoneCol, emailCol);

       
        addBtn.setOnAction(e -> {

            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            if(name.isEmpty() || phone.isEmpty() || email.isEmpty()){

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all fields!");
                alert.showAndWait();

            } else {

                contactList.add(
                        new Contact(name, phone, email)
                );

                nameField.clear();
                phoneField.clear();
                emailField.clear();
            }
        });


    
  

