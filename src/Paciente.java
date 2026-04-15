public class Paciente {
    private String nombre;
    private int numeroIdentificacion;
    private String tipoSeguroMedico;
    private int edad;
    private double costoConsulta;
    private int numeroConsultasRealizadas;
    private int nivelPrioridad;
    //Constructor
    public Paciente(String nombre, int numeroIdentificacion, String tipoSeguroMedico, int edad, double costoConsulta, int numeroConsultasRealizadas, int nivelPrioridad){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoSeguroMedico = tipoSeguroMedico;
        this.edad = edad;
        this.costoConsulta = costoConsulta;
        this.numeroConsultasRealizadas = numeroConsultasRealizadas;
        this.nivelPrioridad = nivelPrioridad;
    }
    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getTipoSeguroMedico() {
        return tipoSeguroMedico;
    }

    public int getEdad() {
        return edad;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public int getNumeroConsultasRealizadas() {
        return numeroConsultasRealizadas;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }
    //Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setTipoSeguroMedico(String tipoSeguroMedico) {
        this.tipoSeguroMedico = tipoSeguroMedico;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser 0");
        }

    }

    public void setCostoConsulta(double costoConsulta) {
        if(costoConsulta > 0){
            this.costoConsulta = costoConsulta;
        } else {
            System.out.println("El costo debe ser mayor a 0");
        }

    }

    public void setNumeroConsultasRealizadas(int numeroConsultasRealizadas) {
        if(numeroConsultasRealizadas > 0){
            this.numeroConsultasRealizadas = numeroConsultasRealizadas;
        } else {
            System.out.println("Error. No puede ser cero");
        }
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 5){
            this.nivelPrioridad = nivelPrioridad;
        } else {
            System.out.println("Nivel de prioridad incorrecto");
        }

    }
    public double costoTotal(){
        return costoConsulta * numeroConsultasRealizadas;
    }
    public String tipoSegurMedico(){
        if(tipoSeguroMedico.equals("Basico")){
            return "10%";
        } else if (tipoSeguroMedico.equals("Premium")){
            return "20%";
        } else {
            return "Sin descuento";
        }
    }
    public double costoFinal(){
        if(tipoSeguroMedico.equals("Basico")){
            return costoTotal() * 0.9;
        } else if (tipoSeguroMedico.equals("Premium")){
            return costoTotal() * 0.8;
        } else {
            return costoTotal();
        }
    }
    public String nivelPrioridadMedica(){
        if(nivelPrioridad == 1){
            return "Atencion baja";
        } else if (nivelPrioridad == 2){
            return "Atencion leve";
        } else if (nivelPrioridad == 3){
            return  "Atencion moderada";
        } else if (nivelPrioridad == 4){
            return  "Atencion urgente";
        } else {
            return "Atencion critica";
        }
    }
    public String clasificacionPaciente(){
        if(nivelPrioridad == 4 || nivelPrioridad == 5){
            return "Alta prioridad";
        } else if (nivelPrioridad == 2 || nivelPrioridad == 3){
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }
    public String mensajeAtencion(){
        if(clasificacionPaciente() == "Alta prioridad"){
            return "Atencion inmediata requerida";
        } else if (clasificacionPaciente() == "Prioridad media"){
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }
    public void mostar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getNumeroIdentificacion());
        System.out.println("Seguro: " + getTipoSeguroMedico());
        System.out.println("Edad: " + getEdad());
        System.out.println();
        System.out.println("Costo por consulta: " + getCostoConsulta());
        System.out.println("Numero de consultas: " + getNumeroConsultasRealizadas());
        System.out.println("Costo total: " + costoTotal());
        System.out.println("Descuento: " + tipoSegurMedico());
        System.out.println("Costo final: " + costoFinal());
        System.out.println();
        System.out.println("Clasificacion: " + clasificacionPaciente());
        System.out.println("Mensaje: " + mensajeAtencion());
    }
}
