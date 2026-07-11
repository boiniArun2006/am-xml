package H7v;

import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    static final class I28 extends Lambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ H7v.j f3798n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(H7v.j jVar) {
            super(3);
            this.f3798n = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d2n.Ml.rl(n((Wre) obj, (Wre) obj2, ((d2n.Ml) obj3).Ik()));
        }

        public final long n(Wre previousTimedValue, Wre nextTimedValue, long j2) {
            double d2;
            double dSqrt;
            Intrinsics.checkNotNullParameter(previousTimedValue, "previousTimedValue");
            Intrinsics.checkNotNullParameter(nextTimedValue, "nextTimedValue");
            long jIk = ((d2n.Ml) previousTimedValue.nr()).Ik();
            long jIk2 = ((d2n.Ml) nextTimedValue.nr()).Ik();
            double dDoubleValue = ((Number) MapsKt.getValue(this.f3798n.t(), d2n.Ml.rl(jIk))).doubleValue();
            double dDoubleValue2 = (((Number) MapsKt.getValue(this.f3798n.t(), d2n.Ml.rl(jIk2))).doubleValue() - dDoubleValue) / d2n.Ml.az(jIk2, jIk);
            long jAz = d2n.Ml.az(j2, previousTimedValue.t());
            if (dDoubleValue2 == 0.0d) {
                d2 = jIk;
                dSqrt = jAz / dDoubleValue;
            } else {
                d2 = jIk;
                dSqrt = (Math.sqrt(((((double) 2) * dDoubleValue2) * jAz) + (dDoubleValue * dDoubleValue)) - dDoubleValue) / dDoubleValue2;
            }
            return d2n.Ml.f63370t.t((long) (d2 + dSqrt));
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f3799n = new Ml();

        Ml() {
            super(3, YDU.w6.class, "linearValueInterpolation", "linearValueInterpolation-IC16agg(Lcom/bendingspoons/fellini/fmfoundation/domain/speed/TimedValue;Lcom/bendingspoons/fellini/fmfoundation/domain/speed/TimedValue;J)J", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d2n.Ml.rl(n((Wre) obj, (Wre) obj2, ((d2n.Ml) obj3).Ik()));
        }

        public final long n(Wre p0, Wre p1, long j2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return YDU.w6.n(p0, p1, j2);
        }
    }

    /* JADX INFO: renamed from: H7v.n$n, reason: collision with other inner class name */
    /* synthetic */ class C0131n extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0131n f3800n = new C0131n();

        C0131n() {
            super(3, YDU.w6.class, "linearValueInterpolation", "linearValueInterpolation-IC16agg(Lcom/bendingspoons/fellini/fmfoundation/domain/speed/TimedValue;Lcom/bendingspoons/fellini/fmfoundation/domain/speed/TimedValue;J)J", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d2n.Ml.rl(n((Wre) obj, (Wre) obj2, ((d2n.Ml) obj3).Ik()));
        }

        public final long n(Wre p0, Wre p1, long j2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return YDU.w6.n(p0, p1, j2);
        }
    }

    static final class w6 extends Lambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ H7v.j f3801n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(H7v.j jVar) {
            super(3);
            this.f3801n = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d2n.Ml.rl(n((Wre) obj, (Wre) obj2, ((d2n.Ml) obj3).Ik()));
        }

        public final long n(Wre previousTimedValue, Wre nextTimedValue, long j2) {
            Intrinsics.checkNotNullParameter(previousTimedValue, "previousTimedValue");
            Intrinsics.checkNotNullParameter(nextTimedValue, "nextTimedValue");
            long jT2 = previousTimedValue.t();
            long jT3 = nextTimedValue.t();
            double dDoubleValue = ((Number) MapsKt.getValue(this.f3801n.t(), d2n.Ml.rl(jT2))).doubleValue();
            return d2n.Ml.f63370t.t(((d2n.Ml) previousTimedValue.nr()).Ik() + ((long) YDU.j.n(jT2, dDoubleValue, j2, YDU.n.n(dDoubleValue, ((Number) MapsKt.getValue(this.f3801n.t(), d2n.Ml.rl(jT3))).doubleValue(), d2n.CN3.xMQ(new d2n.Wre(jT2, jT3, null), j2)))));
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H7v.w6.values().length];
            try {
                iArr[H7v.w6.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H7v.w6.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long O(H7v.j itemTimeAt, long j2) {
        Intrinsics.checkNotNullParameter(itemTimeAt, "$this$itemTimeAt");
        return KN(itemTimeAt.nr(), j2, 1.0d / ((Number) itemTimeAt.t().qie()).doubleValue(), 1.0d / ((Number) itemTimeAt.t().Uo()).doubleValue(), t(itemTimeAt));
    }

    public static final long Uo(H7v.j sourceTimeAt, long j2) {
        Intrinsics.checkNotNullParameter(sourceTimeAt, "$this$sourceTimeAt");
        return KN(sourceTimeAt.rl(), j2, ((Number) sourceTimeAt.t().qie()).doubleValue(), ((Number) sourceTimeAt.t().Uo()).doubleValue(), rl(sourceTimeAt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H7v.Ml J2(H7v.j jVar) {
        List<Wre> listNr;
        Wre wreNr = nr(jVar);
        int i2 = j.$EnumSwitchMapping$0[jVar.n().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                listNr = YDU.j.t(jVar.t(), wreNr);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            listNr = YDU.j.nr(jVar.t(), wreNr);
        }
        SortedMap sortedMapSortedMapOf = MapsKt.sortedMapOf(new Pair[0]);
        for (Wre wre : listNr) {
            long jN = wre.n();
            double dDoubleValue = ((Number) wre.rl()).doubleValue();
            sortedMapSortedMapOf.put(d2n.Ml.rl(jN), d2n.Ml.rl(d2n.Ml.f63370t.t((long) dDoubleValue)));
        }
        return new H7v.Ml(sortedMapSortedMapOf);
    }

    private static final long KN(H7v.Ml ml, long j2, double d2, double d4, Function3 function3) {
        if (d2n.Ml.nr(j2, ml.gh()) <= 0) {
            return d2n.Ml.f63370t.t(((d2n.Ml) ml.qie()).Ik() - ((long) YDU.j.n(j2, d2, ml.gh(), d2)));
        }
        if (d2n.Ml.nr(j2, ml.J2()) >= 0) {
            return d2n.Ml.f63370t.t(((d2n.Ml) ml.Uo()).Ik() + ((long) YDU.j.n(ml.J2(), d4, j2, d4)));
        }
        Pair pairN = H7v.I28.n(ml, j2);
        Wre wre = (Wre) pairN.component1();
        Wre wre2 = (Wre) pairN.component2();
        if (Intrinsics.areEqual(wre, wre2)) {
            return ((d2n.Ml) wre.nr()).Ik();
        }
        return ((d2n.Ml) function3.invoke(wre, wre2, d2n.Ml.rl(j2))).Ik();
    }

    private static final Wre nr(H7v.j jVar) {
        List<Wre> listNr;
        List listAz = jVar.t().az();
        Double dValueOf = Double.valueOf(0.0d);
        if (listAz == null || !listAz.isEmpty()) {
            Iterator it = listAz.iterator();
            while (it.hasNext()) {
                if (d2n.Ml.nr(((Wre) it.next()).t(), d2n.Ml.f63370t.J2()) < 0) {
                    long jT2 = ((Wre) CollectionsKt.first(jVar.t().az())).t();
                    Wre wre = new Wre(jT2, dValueOf, null);
                    int i2 = j.$EnumSwitchMapping$0[jVar.n().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            listNr = YDU.j.t(jVar.t(), wre);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        listNr = YDU.j.nr(jVar.t(), wre);
                    }
                    SortedMap sortedMapSortedMapOf = MapsKt.sortedMapOf(new Pair[0]);
                    for (Wre wre2 : listNr) {
                        sortedMapSortedMapOf.put(d2n.Ml.rl(wre2.n()), d2n.Ml.rl(d2n.Ml.f63370t.t((long) ((Number) wre2.rl()).doubleValue())));
                    }
                    return new Wre(jT2, Double.valueOf(-KN(new H7v.Ml(sortedMapSortedMapOf), d2n.Ml.f63370t.J2(), ((Number) jVar.t().qie()).doubleValue(), ((Number) jVar.t().Uo()).doubleValue(), rl(jVar))), null);
                }
            }
        }
        return new Wre(d2n.Ml.f63370t.J2(), dValueOf, null);
    }

    private static final Function3 rl(H7v.j jVar) {
        int i2 = j.$EnumSwitchMapping$0[jVar.n().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new w6(jVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        return C0131n.f3800n;
    }

    private static final Function3 t(H7v.j jVar) {
        int i2 = j.$EnumSwitchMapping$0[jVar.n().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new I28(jVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Ml.f3799n;
    }
}
