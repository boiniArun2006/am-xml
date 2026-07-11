package com.google.firebase.storage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C {
    private w6 HI;
    private w6 J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f60826O;
    private String Uo;
    private w6 az;
    private w6 ck;
    private String gh;
    private long mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60827n;
    private String nr;
    private w6 qie;
    private I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private o f60828t;
    private w6 ty;
    private String xMQ;

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C f60829n;
        boolean rl;

        n(JSONObject jSONObject, o oVar) {
            this(jSONObject);
            this.f60829n.f60828t = oVar;
        }

        private void t(JSONObject jSONObject) throws JSONException {
            this.f60829n.f60826O = jSONObject.optString("generation");
            this.f60829n.f60827n = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f60829n.nr = jSONObject.optString("bucket");
            this.f60829n.Uo = jSONObject.optString("metageneration");
            this.f60829n.KN = jSONObject.optString("timeCreated");
            this.f60829n.xMQ = jSONObject.optString("updated");
            this.f60829n.mUb = jSONObject.optLong("size");
            this.f60829n.gh = jSONObject.optString("md5Hash");
            if (jSONObject.has(TtmlNode.TAG_METADATA) && !jSONObject.isNull(TtmlNode.TAG_METADATA)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TtmlNode.TAG_METADATA);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    xMQ(next, jSONObject2.getString(next));
                }
            }
            String strRl = rl(jSONObject, "contentType");
            if (strRl != null) {
                KN(strRl);
            }
            String strRl2 = rl(jSONObject, "cacheControl");
            if (strRl2 != null) {
                nr(strRl2);
            }
            String strRl3 = rl(jSONObject, "contentDisposition");
            if (strRl3 != null) {
                O(strRl3);
            }
            String strRl4 = rl(jSONObject, "contentEncoding");
            if (strRl4 != null) {
                J2(strRl4);
            }
            String strRl5 = rl(jSONObject, "contentLanguage");
            if (strRl5 != null) {
                Uo(strRl5);
            }
        }

        public n J2(String str) {
            this.f60829n.ty = w6.nr(str);
            return this;
        }

        public n KN(String str) {
            this.f60829n.J2 = w6.nr(str);
            return this;
        }

        public n O(String str) {
            this.f60829n.az = w6.nr(str);
            return this;
        }

        public n Uo(String str) {
            this.f60829n.HI = w6.nr(str);
            return this;
        }

        public C n() {
            return new C(this.rl);
        }

        public n nr(String str) {
            this.f60829n.qie = w6.nr(str);
            return this;
        }

        public n xMQ(String str, String str2) {
            if (!this.f60829n.ck.rl()) {
                this.f60829n.ck = w6.nr(new HashMap());
            }
            ((Map) this.f60829n.ck.n()).put(str, str2);
            return this;
        }

        n(JSONObject jSONObject) throws JSONException {
            this.f60829n = new C();
            if (jSONObject != null) {
                t(jSONObject);
                this.rl = true;
            }
        }

        private String rl(JSONObject jSONObject, String str) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f60830n;
        private final Object rl;

        static w6 nr(Object obj) {
            return new w6(obj, true);
        }

        static w6 t(Object obj) {
            return new w6(obj, false);
        }

        Object n() {
            return this.rl;
        }

        boolean rl() {
            return this.f60830n;
        }

        w6(Object obj, boolean z2) {
            this.f60830n = z2;
            this.rl = obj;
        }
    }

    public C() {
        this.f60827n = null;
        this.rl = null;
        this.f60828t = null;
        this.nr = null;
        this.f60826O = null;
        this.J2 = w6.t("");
        this.Uo = null;
        this.KN = null;
        this.xMQ = null;
        this.gh = null;
        this.qie = w6.t("");
        this.az = w6.t("");
        this.ty = w6.t("");
        this.HI = w6.t("");
        this.ck = w6.t(Collections.EMPTY_MAP);
    }

    JSONObject Ik() {
        HashMap map = new HashMap();
        if (this.J2.rl()) {
            map.put("contentType", S());
        }
        if (this.ck.rl()) {
            map.put(TtmlNode.TAG_METADATA, new JSONObject((Map) this.ck.n()));
        }
        if (this.qie.rl()) {
            map.put("cacheControl", r());
        }
        if (this.az.rl()) {
            map.put("contentDisposition", o());
        }
        if (this.ty.rl()) {
            map.put("contentEncoding", Z());
        }
        if (this.HI.rl()) {
            map.put("contentLanguage", XQ());
        }
        return new JSONObject(map);
    }

    public String S() {
        return (String) this.J2.n();
    }

    public String XQ() {
        return (String) this.HI.n();
    }

    public String Z() {
        return (String) this.ty.n();
    }

    public String o() {
        return (String) this.az.n();
    }

    public String r() {
        return (String) this.qie.n();
    }

    private C(C c2, boolean z2) {
        this.f60827n = null;
        this.rl = null;
        this.f60828t = null;
        this.nr = null;
        this.f60826O = null;
        this.J2 = w6.t("");
        this.Uo = null;
        this.KN = null;
        this.xMQ = null;
        this.gh = null;
        this.qie = w6.t("");
        this.az = w6.t("");
        this.ty = w6.t("");
        this.HI = w6.t("");
        this.ck = w6.t(Collections.EMPTY_MAP);
        Preconditions.checkNotNull(c2);
        this.f60827n = c2.f60827n;
        this.rl = c2.rl;
        this.f60828t = c2.f60828t;
        this.nr = c2.nr;
        this.J2 = c2.J2;
        this.qie = c2.qie;
        this.az = c2.az;
        this.ty = c2.ty;
        this.HI = c2.HI;
        this.ck = c2.ck;
        if (z2) {
            this.gh = c2.gh;
            this.mUb = c2.mUb;
            this.xMQ = c2.xMQ;
            this.KN = c2.KN;
            this.Uo = c2.Uo;
            this.f60826O = c2.f60826O;
        }
    }
}
