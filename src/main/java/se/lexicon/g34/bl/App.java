package se.lexicon.g34.bl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.g34.bl.config.ComponentScanConfig;
import se.lexicon.g34.bl.data_access.StudentDao;
import se.lexicon.g34.bl.util.UserInputService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext((ComponentScanConfig.class));
        StudentDao studentDao=context.getBean(StudentDao.class);

        UserInputService userInputService = context.getBean(UserInputService.class);
    }
}
