package MO;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO {
    private final z J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final z f6591O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f6592n;
    private final z nr;
    private final cg.o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z f6593t;

    public eO(List rewards, cg.o selectedReward, z zVar, z zVar2, z zVar3, z zVar4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(selectedReward, "selectedReward");
        this.f6592n = rewards;
        this.rl = selectedReward;
        this.f6593t = zVar;
        this.nr = zVar2;
        this.f6591O = zVar3;
        this.J2 = zVar4;
        this.Uo = z2;
        this.KN = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eO)) {
            return false;
        }
        eO eOVar = (eO) obj;
        return Intrinsics.areEqual(this.f6592n, eOVar.f6592n) && Intrinsics.areEqual(this.rl, eOVar.rl) && this.f6593t == eOVar.f6593t && this.nr == eOVar.nr && this.f6591O == eOVar.f6591O && this.J2 == eOVar.J2 && this.Uo == eOVar.Uo && this.KN == eOVar.KN;
    }

    public static /* synthetic */ eO rl(eO eOVar, List list, cg.o oVar, z zVar, z zVar2, z zVar3, z zVar4, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = eOVar.f6592n;
        }
        if ((i2 & 2) != 0) {
            oVar = eOVar.rl;
        }
        if ((i2 & 4) != 0) {
            zVar = eOVar.f6593t;
        }
        if ((i2 & 8) != 0) {
            zVar2 = eOVar.nr;
        }
        if ((i2 & 16) != 0) {
            zVar3 = eOVar.f6591O;
        }
        if ((i2 & 32) != 0) {
            zVar4 = eOVar.J2;
        }
        if ((i2 & 64) != 0) {
            z2 = eOVar.Uo;
        }
        if ((i2 & 128) != 0) {
            z3 = eOVar.KN;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        z zVar5 = zVar3;
        z zVar6 = zVar4;
        return eOVar.n(list, oVar, zVar, zVar2, zVar5, zVar6, z4, z5);
    }

    public final z J2() {
        return this.f6591O;
    }

    public final cg.o KN() {
        return this.rl;
    }

    public final z O() {
        return this.f6593t;
    }

    public final List Uo() {
        return this.f6592n;
    }

    public int hashCode() {
        int iHashCode = ((this.f6592n.hashCode() * 31) + this.rl.hashCode()) * 31;
        z zVar = this.f6593t;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        z zVar2 = this.nr;
        int iHashCode3 = (iHashCode2 + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
        z zVar3 = this.f6591O;
        int iHashCode4 = (iHashCode3 + (zVar3 == null ? 0 : zVar3.hashCode())) * 31;
        z zVar4 = this.J2;
        return ((((iHashCode4 + (zVar4 != null ? zVar4.hashCode() : 0)) * 31) + Boolean.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN);
    }

    public final boolean mUb() {
        return this.KN;
    }

    public final eO n(List rewards, cg.o selectedReward, z zVar, z zVar2, z zVar3, z zVar4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(selectedReward, "selectedReward");
        return new eO(rewards, selectedReward, zVar, zVar2, zVar3, zVar4, z2, z3);
    }

    public final z nr() {
        return this.J2;
    }

    public final z t() {
        return this.nr;
    }

    public String toString() {
        return "RedeemTokensViewState(rewards=" + this.f6592n + ", selectedReward=" + this.rl + ", emailError=" + this.f6593t + ", confirmEmailError=" + this.nr + ", phoneNumberError=" + this.f6591O + ", confirmPhoneNumberError=" + this.J2 + ", isLoading=" + this.Uo + ", isRedeemEnabled=" + this.KN + ")";
    }

    public final boolean xMQ() {
        return this.Uo;
    }

    public /* synthetic */ eO(List list, cg.o oVar, z zVar, z zVar2, z zVar3, z zVar4, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, oVar, (i2 & 4) != 0 ? null : zVar, (i2 & 8) != 0 ? null : zVar2, (i2 & 16) != 0 ? null : zVar3, (i2 & 32) != 0 ? null : zVar4, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3);
    }
}
