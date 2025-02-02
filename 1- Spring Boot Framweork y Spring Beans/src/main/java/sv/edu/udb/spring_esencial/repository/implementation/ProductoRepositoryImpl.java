package sv.edu.udb.spring_esencial.repository.implementation;

import sv.edu.udb.spring_esencial.repository.ProductoRepository;
import sv.edu.udb.spring_esencial.repository.domain.Producto;
import sv.edu.udb.spring_esencial.repository.ProductoRepository;

import java.util.random.RandomGenerator;




public class ProductoRepositoryImpl implements ProductoRepository {

    @Override
    public Producto guardarProducto(final String nombre, final Double precio) {
        return new Producto(RandomGenerator.of("Random").nextInt(),
                nombre, precio);
    }
}
