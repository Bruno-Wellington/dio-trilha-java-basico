import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();

	}

	static void selecaoCandidatos(){
		String [] candidatos = {"ERIVALDO","BRUNO","PATRICIA","EDUARDO","SUAN","RENATO","CLARA","JOSE","SAMANTA","LUCAS"};
		int candidatosSelecionados = 0;
		double salarioBase = 2000.0;

		int candidatoAtual = 0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.printf("O candidato " + candidato + " pretende ter o salario de R$ %.2f \n", salarioPretendido);
			if(salarioBase >= salarioPretendido){
				System.out.println("Candidato " + candidato + ", foi selecionado para a vaga \n");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}

	static double valorPretendido(){
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	/* 
	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
			
		}else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
			
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
			
		}
	}
	*/

	

}
