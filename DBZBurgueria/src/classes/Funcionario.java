package classes;

public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, String sobrenome, String endereco, String cpf) {
        super(nome, sobrenome, endereco, cpf);

    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }


    @Override
    public String getEndereco() {
        return super.getEndereco();
    }


    @Override
    public String getNome() {
        return super.getNome();
    }


    @Override
    public String getSobrenome() {
        return super.getSobrenome();
    }


    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }


    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }


    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    @Override
    public void setSobrenome(String sobrenome) {
        super.setSobrenome(sobrenome);
    }

    
}
