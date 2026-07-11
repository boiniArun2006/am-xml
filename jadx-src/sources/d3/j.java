package d3;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rB.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: d3.j$j, reason: collision with other inner class name */
    public static final class C0833j implements Ml {
        final /* synthetic */ List nr;
        private final K6D.Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml f63376t;

        C0833j(Ml ml, List list) {
            this.f63376t = ml;
            this.nr = list;
            this.rl = j.n(ml.O(), list);
        }

        @Override // rB.Ml
        public void J2(boolean z2) {
            this.f63376t.J2(z2);
        }

        @Override // rB.Ml
        public void KN(List experiments) {
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            this.f63376t.KN(experiments);
        }

        @Override // rB.Ml
        public K6D.Ml O() {
            return this.rl;
        }

        @Override // rB.Ml
        public boolean Uo() {
            return this.f63376t.Uo();
        }

        @Override // rB.Ml
        public boolean mUb() {
            return this.f63376t.mUb();
        }

        @Override // rB.Ml
        public void n(Function1 infoProvider) {
            Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
            this.f63376t.n(infoProvider);
        }

        @Override // rB.Ml
        public List nr() {
            return this.f63376t.nr();
        }

        @Override // rB.Ml
        public Object rl(Context context, Continuation continuation) {
            Object objRl = this.f63376t.rl(context, continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }

        @Override // rB.Ml
        public void t(ajd.j debugEvent) {
            Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
            this.f63376t.t(j.t(debugEvent, this.nr));
        }

        @Override // rB.Ml
        public void xMQ(boolean z2) {
            this.f63376t.xMQ(z2);
        }
    }

    public static final class n implements WD.Ml {
        final /* synthetic */ WD.Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f63377t;

        n(WD.Ml ml, List list) {
            this.rl = ml;
            this.f63377t = list;
        }

        @Override // WD.Ml
        public x0X.n n(List categories, String str) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            return this.rl.n(CollectionsKt.plus((Collection) this.f63377t, (Iterable) categories), str);
        }

        @Override // WD.Ml
        public x0X.n rl(List categories, String str) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            return this.rl.rl(CollectionsKt.plus((Collection) this.f63377t, (Iterable) categories), str);
        }
    }

    public static final class w6 implements K6D.Ml {
        final /* synthetic */ List nr;
        private final WD.Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ K6D.Ml f63378t;

        w6(K6D.Ml ml, List list) {
            this.f63378t = ml;
            this.nr = list;
            this.rl = j.rl(ml.n(), list);
        }

        @Override // K6D.Ml
        public void O(ajd.j debugEvent, String str) {
            Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
            this.f63378t.O(j.t(debugEvent, this.nr), str);
        }

        @Override // K6D.Ml
        public WD.Ml n() {
            return this.rl;
        }

        @Override // K6D.Ml
        public void nr(ajd.j debugEvent, String str) {
            Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
            this.f63378t.nr(j.t(debugEvent, this.nr), str);
        }

        @Override // K6D.Ml
        public K6D.j rl(ajd.j debugEvent, String str) {
            Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
            this.f63378t.rl(j.t(debugEvent, this.nr), str);
            return new WD.n(debugEvent, str, this);
        }

        @Override // K6D.Ml
        public void t(ajd.j debugEvent, String str) {
            Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
            this.f63378t.t(j.t(debugEvent, this.nr), str);
        }
    }

    public static final Ml J2(Ml ml, String... prefixCategories) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategories, "prefixCategories");
        return O(ml, ArraysKt.toList(prefixCategories));
    }

    public static final Ml O(Ml ml, List prefixCategories) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategories, "prefixCategories");
        return new C0833j(ml, prefixCategories);
    }

    public static final K6D.Ml n(K6D.Ml ml, List prefixCategories) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategories, "prefixCategories");
        return new w6(ml, prefixCategories);
    }

    public static final Ml nr(Ml ml, String prefixCategory) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategory, "prefixCategory");
        return O(ml, CollectionsKt.listOf(prefixCategory));
    }

    public static final WD.Ml rl(WD.Ml ml, List prefixCategories) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategories, "prefixCategories");
        return new n(ml, prefixCategories);
    }

    public static final ajd.j t(ajd.j jVar, List prefixCategories) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(prefixCategories, "prefixCategories");
        return ajd.j.rl(jVar, CollectionsKt.plus((Collection) prefixCategories, (Iterable) jVar.t()), null, null, null, null, 30, null);
    }
}
