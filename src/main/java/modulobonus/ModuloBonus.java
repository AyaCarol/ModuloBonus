package modulobonus;

public class ModuloBonus {

    public static void main(String[] args) {
        Departamento vendas1 = new Departamento(1);
        Departamento vendas2 = new Departamento(2);
        
        Vendedor v1 = new Vendedor(1, 1200, vendas1, 120, 10);
        Vendedor v2 = new Vendedor(1, 1300, vendas1, 120, 20);
        Vendedor v3 = new Vendedor(1, 1200, vendas2, 120, 15);
        Vendedor v4 = new Vendedor(1, 1200, vendas2, 120, 35);
        
        vendas1.adicionarFuncionario(v1);
        vendas1.adicionarFuncionario(v2);
        vendas2.adicionarFuncionario(v3);
        vendas2.adicionarFuncionario(v4);
        
        Controle controle = new Controle();
        
        controle.adicionarDepartamento(vendas1);
        controle.adicionarDepartamento(vendas2);
        
        System.out.println("O departamento com maior venda foi: " + controle.verificaMaiorVenda().getId());
        
        
    }
}
