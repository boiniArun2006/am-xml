package kdD;

import com.facebook.appevents.Ml;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f70065n = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f70066t = new ArrayList();
    private static final Set nr = new HashSet();

    /* JADX INFO: renamed from: kdD.j$j, reason: collision with other inner class name */
    public static final class C1035j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f70067n;
        private List rl;

        public C1035j(String eventName, List deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f70067n = eventName;
            this.rl = deprecateParams;
        }

        public final List n() {
            return this.rl;
        }

        public final String rl() {
            return this.f70067n;
        }

        public final void t(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.rl = list;
        }
    }

    private final synchronized void rl() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            QJ qjXQ = UGc.XQ(s4.az(), false);
            if (qjXQ == null) {
                return;
            }
            String strCk = qjXQ.ck();
            if (strCk != null && strCk.length() > 0) {
                JSONObject jSONObject = new JSONObject(strCk);
                f70066t.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set set = nr;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            set.add(key);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            C1035j c1035j = new C1035j(key, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                c1035j.t(vd.ty(jSONArrayOptJSONArray));
                            }
                            f70066t.add(c1035j);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final void n() {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            rl = true;
            f70065n.rl();
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final void nr(List events) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (rl) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (nr.contains(((Ml) it.next()).J2())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final void t(Map parameters, String eventName) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (rl) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C1035j c1035j : new ArrayList(f70066t)) {
                    if (Intrinsics.areEqual(c1035j.rl(), eventName)) {
                        for (String str : arrayList) {
                            if (c1035j.n().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    private j() {
    }
}
