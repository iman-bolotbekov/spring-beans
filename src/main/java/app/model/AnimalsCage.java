package app.model;

public class AnimalsCage {

    private Animal animal;
    private Timer timer;

    public AnimalsCage(Animal animal) {
        this.animal = animal;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
