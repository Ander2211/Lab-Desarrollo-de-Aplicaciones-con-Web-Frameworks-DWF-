package sv.edu.udb.spring_esencial.service;

public interface TransferService {
    Double transfer(final Integer useId1,
                    final Integer userId2,
                    final Double amount);
}
