package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class ConsultaDepartamentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDepartamentos frame = new ConsultaDepartamentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_primero = new JButton("Primero");
		btn_primero.setBounds(10, 198, 89, 23);
		contentPane.add(btn_primero);
		
		JButton btn_Anterior = new JButton("Anterior");
		btn_Anterior.setBounds(109, 198, 89, 23);
		contentPane.add(btn_Anterior);
		
		JButton btn_siguiente = new JButton("Siguiente");
		btn_siguiente.setBounds(209, 198, 89, 23);
		contentPane.add(btn_siguiente);
		
		JButton btn_ultimo = new JButton("Ultimo");
		btn_ultimo.setBounds(308, 198, 89, 23);
		contentPane.add(btn_ultimo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(209, 75, 89, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(209, 112, 159, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(209, 148, 159, 22);
		contentPane.add(textArea_2);
		
		JLabel lb_titulo = new JLabel("DATOS DE DEPARTAMENTOS");
		lb_titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb_titulo.setBounds(109, 23, 216, 23);
		contentPane.add(lb_titulo);
		
		JLabel lb_codDepartamento = new JLabel("C\u00F3digo Departamento:");
		lb_codDepartamento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb_codDepartamento.setBounds(36, 74, 151, 23);
		contentPane.add(lb_codDepartamento);
		
		JLabel lb_nombreDepartamento = new JLabel("Nombre Departamento:");
		lb_nombreDepartamento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb_nombreDepartamento.setBounds(36, 112, 162, 23);
		contentPane.add(lb_nombreDepartamento);
		
		JLabel lb_localidadDepartamento = new JLabel("Localidad Departamento:");
		lb_localidadDepartamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb_localidadDepartamento.setBounds(36, 147, 162, 23);
		contentPane.add(lb_localidadDepartamento);
	}
}
