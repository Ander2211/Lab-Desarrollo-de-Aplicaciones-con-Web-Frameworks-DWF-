package sv.edu.udb.spring_esencial.repository.implementation;

import sv.edu.udb.spring_esencial.repository.ProveedorRepository;
import sv.edu.udb.spring_esencial.repository.domain.Producto;
import sv.edu.udb.spring_esencial.repository.domain.Proveedor;
import java.util.List;
import java.util.random.RandomGenerator;

public class ProveedorRepositoryImpl implements ProveedorRepository {
    @Override
    public Proveedor guardarProveedor(final String nombre,
                                      final List<Producto> productos) {
        return new Proveedor(RandomGenerator.of("Random").nextInt(),
                nombre, productos);
    }
}
