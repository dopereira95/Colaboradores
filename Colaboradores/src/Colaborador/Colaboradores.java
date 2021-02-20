package Colaborador;

public abstract class  Colaboradores{
    
	   private int codigo;
	   private String nome, dataAdmissao;
	   
	   public Colaboradores(int cod, String nom, String dat){
	       this.codigo = cod;
	       this.nome = nom;
	       this.dataAdmissao = dat;
	   }
	   
	   public int getCodigo(){
	       return codigo;
	   }
	   
	   public void setCodigo(int cod){
	       this.codigo = cod;
	   }
	   
	   public String getNome(){
	       return nome;
	   }
	   
	   public void setNome(String nom){
	       this.nome = nom;
	   }
	   
	   public String getDataAdmissao(){
	       return dataAdmissao;
	   }
	   
	   public void setDataAdmissao(String dat){
	       this.dataAdmissao = dat;
	   }
	   
	   public void exibeDados(){
	       System.out.println("");
	       System.out.println("Qual seu Nome: "+getNome());
	       System.out.println("Qual é o seu código: "+getCodigo());
	       System.out.println("Qual a data de sua admissão: "+getDataAdmissao());
	   }
	}