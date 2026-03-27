package atividadejava;

public class PessoaFutebol {
    private String nome;
    private int idade;
    private String time;

    public PessoaFutebol(String nome, int idade, String time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Time: " + time);
    }

    public void exercerFuncao() {
        System.out.println(nome + " exerce uma função no futebol.");
    }

    @Override
    public String toString() {
        return "PessoaFutebol{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", time='" + time + '\'' +
                '}';
    }
}