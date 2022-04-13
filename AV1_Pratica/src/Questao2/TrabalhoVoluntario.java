package Questao2;

public class TrabalhoVoluntario extends Projeto{
	
	private String tipoTrabalho;
	private int duracaoTrabalho;
	
	public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
			String tipoTrabalho, int duracaoTrabalho) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}

	
	
	public String getTipoTrabalho() {
		return tipoTrabalho;
	}



	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}



	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}



	public void setDuracaoTrabalho(int duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}



	@Override
	public boolean validaProjeto(String nomeProjeto) {
		if(this.getDuracaoTrabalho() > 2 ) {
			return true;
		}else
		return false;
	}

	@Override
	public String imprimeProjeto() {
		
		return "Nome do Projeto:" + this.getNomeProjeto() + "\nDescrição:" + this.getDescricao() + "\nData Inicio:" + 
				this.getDataInicio() + "\nData Fim:" + this.getDataFim() + "Tipo de trabalho:" + this.tipoTrabalho +"\nDuração:"+this.duracaoTrabalho;
	}
	
	

}
