package org.control;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" \n --MENU INICIAL--");
            System.out.println("[1] Novo   \n[2] Listar Produtos");
            System.out.println("[3] Remover Produtos  \n[4] Entrada Estoque");
            System.out.println("[5] Saída Estoque  \n[0] Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do medicamento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Apresentação do medicamento: ");
                    String apresentacao = scanner.nextLine();
                    System.out.print("Concentração do medicamento: ");
                    String concentracao = scanner.nextLine();
                    System.out.print("Laboratório/Fabricante: ");
                    String laboratorio = scanner.nextLine();
                    System.out.print("Preço do medicamento: ");
                    double preco = scanner.nextDouble();
                    Medicamento medicamento = new Medicamento(nome, preco, concentracao,
                            apresentacao, laboratorio);
                    estoque.adicionarMedicamento(medicamento);
                    System.out.println("Medicamento adicionado com sucesso.");
                    break;
                case 2:
                    estoque.listarMedicamentos();
                    break;
                case 3:
                    System.out.print("Nome do medicamento a remover: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerMedicamento(nomeRemover);
                    break;
                case 4:
                    System.out.print("Nome do medicamento: ");
                    String nomeEntrada = scanner.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int quantidadeEntrada = scanner.nextInt();
                    estoque.entradaEstoque(nomeEntrada, quantidadeEntrada);
                    break;
                case 5:
                    System.out.print("Nome do medicamento: ");
                    String nomeSaida = scanner.nextLine();
                    System.out.print("Quantidade a remover: ");
                    int quantidadeSaida = scanner.nextInt();
                    estoque.saidaEstoque(nomeSaida, quantidadeSaida);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}