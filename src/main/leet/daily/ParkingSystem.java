package main.leet.daily;

public class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 3 && small > 0) {
            small--;
        } else if (carType == 2 && medium > 0) {
            medium--;
        } else if (carType == 1 && big > 0) {
            big--;
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        boolean param_1 = obj.addCar(2);
        System.out.println(param_1);
    }
}
