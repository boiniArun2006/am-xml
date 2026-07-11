package stX;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class QJ implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f73352n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73353t;

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ char f73355t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(char c2) {
            super(0);
            this.f73355t = c2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Expected " + QJ.this.f73353t + " but got " + this.f73355t;
        }
    }

    public QJ(Function2 isNegativeSetter, boolean z2, String whatThisExpects) {
        Intrinsics.checkNotNullParameter(isNegativeSetter, "isNegativeSetter");
        Intrinsics.checkNotNullParameter(whatThisExpects, "whatThisExpects");
        this.f73352n = isNegativeSetter;
        this.rl = z2;
        this.f73353t = whatThisExpects;
    }

    @Override // stX.Pl
    public Object n(Object obj, CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i2 >= input.length()) {
            return aC.f73359n.rl(i2);
        }
        char cCharAt = input.charAt(i2);
        if (cCharAt == '-') {
            this.f73352n.invoke(obj, Boolean.TRUE);
            return aC.f73359n.rl(i2 + 1);
        }
        if (cCharAt != '+' || !this.rl) {
            return aC.f73359n.n(i2, new j(cCharAt));
        }
        this.f73352n.invoke(obj, Boolean.FALSE);
        return aC.f73359n.rl(i2 + 1);
    }

    public String toString() {
        return this.f73353t;
    }
}
