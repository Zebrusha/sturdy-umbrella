package ru.netology.services.JavaqaPackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RestServiceTest {

    @Test
    void Howrestifnotenought() {
        RestService service = new RestService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calcRest(income, expenses, threshold);


        Assertions.assertEquals(income, expenses, threshold);


    }

    @Test
    void Howrestifalot() {
        RestService service = new RestService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(income, expenses, threshold);


    }

}
