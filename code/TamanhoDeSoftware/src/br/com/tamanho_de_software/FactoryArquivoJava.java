package br.com.tamanho_de_software;

import br.com.interfaces.IArquivo;
import br.com.interfaces.IFactoryArquivo;
import br.com.interfaces.IParte;

public class FactoryArquivoJava implements IFactoryArquivo {

	@Override
	public IArquivo createArquivo(String path) {
		// TODO Auto-generated method stub
		return new ArquivoJava(path);
	}

	@Override
	public IParte createParte(IArquivo arquivo) {
		// TODO Auto-generated method stub
		return null;
	}


}
