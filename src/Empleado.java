public class Empleado {

    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected double salariobase;

    public Empleado(){

    }
    public Empleado(String identificacion, String nombre, int edad, double salariobase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.salariobase = salariobase;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public String toString() {//QUITE EL super.toString()+ PORQUE ESO HACE QUE SE IMPRIMA LA MEMORIA
        return  "Empleado{" +
                "indentificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salariobase=" + salariobase +
                '}';
    }

    public double calcularSalario(){
        return salariobase;
    }
    public void aumentarSalario(double porcentaje){
        salariobase = salariobase + (salariobase * porcentaje / 100);
        System.out.println("Salario aumentado en " + porcentaje + "%");
        System.out.println("Salario base actualizado: " + salariobase);
    }

    public boolean mayorEdad() {
        return edad >= 18;
    }

    public void mostrarInfo(){
        System.out.println("Identificacion: "+ identificacion);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario base: "+ salariobase);
        System.out.println("Salario completo actualizado: " + calcularSalario());
    }
}
