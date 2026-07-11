package Hwc;

import OLt.fuX;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bA.InterfaceC1656I28;
import bA.InterfaceC1658Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j implements ypp.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Resources f3998n;
    private final ypp.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ypp.j f3999t;

    @Override // ypp.j
    public boolean rl(InterfaceC1656I28 interfaceC1656I28) {
        return true;
    }

    public j(Resources resources, ypp.j jVar, ypp.j jVar2) {
        this.f3998n = resources;
        this.rl = jVar;
        this.f3999t = jVar2;
    }

    private static boolean nr(InterfaceC1658Wre interfaceC1658Wre) {
        if (interfaceC1658Wre.m() != 0 && interfaceC1658Wre.m() != -1) {
            return true;
        }
        return false;
    }

    private static boolean t(InterfaceC1658Wre interfaceC1658Wre) {
        if (interfaceC1658Wre.Nxk() != 1 && interfaceC1658Wre.Nxk() != 0) {
            return true;
        }
        return false;
    }

    @Override // ypp.j
    public Drawable n(InterfaceC1656I28 interfaceC1656I28) {
        try {
            if (T5.n.nr()) {
                T5.n.n("DefaultDrawableFactory#createDrawable");
            }
            if (interfaceC1656I28 instanceof InterfaceC1658Wre) {
                InterfaceC1658Wre interfaceC1658Wre = (InterfaceC1658Wre) interfaceC1656I28;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f3998n, interfaceC1658Wre.hRu());
                if (!nr(interfaceC1658Wre) && !t(interfaceC1658Wre)) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                    return bitmapDrawable;
                }
                fuX fux = new fuX(bitmapDrawable, interfaceC1658Wre.m(), interfaceC1658Wre.Nxk());
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return fux;
            }
            ypp.j jVar = this.rl;
            if (jVar != null && jVar.rl(interfaceC1656I28)) {
                Drawable drawableN = this.rl.n(interfaceC1656I28);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableN;
            }
            ypp.j jVar2 = this.f3999t;
            if (jVar2 != null && jVar2.rl(interfaceC1656I28)) {
                Drawable drawableN2 = this.f3999t.n(interfaceC1656I28);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableN2;
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return null;
        } catch (Throwable th) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th;
        }
    }
}
