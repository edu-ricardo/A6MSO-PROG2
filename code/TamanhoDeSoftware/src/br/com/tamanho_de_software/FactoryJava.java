package br.com.tamanho_de_software;

import br.com.interfaces.IAplicacao;
import br.com.interfaces.IConsolidadorArquivos;
import br.com.interfaces.IFactory;
import br.com.interfaces.IFactoryArquivo;
import br.com.interfaces.IFilaArquivos;
import br.com.interfaces.IImpressao;
import br.com.interfaces.IProcessadorArquivos;
import br.com.interfaces.TipoImpressao;

public class FactoryJava implements IFactory {

	@Override
	public IAplicacao createAplicacao(IFilaArquivos arquivos, IConsolidadorArquivos consolidador,
			IProcessadorArquivos processador, IImpressao tela, IImpressao impTxt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFilaArquivos createFilaArquivos(IFactoryArquivo FactoryArquivo) {
		return new FilaArquivosJava(FactoryArquivo);
	}

	@Override
	public IProcessadorArquivos createProcessadorArquivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConsolidadorArquivos createConsolidadorArquivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IImpressao createImpressao(TipoImpressao tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}