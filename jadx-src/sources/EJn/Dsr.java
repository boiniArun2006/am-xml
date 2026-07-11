package EJn;

import Du.T;
import Du.cA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr implements Wre, Du.Pl {
    private final String[] J2;
    private final List[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f2266O;
    private final Wre[] Uo;
    private final Wre[] gh;
    private final Map mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2267n;
    private final List nr;
    private final Lazy qie;
    private final Pl rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f2268t;
    private final boolean[] xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Wre wre = (Wre) obj;
        if (!Intrinsics.areEqual(KN(), wre.KN()) || !Arrays.equals(this.gh, ((Dsr) obj).gh) || nr() != wre.nr()) {
            return false;
        }
        int iNr = nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            if (!Intrinsics.areEqual(Uo(i2).KN(), wre.Uo(i2).KN()) || !Intrinsics.areEqual(Uo(i2).getKind(), wre.Uo(i2).getKind())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, nr()), ", ", KN() + '(', ")", 0, null, new Function1() { // from class: EJn.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Dsr.ty(this.f2292n, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public Dsr(String serialName, Pl kind, int i2, List typeParameters, j builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f2267n = serialName;
        this.rl = kind;
        this.f2268t = i2;
        this.nr = builder.t();
        this.f2266O = CollectionsKt.toHashSet(builder.J2());
        String[] strArr = (String[]) builder.J2().toArray(new String[0]);
        this.J2 = strArr;
        this.Uo = cA.rl(builder.O());
        this.KN = (List[]) builder.nr().toArray(new List[0]);
        this.xMQ = CollectionsKt.toBooleanArray(builder.Uo());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.mUb = MapsKt.toMap(arrayList);
        this.gh = cA.rl(typeParameters);
        this.qie = LazyKt.lazy(new Function0() { // from class: EJn.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Dsr.qie(this.f2265n));
            }
        });
    }

    private final int az() {
        return ((Number) this.qie.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int qie(Dsr dsr) {
        return T.n(dsr, dsr.gh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence ty(Dsr dsr, int i2) {
        return dsr.O(i2) + ": " + dsr.Uo(i2).KN();
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        return this.KN[i2];
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f2267n;
    }

    @Override // EJn.Wre
    public String O(int i2) {
        return this.J2[i2];
    }

    @Override // EJn.Wre
    public Wre Uo(int i2) {
        return this.Uo[i2];
    }

    @Override // EJn.Wre
    public List getAnnotations() {
        return this.nr;
    }

    @Override // EJn.Wre
    public Pl getKind() {
        return this.rl;
    }

    @Override // Du.Pl
    public Set n() {
        return this.f2266O;
    }

    @Override // EJn.Wre
    public int nr() {
        return this.f2268t;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.mUb.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        return this.xMQ[i2];
    }

    public int hashCode() {
        return az();
    }
}
