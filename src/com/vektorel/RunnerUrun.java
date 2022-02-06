package com.vektorel;

import com.vektorel.entity.Urun;

public class RunnerUrun {
    public static void main(String[] args) {
        Urun urun = new Urun();
        System.out.println(urun.toString());
        urun =
           new Urun(0,"PC",25);
        System.out.println(urun.toString());
    }
}
