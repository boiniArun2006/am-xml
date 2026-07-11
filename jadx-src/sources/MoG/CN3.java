package MoG;

import MoG.Xo;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f6747n;
    private final Lazy nr;
    private final d2n.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f6748t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final w6 f6746O = new w6(null);
    private static final CN3 J2 = new CN3(SetsKt.emptySet(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class I28 extends Lambda implements Function0 {
        I28() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CN3 invoke() {
            Set<fuX> setO = CN3.this.O();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (fuX fux : setO) {
                if (fux.n() instanceof C) {
                    Intrinsics.checkNotNull(fux, "null cannot be cast to non-null type com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlock<T of com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlockKt.withItemOrNull>");
                } else {
                    fux = null;
                }
                if (fux != null) {
                    linkedHashSet.add(fux);
                }
            }
            return new CN3(linkedHashSet, CN3.this.Uo());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Ml extends Lambda implements Function0 {
        Ml() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CN3 invoke() {
            Set<fuX> setO = CN3.this.O();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (fuX fux : setO) {
                if (fux.n() instanceof MoG.I28) {
                    Intrinsics.checkNotNull(fux, "null cannot be cast to non-null type com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlock<T of com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlockKt.withItemOrNull>");
                } else {
                    fux = null;
                }
                if (fux != null) {
                    linkedHashSet.add(fux);
                }
            }
            return new CN3(linkedHashSet, CN3.this.Uo());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f6751n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Xo.j.n(n((fuX) obj));
        }

        public final String n(fuX it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.n().n();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6752n = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Xo.j.n(n((fuX) obj));
        }

        public final String n(fuX it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.n().n();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }

        public final CN3 n() {
            return CN3.J2;
        }
    }

    public CN3(Set blocks, d2n.Wre timeRange) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        this.f6747n = blocks;
        this.rl = timeRange;
        if (v9.Wre.rl(blocks, j.f6751n)) {
            this.f6748t = LazyKt.lazy(new I28());
            this.nr = LazyKt.lazy(new Ml());
            return;
        }
        Set setN = v9.Wre.n(blocks, n.f6752n);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN, 10));
        Iterator it = setN.iterator();
        while (it.hasNext()) {
            arrayList.add(((fuX) it.next()).n());
        }
        throw new IllegalArgumentException(("Each item can occur at most once in the composition, find duplicates: " + arrayList).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f6747n, cn3.f6747n) && Intrinsics.areEqual(this.rl, cn3.rl);
    }

    public static /* synthetic */ CN3 t(CN3 cn3, Set set, d2n.Wre wre, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = cn3.f6747n;
        }
        if ((i2 & 2) != 0) {
            wre = cn3.rl;
        }
        return cn3.rl(set, wre);
    }

    public final CN3 J2() {
        return (CN3) this.f6748t.getValue();
    }

    public final Set O() {
        return this.f6747n;
    }

    public final d2n.Wre Uo() {
        return this.rl;
    }

    public int hashCode() {
        return (this.f6747n.hashCode() * 31) + this.rl.hashCode();
    }

    public final CN3 nr() {
        return (CN3) this.nr.getValue();
    }

    public final CN3 rl(Set blocks, d2n.Wre timeRange) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        return new CN3(blocks, timeRange);
    }

    public String toString() {
        return "FMComposition(blocks=" + this.f6747n + QiDPjiOCZHDS.KoHQsh + this.rl + ')';
    }

    public /* synthetic */ CN3(Set set, d2n.Wre wre, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 & 2) != 0 ? Dsr.rl(set) : wre);
    }
}
