package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f54564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54565b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f54565b = rVar;
        this.f54564a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f54564a.flush();
            this.f54564a.release();
        } finally {
            this.f54565b.f54613e.open();
        }
    }
}
