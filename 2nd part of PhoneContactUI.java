
    table.setOnMouseClicked(e ->{
        Contact selected = table.getSelectionModel().getSelectedItem();
        if(selected!=null){
            nameField.setText(selected.getName());
            phoneField.setText(selected.getPhone());
            emailField.setText(selected.getEmail());
        }
            
    });
        
        
        updateBtn.setOnAction(e->{
            Contact selected = table.getSelectionModel().getSelectedItem();
            if(selected!=null){
                selected.setName(nameField.getText());
                selected.setPhone(phoneField.getText());
                selected.setEmail(emailField.getText());
                
                table.refresh();
                nameField.clear();
                phoneField.clear();
            }
        });
        
        
        deleteBtn.setOnAction(e -> {

            Contact selected = table.getSelectionModel()
                    .getSelectedItem();

            if(selected != null){

                contactList.remove(selected);

                nameField.clear();
                phoneField.clear();
                emailField.clear();
            }
        });


        clearBtn.setOnAction(e -> {

            nameField.clear();
            phoneField.clear();
            emailField.clear();

            table.getSelectionModel().clearSelection();
        });


        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(
                addBtn, updateBtn, deleteBtn, clearBtn
        );


        VBox layout = new VBox(15);

        layout.setPadding(new Insets(20));

        layout.getChildren().addAll(
                title,
                nameField,
                phoneField,
                emailField,
                buttonBox,
                table
        );

    

