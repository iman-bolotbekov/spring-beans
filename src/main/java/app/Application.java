package app;

import app.config.AppConfig;
import app.model.Animal;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        for (int i = 0; i < 5; i++) {
            Animal dog =
                    context.getBean("dog", Animal.class);
            Animal cat =
                    context.getBean("cat", Animal.class);
            AnimalsCage animalsCage1 = new AnimalsCage(dog);
            AnimalsCage animalsCage2 = new AnimalsCage(cat);

            animalsCage1.whatAnimalSay();
            animalsCage2.whatAnimalSay();
        }

    }
}
