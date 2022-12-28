public class Presupuesto {
    private String cliente;
    private String descripcion;
    private double importe;

    public Presupuesto() {
    }

    public Presupuesto(String cliente, String descripcion, double importe) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }


    public String imprimirPresupuesto() {
        return "Datos del presupuesto: \n"+
                "Cliente: "+cliente+"\n"+
                "Descripcion: "+descripcion+"\n"+
                "Importe: "+importe;
    }
}
