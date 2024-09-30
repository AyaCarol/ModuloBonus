package modulobonus;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{
    private double comissao;
    private double vendas;
    //private BigDecimal vendas;

    public Vendedor(int id, double salario, Departamento departamento, double comissao, double vendas) {
        super(id, salario, Cargo.VENDEDOR, departamento);
        this.comissao = comissao;
        this.vendas = vendas;
        
    }

    public double getVendas() {
        return vendas;
    } 
    
    
    public void calcularComissao(){
        this.comissao = vendas * 0.01;
        //this.comissao = this.vendas.multiply(BigDecimal.valueOf(0.01));
    
    }
    
    public void calcularSalario(){
        this.salario += this.comissao;
        //this.salario = this.salario.add(this.comissao);
    }
    
    //melhor usar BC pois nao acontece erro de arredondamento como em double
    

}
