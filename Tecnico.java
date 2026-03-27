package atividadejava;

public class Tecnico extends PessoaFutebol {
    private String esquemaTatico;
    private int anosExperiencia;

    public Tecnico(String nome, int idade, String time, String esquemaTatico, int anosExperiencia) {
        super(nome, idade, time);
        this.esquemaTatico = esquemaTatico;
        this.anosExperiencia = anosExperiencia;
    }

    public String getEsquemaTatico() {
        return esquemaTatico;
    }

    public void setEsquemaTatico(String esquemaTatico) {
        this.esquemaTatico = esquemaTatico;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void orientarTime() {
        System.out.println(getNome() + " orienta o time com o esquema " + esquemaTatico + ".");
    }

    @Override
    public void exercerFuncao() {
        System.out.println(getNome() + " comanda o time com " + anosExperiencia + " anos de experiência.");
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", time='" + getTime() + '\'' +
                ", esquemaTatico='" + esquemaTatico + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}