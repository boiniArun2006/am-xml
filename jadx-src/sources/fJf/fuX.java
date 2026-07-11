package fJf;

import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f66887n;
    private static volatile CN3 nr;
    public static final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f66888t;

    static {
        fuX fux = new fuX();
        f66887n = fux;
        rl = fux.rl();
        f66888t = RendererCapabilities.DECODER_SUPPORT_MASK;
    }

    public static final CN3 n() {
        if (nr == null) {
            synchronized (fuX.class) {
                try {
                    if (nr == null) {
                        nr = new CN3(f66888t, rl);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        CN3 cn3 = nr;
        Intrinsics.checkNotNull(cn3);
        return cn3;
    }

    private fuX() {
    }

    private final int rl() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin > 16777216) {
            return (iMin / 4) * 3;
        }
        return iMin / 2;
    }
}
