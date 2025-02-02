package sv.edu.udb.spring_esencial.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import sv.edu.udb.spring_esencial.configuracion.TestInfrastructureConfig;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp(){
        //Creacion del contexto a traves del archivo de configuracion
        context =SpringApplication.run(TestInfrastructureConfig.class);
    }

    @Test
    void getBeanByCastAndTransferMoney(){
        final TransferService transferService =(TransferService)context.getBean("transferService");
        //Utilizando Bean
        assertNotNull(transferService);
        final Double amoTransfered = transferService.transfer(1,2,20D);
        assertEquals(400,amoTransfered);
    }

    @Test
    void getBeanTypeMethodAndTransferMoney() {
        //Obteniendo el bean
        final TransferService transferService = context.getBean("transferService",
                TransferService.class);
        assertNotNull(transferService); //Not null object
        final Double amountTransfered = transferService.transfer(1, 2, 20D);
        assertEquals(400D, amountTransfered);
    }
    @Test
    void getBeanByBeanIdWhenIdIsUniqueAndTransferMoney() {
        //Obteniendo el bean
        final TransferService transferService = context.getBean(TransferService.class);
        assertNotNull(transferService); //Not null object
        final Double amountTransfered = transferService.transfer(1, 2, 20D);
        assertEquals(400D, amountTransfered);
    }


}
