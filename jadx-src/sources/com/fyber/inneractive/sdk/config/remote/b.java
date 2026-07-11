package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UnitDisplayType f53429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f53430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f53431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f53432d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int iOptInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("refresh", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        bVar.f53429a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f53430b = jSONObject.has(MRAIDPresenter.CLOSE) ? Boolean.valueOf(jSONObject.optBoolean(MRAIDPresenter.CLOSE, true)) : null;
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        bVar.f53432d = numValueOf;
        bVar.f53431c = iOptInt2 != Integer.MIN_VALUE ? numValueOf2 : null;
        return bVar;
    }
}
