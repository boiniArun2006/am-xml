package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f56307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f56308e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i2, int i3, int i5, float f3) {
        this.f56308e = eventDispatcher;
        this.f56304a = i2;
        this.f56305b = i3;
        this.f56306c = i5;
        this.f56307d = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56308e.listener.onVideoSizeChanged(this.f56304a, this.f56305b, this.f56306c, this.f56307d);
    }
}
