import java.util.ArrayList;
import java.util.List;

public class Apostas {

    private List<Integer> numeros;
    Integer numero;

   public Apostas () {
    numeros = new ArrayList<> ();    
}
    public boolean adicionarNumero(Integer num) {
        for (int i = 1; i <=60 ; i++ ) {
        if (numero == num ) {
        }    return false;     

    } 
        numeros.add(num);
        return true;
    }
    public List<Integer> getNumeros() {
        return numeros;
    }
    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String toString() {
        return "Apostas [numeros=" + numeros + ", numero=" + numero + "]";
    }
	public boolean iniciarAposta() {
		return false;
	}
      
}
