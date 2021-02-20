package Colaborador;

public class AnalistaDeSistemas extends Colaboradores{
    
	   private boolean conheceUml;
	   
	   public AnalistaDeSistemas(int cod, String nom, String dat, boolean conU){
	       super(cod,nom,dat);
	       this.conheceUml = conU;
	   }
	   
	   public boolean getConheceUml(){
	       return conheceUml;
	   }
	   
	   public void setConheceUml(boolean conU){
	       this.conheceUml = conU;
	   }
	   
	   public void exibeDados2(){
	   
	       System.out.println("********** Dados do analista **********");
	       System.out.println("");
	       super.exibeDados();
	       if(conheceUml){
	            System.out.println("Conhece UML: SIM");
	        }else{
	            System.out.println("Conhece UML: NÃO");
	        }
	   }
	    
	}