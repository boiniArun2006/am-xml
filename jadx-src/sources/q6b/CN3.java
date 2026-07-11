package q6b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f72125n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f72126t;

    public CN3(Function1 number, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f72125n = number;
        this.rl = i2;
        this.f72126t = num;
        if (i2 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") is negative").toString());
        }
        if (i2 <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") exceeds the length of an Int").toString());
    }
}
