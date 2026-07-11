package co4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Z implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f43850n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f43851t;

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

    public Z(afx field, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f43850n = field;
        this.rl = i2;
        this.f43851t = num;
        int iNr = field.nr();
        this.nr = iNr;
        if (i2 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") is negative").toString());
        }
        if (iNr < i2) {
            throw new IllegalArgumentException(("The maximum number of digits (" + iNr + ") is less than the minimum number of digits (" + i2 + ')').toString());
        }
        if (num == null || num.intValue() > i2) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i2 + ')').toString());
    }

    @Override // co4.o
    public q6b.I28 n() {
        q6b.aC aCVar = new q6b.aC(new j(this.f43850n.n()), this.rl);
        Integer num = this.f43851t;
        return num != null ? new q6b.fuX(aCVar, num.intValue()) : aCVar;
    }

    @Override // co4.o
    public stX.eO rl() {
        return stX.Xo.O(Integer.valueOf(this.rl), Integer.valueOf(this.nr), this.f43851t, this.f43850n.n(), this.f43850n.getName(), false, 32, null);
    }

    @Override // co4.o
    public /* bridge */ /* synthetic */ Pl t() {
        return this.f43850n;
    }
}
