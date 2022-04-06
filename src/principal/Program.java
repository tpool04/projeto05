package principal;

import java.util.ArrayList;

import abstractions.ProfissionalRepositoryAbstract;
import entities.Estabelecimento;
import entities.Profissional;
import entities.Servico;
import repositories.ProfissionalRepository;

public class Program {

	public static void main(String[] args) {
		
		try {
			

			Profissional profissional = new Profissional();
			
			profissional.setIdProfissinal(1);
			profissional.setNome("João Pedro");
			profissional.setTelefone("(21) 99999-0000");
			
			profissional.setEstabelecimento(new Estabelecimento());
			profissional.getEstabelecimento().setIdEstabeleciemento(1);;
			profissional.getEstabelecimento().setNome("Loja Barra Shopping");
			profissional.getEstabelecimento().setCnpj("55.388.988/0001-08");
			
			profissional.setServico(new ArrayList<Servico>());
			
			profissional.getServico().add(new Servico(1, "Corte de Cabelo", 100.0, 30));
			profissional.getServico().add(new Servico(2, "Barba", 50.0, 30));
			
			//exportando para arquivo
			ProfissionalRepositoryAbstract repository = new ProfissionalRepository();
			repository.exportar(profissional);
			
			System.out.println("\nDados gravados com sucesso!");	
			
		}
		catch(Exception e){
			System.out.println("Erro:" + e.getMessage());
			
		}

	}

}
