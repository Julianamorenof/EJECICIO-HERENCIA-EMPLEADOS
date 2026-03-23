public class EmpleadoAdministrativo extends Empleado {

    private double bonificacion_fija;


    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String identificacion, String nombre, int edad, double salariobase, double bonificacion_fija) {
        super(identificacion, nombre, edad, salariobase);
        this.bonificacion_fija = bonificacion_fija;
    }

    public double getBonificacion_fija() {
        return bonificacion_fija;
    }

    public void setBonificacion_fija(double bonificacion_fija) {
        this.bonificacion_fija = bonificacion_fija;
    }

    @Override
    public String toString() {
        return  "EmpleadoAdministrativo{" +
                "bonificacion_fija=" + bonificacion_fija +
                '}';
    }
    @Override
    public double calcularSalario() {
        return salariobase + bonificacion_fija;
    }


    public void mostrarInfo(){
        System.out.println("Identificacion: "+ identificacion);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario base: "+ salariobase);
        System.out.println("Bonificacion fija: "+ bonificacion_fija);
        System.out.println("Salario completo actualizado: " + calcularSalario());
    }
}
