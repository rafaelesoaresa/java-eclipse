package planetaView;

import java.util.List;
import java.util.Scanner;

import main.Planeta;
import planetaController.PlanetaController;

public class PlanetaView {
	private PlanetaController planetaController;

    public PlanetaView() {
        planetaController = new PlanetaController();
    }

    public void displayMenu() {
        Scanner scanne = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar Planeta");
            System.out.println("2. Listar Planetas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanne.nextInt();
            scanne.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do planeta: ");
                    String name = scanner.nextLine();
                    planetaController.addPlanet(name);
                    break;
                case 2:
                    List<Planeta> planetas = planetaController.getAllPlanets();
                    System.out.println("Planetas cadastrados:");
				Planeta[] planeta = null;
				for (Planeta planeta1 : planeta) {
                        System.out.println(planeta1.getName());
                    }
                    break;
                case 3:
                    System.out.println("Saindo da aplica��o.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Op��o inv�lida.");
            }
        }
    }

    public static void main(String[] args) {
        PlanetaView planetaView = new PlanetaView();
        planetaView.displayMenu();
    }

	public PlanetaController getPlanetController() {
		return planetaController;
	}

	public void setPlanetController(PlanetaController planetController) {
		this.planetaController = planetController;
	}
}

