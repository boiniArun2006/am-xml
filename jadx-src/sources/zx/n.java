package zx;

import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f76731n = new n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Set f76732t = new HashSet();

    public static final void n() {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            f76731n.t();
            Set set = f76732t;
            if (set != null && !set.isEmpty()) {
                rl = true;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final boolean rl(String eventName) {
        if (VmF.j.nr(n.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl) {
                return f76732t.contains(eventName);
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return false;
        }
    }

    private n() {
    }

    private final void t() {
        HashSet hashSetAz;
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ != null && (hashSetAz = vd.az(qjXQ.t())) != null) {
                    f76732t = hashSetAz;
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
