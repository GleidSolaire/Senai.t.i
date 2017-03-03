/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiratela;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
 
 
 
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
        @FXML
    private Label label1;
    @FXML

Button botao = new Button ("+");
    /*double n1 = Double.valueOf(caixaTexto_n1.getText());
             @FXML*/

Button botao1 = new Button ("-");
             
              @FXML

Button botao2 = new Button ("*");
               @FXML

Button botao3 = new Button ("/");
    
    @FXML
    private TextField caixaTexto_n1 = new TextField ();
     private TextField caixaTexto_n2 = new TextField ();
    
    
    @FXML
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("resultado");
        
       
      
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}