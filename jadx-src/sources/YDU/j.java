package YDU;

import H7v.Ml;
import H7v.Wre;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: YDU.j$j, reason: collision with other inner class name */
    static final class C0431j extends Lambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0431j f12031n = new C0431j();

        C0431j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Double invoke(Wre a2, Wre b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return Double.valueOf(j.n(a2.t(), ((Number) a2.nr()).doubleValue(), b2.t(), ((Number) b2.nr()).doubleValue()));
        }
    }

    static final class n extends Lambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f12032n = new n();

        n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Double invoke(Wre a2, Wre b2) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b2, "b");
            return Double.valueOf(j.n(a2.t(), ((Number) a2.nr()).doubleValue(), b2.t(), ((Number) a2.nr()).doubleValue()));
        }
    }

    public static final List nr(Ml ml, Wre initialCondition) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(initialCondition, "initialCondition");
        if (d2n.Ml.nr(initialCondition.t(), ml.gh()) <= 0) {
            return CollectionsKt.drop(rl(CollectionsKt.listOf(initialCondition), CollectionsKt.plus((Collection) CollectionsKt.listOf(new Wre(initialCondition.t(), ml.qie(), null)), (Iterable) ml.az()), n.f12032n), 1);
        }
        throw new IllegalArgumentException(("Initial condition (" + initialCondition + ") must have a time that is lower than the first point (" + ((Object) d2n.Ml.ck(ml.gh())) + ").").toString());
    }

    public static final List t(Ml ml, Wre initialCondition) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(initialCondition, "initialCondition");
        if (d2n.Ml.nr(initialCondition.t(), ml.gh()) <= 0) {
            return CollectionsKt.drop(rl(CollectionsKt.listOf(initialCondition), CollectionsKt.plus((Collection) CollectionsKt.listOf(new Wre(initialCondition.t(), ml.qie(), null)), (Iterable) ml.az()), C0431j.f12031n), 1);
        }
        throw new IllegalArgumentException(("Initial condition (" + initialCondition + ") must have a time that is lower than the first point (" + ((Object) d2n.Ml.ck(ml.gh())) + ").").toString());
    }

    public static final double n(long j2, double d2, long j3, double d4) {
        if (d2n.Ml.nr(j2, j3) <= 0) {
            return (d2n.Ml.az(j3, j2) * (d4 + d2)) / ((double) 2);
        }
        throw new IllegalArgumentException(("Start time (" + ((Object) d2n.Ml.ck(j2)) + ") must be smaller or equal to end time (" + ((Object) d2n.Ml.ck(j3)) + ").").toString());
    }

    private static final List rl(List list, List list2, Function2 function2) {
        while (!list.isEmpty()) {
            if (d2n.Ml.KN(((Wre) CollectionsKt.last(list)).t(), ((Wre) CollectionsKt.first(list2)).t())) {
                if (list2.size() > 1) {
                    List listSubList = list2.subList(1, list2.size());
                    Wre wre = (Wre) CollectionsKt.first(list2);
                    Wre wre2 = (Wre) CollectionsKt.first(listSubList);
                    list = CollectionsKt.plus((Collection<? extends Wre>) list, new Wre(wre2.t(), Double.valueOf(((Number) ((Wre) CollectionsKt.last(list)).nr()).doubleValue() + ((Number) function2.invoke(wre, wre2)).doubleValue()), null));
                    list2 = listSubList;
                } else {
                    return list;
                }
            } else {
                throw new IllegalArgumentException(("The last time of integrated points (" + ((Object) d2n.Ml.ck(((Wre) CollectionsKt.last(list)).t())) + ") must be equal to the first of remaining points (" + ((Object) d2n.Ml.ck(((Wre) CollectionsKt.first(list2)).t())) + ").").toString());
            }
        }
        throw new IllegalArgumentException("List of integrated points must not be empty.");
    }
}
