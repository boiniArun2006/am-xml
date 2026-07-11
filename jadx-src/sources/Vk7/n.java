package Vk7;

import android.app.Activity;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f11280n = new n();
    private static final String rl = n.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f11281t;

    public static final void nr(Activity activity) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f11281t && !Ml.nr.t().isEmpty()) {
                    Wre.f11276r.O(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final void rl() {
        try {
            if (VmF.j.nr(n.class)) {
                return;
            }
            try {
                s4.Z().execute(new Runnable() { // from class: Vk7.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.t();
                    }
                });
            } catch (Exception e2) {
                vd.z(rl, e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            if (com.facebook.internal.j.J2.KN(s4.qie())) {
                return;
            }
            f11280n.O();
            f11281t = true;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    private n() {
    }

    private final void O() {
        String strTy;
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null || (strTy = qjXQ.ty()) == null) {
                    return;
                }
                Ml.nr.nr(strTy);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
