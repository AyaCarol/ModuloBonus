package modulobonus;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{
    protected double comissao;
    protected double vendas;
    //private BigDecimal vendas;

    public Vendedor(int id, double salario, Departamento departamento, double comissao, double vendas) {
        super(id, salario, Cargo.VENDEDOR, departamento);
        this.comissao = comissao;
        this.vendas = vendas;
        
    }

    public double getVendas() {
        return vendas;
    } 
    
  
    
    public void calcularSalario(){
        this.comissao = vendas * 0.01;
        this.salario += this.comissao;
        //this.salario = this.salario.add(this.comissao);
    }
    
    
    //melhor usar BC pois nao acontece erro de arredondamento como em double

    public double getComissao() {
        return comissao;
    }
    

}
