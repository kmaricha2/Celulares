package com.example.keiller.celularesr;

import com.example.keiller.celularesr.Metodos;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }



    @Test
    public void celulares_samgung_con_ram_de_2_a_4_gb2() throws Exception {
        Celular c1 = new Celular(0, 0, 1,1, 1000);
        Celular c2 = new Celular(0, 0, 0,3, 1000);
        Celular c3 = new Celular(1, 0, 0,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 1000);
        Celular c5 = new Celular(2, 0, 0,2, 1000);
        Celular c6 = new Celular(3, 0, 1,2, 1000);
        Celular c7 = new Celular(3, 0, 0,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};
        Celular samsung_2_a_4_ram[] = {c2};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));
        ArrayList<Celular> sams = new ArrayList<>(Arrays.asList(samsung_2_a_4_ram));

        Assert.assertEquals(sams, Metodos.ram_Samsung(cels));
    }

    @Test
    public void celulares_samgung_con_ram_de_2_a_4_gb3() throws Exception {
        Celular c1 = new Celular(0, 0, 0,1, 1000);
        Celular c2 = new Celular(0, 0, 0,1, 1000);
        Celular c3 = new Celular(1, 0, 0,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 1000);
        Celular c5 = new Celular(2, 0, 0,2, 1000);
        Celular c6 = new Celular(3, 0, 1,2, 1000);
        Celular c7 = new Celular(3, 0, 1,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};
        Celular vacio[] = {};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));
        ArrayList<Celular> vac = new ArrayList<>(Arrays.asList(vacio));

        assertEquals(vac, Metodos.ram_Samsung(cels));
    }


    @Test
    public void apple_color_negro() throws Exception {
        Celular c1 = new Celular(0, 0,1, 2, 1000);
        Celular c2 = new Celular(0, 0, 0,3, 1000);
        Celular c3 = new Celular(1, 0, 0,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 1000);
        Celular c5 = new Celular(2, 1, 1,2, 1000);
        Celular c6 = new Celular(2, 0, 1,2, 1000);
        Celular c7 = new Celular(3, 0, 0,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));

        assertEquals(1, Metodos.apples_negros(cels));
    }

    @Test
    public void apple_color_negro2() throws Exception {
        Celular c1 = new Celular(0, 0,1, 2, 1000);
        Celular c2 = new Celular(0, 0, 1,3, 1000);
        Celular c3 = new Celular(1, 0, 1,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 1000);
        Celular c5 = new Celular(2, 0, 1,2, 1000);
        Celular c6 = new Celular(2, 0, 0,2, 1000);
        Celular c7 = new Celular(3, 0, 0,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));

        assertEquals(2, Metodos.apples_negros(cels));

    }



    @Test
    public void precio_promedio_marca_nokia1() throws Exception {
        Celular c1 = new Celular(0, 0, 0,2, 1000);
        Celular c2 = new Celular(0, 0, 1,3, 1000);
        Celular c3 = new Celular(1, 0, 1,2, 1000);
        Celular c4 = new Celular(2, 0, 1,2, 1000);


        Celular celulares[] = {c1, c2, c3, c4 };

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));

        assertEquals(1000, Metodos.promedio_nokias(cels), 0);

    }

    @Test
    public void precio_promedio_marca_nokia2() throws Exception {
        Celular c1 = new Celular(0, 0, 0,2, 1000);
        Celular c2 = new Celular(0, 0, 0,3, 1000);
        Celular c3 = new Celular(1, 0, 0,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 2000);
        Celular c5 = new Celular(2, 1, 0,2, 1000);
        Celular c6 = new Celular(3, 0, 0,2, 1000);
        Celular c7 = new Celular(3, 0, 0,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));

        assertEquals(1500, Metodos.promedio_nokias(cels), 0);

    }
    @Test
    public void huawei_color_blanco() throws Exception {
        Celular c1 = new Celular(0, 0,1, 2, 1000);
        Celular c2 = new Celular(0, 0, 0,3, 1000);
        Celular c3 = new Celular(1, 0, 0,2, 1000);
        Celular c4 = new Celular(1, 0, 0,2, 1000);
        Celular c5 = new Celular(2, 1, 1,2, 1000);
        Celular c6 = new Celular(2, 0, 1,2, 1000);
        Celular c7 = new Celular(3, 0, 0,2, 1000);

        Celular celulares[] = {c1, c2, c3, c4, c5, c6, c7};

        ArrayList<Celular> cels = new ArrayList<>(Arrays.asList(celulares));

        assertEquals(1, Metodos.huawei_blancos(cels));
    }
    }

