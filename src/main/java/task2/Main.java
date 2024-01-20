package task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("quest.xml");

        Quest quest1 = context.getBean("Q1", Quest.class);
        Quest quest2 = context.getBean("Q2", Quest.class);

        Knight knight1 = new Knight(quest1);
        Knight knight2 = new Knight(quest2);

        System.out.println(quest1.getPlay());
        System.out.println(quest2.getPlay());

        System.out.println(knight1.goQuest());
        System.out.println(knight2.goQuest());

        context.close();
    }
}

