package FSZ;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Pl implements Hh.qz {
    private static final long rl = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ActivityManager f2598n;

    private int rl() {
        int iMin = Math.min(this.f2598n.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public r get() {
        return new r(rl(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, rl);
    }

    public Pl(ActivityManager activityManager) {
        this.f2598n = activityManager;
    }
}
