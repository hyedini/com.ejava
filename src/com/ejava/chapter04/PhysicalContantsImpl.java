package com.ejava.chapter04;

public class PhysicalContantsImpl implements PhysicalConstants {

    public static void main(String[] args) {
        // 1. 상수 인터페이스 :: 사용 지양
        System.out.println(AVOGADRO_NUMBER);
        System.out.println(BOLZMANN_CONSTANT);
        System.out.println(ELECTRON_MASS);

        // 2. 상수 유틸리티 클래스 :: 사용 지향
        double mols = 1;
        PhysicalContantsImpl pcimpl = new PhysicalContantsImpl();
        System.out.println(pcimpl.atoms(mols));
    }

    double atoms(double mols) {
        return PhysicalConstantsCare.AVOGADRO_NUMBER * mols;
    }
}
