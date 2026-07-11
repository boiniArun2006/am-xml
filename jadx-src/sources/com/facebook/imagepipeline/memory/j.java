package com.facebook.imagepipeline.memory;

import Hh.C;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f52430O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f52431n;
    private final boolean nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Queue f52432t;

    public boolean J2() {
        return this.f52430O + nr() > this.rl;
    }

    public void O() {
        this.f52430O++;
    }

    public Object Uo() {
        return this.f52432t.poll();
    }

    void n(Object obj) {
        this.f52432t.add(obj);
    }

    int nr() {
        return this.f52432t.size();
    }

    public void rl() {
        C.xMQ(this.f52430O > 0);
        this.f52430O--;
    }

    public j(int i2, int i3, int i5, boolean z2) {
        boolean z3;
        boolean z4;
        if (i2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C.xMQ(z3);
        if (i3 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C.xMQ(z4);
        C.xMQ(i5 >= 0);
        this.f52431n = i2;
        this.rl = i3;
        this.f52432t = new LinkedList();
        this.f52430O = i5;
        this.nr = z2;
    }

    public void KN(Object obj) {
        boolean z2;
        C.Uo(obj);
        if (this.nr) {
            if (this.f52430O > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C.xMQ(z2);
            this.f52430O--;
            n(obj);
            return;
        }
        int i2 = this.f52430O;
        if (i2 > 0) {
            this.f52430O = i2 - 1;
            n(obj);
        } else {
            Dzy.j.mUb("BUCKET", "Tried to release value %s from an empty bucket!", obj);
        }
    }

    public Object t() {
        Object objUo = Uo();
        if (objUo != null) {
            this.f52430O++;
        }
        return objUo;
    }
}
