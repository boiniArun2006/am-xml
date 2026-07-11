package LRC;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    private static final String n(Number number, String str) {
        return "Required positive " + str + ", but found: " + number;
    }

    public static final void rl(float f3, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException(n(Float.valueOf(f3), name).toString());
        }
    }

    public static final void t(int i2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (i2 <= 0) {
            throw new IllegalArgumentException(n(Integer.valueOf(i2), name).toString());
        }
    }
}
