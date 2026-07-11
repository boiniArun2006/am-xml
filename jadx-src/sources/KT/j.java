package KT;

import Hh.Xo;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j {
    private static j KN;
    private static final long xMQ = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f5376O;
    private volatile File nr;
    private volatile File rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile StatFs f5377n = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile StatFs f5378t = null;
    private volatile boolean Uo = false;
    private final Lock J2 = new ReentrantLock();

    /* JADX INFO: renamed from: KT.j$j, reason: collision with other inner class name */
    public enum EnumC0178j {
        INTERNAL,
        EXTERNAL
    }

    private StatFs KN(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return n(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw Xo.n(th);
            }
        }
        return null;
    }

    private void O() {
        if (this.J2.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f5376O > xMQ) {
                    Uo();
                }
            } finally {
                this.J2.unlock();
            }
        }
    }

    private void Uo() {
        this.f5377n = KN(this.f5377n, this.rl);
        this.f5378t = KN(this.f5378t, this.nr);
        this.f5376O = SystemClock.uptimeMillis();
    }

    protected static StatFs n(String str) {
        return new StatFs(str);
    }

    public static synchronized j nr() {
        try {
            if (KN == null) {
                KN = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return KN;
    }

    private void rl() {
        if (this.Uo) {
            return;
        }
        this.J2.lock();
        try {
            if (!this.Uo) {
                this.rl = Environment.getDataDirectory();
                this.nr = Environment.getExternalStorageDirectory();
                Uo();
                this.Uo = true;
            }
        } finally {
            this.J2.unlock();
        }
    }

    protected j() {
    }

    public boolean J2(EnumC0178j enumC0178j, long j2) {
        rl();
        long jT2 = t(enumC0178j);
        if (jT2 <= 0 || jT2 < j2) {
            return true;
        }
        return false;
    }

    public long t(EnumC0178j enumC0178j) {
        StatFs statFs;
        rl();
        O();
        if (enumC0178j == EnumC0178j.INTERNAL) {
            statFs = this.f5377n;
        } else {
            statFs = this.f5378t;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }
}
