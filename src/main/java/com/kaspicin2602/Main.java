package com.kaspicin2602;

public class Main {
    public static void main(String[] args) {
        //Примитивные типы
        byte varByte1 = 127;
        byte varByte2 = -128;
        short varShort1 = -32768;
        short varShort2 = 32760;
        long varLong1 = 100L;
        long varLong2 = 10L;
        double varDouble1 = 11.5d;
        double varDouble2 = 12.5d;
        int varInt1 = 2000;
        int varInt2 = 1000;
        float varFloat1 = 0.5f;
        float varFloat2 = 0.5f;
        char varChar1 = 'a';
        char varChar2 = 'b';
        boolean isTrue = false;

        //Математические операторы
        System.out.println((char) 27 + "[33m########## Математические операторы ############");
        System.out.println("Byte: " + (varByte1 + varByte2));
        System.out.println("Float: " + (varFloat1 % varFloat2));
        System.out.println("Double: " + (varDouble1 * varDouble2));
        System.out.println("Int: " + (varInt1 / varInt2));
        System.out.println("Long: " + (varLong1 / varLong2));
        System.out.println("Short: " + (varShort1 - varShort2));
        System.out.println("Char: " + (varChar1 + varChar2));
        System.out.println("Byte + Int: " + (varByte1 + varInt1));
        System.out.println("Double + Int: " + (varDouble1 + varInt1));

        //Переполнение
        System.out.println((char) 27 + "[33m########## Переполнение ############");
        System.out.println((byte) (varByte2 + 2));
        System.out.println((short) (varShort2 + 10));

        //Логические операторы
        System.out.println((char) 27 + "[33m########## Логические операторы ############");
        if (isTrue) {
            System.out.println("истина");
        } else {
            System.out.println("лож");
        }
        System.out.println("##########################");

        if (varInt1 > varInt2) {
            System.out.println("VarInt1 больше VarInt2");
        } else if (varInt1 < varInt2) {
            System.out.println("VarInt1 меньше VarInt2");
        } else {
            System.out.println("VarInt1 равна VarInt2");
        }
    }
}