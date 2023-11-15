package ru.netology.services.JavaqaPackage;

public class RestService {
<<<<<<< HEAD
    public int calcRest(int income, int expenses, int threshold) {
=======
    
    public int calcRest(int income, int expenses, int threshold){
>>>>>>> b5b48976b05d5b7f7780703bba964895bb93d801
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income;
            }

        }
        return count;
    }
}
