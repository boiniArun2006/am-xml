package bA;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: bA.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C1662n extends AbstractC1661j implements InterfaceC1658Wre {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f43200g;
    private Pj0.j J2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f43201S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f43202Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final eO f43203o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Bitmap f43204r;

    protected C1662n(Bitmap bitmap, Pj0.fuX fux, eO eOVar, int i2, int i3) {
        this.f43204r = (Bitmap) Hh.C.Uo(bitmap);
        this.J2 = Pj0.j.Mx(this.f43204r, (Pj0.fuX) Hh.C.Uo(fux));
        this.f43203o = eOVar;
        this.f43202Z = i2;
        this.f43201S = i3;
    }

    private synchronized Pj0.j fcU() {
        Pj0.j jVar;
        jVar = this.J2;
        this.J2 = null;
        this.f43204r = null;
        return jVar;
    }

    @Override // bA.InterfaceC1656I28
    public synchronized boolean isClosed() {
        return this.J2 == null;
    }

    @Override // bA.InterfaceC1658Wre
    public synchronized Pj0.j o() {
        return Pj0.j.T(this.J2);
    }

    public static boolean Org() {
        return f43200g;
    }

    private static int n1(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int qm(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // bA.InterfaceC1658Wre
    public int Nxk() {
        return this.f43201S;
    }

    @Override // bA.InterfaceC1656I28
    public int getHeight() {
        int i2;
        return (this.f43202Z % 180 != 0 || (i2 = this.f43201S) == 5 || i2 == 7) ? qm(this.f43204r) : n1(this.f43204r);
    }

    @Override // bA.InterfaceC1656I28
    public int getSizeInBytes() {
        return com.facebook.imageutils.Ml.mUb(this.f43204r);
    }

    @Override // bA.InterfaceC1656I28
    public int getWidth() {
        int i2;
        return (this.f43202Z % 180 != 0 || (i2 = this.f43201S) == 5 || i2 == 7) ? n1(this.f43204r) : qm(this.f43204r);
    }

    @Override // bA.InterfaceC1657Ml
    public Bitmap hRu() {
        return this.f43204r;
    }

    @Override // bA.InterfaceC1658Wre
    public int m() {
        return this.f43202Z;
    }

    @Override // bA.AbstractC1661j, bA.InterfaceC1656I28
    public eO mYa() {
        return this.f43203o;
    }

    @Override // bA.InterfaceC1656I28, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Pj0.j jVarFcU = fcU();
        if (jVarFcU != null) {
            jVarFcU.close();
        }
    }

    protected C1662n(Pj0.j jVar, eO eOVar, int i2, int i3) {
        Pj0.j jVar2 = (Pj0.j) Hh.C.Uo(jVar.Z());
        this.J2 = jVar2;
        this.f43204r = (Bitmap) jVar2.eF();
        this.f43203o = eOVar;
        this.f43202Z = i2;
        this.f43201S = i3;
    }
}
