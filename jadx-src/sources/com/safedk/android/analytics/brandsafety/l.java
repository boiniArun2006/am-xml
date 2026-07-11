package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class l implements com.safedk.android.utils.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f62620A = "fgr";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f62621B = "vst";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f62622C = "adr";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f62623D = "fsc";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f62624E = "fsr";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f62625F = "web";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f62626G = "vhc";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f62627H = "mrl";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f62628I = "url";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f62629J = "cuo";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f62630K = "typ";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f62631L = "vad";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f62632M = "mth";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f62633N = "ntw";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f62634O = "api";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f62635P = "org";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f62636Q = "dec";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f62637R = "cnt";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f62638S = "ads";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f62639T = "cls";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f62640U = "tchrcnt";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f62641V = "tchintrvl";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f62642W = "lvl";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f62643X = "can";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f62644Y = "fin";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f62645Z = "med";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62646a = "pre";
    public static final String aa = "low";
    public static final String ab = "crt";
    public static final String ac = "||";
    public static final String ad = "|";
    public static final String ae = "=";
    public static final String af = "[...]";
    private static final String ag = "ImpressionLog";
    private static final int ah = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62647b = "pr2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62648c = "prd";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62649d = "mwl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62650e = "mdl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62651f = "mwd";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62652g = "mdd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62653h = "mck";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62654i = "mdh";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62655j = "mfd";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62656k = "mrv";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62657l = "add";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62658m = "cim";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62659n = "clk";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62660o = "vib";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62661p = "vie";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f62662q = "ppl";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f62663r = "lad";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f62664s = "lar";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f62665t = "img";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f62666u = "jsm";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f62667v = "wnr";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f62668w = "int";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f62669x = "rid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f62670y = "exp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f62671z = "bgr";
    private long ai = Long.MAX_VALUE;
    private long aj = Long.MAX_VALUE;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private final Map<Long, List<String>> f62672ak = new TreeMap();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f62673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f62674b;

        public a(String str, String str2) {
            this.f62673a = str;
            this.f62674b = str2;
        }
    }

    public l() {
    }

    public l(l lVar) {
        a(lVar);
    }

    public synchronized void a(l lVar) {
        if (lVar != null) {
            this.ai = Math.min(this.ai, lVar.ai);
            this.aj = Math.min(this.aj, lVar.aj);
            synchronized (lVar) {
                for (Map.Entry<Long, List<String>> entry : lVar.f62672ak.entrySet()) {
                    List<String> arrayList = this.f62672ak.get(entry.getKey());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f62672ak.put(entry.getKey(), arrayList);
                    }
                    arrayList.addAll(entry.getValue());
                }
            }
        }
    }

    private StringBuilder c(String str, a[] aVarArr) {
        StringBuilder sb = new StringBuilder(str);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String strA = aVar.f62674b;
                if (aVar.f62673a.equals("url")) {
                    strA = a(aVar.f62674b, 60);
                }
                sb.append(ad);
                sb.append(aVar.f62673a);
                sb.append(ae);
                sb.append(strA);
            }
        }
        return sb;
    }

    public synchronized void a(Long l2, Long l5, String str, a... aVarArr) {
        this.ai = Math.min(this.ai, l2.longValue());
        this.aj = Math.min(this.aj, l5.longValue());
        try {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbC = c(str, aVarArr);
                List<String> arrayList = this.f62672ak.get(l5);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f62672ak.put(l5, arrayList);
                } else if (arrayList.contains(sbC.toString())) {
                    return;
                }
                arrayList.add(sbC.toString());
                Logger.d(ag, "add event: ", sbC, " at: ", l2, ", count: ", Integer.valueOf(arrayList.size()));
            }
        } catch (NullPointerException e2) {
            Logger.d(ag, "add event failed: type=", str, ", logEvents=", this.f62672ak, ", timeElapsed=", l5);
        }
    }

    public void a(String str, a... aVarArr) {
        a(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized void b(Long l2, Long l5, String str, a... aVarArr) {
        this.ai = Math.min(this.ai, l2.longValue());
        this.aj = Math.min(this.aj, l5.longValue());
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbC = c(str, aVarArr);
            int iB = 0;
            for (List<String> list : this.f62672ak.values()) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (next.contains(sbC.toString())) {
                            iB = b(next);
                            list.remove(next);
                            break;
                        }
                    }
                }
            }
            sbC.append(ad);
            sbC.append(f62637R);
            sbC.append(obbPUqyhtS.jUXriDXP);
            sbC.append(iB + 1);
            List<String> arrayList = this.f62672ak.get(l5);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f62672ak.put(l5, arrayList);
            }
            arrayList.add(sbC.toString());
            Logger.d(ag, "add cumulative event: ", sbC, " at: ", l2, ", count: ", Integer.valueOf(arrayList.size()));
        }
    }

    public void b(String str, a... aVarArr) {
        b(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    private int b(String str) {
        try {
            String[] strArrSplit = str.split("cnt=");
            if (strArrSplit.length > 1) {
                return Integer.parseInt(strArrSplit[1]);
            }
        } catch (Exception e2) {
            Logger.d(ag, "get cumulative event counter, failed to parse event count from: ", str);
        }
        return 0;
    }

    private String a(String str, int i2) {
        if (str != null && str.length() > i2) {
            return str.substring(0, ((i2 * 2) / 3) - 3) + af + str.substring((str.length() - (i2 / 3)) + 2);
        }
        return str;
    }

    public synchronized boolean a(String str) {
        Iterator<List<String>> it = this.f62672ak.values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int a() {
        return this.f62672ak.size();
    }

    public synchronized String toString() {
        StringBuilder sb;
        boolean z2 = true;
        sb = new StringBuilder();
        for (Map.Entry<Long, List<String>> entry : this.f62672ak.entrySet()) {
            for (String str : entry.getValue()) {
                if (z2) {
                    sb.append(this.ai);
                    z2 = false;
                } else {
                    sb.append(ac);
                    sb.append(entry.getKey().longValue() - this.aj);
                }
                sb.append(ad);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("referenceTimeMillis", this.ai);
        jSONObject.put("referenceTimeElapsed", this.aj);
        if (!this.f62672ak.isEmpty()) {
            jSONObject.put("logEvents", com.safedk.android.utils.d.a(this.f62672ak));
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.ai = jSONObject.optLong("referenceTimeMillis", 0L);
            this.aj = jSONObject.optLong("referenceTimeElapsed", 0L);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("logEvents");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f62672ak.put(Long.valueOf(Long.parseLong(next)), com.safedk.android.utils.d.b(jSONObjectOptJSONObject.getJSONArray(next)));
                }
            }
        }
    }
}
