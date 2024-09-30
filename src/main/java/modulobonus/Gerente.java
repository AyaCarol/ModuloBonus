package modulobonus;

public class Gerente extends Funcionario{
    
    public Gerente(int id, double salario, Departamento departamento) {
        super(id, salario, Cargo.GERENTE, departamento);
    }
    
}
