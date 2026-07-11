package d2n;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    public static final void n(long j2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Required non-negative " + name + ", but found: " + ((Object) j.S(j2))).toString());
    }
}
