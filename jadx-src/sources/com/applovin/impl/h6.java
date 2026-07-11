package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class h6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f48659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f48660h;

    private static final class a extends s7 {
        void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f49946b.add(p8Var);
        }

        a(JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
            super(jSONObject, jSONObject2, c1802k);
        }
    }

    private static final class b extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f48661i;

        @Override // java.lang.Runnable
        public void run() {
            p8 p8VarB = b(this.f48661i);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to process XML: " + this.f48661i);
            }
            c(this.f48661i);
            a(t7.XML_PARSING);
        }

        b(String str, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
            super(s7Var, appLovinAdLoadListener, c1802k);
            this.f48661i = str;
        }
    }

    public static h6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        return new c(new a(jSONObject, jSONObject2, c1802k), appLovinAdLoadListener, c1802k);
    }

    private static final class c extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JSONObject f48662i;

        c(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
            super(s7Var, appLovinAdLoadListener, c1802k);
            this.f48662i = s7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f48662i, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f48733a.a(x4.P4)).intValue()) {
                    p8 p8VarB = b(string);
                    if (p8VarB != null) {
                        a(p8VarB);
                        return;
                    }
                    if (C1804o.a()) {
                        this.f48735c.b(this.f48734b, "Unable to process XML: " + string);
                    }
                    c(string);
                    a(t7.XML_PARSING);
                    return;
                }
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "VAST response is over max length");
                }
                a(t7.XML_PARSING);
                return;
            }
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "No VAST response received.");
            }
            a(t7.NO_WRAPPER_RESPONSE);
        }
    }

    private static final class d extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p8 f48663i;

        d(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
            super(s7Var, appLovinAdLoadListener, c1802k);
            if (p8Var != null) {
                if (s7Var != null) {
                    if (appLovinAdLoadListener != null) {
                        this.f48663i = p8Var;
                        return;
                    }
                    throw new IllegalArgumentException("No callback specified.");
                }
                throw new IllegalArgumentException("No context specified.");
            }
            throw new IllegalArgumentException("No response specified.");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processing VAST Wrapper response...");
            }
            a(this.f48663i);
        }
    }

    h6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super("TaskProcessVastResponse", c1802k);
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f48659g = appLovinAdLoadListener;
        this.f48660h = (a) s7Var;
    }

    protected p8 b(String str) {
        try {
            return q8.a(str, this.f48733a);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to process VAST response", th);
            }
            a(t7.XML_PARSING);
            this.f48733a.D().a(this.f48734b, th);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f48733a.a(x4.i5)), 1).iterator();
        while (it.hasNext()) {
            p8 p8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (p8VarB != null) {
                this.f48660h.a(p8VarB);
            }
        }
    }

    public static h6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        return new b(str, new a(jSONObject, jSONObject2, c1802k), appLovinAdLoadListener, c1802k);
    }

    public static h6 a(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        return new d(p8Var, s7Var, appLovinAdLoadListener, c1802k);
    }

    void a(p8 p8Var) {
        int iD = this.f48660h.d();
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finished parsing XML at depth " + iD);
        }
        this.f48660h.a(p8Var);
        if (a8.b(p8Var)) {
            int iIntValue = ((Integer) this.f48733a.a(x4.f50785Q4)).intValue();
            if (iD < iIntValue) {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "VAST response is wrapper. Resolving...");
                }
                this.f48733a.q0().a(new p6(this.f48660h, this.f48659g, this.f48733a));
                return;
            }
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(t7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (a8.a(p8Var)) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "VAST response is inline. Rendering ad...");
            }
            this.f48733a.q0().a(new k6(this.f48660h, this.f48659g, this.f48733a));
            return;
        }
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "VAST response is an error");
        }
        a(t7.NO_WRAPPER_RESPONSE);
    }

    void a(t7 t7Var) {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Failed to process VAST response due to VAST error code " + t7Var);
        }
        a8.a(this.f48660h, this.f48659g, t7Var, -6, this.f48733a);
    }
}
