package modulobonus;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Departamento {
    private int id;
    private BigDecimal totalVendas;
    //private BigDecimal vendaTotal;
    private LinkedList<Funcionario> funcionarios;

    public Departamento(int id) {
        this.id = id;
        this.funcionarios = new LinkedList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public LinkedList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
    public int getId() {
        return id;
    }

    public void setTotalVendas(BigDecimal totalVendas) {
        this.totalVendas = totalVendas;
    }

    public BigDecimal getTotalVendas() {
        return totalVendas;
    }
    
    public boolean verificaVazio(){
        if(funcionarios.isEmpty()){
            return true;
        }else{
            return false;
        }
    }    
}
