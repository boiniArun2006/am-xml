package bA;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: bA.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface InterfaceC1658Wre extends InterfaceC1657Ml {
    static InterfaceC1658Wre B(Bitmap bitmap, Pj0.fuX fux, eO eOVar, int i2) {
        return Xw(bitmap, fux, eOVar, i2, 0);
    }

    static InterfaceC1658Wre UhV(Pj0.j jVar, eO eOVar, int i2) {
        return dR0(jVar, eOVar, i2, 0);
    }

    int Nxk();

    int m();

    Pj0.j o();

    static InterfaceC1658Wre Xw(Bitmap bitmap, Pj0.fuX fux, eO eOVar, int i2, int i3) {
        if (C1662n.Org()) {
            return new C1662n(bitmap, fux, eOVar, i2, i3);
        }
        return new C1655Dsr(bitmap, fux, eOVar, i2, i3);
    }

    static InterfaceC1658Wre dR0(Pj0.j jVar, eO eOVar, int i2, int i3) {
        if (C1662n.Org()) {
            return new C1662n(jVar, eOVar, i2, i3);
        }
        return new C1655Dsr(jVar, eOVar, i2, i3);
    }
}
