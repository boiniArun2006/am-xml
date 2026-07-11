package c3;

import com.alightcreative.gl.egl.il.inFlMLxL;
import com.applovin.mediation.MaxAd;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import k.C2203w6;
import k.Wre;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {
    public static final C0585j rl = new C0585j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k.I28 f43542n;

    /* JADX INFO: renamed from: c3.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class C0585j {
        public /* synthetic */ C0585j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0585j() {
        }
    }

    public j(k.I28 adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f43542n = adType;
    }

    public static /* synthetic */ k.Ml J2(j jVar, MaxAd maxAd, dI8.j jVar2, String str, pq.Ml ml, String str2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            ml = new pq.Ml();
        }
        pq.Ml ml2 = ml;
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        return jVar.O(maxAd, jVar2, str, ml2, str2);
    }

    public static /* synthetic */ k.Ml KN(j jVar, String str, String str2, pq.Ml ml, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ml = new pq.Ml();
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return jVar.Uo(str, str2, ml, str3);
    }

    public static /* synthetic */ k.Ml mUb(j jVar, MaxAd maxAd, String str, pq.Ml ml, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ml = new pq.Ml();
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return jVar.xMQ(maxAd, str, ml, str2);
    }

    public static /* synthetic */ k.Ml nr(j jVar, MaxAd maxAd, String str, pq.Ml ml, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ml = new pq.Ml();
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return jVar.t(maxAd, str, ml, str2);
    }

    public static /* synthetic */ k.Ml rl(j jVar, MaxAd maxAd, String str, pq.Ml ml, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ml = new pq.Ml();
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return jVar.n(maxAd, str, ml, str2);
    }

    public final C2203w6 HI(MaxAd ad, String adLocation, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(adLocation, "adLocation");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        String strRl = this.f43542n.rl();
        String creativeId = ad.getCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        return wre.mUb(strRl, adLocation, creativeId, adUnitId, "applovin", ad.getNetworkName(), "USD", (float) ad.getRevenue(), additionalInfo);
    }

    public final k.Ml O(MaxAd ad, dI8.j error, String location, pq.Ml additionalInfo, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        k.I28 i28 = this.f43542n;
        String adReviewCreativeId = ad.getAdReviewCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String networkName = ad.getNetworkName();
        Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
        return wre.t(i28, location, adReviewCreativeId, adUnitId, "applovin", networkName, str, error.getTitle(), pq.I28.n(pq.n.O("error_message", error.getMessage())).rl(additionalInfo));
    }

    public final k.Ml Uo(String unitId, String location, pq.Ml ml, String str) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(ml, HrvQKfmFZJudBc.qQaSJRZBP);
        return Wre.f69648n.nr(this.f43542n, location, null, unitId, "applovin", null, str, ml);
    }

    public final k.Ml az(String unitId, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.KN(this.f43542n, location, unitId, "applovin", additionalInfo);
    }

    public final k.Ml gh(MaxAd ad, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        k.I28 i28 = this.f43542n;
        String adReviewCreativeId = ad.getAdReviewCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String networkName = ad.getNetworkName();
        Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
        return wre.J2(i28, location, adReviewCreativeId, adUnitId, "applovin", networkName, additionalInfo);
    }

    public final k.Ml n(MaxAd ad, String location, pq.Ml additionalInfo, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        k.I28 i28 = this.f43542n;
        String adReviewCreativeId = ad.getAdReviewCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String networkName = ad.getNetworkName();
        Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
        return wre.n(i28, location, adReviewCreativeId, adUnitId, "applovin", networkName, str, additionalInfo);
    }

    public final k.Ml qie(String unitId, String location, dI8.n error, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.Uo(this.f43542n, location, "applovin", unitId, error.getTitle(), pq.I28.n(pq.n.O("error_message", error.getMessage())).rl(additionalInfo));
    }

    public final k.Ml t(MaxAd ad, String str, pq.Ml additionalInfo, String str2) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(str, inFlMLxL.rHCjsi);
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        k.I28 i28 = this.f43542n;
        String adReviewCreativeId = ad.getAdReviewCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String networkName = ad.getNetworkName();
        Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
        return wre.rl(i28, str, adReviewCreativeId, adUnitId, "applovin", networkName, str2, additionalInfo);
    }

    public final k.Ml ty(String unitId, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.xMQ(this.f43542n, location, "applovin", unitId, additionalInfo);
    }

    public final k.Ml xMQ(MaxAd ad, String location, pq.Ml additionalInfo, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        k.I28 i28 = this.f43542n;
        String adReviewCreativeId = ad.getAdReviewCreativeId();
        String adUnitId = ad.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String networkName = ad.getNetworkName();
        Intrinsics.checkNotNullExpressionValue(networkName, "getNetworkName(...)");
        return wre.O(i28, location, adReviewCreativeId, adUnitId, "applovin", networkName, str, additionalInfo);
    }
}
