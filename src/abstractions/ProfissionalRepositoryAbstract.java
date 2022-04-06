package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	     // atributo para armazenar o caminho do
		// diretorio para onde os arquivos dever�o
		// ser exportados
	protected static final String PATH = "C:\\Users\\tonyp\\OneDrive\\Documentos\\curso_java";//CONSTANTE!
	
	    // M�todo abstrato que dever� ser implementado
		// para realizar a exporta��o dos arquivos

	public abstract void exportar(Profissional profissional) throws Exception;
	 

}
