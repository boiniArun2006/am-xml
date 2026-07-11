package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class w7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f50717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f50718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50719c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    static w7 a(p8 p8Var, w7 w7Var, C1802k c1802k) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (w7Var == null) {
            try {
                w7Var = new w7();
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                c1802k.D().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (w7Var.f50718b == null && !StringUtils.isValidString(w7Var.f50719c)) {
            String strA = a(p8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                w7Var.f50718b = Uri.parse(strA);
                w7Var.f50717a = a.STATIC;
                return w7Var;
            }
            String strA2 = a(p8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                w7Var.f50717a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    w7Var.f50718b = Uri.parse(strA2);
                    return w7Var;
                }
                w7Var.f50719c = strA2;
                return w7Var;
            }
            String strA3 = a(p8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                w7Var.f50717a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    w7Var.f50718b = Uri.parse(strA3);
                    return w7Var;
                }
                w7Var.f50719c = strA3;
            }
        }
        return w7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.f50717a != w7Var.f50717a) {
            return false;
        }
        Uri uri = this.f50718b;
        if (uri == null ? w7Var.f50718b != null : !uri.equals(w7Var.f50718b)) {
            return false;
        }
        String str = this.f50719c;
        String str2 = w7Var.f50719c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String b() {
        return this.f50719c;
    }

    public Uri c() {
        return this.f50718b;
    }

    public a d() {
        return this.f50717a;
    }

    public int hashCode() {
        a aVar = this.f50717a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f50718b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f50719c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f50717a + ", resourceUri=" + this.f50718b + ", resourceContents='" + this.f50719c + "'}";
    }

    private w7() {
    }

    private static String a(p8 p8Var, String str) {
        p8 p8VarC = p8Var.c(str);
        if (p8VarC != null) {
            return p8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f50718b = uri;
    }

    public void a(String str) {
        this.f50719c = str;
    }

    public static w7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        w7 w7Var = new w7();
        w7Var.f50717a = aVarValueOf;
        w7Var.f50718b = uri;
        w7Var.f50719c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return w7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f50717a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f50718b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f50719c);
        return jSONObject;
    }
}
