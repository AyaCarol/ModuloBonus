package modulobonus;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Controle {
    private LinkedList<Departamento> departamentos;
    private Departamento depMaiorVenda;
    private BigDecimal maiorVenda;
    
    public Controle(){
        this.departamentos = new LinkedList<>();
        this.depMaiorVenda = null;
        this.maiorVenda = BigDecimal.valueOf(0);
    }
    
    public void adicionarDepartamento(Departamento departamento){
         departamentos.add(departamento);
    }
    
    public Departamento verificaMaiorVenda(){
        
        departamentos.forEach(departamento -> {
            
            departamento.getFuncionarios().forEach(funcionario ->{
                BigDecimal total = BigDecimal.valueOf(0);
                if(funcionario instanceof Vendedor){
                    Vendedor vendedor = (Vendedor) funcionario;
                    total = total.add(vendedor.getVendas());
                    departamento.setTotalVendas(total);
                }
            });
            //departamento.getTotalVendas()>maiorVenda
            if(departamento.getTotalVendas().compareTo(maiorVenda) > 0){
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
            BigDecimal salarioAtual = funcionario.getSalario();
            BigDecimal salarioAntigo = funcionario.getSalario();
            if(funcionario.getCargo() == Funcionario.Cargo.VENDEDOR && funcionario.getSalario().compareTo(BigDecimal.valueOf(150000)) < 0){
                funcionario.setSalario(salarioAtual = salarioAtual.add(BigDecimal.valueOf(2000)));
                System.out.println("\nFuncionario " + funcionario.getId() + "\nCargo: " + funcionario.getCargo() + "\nSalario antigo: "+ salarioAntigo + "\nSalario ajustado: " + funcionario.getSalario());
            }else if(funcionario.getSalario().compareTo(BigDecimal.valueOf(150000)) > 0 || funcionario.getCargo()== Funcionario.Cargo.GERENTE){
                funcionario.setSalario(salarioAtual = salarioAtual.add(BigDecimal.valueOf(1000)));
                System.out.println("\nFuncionario " + funcionario.getId() + "\nCargo: " + funcionario.getCargo() + "\nSalario antigo: "+ salarioAntigo + "\nSalario ajustado: " + funcionario.getSalario());
            }
        });
    }
}
