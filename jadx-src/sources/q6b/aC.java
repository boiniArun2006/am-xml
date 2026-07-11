package q6b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class aC implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f72132n;
    private final int rl;

    public aC(Function1 number, int i2) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f72132n = number;
        this.rl = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") is negative").toString());
        }
        if (i2 <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") exceeds the length of an Int").toString());
    }
}
