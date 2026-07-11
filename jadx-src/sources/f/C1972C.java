package f;

import Hr.CQ.USEaHtCMH;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C1972C implements InterfaceC1984j {
    private final List HI;
    private final Boolean Ik;
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f63958O;
    private final String Uo;
    private final String az;
    private final Boolean ck;
    private final String gh;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC1982eO f63959n;
    private final String nr;
    private final String qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f63960t;
    private final Integer ty;
    private final String xMQ;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f63957r = new j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f63956o = 8;

    /* JADX INFO: renamed from: f.C$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1972C)) {
            return false;
        }
        C1972C c1972c = (C1972C) obj;
        return this.f63959n == c1972c.f63959n && Intrinsics.areEqual(this.rl, c1972c.rl) && Intrinsics.areEqual(this.f63960t, c1972c.f63960t) && Intrinsics.areEqual(this.nr, c1972c.nr) && Intrinsics.areEqual(this.f63958O, c1972c.f63958O) && Intrinsics.areEqual(this.J2, c1972c.J2) && Intrinsics.areEqual(this.Uo, c1972c.Uo) && Intrinsics.areEqual(this.KN, c1972c.KN) && Intrinsics.areEqual(this.xMQ, c1972c.xMQ) && Intrinsics.areEqual(this.mUb, c1972c.mUb) && Intrinsics.areEqual(this.gh, c1972c.gh) && Intrinsics.areEqual(this.qie, c1972c.qie) && Intrinsics.areEqual(this.az, c1972c.az) && Intrinsics.areEqual(this.ty, c1972c.ty) && Intrinsics.areEqual(this.HI, c1972c.HI) && Intrinsics.areEqual(this.ck, c1972c.ck) && Intrinsics.areEqual(this.Ik, c1972c.Ik);
    }

    public C1972C(EnumC1982eO enumC1982eO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(enumC1982eO, USEaHtCMH.MHwKkJ);
        this.f63959n = enumC1982eO;
        this.rl = str;
        this.f63960t = str2;
        this.nr = str3;
        this.f63958O = str4;
        this.J2 = str5;
        this.Uo = str6;
        this.KN = str7;
        this.xMQ = str8;
        this.mUb = str9;
        this.gh = str10;
        this.qie = str11;
        this.az = str12;
        this.ty = num;
        this.HI = list;
        this.ck = bool;
        this.Ik = bool2;
    }

    public int hashCode() {
        int iHashCode = this.f63959n.hashCode() * 31;
        String str = this.rl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63960t;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63958O;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.J2;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.Uo;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.KN;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.xMQ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mUb;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.gh;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.qie;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.az;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.ty;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.HI;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.ck;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.Ik;
        return iHashCode16 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // f.InterfaceC1984j
    public Bundle n() {
        EnumC1982eO enumC1982eO = this.f63959n;
        boolean z2 = enumC1982eO == EnumC1982eO.f64024r;
        Pair pair = TuplesKt.to("paywallType", enumC1982eO);
        Pair pair2 = TuplesKt.to("product1NoTrialId", this.rl);
        String str = this.f63960t;
        if (z2) {
            str = null;
        }
        Pair pair3 = TuplesKt.to("product1FreeTrialId", str);
        Pair pair4 = TuplesKt.to("product2NoTrialId", this.nr);
        String str2 = this.f63958O;
        if (z2) {
            str2 = null;
        }
        Pair pair5 = TuplesKt.to("product2FreeTrialId", str2);
        Pair pair6 = TuplesKt.to("product1UpsellNoTrialId", this.J2);
        String str3 = this.Uo;
        if (z2) {
            str3 = null;
        }
        Pair pair7 = TuplesKt.to("product1UpsellFreeTrialId", str3);
        Pair pair8 = TuplesKt.to("product2UpsellNoTrialId", this.KN);
        String str4 = this.xMQ;
        if (z2) {
            str4 = null;
        }
        Pair pair9 = TuplesKt.to("product2UpsellFreeTrialId", str4);
        Pair pair10 = TuplesKt.to("product1DiscountedNoTrialId", this.mUb);
        String str5 = this.gh;
        if (z2) {
            str5 = null;
        }
        return BundleKt.n(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, TuplesKt.to("product1DiscountedFreeTrialId", str5), TuplesKt.to("product2DiscountedNoTrialId", this.qie), TuplesKt.to("product2DiscountedFreeTrialId", z2 ? null : this.az), TuplesKt.to("defaultSelectionIndex", this.ty), TuplesKt.to("tiers", this.HI), TuplesKt.to("canBeDismissedWithAd", this.ck), TuplesKt.to("isCloseButtonDelayed", this.Ik));
    }

    public final Boolean rl() {
        return this.ck;
    }

    public String toString() {
        return "PaywallExperience(paywallType=" + this.f63959n + ", product1NoTrialId=" + this.rl + ", product1FreeTrialId=" + this.f63960t + ", product2NoTrialId=" + this.nr + ", product2FreeTrialId=" + this.f63958O + ", product1UpsellNoTrialId=" + this.J2 + ", product1UpsellFreeTrialId=" + this.Uo + ", product2UpsellNoTrialId=" + this.KN + ", product2UpsellFreeTrialId=" + this.xMQ + ", product1DiscountedNoTrialId=" + this.mUb + ", product1DiscountedFreeTrialId=" + this.gh + ", product2DiscountedNoTrialId=" + this.qie + ", product2DiscountedFreeTrialId=" + this.az + ", defaultSelectionIndex=" + this.ty + ", tiers=" + this.HI + ", canBeDismissedWithAd=" + this.ck + ", delayCloseButton=" + this.Ik + ")";
    }
}
