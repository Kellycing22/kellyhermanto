package latihan17mei2023;

import java.util.Scanner;
	
public class Menu {
	boolean exit;
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
	public void runMenu() {
		while(!exit) {
			printMenu();
			int choice = getInput;
			performMenu(choice);
		}
	}
	
	public void printMenu() {
		System.out.println("1. Insert Menu Baru");
		System.out.println("2. View Menu");
		System.out.println("3. Update Menu");
		System.out.println("4. Delete Menu");
		System.out.println("5. Exit");
	}
}
	
	private int getInput() {
		Scanner angka = new Scanner(System.in);
		int choice = 0;
		while(choice < 1 || choice > 5) {
			try {
				System.out.println("Silakan pilih Menu: ");
				choice = Integer.parseInt(angka.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("pilihan tidak valid. Silakan coba lagi");
			}
		}
		return choice;
	}
	
	private void performMenu(int choice) {
		switch(choice) {
		case 1:
			insertMenu();
			break;
		case 2:
			viewMenu();
		case 3:
			UpdateMenu();
			break;
		case 4:
			DeleteMenu();
		
	}
		
	public void insertMenu() {
		String kodeMenu = "";
		String namaMenu = "";
		integer hargaMenu = 0;
		Integer stokMenu = 0;
		System.out.println("Input kode Menu: ");
		kodeMenu = scan.nextLine();
		System.out.println("Input Nama Menu: ");
		namaMenu = scan.nextLine();
		System.out.println("Input harga Menu: ");
		hargaMenu = scan.nextint();
		scan.nextLine();
		System.out.println("Input stok Menu: ");
		stokMenu = scan.nextint();
		scan.nextLine();
		
	}
	
	public void viewMenu() {
		while(!NULL) {
			System.out.printf("%s%n",kodeMenu);
			System.out.printf("%s%n",namaMenu);
			System.out.printf("%d%n",hargaMenu);
			System.out.printf("%d%n",stokMenu);
		}
	}
	public void UpdateMenu() {
		viewMenu();
		System.out.printf("Pilih menu yang ingin diupdate: ");
		integer hargaMenu = 0;
		Integer stokMenu = 0;
		System.out.println("Input harga Menu: ");
		hargaMenu = scan.nextint();
		scan.nextLine();
		System.out.println("Input stok Menu: ");
		stokMenu = scan.nextint();
	}
	public void DeleteMenu() {
		
	}	
