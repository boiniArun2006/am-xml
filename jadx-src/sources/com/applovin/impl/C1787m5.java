package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class C1787m5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f48955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f48956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f48957s;

    /* JADX INFO: renamed from: com.applovin.impl.m5$a */
    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                C1787m5.this.f48955q.m1();
                C1787m5.this.f48955q.c(uri);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.m5$b */
    class b implements l5.e {
        b() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            C1787m5.this.f48955q.d(C1787m5.this.d(str));
            C1787m5.this.f48955q.b(true);
            C1804o c1804o = C1787m5.this.f48735c;
            if (C1804o.a()) {
                C1787m5 c1787m5 = C1787m5.this;
                c1787m5.f48735c.a(c1787m5.f48734b, "Finish caching non-video resources for ad #" + C1787m5.this.f48955q.getAdIdNumber());
            }
            C1787m5 c1787m52 = C1787m5.this;
            c1787m52.f48735c.f(c1787m52.f48734b, "Ad updated with cachedHTML = " + C1787m5.this.f48955q.g1());
        }
    }

    public C1787m5(com.applovin.impl.sdk.ad.a aVar, C1802k c1802k, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, c1802k, appLovinAdLoadListener);
        this.f48955q = aVar;
    }

    private e0 p() {
        return b(this.f48955q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f48955q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching optional HTML resources...");
        }
        String strG1 = this.f48955q.g1();
        for (String str : listH) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Caching optional resource: " + str);
            }
            int iA = this.f48733a.G().a(str, this.f48882g);
            Map mapA = f2.a((AppLovinAdImpl) this.f48882g);
            String strA = this.f48733a.G().a(C1802k.o(), str, this.f48955q.getCachePrefix(), this.f48955q.S(), true, true, iA, this.f48884i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Updating HTML with cached optional resource: " + strA);
                }
                this.f48955q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f48955q.d(strG1);
            } else {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finish caching optional HTML resources for ad #" + this.f48955q.getAdIdNumber());
        }
    }

    public void b(boolean z2) {
        this.f48957s = z2;
    }

    public void c(boolean z2) {
        this.f48956r = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (n7.j(C1802k.o())) {
            str = n7.c(str);
        }
        if (this.f48955q.isOpenMeasurementEnabled()) {
            return this.f48733a.e0().a(str, f2.a((AppLovinAdImpl) this.f48882g));
        }
        return str;
    }

    private void m() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching non-optional HTML resources...");
        }
        this.f48955q.d(d(a(this.f48955q.g1(), this.f48955q.S(), this.f48955q)));
        this.f48955q.b(true);
        a(this.f48955q);
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finish caching non-optional HTML resources for ad #" + this.f48955q.getAdIdNumber());
        }
        this.f48735c.f(this.f48734b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f48955q.g1());
    }

    private void n() {
        Uri uriC;
        if (!l() && (uriC = c(this.f48955q.k1())) != null) {
            this.f48955q.m1();
            this.f48955q.c(uriC);
        }
    }

    private d0 o() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching HTML resources...");
        }
        return a(this.f48955q.g1(), this.f48955q.S(), new b());
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f48955q.C0();
        boolean z2 = this.f48957s;
        if (!zC0 && !z2) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Begin processing for non-streaming ad #" + this.f48955q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f48733a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!o0.d()) {
                    arrayList.addAll(e());
                }
                d0 d0VarO = o();
                if (d0VarO != null) {
                    arrayList.add(d0VarO);
                }
                e0 e0VarP = p();
                if (e0VarP != null) {
                    arrayList.add(e0VarP);
                }
                a(arrayList);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        } else {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Begin caching for streaming ad #" + this.f48955q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f48733a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (zC0) {
                    if (this.f48956r) {
                        f();
                        d0 d0VarO2 = o();
                        if (d0VarO2 != null) {
                            arrayList2.add(d0VarO2);
                        }
                        e0 e0VarP2 = p();
                        if (e0VarP2 != null) {
                            arrayList2.add(e0VarP2);
                        }
                    } else {
                        d0 d0VarO3 = o();
                        if (d0VarO3 != null) {
                            a(Arrays.asList(d0VarO3));
                        }
                        f();
                        e0 e0VarP3 = p();
                        if (e0VarP3 != null) {
                            arrayList2.add(e0VarP3);
                        }
                    }
                } else {
                    f();
                    d0 d0VarO4 = o();
                    if (d0VarO4 != null) {
                        arrayList2.add(d0VarO4);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f48956r) {
                        f();
                    }
                    m();
                    if (!this.f48956r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }
}
