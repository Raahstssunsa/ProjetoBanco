import java.math.BigDecimal;

public class Conta {
    public static Enum<TipoConta> tipoConta;
    public Long numeroconta;
    public Integer agencia;
    public BigDecimal saldo;
    private BigDecimal getSaldo;

    public Conta() {
    }

    public Conta(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        this.tipoConta = tipoConta;
        this.numeroconta = numeroConta;
        this.agencia = agencia;
        this.saldo = BigDecimal.ZERO;

    }

    public Conta(Long numeroconta, Integer agencia) {
        this.numeroconta = numeroconta;
        this.agencia = agencia;
        this.saldo = BigDecimal.ZERO;

    }

    public Long getNumeroconta() {

        return this.numeroconta;
    }

    public void setNumeroconta(Long numeroconta) {

        this.numeroconta = numeroconta;
    }

    public Integer getAgencia() {


        return this.agencia;
    }

    public void setAgencia(Integer agencia) {

        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {

        return this.getSaldo;
    }

    public void setSaldo(BigDecimal saldo) {

        this.saldo = saldo;
    }

    public BigDecimal deposita(BigDecimal Valor) {
        this.saldo = this.saldo.add(BigDecimal.valueOf(1000));
        return this.saldo;
    }

    private BigDecimal saldo(BigDecimal valor) {
        return saldo;
    }

    public BigDecimal saque(BigDecimal Valor) {
        this.saldo = this.saldo.subtract(BigDecimal.valueOf(20));
        return this.saldo;
    }

    public BigDecimal transferencia(BigDecimal Valor, Conta destino) {
        BigDecimal saldoAtualizadoDaContaOrigem = saque(Valor);
        destino.deposita(Valor);
        return saldoAtualizadoDaContaOrigem;
    }

    public Integer getRenderJuros() {

        return this.getRenderJuros();
    }

}