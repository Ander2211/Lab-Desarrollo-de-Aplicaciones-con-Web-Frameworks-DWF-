package sv.edu.udb.spring_esencial.configuracion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sv.edu.udb.spring_esencial.repository.AccountRepository;
import  sv.edu.udb.spring_esencial.repository.implementation.JdbcAccountRepository;
import sv.edu.udb.spring_esencial.service.TransferService;
import sv.edu.udb.spring_esencial.service.implementation.TransferServiceImpl;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {
    //Hay muchas formas de hacer la referencia de dependecias
    // 1. Por referencia del metodo
    // return new TransferServiceImpl(accountRepository ()); //llamada al metodo

    // 2. Por paso de argumento que es la forma que
    // estamos utilizando en el ejemplo
    @Bean
    public TransferService transferService(final AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }
    @Bean
    public AccountRepository accountRepository(final DataSource dataSource) {
        return new JdbcAccountRepository(dataSource);
    }

}
