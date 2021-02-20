package Colaborador;

public class Desenvolvedor extends Colaboradores{

    private boolean conheceJava, conheceDotNet;

    public Desenvolvedor(int cod, String nom, String dat, boolean conJ, boolean conN){
        super(cod,nom,dat);
        this.conheceJava = conJ;
        this.conheceDotNet = conN;
    }

    public boolean getConheceJava(){
        return conheceJava;
    }

    public void setConheceJava(boolean conJ){
        this.conheceJava = conJ;
    }

    public boolean getConheceDotNet(){
        return conheceDotNet;
    }

    public void setConheceDotNet(boolean conN){
        this.conheceDotNet = conN;
    }

    public void exibeDados1(){

        System.out.println("********** Dados do desenvolvedor **********");
        System.out.println("");
        super.exibeDados();
        if(conheceJava)
            System.out.println("Conhece Java: Sim");
        else
            System.out.println("Conhece Java: Não");

        if(conheceDotNet){
            System.out.println("Conhece .NET: Sim");
        }else{
            System.out.println("Conhece .NET: Não");
        }
    }
}