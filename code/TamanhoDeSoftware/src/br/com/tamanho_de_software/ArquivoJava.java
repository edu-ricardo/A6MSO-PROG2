package br.com.tamanho_de_software;

import java.util.List;

import br.com.interfaces.IArquivo;
import br.com.interfaces.IParte;

public class ArquivoJava implements IArquivo {

	private String path;
	
	@Override
	public List<IParte> getPartes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArquivoJava(String path) {
		// TODO Auto-generated constructor stub
		this.path = path;
	}
}