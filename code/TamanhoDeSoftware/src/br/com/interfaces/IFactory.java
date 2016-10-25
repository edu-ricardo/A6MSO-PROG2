package br.com.interfaces;

public interface IFactory {
	public IAplicacao createAplicacao(IFilaArquivos arquivos, IConsolidadorArquivos consolidador, IProcessadorArquivos processador, IImpressao tela, IImpressao impTxt);
	public IFilaArquivos createFilaArquivos();
	public IProcessadorArquivos createProcessadorArquivos();	
	public IConsolidadorArquivos createConsolidadorArquivos();
	public IImpressao createImpressao(TipoImpressao tipo);
}