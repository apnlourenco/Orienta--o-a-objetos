import java.util.ArrayList;
import java.util.stream.Collectors;

public class Gerenciador {
    
    
    private Sorteio sorteio;
    private Aposta aposta1;
    private ArrayList<Aposta> apostas;

    public Gerenciador() {
        sorteio = new Sorteio();
        apostas = new ArrayList<>();
    }

    public boolean iniciarAposta() {
        if (aposta1 != null) {
            return false;
        }

        aposta1 = new Aposta();
        return true;
    }

    public boolean adicionarNumero(Integer numero) {
        if (aposta1 == null) {
            return false;
        }

        return aposta1.adicionarNumero(numero);
    }

    public boolean encerarAposta() {
        if (aposta1 == null) {
            return false;
        }

        if (!aposta1.ehValido()) {
            return false;
        }

        apostas.add(aposta1);
        aposta1 = null;
        return true;
    }

    public String mostrarApostas() {
        return apostas.stream()
                .map(aposta -> aposta.getNumeros().toString())
                .collect(Collectors.joining("\n"));
    }

    public boolean realizarSorteio() {
        return sorteio.sortear();
    }

    public String verResultados() {
        Integer[] numerosSorteados = sorteio.getNumeros();

        String resultado = "";
        for (Aposta aposta : apostas) {
            int acertos = 0;

            for (int numero : apostas.getNumeros()) {
                if (verJogos.length) {
                    acertos++;
                }
            }

            resultado += aposta.getNumeros() + " acertos: " + acertos + "\n";
        }

        return resultado;
    }
}


