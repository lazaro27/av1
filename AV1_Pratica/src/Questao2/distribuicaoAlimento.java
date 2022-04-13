package Questao2;

public class distribuicaoAlimento extends Projeto {
	
	private String descAlimento;
	private float qtde;
	

	public distribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		
	}
	
	
	public distribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim, String descAlimento, float qtde) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.descAlimento = descAlimento;
		this.qtde = qtde;
	}



	public String getDescAlimento() {
		return descAlimento;
	}



	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}



	public float getQtde() {
		return qtde;
	}



	public void setQtde(float qtde) {
		this.qtde = qtde;
	}



	@Override
	public boolean validaProjeto(String nomeProjeto) {
		if(this.getDataFim() == null) {
			return true;
		}else
		return false;
	}

	@Override
	public String imprimeProjeto() {
		
		return "Nome do Projeto:" + this.getNomeProjeto() + "\nDescrição:" + this.getDescricao() + "\nData Inicio:" + 
		this.getDataInicio() + "\nData Fim:" + this.getDataFim() +"\nDescrição:" + this.getDescricao() + "\nQuantidade:" + this.getQtde();
	}

}
