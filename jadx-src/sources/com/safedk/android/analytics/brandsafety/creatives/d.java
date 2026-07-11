package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.c;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62074b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62075c = "dynamicMarkup";

    public d(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.c
    public c.a a() {
        c.a aVarA = super.a();
        if (this.f62067a.optString(f62074b, null) == null) {
            aVarA.f62069b = a(aVarA.f62071d);
        }
        return aVarA;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.c
    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(f62075c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("ad_click_dest[\\s].*?=[\\s].*?\\\"([\\S].*?)\\\"").matcher(str);
        if (matcher.find() && matcher.groupCount() > 0) {
            return matcher.group(1);
        }
        return null;
    }
}
