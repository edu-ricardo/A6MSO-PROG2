package br.com.tamanho_de_software;

import java.util.List;

import br.com.interfaces.IArquivo;
import br.com.interfaces.IFilaArquivos;

//Patterns 
//class = (public|private)\s+(class|interface)\s+(\w+)\s+((extends\s+\w+)|(implements\s+\w+( ,\w+)*))?\s*\{
//(public|protected|private|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])
//loc = [^\@\.\(]([\w ]*\s?=?\s?[\w\+ \<\>\(]* ?(\;|\)|\:)|else)

public class FilaArquivosJava implements IFilaArquivos {

	@Override
	public void carregaArquivos(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IArquivo> getArquivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IArquivo getProximoArquivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eof() {
		// TODO Auto-generated method stub
		return false;
	}

}
