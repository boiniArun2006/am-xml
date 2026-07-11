package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f56296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f56297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f56298d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j2, long j3) {
        this.f56298d = eventDispatcher;
        this.f56295a = str;
        this.f56296b = j2;
        this.f56297c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56298d.listener.onVideoDecoderInitialized(this.f56295a, this.f56296b, this.f56297c);
    }
}
