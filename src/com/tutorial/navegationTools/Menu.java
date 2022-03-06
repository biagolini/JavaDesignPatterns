package com.tutorial.navegationTools;

import com.tutorial.patterns.Patterns;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    OptionsMenu optionsMenu = new OptionsMenu();

    Patterns patterns = new Patterns();

    public void menu() {
        Integer[] naveMenu = {3, 0};

        do {
            naveMenu[0] = this.firstMenu();
            this.secondMenu(naveMenu);

        } while (naveMenu[0] != 3);
        System.out.println("\033[3m Obrigado por utilizar nosso software, até logo \033[0m");

    }


    private Integer firstMenu() {
        System.out.println("-----------------------------------------------------------------------".replace('-', '\u2500'));
        System.out.println("\033[3mDigite o número correspondente a classificação do padrão desejado:\033[0m");
        for (int i = 0; i < optionsMenu.getFristMenu().length; i++) {
            System.out.printf("\t" + i + ". " + optionsMenu.getFristMenu()[i] + ".\n");
        }
        System.out.println("-----------------------------------------------------------------------".replace('-', '\u2500'));
        Integer menu1 = scanner.nextInt();
        scanner.nextLine();
        return menu1;
    }

    private void secondMenu(Integer[] naveMenu) {
        String[] options = new String[]{""};

        if (naveMenu[0] >= 0 && naveMenu[0] <= 2) {
            switch (naveMenu[0]) {
                case 0:
                    options = optionsMenu.getCreational();
                    break;
                case 1:
                    options = optionsMenu.getStructural();
                    break;
                case 2:
                    options = optionsMenu.getBehavioral();
                    break;
                default:
                    System.out.printf("ERRO INTERNO;\n");
            }
            System.out.println("-----------------------------------------------------------------------".replace('-', '\u2500'));
            System.out.println("\033[3mDigite o número correspondente ao padrão desejado:\033[0m");

            for (int i = 0; i < options.length; i++) {
                System.out.printf("\t" + i + ". " + options[i] + ".\n");
            }
            System.out.println("-----------------------------------------------------------------------".replace('-', '\u2500'));
            naveMenu[1] = scanner.nextInt();
            scanner.nextLine();
            if (naveMenu[1] >= 0 && naveMenu[1] < options.length) {
                patterns.runTestePattern(naveMenu);

                System.out.printf("\033[0;1m" + "\n\n\033[3mPressione ENTER para reiniciar\033[0m");
                scanner.nextLine();
            } else {
                System.out.println("\033[3mOPÇÃO INVÁLIDA\033[0m");
            }

        } else if (naveMenu[0] != 3) {
            System.out.println("\033[3mOPÇÃO INVÁLIDA\033[0m");
        }
    }

}