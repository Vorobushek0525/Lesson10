package OOP;

public class Train {
    String number;
    String color;
    private int leight;

    public int getLeight() {
        return leight;
    }

    public void setLeight(int leight) {
        if (leight < 0) {
            this.leight = 0;
        } else {
            this.leight = leight;
        }

    }

    // полиморфизм (содержит метод "конструктор")
    public Train(String number, String color, int leight) {
        this.number = number;
        this.color = color;
        if (leight < 0) {
            this.leight = 0;
        } else {
            this.leight = leight;
        }
    }

    public Train() {}

    String ChoohChooh () {
        return "Chooh-chooh! I am " + number + " I'm " + color + "  and I have " +
                + leight + " cars. ";
    }

    void fuel (String fuel, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(" I'm eating " + fuel + " ... ");
        }
    }

}
