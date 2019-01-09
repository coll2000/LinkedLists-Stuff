import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.LinkedList;

public class VisualisingLinkedLists extends Application {

    private static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Linked List");
        Button addButton = new Button("Add Item To List");
        Button addFirst = new Button("Add Item to front of List");
        Button addLast = new Button("Add Item to the last of List");
        TextField input = new TextField();

        TextField outputList = new TextField();
        outputList.setDisable(true);


        VBox root = new VBox(addButton,addFirst,addLast ,input, outputList);

        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Boolean valid = false;
                String value = input.getText();
                while(!valid){
                    if(value.isEmpty()){
                        // stuff
                    } else if (outputList.toString().startsWith(" ")){
                        // stuff
                    } else {
                        list.add(value);
                        input.setText("");
                        valid = true;
                    }
                }
                outputList.setText(list.toString());
            }
        });

        addFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Boolean valid = false;
                String value = input.getText();
                while(!valid){
                    if(value.isEmpty()){
                        // stuff
                    } else if (outputList.toString().startsWith(" ")){
                        // stuff
                    } else {
                        list.addFirst(value);
                        input.setText("");
                        valid = true;
                    }
                }
                outputList.setText(list.toString());
            }
        });

        addLast.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Boolean valid = false;
                String value = input.getText();
                while(!valid){
                    if(value.isEmpty()){
                        // stuff
                    } else if (outputList.toString().startsWith(" ")){
                        // stuff
                    } else {
                        list.addLast(value);
                        input.setText("");
                        valid = true;
                    }
                }
                outputList.setText(list.toString());
            }
        });

        Scene scene = new Scene(root, 200, 100);
        stage.setScene(scene);

        stage.setWidth(500);
        stage.setHeight(250);

        stage.show();
    }


}
