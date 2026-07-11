package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62518j = "AdInfoKey";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f62519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f62520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f62521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f62522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f62523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.AdType f62524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f62525g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f62526h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f62527i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.f62519a = str;
        this.f62520b = str2;
        this.f62521c = str3;
        this.f62522d = str4;
        this.f62523e = str5;
        this.f62524f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) ? false : true;
    }

    public boolean equals(Object o2) {
        Logger.d(f62518j, "equals started with this: ", this, " and that: ", o2);
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        d dVar = (d) o2;
        boolean zEquals = this.f62519a.equals(dVar.f62519a);
        String str = this.f62520b;
        boolean z2 = str != null && str.equals(dVar.f62520b);
        boolean zEquals2 = this.f62522d.equals(dVar.f62522d);
        String str2 = this.f62523e;
        boolean zEquals3 = zEquals && zEquals2 && ((str2 != null && str2.equals(dVar.f62523e)) || (this.f62523e == null && dVar.f62523e == null));
        String str3 = this.f62521c;
        if (str3 != null) {
            zEquals3 &= str3.equals(dVar.f62521c);
            String strA = CreativeInfoManager.a(this.f62522d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
            if (strA != null && strA.contains(this.f62523e) && !a(this.f62524f)) {
                Logger.d(f62518j, "not using placement id - equals result is: ", Boolean.valueOf(zEquals3));
                return zEquals3;
            }
        }
        return zEquals3 && z2;
    }

    public int hashCode() {
        String str;
        int iHashCode = this.f62519a.hashCode() * this.f62522d.hashCode();
        String strA = CreativeInfoManager.a(this.f62522d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        if (a(this.f62524f) || (str = this.f62523e) == null || strA == null || !strA.contains(str)) {
            iHashCode *= this.f62520b.hashCode();
        }
        String str2 = this.f62521c;
        if (str2 != null) {
            return iHashCode * str2.hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.f62519a + ", placementId=" + this.f62520b + ", eventId=" + com.safedk.android.utils.n.b((Object) this.f62521c) + ", sdk=" + this.f62522d + ", maxNetwork=" + com.safedk.android.utils.n.b((Object) this.f62523e) + "}";
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.f62519a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("_");
        String str2 = this.f62520b;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("_");
        String str3 = this.f62521c;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append("_");
        String str4 = this.f62522d;
        sb.append(str4 != null ? str4 : "");
        return sb.toString();
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (dVar.equals(this)) {
            if (TextUtils.isEmpty(this.f62520b)) {
                creativeInfo.j(dVar.f62520b);
                this.f62520b = dVar.f62520b;
                return true;
            }
            return true;
        }
        return false;
    }
}
