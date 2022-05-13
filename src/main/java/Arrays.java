import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Console;

public class Arrays {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("qual a quantidade de alunos?");
        int next = Integer.parseInt(imput.nextLine());
        System.out.println("A quantidade de alunos é: " + next);
        System.out.println(next);

        List<Aluno> listAluno = new ArrayList<Aluno>();
        for (int i = 1; i <= next; i++) {

            System.out.println("Qual o nome do aluno?");
            String nome = imput.nextLine();
            System.out.println("Qual a nota do aluno?");
            double nota = Double.parseDouble(imput.nextLine());
            System.out.println("Qual a idade do aluno?");
            int idade =  Integer.parseInt(imput.nextLine());


            System.out.println("nome = " + nome);
            System.out.println("nota = " + nota);
            System.out.println("idade = " + idade);

            listAluno.add( new Aluno( nome, idade, nota ));
        }

        String maiorAluno = null;

        double maiorNota = 0;
        for (Aluno aluno : listAluno) {
            if (aluno.getNota() > maiorNota) {
                maiorNota = aluno.getNota();
                maiorAluno = aluno.getNome();

                System.out.println("\nmaiorNota = " + maiorNota);
                System.out.println("Aluno com maior nota = " + maiorAluno);

            }

        }

    }
}




