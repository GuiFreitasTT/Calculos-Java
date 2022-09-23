
package entities;

public class Funcionario {
    
    public String nome;
    public double salarioBruto;
    public double taxa;

     public void IncreaseSalary(double porce){
        
         this.salarioBruto = salarioBruto * porce/100 + salarioBruto - taxa;
         
    }
   
    public double netSalary(){
        
        return salarioBruto - taxa;
    }
    
    
     /**
     *
     * @return
     */
    
    @Override
    
    public String toString(){
       return nome
        + ", R$"
        + String.format("%.2f\n", netSalary());
        //+ salarioBruto;
        //+ String.format("%.2f", IncreaseSalary());
    }

    

    
    
    
}

