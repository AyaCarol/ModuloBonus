package modulobonus;

public class Vendedor extends Funcionario{
    private double comissao;
    private int vendas;

    public Vendedor(int id, double salario, Departamento departamento, double comissao, int vendas) {
        super(id, salario, Cargo.VENDEDOR, departamento);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public int getVendas() {
        return vendas;
    } 
}
