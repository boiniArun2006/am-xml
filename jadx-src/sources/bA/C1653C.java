package bA;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import dX.C1954n;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: renamed from: bA.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C1653C implements Closeable {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static boolean f43178N;
    private C1954n E2;
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private com.facebook.imageformat.w6 f43179O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f43180S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f43181T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private String f43182X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f43183Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorSpace f43184e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43185g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pj0.j f43186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f43187o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f43188r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Hh.qz f43189t;

    public C1653C(Pj0.j jVar) {
        this.f43179O = com.facebook.imageformat.w6.nr;
        this.J2 = -1;
        this.f43188r = 0;
        this.f43187o = -1;
        this.f43183Z = -1;
        this.f43180S = 1;
        this.f43185g = -1;
        Hh.C.rl(Boolean.valueOf(Pj0.j.FX(jVar)));
        this.f43186n = jVar.clone();
        this.f43189t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isValid() {
        boolean z2;
        if (!Pj0.j.FX(this.f43186n)) {
            z2 = this.f43189t != null;
        }
        return z2;
    }

    private void GD() {
        if (this.f43187o < 0 || this.f43183Z < 0) {
            Org();
        }
    }

    public static void Uo(C1653C c1653c) {
        if (c1653c != null) {
            c1653c.close();
        }
    }

    public static boolean n1(C1653C c1653c) {
        return c1653c.J2 >= 0 && c1653c.f43187o >= 0 && c1653c.f43183Z >= 0;
    }

    public static boolean qm(C1653C c1653c) {
        return c1653c != null && c1653c.isValid();
    }

    public static C1653C rl(C1653C c1653c) {
        if (c1653c != null) {
            return c1653c.n();
        }
        return null;
    }

    public void Bu(int i2) {
        this.f43188r = i2;
    }

    public int FX() {
        return this.f43180S;
    }

    public void HBN(int i2) {
        this.f43187o = i2;
    }

    public void Org() {
        if (!f43178N) {
            Mx();
        } else {
            if (this.f43181T) {
                return;
            }
            Mx();
            this.f43181T = true;
        }
    }

    public void Qu(String str) {
        this.f43182X = str;
    }

    public Pj0.j T() {
        return Pj0.j.T(this.f43186n);
    }

    public void T3L(C1954n c1954n) {
        this.E2 = c1954n;
    }

    public void Uf(com.facebook.imageformat.w6 w6Var) {
        this.f43179O = w6Var;
    }

    public String a() {
        return this.f43182X;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Pj0.j.M7(this.f43186n);
    }

    public InputStream eF() {
        Hh.qz qzVar = this.f43189t;
        if (qzVar != null) {
            return (InputStream) qzVar.get();
        }
        Pj0.j jVarT = Pj0.j.T(this.f43186n);
        if (jVarT == null) {
            return null;
        }
        try {
            return new A72.Dsr((PooledByteBuffer) jVarT.eF());
        } finally {
            Pj0.j.M7(jVarT);
        }
    }

    public void f(int i2) {
        this.J2 = i2;
    }

    public boolean fcU(int i2) {
        com.facebook.imageformat.w6 w6Var = this.f43179O;
        if ((w6Var != com.facebook.imageformat.n.rl && w6Var != com.facebook.imageformat.n.az) || this.f43189t != null) {
            return true;
        }
        Hh.C.Uo(this.f43186n);
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) this.f43186n.eF();
        return i2 >= 2 && pooledByteBuffer.xMQ(i2 + (-2)) == -1 && pooledByteBuffer.xMQ(i2 - 1) == -39;
    }

    public int getSize() {
        Pj0.j jVar = this.f43186n;
        return (jVar == null || jVar.eF() == null) ? this.f43185g : ((PooledByteBuffer) this.f43186n.eF()).size();
    }

    public C1954n jB() {
        return this.E2;
    }

    public C1653C n() {
        C1653C c1653c;
        Hh.qz qzVar = this.f43189t;
        if (qzVar != null) {
            c1653c = new C1653C(qzVar, this.f43185g);
        } else {
            Pj0.j jVarT = Pj0.j.T(this.f43186n);
            if (jVarT == null) {
                c1653c = null;
            } else {
                try {
                    c1653c = new C1653C(jVarT);
                } finally {
                    Pj0.j.M7(jVarT);
                }
            }
        }
        if (c1653c != null) {
            c1653c.Z(this);
        }
        return c1653c;
    }

    public void p0N(int i2) {
        this.f43183Z = i2;
    }

    public void ub(int i2) {
        this.f43180S = i2;
    }

    protected boolean z() {
        return this.f43181T;
    }

    private Pair How() {
        InputStream inputStreamEF = eF();
        if (inputStreamEF == null) {
            return null;
        }
        Pair pairJ2 = com.facebook.imageutils.aC.J2(inputStreamEF);
        if (pairJ2 != null) {
            this.f43187o = ((Integer) pairJ2.component1()).intValue();
            this.f43183Z = ((Integer) pairJ2.component2()).intValue();
        }
        return pairJ2;
    }

    private com.facebook.imageutils.Wre K() throws Throwable {
        InputStream inputStreamEF;
        try {
            inputStreamEF = eF();
        } catch (Throwable th) {
            th = th;
            inputStreamEF = null;
        }
        try {
            com.facebook.imageutils.Wre wreO = com.facebook.imageutils.Ml.O(inputStreamEF);
            this.f43184e = wreO.n();
            Pair pairRl = wreO.rl();
            if (pairRl != null) {
                this.f43187o = ((Integer) pairRl.component1()).intValue();
                this.f43183Z = ((Integer) pairRl.component2()).intValue();
            }
            if (inputStreamEF != null) {
                try {
                    inputStreamEF.close();
                } catch (IOException unused) {
                }
            }
            return wreO;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamEF != null) {
                try {
                    inputStreamEF.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private void Mx() {
        Pair pairRl;
        com.facebook.imageformat.w6 w6VarNr = com.facebook.imageformat.I28.nr(eF());
        this.f43179O = w6VarNr;
        if (com.facebook.imageformat.n.rl(w6VarNr)) {
            pairRl = How();
        } else {
            pairRl = K().rl();
        }
        if (w6VarNr == com.facebook.imageformat.n.rl && this.J2 == -1) {
            if (pairRl != null) {
                int iRl = com.facebook.imageutils.CN3.rl(eF());
                this.f43188r = iRl;
                this.J2 = com.facebook.imageutils.CN3.n(iRl);
                return;
            }
            return;
        }
        if (w6VarNr == com.facebook.imageformat.n.qie && this.J2 == -1) {
            int iN = com.facebook.imageutils.I28.n(eF());
            this.f43188r = iN;
            this.J2 = com.facebook.imageutils.CN3.n(iN);
        } else if (this.J2 == -1) {
            this.J2 = 0;
        }
    }

    public InputStream M() {
        return (InputStream) Hh.C.Uo(eF());
    }

    public String M7(int i2) {
        Pj0.j jVarT = T();
        if (jVarT == null) {
            return "";
        }
        int iMin = Math.min(getSize(), i2);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVarT.eF();
            if (pooledByteBuffer == null) {
                return "";
            }
            pooledByteBuffer.O(0, bArr, 0, iMin);
            jVarT.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i3 = 0; i3 < iMin; i3++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i3])));
            }
            return sb.toString();
        } finally {
            jVarT.close();
        }
    }

    public int Nxk() {
        GD();
        return this.f43188r;
    }

    public ColorSpace U() {
        GD();
        return this.f43184e;
    }

    public void Z(C1653C c1653c) {
        this.f43179O = c1653c.p5();
        this.f43187o = c1653c.getWidth();
        this.f43183Z = c1653c.getHeight();
        this.J2 = c1653c.m();
        this.f43188r = c1653c.Nxk();
        this.f43180S = c1653c.FX();
        this.f43185g = c1653c.getSize();
        this.E2 = c1653c.jB();
        this.f43184e = c1653c.U();
        this.f43181T = c1653c.z();
    }

    public int getHeight() {
        GD();
        return this.f43183Z;
    }

    public int getWidth() {
        GD();
        return this.f43187o;
    }

    public int m() {
        GD();
        return this.J2;
    }

    public com.facebook.imageformat.w6 p5() {
        GD();
        return this.f43179O;
    }

    public C1653C(Hh.qz qzVar) {
        this.f43179O = com.facebook.imageformat.w6.nr;
        this.J2 = -1;
        this.f43188r = 0;
        this.f43187o = -1;
        this.f43183Z = -1;
        this.f43180S = 1;
        this.f43185g = -1;
        Hh.C.Uo(qzVar);
        this.f43186n = null;
        this.f43189t = qzVar;
    }

    public C1653C(Hh.qz qzVar, int i2) {
        this(qzVar);
        this.f43185g = i2;
    }
}
