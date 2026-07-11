package eR;

import android.util.Log;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f63716n = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f63717t = j.class.getCanonicalName();
    private static final List nr = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Set f63715O = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: eR.j$j, reason: collision with other inner class name */
    public static final class C0849j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f63718n;
        private Map rl;

        public C0849j(String eventName, Map restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f63718n = eventName;
            this.rl = restrictiveParams;
        }

        public final String n() {
            return this.f63718n;
        }

        public final Map rl() {
            return this.rl;
        }

        public final void t(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.rl = map;
        }
    }

    public static final void J2(Map parameters, String eventName) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String strRl = f63716n.rl(eventName, str);
                    if (strRl != null) {
                        map.put(str, strRl);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final String O(String eventName) {
        if (VmF.j.nr(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl) {
                if (f63716n.nr(eventName)) {
                    return "_removed_";
                }
            }
            return eventName;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return null;
        }
    }

    public static final void n() {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            rl = true;
            f63716n.t();
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    private j() {
    }

    private final boolean nr(String str) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            return f63715O.contains(str);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final String rl(String str, String str2) {
        try {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
            } catch (Exception e2) {
                Log.w(f63717t, "getMatchedRuleType failed", e2);
            }
            for (C0849j c0849j : new ArrayList(nr)) {
                if (c0849j != null && Intrinsics.areEqual(str, c0849j.n())) {
                    for (String str3 : c0849j.rl().keySet()) {
                        if (Intrinsics.areEqual(str2, str3)) {
                            return (String) c0849j.rl().get(str3);
                        }
                        return null;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void t() {
        String strCk;
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null || (strCk = qjXQ.ck()) == null || strCk.length() == 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strCk);
                nr.clear();
                f63715O.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        C0849j c0849j = new C0849j(key, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            c0849j.t(vd.ck(jSONObjectOptJSONObject));
                            nr.add(c0849j);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            f63715O.add(c0849j.n());
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
