package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {
    public static final Dsr n(DAz dAz, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(dAz, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return dAz.rl(key, C.n(bool));
    }

    public static final Dsr rl(DAz dAz, String key, Number number) {
        Intrinsics.checkNotNullParameter(dAz, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return dAz.rl(key, C.rl(number));
    }

    public static final Dsr t(DAz dAz, String key, String str) {
        Intrinsics.checkNotNullParameter(dAz, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return dAz.rl(key, C.t(str));
    }
}
