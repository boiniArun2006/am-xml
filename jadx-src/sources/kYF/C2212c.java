package kYF;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: renamed from: kYF.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C2212c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2212c f69942n = new C2212c();
    private static final File rl = new File("/proc/self/fd");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f69943t = 30;
    private static long nr = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static boolean f69941O = true;

    public final synchronized boolean rl(SPz sPz) {
        try {
            if (n()) {
                f69943t = 0;
                nr = SystemClock.uptimeMillis();
                String[] list = rl.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z2 = length < 800;
                f69941O = z2;
                if (!z2 && sPz != null && sPz.rl() <= 5) {
                    sPz.n("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f69941O;
    }

    private final boolean n() {
        int i2 = f69943t;
        f69943t = i2 + 1;
        return i2 >= 30 || SystemClock.uptimeMillis() > nr + ((long) 30000);
    }

    private C2212c() {
    }
}
