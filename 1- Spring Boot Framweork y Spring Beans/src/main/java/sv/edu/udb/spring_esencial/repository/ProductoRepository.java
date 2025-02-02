package sv.edu.udb.spring_esencial.repository;

import sv.edu.udb.spring_esencial.repository.domain.Producto;

public interface ProductoRepository {

    Producto guardarProducto(final String nombre, final Double precio);
}
