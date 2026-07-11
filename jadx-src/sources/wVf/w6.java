package wVf;

import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements n {
    private final SparseArray J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Class f75005O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1501Ml f75006n;
    private final ExecutorService nr;
    private final zdu.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Bitmap.Config f75007t;

    private final class j implements Runnable {
        private final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f75008O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final y8.j f75009n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ w6 f75010r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final zdu.n f75011t;

        private final boolean n(int i2, int i3) {
            Pj0.j jVarT;
            int i5 = 2;
            try {
                if (i3 == 1) {
                    jVarT = this.f75011t.t(i2, this.f75009n.O(), this.f75009n.t());
                } else {
                    if (i3 != 2) {
                        return false;
                    }
                    jVarT = this.f75010r.f75006n.rl(this.f75009n.O(), this.f75009n.t(), this.f75010r.f75007t);
                    i5 = -1;
                }
                Pj0.j jVar = jVarT;
                boolean zRl = rl(i2, jVar, i3);
                Pj0.j.M7(jVar);
                return (zRl || i5 == -1) ? zRl : n(i2, i5);
            } catch (RuntimeException e2) {
                Dzy.j.S(this.f75010r.f75005O, "Failed to create frame bitmap", e2);
                return false;
            } finally {
                Pj0.j.M7(null);
            }
        }

        public j(w6 w6Var, y8.j animationBackend, zdu.n bitmapFrameCache, int i2, int i3) {
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            this.f75010r = w6Var;
            this.f75009n = animationBackend;
            this.f75011t = bitmapFrameCache;
            this.f75008O = i2;
            this.J2 = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f75011t.O(this.f75008O)) {
                    Dzy.j.HI(this.f75010r.f75005O, "Frame %d is cached already.", Integer.valueOf(this.f75008O));
                    SparseArray sparseArray = this.f75010r.J2;
                    w6 w6Var = this.f75010r;
                    synchronized (sparseArray) {
                        w6Var.J2.remove(this.J2);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                if (n(this.f75008O, 1)) {
                    Dzy.j.HI(this.f75010r.f75005O, "Prepared frame %d.", Integer.valueOf(this.f75008O));
                } else {
                    Dzy.j.J2(this.f75010r.f75005O, "Could not prepare frame %d.", Integer.valueOf(this.f75008O));
                }
                SparseArray sparseArray2 = this.f75010r.J2;
                w6 w6Var2 = this.f75010r;
                synchronized (sparseArray2) {
                    w6Var2.J2.remove(this.J2);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f75010r.J2;
                w6 w6Var3 = this.f75010r;
                synchronized (sparseArray3) {
                    w6Var3.J2.remove(this.J2);
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                }
            }
        }

        private final boolean rl(int i2, Pj0.j jVar, int i3) {
            if (Pj0.j.FX(jVar) && jVar != null) {
                zdu.w6 w6Var = this.f75010r.rl;
                Object objEF = jVar.eF();
                Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
                if (w6Var.n(i2, (Bitmap) objEF)) {
                    Dzy.j.HI(this.f75010r.f75005O, "Frame %d ready.", Integer.valueOf(i2));
                    synchronized (this.f75010r.J2) {
                        this.f75011t.nr(i2, jVar, i3);
                        Unit unit = Unit.INSTANCE;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public w6(AbstractC1501Ml platformBitmapFactory, zdu.w6 bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f75006n = platformBitmapFactory;
        this.rl = bitmapFrameRenderer;
        this.f75007t = bitmapConfig;
        this.nr = executorService;
        this.f75005O = w6.class;
        this.J2 = new SparseArray();
    }

    @Override // wVf.n
    public boolean n(zdu.n bitmapFrameCache, y8.j animationBackend, int i2) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int iUo = Uo(animationBackend, i2);
        synchronized (this.J2) {
            try {
                try {
                    if (this.J2.get(iUo) != null) {
                        Dzy.j.HI(this.f75005O, "Already scheduled decode job for frame %d", Integer.valueOf(i2));
                        return true;
                    }
                    if (bitmapFrameCache.O(i2)) {
                        Dzy.j.HI(this.f75005O, "Frame %d is cached already.", Integer.valueOf(i2));
                        return true;
                    }
                    try {
                        j jVar = new j(this, animationBackend, bitmapFrameCache, i2, iUo);
                        this.J2.put(iUo, jVar);
                        this.nr.execute(jVar);
                        Unit unit = Unit.INSTANCE;
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }

    private final int Uo(y8.j jVar, int i2) {
        return (jVar.hashCode() * 31) + i2;
    }
}
