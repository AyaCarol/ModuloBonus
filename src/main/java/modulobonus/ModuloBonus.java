package modulobonus;

public class ModuloBonus {

    public static void main(String[] args) {
        Departamento vendas1 = new Departamento(1);
        Departamento vendas2 = new Departamento(2);
        
        Vendedor v1 = new Vendedor(1, 1200, vendas1, 120, 10);
        Vendedor v2 = new Vendedor(2, 1300, vendas1, 120, 20);
        Vendedor v3 = new Vendedor(3, 1200, vendas2, 120, 15);
        Vendedor v4 = new Vendedor(4, 1200, vendas2, 120, 35);
        Gerente g1 = new Gerente(1, 1200, vendas1);
        Gerente g2 = new Gerente (2, 1200, vendas2);
        
        vendas1.adicionarFuncionario(g1);
        vendas1.adicionarFuncionario(v1);
        vendas1.adicionarFuncionario(v2);
        
        vendas2.adicionarFuncionario(g2);
        vendas2.adicionarFuncionario(v3);
        vendas2.adicionarFuncionario(v4);
        
        
        Controle controle = new Controle();
        
        controle.adicionarDepartamento(vendas1);
        controle.adicionarDepartamento(vendas2);
        
        System.out.println("O departamento com maior venda foi: " + controle.verificaMaiorVenda().getId());
        
        if(controle.verificaMaiorVenda() == null){
            System.out.println("Erro 1: Departamento vazio ou não encontrado.");
        }else{
            controle.calcularBonus();
        }
        
        
         /*
        - ADICIONAR CALCULO DE SALARIO + COMISSAO   FEITO!!
        - Modificar FOR por FOR EACH no Controle   FEITO!!!
        - adicionar calculo de bonus    FEITO!!
        - adicionar verificação se é vendedor ou gerente e dar respectivos bonus FEITO!!
        - adicionar tratativa de erro 
               Código 1: Retornado se qualquer uma das tabelas de entrada (Funcionários ou Departamentos) estiver vazia, ou seja, sem dados.
               Código 2: Retornado se não houver nenhum funcionário elegível nos departamentos com maior valor de vendas.
        */
    }
}
