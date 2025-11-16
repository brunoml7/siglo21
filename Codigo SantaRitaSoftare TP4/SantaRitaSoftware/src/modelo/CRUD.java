package modelo;

/**
 *
 * @author bruno
 */

import java.util.List;

//Dentro de estre CRUD ( Create, Read, Update, Delete - Crear, Leer, Actualizar y Eliminar) Definiré los metodos
public interface CRUD {
    public List listar();
    public int add(Object[] o);
    public int actualizar (Object[] o);
    public void eliminar (int codCliente);

} //Fin de Interface CRUD
