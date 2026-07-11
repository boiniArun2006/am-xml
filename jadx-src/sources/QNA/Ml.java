package QNA;

import android.os.Process;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml implements Runnable {
    protected abstract void n();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        n();
    }
}
