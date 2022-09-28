import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void menuTrem() {
        for (;;) {
            System.out.println("Bem vindo ao menu do sistema de trens.");
            System.out.println("1. Criar trem.");
            System.out.println("2. Editar trem.");
            System.out.println("3. Listar trens criados.");
            System.out.println("4. Desfazer trem.");
            System.out.println("5. Fim.");
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Para criar um trem, indique o identificador dele: ");
                    int identificadorTrem = sc.nextInt();
                    Trem t = new Trem(identificadorTrem, null);
                    System.out.println("***Lista de locomotivas na garagem***");

                    continue;
                case 2:
                    // Editar trem
                    continue;
                case 3:
                    // Listar trens criados
                    Patio.imprimeTrensCriados();
                    continue;
                case 4:
                    // Desfazer trem
                    continue;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
            break;
        }

    }
}
