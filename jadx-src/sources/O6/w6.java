package O6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Random;
import oW.InterfaceC2314n;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile boolean f7284O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f7285n;
    private long nr;
    private final InterfaceC2314n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2436n f7286t;
    private static final Random J2 = new Random();
    static I28 Uo = new Wre();
    static Clock KN = DefaultClock.getInstance();

    public void n() {
        this.f7284O = true;
    }

    public void nr(X3O.I28 i28) {
        O(i28, true);
    }

    public void t() {
        this.f7284O = false;
    }

    public void O(X3O.I28 i28, boolean z2) {
        Preconditions.checkNotNull(i28);
        long jElapsedRealtime = KN.elapsedRealtime() + this.nr;
        if (z2) {
            i28.te(Dsr.t(this.rl), Dsr.rl(this.f7286t), this.f7285n);
        } else {
            i28.fD(Dsr.t(this.rl), Dsr.rl(this.f7286t));
        }
        int i2 = 1000;
        while (KN.elapsedRealtime() + ((long) i2) <= jElapsedRealtime && !i28.S() && rl(i28.HI())) {
            try {
                Uo.n(J2.nextInt(250) + i2);
                if (i2 < 30000) {
                    if (i28.HI() != -2) {
                        i2 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i2 = 1000;
                    }
                }
                if (this.f7284O) {
                    return;
                }
                i28.e();
                if (z2) {
                    i28.te(Dsr.t(this.rl), Dsr.rl(this.f7286t), this.f7285n);
                } else {
                    i28.fD(Dsr.t(this.rl), Dsr.rl(this.f7286t));
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public boolean rl(int i2) {
        return (i2 >= 500 && i2 < 600) || i2 == -2 || i2 == 429 || i2 == 408;
    }

    public w6(Context context, InterfaceC2314n interfaceC2314n, InterfaceC2436n interfaceC2436n, long j2) {
        this.f7285n = context;
        this.rl = interfaceC2314n;
        this.f7286t = interfaceC2436n;
        this.nr = j2;
    }
}
