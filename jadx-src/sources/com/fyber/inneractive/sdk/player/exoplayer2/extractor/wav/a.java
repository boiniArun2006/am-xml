package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a implements i, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f55673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f55674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f55675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55677e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return d.a(bVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f55675c;
        return ((bVar.f55685h / ((long) bVar.f55681d)) * 1000000) / ((long) bVar.f55679b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f55673a = jVar;
        this.f55674b = jVar.a(0, 1);
        this.f55675c = null;
        jVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55677e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        if (this.f55675c == null) {
            b bVarA = d.a(bVar);
            this.f55675c = bVarA;
            if (bVarA != null) {
                int i2 = bVarA.f55679b;
                int i3 = bVarA.f55682e * i2;
                int i5 = bVarA.f55678a;
                this.f55674b.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/raw", i3 * i5, 32768, i5, i2, bVarA.f55683f, -1, -1, null, null, 0, null, null));
                this.f55676d = this.f55675c.f55681d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unsupported or unrecognized wav header.");
            }
        }
        b bVar2 = this.f55675c;
        if (bVar2.f55684g == 0 || bVar2.f55685h == 0) {
            bVar.f54728e = 0;
            n nVar = new n(8);
            c cVarA = c.a(bVar, nVar);
            while (cVarA.f55686a != z.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + cVarA.f55686a);
                long j2 = cVarA.f55687b + 8;
                if (cVarA.f55686a == z.a("RIFF")) {
                    j2 = 12;
                }
                if (j2 <= 2147483647L) {
                    bVar.a((int) j2);
                    cVarA = c.a(bVar, nVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Chunk is too large (~2GB+) to skip; id: " + cVarA.f55686a);
                }
            }
            bVar.a(8);
            long j3 = bVar.f54726c;
            long j4 = cVarA.f55687b;
            bVar2.f55684g = j3;
            bVar2.f55685h = j4;
            this.f55673a.a(this);
        }
        int iA = this.f55674b.a(bVar, 32768 - this.f55677e, true);
        if (iA != -1) {
            this.f55677e += iA;
        }
        int i7 = this.f55677e;
        int i8 = this.f55676d;
        int i9 = i7 / i8;
        if (i9 > 0) {
            long j5 = ((bVar.f54726c - ((long) i7)) * 1000000) / ((long) this.f55675c.f55680c);
            int i10 = i9 * i8;
            int i11 = i7 - i10;
            this.f55677e = i11;
            this.f55674b.a(j5, 1, i10, i11, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        b bVar = this.f55675c;
        long j3 = (j2 * ((long) bVar.f55680c)) / 1000000;
        long j4 = bVar.f55681d;
        return Math.min((j3 / j4) * j4, bVar.f55685h - j4) + bVar.f55684g;
    }
}
