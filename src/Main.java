//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PiezaIndustrial pieza1 = new PiezaIndustrial("P001", 100.2, 100.0);
    PiezaIndustrial pieza2 = new PiezaIndustrial("P002", 101.0, 100.0);

    System.out.println("Pieza " + pieza1.getCodigoPieza() + ": " +
            (pieza1.esAceptable() ? "ACEPTADA" : "RECHAZADA"));

    System.out.println("Pieza " + pieza2.getCodigoPieza() + ": " +
            (pieza2.esAceptable() ? "ACEPTADA" : "RECHAZADA"));
}
