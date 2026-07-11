package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class e extends c {
    protected static final String aq = "network_name";
    protected static final String ar = "ad_format";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    protected static final String f62528as = "BANNER";
    protected static final String at = "MREC";
    public static final String au = "NATIVE";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f62529W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f62530X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f62531Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f62532Z;
    public int aa;
    boolean ab;
    public String ac;
    boolean ad;
    boolean ae;
    ScheduledFuture<?> af;
    WeakReference<Activity> ag;
    boolean ah;
    boolean ai;
    long aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    long f62533ak;
    float al;
    String am;
    public BannerFinder.a an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    String f62534ao;
    String ap;
    protected d av;

    public e(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3) {
        this(strArr, str, i2, str2, bundle, str3, BrandSafetyUtils.AdType.BANNER);
    }

    public e(String str, long j2) {
        this(str, j2, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.f62529W = 0;
        this.f62530X = 0;
        this.f62531Y = 0;
        this.f62532Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.f62533ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.f62534ao = null;
        this.ap = null;
        this.av = null;
        this.am = str2;
        if (str3 != null) {
            this.f61819L = str3;
        }
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.f62529W = 0;
        this.f62530X = 0;
        this.f62531Y = 0;
        this.f62532Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.f62533ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.f62534ao = null;
        this.ap = null;
        this.av = null;
        this.f61835q = str5;
    }

    protected e(String str, long j2, BrandSafetyUtils.AdType adType) {
        super(str, j2, adType);
        this.f62529W = 0;
        this.f62530X = 0;
        this.f62531Y = 0;
        this.f62532Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.f62533ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.f62534ao = null;
        this.ap = null;
        this.av = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarM = m();
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" webView: ");
        sb.append(this.f61818K);
        sb.append(" isActive: ");
        sb.append(this.ab);
        sb.append(" hash: ");
        sb.append(jVarM != null ? jVarM.f62584a : null);
        sb.append(" url: ");
        sb.append(e());
        sb.append(" isClicked: ");
        sb.append(d());
        sb.append(" touch timestamp: ");
        sb.append(v());
        sb.append(" activity address: ");
        sb.append(this.f61809B);
        sb.append(" activity class name: ");
        sb.append(this.f61810C);
        sb.append(" filename: ");
        sb.append(jVarM != null ? jVarM.f62585b : null);
        sb.append(" type: ");
        sb.append(this.f61834p);
        sb.append(", eventId: ");
        sb.append(this.f61819L);
        sb.append(", requestNoSamplingReceived: ");
        sb.append(this.f61822O);
        sb.append(", onVideoCompletedEventHasBeenTriggered: ");
        sb.append(i() != null ? Boolean.valueOf(i().f62605k) : V8ValueNull.NULL);
        return sb.toString();
    }

    public boolean H() {
        if (this.f61808A != null && this.f61808A.containsKey("network_name")) {
            return this.f61808A.getString("network_name").contains("NATIVE");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void f(boolean z2) {
        super.f(z2);
        this.f62529W = 0;
        this.f62530X = 0;
        this.f62531Y = 0;
        this.f62532Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ai = false;
        if (z2) {
            this.al = 0.0f;
        }
        this.am = null;
        this.f61826T = false;
        BannerFinder.a aVar = this.an;
        if (aVar != null && aVar.f61400d != null) {
            this.an.f61400d.cancel(false);
        }
        this.an = null;
        this.ag = null;
        this.f61828V = false;
        this.f62534ao = null;
        this.ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.f61840v = null;
        this.ag = null;
        this.am = null;
        this.ab = false;
        this.ah = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i2) {
        super.a(dVar, bundle, i2);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] strArrA = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.f61810C = strArrA[0];
            this.f61809B = strArrA[1];
        }
        this.f61840v = CreativeInfoManager.c(bundle.getString("network_name"));
        this.ag = new WeakReference<>(BannerFinder.a(bundle));
        this.am = BrandSafetyUtils.c().name().toLowerCase();
        this.ab = true;
        this.ah = true;
    }

    public boolean I() {
        if (this.f61808A != null && this.f61808A.containsKey("ad_format")) {
            return this.f61808A.getString("ad_format").equals("MREC");
        }
        return false;
    }
}
