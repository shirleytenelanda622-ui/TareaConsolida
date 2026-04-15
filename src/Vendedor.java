public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private int cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, int cumplimientoMeta){
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimientoMeta = cumplimientoMeta;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public int getCumplimientoMeta() {
        return cumplimientoMeta;
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido >= 0) {
            this.montoVendido = montoVendido;
        } else {
            System.out.println("Error. El monto no puede ser negativo");
        }

    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public void setCumplimientoMeta(int cumplimientoMeta) {
        this.cumplimientoMeta = cumplimientoMeta;
    }
    public double calcularComision(){
        return montoVendido * porcentajeComision / 100;
    }
    public double calcularIngresoTotal(){
        return montoVendido + calcularComision();
    }
    public String obtenerEstadoCumplimeinto(){
        if(cumplimientoMeta >= 90){
            return "Excelente";
        } else if (cumplimientoMeta > 70 && cumplimientoMeta <= 89){
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }
    public String obtenerMensajeDesempeno(){
        if(cumplimientoMeta >= 90){
            return "Vendedor con desempeño sobresaliente";
        } else if (cumplimientoMeta > 70 && cumplimientoMeta <= 89){
            return "Vendedor con desempeño aceptable";
        } else {
            return "Se requiere seguimiento comercial ";
        }
    }
    public void  mostrar(){
        System.out.println("Nombre" + nombre);
        System.out.println("Area: " + area);
        System.out.println();
        System.out.println("Monto vendido: " + getMontoVendido());
        System.out.println("Comision: " + calcularComision());
        System.out.println("Ingreso total: " + calcularIngresoTotal());
        System.out.println();
        System.out.println("Cumplimiento: " + obtenerEstadoCumplimeinto());
        System.out.println("Mensaje final: " + obtenerMensajeDesempeno());
    }
}
