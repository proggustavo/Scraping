package view;

import java.util.Scanner;

import scraping.ProductScraping;

public class SearchMenu {

	Scanner teclado = new Scanner(System.in);

	private static final int OPTION_GENERAL_SEARCH = 1;
	private static final int OPTION_SPECIFIC_SITE_SEARCH = 2;
	private static final int OPTION_EXIT = 9;

	public void showMenu() {
		int opcao = this.showMenuOptions();

		while (opcao != OPTION_EXIT) {
			switch (opcao) {
			case OPTION_GENERAL_SEARCH:
				this.menuGeneralSearch();
				break;

			case OPTION_SPECIFIC_SITE_SEARCH:
				this.menuSpecificSearch();
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			opcao = this.showMenuOptions();
			
		}
	}

	private int showMenuOptions() {
		System.out.println("-----------------------------------------------");
		System.out.println(">> Sistema Scraping Produto - Tela de Opções <<");
		System.out.println("-----------------------------------------------");
		System.out.println(OPTION_GENERAL_SEARCH + " - Pesquisa geral");
		System.out.println(OPTION_SPECIFIC_SITE_SEARCH + " - Pesquisa específica");
		System.out.println(OPTION_EXIT + " - Sair");
		System.out.print("Digite a opção: ");
		return Integer.parseInt(teclado.nextLine());

	}

	private void menuGeneralSearch() {
		ProductScraping scraping = new ProductScraping();

		System.out.println("-----------------------------------------------");
		System.out.println(">> Sistema Scraping Produto - Pesquisa Geral <<");
		System.out.println("-----------------------------------------------");
		System.out.println("Digite o nome do produto pesquisado: ");
		System.out.println("Inclua marca e modelo para uma pesquisa mais específica");
		System.out.print("Digite a opção: ");
		String searchText = teclado.nextLine();
		
		scraping.generalSearchProduct(searchText);

	}
	private void menuSpecificSearch() {
		
		
	}

	

}
