package zx;

import android.os.Bundle;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f76729n = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static HashSet f76730t = new HashSet();

    public static final void n() {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            if (rl) {
                return;
            }
            f76729n.rl();
            rl = !f76730t.isEmpty();
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final void nr(Bundle bundle) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            if (rl && bundle != null) {
                Iterator it = f76730t.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    private j() {
    }

    private final void rl() {
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null) {
                    return;
                }
                f76730t = t(qjXQ.rl());
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final HashSet t(JSONArray jSONArray) {
        try {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                HashSet hashSetAz = vd.az(jSONArray);
                if (hashSetAz == null) {
                    return new HashSet();
                }
                return hashSetAz;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
