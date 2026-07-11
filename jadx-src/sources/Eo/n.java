package Eo;

import android.util.SparseArray;
import bA.InterfaceC1658Wre;
import bA.Xo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n implements zdu.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Szt.w6 f2367n;
    private Pj0.j nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseArray f2368t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f2366O = new j(null);
    private static final Class J2 = n.class;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pj0.j t(Pj0.j jVar) {
            InterfaceC1658Wre interfaceC1658WreUhV = InterfaceC1658Wre.UhV(jVar, Xo.nr, 0);
            Intrinsics.checkNotNullExpressionValue(interfaceC1658WreUhV, "of(...)");
            return Pj0.j.a(interfaceC1658WreUhV);
        }

        public final Pj0.j rl(Pj0.j jVar) {
            try {
                if (Pj0.j.FX(jVar)) {
                    Intrinsics.checkNotNull(jVar);
                    if (jVar.eF() instanceof InterfaceC1658Wre) {
                        Object objEF = jVar.eF();
                        Intrinsics.checkNotNull(objEF, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((InterfaceC1658Wre) objEF).o();
                    }
                }
                Pj0.j.M7(jVar);
                return null;
            } finally {
                Pj0.j.M7(jVar);
            }
        }
    }

    private final synchronized void Uo(int i2) {
        Pj0.j jVar = (Pj0.j) this.f2368t.get(i2);
        if (jVar != null) {
            this.f2368t.delete(i2);
            Pj0.j.M7(jVar);
            Dzy.j.ck(J2, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i2), this.f2368t);
        }
    }

    @Override // zdu.n
    public synchronized Pj0.j J2(int i2) {
        return f2366O.rl(this.f2367n.t(i2));
    }

    @Override // zdu.n
    public synchronized boolean O(int i2) {
        return this.f2367n.rl(i2);
    }

    @Override // zdu.n
    public synchronized void clear() {
        try {
            Pj0.j.M7(this.nr);
            this.nr = null;
            int size = this.f2368t.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pj0.j.M7((Pj0.j) this.f2368t.valueAt(i2));
            }
            this.f2368t.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // zdu.n
    public synchronized void n(int i2, Pj0.j bitmapReference, int i3) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        Uo(i2);
        Pj0.j jVarT = null;
        try {
            jVarT = f2366O.t(bitmapReference);
            if (jVarT != null) {
                Pj0.j.M7(this.nr);
                this.nr = this.f2367n.n(i2, jVarT);
            }
        } finally {
            Pj0.j.M7(jVarT);
        }
    }

    @Override // zdu.n
    public synchronized void nr(int i2, Pj0.j bitmapReference, int i3) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        try {
            Pj0.j jVarT = f2366O.t(bitmapReference);
            if (jVarT == null) {
                Pj0.j.M7(jVarT);
                return;
            }
            Pj0.j jVarN = this.f2367n.n(i2, jVarT);
            if (Pj0.j.FX(jVarN)) {
                Pj0.j.M7((Pj0.j) this.f2368t.get(i2));
                this.f2368t.put(i2, jVarN);
                Dzy.j.ck(J2, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i2), this.f2368t);
            }
            Pj0.j.M7(jVarT);
        } catch (Throwable th) {
            Pj0.j.M7(null);
            throw th;
        }
    }

    @Override // zdu.n
    public synchronized Pj0.j rl(int i2) {
        return f2366O.rl(Pj0.j.T(this.nr));
    }

    @Override // zdu.n
    public synchronized Pj0.j t(int i2, int i3, int i5) {
        if (!this.rl) {
            return null;
        }
        return f2366O.rl(this.f2367n.nr());
    }

    public n(Szt.w6 animatedFrameCache, boolean z2) {
        Intrinsics.checkNotNullParameter(animatedFrameCache, "animatedFrameCache");
        this.f2367n = animatedFrameCache;
        this.rl = z2;
        this.f2368t = new SparseArray();
    }
}
