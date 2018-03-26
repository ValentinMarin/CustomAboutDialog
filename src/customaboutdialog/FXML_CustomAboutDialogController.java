/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customaboutdialog;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author marin
 */
public class FXML_CustomAboutDialogController implements Initializable {

    @FXML
    private Label lbl_about, lbl_app_title;
    
    @FXML
    private ImageView btn_exit;
    
    @FXML
    private AnchorPane btn_buy_Cafe;
    
    @FXML
    private void btn_exit_clicked(MouseEvent event) {
        System.exit(0);
    }
    
    @FXML 
    private Rectangle decoration_btn_references, decoration_btn_info;
    
    @FXML
    private AnchorPane anc_info_container, anc_references_container;
    
    @FXML 
    private void btn_references_entered(MouseEvent event) {
        decoration_btn_references.setVisible(true);
    }
    
    @FXML 
    private void btn_references_exited(MouseEvent event) {
        decoration_btn_references.setVisible(false);
    }
    
    @FXML
    private void btn_references_clicked(MouseEvent event) {
        anc_references_container.setVisible(true);
        anc_info_container.setVisible(false);
    }
    
    @FXML 
    private void btn_info_entered(MouseEvent event) {
        decoration_btn_info.setVisible(true);
    }
    
    @FXML 
    private void btn_info_exited(MouseEvent event) {
        decoration_btn_info.setVisible(false);
    }
    
    @FXML
    private void btn_info_clicked(MouseEvent event) {
        anc_references_container.setVisible(false);
        anc_info_container.setVisible(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
