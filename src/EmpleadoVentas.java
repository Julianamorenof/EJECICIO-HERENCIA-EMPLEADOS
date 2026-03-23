public class EmpleadoVentas extends Empleado {

    private double total_ventas;
    private int comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String identificacion, String nombre, int edad, double salariobase, double total_ventas, int comision) {
        super(identificacion, nombre, edad, salariobase);
        this.total_ventas = total_ventas;
        this.comision = comision;
    }

    public double getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(double total_ventas) {
        this.total_ventas = total_ventas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return  "EmpleadoVentas{" +
                "total_ventas=" + total_ventas +
                ", comision=" + comision +
                '}';
    }
    @Override
    public double calcularSalario() {
        return salariobase + (total_ventas * comision/100);
    }

    public void mostrarInfo() {
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario base: " + salariobase);
        System.out.println("Total ventas: " + total_ventas);
        System.out.println("Comision: " + comision);
        System.out.println("Salario completo actualizado: " + calcularSalario());
    }
}
