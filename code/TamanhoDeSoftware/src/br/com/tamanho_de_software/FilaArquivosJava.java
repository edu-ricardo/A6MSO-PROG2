package br.com.tamanho_de_software;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import br.com.interfaces.IArquivo;
import br.com.interfaces.IFactoryArquivo;
import br.com.interfaces.IFilaArquivos;

//Patterns 
//class = (public|private)\s+(class|interface)\s+(\w+)\s+((extends\s+\w+)|(implements\s+\w+( ,\w+)*))?\s*\{
//(public|protected|private|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])
//loc = [^\@\.\(]([\w ]*\s?=?\s?[\w\+ \<\>\(]* ?(\;|\)|\:)|else)

public class FilaArquivosJava implements IFilaArquivos {

	private IFactoryArquivo __factoryArquivo;
	private List<IArquivo> _listArquivos;
	private int _index;
	
	@Override
	public void carregaArquivos(String path) {
		// TODO Auto-generated method stub
		File F = new File(path);
		
	}

	@Override
	public List<IArquivo> getArquivos() {
		return _listArquivos;
	}

	@Override
	public IArquivo getArquivo() {		
		return _listArquivos.get(_index++);
	}

	@Override
	public void first() {
		_index = 0;
	}

	@Override
	public boolean eof() {
		return _index >= _listArquivos.size();
	}

	public FilaArquivosJava(IFactoryArquivo FactoryArquivo) {
		_index = -1;
		_listArquivos = new LinkedList<IArquivo>();
		__factoryArquivo = FactoryArquivo;
	}
}
