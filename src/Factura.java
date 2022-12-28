public class Factura extends Presupuesto {
    private String fabricante;
    public Factura() {
        super();
        fabricante="Productos ACME S.L";
    }

    public Factura(String cliente, String descripcion, double importe) {
        super(cliente, descripcion, importe);
        this.fabricante="Productos ACME S.L";
    }

    public String obtenerPrecioFinal(){
        double resultado= getImporte()*1.21;
        return String.format("%.2f", resultado);
    }

    @Override
    public String imprimirPresupuesto(){
        return "------------------------------------------------"+"\n"+
                "Factura"+"\n"+
                "------------------------------------------------"+"\n"+
                "Cliente: "+getCliente()+"\n"+
                "------------------------------------------------"+"\n"+
                "Fabricante: "+fabricante+"\n"+
                "------------------------------------------------"+"\n"+
                "Descripcion: "+getDescripcion()+"\n"+
                "------------------------------------------------"+"\n"+
                "Importe sin IVA: "+getImporte()+"\n"+
                "------------------------------------------------"+"\n"+
                "Importe con IVA: "+obtenerPrecioFinal()+"\n"+
                "------------------------------------------------";
    }
}
