package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.b f61134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f61135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f61136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f61137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f61138f;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        f61141c
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f61133a = str;
        this.f61134b = new com.iab.omid.library.applovin.weakreference.b(null);
    }

    public void a() {
        this.f61138f = f.b();
        this.f61137e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f61134b.clear();
    }

    public AdEvents c() {
        return this.f61135c;
    }

    public MediaEvents d() {
        return this.f61136d;
    }

    public boolean e() {
        return this.f61134b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f61133a);
    }

    public void g() {
        h.a().b(getWebView(), this.f61133a);
    }

    public WebView getWebView() {
        return this.f61134b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f3) {
        h.a().a(getWebView(), this.f61133a, f3);
    }

    public void b(String str, long j2) {
        if (j2 >= this.f61138f) {
            this.f61137e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f61133a, str);
        }
    }

    void a(WebView webView) {
        this.f61134b = new com.iab.omid.library.applovin.weakreference.b(webView);
    }

    public void b(boolean z2) {
        if (e()) {
            h.a().a(getWebView(), this.f61133a, z2 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f61135c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f61133a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f61133a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", PangleCreativeInfo.f62498a);
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.3-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, PangleCreativeInfo.f62498a, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f61136d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j2) {
        if (j2 >= this.f61138f) {
            a aVar = this.f61137e;
            a aVar2 = a.f61141c;
            if (aVar != aVar2) {
                this.f61137e = aVar2;
                h.a().b(getWebView(), this.f61133a, str);
            }
        }
    }

    public void a(String str, @Nullable JSONObject jSONObject) {
        h.a().a(getWebView(), this.f61133a, str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, StatsEvent.f62824A, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(@Nullable JSONObject jSONObject) {
        h.a().b(getWebView(), this.f61133a, jSONObject);
    }

    public void a(boolean z2) {
        if (e()) {
            h.a().c(getWebView(), this.f61133a, z2 ? "foregrounded" : "backgrounded");
        }
    }
}
