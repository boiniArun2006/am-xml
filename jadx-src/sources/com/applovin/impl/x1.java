package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class x1 extends w1 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final y1 f50739M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private g0 f50740N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f50741O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final AtomicBoolean f50742P;

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.f50739M.a(this.f50660k, this.f50659j, b(), viewGroup);
        if (((Boolean) this.f50651b.a(x4.f50804X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f50659j;
            if (kVar != null) {
                kVar.b();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.f50650a);
            a("javascript:al_onPoststitialShow();", this.f50650a.x());
            if (h()) {
                long jC = C();
                this.f50741O = jC;
                if (jC > 0) {
                    if (C1804o.a()) {
                        this.f50652c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f50741O + "ms...");
                    }
                    this.f50740N = g0.a(this.f50741O, this.f50651b, new Runnable() { // from class: com.applovin.impl.KA
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47757n.F();
                        }
                    });
                }
            }
            if (this.f50660k != null) {
                if (this.f50650a.r() >= 0) {
                    a(this.f50660k, this.f50650a.r(), new Runnable() { // from class: com.applovin.impl.jjk
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48791n.G();
                        }
                    });
                } else {
                    this.f50660k.setVisibility(0);
                }
            }
            I();
            this.f50651b.q0().a(new C1797r6(this.f50651b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.hl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48677n.H();
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f50651b));
        }
    }

    @Override // com.applovin.impl.w1
    public void b(long j2) {
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f50650a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f50650a.r();
        }
        return (long) (n7.c(fH1) * (((double) this.f50650a.y()) / 100.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f50660k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f50659j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f50659j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f50650a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    protected void A() {
        this.f50739M.a(this.f50661l);
        this.f50666q = SystemClock.elapsedRealtime();
        this.f50742P.set(true);
    }

    protected boolean E() {
        if (!(this.f50647J && this.f50650a.a1()) && h()) {
            return this.f50742P.get();
        }
        return true;
    }

    protected void I() {
        long jP;
        long millis = 0;
        if (this.f50650a.O() >= 0 || this.f50650a.P() >= 0) {
            if (this.f50650a.O() >= 0) {
                jP = this.f50650a.O();
            } else {
                if (this.f50650a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f50650a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f50650a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) (millis * (((double) this.f50650a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, C1802k c1802k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, c1802k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f50739M = new y1(this.f50650a, this.f50653d, this.f50651b);
        this.f50742P = new AtomicBoolean();
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f50651b.a(x4.h1)).booleanValue() && !this.f50650a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.f50740N) != null) {
                iMin = (int) Math.min(100.0d, ((this.f50741O - g0Var.b()) / this.f50741O) * 100.0d);
            }
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.f50742P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f50666q = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    protected void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    protected void x() {
        super.x();
        this.f50742P.set(true);
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f50651b.a(x4.f50783P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f50650a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        g0 g0Var = this.f50740N;
        if (g0Var != null) {
            g0Var.a();
            this.f50740N = null;
        }
        super.a(str);
    }
}
