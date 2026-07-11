package UiE;

import android.content.Context;
import com.facebook.Ew;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import com.safedk.android.analytics.events.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f10799n = new Dsr();
    private static final Map rl = MapsKt.hashMapOf(TuplesKt.to(j.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.to(j.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum j {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static final JSONObject n(j activityType, com.facebook.internal.j jVar, String str, boolean z2, Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(a.f62811a, rl.get(activityType));
        String strO = com.facebook.appevents.Xo.rl.O();
        if (strO != null) {
            jSONObject.put("app_user_id", strO);
        }
        vd.HV(jSONObject, jVar, str, z2, context);
        try {
            vd.GD(jSONObject, context);
        } catch (Exception e2) {
            Z.f52780O.t(Ew.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        JSONObject jSONObjectFD = vd.fD();
        if (jSONObjectFD != null) {
            Iterator<String> itKeys = jSONObjectFD.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectFD.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }

    private Dsr() {
    }
}
