package WD;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements K6D.Ml {
    public static final C0414j J2 = new C0414j(null);
    public static final int Uo = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f11442O;
    private final Function0 nr;
    private final Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f11443t;

    /* JADX INFO: renamed from: WD.j$j, reason: collision with other inner class name */
    public static final class C0414j {
        public /* synthetic */ C0414j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0414j() {
        }
    }

    public j(Ml storage, Function1 track, Function0 timestampProvider, Function1 errorLogger) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        this.rl = storage;
        this.f11443t = track;
        this.nr = timestampProvider;
        this.f11442O = errorLogger;
    }

    private final double J2(double d2) {
        return ((Number) this.nr.invoke()).doubleValue() - d2;
    }

    private final ajd.j KN(ajd.j jVar, String str) {
        if (str == null) {
            return jVar;
        }
        pq.Ml mlJ2 = jVar.J2();
        pq.Ml ml = new pq.Ml();
        ml.O("failable_operation_id", str);
        Unit unit = Unit.INSTANCE;
        return ajd.j.rl(jVar, null, null, null, null, mlJ2.rl(ml), 15, null);
    }

    @Override // K6D.Ml
    public void O(ajd.j debugEvent, String str) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        x0X.n nVarRl = n().rl(debugEvent.t(), str);
        boolean z2 = nVarRl instanceof n.C1266n;
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11443t.invoke(KN(xMQ(Uo(debugEvent, ((Number) ((n.w6) nVarRl).n()).doubleValue()), "canceled"), str));
        }
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f11442O.invoke("Trying to cancel an operation that wasn't started. Category = " + debugEvent.t() + " and id = " + str);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"spidersense", "failableOperation", "notStartedOperation", "canceled"});
        pq.Ml ml = new pq.Ml();
        ml.O("failable_operation_category", CollectionsKt.joinToString$default(debugEvent.t(), "/", null, null, 0, null, null, 62, null));
        Unit unit = Unit.INSTANCE;
        this.f11443t.invoke(KN(new ajd.j(listListOf, null, "The app tried to cancel a failable operation that was not started", null, ml, 10, null), str));
    }

    @Override // K6D.Ml
    public Ml n() {
        return this.rl;
    }

    @Override // K6D.Ml
    public void nr(ajd.j debugEvent, String str) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        x0X.n nVarRl = n().rl(debugEvent.t(), str);
        boolean z2 = nVarRl instanceof n.C1266n;
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11443t.invoke(KN(xMQ(Uo(debugEvent, ((Number) ((n.w6) nVarRl).n()).doubleValue()), "failed"), str));
        }
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f11442O.invoke("Trying to complete with a failure an operation that wasn't started. Category = " + debugEvent.t() + " and id = " + str);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"spidersense", "failableOperation", "notStartedOperation", "failed"});
        pq.Ml ml = new pq.Ml();
        ml.O("failable_operation_category", CollectionsKt.joinToString$default(debugEvent.t(), "/", null, null, 0, null, null, 62, null));
        Unit unit = Unit.INSTANCE;
        this.f11443t.invoke(KN(new ajd.j(listListOf, null, "The app tried to complete with a failure a failable operation that was not started", null, ml, 10, null), str));
    }

    @Override // K6D.Ml
    public K6D.j rl(ajd.j debugEvent, String str) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        x0X.n nVarN = n().n(debugEvent.t(), str);
        if (nVarN instanceof n.C1266n) {
            this.f11442O.invoke("Trying to start an already started operation. Category = " + debugEvent.t() + " and id = " + str);
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"spidersense", "failableOperation", "repeatedStart"});
            pq.Ml ml = new pq.Ml();
            ml.O("failable_operation_category", CollectionsKt.joinToString$default(debugEvent.t(), "/", null, null, 0, null, null, 62, null));
            Unit unit = Unit.INSTANCE;
            this.f11443t.invoke(KN(new ajd.j(listListOf, null, "The app tried to start a failable operation that was already started", null, ml, 10, null), str));
        } else if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f11443t.invoke(KN(xMQ(debugEvent, "started"), str));
        return new n(debugEvent, str, this);
    }

    @Override // K6D.Ml
    public void t(ajd.j debugEvent, String str) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        x0X.n nVarRl = n().rl(debugEvent.t(), str);
        boolean z2 = nVarRl instanceof n.C1266n;
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11443t.invoke(KN(xMQ(Uo(debugEvent, ((Number) ((n.w6) nVarRl).n()).doubleValue()), "completed"), str));
        }
        if (!z2) {
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f11442O.invoke("Trying to complete an operation that wasn't started. Category = " + debugEvent.t() + " and id = " + str);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"spidersense", "failableOperation", "notStartedOperation", "completed"});
        pq.Ml ml = new pq.Ml();
        ml.O("failable_operation_category", CollectionsKt.joinToString$default(debugEvent.t(), "/", null, null, 0, null, null, 62, null));
        Unit unit = Unit.INSTANCE;
        this.f11443t.invoke(KN(new ajd.j(listListOf, null, "The app tried to complete a failable operation that was not started", null, ml, 10, null), str));
    }

    private final ajd.j Uo(ajd.j jVar, double d2) {
        pq.Ml mlJ2 = jVar.J2();
        pq.Ml ml = new pq.Ml();
        ml.nr("failable_operation_duration", Double.valueOf(J2(d2)));
        Unit unit = Unit.INSTANCE;
        return ajd.j.rl(jVar, null, null, null, null, mlJ2.rl(ml), 15, null);
    }

    private final ajd.j xMQ(ajd.j jVar, String str) {
        return ajd.j.rl(jVar, CollectionsKt.plus((Collection) jVar.t(), (Iterable) CollectionsKt.listOf(str)), null, null, null, null, 30, null);
    }
}
