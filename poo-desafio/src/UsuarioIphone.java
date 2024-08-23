import java.util.Scanner;

import aparelho.iphone.Iphone;

public class UsuarioIphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		
		System.out.println("DIGITE O NOME DE UMA MUSICA");
		iphone.selecionarMusica(sc.nextLine());
		iphone.tocar();
		iphone.pausar();
		System.out.println();
		
		System.out.println("DIGITE O NUMERO PARA QUEM VOCE QUER FAZER UMA LIGAÇÃO");
		iphone.ligar(sc.nextLine());
		iphone.iniciarCorreioVoz();
		iphone.atender();
		System.out.println();
		
		iphone.adicionarNovaAba();
		System.out.println("DIGITE O LINK DA PAGINA");
		iphone.exibirPagina(sc.nextLine());
		iphone.atualizarPagina();
		
		sc.close();
    }
}
