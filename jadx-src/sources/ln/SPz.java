package ln;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class SPz implements ThreadFactory {
    private final AtomicInteger J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f70476O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f70477n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f70478t;

    public SPz(int i2, String prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f70477n = i2;
        this.f70478t = prefix;
        this.f70476O = z2;
        this.J2 = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(SPz this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f70477n);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: ln.r
            @Override // java.lang.Runnable
            public final void run() {
                SPz.rl(this.f70539n, runnable);
            }
        };
        if (this.f70476O) {
            str = this.f70478t + "-" + this.J2.getAndIncrement();
        } else {
            str = this.f70478t;
        }
        return new Thread(runnable2, str);
    }
}
