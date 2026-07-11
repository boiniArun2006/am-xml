package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f56092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f56093b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        long jA = this.f56092a.a(kVar);
        if (kVar.f56111d == -1 && jA != -1) {
            kVar = new k(kVar.f56108a, kVar.f56109b, kVar.f56110c, jA, kVar.f56112e, kVar.f56113f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f56093b;
        cVar.getClass();
        if (kVar.f56111d == -1 && (kVar.f56113f & 2) != 2) {
            cVar.f56021d = null;
            return jA;
        }
        cVar.f56021d = kVar;
        cVar.f56026i = 0L;
        try {
            cVar.b();
            return jA;
        } catch (IOException e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f56092a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f56093b;
            if (cVar.f56021d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e2) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e2);
            }
        } catch (Throwable th) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f56093b;
            if (cVar2.f56021d != null) {
                try {
                    cVar2.a();
                } catch (IOException e3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e3);
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        int i5 = this.f56092a.read(bArr, i2, i3);
        if (i5 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f56093b;
            if (cVar.f56021d != null) {
                int i7 = 0;
                while (i7 < i5) {
                    try {
                        if (cVar.f56025h == cVar.f56019b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i5 - i7, cVar.f56019b - cVar.f56025h);
                        cVar.f56023f.write(bArr, i2 + i7, iMin);
                        i7 += iMin;
                        long j2 = iMin;
                        cVar.f56025h += j2;
                        cVar.f56026i += j2;
                    } catch (IOException e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e2);
                    }
                }
            }
        }
        return i5;
    }

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f56092a = hVar;
        cVar.getClass();
        this.f56093b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f56092a.a();
    }
}
