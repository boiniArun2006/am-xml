package M;

import ScC.FuwU.XIvb;
import ep.oxM.esLNYym;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class HcS {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Integer f6269O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KA9.u f6270n;
    private final List nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6271t;

    public HcS(KA9.u selectedSortOption, boolean z2, boolean z3, List premadeContentItems, Integer num) {
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        Intrinsics.checkNotNullParameter(premadeContentItems, "premadeContentItems");
        this.f6270n = selectedSortOption;
        this.rl = z2;
        this.f6271t = z3;
        this.nr = premadeContentItems;
        this.f6269O = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HcS)) {
            return false;
        }
        HcS hcS = (HcS) obj;
        return this.f6270n == hcS.f6270n && this.rl == hcS.rl && this.f6271t == hcS.f6271t && Intrinsics.areEqual(this.nr, hcS.nr) && Intrinsics.areEqual(this.f6269O, hcS.f6269O);
    }

    public static /* synthetic */ HcS rl(HcS hcS, KA9.u uVar, boolean z2, boolean z3, List list, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uVar = hcS.f6270n;
        }
        if ((i2 & 2) != 0) {
            z2 = hcS.rl;
        }
        if ((i2 & 4) != 0) {
            z3 = hcS.f6271t;
        }
        if ((i2 & 8) != 0) {
            list = hcS.nr;
        }
        if ((i2 & 16) != 0) {
            num = hcS.f6269O;
        }
        Integer num2 = num;
        boolean z4 = z3;
        return hcS.n(uVar, z2, z4, list, num2);
    }

    public final KA9.u J2() {
        return this.f6270n;
    }

    public final Integer O() {
        return this.f6269O;
    }

    public final boolean Uo() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f6270n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f6271t)) * 31) + this.nr.hashCode()) * 31;
        Integer num = this.f6269O;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final HcS n(KA9.u uVar, boolean z2, boolean z3, List premadeContentItems, Integer num) {
        Intrinsics.checkNotNullParameter(uVar, XIvb.Brd);
        Intrinsics.checkNotNullParameter(premadeContentItems, "premadeContentItems");
        return new HcS(uVar, z2, z3, premadeContentItems, num);
    }

    public final List nr() {
        return this.nr;
    }

    public final boolean t() {
        return this.f6271t;
    }

    public String toString() {
        return "MainTabTemplateViewModelState(selectedSortOption=" + this.f6270n + ", xmlImportEnabled=" + this.rl + ", premadeContentEnabled=" + this.f6271t + ", premadeContentItems=" + this.nr + esLNYym.ttsGqpGN + this.f6269O + ")";
    }

    public /* synthetic */ HcS(KA9.u uVar, boolean z2, boolean z3, List list, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, z2, z3, list, (i2 & 16) != 0 ? null : num);
    }
}
