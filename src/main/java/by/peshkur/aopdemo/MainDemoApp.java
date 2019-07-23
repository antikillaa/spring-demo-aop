package by.peshkur.aopdemo;

import by.peshkur.aopdemo.dao.AccountDAO;
import by.peshkur.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {
        // read spring congig class

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get bean from spring container

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);


        // call the business method
        accountDAO.addAccount();

        //call membership method
        membershipDAO.addAccount();

        // close the context
        context.close();
    }
}
