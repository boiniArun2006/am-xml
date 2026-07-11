package YqR;

import Hh.C;
import Szt.Ml;
import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import bA.C1653C;
import bA.C1665w6;
import bA.InterfaceC1656I28;
import bA.InterfaceC1658Wre;
import bA.Xo;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class I28 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Szt.n f12219n;
    private final boolean nr;
    private final AbstractC1501Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f12220t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static w6 f12218O = Uo("com.facebook.animated.gif.GifImage");
    static w6 J2 = Uo("com.facebook.animated.webp.WebPImage");

    class j implements Ml.n {
        @Override // Szt.Ml.n
        public void n(int i2, Bitmap bitmap) {
        }

        @Override // Szt.Ml.n
        public Pj0.j rl(int i2) {
            return null;
        }

        j() {
        }
    }

    class n implements Ml.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f12222n;

        @Override // Szt.Ml.n
        public void n(int i2, Bitmap bitmap) {
        }

        n(List list) {
            this.f12222n = list;
        }

        @Override // Szt.Ml.n
        public Pj0.j rl(int i2) {
            return Pj0.j.T((Pj0.j) this.f12222n.get(i2));
        }
    }

    public I28(Szt.n nVar, AbstractC1501Ml abstractC1501Ml, boolean z2) {
        this(nVar, abstractC1501Ml, z2, true);
    }

    private InterfaceC1656I28 J2(String str, dX.Ml ml, X1.w6 w6Var, Bitmap.Config config) throws Throwable {
        List listO;
        Pj0.j jVarNr;
        Pj0.j jVar = null;
        try {
            int iN = ml.nr ? w6Var.n() - 1 : 0;
            if (ml.Uo) {
                InterfaceC1658Wre interfaceC1658WreUhV = InterfaceC1658Wre.UhV(nr(w6Var, config, iN), Xo.nr, 0);
                Pj0.j.M7(null);
                Pj0.j.p5(null);
                return interfaceC1658WreUhV;
            }
            if (ml.J2) {
                listO = O(w6Var, config);
                try {
                    jVarNr = Pj0.j.T((Pj0.j) listO.get(iN));
                } catch (Throwable th) {
                    th = th;
                    Pj0.j.M7(jVar);
                    Pj0.j.p5(listO);
                    throw th;
                }
            } else {
                listO = null;
                jVarNr = null;
            }
            try {
                if (ml.f63512t && jVarNr == null) {
                    jVarNr = nr(w6Var, config, iN);
                }
                C1665w6 c1665w6 = new C1665w6(X1.I28.J2(w6Var).gh(jVarNr).mUb(iN).xMQ(listO).KN(null).qie(str).n(), this.nr);
                Pj0.j.M7(jVarNr);
                Pj0.j.p5(listO);
                return c1665w6;
            } catch (Throwable th2) {
                th = th2;
                jVar = jVarNr;
                Pj0.j.M7(jVar);
                Pj0.j.p5(listO);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            listO = null;
        }
    }

    public I28(Szt.n nVar, AbstractC1501Ml abstractC1501Ml, boolean z2, boolean z3) {
        this.f12219n = nVar;
        this.rl = abstractC1501Ml;
        this.f12220t = z2;
        this.nr = z3;
    }

    private Pj0.j t(int i2, int i3, Bitmap.Config config) {
        Pj0.j jVarNr = this.rl.nr(i2, i3, config);
        ((Bitmap) jVarNr.eF()).eraseColor(0);
        ((Bitmap) jVarNr.eF()).setHasAlpha(true);
        return jVarNr;
    }

    @Override // YqR.Ml
    public InterfaceC1656I28 n(C1653C c1653c, dX.Ml ml, Bitmap.Config config) {
        if (f12218O == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        Pj0.j jVarT = c1653c.T();
        C.Uo(jVarT);
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVarT.eF();
            InterfaceC1656I28 interfaceC1656I28J2 = J2(c1653c.a(), ml, pooledByteBuffer.getByteBuffer() != null ? f12218O.O(pooledByteBuffer.getByteBuffer(), ml) : f12218O.KN(pooledByteBuffer.qie(), pooledByteBuffer.size(), ml), config);
            Pj0.j.M7(jVarT);
            return interfaceC1656I28J2;
        } catch (Throwable th) {
            Pj0.j.M7(jVarT);
            throw th;
        }
    }

    @Override // YqR.Ml
    public InterfaceC1656I28 rl(C1653C c1653c, dX.Ml ml, Bitmap.Config config) {
        if (J2 == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        Pj0.j jVarT = c1653c.T();
        C.Uo(jVarT);
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVarT.eF();
            InterfaceC1656I28 interfaceC1656I28J2 = J2(c1653c.a(), ml, pooledByteBuffer.getByteBuffer() != null ? J2.O(pooledByteBuffer.getByteBuffer(), ml) : J2.KN(pooledByteBuffer.qie(), pooledByteBuffer.size(), ml), config);
            Pj0.j.M7(jVarT);
            return interfaceC1656I28J2;
        } catch (Throwable th) {
            Pj0.j.M7(jVarT);
            throw th;
        }
    }

    private List O(X1.w6 w6Var, Bitmap.Config config) {
        X1.j jVarN = this.f12219n.n(X1.I28.rl(w6Var), null);
        ArrayList arrayList = new ArrayList(jVarN.n());
        Szt.Ml ml = new Szt.Ml(jVarN, this.f12220t, new n(arrayList));
        for (int i2 = 0; i2 < jVarN.n(); i2++) {
            Pj0.j jVarT = t(jVarN.getWidth(), jVarN.getHeight(), config);
            ml.KN(i2, (Bitmap) jVarT.eF());
            arrayList.add(jVarT);
        }
        return arrayList;
    }

    private static w6 Uo(String str) {
        try {
            return (w6) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Pj0.j nr(X1.w6 w6Var, Bitmap.Config config, int i2) {
        Pj0.j jVarT = t(w6Var.getWidth(), w6Var.getHeight(), config);
        new Szt.Ml(this.f12219n.n(X1.I28.rl(w6Var), null), this.f12220t, new j()).KN(i2, (Bitmap) jVarT.eF());
        return jVarT;
    }
}
