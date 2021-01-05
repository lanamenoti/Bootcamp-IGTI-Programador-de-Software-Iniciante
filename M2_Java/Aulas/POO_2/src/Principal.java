
public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.modelo = "Modelo Tal";
		c1.nCavalos = 60;
		
		c1.setNPortas(4);
		System.out.println(c1.getNPortas());
		
		c1.setMarca("Renault");
		System.out.println(c1.getMarca());

	}

}
