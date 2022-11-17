package com.crawfordg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Calculator extends Application{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonMul;
    private Button buttonDiv;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonClr;
    private Button buttonEq;
    private Button buttonDot;
    private TextField answerField;
    private double tempAns1;
    private double tempAns2;
    private String sign;
    private double answer;
    private boolean dot;

    public void start(Stage applicationStage){
        Scene scene = null;
        GridPane gridPane = null;

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num0 = 0;

        gridPane = new GridPane();
        scene = new Scene(gridPane);

        //setting all buttons up
        button1 = new Button("1");
        button1.setPrefHeight(50);
        button1.setPrefWidth(50);
        button1.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button2 = new Button("2");
        button2.setPrefHeight(50);
        button2.setPrefWidth(50);
        button2.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button3 = new Button("3");
        button3.setPrefHeight(50);
        button3.setPrefWidth(50);
        button3.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button4 = new Button("4");
        button4.setPrefHeight(50);
        button4.setPrefWidth(50);
        button4.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button5 = new Button("5");
        button5.setPrefHeight(50);
        button5.setPrefWidth(50);
        button5.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button6 = new Button("6");
        button6.setPrefHeight(50);
        button6.setPrefWidth(50);
        button6.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button7 = new Button("7");
        button7.setPrefHeight(50);
        button7.setPrefWidth(50);
        button7.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button8 = new Button("8");
        button8.setPrefHeight(50);
        button8.setPrefWidth(50);
        button8.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button9 = new Button("9");
        button9.setPrefHeight(50);
        button9.setPrefWidth(50);
        button9.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        button0 = new Button("0");
        button0.setPrefHeight(50);
        button0.setPrefWidth(50);
        button0.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        buttonAdd = new Button("+");
        buttonAdd.setPrefHeight(50);
        buttonAdd.setPrefWidth(50);
        buttonAdd.setStyle("-fx-background-color: #FF9500;  -fx-text-fill: #ffffff");
        buttonSub = new Button("-");
        buttonSub.setPrefHeight(50);
        buttonSub.setPrefWidth(50);
        buttonSub.setStyle("-fx-background-color: #FF9500;  -fx-text-fill: #ffffff");
        buttonMul = new Button("*");
        buttonMul.setPrefHeight(50);
        buttonMul.setPrefWidth(50);
        buttonMul.setStyle("-fx-background-color: #FF9500;  -fx-text-fill: #ffffff");
        buttonDiv = new Button("/");
        buttonDiv.setPrefHeight(50);
        buttonDiv.setPrefWidth(50);
        buttonDiv.setStyle("-fx-background-color: #FF9500;  -fx-text-fill: #ffffff");
        buttonClr = new Button("C");
        buttonClr.setPrefHeight(50);
        buttonClr.setPrefWidth(50);
        buttonClr.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");
        buttonEq = new Button("=");
        buttonEq.setPrefHeight(50);
        buttonEq.setPrefWidth(100);
        buttonEq.setStyle("-fx-background-color: #FF9500;  -fx-text-fill: #ffffff");
        buttonDot = new Button(".");
        buttonDot.setPrefHeight(50);
        buttonDot.setPrefWidth(50);     
        buttonDot.setStyle("-fx-background-color: #505050;  -fx-text-fill: #ffffff");

        answerField = new TextField();
        answerField.setPrefColumnCount(5);
        answerField.setEditable(false);
        answerField.setText("");
        answerField.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setHgap(2); //spacing between cols
        gridPane.setVgap(2); //spacing between rows
        
        //adding all buttons to grid
        gridPane.add(answerField, 0, 0);
        gridPane.setColumnSpan(answerField, 50);
        gridPane.add(button7, 24, 1);
        gridPane.add(button8, 25, 1);
        gridPane.add(button9, 26, 1);
        gridPane.add(button4, 24, 2);
        gridPane.add(button5, 25, 2);
        gridPane.add(button6, 26, 2);
        gridPane.add(button1, 24, 3);
        gridPane.add(button2, 25, 3);
        gridPane.add(button3, 26, 3);
        gridPane.add(button0, 25, 4);
        gridPane.add(buttonAdd, 27, 1);
        gridPane.add(buttonSub, 27, 2);
        gridPane.add(buttonMul, 27, 3);
        gridPane.add(buttonDiv, 27, 4);
        gridPane.add(buttonClr, 24, 4);
        gridPane.add(buttonEq, 25, 5);
        gridPane.add(buttonDot, 26, 4);
        gridPane.setColumnSpan(buttonEq, 25);
        gridPane.setStyle("-fx-background-color : #1c1c1c");

        //buttons 0-9
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num1));
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num2));
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num3));
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num4));
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num5));
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num6));
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num7));
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num8));
                
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num9));
            }
        });
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                answerField.appendText(Integer.toString(num0));
            }
        });

        //buttons to add/sub/mul/div
        buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if (sign == "+" || sign == "-" || sign == "*" || sign == "/"){
                    System.out.print("This calculator is too simple for that!");
                }
                else{
                    tempAns1 = Double.parseDouble((answerField).getText());
                    sign = "+";
                    answerField.setText("");
                    answerField.appendText("+");
                    dot = false;

                }

            }
        });
        buttonSub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if (sign == "+" || sign == "-" || sign == "*" || sign == "/"){
                    System.out.print("This calculator is too simple for that!");
                }
                else{
                    tempAns1 = Double.parseDouble((answerField).getText());
                    sign = "-";
                    answerField.setText("");
                    answerField.appendText("-");
                    dot = false;

                }
                
            }
        });
        buttonMul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if (sign == "+" || sign == "-" || sign == "*" || sign == "/"){
                    System.out.print("This calculator is too simple for that!");
                }
                else{
                    tempAns1 = Double.parseDouble((answerField).getText());
                    sign = "*";
                    answerField.setText("");
                    answerField.appendText("*");
                    dot = false;

                }
            }
        });
        buttonDiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if (sign == "+" || sign == "-" || sign == "*" || sign == "/"){
                    System.out.print("This calculator is too simple for that!");
                }
                else{
                    tempAns1 = Double.parseDouble((answerField).getText());
                    sign = "/";
                    answerField.setText("");
                    answerField.appendText("/");
                    dot = false;

                }
            }
        });

        //clear button
        buttonClr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                answerField.setText("");
                tempAns1 = 0;
                tempAns2 = 0;
                sign = "";
                dot = false;
            }
        });

        //dot button
        buttonDot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                if ((answerField.getText()).contains("+") || (answerField.getText()).contains("-") || (answerField.getText()).contains("*") || (answerField.getText()).contains("/")){
                    answerField.setText("");
                }
                else if (dot){
                    System.out.println("thats illegal");
                }
                else{
                    answerField.appendText(".");
                    dot = true;
                }
            }
        });

        //equals button
        buttonEq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                tempAns2 = Double.parseDouble((answerField).getText());
                if (sign.contains("+")){
                    answer = tempAns1 + tempAns2;
                }
                else if (sign.contains("-")){
                    answer = tempAns1 - tempAns2;
                }
                else if (sign.contains("*")){
                    answer = tempAns1 * tempAns2;
                }
                else if (sign.contains("/")){
                    answer = tempAns1 / tempAns2;
                }

                String answerAsString = (Double.toString(tempAns1) + " " + sign + " " + Double.toString(tempAns2) + " = " + Double.toString(answer));
                tempAns2 = Double.parseDouble((answerField).getText());
                answerField.setText(answerAsString);
                tempAns1 = 0;
                tempAns2 = 0;
                sign = "";
                dot = false;
            }
        });

        applicationStage.setScene(scene);
        applicationStage.setTitle("Simple Calculator");
        applicationStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
