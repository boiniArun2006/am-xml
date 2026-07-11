package aP;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static SharedPreferences f12899t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f12898n = new n();
    private static final Map rl = new LinkedHashMap();
    private static final AtomicBoolean nr = new AtomicBoolean(false);

    public static final void n(String pathID, String predictedEvent) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!nr.get()) {
                f12898n.t();
            }
            Map map = rl;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f12899t;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", vd.m(MapsKt.toMap(map))).apply();
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final String nr(String pathID) {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map map = rl;
            if (map.containsKey(pathID)) {
                return (String) map.get(pathID);
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public static final String rl(View view, String text) {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = Zfb.Wre.mUb(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return vd.EWS(jSONObject.toString());
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    private final void t() {
        String str = "";
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = nr;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            f12899t = sharedPreferences;
            Map map = rl;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(vd.dR0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private n() {
    }
}
