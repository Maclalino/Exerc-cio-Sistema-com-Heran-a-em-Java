package atividadejava;



public class Jogador extends PessoaFutebol {
    private String posicao;
    private int numeroCamisa;

    public Jogador(String nome, int idade, String time, String posicao, int numeroCamisa) {
        super(nome, idade, time);
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void treinar() {
        System.out.println(getNome() + " está treinando como " + posicao + ".");
    }

    @Override
    public void exercerFuncao() {
        System.out.println(getNome() + " joga como " + posicao + " usando a camisa " + numeroCamisa + ".");
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", time='" + getTime() + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                '}';
    }
}