package loginformgrp8;

import java.awt.*;
import java.awt.event.*;

public class LoginFormGrp8 extends Frame implements ActionListener, ItemListener {
    
    LoginFormGrp8() {
        super ("My Login Form");
        initComponents();
        
        addWindowListener(new WindowAdapter() { //window listener for closing the program
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    
    private void initComponents() {
        //declaration of components
        Label lblUsername = new Label ("Username");
        TextField txtName = new TextField ();
        Label lblPassword = new Label ("Password");
        TextField txtPass = new TextField ();
        Button btnLogin = new Button("Login");
        Button btnClear = new Button("Clear");
        Button btnExit = new Button("Exit");
        
        //component properties
        
    }
    
    
    
    public static void main(String[] args) {
        new LoginFormGrp8().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
}
