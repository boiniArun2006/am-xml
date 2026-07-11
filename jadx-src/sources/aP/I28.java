package aP;

import android.app.Activity;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.s4;
import eK.Wre;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f12884n = new I28();
    private static final AtomicBoolean rl = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f12885t = new LinkedHashSet();
    private static final Set nr = new LinkedHashSet();

    public static final boolean J2(String event) {
        if (VmF.j.nr(I28.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f12885t.contains(event);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return false;
        }
    }

    public static final void KN(Activity activity) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (!rl.get() || !j.J2() || (f12885t.isEmpty() && nr.isEmpty())) {
                    CN3.J2.rl(activity);
                    return;
                }
                CN3.J2.n(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final boolean O(String event) {
        if (VmF.j.nr(I28.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return nr.contains(event);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return false;
        }
    }

    public static final synchronized void rl() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            s4.Z().execute(new Runnable() { // from class: aP.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    I28.t();
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = rl;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f12884n.nr();
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public final void Uo(String str) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Set set = f12885t;
                    String string = jSONArray.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    Set set2 = nr;
                    String string2 = jSONArray2.getString(i3);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private I28() {
    }

    private final void nr() {
        String strS;
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ != null && (strS = qjXQ.S()) != null) {
                    Uo(strS);
                    if (f12885t.isEmpty() && nr.isEmpty()) {
                        return;
                    }
                    File fileQie = eK.Wre.qie(Wre.j.MTML_APP_EVENT_PREDICTION);
                    if (fileQie != null) {
                        j.nr(fileQie);
                        Activity activityAz = UiE.CN3.az();
                        if (activityAz != null) {
                            KN(activityAz);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
