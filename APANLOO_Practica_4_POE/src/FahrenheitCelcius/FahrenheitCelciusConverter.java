package FahrenheitCelcius;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class FahrenheitCelciusConverter extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton borrarB;
	JButton calcularB;
	JButton salirB;
	JTextField celciusT;
	JTextField fahrT;
	
	public FahrenheitCelciusConverter(String title, int width, int height) {
		super(title);
		this.setSize(width, height);
		this.setLayout(new BorderLayout());
		
		//creamos dos paneles, uno para las etiquetas y los textbox y el segundo para los botones
		JPanel panelSup= new JPanel();
		JPanel panelBotones= new JPanel();
		
		this.add(panelSup, BorderLayout.CENTER);
		this.add(panelBotones, BorderLayout.SOUTH);
		
		//agregamos las etiquetas y los textbox al panel superior
		panelSup.setLayout(null);
		panelSup.setBackground(Color.DARK_GRAY);
		
		JLabel celciusL= new JLabel("Celcius");
		JLabel fahrL= new JLabel("Fahrenheit");
		celciusT= new JTextField();
		fahrT= new JTextField();
		
		celciusL.setBounds(30, 20, 100, 20);
		fahrL.setBounds(30, 60, 100, 20);
		/*celciusL.setForeground(Color.white);
		fahrL.setForeground(Color.white);*/
		Color alien= new Color(0x00FF00);
		celciusL.setForeground(alien);
		fahrL.setForeground(alien);
		celciusT.setBounds(130, 20, 400, 20);
		fahrT.setBounds(130, 60, 400, 20);
		celciusT.setText("0");//modifica el texto inicial del textfield
		fahrT.setText("0");
		celciusT.setBackground(Color.black);//modificia el color del background del textfield
		fahrT.setBackground(Color.black);
		celciusT.setForeground(alien);//modifica el color de la letra en el textfield
		fahrT.setForeground(alien);
		celciusT.setCaretColor(alien);//modifica el color del cursor en el textfield
		fahrT.setCaretColor(alien);
		
		panelSup.add(celciusL);
		panelSup.add(celciusT);
		panelSup.add(fahrL);
		panelSup.add(fahrT);
		
		//al panel inferior, agregamos los botones
		panelBotones.setLayout(new FlowLayout());
		panelBotones.setPreferredSize(new Dimension(100, 50));
		panelBotones.setBackground(Color.DARK_GRAY);
		
		borrarB= new JButton("Borrar");
		calcularB= new JButton("Calcular");
		salirB= new JButton("Salir");
		
		/*borrarB.setBackground(Color.black);
		calcularB.setBackground(Color.black);
		salirB.setBackground(Color.black);
		borrarB.setBorder(BorderFactory.createLineBorder(Color.white));
		calcularB.setBorder(BorderFactory.createLineBorder(Color.white));
		salirB.setBorder(BorderFactory.createLineBorder(Color.white));
		borrarB.setForeground(alien);
		calcularB.setForeground(alien);
		salirB.setForeground(alien);*/
		
		borrarB.addActionListener(this);
		calcularB.addActionListener(this);
		salirB.addActionListener(this);
		
		panelBotones.add(borrarB);
		panelBotones.add(calcularB);
		panelBotones.add(salirB);
		
		//para que el frame se muestre centrado y se termine el programa cuando se cierre el frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==borrarB) {
			celciusT.setText("0");
			fahrT.setText("0");
		}
		else if(e.getSource()==calcularB) {
			calcularTemp();
		}
		else if(e.getSource()==salirB) {
			System.exit(0);
		}
	}
	
	//convierte de una temperatura a otra dependiendo del texto en el textfield de cada escala
	//el texto se inicializa con 0, si es diferente de 0 quiere decir que se ha modificado y se ha ingresa un numero a convertir
	public void calcularTemp() {

		try {
			//de Fahrenheit a Celcius
			if(celciusT.getText().compareTo("0")==0 && fahrT.getText().compareTo("0")!=0) {
				celciusT.setText(fahrToCelcius());
			}
			
			//Celcius a Fahrenheit
			else if(fahrT.getText().compareTo("0")==0 && celciusT.getText().compareTo("0")!=0) {
				fahrT.setText(celciusToFahr());
			}
			
			//si ambos TextFields contienen texto, por default convertimos de Celcius a Fahrenheit
			else if(celciusT.getText().compareTo("0")!=0 && fahrT.getText().compareTo("0")!=0){
				fahrT.setText(celciusToFahr());
			}
			//si en ambos textfields hay 0s
			else {
				System.out.println("Por favor ingresa un valor a convertir");
			}
		} 
		//si no existe string en uno de los textfields, reinicializamos a 0
		catch (Exception e) {
			System.out.println("Dato no valido. Por favor, ingresa un valor a convertir");
			celciusT.setText("0");
			fahrT.setText("0");
		}
	}
	
	public String celciusToFahr() {
		double celciusValue= Double.valueOf(celciusT.getText());
		
		double resultadoDouble= ((1.8)*celciusValue + 32.0);
		String resultadoString= String.valueOf(resultadoDouble);
		
		return resultadoString;
	}
	
	public String fahrToCelcius() {
		double fahrValue= Double.valueOf(fahrT.getText());
		
		double resultadoDouble= (0.555555)*(fahrValue - 32.0);
		String resultadoString= String.valueOf(resultadoDouble);
		
		return resultadoString;
	}
}
