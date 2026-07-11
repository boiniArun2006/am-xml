package M;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y.EnumC2429Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class qYU {
    private final long J2;
    private final EnumC2429Ml KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f6459O;
    private final long Uo;
    private final Integer gh;
    private final Map mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KA9.u f6460n;
    private final boolean nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6461t;
    private final boolean xMQ;

    public /* synthetic */ qYU(KA9.u uVar, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml enumC2429Ml, boolean z6, Map map, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, z2, z3, z4, z5, j2, j3, enumC2429Ml, z6, map, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qYU)) {
            return false;
        }
        qYU qyu = (qYU) obj;
        return this.f6460n == qyu.f6460n && this.rl == qyu.rl && this.f6461t == qyu.f6461t && this.nr == qyu.nr && this.f6459O == qyu.f6459O && XFr.j.KN(this.J2, qyu.J2) && XFr.j.KN(this.Uo, qyu.Uo) && this.KN == qyu.KN && this.xMQ == qyu.xMQ && Intrinsics.areEqual(this.mUb, qyu.mUb) && Intrinsics.areEqual(this.gh, qyu.gh);
    }

    private qYU(KA9.u uVar, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml storageFillLevel, boolean z6, Map syncStatusMap, Integer num) {
        Intrinsics.checkNotNullParameter(uVar, obbPUqyhtS.AFFEDLvxvusem);
        Intrinsics.checkNotNullParameter(storageFillLevel, "storageFillLevel");
        Intrinsics.checkNotNullParameter(syncStatusMap, "syncStatusMap");
        this.f6460n = uVar;
        this.rl = z2;
        this.f6461t = z3;
        this.nr = z4;
        this.f6459O = z5;
        this.J2 = j2;
        this.Uo = j3;
        this.KN = storageFillLevel;
        this.xMQ = z6;
        this.mUb = syncStatusMap;
        this.gh = num;
    }

    public static /* synthetic */ qYU rl(qYU qyu, KA9.u uVar, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml enumC2429Ml, boolean z6, Map map, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uVar = qyu.f6460n;
        }
        return qyu.n(uVar, (i2 & 2) != 0 ? qyu.rl : z2, (i2 & 4) != 0 ? qyu.f6461t : z3, (i2 & 8) != 0 ? qyu.nr : z4, (i2 & 16) != 0 ? qyu.f6459O : z5, (i2 & 32) != 0 ? qyu.J2 : j2, (i2 & 64) != 0 ? qyu.Uo : j3, (i2 & 128) != 0 ? qyu.KN : enumC2429Ml, (i2 & 256) != 0 ? qyu.xMQ : z6, (i2 & 512) != 0 ? qyu.mUb : map, (i2 & 1024) != 0 ? qyu.gh : num);
    }

    public final boolean J2() {
        return this.f6461t;
    }

    public final boolean KN() {
        return this.f6459O;
    }

    public final KA9.u O() {
        return this.f6460n;
    }

    public final boolean Uo() {
        return this.nr;
    }

    public final long az() {
        return this.J2;
    }

    public final Map gh() {
        return this.mUb;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.f6460n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f6461t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f6459O)) * 31) + XFr.j.az(this.J2)) * 31) + XFr.j.az(this.Uo)) * 31) + this.KN.hashCode()) * 31) + Boolean.hashCode(this.xMQ)) * 31) + this.mUb.hashCode()) * 31;
        Integer num = this.gh;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final EnumC2429Ml mUb() {
        return this.KN;
    }

    public final qYU n(KA9.u selectedSortOption, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml storageFillLevel, boolean z6, Map syncStatusMap, Integer num) {
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        Intrinsics.checkNotNullParameter(storageFillLevel, "storageFillLevel");
        Intrinsics.checkNotNullParameter(syncStatusMap, "syncStatusMap");
        return new qYU(selectedSortOption, z2, z3, z4, z5, j2, j3, storageFillLevel, z6, syncStatusMap, num, null);
    }

    public final Integer nr() {
        return this.gh;
    }

    public final long qie() {
        return this.Uo;
    }

    public final boolean t() {
        return this.xMQ;
    }

    public String toString() {
        return "MainTabProjectListViewModelState(selectedSortOption=" + this.f6460n + ", showCloudNewTag=" + this.rl + ", shouldShowCloudTab=" + this.f6461t + ", shouldShowTemplatesTab=" + this.nr + ", shouldShowXmlImportBanner=" + this.f6459O + ", usedStorage=" + XFr.j.ty(this.J2) + ", totalStorage=" + XFr.j.ty(this.Uo) + ", storageFillLevel=" + this.KN + ", canUpgradeStorage=" + this.xMQ + ", syncStatusMap=" + this.mUb + ", progressDialogValue=" + this.gh + ")";
    }

    public final boolean xMQ() {
        return this.rl;
    }

    public /* synthetic */ qYU(KA9.u uVar, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml enumC2429Ml, boolean z6, Map map, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, z2, z3, z4, z5, j2, j3, enumC2429Ml, z6, map, (i2 & 1024) != 0 ? null : num, null);
    }
}
