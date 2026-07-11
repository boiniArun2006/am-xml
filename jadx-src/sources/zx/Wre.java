package zx;

import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f76725n = new Wre();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map f76726t = new HashMap();

    public static final void n() {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            f76725n.t();
            if (f76726t.isEmpty()) {
                return;
            }
            rl = true;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    public static final String nr(String eventName) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl) {
                String strRl = f76725n.rl(eventName);
                if (strRl != null) {
                    return strRl;
                }
            }
            return eventName;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    private final void t() {
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
                f76726t = new HashMap();
                JSONArray jSONArrayHI = qjXQ.HI();
                if (jSONArrayHI == null || jSONArrayHI.length() == 0) {
                    return;
                }
                int length = jSONArrayHI.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArrayHI.getJSONObject(i2);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetAz = vd.az(jSONArray)) != null) {
                            f76726t.put(string, hashSetAz);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private Wre() {
    }

    private final String rl(String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            for (String str2 : f76726t.keySet()) {
                HashSet hashSet = (HashSet) f76726t.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
