package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextRulat("La multi ani").setOraIncepereProgram(9);

        Autobuz a1 = builder.build();

        builder.setTextRulat("Romania!").setOraIncepereProgram(9);
        Autobuz a2 = builder.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
