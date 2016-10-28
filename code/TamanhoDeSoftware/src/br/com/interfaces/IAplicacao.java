package br.com.interfaces;

public interface IAplicacao {
	public IProcessadorArquivos getProcessadorDeArquivos();
	public void setProcessadorDeArquivos(IProcessadorArquivos aProcessadorDeArquivos);
	
	public IConsolidadorArquivos getConsolidadorArquivos();
	public void setConsolidadorArquivos(IConsolidadorArquivos aProcessadorDeArquivos);

	public IImpressao getImpressoraArquivo();
	public void setImpressoraArquivo(IImpressao aImpressoraArquivo);	
	
	public IImpressao getImpressoraTela();
	public void setImpressoraTela(IImpressao aImpressoraTela);	
	
	public void Execute(String path);
}
