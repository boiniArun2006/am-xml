package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f53471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f53472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f53473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f53474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Orientation f53475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f53476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f53477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Skip f53478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TapAction f53479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f53480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f53481k;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f53471a);
        c1.a(jSONObject, "maxBitrate", this.f53472b);
        c1.a(jSONObject, "minBitrate", this.f53473c);
        c1.a(jSONObject, "muted", this.f53474d);
        c1.a(jSONObject, "orientation", this.f53475e);
        c1.a(jSONObject, "padding", this.f53476f);
        c1.a(jSONObject, "pivotBitrate", this.f53477g);
        c1.a(jSONObject, "skip", this.f53478h);
        c1.a(jSONObject, "tapAction", this.f53479i);
        c1.a(jSONObject, "unitDisplayType", this.f53480j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f53481k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f53471a = bool;
        this.f53472b = 5000;
        this.f53473c = 0;
        this.f53474d = bool;
        this.f53476f = 0;
        this.f53477g = 2048;
        this.f53478h = Skip.fromValue(0);
        this.f53481k = new ArrayList();
    }
}
