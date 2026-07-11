package fJf;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class nKK {
    public boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f66890O;
    public final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f66891n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseIntArray f66892t;

    public nKK(int i2, int i3, SparseIntArray sparseIntArray) {
        this(i2, i3, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public nKK(int i2, int i3, SparseIntArray sparseIntArray, int i5, int i7, int i8) {
        Hh.C.xMQ(i2 >= 0 && i3 >= i2);
        this.rl = i2;
        this.f66891n = i3;
        this.f66892t = sparseIntArray;
        this.nr = i5;
        this.f66890O = i7;
        this.Uo = i8;
    }
}
