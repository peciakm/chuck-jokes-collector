package pl.sda.chuckjokescollector.polimorfizm;


public interface C {

    default void printMyName() {
        System.out.println(this.getClass().getSimpleName());

    }
    String getStatus();


}
