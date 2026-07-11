package com.facebook.imagepipeline.memory;

import Hh.C;
import java.util.LinkedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class Wre extends j {
    private LinkedList J2;

    public Wre(int i2, int i3, int i5) {
        super(i2, i3, i5, false);
        this.J2 = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.j
    public Object Uo() {
        Pj0.Wre wre = (Pj0.Wre) this.f52432t.poll();
        C.Uo(wre);
        Object objRl = wre.rl();
        wre.n();
        this.J2.add(wre);
        return objRl;
    }

    @Override // com.facebook.imagepipeline.memory.j
    void n(Object obj) {
        Pj0.Wre wre = (Pj0.Wre) this.J2.poll();
        if (wre == null) {
            wre = new Pj0.Wre();
        }
        wre.t(obj);
        this.f52432t.add(wre);
    }
}
