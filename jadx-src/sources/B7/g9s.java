package B7;

import B7.Z;
import Sbr.j;
import TFv.Lu;
import TFv.rv6;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import kotlin.jvm.internal.Intrinsics;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class g9s implements j.Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SurfaceHolder.Callback f266O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TFv.SPz f267n;
    private final rv6 nr;
    private final yB.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SurfaceHolder f268t;

    public static final class j implements SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        j() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i2, int i3, int i5) {
            Z nVar;
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (i3 <= 0 || i5 <= 0) {
                nVar = Z.j.f257n;
            } else {
                Oe.w6 w6Var = new Oe.w6(i3, i5);
                Surface surface = holder.getSurface();
                Intrinsics.checkNotNullExpressionValue(surface, "holder.surface");
                nVar = new Z.n(w6Var, surface);
            }
            g9s.this.nr(nVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            g9s.this.nr(Z.j.f257n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nr(Z z2) {
        Z z3 = (Z) this.nr.getValue();
        this.f267n.setValue(z2);
        Z.j jVar = Z.j.f257n;
        if (Intrinsics.areEqual(z3, jVar)) {
            if (z2 instanceof Z.n) {
                j.C1281j.t(this.rl, null, 1, null);
                return;
            } else {
                Intrinsics.areEqual(z2, jVar);
                return;
            }
        }
        if (z3 instanceof Z.n) {
            if (Intrinsics.areEqual(z2, jVar)) {
                afx.O(this.rl, null, 1, null);
            } else {
                boolean z4 = z2 instanceof Z.n;
            }
        }
    }

    public final rv6 t() {
        return this.nr;
    }

    public g9s() {
        TFv.SPz sPzN = Lu.n(Z.j.f257n);
        this.f267n = sPzN;
        this.rl = yB.CN3.n(true);
        this.nr = TFv.fuX.t(sPzN);
        this.f266O = new j();
    }

    @Override // Sbr.j.Ml
    public void n(SurfaceHolder surfaceHolder) {
        Z zT2;
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            SurfaceHolder surfaceHolder2 = this.f268t;
            if (surfaceHolder2 != null) {
                surfaceHolder2.removeCallback(this.f266O);
            }
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this.f266O);
            }
            if (surfaceHolder == null || (zT2 = afx.t(surfaceHolder)) == null) {
                zT2 = Z.j.f257n;
            }
            nr(zT2);
            this.f268t = surfaceHolder;
            return;
        }
        throw new IllegalStateException("This function can be invoked only on the main thread");
    }
}
