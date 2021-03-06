

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        protected String nome;
        protected Long rg;
        protected String dataNascimento;
        protected Long cpf;
        protected Conta conta;
        protected static ArrayList<Conta> contas;


        protected Cliente(String nome) {

                this.nome = nome;
        }

        public Cliente() {
        }

        public Cliente(String nome, Long rg, String dataNascimento, Long cpf) {
                this.nome = nome;
                this.rg = rg;
                this.dataNascimento = dataNascimento;
                this.cpf = cpf;
                this.contas = new ArrayList();
        }

        public Conta criarConta() {
                Conta conta = new Conta(TipoConta.Conta_Corrente, 65795L, 6785);
                this.conta = conta;
                this.contas.add(conta);
                return conta;

        }

        public String getnome() {

                return this.nome;
        }

        public void setnome(String nome) {

                this.nome = nome;
        }

        public Long getrg() {

                return this.rg;
        }

        public void setrg(Long rg) {

                this.rg = rg;
        }

        public Long getcpf() {

                return this.cpf;
        }

        public void setcpf(Long cpf) {

                this.cpf = cpf;
        }

        public String getdataNascimento() {

                return this.dataNascimento;
        }

        public void setdataNascimento(String dataNascimento) {

                this.dataNascimento = dataNascimento;
        }


                ContaCorrente getContaCorrente() {
                        int i;
                        for (i = 0; i < this.contas.size(); i++) {
                                if (this.contas.get(i).tipoConta == TipoConta.Conta_Corrente) ;
                                return (ContaCorrente) contas.get(i);
                        }
                        return (ContaCorrente) contas.get(i);
                }




        public Conta criarconta() {
                Conta conta = new Conta(TipoConta.Conta_Poupan??a, 76998L, 6785);
                this.conta = conta;
                this.contas.add(conta);
                return conta;

        }

        public String getNome() {
                return this.nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Long getRgg() {
                return this.rg;
        }

        public void setRg(Long rg) {
                this.rg = rg;
        }

        public Long getCpf() {
                return this.cpf;
        }

        public void setCpf(Long cpf) {

                this.cpf = cpf;
        }

        public String getDataNascimento() {

                return this.dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {

                this.dataNascimento = dataNascimento;
        }

        public Conta getConta() {
                return this.conta;

        }

                ContaPoupanca getContaPaupanca() {
                        for (int i = 0; i < this.contas.size();i++){
                                if (this.contas.get(i).tipoConta == TipoConta.Conta_Poupan??a) ;
                                return (ContaPoupanca) contas.get(i);
                        }
                        return new ContaPoupanca(){};
                }



        protected void Conta_Poupan??a() {
        }

        public void RenderJuros(ContaPoupanca contaPoupan??a) {
        }

        public List<Object> getRenderJuros() {
                return this.getRenderJuros();
        }

        public void SetConta(ContaPoupanca contaPoupan??a) {
        }
}

