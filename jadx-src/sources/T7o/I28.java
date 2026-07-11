package T7o;

import com.google.firebase.installations.fuX;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f10198n = fuX.t();
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10199t;
    private static final long nr = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f10197O = TimeUnit.MINUTES.toMillis(30);

    private synchronized void O() {
        this.f10199t = 0;
    }

    private synchronized long n(int i2) {
        if (t(i2)) {
            return (long) Math.min(Math.pow(2.0d, this.f10199t) + this.f10198n.O(), f10197O);
        }
        return nr;
    }

    public synchronized void J2(int i2) {
        if (nr(i2)) {
            O();
            return;
        }
        this.f10199t++;
        this.rl = this.f10198n.n() + n(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean rl() {
        boolean z2;
        if (this.f10199t != 0) {
            z2 = this.f10198n.n() > this.rl;
        }
        return z2;
    }

    private static boolean nr(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private static boolean t(int i2) {
        if (i2 != 429) {
            return i2 >= 500 && i2 < 600;
        }
        return true;
    }

    I28() {
    }
}
