package co4;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class C implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f43836n;
    private final List nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f43837t;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, n.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final fm.j invoke(Object obj) {
            return (fm.j) ((n) this.receiver).rl(obj);
        }
    }

    public C(Pl field, int i2, int i3, List zerosToAdd) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.f43836n = field;
        this.rl = i2;
        this.f43837t = i3;
        this.nr = zerosToAdd;
    }

    @Override // co4.o
    public q6b.I28 n() {
        return new q6b.Ml(new j(this.f43836n.n()), this.rl, this.f43837t, this.nr);
    }

    @Override // co4.o
    public stX.eO rl() {
        return new stX.eO(CollectionsKt.listOf(new stX.fuX(CollectionsKt.listOf(new stX.Ml(this.rl, this.f43837t, this.f43836n.n(), this.f43836n.getName())))), CollectionsKt.emptyList());
    }

    @Override // co4.o
    public final Pl t() {
        return this.f43836n;
    }
}
