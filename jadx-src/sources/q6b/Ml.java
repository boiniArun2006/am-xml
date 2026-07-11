package q6b;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f72128n;
    private final List nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f72129t;

    public Ml(Function1 number, int i2, int i3, List zerosToAdd) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.f72128n = number;
        this.rl = i2;
        this.f72129t = i3;
        this.nr = zerosToAdd;
        if (1 > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i2 + ") is not in range 1..9").toString());
        }
        if (i2 > i3 || i3 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i3 + ") is not in range " + i2 + "..9").toString());
        }
    }
}
