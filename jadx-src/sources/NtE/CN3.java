package NtE;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 implements Q6.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f7109n;

    public /* synthetic */ CN3(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    private CN3(long j2) {
        this.f7109n = j2;
    }

    @Override // Q6.fuX
    public List n(F6.j compositionSlice) {
        Intrinsics.checkNotNullParameter(compositionSlice, "compositionSlice");
        Set<MoG.fuX> setT = compositionSlice.t();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setT, 10));
        for (MoG.fuX fux : setT) {
            d2n.Wre wreRl = rl(compositionSlice, fux);
            arrayList.add(fuX.nr((MoG.I28) fux.n(), wreRl, bK.w6.n(wreRl, fux.rl().O()), this.f7109n));
        }
        return arrayList;
    }

    private final d2n.Wre rl(F6.j jVar, MoG.fuX fux) {
        d2n.Wre wreJ2 = d2n.CN3.J2(jVar.O(), fux.rl());
        if (wreJ2 != null) {
            return wreJ2;
        }
        throw new IllegalStateException(("Time range of composition slice " + jVar.O() + " must intersect withtime range of block " + fux.rl()).toString());
    }

    public /* synthetic */ CN3(long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? as.j.f43098n.n() : j2, null);
    }
}
