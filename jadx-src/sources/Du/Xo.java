package Du;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f1999n;

    static {
        boolean z2;
        try {
            Class.forName("java.lang.ClassValue");
            z2 = true;
        } catch (Throwable unused) {
            z2 = false;
        }
        f1999n = z2;
    }

    public static final Pp n(Function1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f1999n ? new C1336c(factory) : new SPz(factory);
    }

    public static final c7r rl(Function2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f1999n ? new s4(factory) : new ci(factory);
    }
}
