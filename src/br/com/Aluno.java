
package br.com;

public class Aluno {

//--------- ATRIBUTOS -----------//
    private String Nome, Cpf, Historico;
    
    
//--------- METODOS -------------//    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getHistorico() {
        return Historico;
    }

    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }

    @Override
    public String toString() {
        return "\n Nome: "+this.getNome()+"\n CPF: "+this.getCpf()+"\n Historico: "+this.getHistorico();
    }
    
    
    
}
