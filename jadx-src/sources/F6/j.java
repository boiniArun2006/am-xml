package F6;

import MoG.CN3;
import MoG.fuX;
import d2n.Wre;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f2512n;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f2513t;

    /* JADX INFO: renamed from: F6.j$j, reason: collision with other inner class name */
    static final class C0089j extends Lambda implements Function0 {
        C0089j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Set setO = j.this.nr().O();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            j jVar = j.this;
            for (Object obj : setO) {
                if (d2n.CN3.Uo(((fuX) obj).rl(), jVar.O())) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f2512n, jVar.f2512n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(CN3 composition, Wre timeRange) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        this.f2512n = composition;
        this.rl = timeRange;
        if (d2n.CN3.rl(composition.Uo(), timeRange)) {
            this.f2513t = LazyKt.lazy(new C0089j());
            return;
        }
        throw new IllegalArgumentException(("Invalid timeRange (" + timeRange + ") for composition with timeRange (" + composition.Uo() + ')').toString());
    }

    public static /* synthetic */ j rl(j jVar, CN3 cn3, Wre wre, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cn3 = jVar.f2512n;
        }
        if ((i2 & 2) != 0) {
            wre = jVar.rl;
        }
        return jVar.n(cn3, wre);
    }

    public final Wre O() {
        return this.rl;
    }

    public int hashCode() {
        return (this.f2512n.hashCode() * 31) + this.rl.hashCode();
    }

    public final j n(CN3 composition, Wre timeRange) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        return new j(composition, timeRange);
    }

    public final CN3 nr() {
        return this.f2512n;
    }

    public final Set t() {
        return (Set) this.f2513t.getValue();
    }

    public String toString() {
        return "FMAudioCompositionSlice(composition=" + this.f2512n + ", timeRange=" + this.rl + ')';
    }
}
