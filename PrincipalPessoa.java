package Atividade;

public class PrincipalPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criação de uma instância de PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica("Maria Silva Doida", "123.456.789-00");
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());

        // Criação de uma instância de PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ da Silva Sauro", "98.765.432/0001-00");
        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    } 
		 

}
