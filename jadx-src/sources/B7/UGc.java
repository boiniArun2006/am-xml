package B7;

import GJW.lej;
import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class UGc implements SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HandlerThread f253n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lej f254t;

    public UGc(String name, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        HandlerThread handlerThread = num == null ? new HandlerThread(name) : new HandlerThread(name, num.intValue());
        handlerThread.start();
        this.f253n = handlerThread;
        this.f254t = YF.Wre.rl(new Handler(handlerThread.getLooper()), name);
    }

    @Override // B7.SPz
    public lej J2() {
        return this.f254t;
    }

    @Override // w9.fuX
    public void release() {
        this.f253n.quitSafely();
    }
}
