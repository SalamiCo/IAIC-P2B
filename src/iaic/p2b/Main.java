package iaic.p2b;

import iaic.p2b.gui.Interfaz;

import java.util.Iterator;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import jess.Deffacts;
import jess.Fact;
import jess.JessException;
import jess.RU;
import jess.Rete;
import jess.Value;

public class Main {
    
    private static Rete miRete;
    
    // Nombre del archivo .clp que contiene el c�digo Jess
    private static String archivoJess;
    
    public static void cargaPrograma (final String nombre) {
        try {
            Value v = miRete.batch(nombre);
            
            System.out.println("Value " + v);
        } catch (JessException je0) {
            System.out.println("Error de lectura en " + nombre);
            je0.printStackTrace();
        }
    }
    
    public static void citar (final Persona persona) throws JessException {
        // Comprobamos que usuario no existe ya
        Iterator<Fact> it = miRete.listFacts();
        while (it.hasNext()) {
            Fact f = it.next();
            if (f.getName().equals("MAIN::persona") && f.getSlotValue("nombre").equals(persona.getNombre())) {
                throw new RuntimeException("Ya existe ese usuario en la BdC");
            }
        }
        
        Deffacts deffacts = new Deffacts("usuarios", null, miRete);
        Fact f = new Fact("persona", miRete);
        f.setSlotValue("nombre", new Value(persona.getNombre(), RU.SYMBOL));
        f.setSlotValue("sexo", new Value(persona.getSexo(), RU.SYMBOL));
        f.setSlotValue("edad", new Value(persona.getEdad(), RU.INTEGER));
        f.setSlotValue("altura", new Value(persona.getAltura(), RU.INTEGER));
        f.setSlotValue("peso", new Value(persona.getPeso(), RU.INTEGER));
        f.setSlotValue("cuestaHablar", new Value(persona.getCuestaHablar(), RU.SYMBOL));
        f.setSlotValue("gustaSalir", new Value(persona.getGustaSalir(), RU.SYMBOL));
        f.setSlotValue("numAmigos", new Value(persona.getNumAmigos(), RU.INTEGER));
        f.setSlotValue("religion", new Value(persona.getReligion(), RU.SYMBOL));
        f.setSlotValue("twitter", new Value(persona.getTwitter(), RU.SYMBOL));
        f.setSlotValue("facebook", new Value(persona.getFacebook(), RU.SYMBOL));
        deffacts.addFact(f);
        miRete.addDeffacts(deffacts);
        
        miRete.reset();
        
        miRete.setFocus("clasificar");
        miRete.run();
        
        miRete.setFocus("compatibilizar");
        miRete.run();
        
        miRete.setFocus("citar");
        miRete.run();
        
        // Depuración
        miRete.setFocus("mostrar");
        miRete.run();
        
        miRete.halt();
    }
    
    public static DefaultTableModel mostrarCitas (final Persona persona) throws JessException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo de cita");
        
        Object[] datosFila = new Object[2];
        
        @SuppressWarnings("unchecked")
        Iterator<Fact> it = miRete.listFacts();
        
        while (it.hasNext()) {
            Fact f = it.next();
            if (f.getName().equals("MAIN::emparejamiento")) {
                
                String tipoCita = "?";
                if (f.getSlotValue("tipoCita").stringValue(miRete.getGlobalContext()).equals("sinCita")) {
                    tipoCita = "Compatibles";
                } else if (f.getSlotValue("tipoCita").stringValue(miRete.getGlobalContext()).equals("citaNormal")) {
                    tipoCita = "Cita normal";
                } else if (f.getSlotValue("tipoCita").stringValue(miRete.getGlobalContext()).equals("citaMagica")) {
                    tipoCita = "Cita m�gica";
                }
                
                String nombre1 = f.getSlotValue("nombre1").stringValue(miRete.getGlobalContext());
                String nombre2 = f.getSlotValue("nombre2").stringValue(miRete.getGlobalContext());
                
                if (nombre1.equals(persona.getNombre())) {
                    datosFila[0] = nombre2;
                    datosFila[1] = tipoCita;
                    modelo.addRow(datosFila);
                    
                } else if (nombre2.equals(persona.getNombre())) {
                    datosFila[0] = nombre1;
                    datosFila[1] = tipoCita;
                    modelo.addRow(datosFila);
                }
            }
        }
        
        return modelo;
    }
    
    public static void main (final String[] args) {
        miRete = new Rete();
        archivoJess = "jess.clp";
        cargaPrograma(archivoJess);
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run () {
                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
            }
            
        });
    }
    
}
