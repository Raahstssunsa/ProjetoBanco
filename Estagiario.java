public class Estagiario extends Funcionario{

    public Estagiario( String nome, String cargo, String setor, int Horasmês, double salario){
        super(nome, cargo, setor, Horasmês, salario);
    }

    public double calculoPLR() {
        return salario * 2;
    }
}
