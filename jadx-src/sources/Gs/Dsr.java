package Gs;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Dsr extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Dsr f3746t;

    private Dsr() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static Dsr p5() {
        if (f3746t == null) {
            f3746t = new Dsr();
        }
        return f3746t;
    }

    @Override // Gs.I28, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (n()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
