//outra classe
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializadora {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pessoa s = new Pessoa();
		s.setNome("Luiz Picolo");
		try {
			ObjectOutput o = new ObjectOutputStream(new FileOutputStream("objeto.teste"));
			o.writeObject(s);
			System.out.println("Objeto Serializado");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}