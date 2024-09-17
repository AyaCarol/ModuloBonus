package modulobonus;

public abstract class Funcionario {
    private int id;
    private double salario;
    private Cargo cargo;
    private Departamento departamento;
    
    public enum Cargo{
        VENDEDOR,
        GERENTE
    }

    public Funcionario(int id, double salario, Cargo cargo, Departamento departamento) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }
}
