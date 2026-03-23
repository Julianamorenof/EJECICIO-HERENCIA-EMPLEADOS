public class EmpleadoHoras extends Empleado{

    private double horas_trabajadas;
    private double valor_horas;


    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String indentificacion, String nombre, int edad, double salariobase, double horas_trabajadas, double valor_horas) {
        super(indentificacion, nombre, edad, salariobase);
        this.horas_trabajadas = horas_trabajadas;
        this.valor_horas = valor_horas;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getValor_horas() {
        return valor_horas;
    }

    public void setValor_horas(double valor_horas) {
        this.valor_horas = valor_horas;
    }

    @Override
    public String toString() {
        return  "EmpleadoHoras{" +
                "horas_trabajadas=" + horas_trabajadas +
                ", valor_horas=" + valor_horas +
                '}';
    }
    @Override
    public double calcularSalario() {
        return salariobase + (horas_trabajadas * valor_horas);
    }

    public void mostrarInfo() {
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario base: " + salariobase);
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Valor horas: " + valor_horas);
        System.out.println("Salario completo actualizado: " + calcularSalario());
    }
}
