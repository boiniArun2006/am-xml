package x0;

import FQq.r;
import android.util.Log;
import ep.oxM.esLNYym;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class Wre implements r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f75151n = new HashSet();

    @Override // FQq.r
    public void debug(String str) {
        t(str, null);
    }

    @Override // FQq.r
    public void n(String str) {
        rl(str, null);
    }

    @Override // FQq.r
    public void error(String str, Throwable th) {
        if (FQq.I28.f2538n) {
            Log.d(esLNYym.cqsdyMeGNreIA, str, th);
        }
    }

    @Override // FQq.r
    public void rl(String str, Throwable th) {
        Set set = f75151n;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    public void t(String str, Throwable th) {
        if (FQq.I28.f2538n) {
            Log.d("LOTTIE", str, th);
        }
    }
}
