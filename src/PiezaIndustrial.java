public class PiezaIndustrial {

    private String codigoPieza;
    private double longitudMilimetros;
    private double longitudEstandar;

    public PiezaIndustrial(String codigoPieza, double longitudMilimetros, double longitudEstandar) {

        if (longitudMilimetros <= 0 || longitudEstandar <= 0) {
            System.out.println("Las longitudes deben ser positivas.");
            return;
        }

        this.codigoPieza = codigoPieza;
        this.longitudMilimetros = longitudMilimetros;
        this.longitudEstandar = longitudEstandar;
    }

    public boolean esAceptable() {
        double diferencia = Math.abs(longitudMilimetros - longitudEstandar);
        return diferencia <= 0.5;
    }

    public String getCodigoPieza() {
        return codigoPieza;
    }
}
