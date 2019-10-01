package miniproject.guifiles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuGUI extends Application {
    String selectedRestName;
    String[] dishesToDisplay;
    int[]  pricesToDisplay;

    TableView tableView= new TableView();

    MenuGUI(String selectedRestName){
        this.selectedRestName=selectedRestName;
        //GetMenu g= new GetMenu();
        //g.(selectedRestName);
        //dishesToDisplay=g.getDishNames();
        //pricesToDisplay=g.getDishPrices();
        dishesToDisplay=new String[]{"Chicken legs","Chicken hands","Chicken brain","Chicken BOOTY"};//TEMP
        pricesToDisplay=new int[]{100,200,300,400};//TEMP
        start(new Stage());
    }

    @Override
    public void start(Stage primaryStage) {
        HBox welcome= new HBox();
        Label restInfo= new Label(selectedRestName);
        welcome.getChildren().add(restInfo);
        Label dishTitle= new Label("DISHES");
        Label priceTitle= new Label("PRICES");

        GridPane gridPane= new GridPane();
        gridPane.setHgap(50);

        VBox dishBox= new VBox();
        dishBox.setSpacing(10);
        VBox priceBox= new VBox();
        priceBox.setSpacing(10);

        Button[]dishButton=new Button[dishesToDisplay.length];
        Button[]priceButton= new Button[pricesToDisplay.length];

        for (int i=0;i<dishesToDisplay.length;i++){
            dishButton[i]= new Button(dishesToDisplay[i]);
            priceButton[i]= new Button(""+pricesToDisplay[i]);
        }

        for (int i=0;i<dishesToDisplay.length;i++){
            dishBox.getChildren().add(dishButton[i]);
            priceBox.getChildren().add(priceButton[i]);
        }

        gridPane.add(welcome,0,0);
        gridPane.add(dishTitle,0,1);
        gridPane.add(priceTitle,1,1);
        gridPane.add(dishBox,0,2);
        gridPane.add(priceBox,1,2);



        Scene scene= new Scene(gridPane,300,300);
        primaryStage.setTitle(selectedRestName);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
