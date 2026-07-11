package fJf;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ew {
    private com.facebook.imagepipeline.memory.I28 J2;
    private A72.C KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.w6 f66865O;
    private A72.fuX Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f66866n;
    private com.facebook.imagepipeline.memory.I28 nr;
    private com.facebook.imagepipeline.memory.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Dsr f66867t;
    private A72.j xMQ;

    private com.facebook.imagepipeline.memory.I28 J2(int i2) {
        if (i2 == 0) {
            return Uo();
        }
        if (i2 == 1) {
            return t();
        }
        if (i2 == 2) {
            return n();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    private com.facebook.imagepipeline.memory.I28 n() {
        if (this.rl == null) {
            try {
                this.rl = (com.facebook.imagepipeline.memory.I28) AshmemMemoryChunkPool.class.getConstructor(A72.Ml.class, nKK.class, DAz.class).newInstance(this.f66866n.xMQ(), this.f66866n.Uo(), this.f66866n.KN());
            } catch (ClassNotFoundException unused) {
                this.rl = null;
            } catch (IllegalAccessException unused2) {
                this.rl = null;
            } catch (InstantiationException unused3) {
                this.rl = null;
            } catch (NoSuchMethodException unused4) {
                this.rl = null;
            } catch (InvocationTargetException unused5) {
                this.rl = null;
            }
        }
        return this.rl;
    }

    public int O() {
        return this.f66866n.J2().Uo;
    }

    public com.facebook.imagepipeline.memory.I28 Uo() {
        if (this.J2 == null) {
            try {
                this.J2 = (com.facebook.imagepipeline.memory.I28) NativeMemoryChunkPool.class.getConstructor(A72.Ml.class, nKK.class, DAz.class).newInstance(this.f66866n.xMQ(), this.f66866n.Uo(), this.f66866n.KN());
            } catch (ClassNotFoundException e2) {
                Dzy.j.xMQ("PoolFactory", "", e2);
                this.J2 = null;
            } catch (IllegalAccessException e3) {
                Dzy.j.xMQ("PoolFactory", "", e3);
                this.J2 = null;
            } catch (InstantiationException e4) {
                Dzy.j.xMQ("PoolFactory", "", e4);
                this.J2 = null;
            } catch (NoSuchMethodException e5) {
                Dzy.j.xMQ("PoolFactory", "", e5);
                this.J2 = null;
            } catch (InvocationTargetException e6) {
                Dzy.j.xMQ("PoolFactory", "", e6);
                this.J2 = null;
            }
        }
        return this.J2;
    }

    public A72.j gh() {
        if (this.xMQ == null) {
            this.xMQ = new com.facebook.imagepipeline.memory.Ml(this.f66866n.xMQ(), this.f66866n.mUb(), this.f66866n.gh());
        }
        return this.xMQ;
    }

    public A72.C mUb() {
        if (this.KN == null) {
            this.KN = new A72.C(gh());
        }
        return this.KN;
    }

    public com.facebook.imagepipeline.memory.w6 nr() {
        if (this.f66865O == null) {
            this.f66865O = new com.facebook.imagepipeline.memory.w6(this.f66866n.xMQ(), this.f66866n.J2());
        }
        return this.f66865O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Dsr rl() {
        byte b2;
        if (this.f66867t == null) {
            String strO = this.f66866n.O();
            switch (strO.hashCode()) {
                case -1868884870:
                    b2 = !strO.equals("legacy_default_params") ? (byte) -1 : (byte) 3;
                    break;
                case -1106578487:
                    if (strO.equals("legacy")) {
                        b2 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (strO.equals("experimental")) {
                        b2 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (strO.equals("dummy_with_tracking")) {
                        b2 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (strO.equals("dummy")) {
                        b2 = 0;
                        break;
                    }
                    break;
            }
            if (b2 == 0) {
                this.f66867t = new QJ();
            } else if (b2 == 1) {
                this.f66867t = new l3D();
            } else if (b2 == 2) {
                this.f66867t = new C2104c(this.f66866n.rl(), this.f66866n.n(), ci.KN(), this.f66866n.az() ? this.f66866n.xMQ() : null);
            } else if (b2 != 3) {
                this.f66867t = new com.facebook.imagepipeline.memory.n(this.f66866n.xMQ(), this.f66866n.t(), this.f66866n.nr(), this.f66866n.qie());
            } else {
                this.f66867t = new com.facebook.imagepipeline.memory.n(this.f66866n.xMQ(), Pl.n(), this.f66866n.nr(), this.f66866n.qie());
            }
        }
        return this.f66867t;
    }

    public com.facebook.imagepipeline.memory.I28 t() {
        if (this.nr == null) {
            try {
                this.nr = (com.facebook.imagepipeline.memory.I28) BufferMemoryChunkPool.class.getConstructor(A72.Ml.class, nKK.class, DAz.class).newInstance(this.f66866n.xMQ(), this.f66866n.Uo(), this.f66866n.KN());
            } catch (ClassNotFoundException unused) {
                this.nr = null;
            } catch (IllegalAccessException unused2) {
                this.nr = null;
            } catch (InstantiationException unused3) {
                this.nr = null;
            } catch (NoSuchMethodException unused4) {
                this.nr = null;
            } catch (InvocationTargetException unused5) {
                this.nr = null;
            }
        }
        return this.nr;
    }

    public A72.fuX xMQ(int i2) {
        if (this.Uo == null) {
            com.facebook.imagepipeline.memory.I28 i28J2 = J2(i2);
            Hh.C.KN(i28J2, "failed to get pool for chunk type: " + i2);
            this.Uo = new SPz(i28J2, mUb());
        }
        return this.Uo;
    }

    public Ew(afx afxVar) {
        this.f66866n = (afx) Hh.C.Uo(afxVar);
    }

    public A72.fuX KN() {
        return xMQ(!ln.Q.n() ? 1 : 0);
    }
}
