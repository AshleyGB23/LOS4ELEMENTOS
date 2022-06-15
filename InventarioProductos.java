
package inventario;

import java.io.Serializable;



public class InventarioProductos implements Serializable{
    private String cantidad;
    private String producto;
    private String tipoProducto;
    private String proveedor;
    private String sucursal;




    public InventarioProductos(String cantidad, String producto, String tipoProducto,String proveedor, String sucursal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.tipoProducto = tipoProducto;
        this.proveedor = proveedor;
        this.sucursal = sucursal;
    }



    public String getCantidad() {
        return cantidad;
    }



    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }



    public String getProducto() {
        return producto;
    }



    public void setProducto(String producto) {
        this.producto = producto;
    }



    public String getTipoProducto() {
        return tipoProducto;
    }



    public void setTipoProducto(String tipoProducto) {
    this.tipoProducto = tipoProducto;
    }



    public String getProveedor() {
    return proveedor;
    }



    public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
    }



    public String getSucursal() {
    return sucursal;
    }



    public void setSucursal(String sucursal) {
    this.sucursal = sucursal;
    }



    @Override
    public String toString() {
    return "InventarioProductos{" + "cantidad=" + cantidad + ", producto=" + producto + ", tipoProducto=" + tipoProducto + ", proveedor=" + proveedor + ", sucursal=" + sucursal + '}';
    }



}