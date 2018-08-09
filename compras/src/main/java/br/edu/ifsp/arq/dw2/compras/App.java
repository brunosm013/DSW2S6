package br.edu.ifsp.arq.dw2.compras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.edu.ifsp.arq.dw2.compras.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Checkout checkout = context.getBean(Checkout.class);
        checkout.finalizar();
        
        ((ConfigurableApplicationContext)context).close();
    }
}
