package modulobonus;

import java.util.LinkedList;

public class Controle {
    private LinkedList<Departamento> departamentos;
    
    public Controle(){
        this.departamentos = new LinkedList<>();
    }
    
    public void adicionarDepartamento(Departamento departamento){
         departamentos.add(departamento);
    }
    
    public int calcularVendas(){
        int total = 0;
        for(Departamento departamento : departamentos){
            total += departamento.calcularTotal();
        }
        return total;
    }
    
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
    /*
     - adicionar calculo de bonus
     - adicionar verificação se é vendedor ou gerente e dar respectivos bonus
     - adicionar tratativa de erro
            Código 1: Retornado se qualquer uma das tabelas de entrada (Funcionários ou Departamentos) estiver vazia, ou seja, sem dados.
            Código 2: Retornado se não houver nenhum funcionário elegível nos departamentos com maior valor de vendas.;
    */
    
    
}
