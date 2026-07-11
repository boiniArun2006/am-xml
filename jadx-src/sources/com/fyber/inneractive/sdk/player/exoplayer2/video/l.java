package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f56302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f56303c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i2, long j2) {
        this.f56303c = eventDispatcher;
        this.f56301a = i2;
        this.f56302b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56303c.listener.onDroppedFrames(this.f56301a, this.f56302b);
    }
}
