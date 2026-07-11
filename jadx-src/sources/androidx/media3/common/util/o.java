package androidx.media3.common.util;

import android.content.Context;
import androidx.media3.common.util.NetworkTypeObserver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ NetworkTypeObserver.Receiver f39336n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f39337t;

    public /* synthetic */ o(NetworkTypeObserver.Receiver receiver, Context context) {
        this.f39336n = receiver;
        this.f39337t = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkTypeObserver.this.handleConnectivityActionBroadcast(this.f39337t);
    }
}
