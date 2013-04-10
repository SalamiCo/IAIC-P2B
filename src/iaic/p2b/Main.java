package iaic.p2b;

import iaic.p2b.gui.Interfaz;

import java.util.Iterator;

import jess.Deffacts;
import jess.Fact;
import jess.JessException;
import jess.RU;
import jess.Rete;
import jess.Value;

public class Main {

	private static Rete miRete;
	
	//Nombre del archivo .clp que contiene el código Jess
	private static String archivoJess;
	
	public static void cargaPrograma(String nombre) {
		try {
			Value v = miRete.batch(nombre);

			System.out.println("Value " + v);
		} catch (JessException je0) {
			System.out.println("Error de lectura en " + nombre);
			je0.printStackTrace();
		}
	}
	
	public static void run(){
		try{
			miRete.run();
		} catch (JessException je) {
			System.out.println("Error al ejecutar el modulo");
			je.printStackTrace();
		}
	}
	
	public static void reset(){
		try{
			miRete.reset();
		} catch (JessException je) {
			System.out.println("Error al hacer reset");
			je.printStackTrace();
		}
	}
	
	public static void halt(){
		try{
			miRete.halt();
		} catch (JessException je) {
			System.out.println("Error al hacer halt");
			je.printStackTrace();
		}
	}
	
	public static void citar(Persona persona) throws JessException {
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
		
		reset();
		
		miRete.setFocus("clasificar");
		run();
		miRete.setFocus("compatibilizar");
		run();
		miRete.setFocus("citar");
		run();
		miRete.setFocus("mostrar");
		run();
		
		halt();
	}
	
	public static void mostrarCitas(Persona persona) {
		Iterator iterador = miRete.listFacts();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
	
	public static void main(String[] args) {
		miRete = new Rete();
		archivoJess = "jess.clp";
		cargaPrograma(archivoJess);

		Interfaz interfaz = new Interfaz();
		interfaz.setVisible(true);
	}

}
