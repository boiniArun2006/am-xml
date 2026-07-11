package com.google.firebase.storage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f60873n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60874t;

    static fuX n(I28 i28, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(i28.ck(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                arrayList2.add(i28.ck(jSONArray2.getJSONObject(i3).getString(AppMeasurementSdk.ConditionalUserProperty.NAME)));
            }
        }
        return new fuX(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    public List nr() {
        return this.f60873n;
    }

    public List rl() {
        return this.rl;
    }

    public String t() {
        return this.f60874t;
    }

    fuX(List list, List list2, String str) {
        this.f60873n = list;
        this.rl = list2;
        this.f60874t = str;
    }
}
