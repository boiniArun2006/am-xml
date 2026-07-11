package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54805g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.f54805g;
    }

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i2 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.f55986b[0];
        while (true) {
            if (i2 < this.f55998b) {
                if (this.f56000d[i2] == oVar) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        this.f54805g = i2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f56001e[this.f54805g] > jElapsedRealtime) {
            for (int i2 = this.f55998b - 1; i2 >= 0; i2--) {
                if (this.f56001e[i2] <= jElapsedRealtime) {
                    this.f54805g = i2;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
