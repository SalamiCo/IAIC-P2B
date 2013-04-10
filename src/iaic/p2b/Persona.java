package iaic.p2b;

public final class Persona {
	
	private final String nombre;
	private final String sexo;
	private final int edad;
	private final int altura;
	private final int peso;
	private final String cuestaHablar;
	private final String gustaSalir;
	private final int numAmigos;
	private final String religion;
	private final String twitter;
	private final String facebook;
	
	public Persona (String n, String s, int e, int a, int p, String ch, String gs, int na, String r, String t, String f){
		nombre = n;
		sexo = s;
		edad = e;
		altura = a;
		peso = p;
		cuestaHablar = ch;
		gustaSalir = gs;
		numAmigos = na;
		religion = r;
		twitter = t;
		facebook = f;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public int getPeso() {
		return peso;
	}

	public String getCuestaHablar() {
		return cuestaHablar;
	}

	public String getGustaSalir() {
		return gustaSalir;
	}

	public int getNumAmigos() {
		return numAmigos;
	}

	public String getReligion() {
		return religion;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getFacebook() {
		return facebook;
	}

}
