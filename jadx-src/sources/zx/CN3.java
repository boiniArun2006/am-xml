package zx;

import android.os.Bundle;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f76718n = new CN3();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static HashSet f76719t = new HashSet();
    private static Map nr = new HashMap();

    public static final void n() {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            f76718n.rl();
            if (f76719t.isEmpty() && nr.isEmpty()) {
                rl = false;
            } else {
                rl = true;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    private final void rl() {
        HashSet hashSetAz;
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            QJ qjXQ = UGc.XQ(s4.az(), false);
            if (qjXQ == null) {
                return;
            }
            try {
                f76719t = new HashSet();
                nr = new HashMap();
                JSONArray jSONArrayO = qjXQ.o();
                if (jSONArrayO == null || jSONArrayO.length() == 0) {
                    return;
                }
                int length = jSONArrayO.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArrayO.getJSONObject(i2);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String sensitiveParamsScope = jSONObject.getString("key");
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (jSONArray != null && (hashSetAz = vd.az(jSONArray)) != null) {
                            if (sensitiveParamsScope.equals("_MTSDK_Default_")) {
                                f76719t = hashSetAz;
                            } else {
                                Map map = nr;
                                Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                map.put(sensitiveParamsScope, hashSetAz);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final void t(Bundle bundle, String eventName) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl && bundle != null) {
                if (!f76719t.isEmpty() || nr.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) nr.get(eventName);
                        for (String key : new ArrayList(bundle.keySet())) {
                            CN3 cn3 = f76718n;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            if (cn3.nr(key, hashSet)) {
                                bundle.remove(key);
                                jSONArray.put(key);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    private CN3() {
    }

    private final boolean nr(String str, HashSet hashSet) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (!f76719t.contains(str)) {
                if (hashSet != null && !hashSet.isEmpty()) {
                    if (hashSet.contains(str)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
