package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f54559d;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i2, long j2, long j3) {
        this.f54559d = eventDispatcher;
        this.f54556a = i2;
        this.f54557b = j2;
        this.f54558c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54559d.listener.onAudioTrackUnderrun(this.f54556a, this.f54557b, this.f54558c);
    }
}
