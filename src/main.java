import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente[] cadCliente = new Cliente[2];

        System.out.print("Cadastro de Novos Cliente ");
        for (int cont = 0; cont < cadCliente.length; cont++) {

            Cliente novoCliente = new Cliente();

            System.out.println("Nome do Cliente:");
            novoCliente.nome = scanner.next();

            System.out.println("Número do RG");
            novoCliente.rg = Long.valueOf(scanner.next());

            System.out.println("Numero do CPF");
            novoCliente.cpf = Long.valueOf(scanner.next());

            System.out.println("Data de Nascimento");
            novoCliente.dataNascimento = scanner.next();

            Conta[] novaConta = new Conta[2];

            System.out.print("Cadastro Conta ");
            for (cont = 0; cont < novaConta.length; cont++) {
            Conta ContaCorrente = new Conta();
            System.out.println(" Digite 1 para abrir uma conta corrernte" + "ou 2 para uma conta poupança");
                    int opcaoEscolhida = scanner.nextInt();
                    if(opcaoEscolhida ==1) {
                        ContaCorrente.tipoConta = TipoConta.Conta_Corrente;
                    } else if (opcaoEscolhida == 2) {
                        ContaPoupanca.tipoConta = TipoConta.Conta_Poupança;
                    } else {
                        System.out.println("Opção Invalida");
                }

                    ContaCorrente.numeroconta = 755859859L;
                    ContaCorrente.agencia = 76866;
                    ContaCorrente.saldo = BigDecimal.ZERO;






                }









        }

    }
}

