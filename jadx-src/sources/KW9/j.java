package KW9;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f5464n = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f5465t = 8;

    public final void n(String tag, Function0 message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (rl) {
            System.out.println((Object) ("Injet: [" + tag + "] " + message.invoke()));
        }
    }

    public final void rl(boolean z2) {
        rl = z2;
    }

    private j() {
    }
}
