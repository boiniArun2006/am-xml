package FbN;

import Hh.C;
import Hh.Dsr;
import OLt.DAz;
import OLt.nKK;
import TD.w6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.safedk.android.analytics.events.CrashEvent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n implements DAz {
    private htt.n J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2766n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2769t = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f2765O = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private htt.j f2768r = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TD.w6 f2767o = TD.w6.n();

    public void az() {
        ty(null);
    }

    public void qie(Context context) {
    }

    private void n() {
        if (this.f2766n) {
            return;
        }
        this.f2767o.rl(w6.j.ON_ATTACH_CONTROLLER);
        this.f2766n = true;
        htt.j jVar = this.f2768r;
        if (jVar == null || jVar.O() == null) {
            return;
        }
        this.f2768r.rl();
    }

    private void nr() {
        if (this.f2766n) {
            this.f2767o.rl(w6.j.ON_DETACH_CONTROLLER);
            this.f2766n = false;
            if (KN()) {
                this.f2768r.nr();
            }
        }
    }

    private void rl() {
        if (this.f2769t && this.f2765O) {
            n();
        } else {
            nr();
        }
    }

    public static n t(htt.n nVar, Context context) {
        n nVar2 = new n(nVar);
        nVar2.qie(context);
        return nVar2;
    }

    public void HI(htt.n nVar) {
        this.f2767o.rl(w6.j.ON_SET_HIERARCHY);
        boolean zKN = KN();
        ck(null);
        htt.n nVar2 = (htt.n) C.Uo(nVar);
        this.J2 = nVar2;
        Drawable drawableNr = nVar2.nr();
        U(drawableNr == null || drawableNr.isVisible());
        ck(this);
        if (zKN) {
            this.f2768r.t(nVar);
        }
    }

    public htt.n J2() {
        return (htt.n) C.Uo(this.J2);
    }

    public boolean KN() {
        htt.j jVar = this.f2768r;
        return jVar != null && jVar.O() == this.J2;
    }

    public htt.j O() {
        return this.f2768r;
    }

    @Override // OLt.DAz
    public void U(boolean z2) {
        if (this.f2765O == z2) {
            return;
        }
        this.f2767o.rl(z2 ? w6.j.ON_DRAWABLE_SHOW : w6.j.ON_DRAWABLE_HIDE);
        this.f2765O = z2;
        rl();
    }

    public Drawable Uo() {
        htt.n nVar = this.J2;
        if (nVar == null) {
            return null;
        }
        return nVar.nr();
    }

    public void mUb() {
        this.f2767o.rl(w6.j.ON_HOLDER_DETACH);
        this.f2769t = false;
        rl();
    }

    @Override // OLt.DAz
    public void onDraw() {
        if (this.f2766n) {
            return;
        }
        Dzy.j.WPU(TD.w6.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2768r)), toString());
        this.f2769t = true;
        this.f2765O = true;
        rl();
    }

    public void ty(htt.j jVar) {
        boolean z2 = this.f2766n;
        if (z2) {
            nr();
        }
        if (KN()) {
            this.f2767o.rl(w6.j.ON_CLEAR_OLD_CONTROLLER);
            this.f2768r.t(null);
        }
        this.f2768r = jVar;
        if (jVar != null) {
            this.f2767o.rl(w6.j.ON_SET_CONTROLLER);
            this.f2768r.t(this.J2);
        } else {
            this.f2767o.rl(w6.j.ON_CLEAR_CONTROLLER);
        }
        if (z2) {
            n();
        }
    }

    public void xMQ() {
        this.f2767o.rl(w6.j.ON_HOLDER_ATTACH);
        this.f2769t = true;
        rl();
    }

    public n(htt.n nVar) {
        if (nVar != null) {
            HI(nVar);
        }
    }

    private void ck(DAz dAz) {
        Object objUo = Uo();
        if (objUo instanceof nKK) {
            ((nKK) objUo).xMQ(dAz);
        }
    }

    public boolean gh(MotionEvent motionEvent) {
        if (!KN()) {
            return false;
        }
        return this.f2768r.onTouchEvent(motionEvent);
    }

    public String toString() {
        return Dsr.rl(this).t("controllerAttached", this.f2766n).t("holderAttached", this.f2769t).t("drawableVisible", this.f2765O).rl(CrashEvent.f62787f, this.f2767o.toString()).toString();
    }
}
