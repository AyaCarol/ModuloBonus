package modulobonus;

import java.util.LinkedList;

public class Controle {
    private LinkedList<Departamento> departamentos;
    private Departamento depMaiorVenda;
    private double maiorVenda;
    
    public Controle(){
        this.departamentos = new LinkedList<>();
        this.depMaiorVenda = null;
        this.maiorVenda = 0;
    }
    
    public void adicionarDepartamento(Departamento departamento){
         departamentos.add(departamento);
    }
    
    /*
    public Departamento verificaMaiorVenda(){
        if(departamentos.isEmpty()){
            System.out.println("Nenhum departamento disponível");
            return null;
        }
        
        Departamento depMaiorVenda = null;
        double maiorVenda = 0;
        
        for(Departamento departamento : departamentos){
            int total = departamento.calcularTotal();
            if(total > maiorVenda){
                maiorVenda = total;
                depMaiorVenda = departamento;
            }
        }
        
        if(depMaiorVenda != null){
            return depMaiorVenda;
        }else{
            return null;
        }
    }
    */
    
    public Departamento verificaMaiorVenda(){
        
        departamentos.forEach(departamento -> {
            
            departamento.getFuncionarios().forEach(funcionario ->{
                int total = 0;
                if(funcionario instanceof Vendedor){
                    Vendedor vendedor = (Vendedor) funcionario;
                    total += vendedor.getVendas();
                    departamento.setTotalVendas(total);
                }
            });
            
            if(departamento.getTotalVendas()>maiorVenda){
                maiorVenda = departamento.getTotalVendas();
                depMaiorVenda = departamento;
            }
        });
        
        if(depMaiorVenda != null){
            return depMaiorVenda;
        }else{
            return null;
        }
    }
    
   
    
    
}
