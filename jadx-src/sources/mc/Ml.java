package mc;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ I28 f70877O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ComponentName f70878n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IBinder f70879t;

    public Ml(I28 i28, ComponentName componentName, IBinder iBinder) {
        this.f70877O = i28;
        this.f70878n = componentName;
        this.f70879t = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70877O.t(this.f70878n, this.f70879t);
    }
}
