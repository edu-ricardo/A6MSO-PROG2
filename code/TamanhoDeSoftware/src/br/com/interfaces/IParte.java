package br.com.interfaces;

import java.util.List;

public interface IParte {
	public int getTamanho();
	public String getTexto();
	public String getNome();
	public PartType getTipoParte(); 
	public List<IParte> getPartes();
	
	public void setTamanho(int Tamanho);
	public void setTexto(String Texto);
	public void setNome(String Nome);
	public void setTipoParte(PartType tipoParte);
}
