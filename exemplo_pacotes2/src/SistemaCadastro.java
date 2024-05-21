public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        //Criando objeto
        Pessoa pessoa = new Pessoa("0899-090", "Pedro");

        //definindo valores
        pessoa.setEndereco("Rua das Marias");

        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());


    }
}
