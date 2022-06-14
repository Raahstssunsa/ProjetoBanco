public class Gerente extends Funcionario{

        public Gerente( String nome, String cargo, String setor, int Horasmês, double salario){
            super(nome, cargo, setor, Horasmês, salario);
        }

        public double calculoPLR() {
            return salario * 4;
        }
    }

