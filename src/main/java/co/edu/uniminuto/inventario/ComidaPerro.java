package co.edu.uniminuto.inventario;
public class ComidaPerro extends Productos{
    private String marca;
    private String tamaño;
    private String comidaEspecial;

    public ComidaPerro(String codigo, String marca, double precio, String tamaño, String comidaEspecial, String descripcion, short cantidad) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.tamaño = tamaño;
        this.comidaEspecial = comidaEspecial;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getComidaEspecial() {
        return comidaEspecial;
    }

    public void setComidaEspecial(String comidaEspecial) {
        this.comidaEspecial = comidaEspecial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
