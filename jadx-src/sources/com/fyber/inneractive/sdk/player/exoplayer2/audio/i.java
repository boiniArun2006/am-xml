package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f54563b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i2) {
        this.f54563b = eventDispatcher;
        this.f54562a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54563b.listener.onAudioSessionId(this.f54562a);
    }
}
