package org.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class OrderManagementServiceTest {

    @Mock
    Delivery mockDeliver;
    @Mock
    Engine engine;
    @Spy
    private NameConverter nameConverter;



    @Test
    public void getFullNameByName(){
        //spy
        nameConverter.getFullNameByName("Тамара");
        Mockito.verify(nameConverter,Mockito.times(1)).getFullName("Тамара",null);


    }
    @Test
    public void getFullNameBySurname(){
        //spy
        nameConverter.getFullNameBySurname("Петрова");
        Mockito.verify(nameConverter,Mockito.times(1)).getFullName(null,"Петрова");
        System.out.println(nameConverter.getFullNameBySurname("Петрова"));

    }

    @Test
    public void test() {
        //стаб
        //Car car=new Car(engine);
        //System.out.println(car.getEnginePower());
        //Mockito.when(engine.getPower()).thenReturn(500);
        //System.out.println(engine.getPower());

        Mockito.when(engine.countWheels(Mockito.anyInt(),Mockito.anyInt())).thenReturn(99);
        System.out.println(engine.countWheels(123,12321));

        //Mockito.when(engine.countWheels(1, 5)).thenReturn(10);
        //System.out.println(engine.countWheels(1, 4));

        Mockito.when(engine.calcSalary(0, 0, 0)).thenReturn(500);
        Assert.assertEquals(500, engine.calcSalary(0, 0, 0));


    }

    @Test
    public void assignToCourierTest() {
        //мок
        mockDeliver.setName("ura");
        Mockito.verify(mockDeliver, Mockito.times(1)).setName("ura");
        Mockito.verify(mockDeliver,Mockito.times(1)).setName(Mockito.anyString());
    }
}