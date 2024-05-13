package N2EX1.Classes;

public class Restaurant implements Comparable<Restaurant>{
    // Attributes
    private String name;
    private int score;

    // Constructor
    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;
    }

    // Getter
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    // compareTo()
    public int compareTo(Restaurant another){
        int result = this.name.compareTo(another.name);
        if (result == 0){
            result = Integer.compare(this.score, another.score);
        }
        return result;
    }

    // toString()
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
