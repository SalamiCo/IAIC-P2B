package iaic.p2b.gui;

import iaic.p2b.Main;
import iaic.p2b.Persona;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import jess.JessException;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel labelNombre;
	private JLabel labelSexo;
	private JLabel labelEdad;
	private JLabel labelAltura;
	private JLabel labelPeso;
	private JLabel labelNumAmigos;
	private JLabel labelReligion;
	private JTextField textFieldNombre;
	private JTextField textFieldSexo;
	private JTextField textFieldEdad;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textFieldNumAmigos;
	private JTextField textFieldReligion;
	private JButton botonCitar;
	private JCheckBox checkboxCuestaHablar;
	private JCheckBox checkboxGustaSalir;
	private JCheckBox checkboxTwitter;
	private JCheckBox checkboxFacebook;
	
	private Persona persona;

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		labelNombre = new JLabel("Nombre");
		panel.add(labelNombre, "2, 2, right, default");
		
		textFieldNombre = new JTextField();
		panel.add(textFieldNombre, "4, 2, fill, default");
		textFieldNombre.setColumns(10);
		
		labelSexo = new JLabel("Sexo");
		panel.add(labelSexo, "2, 4, right, default");
		
		textFieldSexo = new JTextField();
		panel.add(textFieldSexo, "4, 4, fill, default");
		textFieldSexo.setColumns(10);
		
		labelEdad = new JLabel("Edad");
		panel.add(labelEdad, "2, 6, right, default");
		
		textFieldEdad = new JTextField();
		panel.add(textFieldEdad, "4, 6, fill, default");
		textFieldEdad.setColumns(10);
		
		labelAltura = new JLabel("Altura");
		panel.add(labelAltura, "2, 8, right, default");
		
		textFieldAltura = new JTextField();
		panel.add(textFieldAltura, "4, 8, fill, default");
		textFieldAltura.setColumns(10);
		
		labelPeso = new JLabel("Peso");
		panel.add(labelPeso, "2, 10, right, default");
		
		textFieldPeso = new JTextField();
		panel.add(textFieldPeso, "4, 10, fill, default");
		textFieldPeso.setColumns(10);
		
		labelNumAmigos = new JLabel("N\u00BA Amigos");
		panel.add(labelNumAmigos, "2, 12, right, default");
		
		textFieldNumAmigos = new JTextField();
		panel.add(textFieldNumAmigos, "4, 12, fill, default");
		textFieldNumAmigos.setColumns(10);
		
		labelReligion = new JLabel("Religi\u00F3n");
		panel.add(labelReligion, "2, 14, right, default");
		
		textFieldReligion = new JTextField();
		panel.add(textFieldReligion, "4, 14, fill, default");
		textFieldReligion.setColumns(10);
		
		checkboxCuestaHablar = new JCheckBox("\u00BFTe cuesta hablar?");
		panel.add(checkboxCuestaHablar, "2, 16, 3, 1");
		
		checkboxGustaSalir = new JCheckBox("\u00BFTe gusta salir?");
		panel.add(checkboxGustaSalir, "2, 18, 3, 1");
		
		checkboxTwitter = new JCheckBox("\u00BFTienes Twitter?");
		panel.add(checkboxTwitter, "2, 20, 3, 1");
		
		checkboxFacebook = new JCheckBox("\u00BFTienes Facebook?");
		panel.add(checkboxFacebook, "2, 22, 3, 1");
		
		botonCitar = new JButton("Citar");
		panel.add(botonCitar, "2, 24, 3, 1");
		botonCitar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nombre = textFieldNombre.getText();
				String sexo = textFieldSexo.getText();
				int edad = Integer.parseInt(textFieldEdad.getText());
				int altura = Integer.parseInt(textFieldAltura.getText());
				int peso = Integer.parseInt(textFieldPeso.getText());
				int numAmigos = Integer.parseInt(textFieldNumAmigos.getText());
				String religion = textFieldReligion.getText();
				String cuestaHablar = (checkboxCuestaHablar.isSelected() ? "TRUE" : "FALSE" );
				String gustaSalir = (checkboxGustaSalir.isSelected() ? "TRUE" : "FALSE" );
				String twitter = (checkboxTwitter.isSelected() ? "TRUE" : "FALSE" );
				String facebook = (checkboxFacebook.isSelected() ? "TRUE" : "FALSE" );
				
				persona = new Persona(nombre, sexo, edad, altura, peso, cuestaHablar, gustaSalir, numAmigos, religion, twitter, facebook);
				
				try {
					Main.citar(persona);
				} catch (JessException e) {
					System.out.println("Error al citar");
					e.printStackTrace();
				}
			}
		});
		
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Tipo de cita"
			}
		));
		table.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		contentPane.add(table, BorderLayout.EAST);
		
		pack();
	}
	
}
