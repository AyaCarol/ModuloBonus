package modulobonus;

import java.math.BigDecimal;
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
        
        if(depMaiorVenda.verificaVazio() || depMaiorVenda == null){
            return null;
        }else{
            return depMaiorVenda;
        }
    }
    
    public void calcularBonus(){
        
        this.depMaiorVenda.getFuncionarios().forEach(funcionario ->{
            double salarioAtual = funcionario.getSalario();
            double salarioAntigo = funcionario.getSalario();
            if(funcionario.getCargo() == Funcionario.Cargo.VENDEDOR && funcionario.getSalario() < 150000){
                funcionario.setSalario(salarioAtual+=2000);
                System.out.println("Funcionario " + funcionario.getId());
                System.out.println("Cargo: " + funcionario.getCargo());
                System.out.println("Salario antigo: "+ salarioAntigo + "\nSalario ajustado: " + funcionario.getSalario());
            }else if(funcionario.getSalario() >= 150000 || funcionario.getCargo()== Funcionario.Cargo.GERENTE){
                funcionario.setSalario(salarioAtual+=1000);
                System.out.println("Funcionario " + funcionario.getId());
                System.out.println("Cargo: " + funcionario.getCargo());
                System.out.println("Salario antigo: "+ salarioAntigo + "\nSalario ajustado: " + funcionario.getSalario());
            }
        });
    }
   
    
    
}
