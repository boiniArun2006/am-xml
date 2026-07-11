package cIr;

import Mj.j;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D {
    private volatile boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile long f43596O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f43597n;
    private volatile int nr;
    private final Mj.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f43598t;

    class j implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ qz f43599n;
        final /* synthetic */ Mj.j rl;

        j(qz qzVar, Mj.j jVar) {
            this.f43599n = qzVar;
            this.rl = jVar;
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            l3D.this.f43598t = z2;
            if (z2) {
                this.f43599n.t();
            } else if (l3D.this.Uo()) {
                this.f43599n.J2(l3D.this.f43596O - this.rl.currentTimeMillis());
            }
        }
    }

    l3D(Context context, aC aCVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this((Context) Preconditions.checkNotNull(context), new qz((aC) Preconditions.checkNotNull(aCVar), executor, scheduledExecutorService), new j.C0231j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Uo() {
        return this.J2 && !this.f43598t && this.nr > 0 && this.f43596O != -1;
    }

    public void J2(boolean z2) {
        this.J2 = z2;
    }

    public void O(int i2) {
        if (this.nr == 0 && i2 > 0) {
            this.nr = i2;
            if (Uo()) {
                this.f43597n.J2(this.f43596O - this.rl.currentTimeMillis());
            }
        } else if (this.nr > 0 && i2 == 0) {
            this.f43597n.t();
        }
        this.nr = i2;
    }

    public void nr(Dh.w6 w6Var) {
        n nVarNr = w6Var instanceof n ? (n) w6Var : n.nr(w6Var.rl());
        this.f43596O = nVarNr.KN() + ((long) (nVarNr.J2() * 0.5d)) + 300000;
        if (this.f43596O > nVarNr.n()) {
            this.f43596O = nVarNr.n() - 60000;
        }
        if (Uo()) {
            this.f43597n.J2(this.f43596O - this.rl.currentTimeMillis());
        }
    }

    l3D(Context context, qz qzVar, Mj.j jVar) {
        this.f43597n = qzVar;
        this.rl = jVar;
        this.f43596O = -1L;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new j(qzVar, jVar));
    }
}
