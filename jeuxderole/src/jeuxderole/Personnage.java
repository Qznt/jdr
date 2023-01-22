package jeuxderole;

public class Personnage {

	private String name;
	private int pv;
	private int pe;
	private int dodge;
	private int def;


	public Personnage(String name, int pv, int pe, int dodge, int def) {
		this.name = name;
		this.pv = pv;
		this.pe = pe;
		this.dodge = dodge;
		this.def = def;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPv() {
		return pv;
	}


	public void setPv(int pv) {
		this.pv = pv;
	}


	public int getPe() {
		return pe;
	}


	public void setPe(int pe) {
		this.pe = pe;
	}


	public int getDodge() {
		return dodge;
	}


	public void setDodge(int dodge) {
		this.dodge = dodge;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public String toString() {
		return "Personnage [name=" + name + ", pv=" + pv + ", pe=" + pe + ", dodge=" + dodge + ", def=" + def + "]";
	}






}