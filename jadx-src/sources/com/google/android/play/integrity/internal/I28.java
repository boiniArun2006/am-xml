package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class I28 implements ServiceConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Wre f59567n;

    /* synthetic */ I28(Wre wre, Ml ml) {
        this.f59567n = wre;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f59567n.rl.nr("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f59567n.t().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f59567n.rl.nr("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f59567n.t().post(new w6(this));
    }
}
