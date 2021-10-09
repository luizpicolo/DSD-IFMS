import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Desserializadora {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			ObjectInput object = new ObjectInputStream(new FileInputStream("objeto.teste"));
			Pessoa pessoa = (Pessoa) object.readObject();
			System.out.println(pessoa.getNome());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}