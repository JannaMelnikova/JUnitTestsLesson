package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Тестирование калькулятора")
public class CalculationTest {
    private Claculation claculation ;
    private int a=20;
    private int b=10;



    @BeforeEach
    public void createClaculation() {
        claculation = new Claculation();
        System.out.println("calc init");
    }

    @AfterEach
    public void reseatClaculation() {
        claculation = null;
        System.out.println("calc  = null");
    }

    @Tag("baseMethodsCalc")
    @DisplayName("Тестирование метода плюс")
    @Test
    public void testPlus() {
        int result = claculation.plus(a,b);
        Assertions.assertEquals(30,result);
    }
    @Tag("baseMethodsCalc")
    @Test
    public void testMinus() {
        int result = claculation.minus(20, 5);
        Assertions.assertEquals(15,result);
    }
    @Tag("dopMethodsCalc")
    @Test
    public void testUmnozh() {

        int result = claculation.umnozh(20, 5);
        Assertions.assertEquals(100, result);

    }
    @Tag("dopMethodsCalc")
    @Test
    public void testDelenie() {
        //Assertions.assertEquals(5.1f, claculation.delenie(10.2f,2.0f));
       // Assertions.assertEquals(2.0f, claculation.delenie(20.8f, 10.4f));
        //Assertions.assertEquals(2.0f, claculation.delenie(10f, 5f));

    }


    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    public void testEvenNumber(int n) {
        Assertions.assertEquals(true,claculation.evenNumber(n));
    }
    @Tag("dopMethodsCalc")
    @Test
    public void testDelenieByZero() {
        Assertions.assertThrows(ArithmeticException.class, ()-> claculation.delenie(10,0));
    }



 }
