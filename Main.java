package atividadejava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instanciando os objetos
        Jogador jogador1 = new Jogador("Neymar", 32, "Santos", "Atacante", 10);
        Jogador jogador2 = new Jogador("Cássio", 37, "Cruzeiro", "Goleiro", 1);
        Tecnico tecnico1 = new Tecnico("Abel Ferreira", 47, "Palmeiras", "4-3-3", 15);

        // Exibindo os objetos criados
        System.out.println("\n=== OBJETOS CRIADOS ===");
        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(tecnico1);

        // Chamando métodos específicos
        System.out.println("\n=== MÉTODOS ESPECÍFICOS ===");
        jogador1.treinar();
        jogador2.treinar();
        tecnico1.orientarTime();

        // Polimorfismo - utilizando a superclasse para referenciar as subclasses
        System.out.println("\n=== POLIMORFISMO ===");
        List<PessoaFutebol> pessoas = new ArrayList<>();
        pessoas.add(jogador1);
        pessoas.add(jogador2);
        pessoas.add(tecnico1);

        for (PessoaFutebol pessoa : pessoas) {
            pessoa.apresentar();
            pessoa.exercerFuncao();
            System.out.println();
        }
    }
}