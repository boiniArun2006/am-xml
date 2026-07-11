package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f54550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f54553d;

    public e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j2, long j3) {
        this.f54553d = eventDispatcher;
        this.f54550a = str;
        this.f54551b = j2;
        this.f54552c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54553d.listener.onAudioDecoderInitialized(this.f54550a, this.f54551b, this.f54552c);
    }
}
