
package inventario;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrosProductos {
     public static Vector<InventarioProductos> leerProductos(){
        Vector<InventarioProductos> productos = new Vector<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(Main.registros));
            while( true ){
           InventarioProductos producto = (InventarioProductos) ois.readObject();
           productos.add(producto);
          }
        
        }catch(EOFException ex){
            System.out.println("Final del archivo");       
        } catch (IOException ex) { 
            
        } catch (ClassNotFoundException ex) {
            
        }finally{
            return productos;
        }           
    }
        public static void escribirProductos(Vector<InventarioProductos> productos){
            ObjectOutputStream oos = null;
            try {
              oos = new ObjectOutputStream ( 
                      new FileOutputStream(Main.registros));
          for(InventarioProductos producTemp : productos){
              oos.writeObject(producTemp);
          }
          } catch (IOException ex) {
              Logger.getLogger(RegistrosProductos.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(RegistrosProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
          }
        }
}
