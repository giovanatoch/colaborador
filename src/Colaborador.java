public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = Math.max(salarioMensal, 0.0);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = Math.max(salarioMensal, 0.0);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("João", "Silva", 5000);
        Colaborador colaborador2 = new Colaborador("Maria", "Souza", 6000);

        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " +
                colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " +
                colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());

        colaborador1.setSalarioMensal(colaborador1.getSalarioMensal() * 1.1);
        colaborador2.setSalarioMensal(colaborador2.getSalarioMensal() * 1.1);

        System.out.println("\nSalário anual de " + colaborador1.getPrimeiroNome() + " " +
                colaborador1.getSobrenome() + " após aumento: " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " +
                colaborador2.getSobrenome() + " após aumento: " + colaborador2.calcularSalarioAnual());
    }
}
