public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		
		System.out.print("Candidado 1: ");
		analisarCandidato(1800.0);
		
		System.out.print("Candidado 2: ");
		analisarCandidato(2000.0);
		
		System.out.print("Candidado 3: ");
		analisarCandidato(2200.0);
	}
	
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

}
