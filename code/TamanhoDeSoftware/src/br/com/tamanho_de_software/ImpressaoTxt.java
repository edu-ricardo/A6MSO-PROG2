package br.com.tamanho_de_software;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.interfaces.IFilaArquivos;
import br.com.interfaces.IImpressao;

public class ImpressaoTxt implements IImpressao {
	private String path;
	
	@Override
	public void setDestino(String path) {
		this.path = path;
	}

	@Override
	public void imprimirDados(IFilaArquivos Arquivos) throws IOException {
		FileWriter arq = new FileWriter(path);
		PrintWriter gravarArq = new PrintWriter(arq);
		 
		gravarArq.printf(Arquivos.getImpTexto());
		arq.close();
	}

}
