package LRC;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    private static final String n(Number number, String str) {
        return "Required non-negative " + str + ", but found: " + number;
    }

    public static final void rl(int i2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (i2 < 0) {
            throw new IllegalArgumentException(n(Integer.valueOf(i2), name).toString());
        }
    }

    public static final void t(long j2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j2 < 0) {
            throw new IllegalArgumentException(n(Long.valueOf(j2), name).toString());
        }
    }
}
