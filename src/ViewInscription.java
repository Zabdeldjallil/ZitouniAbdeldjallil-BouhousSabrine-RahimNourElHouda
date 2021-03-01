import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
class ViewInscription extends ViewAbs{
	public void create() {
		
		JFrame frame= new JFrame();
		frame.setTitle("JFrame Based Contact Form");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JPanel headingPanel = new JPanel();
		JLabel headingLabel = new JLabel("Inscription");
		headingPanel.add(headingLabel);
		JPanel panel = new JPanel(new GridBagLayout());
		// Constraints for the layout
		GridBagConstraints constr = new GridBagConstraints();
		constr.insets = new Insets(10, 10, 10, 10);
		constr.anchor = GridBagConstraints.WEST;
		// Setting initial grid values to 0,0
		constr.gridx=0;
		constr.gridy=0;
		JLabel matLabel      = new JLabel("Matricule");
		JLabel nomLabel      = new JLabel("Nom");
		JLabel preLabel      = new JLabel("Prénom");
		JLabel emailLabel     = new JLabel("Email");
		JLabel pwdLabel        = new JLabel("pwd");
		JLabel iduniLabel      = new JLabel("Identifiant universite");
		JTextField matInput           = new JTextField(20);
		JTextField nomInput           = new JTextField(20);
		JTextField preInput          = new JTextField(20);
		JTextField emailInput          = new JTextField(20);
		JTextField pwdInput          = new JTextField(20);
		JTextField idInput          = new JTextField(20);
		//JTextArea textArea = new JTextArea(5, 20);
		panel.add(matLabel, constr);
		constr.gridx=1;
		panel.add(matInput, constr);
		constr.gridx=0; constr.gridy=1;
		
		panel.add(nomLabel, constr);
		constr.gridx=1;
		panel.add(nomInput, constr);
		constr.gridx=0; constr.gridy=2;
		
		panel.add(preLabel, constr);
		constr.gridx=1;
		panel.add(preInput, constr);
		constr.gridx=0; constr.gridy=3;
		
		panel.add(emailLabel, constr);
		constr.gridx=1;
		panel.add(emailInput, constr);
		constr.gridx=0; constr.gridy=4;
		
		panel.add(pwdLabel, constr);
		constr.gridx=1;
		panel.add(pwdInput, constr);
		constr.gridx=0; constr.gridy=5;
		
		panel.add(iduniLabel, constr);
		constr.gridx=1;
		panel.add(idInput, constr);
		constr.gridx=0; constr.gridy=7;
		//panel.add(textArea, constr);
		//constr.gridx=0; constr.gridy=4;
		//constr.gridwidth = 2;
		constr.anchor = GridBagConstraints.CENTER;
		// Button with text "Register"
		JButton button = new JButton("Submit");
		JButton button1 = new JButton("Cancel");
		// add a listener to button submit
		button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //statusLabel.setText("Ok Button is clicked here");
	         //System.out.println(matInput.getText());
	      //ControleurInscription controling=new ControleurInscription();
//controling.control(Integer.parseInt(matInput.getText()) ,nomInput.getText(),preInput.getText(),emailInput.getText(),pwdInput.getText(),Integer.parseInt(idInput.getText()) );
	        control( Integer.parseInt(matInput.getText()) ,nomInput.getText(),preInput.getText(),emailInput.getText(),pwdInput.getText(),Integer.parseInt(idInput.getText()) );
	         }
	      });
		//add a listener to button cancel
		button1.addActionListener(e -> {
	         frame.dispose();
	      });
	
		panel.add(button, constr);
		constr.gridx=0; constr.gridy=8;
		panel.add(button1,constr);
		mainPanel.add(headingPanel);
		mainPanel.add(panel);
		frame.add(mainPanel);
		frame.pack();
		frame.setSize(650, 650);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
