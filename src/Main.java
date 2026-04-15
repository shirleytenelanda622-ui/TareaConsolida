//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 1.	Control de facturación y desempeño de ventas
//Enunciado
/*Una empresa comercial desea desarrollar un sistema para registrar información de sus vendedores y analizar el resultado de una venta realizada.
    De cada vendedor interesa conocer su nombre, su área de trabajo, el monto total vendido, el porcentaje de comisión y el cumplimiento de meta.
*/
public class Main {
    public static void main(String[] args) {
        Vendedor ven1 = new Vendedor("Andrea Lopez", "Tecnologia", 2850.75, 8, 92);
        ven1.mostrar();
    }
}
