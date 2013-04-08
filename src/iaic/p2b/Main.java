package iaic.p2b;

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
	
	public Main(){
		miRete = new Rete();
		archivoJess = "jess.clp";
		cargaPrograma(archivoJess);
	}
	
	public static void cargaPrograma(String nombre) {
		try {
			Value v = miRete.batch(nombre);

			System.out.println("Value " + v);
		} catch (JessException je0) {
			System.out.println("Error de lectura en " + nombre);
			je0.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws JessException {
		Main programa = new Main();
		
		Deffacts deffacts = new Deffacts("usuarios", null, miRete);
		Fact f = new Fact("persona", miRete);
		f.setSlotValue("nombre", new Value("Pene", RU.SYMBOL));
		f.setSlotValue("sexo", new Value("hombre", RU.SYMBOL));
		f.setSlotValue("edad", new Value(20, RU.NUMBER));
		f.setSlotValue("altura", new Value(20, RU.NUMBER));
		f.setSlotValue("peso", new Value(20, RU.NUMBER));
		f.setSlotValue("cuestaHablar", new Value("FALSE", RU.SYMBOL));
		f.setSlotValue("gustaSalir", new Value("TRUE", RU.SYMBOL));
		f.setSlotValue("numAmigos", new Value(20, RU.NUMBER));
		f.setSlotValue("religion", new Value("ateo", RU.SYMBOL));
		f.setSlotValue("twitter", new Value("TRUE", RU.SYMBOL));
		f.setSlotValue("facebook", new Value("TRUE", RU.SYMBOL));
		deffacts.addFact(f);
		miRete.addDeffacts(deffacts);
		
		miRete.reset();
		
		miRete.setFocus("clasificar");
		miRete.run();
		miRete.setFocus("compatibilizar");
		miRete.run();
		miRete.setFocus("citar");
		miRete.run();
		miRete.setFocus("mostrar");
		miRete.run();
		
		miRete.halt();
	}

}
