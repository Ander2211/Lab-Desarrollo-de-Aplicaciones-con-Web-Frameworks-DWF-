package sv.edu.udb.spring_esencial.repository;

import sv.edu.udb.spring_esencial.repository.domain.Producto;
import sv.edu.udb.spring_esencial.repository.domain.Proveedor;

import java.util.List;


public interface ProveedorRepository {
    Proveedor guardarProveedor(final String nombre, final List<Producto> productos);
}
