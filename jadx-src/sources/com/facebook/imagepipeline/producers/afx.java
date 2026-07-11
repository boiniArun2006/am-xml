package com.facebook.imagepipeline.producers;

import android.net.Uri;
import dX.C1954n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class afx {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C1954n f52538O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f52539n;
    private int nr;
    private final mz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f52540t = 0;

    public C1954n J2() {
        return this.f52538O;
    }

    public void KN(long j2) {
        this.f52540t = j2;
    }

    public int O() {
        return this.nr;
    }

    public Uri Uo() {
        return this.rl.M().WPU();
    }

    public Pl n() {
        return this.f52539n;
    }

    public InterfaceC1866p nr() {
        return this.rl.M7();
    }

    public mz rl() {
        return this.rl;
    }

    public long t() {
        return this.f52540t;
    }

    public afx(Pl pl, mz mzVar) {
        this.f52539n = pl;
        this.rl = mzVar;
    }
}
