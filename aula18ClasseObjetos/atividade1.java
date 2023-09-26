package aula18ClasseObjetos;

public class atividade1 {

	
		// TODO Auto-generated method stub
		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa.
		 */
		public static void main(String[] args) {
	
	pessoa jonathan = new pessoa();
			
			jonathan.nome = "Jonathan";
			jonathan.sexo = "M";
			jonathan.dataDeNascimento = 14/07/2000;
			jonathan.estadoCivil = "casado";
			
			
	System.out.println("Nome " + jonathan.nome + " Sexo: " + jonathan.sexo + " Data de Nascimento " + jonathan.dataDeNascimento + " Estado Civil " + jonathan.estadoCivil
			);
		
		
		
			
			
			
	}

}
