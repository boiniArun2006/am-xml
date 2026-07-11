package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f53401a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnitDisplayType f53402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f53403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f53404d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "refresh", this.f53401a);
        c1.a(jSONObject, "unitDisplayType", this.f53402b);
        c1.a(jSONObject, MRAIDPresenter.CLOSE, this.f53403c);
        c1.a(jSONObject, "hideDelay", this.f53404d);
        return jSONObject;
    }
}
