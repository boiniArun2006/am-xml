package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f56358b;

    public j(p pVar, int i2) {
        this.f56358b = pVar;
        this.f56357a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f56358b;
        int i2 = this.f56357a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.seekTo(i2);
        IAlog.e(strB + "timelog: seekTo took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
