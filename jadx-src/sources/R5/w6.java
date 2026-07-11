package R5;

import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import f.EnumC1982eO;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {
    private final boolean HI;
    private final boolean Ik;
    private final boolean J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f8678O;
    private final boolean Uo;
    private final I28 az;
    private final boolean ck;
    private final int gh;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mg4.n f8679n;
    private final int nr;
    private final boolean qie;
    private final EnumC1982eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f8680t;
    private final PlayfulUnlockStyle ty;
    private final Map xMQ;

    public static /* synthetic */ w6 rl(w6 w6Var, mg4.n nVar, EnumC1982eO enumC1982eO, boolean z2, int i2, int i3, boolean z3, boolean z4, List list, Map map, boolean z5, int i5, boolean z6, I28 i28, PlayfulUnlockStyle playfulUnlockStyle, boolean z7, boolean z9, boolean z10, int i7, Object obj) {
        boolean z11;
        boolean z12;
        mg4.n nVar2;
        w6 w6Var2;
        boolean z13;
        EnumC1982eO enumC1982eO2;
        boolean z14;
        int i8;
        int i9;
        boolean z15;
        boolean z16;
        List list2;
        Map map2;
        boolean z17;
        int i10;
        boolean z18;
        I28 i282;
        PlayfulUnlockStyle playfulUnlockStyle2;
        mg4.n nVar3 = (i7 & 1) != 0 ? w6Var.f8679n : nVar;
        EnumC1982eO enumC1982eO3 = (i7 & 2) != 0 ? w6Var.rl : enumC1982eO;
        boolean z19 = (i7 & 4) != 0 ? w6Var.f8680t : z2;
        int i11 = (i7 & 8) != 0 ? w6Var.nr : i2;
        int i12 = (i7 & 16) != 0 ? w6Var.f8678O : i3;
        boolean z20 = (i7 & 32) != 0 ? w6Var.J2 : z3;
        boolean z21 = (i7 & 64) != 0 ? w6Var.Uo : z4;
        List list3 = (i7 & 128) != 0 ? w6Var.KN : list;
        Map map3 = (i7 & 256) != 0 ? w6Var.xMQ : map;
        boolean z22 = (i7 & 512) != 0 ? w6Var.mUb : z5;
        int i13 = (i7 & 1024) != 0 ? w6Var.gh : i5;
        boolean z23 = (i7 & 2048) != 0 ? w6Var.qie : z6;
        I28 i283 = (i7 & 4096) != 0 ? w6Var.az : i28;
        PlayfulUnlockStyle playfulUnlockStyle3 = (i7 & 8192) != 0 ? w6Var.ty : playfulUnlockStyle;
        mg4.n nVar4 = nVar3;
        boolean z24 = (i7 & 16384) != 0 ? w6Var.HI : z7;
        boolean z25 = (i7 & 32768) != 0 ? w6Var.ck : z9;
        if ((i7 & 65536) != 0) {
            z12 = z25;
            z11 = w6Var.Ik;
            z13 = z24;
            enumC1982eO2 = enumC1982eO3;
            z14 = z19;
            i8 = i11;
            i9 = i12;
            z15 = z20;
            z16 = z21;
            list2 = list3;
            map2 = map3;
            z17 = z22;
            i10 = i13;
            z18 = z23;
            i282 = i283;
            playfulUnlockStyle2 = playfulUnlockStyle3;
            nVar2 = nVar4;
            w6Var2 = w6Var;
        } else {
            z11 = z10;
            z12 = z25;
            nVar2 = nVar4;
            w6Var2 = w6Var;
            z13 = z24;
            enumC1982eO2 = enumC1982eO3;
            z14 = z19;
            i8 = i11;
            i9 = i12;
            z15 = z20;
            z16 = z21;
            list2 = list3;
            map2 = map3;
            z17 = z22;
            i10 = i13;
            z18 = z23;
            i282 = i283;
            playfulUnlockStyle2 = playfulUnlockStyle3;
        }
        return w6Var2.n(nVar2, enumC1982eO2, z14, i8, i9, z15, z16, list2, map2, z17, i10, z18, i282, playfulUnlockStyle2, z13, z12, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f8679n, w6Var.f8679n) && this.rl == w6Var.rl && this.f8680t == w6Var.f8680t && this.nr == w6Var.nr && this.f8678O == w6Var.f8678O && this.J2 == w6Var.J2 && this.Uo == w6Var.Uo && Intrinsics.areEqual(this.KN, w6Var.KN) && Intrinsics.areEqual(this.xMQ, w6Var.xMQ) && this.mUb == w6Var.mUb && this.gh == w6Var.gh && this.qie == w6Var.qie && Intrinsics.areEqual(this.az, w6Var.az) && this.ty == w6Var.ty && this.HI == w6Var.HI && this.ck == w6Var.ck && this.Ik == w6Var.Ik;
    }

    public w6(mg4.n nVar, EnumC1982eO enumC1982eO, boolean z2, int i2, int i3, boolean z3, boolean z4, List tiers, Map storageMap, boolean z5, int i5, boolean z6, I28 i28, PlayfulUnlockStyle playfulStyle, boolean z7, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Intrinsics.checkNotNullParameter(playfulStyle, "playfulStyle");
        this.f8679n = nVar;
        this.rl = enumC1982eO;
        this.f8680t = z2;
        this.nr = i2;
        this.f8678O = i3;
        this.J2 = z3;
        this.Uo = z4;
        this.KN = tiers;
        this.xMQ = storageMap;
        this.mUb = z5;
        this.gh = i5;
        this.qie = z6;
        this.az = i28;
        this.ty = playfulStyle;
        this.HI = z7;
        this.ck = z9;
        this.Ik = z10;
    }

    public final Map HI() {
        return this.xMQ;
    }

    public final List Ik() {
        return this.KN;
    }

    public final boolean J2() {
        return this.Ik;
    }

    public final EnumC1982eO KN() {
        return this.rl;
    }

    public final boolean O() {
        return this.f8680t;
    }

    public final boolean Uo() {
        return this.HI;
    }

    public final int az() {
        return this.f8678O;
    }

    public final mg4.n ck() {
        return this.f8679n;
    }

    public final boolean gh() {
        return this.ck;
    }

    public int hashCode() {
        mg4.n nVar = this.f8679n;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        EnumC1982eO enumC1982eO = this.rl;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (enumC1982eO == null ? 0 : enumC1982eO.hashCode())) * 31) + Boolean.hashCode(this.f8680t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f8678O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + Boolean.hashCode(this.mUb)) * 31) + Integer.hashCode(this.gh)) * 31) + Boolean.hashCode(this.qie)) * 31;
        I28 i28 = this.az;
        return ((((((((iHashCode2 + (i28 != null ? i28.hashCode() : 0)) * 31) + this.ty.hashCode()) * 31) + Boolean.hashCode(this.HI)) * 31) + Boolean.hashCode(this.ck)) * 31) + Boolean.hashCode(this.Ik);
    }

    public final PlayfulUnlockStyle mUb() {
        return this.ty;
    }

    public final w6 n(mg4.n nVar, EnumC1982eO enumC1982eO, boolean z2, int i2, int i3, boolean z3, boolean z4, List tiers, Map storageMap, boolean z5, int i5, boolean z6, I28 i28, PlayfulUnlockStyle playfulStyle, boolean z7, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Intrinsics.checkNotNullParameter(playfulStyle, "playfulStyle");
        return new w6(nVar, enumC1982eO, z2, i2, i3, z3, z4, tiers, storageMap, z5, i5, z6, i28, playfulStyle, z7, z9, z10);
    }

    public final int nr() {
        return this.gh;
    }

    public final boolean o() {
        return this.qie;
    }

    public final int qie() {
        return this.nr;
    }

    public final boolean r() {
        return this.mUb;
    }

    public final boolean t() {
        return this.J2;
    }

    public String toString() {
        return "PaywallViewModelState(subscriptionState=" + this.f8679n + ", paywallType=" + this.rl + ", freeTrialChecked=" + this.f8680t + ", selectedSubscriptionIndex=" + this.nr + ", selectedTierIndex=" + this.f8678O + ", canBeDismissedWithAd=" + this.J2 + ", shouldCloseButtonBeVisible=" + this.Uo + ", tiers=" + this.KN + ", storageMap=" + this.xMQ + ", upsellPaywallShowPriceDifferences=" + this.mUb + ", countdownSecondsLeft=" + this.gh + ", isConfirmingClose=" + this.qie + ", playfulState=" + this.az + ", playfulStyle=" + this.ty + ", paywallCardsUsePremiumLiteNames=" + this.HI + ", playfulUnlockCanCloseInGame=" + this.ck + ", paywallCardsPriceInCards=" + this.Ik + ")";
    }

    public final boolean ty() {
        return this.Uo;
    }

    public final I28 xMQ() {
        return this.az;
    }
}
