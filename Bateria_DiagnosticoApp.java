/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bateria_diagnosticoapp;

/**
 *
 * @author Fernando Padilla
 */

class Diagnostico_Bateria{
    /*Atributos*/
    private int codigo;
    private String diagnostico;
    private String mantenimiento;
    private int numfallas;
    
    /*Constructor*/
    
    public Diagnostico_Bateria(int pCodigo,String pDiagnostico,String pMantenimiento,int pNumfallas){
        
        codigo=pCodigo;
        diagnostico=pDiagnostico;
        mantenimiento=pMantenimiento;
        numfallas=pNumfallas;
    }
    
    /*Metodos*/
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getDiagnostico(){
        return diagnostico;
    }
    
    public void setServicio(String diagnostico){
        this.diagnostico=diagnostico;
    }
    
    public String getMantenimiento(){
        return mantenimiento;
    }
    
    public void setMantenimiento(String mantenimiento){
        this.mantenimiento=mantenimiento;
    }
    
    public int getNumfallas(){
        return numfallas;
    }
    
    public void setNumfallas(int numfallas){
        this.numfallas=numfallas;
    }
    
    @Override
    public String toString(){
        return "A la bateria se le realiza un "+diagnostico+" que tiene el codigo:"+codigo+"--"
                +"se le realizara un "+mantenimiento+" la baetria tiene : "+numfallas+" fallas";
    }
}


public class Bateria_DiagnosticoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos
        Diagnostico_Bateria bateria1=new Diagnostico_Bateria(0203,"Diagnostico 1"," Bateria 1",5);
        Diagnostico_Bateria bateria2=new Diagnostico_Bateria(0255,"Diagnostico 2"," Bateria 2",8);
        
        //Mostramo su tado
        System.out.println(bateria1.toString());
        System.out.println(bateria2.toString());
        
        // Modiicamos el Atributo Numfallas bateria1
        bateria1.setNumfallas(9);
        
        //Comparamos quien tiene mas mantenimiento
        
        if(bateria1.getNumfallas()<bateria2.getNumfallas()){
            System.out.println(bateria1.getMantenimiento()+"tiene mas fallas");
            }else{
            System.out.println(bateria2.getMantenimiento()+"tiene mas fallas");
            
            
        }
    }
    
}
