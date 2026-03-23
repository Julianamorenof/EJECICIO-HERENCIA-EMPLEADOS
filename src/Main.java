//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

void main() {
    Scanner teclado = new Scanner(System.in);

/*/
    Empleado e1 = new Empleado("e1 123456", "Pedro", 26, 2100000);

    EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo("ea1 7865", "Gabriela", 24, 2300000, 598000);

    EmpleadoVentas ev1 = new EmpleadoVentas("ev1 9089", "Juan", 38, 4500000, 70000000, 6);

    EmpleadoHoras eh1 = new EmpleadoHoras("eh135578", "Marcos", 45, 1700000, 16, 560000);

    System.out.println(e1.toString());
    System.out.println(ea1.toString());
    System.out.println(ev1.toString());
    System.out.println(eh1.toString());
/*/
    List<Empleado> list = new ArrayList<>();
    int opciones;
    int opciones2;
    int opciones3;

    do {
        System.out.println("""
                1) Crear empleado ventas
                2) Crear empleado administrativo
                3) Crear empleado horas
                4) Mostar todos los empleados
                5) Mostrar empleado por tipo
                6) Buscar empleado y calcular
                7) Salir
                """);
        System.out.println("Ingrese una opción: ");
        opciones = teclado.nextInt();

        switch (opciones) {
            case 1:
                System.out.println("INGRESAR DATOS PARA CREAR EMPLEADO VENTAS");
                System.out.println("Ingrese la identificacion del empleado: ");
                String identificacionV = teclado.next();
                System.out.println("Ingrese el nombre del empleado: ");
                String nombreV = teclado.next();
                System.out.println("Ingrese la edad del empleado: ");
                int edadV = teclado.nextInt();
                System.out.println("Ingrese el salario base del empleado: ");
                double salariobaseV = teclado.nextDouble();
                System.out.println("Ingrese la cantidad de ventas del empleado: ");
                double total_ventas = teclado.nextDouble();
                System.out.println("Ingrese la comision del empleado: ");
                int comision = teclado.nextInt();

                EmpleadoVentas eV1 = new EmpleadoVentas(identificacionV, nombreV, edadV, salariobaseV, total_ventas, comision);
                list.add(eV1);

                break;

            case 2:
                System.out.println("INGRESAR DATOS PARA CREAR EMPLEADO ADMINISTRATIVO");
                System.out.println("Ingrese la identificacion del empleado: ");
                String identificacionA = teclado.next();
                System.out.println("Ingrese el nombre del empleado: ");
                String nombreA = teclado.next();
                System.out.println("Ingrese la edad del empleado: ");
                int edadA = teclado.nextInt();
                System.out.println("Ingrese el salario base del empleado: ");
                double salariobaseA = teclado.nextDouble();
                System.out.println("Ingrese la bonificacion fija del empleado: ");
                double bonificacion_fija = teclado.nextDouble();

                EmpleadoAdministrativo eA1 = new EmpleadoAdministrativo(identificacionA, nombreA, edadA, salariobaseA, bonificacion_fija);
                list.add(eA1);

                break;

            case 3:
                System.out.println("INGRESAR DATOS PARA CREAR EMPLEADO HORAS");
                System.out.println("Ingrese la identificacion del empleado: ");
                String identificacionH = teclado.next();
                System.out.println("Ingrese el nombre del empleado: ");
                String nombreH = teclado.nextLine();//NEXTLINE, PARA QUE PERMITA INGRESAR CON ESPACIOS, EJEMPLO, PEPITO PEREZ
                System.out.println("Ingrese la edad del empleado: ");
                int edadH = teclado.nextInt();
                System.out.println("Ingrese el salario base del empleado: ");
                double salariobaseH = teclado.nextDouble();
                System.out.println("Ingrese la cantidad de horas trabajadas del empleado: ");
                double horas_trabajadas = teclado.nextDouble();
                System.out.println("Ingrese el valor por hora del empleado: ");
                double valor_horas = teclado.nextDouble();

                EmpleadoHoras eH1 = new EmpleadoHoras(identificacionH, nombreH, edadH, salariobaseH, horas_trabajadas, valor_horas);
                list.add(eH1);

                break;

            case 4:
                System.out.println(list);
                for (Empleado emp : list) {
                    System.out.println(emp);
                }
                break;

            case 5:
                do {
                    System.out.println("""
                            Mostrando submenú
                            1) Empleado Ventas
                            2) Empleado Administrativo
                            3) Empleado por horas
                            4) Volver al menú principal
                            """);
                    System.out.println("Ingrese una opcion: ");
                    opciones2 = teclado.nextInt();

                    switch (opciones2) {
                        case 1:

                            for (Empleado emp : list) {
                                if (emp instanceof EmpleadoVentas) {
                                    System.out.println(emp);
                                }
                            }
                            break;

                        case 2:

                            for (Empleado emp : list) {
                                if (emp instanceof EmpleadoAdministrativo) {
                                    System.out.println(emp);
                                }
                            }
                            break;

                        case 3:

                            for (Empleado emp : list) {
                                if (emp instanceof EmpleadoHoras) {
                                    System.out.println(emp);
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Volviendo al menú principal");
                            break;
                    }
                }while (opciones2 != 4);
                break;

            case 6:
                System.out.print("Ingrese el nombre del empleado: ");
                String nombreBuscar = teclado.next();

                Empleado empEncontrado = null;
                for (Empleado emp : list) {
                    if (emp.getNombre().equalsIgnoreCase(nombreBuscar)) {
                        empEncontrado = emp;
                        break;
                    }
                }
                do {
                    System.out.println("""
                                1) Calcular si es mayor de edad
                                2) Aumentar salario
                                3) Calcular salario
                                4) Mostrar información
                                5) Volver al menú principal
                                """);

                    System.out.println("Ingrese una opcion: ");
                    opciones3 = teclado.nextInt();

                    switch (opciones3) {
                        case 1:
                            if (empEncontrado.mayorEdad()) {
                                System.out.println("El empleado es mayor de edad");
                            } else {
                                System.out.println("El empleado es menor de edad");
                            }
                            break;
                        case 2:
                            System.out.print("Porcentaje del salario a aumentar: ");
                            double porcentaje = teclado.nextDouble();
                            empEncontrado.aumentarSalario(porcentaje);
                            break;
                        case 3:
                            System.out.println("El salario total es de: " + empEncontrado.calcularSalario());
                            break;
                        case 4:
                            empEncontrado.mostrarInfo();
                            break;
                        case 5:
                            System.out.println("Volviendoo al menú principal");
                            break;
                    }
                } while (opciones3 != 5);
                    break;

            case 7:
                System.out.println("Saliendo del programa");
                break;

        }
    } while (opciones != 7);
}


