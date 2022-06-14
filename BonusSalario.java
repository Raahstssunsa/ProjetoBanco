import java.util.Scanner;

public class BonusSalario {
    public class BonusSalário {
        public void main(String[] args) {
            Double salario = lerSalario();
            Double salarioComBonus = calcularBonus(salario);
            System.out.println("O salario com bonus é " + salarioComBonus);
        }

        public Double lerSalario(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o salario");
            Double salario = scanner.nextDouble();
            return salario;
        }

        public Double calcularBonus(Double salario){
            return salario + (salario / 100) * 10;
        }
    }
}

