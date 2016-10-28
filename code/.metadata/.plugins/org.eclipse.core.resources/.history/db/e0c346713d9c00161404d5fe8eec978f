package br.com.tamanho_de_software;

import br.com.interfaces.IFactory;
import br.com.interfaces.IFactoryArquivo;
import br.com.interfaces.IFilaArquivos;

public class Main {

	public static void main(String[] args) {
		IFactoryArquivo __factoryArquivo = new FactoryArquivoJava();
		IFactory __factory = new FactoryJava();
		String path = null;
		if (args.length == 1){
			path = args[0];
		}
		
		IFilaArquivos _filaArquivos = __factory.createFilaArquivos(__factoryArquivo);
		System.out.println(path);
	}

}
