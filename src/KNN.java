public abstract class KNN {
    abstract void lookData();

    abstract void calculateDistances();

    void findNeighbours(){
        System.out.println("Enconctrando vecinos");
    }

    void vote(){
        System.out.println("Votando");
    }
}
