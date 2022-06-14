public class Funcionario {
    protected int codigoFuncional;
    protected String nome;
    protected String cargo;
    protected String setor;
    protected int HorasMês;
    protected double salario;

    public Funcionario(int codigoFuncional, String nome, String cargo, double salario){
        this.codigoFuncional = codigoFuncional;
    }

    public Funcionario(String nome, String cargo, String setor, int horasmês, double salario) {
    }

    public int getCodigoFuncional(){
        return this.codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getHorasMês() {
        return this.HorasMês;
    }
    public void setHorasMês(int Horasmês){
    this.HorasMês = HorasMês;
    }

    public double getSalario(){
    return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoPLR(){

        return salario * 3;
    }
    public double calculoFerias(){
        return salario * 1.4;
    }
}