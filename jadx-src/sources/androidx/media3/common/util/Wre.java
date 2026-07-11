package androidx.media3.common.util;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class Wre implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Handler f39327n;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f39327n.post(runnable);
    }
}
