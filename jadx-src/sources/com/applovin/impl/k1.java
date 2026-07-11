package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f48805c;

    public String a() {
        return this.f48804b;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || n7.a(str2, str) != 1) {
            return str3 == null || n7.a(str3, str) != -1;
        }
        return false;
    }

    public String b() {
        return this.f48803a;
    }

    public boolean c() {
        return this.f48805c;
    }

    k1(JSONObject jSONObject, C1802k c1802k) {
        this.f48803a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f48804b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f48805c = n7.a(list);
        } else {
            this.f48805c = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }
}
