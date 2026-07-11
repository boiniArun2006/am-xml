package n;

import OLt.DAz;
import QVk.Dsr;
import QVk.I28;
import QVk.Pl;
import QVk.aC;
import QVk.n;
import bA.InterfaceC1664qz;
import java.io.Closeable;

/* JADX INFO: renamed from: n.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C2305n extends QVk.j implements Closeable, DAz {
    private final aC J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Jv.n f71000O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f71001Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Dsr f71002o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Dsr f71003r;

    public C2305n(Jv.n nVar, aC aCVar, Dsr dsr) {
        this(nVar, aCVar, dsr, true);
    }

    private void eF(aC aCVar, long j2) {
        aCVar.U(false);
        aCVar.wTp(j2);
        z(aCVar, Pl.f8187o);
    }

    public void M(aC aCVar, long j2) {
        aCVar.U(true);
        aCVar.jB(j2);
        z(aCVar, Pl.f8188r);
    }

    @Override // OLt.DAz
    public void onDraw() {
    }

    public C2305n(Jv.n nVar, aC aCVar, Dsr dsr, boolean z2) {
        this.f71002o = null;
        this.f71000O = nVar;
        this.J2 = aCVar;
        this.f71003r = dsr;
        this.f71001Z = z2;
    }

    private void z(aC aCVar, Pl pl) {
        this.f71003r.rl(aCVar, pl);
        Dsr dsr = this.f71002o;
        if (dsr != null) {
            dsr.rl(aCVar, pl);
        }
    }

    public void FX() {
        this.J2.WPU();
    }

    @Override // QVk.j, QVk.n
    /* JADX INFO: renamed from: M7, reason: merged with bridge method [inline-methods] */
    public void Z(String str, InterfaceC1664qz interfaceC1664qz, n.j jVar) {
        long jNow = this.f71000O.now();
        aC aCVar = this.J2;
        aCVar.e(jVar);
        aCVar.g(jNow);
        aCVar.nHg(jNow);
        aCVar.te(str);
        aCVar.X(interfaceC1664qz);
        a(aCVar, I28.f8176Z);
    }

    @Override // OLt.DAz
    public void U(boolean z2) {
        if (z2) {
            M(this.J2, this.f71000O.now());
        } else {
            eF(this.J2, this.f71000O.now());
        }
    }

    @Override // QVk.j, QVk.n
    public void Uo(String str, n.j jVar) {
        long jNow = this.f71000O.now();
        aC aCVar = this.J2;
        aCVar.e(jVar);
        aCVar.te(str);
        a(aCVar, I28.E2);
        if (this.f71001Z) {
            eF(aCVar, jNow);
        }
    }

    @Override // QVk.j, QVk.n
    public void jB(String str, Object obj, n.j jVar) {
        long jNow = this.f71000O.now();
        aC aCVar = this.J2;
        aCVar.aYN();
        aCVar.fD(jNow);
        aCVar.te(str);
        aCVar.ViF(obj);
        aCVar.e(jVar);
        a(aCVar, I28.f8180r);
        if (this.f71001Z) {
            M(aCVar, jNow);
        }
    }

    @Override // QVk.j, QVk.n
    /* JADX INFO: renamed from: p5, reason: merged with bridge method [inline-methods] */
    public void n(String str, InterfaceC1664qz interfaceC1664qz) {
        long jNow = this.f71000O.now();
        aC aCVar = this.J2;
        aCVar.iF(jNow);
        aCVar.te(str);
        aCVar.X(interfaceC1664qz);
        a(aCVar, I28.f8179o);
    }

    @Override // QVk.j, QVk.n
    public void rl(String str, Throwable th, n.j jVar) {
        long jNow = this.f71000O.now();
        aC aCVar = this.J2;
        aCVar.e(jVar);
        aCVar.nY(jNow);
        aCVar.te(str);
        aCVar.E2(th);
        a(aCVar, I28.f8174S);
        eF(aCVar, jNow);
    }

    private void a(aC aCVar, I28 i28) {
        aCVar.T(i28);
        this.f71003r.n(aCVar, i28);
        Dsr dsr = this.f71002o;
        if (dsr != null) {
            dsr.n(aCVar, i28);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FX();
    }
}
