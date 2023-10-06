import java.util.ArrayList;

public class Aposta {

    private ArrayList<Aposta> apostas;
    private ArrayList<Integer> numeros;

    public Aposta() {
        apostas = new ArrayList<>();
        numeros = new ArrayList<>();
    }

    public boolean adicionarNumero(Integer num) {
        if (num > 0 && num < 60 && numeros.size() < 6 && !numeros.contains(num)) {
            numeros.add(num);
            return true;
        }
        return false;
    }

    public boolean ehValido() {
        if (numeros.size() != 6) {
            return false;
        }

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean iniciarAposta(ArrayList<Aposta> aposta, Aposta nova) {
        return aposta.add (nova);
    }

    public char[] verJogos() {
        return null;
    }

    public char[] verResultdos() {
        return null;
    }

	public Object getNumeros() {
		return null;
	}

    
    

}
