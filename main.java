import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Double LoginSistema = logarsistema();
        Double solicitarLogin = codigoLogin();
        Double solicitarSenha = codigoSenha();
        String acesso = acessoliberado();
        Double Deslogar = deslogar();
    }

    private static Double logarsistema() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Logar no sistema");
        return null;
    }

    private static Double codigoLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Login:");
        Double login = scanner.nextDouble();
        return null;
    }

    private static Double codigoSenha() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite sua Senha:");
        Double Senha = scanner2.nextDouble();
        return null;
    }
    public static String acessoliberado(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Acesso Liberado");
        Double acessoliberado = scanner3.nextDouble();

        return null;
    }
    private static Double deslogar() {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Deslogando do sistema");
        return null;
    }



}