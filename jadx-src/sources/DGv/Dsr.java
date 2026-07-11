package DGv;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Ml f1405n = new n(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false);

    public static final Ml n() {
        return f1405n;
    }

    public static final Ml rl(Ml ml, Ml other) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        I28 i28 = new I28();
        i28.xMQ(ml);
        i28.xMQ(other);
        return i28.KN();
    }
}
