package iaic.p2b.gui;

import iaic.p2b.Main;
import iaic.p2b.Persona;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class Interfaz extends JFrame {
    
    private JPanel contentPane;
    
    private JLabel labelNombre;
    
    private JLabel labelSexo;
    
    private JLabel labelEdad;
    
    private JLabel labelAltura;
    
    private JLabel labelPeso;
    
    private JLabel labelNumAmigos;
    
    private JLabel labelReligion;
    
    private JTextField textFieldNombre;
    
    private JTextField textFieldEdad;
    
    private JTextField textFieldAltura;
    
    private JTextField textFieldPeso;
    
    private JTextField textFieldNumAmigos;
    
    private JButton botonCitar;
    
    private JCheckBox checkboxCuestaHablar;
    
    private JCheckBox checkboxGustaSalir;
    
    private JCheckBox checkboxTwitter;
    
    private JCheckBox checkboxFacebook;
    
    private JScrollPane scrollPane;
    
    private JComboBox<String> comboBoxSexo;
    
    private JComboBox<String> comboBoxReligion;
    
    private JTable table;
    
    private DefaultTableModel modelo;
    
    private Persona persona;
    
    /**
     * Create the frame.
     */
    public Interfaz () {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IAIC-P2B");
        setBounds(100, 100, 502, 389);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.WEST);
        contentPane.setPreferredSize(new Dimension(480, 380));
        panel.setLayout(new FormLayout(new ColumnSpec[] {
            FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
            ColumnSpec.decode("default:grow"),}, new RowSpec[] {
            FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
            FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
            FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
            FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
            FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
            FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
            FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
            FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
            FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,}));
        
        labelNombre = new JLabel("Nombre");
        panel.add(labelNombre, "2, 2, right, default");
        
        textFieldNombre = new JTextField();
        panel.add(textFieldNombre, "4, 2, fill, default");
        textFieldNombre.setColumns(10);
        
        labelSexo = new JLabel("Sexo");
        panel.add(labelSexo, "2, 4, right, default");
        
        String[] arraySexo = {"hombre", "mujer"};
        comboBoxSexo = new JComboBox<String>(arraySexo);
        panel.add(comboBoxSexo, "4, 4, fill, default");
        
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
        
        String[] arrayReligion = {"ateo", "cristiano", "judio"};
        comboBoxReligion = new JComboBox<String>(arrayReligion);
        panel.add(comboBoxReligion, "4, 14, fill, default");
        
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
        
        scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.EAST);
        scrollPane.setPreferredSize(new Dimension(250, 300));
        
        table = new JTable();
        scrollPane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo de cita");
        table.setModel(modelo);
        
        botonCitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (final ActionEvent arg0) {
                if (validarCampos()) {
                    
                    String nombre = textFieldNombre.getText();
                    String sexo = comboBoxSexo.getSelectedItem().toString();
                    int edad = Integer.parseInt(textFieldEdad.getText());
                    int altura = Integer.parseInt(textFieldAltura.getText());
                    int peso = Integer.parseInt(textFieldPeso.getText());
                    int numAmigos = Integer.parseInt(textFieldNumAmigos.getText());
                    String religion = comboBoxReligion.getSelectedItem().toString();
                    String cuestaHablar = (checkboxCuestaHablar.isSelected() ? "TRUE" : "FALSE");
                    String gustaSalir = (checkboxGustaSalir.isSelected() ? "TRUE" : "FALSE");
                    String twitter = (checkboxTwitter.isSelected() ? "TRUE" : "FALSE");
                    String facebook = (checkboxFacebook.isSelected() ? "TRUE" : "FALSE");
                    
                    persona =
                        new Persona(
                            nombre, sexo, edad, altura, peso, cuestaHablar, gustaSalir, numAmigos, religion, twitter,
                            facebook);
                    
                    try {
                        Main.citar(persona);
                        table.setModel(Main.mostrarCitas(persona));
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(
                            Interfaz.this, "Error al citar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
                }
            }
        });
        
        pack();
    }
    
    private boolean validarCampos () {
        boolean correct = true;
        List<String> fields = new ArrayList<String>(4);
        
        if (!textFieldEdad.getText().matches("\\d+")) {
            correct = false;
            fields.add("edad");
        }
        if (!textFieldAltura.getText().matches("\\d+")) {
            correct = false;
            fields.add("altura");
        }
        if (!textFieldPeso.getText().matches("\\d+")) {
            correct = false;
            fields.add("peso");
        }
        if (!textFieldNumAmigos.getText().matches("\\d+")) {
            correct = false;
            fields.add("amigos");
        }
        
        if (!correct) {
            StringBuilder sb = new StringBuilder("Los siguientes campos son inválidos: ");
            
            boolean init = true;
            for (String field : fields) {
                if (!init) {
                    sb.append(", ");
                } else {
                    init = false;
                }
                sb.append(field);
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
        
        return correct;
    }
}
