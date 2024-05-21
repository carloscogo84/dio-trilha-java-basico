package escola;

public class Escola {
    public static void main(String[] args) {
        //Criando o objeto
        Aluno aluno = new Aluno();

        //Definindo os valores dos atributos do objeto
        aluno.setNome("Carlos");
        aluno.setIdade(40);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");

        Aluno aluno2 = new Aluno();

        aluno2.setNome("Karen");
        aluno2.setIdade(34);
        aluno2.setSexo("F");

        System.out.println(aluno2.getNome() + ", sexo " + aluno2.getSexo() + " tem " + aluno2.getIdade() + " anos");




    }   
}
