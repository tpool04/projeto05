package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	     // atributo para armazenar o caminho do
		// diretorio para onde os arquivos deverão
		// ser exportados
	protected static final String PATH = "C:\\Users\\tonyp\\OneDrive\\Documentos\\curso_java";//CONSTANTE!
	
	    // Método abstrato que deverá ser implementado
		// para realizar a exportação dos arquivos

	public abstract void exportar(Profissional profissional) throws Exception;
	 

}
