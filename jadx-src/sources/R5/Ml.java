package R5;

import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import f.EnumC1982eO;
import java.util.List;
import java.util.Map;
import kgE.psW;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    public static abstract class j extends Ml {

        public static final class I28 extends j {
            private final boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final boolean f8653O;
            private final boolean Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final List f8654n;
            private final int nr;
            private final EnumC1982eO rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final boolean f8655t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof I28)) {
                    return false;
                }
                I28 i28 = (I28) obj;
                return Intrinsics.areEqual(this.f8654n, i28.f8654n) && this.rl == i28.rl && this.f8655t == i28.f8655t && this.nr == i28.nr && this.f8653O == i28.f8653O && this.J2 == i28.J2 && this.Uo == i28.Uo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public I28(List subscriptionItems, EnumC1982eO paywallType, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
                super(null);
                Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
                Intrinsics.checkNotNullParameter(paywallType, "paywallType");
                this.f8654n = subscriptionItems;
                this.rl = paywallType;
                this.f8655t = z2;
                this.nr = i2;
                this.f8653O = z3;
                this.J2 = z4;
                this.Uo = z5;
            }

            public final EnumC1982eO J2() {
                return this.rl;
            }

            public final List KN() {
                return this.f8654n;
            }

            public final boolean O() {
                return this.Uo;
            }

            public final int Uo() {
                return this.nr;
            }

            public int hashCode() {
                return (((((((((((this.f8654n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f8655t)) * 31) + Integer.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f8653O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo);
            }

            @Override // R5.Ml.j
            public boolean n() {
                return this.J2;
            }

            public final boolean nr() {
                return this.f8655t;
            }

            @Override // R5.Ml.j
            public Wre rl() {
                return (Wre) CollectionsKt.getOrNull(this.f8654n, this.nr);
            }

            public final boolean t() {
                return this.f8653O;
            }

            public String toString() {
                return "SingleTier(subscriptionItems=" + this.f8654n + ", paywallType=" + this.rl + ", freeTrialChecked=" + this.f8655t + ", selectedSubscriptionIndex=" + this.nr + ", canBeDismissedWithAd=" + this.f8653O + ", hasPendingPayments=" + this.J2 + ", loading=" + this.Uo + ")";
            }
        }

        /* JADX INFO: renamed from: R5.Ml$j$Ml, reason: collision with other inner class name */
        public static final class C0296Ml extends j {
            private final Wre HI;
            private final boolean J2;
            private final R5.I28 KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final boolean f8656O;
            private final boolean Uo;
            private final boolean az;
            private final boolean gh;
            private final boolean mUb;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CN3 f8657n;
            private final List nr;
            private final Map qie;
            private final int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final int f8658t;
            private final List ty;
            private final PlayfulUnlockStyle xMQ;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0296Ml)) {
                    return false;
                }
                C0296Ml c0296Ml = (C0296Ml) obj;
                return Intrinsics.areEqual(this.f8657n, c0296Ml.f8657n) && this.rl == c0296Ml.rl && this.f8658t == c0296Ml.f8658t && Intrinsics.areEqual(this.nr, c0296Ml.nr) && this.f8656O == c0296Ml.f8656O && this.J2 == c0296Ml.J2 && this.Uo == c0296Ml.Uo && Intrinsics.areEqual(this.KN, c0296Ml.KN) && this.xMQ == c0296Ml.xMQ && this.mUb == c0296Ml.mUb && this.gh == c0296Ml.gh && Intrinsics.areEqual(this.qie, c0296Ml.qie) && this.az == c0296Ml.az;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0296Ml(CN3 subscriptionItems, int i2, int i3, List tiers, boolean z2, boolean z3, boolean z4, R5.I28 playfulState, PlayfulUnlockStyle style, boolean z5, boolean z6, Map storageMap, boolean z7) {
                super(0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
                Intrinsics.checkNotNullParameter(tiers, "tiers");
                Intrinsics.checkNotNullParameter(playfulState, "playfulState");
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(storageMap, "storageMap");
                this.f8657n = subscriptionItems;
                this.rl = i2;
                this.f8658t = i3;
                this.nr = tiers;
                this.f8656O = z2;
                this.J2 = z3;
                this.Uo = z4;
                this.KN = playfulState;
                this.xMQ = style;
                this.mUb = z5;
                this.gh = z6;
                this.qie = storageMap;
                this.az = z7;
                List list = (List) subscriptionItems.get(tiers.get(i3));
                this.ty = list;
                this.HI = list != null ? (Wre) CollectionsKt.getOrNull(list, i2) : null;
            }

            public final boolean HI() {
                return this.Uo;
            }

            public final int J2() {
                return this.rl;
            }

            public final List KN() {
                return this.ty;
            }

            public final R5.I28 O() {
                return this.KN;
            }

            public final int Uo() {
                return this.f8658t;
            }

            public final List az() {
                return this.nr;
            }

            public final PlayfulUnlockStyle gh() {
                return this.xMQ;
            }

            public int hashCode() {
                return (((((((((((((((((((((((this.f8657n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f8658t)) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f8656O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + Boolean.hashCode(this.mUb)) * 31) + Boolean.hashCode(this.gh)) * 31) + this.qie.hashCode()) * 31) + Boolean.hashCode(this.az);
            }

            public final Map mUb() {
                return this.qie;
            }

            @Override // R5.Ml.j
            public boolean n() {
                return this.f8656O;
            }

            public final boolean nr() {
                return this.J2;
            }

            public final CN3 qie() {
                return this.f8657n;
            }

            @Override // R5.Ml.j
            public Wre rl() {
                return this.HI;
            }

            public final boolean t() {
                return this.gh;
            }

            public String toString() {
                return "PlayfulUnlock(subscriptionItems=" + this.f8657n + ", selectedSubscriptionIndex=" + this.rl + ", selectedTierIndex=" + this.f8658t + ", tiers=" + this.nr + ", hasPendingPayments=" + this.f8656O + ", loading=" + this.J2 + ", isConfirmingClose=" + this.Uo + ", playfulState=" + this.KN + ", style=" + this.xMQ + ", usePremiumLiteNames=" + this.mUb + ", canCloseInGame=" + this.gh + ", storageMap=" + this.qie + ", showPriceInCards=" + this.az + ")";
            }

            public final boolean ty() {
                return this.mUb;
            }

            public final boolean xMQ() {
                return this.az;
            }
        }

        /* JADX INFO: renamed from: R5.Ml$j$j, reason: collision with other inner class name */
        public static final class C0297j extends j {
            private final int J2;
            private final boolean KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final int f8659O;
            private final boolean Uo;
            private final boolean az;
            private final Map gh;
            private final List mUb;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CN3 f8660n;
            private final boolean nr;
            private final boolean qie;
            private final psW rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final EnumC1982eO f8661t;
            private final boolean ty;
            private final boolean xMQ;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0297j)) {
                    return false;
                }
                C0297j c0297j = (C0297j) obj;
                return Intrinsics.areEqual(this.f8660n, c0297j.f8660n) && Intrinsics.areEqual(this.rl, c0297j.rl) && this.f8661t == c0297j.f8661t && this.nr == c0297j.nr && this.f8659O == c0297j.f8659O && this.J2 == c0297j.J2 && this.Uo == c0297j.Uo && this.KN == c0297j.KN && this.xMQ == c0297j.xMQ && Intrinsics.areEqual(this.mUb, c0297j.mUb) && Intrinsics.areEqual(this.gh, c0297j.gh) && this.qie == c0297j.qie && this.az == c0297j.az && this.ty == c0297j.ty;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0297j(CN3 subscriptionItems, psW psw, EnumC1982eO paywallType, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, List tiers, Map storageMap, boolean z6, boolean z7, boolean z9) {
                super(null);
                Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
                Intrinsics.checkNotNullParameter(paywallType, "paywallType");
                Intrinsics.checkNotNullParameter(tiers, "tiers");
                Intrinsics.checkNotNullParameter(storageMap, "storageMap");
                this.f8660n = subscriptionItems;
                this.rl = psw;
                this.f8661t = paywallType;
                this.nr = z2;
                this.f8659O = i2;
                this.J2 = i3;
                this.Uo = z3;
                this.KN = z4;
                this.xMQ = z5;
                this.mUb = tiers;
                this.gh = storageMap;
                this.qie = z6;
                this.az = z7;
                this.ty = z9;
            }

            public final boolean HI() {
                return this.az;
            }

            public final EnumC1982eO J2() {
                return this.f8661t;
            }

            public final int KN() {
                return this.J2;
            }

            public final psW O() {
                return this.rl;
            }

            public final int Uo() {
                return this.f8659O;
            }

            public final CN3 az() {
                return this.f8660n;
            }

            public final boolean ck() {
                return this.xMQ;
            }

            public final boolean gh() {
                return this.ty;
            }

            public int hashCode() {
                int iHashCode = this.f8660n.hashCode() * 31;
                psW psw = this.rl;
                return ((((((((((((((((((((((((iHashCode + (psw == null ? 0 : psw.hashCode())) * 31) + this.f8661t.hashCode()) * 31) + Boolean.hashCode(this.nr)) * 31) + Integer.hashCode(this.f8659O)) * 31) + Integer.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN)) * 31) + Boolean.hashCode(this.xMQ)) * 31) + this.mUb.hashCode()) * 31) + this.gh.hashCode()) * 31) + Boolean.hashCode(this.qie)) * 31) + Boolean.hashCode(this.az)) * 31) + Boolean.hashCode(this.ty);
            }

            public final boolean mUb() {
                return this.qie;
            }

            @Override // R5.Ml.j
            public boolean n() {
                return this.Uo;
            }

            public final boolean nr() {
                return this.KN;
            }

            public final Map qie() {
                return this.gh;
            }

            public final boolean t() {
                return this.nr;
            }

            public String toString() {
                return "CloudCards(subscriptionItems=" + this.f8660n + ", pastPurchase=" + this.rl + ", paywallType=" + this.f8661t + ", freeTrialChecked=" + this.nr + ", selectedSubscriptionIndex=" + this.f8659O + ", selectedTierIndex=" + this.J2 + ", hasPendingPayments=" + this.Uo + ", loading=" + this.KN + ", isCloseButtonVisible=" + this.xMQ + ", tiers=" + this.mUb + ", storageMap=" + this.gh + ", showPriceDifferences=" + this.qie + ", usePremiumLiteNames=" + this.az + ", showPriceInCards=" + this.ty + ")";
            }

            public final List ty() {
                return this.mUb;
            }

            public final List xMQ() {
                return (List) this.f8660n.get(this.mUb.get(this.J2));
            }

            @Override // R5.Ml.j
            public Wre rl() {
                List listXMQ = xMQ();
                if (listXMQ != null) {
                    return (Wre) CollectionsKt.getOrNull(listXMQ, this.f8659O);
                }
                return null;
            }
        }

        public static final class n extends j {
            private final int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final long f8662O;
            private final boolean Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final List f8663n;
            private final boolean nr;
            private final int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final boolean f8664t;

            public /* synthetic */ n(List list, int i2, boolean z2, boolean z3, long j2, int i3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, i2, z2, z3, j2, i3, z4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return Intrinsics.areEqual(this.f8663n, nVar.f8663n) && this.rl == nVar.rl && this.f8664t == nVar.f8664t && this.nr == nVar.nr && XFr.j.KN(this.f8662O, nVar.f8662O) && this.J2 == nVar.J2 && this.Uo == nVar.Uo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private n(List subscriptionItems, int i2, boolean z2, boolean z3, long j2, int i3, boolean z4) {
                super(null);
                Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
                this.f8663n = subscriptionItems;
                this.rl = i2;
                this.f8664t = z2;
                this.nr = z3;
                this.f8662O = j2;
                this.J2 = i3;
                this.Uo = z4;
            }

            public final List J2() {
                return this.f8663n;
            }

            public final int O() {
                return this.rl;
            }

            public final boolean Uo() {
                return this.Uo;
            }

            public int hashCode() {
                return (((((((((((this.f8663n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f8664t)) * 31) + Boolean.hashCode(this.nr)) * 31) + XFr.j.az(this.f8662O)) * 31) + Integer.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo);
            }

            @Override // R5.Ml.j
            public boolean n() {
                return this.f8664t;
            }

            public final int nr() {
                return this.J2;
            }

            @Override // R5.Ml.j
            public Wre rl() {
                return (Wre) CollectionsKt.getOrNull(this.f8663n, this.rl);
            }

            public final boolean t() {
                return this.nr;
            }

            public String toString() {
                return "Countdown(subscriptionItems=" + this.f8663n + ", selectedSubscriptionIndex=" + this.rl + ", hasPendingPayments=" + this.f8664t + ", loading=" + this.nr + ", cloudStorage=" + XFr.j.ty(this.f8662O) + ", secondsLeft=" + this.J2 + ", isConfirmingClose=" + this.Uo + ")";
            }
        }

        public static final class w6 extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final long f8665O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final List f8666n;
            private final boolean nr;
            private final int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final boolean f8667t;

            public /* synthetic */ w6(List list, int i2, boolean z2, boolean z3, long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, i2, z2, z3, j2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w6)) {
                    return false;
                }
                w6 w6Var = (w6) obj;
                return Intrinsics.areEqual(this.f8666n, w6Var.f8666n) && this.rl == w6Var.rl && this.f8667t == w6Var.f8667t && this.nr == w6Var.nr && XFr.j.KN(this.f8665O, w6Var.f8665O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private w6(List subscriptionItems, int i2, boolean z2, boolean z3, long j2) {
                super(null);
                Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
                this.f8666n = subscriptionItems;
                this.rl = i2;
                this.f8667t = z2;
                this.nr = z3;
                this.f8665O = j2;
            }

            public final List O() {
                return this.f8666n;
            }

            public int hashCode() {
                return (((((((this.f8666n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f8667t)) * 31) + Boolean.hashCode(this.nr)) * 31) + XFr.j.az(this.f8665O);
            }

            @Override // R5.Ml.j
            public boolean n() {
                return this.f8667t;
            }

            public final int nr() {
                return this.rl;
            }

            @Override // R5.Ml.j
            public Wre rl() {
                return (Wre) CollectionsKt.getOrNull(this.f8666n, this.rl);
            }

            public final boolean t() {
                return this.nr;
            }

            public String toString() {
                return "OneTime(subscriptionItems=" + this.f8666n + ", selectedSubscriptionIndex=" + this.rl + ", hasPendingPayments=" + this.f8667t + ", loading=" + this.nr + ", cloudStorage=" + XFr.j.ty(this.f8665O) + ")";
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean n();

        public abstract Wre rl();

        private j() {
            super(null);
        }
    }

    public static final class n extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f8668n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "PurchaseStateError";
        }

        public int hashCode() {
            return -351839951;
        }
    }

    public static final class w6 extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f8669n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "PurchaseStateLoading";
        }

        public int hashCode() {
            return -1295105499;
        }
    }

    public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Ml() {
    }
}
