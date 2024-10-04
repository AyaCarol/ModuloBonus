package modulobonus;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{
    protected BigDecimal comissao;
    protected BigDecimal vendas;
    //private BigDecimal vendas;

    public Vendedor(int id, BigDecimal salario, Departamento departamento, BigDecimal vendas) {
        super(id, salario, Cargo.VENDEDOR, departamento);
        this.vendas = vendas;
        
    }

    public BigDecimal getVendas() {
        return vendas;
    } 
    
    public void calcularSalario(){
        this.comissao = this.vendas.multiply(BigDecimal.valueOf(0.01));
        this.salario = this.salario.add(this.comissao);
    }
    
    //melhor usar BC pois nao acontece erro de arredondamento como em double

    public BigDecimal getComissao() {
        return comissao;
    }
}
