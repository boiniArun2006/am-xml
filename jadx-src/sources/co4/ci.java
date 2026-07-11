package co4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class ci implements o {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Integer f43861O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f43862n;
    private final Integer nr;
    private final Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f43863t;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, n.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            return (Integer) ((n) this.receiver).rl(obj);
        }
    }

    public ci(Pl field, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f43862n = field;
        this.rl = num;
        this.f43863t = num2;
        this.nr = num3;
        this.f43861O = num4;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + ')').toString());
    }

    @Override // co4.o
    public q6b.I28 n() {
        j jVar = new j(this.f43862n.n());
        Integer num = this.rl;
        q6b.CN3 cn3 = new q6b.CN3(jVar, num != null ? num.intValue() : 0, this.f43861O);
        Integer num2 = this.nr;
        return num2 != null ? new q6b.fuX(cn3, num2.intValue()) : cn3;
    }

    @Override // co4.o
    public stX.eO rl() {
        return stX.Xo.n(this.rl, this.f43863t, this.nr, this.f43862n.n(), this.f43862n.getName(), this.f43861O);
    }

    @Override // co4.o
    public final Pl t() {
        return this.f43862n;
    }
}
