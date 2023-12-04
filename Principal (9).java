
public class Principal {
	
	public static void main(String[] args) {
		
		Empregado p1 = new Empregado("648941", "Henrique", "Delegrego", 2400);
		Empregado p2 = new Empregado("85418541", "Maju", "Testoni", 2500);
		
		System.out.println(p1.salarioAnual());
		System.out.println(p2.nomeCompleto());
		p1.aumentarSalario(10);
		System.out.println(p1.getSalario());
		
		
		double maiorSalario = Integer.MIN_VALUE;
		String strMaisSalario = "";
		
		for(Empregado e: Empregado.listaEmpregados) {
			if(e.getSalario() > maiorSalario) {
				maiorSalario = e.getSalario();
				strMaisSalario = e.toString();
			}
		}
		System.out.println("O empregado com maior salário é o: " + strMaisSalario);
		
	}

}
