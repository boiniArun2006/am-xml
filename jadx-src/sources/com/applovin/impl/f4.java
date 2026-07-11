package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f48525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1802k f48526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1804o f48527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f48528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f48529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected AdSession f48530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AdEvents f48531g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f48525a.isOpenMeasurementEnabled()) {
            if (C1804o.a()) {
                this.f48527c.d(this.f48528d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f48530f != null) {
            if (C1804o.a()) {
                this.f48527c.k(this.f48528d, "Attempting to start session again for ad: " + this.f48525a);
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f48527c.a(this.f48528d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f48530f = adSessionCreateAdSession;
            try {
                this.f48531g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f48530f);
                this.f48530f.start();
                this.f48529e = true;
                if (C1804o.a()) {
                    this.f48527c.a(this.f48528d, "Session started");
                }
            } catch (Throwable th) {
                if (C1804o.a()) {
                    this.f48527c.a(this.f48528d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (C1804o.a()) {
                this.f48527c.a(this.f48528d, "Failed to create session", th2);
            }
        }
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    protected void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fg
            @Override // java.lang.Runnable
            public final void run() {
                this.f48557n.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f48531g.impressionOccurred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f48531g.loaded();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.xZD
            @Override // java.lang.Runnable
            public final void run() {
                this.f50859n.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.o7q
            @Override // java.lang.Runnable
            public final void run() {
                this.f49628n.c();
            }
        });
    }

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.Mf
            @Override // java.lang.Runnable
            public final void run() {
                this.f47781n.d();
            }
        });
    }

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f48525a = appLovinAdBase;
        this.f48526b = appLovinAdBase.getSdk();
        this.f48527c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f48528d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f48530f.registerAdView(view);
        this.f48530f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f48530f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th) {
                    if (C1804o.a()) {
                        this.f48527c.a(this.f48528d, "Failed to add friendly obstruction (" + h4Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f48530f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f48529e) {
                if (C1804o.a()) {
                    this.f48527c.a(this.f48528d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48527c.a(this.f48528d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.KH
            @Override // java.lang.Runnable
            public final void run() {
                this.f47759n.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.LEl
            @Override // java.lang.Runnable
            public final void run() {
                this.f47764n.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f48529e = false;
        this.f48530f.finish();
        this.f48530f = null;
        this.f48531g = null;
    }

    protected void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gnv
            @Override // java.lang.Runnable
            public final void run() {
                this.f48623n.a(str, runnable);
            }
        });
    }
}
