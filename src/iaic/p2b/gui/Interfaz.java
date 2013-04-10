package iaic.p2b.gui;

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

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNombre;
	private JLabel lblSexo;
	private JLabel lblEdad;
	private JLabel lblAltura;
	private JLabel lblPeso;
	private JLabel lblNAmigos;
	private JLabel lblReligion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnCitar;
	private JCheckBox chckbxteCuestaHablar;
	private JCheckBox chckbxteGustaSalir;
	private JCheckBox chckbxtienesTwitter;
	private JCheckBox chckbxtienesFacebook;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

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
		
		lblNombre = new JLabel("Nombre");
		panel.add(lblNombre, "2, 2, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 2, fill, default");
		textField.setColumns(10);
		
		lblSexo = new JLabel("Sexo");
		panel.add(lblSexo, "2, 4, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 4, fill, default");
		textField_1.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		panel.add(lblEdad, "2, 6, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 6, fill, default");
		textField_2.setColumns(10);
		
		lblAltura = new JLabel("Altura");
		panel.add(lblAltura, "2, 8, right, default");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "4, 8, fill, default");
		textField_3.setColumns(10);
		
		lblPeso = new JLabel("Peso");
		panel.add(lblPeso, "2, 10, right, default");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "4, 10, fill, default");
		textField_4.setColumns(10);
		
		lblNAmigos = new JLabel("N\u00BA Amigos");
		panel.add(lblNAmigos, "2, 12, right, default");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "4, 12, fill, default");
		textField_5.setColumns(10);
		
		lblReligion = new JLabel("Religi\u00F3n");
		panel.add(lblReligion, "2, 14, right, default");
		
		textField_6 = new JTextField();
		panel.add(textField_6, "4, 14, fill, default");
		textField_6.setColumns(10);
		
		chckbxteCuestaHablar = new JCheckBox("\u00BFTe cuesta hablar?");
		panel.add(chckbxteCuestaHablar, "2, 16, 3, 1");
		
		chckbxteGustaSalir = new JCheckBox("\u00BFTe gusta salir?");
		panel.add(chckbxteGustaSalir, "2, 18, 3, 1");
		
		chckbxtienesTwitter = new JCheckBox("\u00BFTienes Twitter?");
		panel.add(chckbxtienesTwitter, "2, 20, 3, 1");
		
		chckbxtienesFacebook = new JCheckBox("\u00BFTienes Facebook?");
		panel.add(chckbxtienesFacebook, "2, 22, 3, 1");
		
		btnCitar = new JButton("Citar");
		panel.add(btnCitar, "2, 24, 3, 1");
		btnCitar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
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
