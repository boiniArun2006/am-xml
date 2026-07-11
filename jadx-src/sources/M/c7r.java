package M;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y.EnumC2429Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class c7r {

    public static final class j extends c7r {
        private final long J2;
        private final EnumC2429Ml KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f6391O;
        private final long Uo;
        private final Integer gh;
        private final Map mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final KA9.u f6392n;
        private final boolean nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f6393t;
        private final boolean xMQ;

        public /* synthetic */ j(KA9.u uVar, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml enumC2429Ml, boolean z6, Map map, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, z2, z3, z4, z5, j2, j3, enumC2429Ml, z6, map, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f6392n == jVar.f6392n && this.rl == jVar.rl && this.f6393t == jVar.f6393t && this.nr == jVar.nr && this.f6391O == jVar.f6391O && XFr.j.KN(this.J2, jVar.J2) && XFr.j.KN(this.Uo, jVar.Uo) && this.KN == jVar.KN && this.xMQ == jVar.xMQ && Intrinsics.areEqual(this.mUb, jVar.mUb) && Intrinsics.areEqual(this.gh, jVar.gh);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private j(KA9.u selectedSortOption, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, EnumC2429Ml storageFillLevel, boolean z6, Map syncStatusMap, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
            Intrinsics.checkNotNullParameter(storageFillLevel, "storageFillLevel");
            Intrinsics.checkNotNullParameter(syncStatusMap, "syncStatusMap");
            this.f6392n = selectedSortOption;
            this.rl = z2;
            this.f6393t = z3;
            this.nr = z4;
            this.f6391O = z5;
            this.J2 = j2;
            this.Uo = j3;
            this.KN = storageFillLevel;
            this.xMQ = z6;
            this.mUb = syncStatusMap;
            this.gh = num;
        }

        public final boolean J2() {
            return this.rl;
        }

        public final boolean KN() {
            return this.nr;
        }

        public final KA9.u O() {
            return this.f6392n;
        }

        public final boolean Uo() {
            return this.f6393t;
        }

        public final long gh() {
            return this.Uo;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.f6392n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f6393t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f6391O)) * 31) + XFr.j.az(this.J2)) * 31) + XFr.j.az(this.Uo)) * 31) + this.KN.hashCode()) * 31) + Boolean.hashCode(this.xMQ)) * 31) + this.mUb.hashCode()) * 31;
            Integer num = this.gh;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final Map mUb() {
            return this.mUb;
        }

        public final boolean n(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            return this.mUb.get(projectId) != okd.n.f71568O;
        }

        public final Integer nr() {
            return this.gh;
        }

        public final long qie() {
            return this.J2;
        }

        public final boolean rl() {
            return this.xMQ;
        }

        public final boolean t() {
            return this.f6393t;
        }

        public String toString() {
            return "Content(selectedSortOption=" + this.f6392n + ", showCloudNewTag=" + this.rl + ", showCloudTab=" + this.f6393t + ", showTemplatesTab=" + this.nr + ", showXmlImportBanner=" + this.f6391O + ", usedStorage=" + XFr.j.ty(this.J2) + ", totalStorage=" + XFr.j.ty(this.Uo) + ", storageFillLevel=" + this.KN + ", canUpgradeStorage=" + this.xMQ + ", syncStatusMap=" + this.mUb + ", progressDialogValue=" + this.gh + ")";
        }

        public final EnumC2429Ml xMQ() {
            return this.KN;
        }
    }

    public /* synthetic */ c7r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c7r() {
    }
}
