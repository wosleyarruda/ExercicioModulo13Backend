package Atividade;

public class PessoaJuridica implements IPessoa {
	
    private String nome;
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Implementação dos métodos da interface
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e setter para CNPJ
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

