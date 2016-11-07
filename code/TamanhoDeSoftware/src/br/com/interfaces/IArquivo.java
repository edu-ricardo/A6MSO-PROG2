package br.com.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IArquivo {	
	public List<IParte> getPartes();
	public String getText() throws FileNotFoundException, IOException;
	public void setTamanhoTotal(int tam);
	public int getTamanhoTotal();
	public void setQtdeClasses(int qtde);
	public int GetQtdeClasses();
}
