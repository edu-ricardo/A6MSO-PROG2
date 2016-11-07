package br.com.interfaces;

import java.io.IOException;

public interface IImpressao {
	public void setDestino(String path);
	public void imprimirDados(IFilaArquivos Arquivos) throws IOException;
}
