package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1785k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48796b;

    /* JADX INFO: renamed from: com.applovin.impl.k$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48801a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f48801a;
        }

        a(String str) {
            this.f48801a = str;
        }
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AppLovinNetworkBridge.stringInit(Base64.decode(this.f48796b.substring(d().length()), 0), com.google.android.exoplayer2.C.UTF8_NAME));
                this.f48795a.O();
                if (!C1804o.a()) {
                    return jSONObject;
                }
                this.f48795a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e2) {
                this.f48795a.O();
                if (C1804o.a()) {
                    this.f48795a.O().a("AdToken", "Unable to decode token '" + this.f48796b + "' into JSON", e2);
                }
                this.f48795a.D().a("AdToken", "decodeFullAdResponseStr", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            this.f48795a.O();
            if (C1804o.a()) {
                this.f48795a.O().a("AdToken", "Unable to process ad response from token '" + this.f48796b + "'", e3);
            }
            this.f48795a.D().a("AdToken", "decodeFullAdResponse", e3);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785k)) {
            return false;
        }
        String str = this.f48796b;
        String str2 = ((C1785k) obj).f48796b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String b() {
        return this.f48796b;
    }

    public a c() {
        return a(x4.f50850x0) != null ? a.REGULAR : a(x4.y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f50850x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public int hashCode() {
        String str = this.f48796b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f48796b) + ", type=" + c() + '}';
    }

    public C1785k(String str, C1802k c1802k) {
        if (!TextUtils.isEmpty(str)) {
            if (c1802k != null) {
                this.f48796b = str;
                this.f48795a = c1802k;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("Identifier is empty");
    }

    private String a(x4 x4Var) {
        for (String str : this.f48795a.c(x4Var)) {
            if (this.f48796b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
