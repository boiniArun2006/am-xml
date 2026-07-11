package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f53451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f53452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f53453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Skip f53454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f53455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TapAction f53456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Orientation f53457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f53458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f53459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f53460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f53461k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f53452b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f53453c = numValueOf2;
        jVar.f53454d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f53455e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f53451a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f53457g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f53456f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f53458h = numValueOf3;
        jVar.f53459i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f53460j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i2, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f53461k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
