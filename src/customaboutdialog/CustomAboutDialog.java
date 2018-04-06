/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customaboutdialog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author marin
 */
public class CustomAboutDialog extends Application {
    
    double xOffset = 0; /* Define x Offset */
    double yOffset = 0; /* Define y Offset */
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_CustomAboutDialog.fxml"));
        
        /* + Move window on screen */
        root.setOnMousePressed((MouseEvent event) -> {
            xOffset = stage.getX() - event.getScreenX();
            yOffset = stage.getY() - event.getScreenY();
        });
        
        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() + xOffset);
            stage.setY(event.getScreenY() + yOffset);
        });
        /* + Move window on screen */
        
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        String css = this.getClass().getResource("resources/CSS_CustomAboutDialog_WhiteAndBlue.css").toExternalForm(); 
        scene.getStylesheets().add(css);
        
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
