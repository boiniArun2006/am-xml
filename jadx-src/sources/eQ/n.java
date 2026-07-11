package eQ;

import Be4.aC;
import FjR.C;
import Lf.Dsr;
import Lf.qz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f63705O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f63706n;
    private final List nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f63707t;

    public static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final List f63708O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f63709n;
        private final List nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f63710t;

        public j() {
            this.f63709n = new ArrayList();
            this.rl = new ArrayList();
            this.f63710t = new ArrayList();
            this.nr = new ArrayList();
            this.f63708O = new ArrayList();
        }

        public final List J2() {
            return this.f63708O;
        }

        public final n O() {
            return new n(kYF.w6.n(this.f63709n), kYF.w6.n(this.rl), kYF.w6.n(this.f63710t), kYF.w6.n(this.nr), kYF.w6.n(this.f63708O), null);
        }

        public final List Uo() {
            return this.nr;
        }

        public final j n(aC.j jVar) {
            this.f63708O.add(jVar);
            return this;
        }

        public final j nr(USj.Ml ml, Class cls) {
            this.rl.add(TuplesKt.to(ml, cls));
            return this;
        }

        public final j rl(Ec7.n nVar, Class cls) {
            this.f63710t.add(TuplesKt.to(nVar, cls));
            return this;
        }

        public final j t(Dsr.j jVar, Class cls) {
            this.nr.add(TuplesKt.to(jVar, cls));
            return this;
        }

        public j(n nVar) {
            this.f63709n = CollectionsKt.toMutableList((Collection) nVar.t());
            this.rl = CollectionsKt.toMutableList((Collection) nVar.O());
            this.f63710t = CollectionsKt.toMutableList((Collection) nVar.nr());
            this.nr = CollectionsKt.toMutableList((Collection) nVar.rl());
            this.f63708O = CollectionsKt.toMutableList((Collection) nVar.n());
        }
    }

    public /* synthetic */ n(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    private n(List list, List list2, List list3, List list4, List list5) {
        this.f63706n = list;
        this.rl = list2;
        this.f63707t = list3;
        this.nr = list4;
        this.f63705O = list5;
    }

    public final String J2(Object obj, C c2) {
        List list = this.f63707t;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) list.get(i2);
            Ec7.n nVar = (Ec7.n) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strN = nVar.n(obj, c2);
                if (strN != null) {
                    return strN;
                }
            }
        }
        return null;
    }

    public final j KN() {
        return new j(this);
    }

    public final List O() {
        return this.rl;
    }

    public final Object Uo(Object obj, C c2) {
        List list = this.rl;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) list.get(i2);
            USj.Ml ml = (USj.Ml) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(ml, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objN = ml.n(obj, c2);
                if (objN != null) {
                    obj = objN;
                }
            }
        }
        return obj;
    }

    public final Pair mUb(Object obj, C c2, fuX fux, int i2) {
        int size = this.nr.size();
        while (i2 < size) {
            Pair pair = (Pair) this.nr.get(i2);
            Dsr.j jVar = (Dsr.j) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                Lf.Dsr dsrN = jVar.n(obj, c2, fux);
                if (dsrN != null) {
                    return TuplesKt.to(dsrN, Integer.valueOf(i2));
                }
            }
            i2++;
        }
        return null;
    }

    public final List n() {
        return this.f63705O;
    }

    public final List nr() {
        return this.f63707t;
    }

    public final List rl() {
        return this.nr;
    }

    public final List t() {
        return this.f63706n;
    }

    public final Pair xMQ(qz qzVar, C c2, fuX fux, int i2) {
        int size = this.f63705O.size();
        while (i2 < size) {
            Be4.aC aCVarN = ((aC.j) this.f63705O.get(i2)).n(qzVar, c2, fux);
            if (aCVarN != null) {
                return TuplesKt.to(aCVarN, Integer.valueOf(i2));
            }
            i2++;
        }
        return null;
    }

    public n() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
