package sv.edu.udb.spring_esencial.repository;

public interface AccountRepository {
    String findAccountNumber(final Integer userId);
}
