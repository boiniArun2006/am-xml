package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f54566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f54571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f54572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f54573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f54574i;

    public void a(AudioTrack audioTrack, boolean z2) {
        this.f54566a = audioTrack;
        this.f54567b = z2;
        this.f54572g = -9223372036854775807L;
        this.f54569d = 0L;
        this.f54570e = 0L;
        this.f54571f = 0L;
        if (audioTrack != null) {
            this.f54568c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        if (this.f54572g != -9223372036854775807L) {
            return;
        }
        this.f54566a.pause();
    }

    public final void a(long j2) {
        this.f54573h = a();
        this.f54572g = SystemClock.elapsedRealtime() * 1000;
        this.f54574i = j2;
        this.f54566a.stop();
    }

    public final long a() {
        if (this.f54572g != -9223372036854775807L) {
            return Math.min(this.f54574i, this.f54573h + ((((SystemClock.elapsedRealtime() * 1000) - this.f54572g) * ((long) this.f54568c)) / 1000000));
        }
        int playState = this.f54566a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f54566a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f54567b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f54571f = this.f54569d;
            }
            playbackHeadPosition += this.f54571f;
        }
        if (this.f54569d > playbackHeadPosition) {
            this.f54570e++;
        }
        this.f54569d = playbackHeadPosition;
        return playbackHeadPosition + (this.f54570e << 32);
    }
}
