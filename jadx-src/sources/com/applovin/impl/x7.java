package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class x7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50857b;

    public static x7 a(p8 p8Var, x7 x7Var, C1802k c1802k) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                c1802k.D().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(x7Var.f50856a)) {
            String strD = p8Var.d();
            if (StringUtils.isValidString(strD)) {
                x7Var.f50856a = strD;
            }
        }
        if (!StringUtils.isValidString(x7Var.f50857b)) {
            String str = (String) p8Var.a().get(NodeModuleProcess.PROPERTY_VERSION);
            if (StringUtils.isValidString(str)) {
                x7Var.f50857b = str;
            }
        }
        return x7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        String str = this.f50856a;
        if (str == null ? x7Var.f50856a != null : !str.equals(x7Var.f50856a)) {
            return false;
        }
        String str2 = this.f50857b;
        String str3 = x7Var.f50857b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f50856a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50857b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f50856a + "', version='" + this.f50857b + "'}";
    }

    private x7() {
    }

    public static x7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        x7Var.f50856a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
        x7Var.f50857b = JsonUtils.getString(jSONObject, NodeModuleProcess.PROPERTY_VERSION, null);
        return x7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, this.f50856a);
        JsonUtils.putString(jSONObject, NodeModuleProcess.PROPERTY_VERSION, this.f50857b);
        return jSONObject;
    }
}
