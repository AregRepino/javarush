package com.tinkof;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = A + B;


        if (count >= N) {
            System.out.println(N);
        } else {
            System.out.println(count);
        }

        bufferedReader.close();


    }
}


//    Бабушка подарила Лизе две коробки с конфетами: в первой коробке ﻿AA﻿ конфет, а во второй — ﻿BB﻿ конфет. Мама Лизы не разрешает ей есть больше, чем ﻿NN﻿ конфет в день. Сколько конфет сегодня сможет съесть Лиза (при условии, что ей хочется съесть как можно больше конфет)?
//
//
//        Формат входных данных
//
//        В трех строках вводятся три целых положительных числа: ﻿AA﻿, ﻿BB﻿, ﻿NN﻿ (﻿1 \le A, B, N \le 10001≤A,B,N≤1000﻿).
//
//
//        Формат выходных данных
//
//        Выведите одно число — максимальное количество конфет, которое может съесть Лиза.
//
//
//        Замечание
//
//        В первом примере Лиза может съесть ﻿22﻿ конфеты из первой коробки и ﻿33﻿ конфеты из второй коробки. Во втором примере мама Лизы не разрешит ей съесть больше, чем одну конфету.