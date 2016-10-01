package paquete;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.applet.AudioClip;


public class Ventana5 extends JFrame implements ActionListener{

	public JPanel panelimg, panel0, panel1, panel2, panel3, panelresult;
	public ImageIcon fondo, perro, gato, loro, leon;
	public JButton boton0, boton1, boton2, boton3, boton4;
	public JLabel labelimg, labelperro, labelgato, labelloro, labelleon, label0, label1, label2, label3, label4;
	public JTextField input0, input1, input2, input3;
	public String respuestaperro= "perro";
	public String respuestagato= "gato";
	public String respuestaloro= "loro";
	public String respuestaleon= "leon";
	

	
	
	public Ventana5 ()
	
	{
		
		this.setLayout(new GridLayout(5, 5, 5, 5));
		
		panelimg= new JPanel();
		fondo= new ImageIcon("../ventana/src/paquete/ovni2.jpg");
		labelimg= new JLabel(fondo);
		
		panel0= new JPanel();
		perro= new ImageIcon("../ventana/src/paquete/perro1.jpg");
		labelperro= new JLabel(perro);
		boton0= new JButton("Responder");
		input0= new JTextField();
		label0= new JLabel();
		
		panel1= new JPanel();
		gato= new ImageIcon("../ventana/src/paquete/gato1.jpg");
		labelgato= new JLabel(gato);
		boton1= new JButton("Responder");
		input1= new JTextField();
		label1= new JLabel();
		
		panel2= new JPanel();
		loro= new ImageIcon("../ventana/src/paquete/loro1.jpg");
		labelloro= new JLabel(loro);
		boton2= new JButton("Responder");
		input2= new JTextField();
		label2= new JLabel();
		
		panel3= new JPanel();
		leon= new ImageIcon("../ventana/src/paquete/leon1.jpg");
		labelleon= new JLabel(leon);
		boton3= new JButton("Responder");
		input3= new JTextField();
		label3= new JLabel();
		
		panelresult= new JPanel();
		boton4= new JButton("Resultado");
		label4= new JLabel();
		
	//Adherir definitivamente a los paneles.	
		
		
		this.add(panelimg, BorderLayout.NORTH);
		panelimg.add(labelimg);
		panelimg.add(boton4);
		panelimg.add(label4);
		
		
		
		
		panel0.setLayout(new GridLayout(1,1,10,10));
		this.add(panel0);
		panel0.add(labelperro);
		panel0.add(boton0);
		panel0.add(input0);
		panel0.add(label0);
		
		panel1.setLayout(new GridLayout(1,1,10,10));
		this.add(panel1);
		panel1.add(labelgato);
		panel1.add(boton1);
		panel1.add(input1);
		panel1.add(label1);
		
		panel2.setLayout(new GridLayout(1,1,10,10));
		this.add(panel2);
		panel2.add(labelloro);
		panel2.add(boton2);
		panel2.add(input2);
		panel2.add(label2);
		
		panel3.setLayout(new GridLayout(1,1,10,10));
		this.add(panel3);
		panel3.add(labelleon);
		panel3.add(boton3);
		panel3.add(input3);
		panel3.add(label3);
		
		
		
	
		
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //cierra el proceso
		
		this.boton0.addActionListener(this); // acciones
		this.boton1.addActionListener(this);
		this.boton2.addActionListener(this);
		this.boton3.addActionListener(this);
		this.boton4.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	
	{
		if(e.getSource().equals(boton0))
		
		{
			
		if 
			(this.input0.getText().equals(respuestaperro)) {this.label0.setText("Muy bien!!!");} 
		
		else
			
		{this.label0.setText("Intentalo otra vez!!!") ;}
		
		}
		
		
		if(e.getSource().equals(boton1))
		{
			if(this.input1.getText().equals(respuestagato)) {this.label1.setText("Muy bien!!!");}
			else
				
			{this.label1.setText("Intentalo otra vez!!!") ;}
		}
		
		
		
		if(e.getSource().equals(boton2))
		{
			if(this.input2.getText().equals(respuestaloro)) {this.label2.setText("Muy bien!!!");}
			else
				
			{this.label2.setText("Intentalo otra vez!!!") ;}
			}
		
		
			
		if(e.getSource().equals(boton3))
		{
			if(this.input3.getText().equals(respuestaleon)) {this.label3.setText("Muy bien!!!");}
			else
				
			{this.label3.setText("Intentalo otra vez!!!") ;}
			
		}
			
			if(e.getSource().equals(boton4)) {
			
			if((((this.input2.getText().equals(respuestaloro)) && (this.input3.getText().equals(respuestaleon))) && (this.input1.getText().equals(respuestagato))) && (this.input0.getText().equals(respuestaperro))) {this.label4.setText("GANASTE !!!");}
			
			else {this.label4.setText("Sigue intentanto..");}
			}
		}
	
	}
	

