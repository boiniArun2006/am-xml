package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n extends c {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f62682W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    Set<String> f62683X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f62684Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f62685Z;
    long aa;
    boolean ab;
    public String ac;
    public String ad;
    public long ae;
    public boolean af;
    public long ag;
    public BrandSafetyUtils.ScreenShotOrientation ah;
    public boolean ai;
    public h aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public boolean f62686ak;
    public ScheduledFuture<?> al;
    public boolean am;
    public boolean an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public boolean f62687ao;
    public boolean ap;
    public WeakReference<Activity> aq;
    boolean ar;

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    String f62688as;
    boolean at;
    public final Object au;
    public final Object av;

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    public Map<Integer, Long> f62689aw;

    public boolean H() {
        return this.ar;
    }

    public void g(boolean z2) {
        this.ar = z2;
    }

    public n(String str, int i2, Bundle bundle) {
        super(i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.f62682W = false;
        this.f62684Y = true;
        this.f62685Z = true;
        this.ab = false;
        this.ac = null;
        this.ad = null;
        this.ae = 0L;
        this.af = false;
        this.ag = 0L;
        this.ah = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ai = false;
        this.aj = null;
        this.f62686ak = false;
        this.al = null;
        this.am = false;
        this.an = false;
        this.f62687ao = false;
        this.ap = true;
        this.ar = false;
        this.f62688as = null;
        this.at = false;
        this.au = new Object();
        this.av = new Object();
        this.f62689aw = new LinkedHashMap();
        this.f62683X = new HashSet();
        if (str != null) {
            this.f62686ak = CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    protected boolean c(String str) {
        h hVar;
        k kVar;
        Logger.d(c.f61796a, "setClickUrl started, url = ", str);
        boolean zC2 = super.c(str);
        k kVarI = i();
        if (f() && CreativeInfoManager.a(c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false) && !zC2 && this.f61842x == null && kVarI != null) {
            Logger.d(c.f61796a, "setClickUrl multi, stage : ", Integer.valueOf(this.f62689aw.size()), " , imp list ", Integer.valueOf(g().size()), ", currentClickUrlCandidate.ts : ", Long.valueOf(this.aj.f62543a), ", impression switch ts ", this.f62689aw);
            if (this.f62689aw.size() < g().size()) {
                k kVar2 = g().get(this.f62689aw.size());
                if (kVar2 != null && kVar2.j() != null && kVarI.j().an()) {
                    kVar2.j().a(str, false);
                    kVar2.a(true);
                    Logger.printFullVerboseLog(c.f61796a, "setClickUrl multi , impressionInfo  : ", kVar2, ", click url set to ", str, " , info address : ", BrandSafetyUtils.a(kVar2));
                    return true;
                }
                return zC2;
            }
            if (this.f62689aw.size() >= g().size()) {
                Logger.d(c.f61796a, "setClickUrl multi, end-card reached, this.currentClickUrlCandidate : ", this.aj);
                String strA = CreativeInfoManager.a(c(), AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null);
                if (strA != null && (hVar = this.aj) != null && hVar.f62546d != null && com.safedk.android.utils.n.b(this.aj.f62546d, strA)) {
                    String strC = com.safedk.android.utils.n.c(this.aj.f62546d, strA);
                    Logger.d(c.f61796a, "setClickUrl multi, end-card item = ", strC);
                    if (strC != null) {
                        String strReplace = this.aj.f62546d.replace(strC, "");
                        if (com.safedk.android.utils.n.k(strReplace) && (kVar = g().get(Integer.valueOf(strReplace).intValue())) != null && kVar.j() != null && kVarI.j().an()) {
                            kVar.j().a(str, false);
                            kVar.a(true);
                            Logger.printFullVerboseLog(c.f61796a, "setClickUrl multi, end-card impressionInfo  : ", kVar, ", click url set to ", str, ", clicked : ", Boolean.valueOf(kVar.a()), " , info address : ", BrandSafetyUtils.a(this));
                            return true;
                        }
                    }
                }
            }
        }
        return zC2;
    }

    public n(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.f62682W = false;
        this.f62684Y = true;
        this.f62685Z = true;
        this.ab = false;
        this.ac = null;
        this.ad = null;
        this.ae = 0L;
        this.af = false;
        this.ag = 0L;
        this.ah = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ai = false;
        this.aj = null;
        this.f62686ak = false;
        this.al = null;
        this.am = false;
        this.an = false;
        this.f62687ao = false;
        this.ap = true;
        this.ar = false;
        this.f62688as = null;
        this.at = false;
        this.au = new Object();
        this.av = new Object();
        this.f62689aw = new LinkedHashMap();
        this.f61835q = str5;
    }

    public void I() {
        this.f62684Y = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("maxSdk: ");
        sb.append(this.f61840v != null ? this.f61840v : "");
        sb.append(", activity address: ");
        sb.append(this.f61809B != null ? this.f61809B : "");
        sb.append(", view address: ");
        sb.append(this.f61818K != null ? this.f61818K : "");
        sb.append(", interstitial activity name: ");
        String str = this.ad;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", eventId: ");
        sb.append(this.f61819L != null ? this.f61819L : "");
        sb.append(", isAdFinished: ");
        sb.append(this.f61827U);
        sb.append(", number of CIs: ");
        sb.append(k().size());
        return sb.toString();
    }

    public boolean J() {
        WeakReference<Activity> weakReference = this.aq;
        return ((weakReference == null || weakReference.get() == null) && (!this.f62686ak || j() == null || j().f() == null)) ? false : true;
    }

    public View K() {
        WeakReference<Activity> weakReference = this.aq;
        if (weakReference != null && weakReference.get() != null) {
            return this.aq.get().getWindow().getDecorView().findViewById(R.id.content);
        }
        if (this.f62686ak && j() != null) {
            return j().f();
        }
        return null;
    }

    public void a(String str, boolean z2) {
        if (str != null) {
            String str2 = this.f62688as;
            if (str2 == null) {
                this.f62688as = str;
                return;
            }
            if (!z2 || !str2.contains(str)) {
                this.f62688as += l.ac + str;
            }
        }
    }

    public void L() {
        d(this.f62688as);
    }

    public void e(String str) {
        i().f62605k = true;
        this.at = true;
        b(l.f62661p, new l.a(l.f62635P, str));
    }
}
