package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f56277e = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f56278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f56279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f56280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56281d;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f56278a = j2;
        this.f56280c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f56280c = Choreographer.getInstance();
            return true;
        }
        if (i2 == 1) {
            int i3 = this.f56281d + 1;
            this.f56281d = i3;
            if (i3 == 1) {
                this.f56280c.postFrameCallback(this);
            }
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int i5 = this.f56281d - 1;
        this.f56281d = i5;
        if (i5 == 0) {
            this.f56280c.removeFrameCallback(this);
            this.f56278a = 0L;
        }
        return true;
    }

    public g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f56279b = handler;
        handler.sendEmptyMessage(0);
    }
}
