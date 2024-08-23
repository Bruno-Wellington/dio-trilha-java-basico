package aparelho.iphone;

import aparelho.funcionalidade.AparelhoTelefonico;
import aparelho.funcionalidade.NavegadorInternet;
import aparelho.funcionalidade.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void selecionarMusica(String musica) {
		System.out.println("MUSICA [ " + musica + " ] SELECIONADA NO IPHONE");
		
	}
	
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO IPHONE");
	}

	public void pausar() {
		System.out.println("PAUSANDO MUSICA NO IPHONE");
		
	}

	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NUMERO " + numero + " PELO IPHONE");
		
	}

	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO NO IPHONE");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
		
	}

	public void exibirPagina(String url) {
		System.out.println("EXIBINDO A PAGINA " + url + " NO IPHONE");
		
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA DO NAVEGADOR NO IPHONE");
		
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA NO IPHONE");
		
	}
    
}
