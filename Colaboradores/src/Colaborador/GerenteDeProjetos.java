package Colaborador;

import java.util.Scanner;
public class GerenteDeProjetos extends Colaboradores{

	Scanner scanner = new Scanner(System.in);
	
    private boolean conheceProject;
    int op = 0;
    
    public GerenteDeProjetos(int cod, String nom, String dat, boolean conP){
    	super(cod,nom,dat);
        this.conheceProject = conP;
    }

   
	public boolean getConheceProject(){
        return conheceProject;
    }

    public void setConheceProject(boolean conP){
        this.conheceProject = conP;
    }

    public void exibeDados3(){
        System.out.println("********** Dados do Gerente**********");
        super.exibeDados();
       if(conheceProject){
            System.out.println("Conhece Project: Sim");
        }else{
            System.out.println("Conhece Project: Não");
        }
    }
}