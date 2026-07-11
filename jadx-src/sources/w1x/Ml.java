package w1x;

import android.os.Bundle;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.safedk.android.analytics.events.a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import w1x.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f74790n = new Ml();
    private static final String rl = I28.class.getSimpleName();

    public static final Bundle n(I28.j eventType, String applicationId, List appEvents) {
        if (VmF.j.nr(Ml.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(a.f62811a, eventType.toString());
            bundle.putString("app_id", applicationId);
            if (I28.j.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayRl = f74790n.rl(appEvents, applicationId);
            if (jSONArrayRl.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayRl.toString());
            return bundle;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    private Ml() {
    }

    private final JSONArray rl(List list, String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.appevents.Ml> mutableList = CollectionsKt.toMutableList((Collection) list);
            kdD.j.nr(mutableList);
            boolean zT2 = t(str);
            for (com.facebook.appevents.Ml ml : mutableList) {
                if (!ml.KN() || (ml.KN() && zT2)) {
                    jSONArray.put(ml.O());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final boolean t(String str) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            QJ qjXQ = UGc.XQ(str, false);
            if (qjXQ == null) {
                return false;
            }
            return qjXQ.aYN();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
