package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class l extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f54575j = new AudioTimestamp();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f54576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f54577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f54578m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f54578m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f54575j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f54566a.getTimestamp(this.f54575j);
        if (timestamp) {
            long j2 = this.f54575j.framePosition;
            if (this.f54577l > j2) {
                this.f54576k++;
            }
            this.f54577l = j2;
            this.f54578m = j2 + (this.f54576k << 32);
        }
        return timestamp;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z2) {
        super.a(audioTrack, z2);
        this.f54576k = 0L;
        this.f54577l = 0L;
        this.f54578m = 0L;
    }
}
