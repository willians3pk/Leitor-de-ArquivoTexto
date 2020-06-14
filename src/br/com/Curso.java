
package br.com;

import java.util.ArrayList;

public class Curso {
    
//-------- ATRIBUTOS ---------//
    private String Nome;
    private ArrayList<Aluno> Aluno;
//-------- METODOS -----------//

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Aluno> getAluno() {
        return Aluno;
    }

    public void setAluno(ArrayList<Aluno> Aluno) {
        this.Aluno = Aluno;
    }
    
}
