package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f56354a;

    public g(p pVar) {
        this.f56354a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f56354a);
        Handler handler = this.f56354a.f56376o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f56354a.f56376o = null;
        }
        this.f56354a.f56375n = null;
        Looper.myLooper().quit();
    }
}
