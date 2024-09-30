package modulobonus;

public class Vendedor extends Funcionario{
    private double comissao;
    private int vendas;
    //private BigDecimal vendas;

    public Vendedor(int id, double salario, Departamento departamento, double comissao, int vendas) {
        super(id, salario, Cargo.VENDEDOR, departamento);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public int getVendas() {
        return vendas;
    } 
    
    /*
    public void calcularComissao(){
        this.comissao = this.vendas.multiply(BigDecimal.valueOf(0.01));
    
    }
    
    melhor usar BC pois nao acontece erro de arredondamento como em double
    
    
    */
    
    
    
}
