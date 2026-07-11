package q6b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f72130n;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f72131t;

    public Wre(I28 formatter, Function1 allSubFormatsNegative, boolean z2) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(allSubFormatsNegative, "allSubFormatsNegative");
        this.f72130n = formatter;
        this.rl = allSubFormatsNegative;
        this.f72131t = z2;
    }
}
