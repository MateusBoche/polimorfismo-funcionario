package programa;

import entidades.Funcionarios;
import entidades.Tercerizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);


        List<Funcionarios>lista = new ArrayList<>();
        System.out.println("entra com o numero de funcionarios");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("funcionario " + i + " DATA:");
            System.out.println(("é tercerizado (s/n)?"));
            sc.nextLine();
            String ch = sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            double horas = sc.nextDouble();
            System.out.println("Valor por hora: ");
            double valorPorHoras = sc.nextDouble();

            if (ch.equals("s")){
                System.out.println("é tercerizado");
                System.out.print("Valor adicional:");
                double adicional = sc.nextDouble();
                Funcionarios funcionario = new Tercerizados(nome,horas,valorPorHoras,adicional);
                lista.add(funcionario);
            }else{
                lista.add(new Funcionarios(nome,horas,valorPorHoras));
            }

            System.out.println();
            System.out.println("Pamaentos");

            for(Funcionarios funcionarios:lista){
                System.out.println(funcionarios.getNome()+ " $"+ funcionarios.pagamento());
            }
            
        }
    }
}
