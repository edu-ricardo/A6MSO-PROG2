package br.com.tamanho_de_software;

import br.com.interfaces.IArquivo;
import br.com.interfaces.IFactoryArquivo;
import br.com.interfaces.IParte;
import br.com.interfaces.PartType;

public class FactoryArquivoJava implements IFactoryArquivo {

	@Override
	public IArquivo createArquivo(String path) {
		return new ArquivoJava(path);
	}

	@Override
	public IParte createParte(String nome, String texto, PartType partType) {
		return new ParteJava(nome, texto, partType);
	}
}
