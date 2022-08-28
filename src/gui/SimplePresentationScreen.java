package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField lu;
	private JTextField apellido;
	private JTextField nombre;
	private JTextField mail;
	private JTextField gitHubUrl;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(635, 282));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		
		lu = new JTextField();
		lu.setColumns(10);
		
		apellido = new JTextField();
		apellido.setColumns(10);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		
		mail = new JTextField();
		mail.setBackground(Color.WHITE);
		mail.setColumns(10);
		
		gitHubUrl = new JTextField();
		gitHubUrl.setColumns(10);
		
		lu.setText("" + studentData.getId());
		apellido.setText("" + studentData.getLastName());
		nombre.setText(studentData.getFirstName());
		mail.setText(studentData.getMail());
		gitHubUrl.setText(studentData.getGithubURL());
		
		JTextPane txtpnLu = new JTextPane();
		txtpnLu.setBackground(SystemColor.menu);
		txtpnLu.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnLu.setText("LU");
		
		JTextPane txtpnApellido = new JTextPane();
		txtpnApellido.setBackground(SystemColor.menu);
		txtpnApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnApellido.setText("Apellido");
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setBackground(SystemColor.menu);
		txtpnNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnNombre.setText("Nombre");
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setBackground(SystemColor.menu);
		txtpnEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnEmail.setText("E-mail");
		
		JTextPane txtpnGithubUrl = new JTextPane();
		txtpnGithubUrl.setBackground(SystemColor.menu);
		txtpnGithubUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnGithubUrl.setText("GitHub URL");
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(txtpnLu, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lu, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(txtpnApellido, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(apellido, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(txtpnNombre, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(nombre, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(txtpnEmail, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(mail, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(txtpnGithubUrl, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(gitHubUrl, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnLu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(apellido))
					.addGap(12)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnGithubUrl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gitHubUrl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		
		JTextPane txtFecha = new JTextPane();
		txtFecha.setBackground(SystemColor.menu);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtFecha)
						.addComponent(tabbedPane))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Imagen)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(Imagen, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		txtFecha.setText("Esta ventana fue generada " + dtf.format(LocalDateTime.now()) + " a las: "+ dtf2.format(LocalDateTime.now()));
		contentPane.setLayout(gl_contentPane);
	}
}
