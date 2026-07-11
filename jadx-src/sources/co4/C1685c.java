package co4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import stX.C2365c;

/* JADX INFO: renamed from: co4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1685c implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43856n;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f43857t;

    /* JADX INFO: renamed from: co4.c$Ml */
    static final class Ml extends Lambda implements Function1 {
        Ml() {
            super(1);
        }

        public final void n(Object obj) {
            for (j jVar : C1685c.this.f43857t) {
                jVar.f43860n.t(obj, jVar.rl);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: co4.c$j */
    private static final class j {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0602j f43859t = new C0602j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.n f43860n;
        private final Object rl;

        /* JADX INFO: renamed from: co4.c$j$j, reason: collision with other inner class name */
        public static final class C0602j {
            public /* synthetic */ C0602j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0602j() {
            }

            public final j n(Pl field) {
                Intrinsics.checkNotNullParameter(field, "field");
                Object defaultValue = field.getDefaultValue();
                if (defaultValue != null) {
                    return new j(field.n(), defaultValue, null);
                }
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }
        }

        public /* synthetic */ j(co4.n nVar, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(nVar, obj);
        }

        private j(co4.n nVar, Object obj) {
            this.f43860n = nVar;
            this.rl = obj;
        }
    }

    /* JADX INFO: renamed from: co4.c$n */
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, UGc.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((UGc) this.receiver).test(obj));
        }
    }

    /* JADX INFO: renamed from: co4.c$w6 */
    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, g9s.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((g9s) this.receiver).test(obj));
        }
    }

    public C1685c(String onZero, Xo format) {
        Intrinsics.checkNotNullParameter(onZero, "onZero");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f43856n = onZero;
        this.rl = format;
        List listRl = eO.rl(format);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            arrayList.add(((o) it.next()).t());
        }
        List listDistinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator it2 = listDistinct.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j.f43859t.n((Pl) it2.next()));
        }
        this.f43857t = arrayList2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1685c)) {
            return false;
        }
        C1685c c1685c = (C1685c) obj;
        return Intrinsics.areEqual(this.f43856n, c1685c.f43856n) && Intrinsics.areEqual(this.rl, c1685c.rl);
    }

    public int hashCode() {
        return (this.f43856n.hashCode() * 31) + this.rl.hashCode();
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        q6b.I28 i28N = this.rl.n();
        List<j> list = this.f43857t;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (j jVar : list) {
            arrayList.add(new CN3(jVar.rl, new s4(jVar.f43860n)));
        }
        UGc uGcN = Q.n(arrayList);
        return uGcN instanceof g9s ? new q6b.w6(this.f43856n) : new q6b.n(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(new n(uGcN), new q6b.w6(this.f43856n)), TuplesKt.to(new w6(g9s.f43865n), i28N)}));
    }

    public final Xo nr() {
        return this.rl;
    }

    @Override // co4.Xo
    public stX.eO rl() {
        return new stX.eO(CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new stX.eO[]{this.rl.rl(), stX.qz.rl(CollectionsKt.listOf((Object[]) new stX.eO[]{new aC(this.f43856n).rl(), new stX.eO(this.f43857t.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.listOf(new C2365c(new Ml())), CollectionsKt.emptyList())}))}));
    }

    public String toString() {
        return "Optional(" + this.f43856n + ", " + this.rl + ')';
    }
}
