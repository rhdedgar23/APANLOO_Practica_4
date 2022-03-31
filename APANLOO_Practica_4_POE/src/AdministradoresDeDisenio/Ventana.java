package AdministradoresDeDisenio;

import java.awt.Container;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;

	public Ventana(String Titulo, int width, int height) {
		super(Titulo);
		this.setSize(width, height);
		this.setLayout(null);
		
		//se crean 3 paneles y se agregan en la posicion superior, central e inferior respectivamente
		JPanel panel= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		Container mainPanel= getContentPane();
		
		panel.setBounds(50, 0, 500, 100);
		panel2.setBounds(50, 100, 500, 200);
		panel3.setBounds(50, 300, 500, 200);
		
		mainPanel.setBackground(Color.DARK_GRAY);
		panel.setBackground(Color.orange);
		panel2.setBackground(Color.GRAY);
		panel3.setBackground(Color.cyan);
	
		mainPanel.add(panel);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		
		//Para el panel superior "panel", usamos etiquetas con BorderLayout
		panel.setLayout(new BorderLayout());
		
		JLabel label= new JLabel();
		JLabel label2= new JLabel();
		JLabel label3= new JLabel();
		JLabel label4= new JLabel();
		JLabel label5= new JLabel();
		
		label.setText("Tunez");
		label2.setText("Sudafrica");
		label3.setText("Republica Centroafricana");
		label4.setText("Somalia");
		label5.setText("Senegal");
		
		panel.add(label, BorderLayout.NORTH);
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label2, BorderLayout.SOUTH);
		label2.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label3, BorderLayout.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label4, BorderLayout.EAST);
		panel.add(label5, BorderLayout.WEST);
		
		//Para el panel central "panel2", usamos etiquetas con Flowlayout
		panel2.setLayout(new FlowLayout());
		
		JLabel label6= new JLabel();
		JLabel label7= new JLabel();
		JLabel label8= new JLabel();
		JLabel label9= new JLabel();
		JLabel label10= new JLabel();
		JLabel label11= new JLabel();
		JLabel label12= new JLabel();
		JLabel label13= new JLabel();
		JLabel label14= new JLabel();
		JLabel label15= new JLabel();
		
		label6.setText("Egipto");
		label7.setText("Libia");
		label8.setText("Tunez");
		label9.setText("Argelia");
		label10.setText("Marruecos");
		label11.setText("Mauritania");
		label12.setText("Mali");
		label13.setText("Niger");
		label14.setText("Chad");
		label15.setText("Sudan");
		
		panel2.add(label6);
		panel2.add(label7);
		panel2.add(label8);
		panel2.add(label9);
		panel2.add(label10);
		panel2.add(label11);
		panel2.add(label12);
		panel2.add(label13);
		panel2.add(label14);
		panel2.add(label15);
		
		//para el panel inferior "panel3", usamos etiquetas con GridLayout
		panel3.setLayout(new GridLayout(3,3));
		
		JLabel label16= new JLabel();
		JLabel label17= new JLabel();
		JLabel label18= new JLabel();
		JLabel label19= new JLabel();
		JLabel label20= new JLabel();
		JLabel label21= new JLabel();
		JLabel label22= new JLabel();
		JLabel label23= new JLabel();
		JLabel label24= new JLabel();
		
		label16.setText("Eritrea");
		label17.setText("Senegal");
		label18.setText("Gambia");
		label19.setText("Guinea Bisau");
		label20.setText("Guinea");
		label21.setText("Sierra Leona");
		label22.setText("Liberia");
		label23.setText("Costa de Marfil");
		label24.setText("Burkina Faso");
		
		panel3.add(label16);
		panel3.add(label17);
		panel3.add(label18);
		panel3.add(label19);
		panel3.add(label20);
		panel3.add(label21);
		panel3.add(label22);
		panel3.add(label23);
		panel3.add(label24);
		
		//para hacer visible al frame
		setLocationRelativeTo(null);//centra el frame si el argumento es null
		setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra por completo la ventana y no solo la minimiza
		setVisible(true);//permite que se muestre la ventana en la pantalla
	}
}
