package felipe.dcx.ufpb.br;

import java.io.Serializable;

public class Contato implements Serializable {

    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, int mesAniversario){
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", diaAniversario=" + diaAniversario +
                ", mesAniversario=" + mesAniversario +
                '}';
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }
}
