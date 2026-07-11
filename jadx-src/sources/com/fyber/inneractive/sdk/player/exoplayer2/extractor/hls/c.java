package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f54797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f54799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f54800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f54801m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f54799k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f54799k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f54798j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f55903h.a(this.f55896a);
            int i2 = 0;
            this.f54798j = 0;
            while (i2 != -1 && !this.f54799k) {
                byte[] bArr = this.f54797i;
                if (bArr == null) {
                    this.f54797i = new byte[16384];
                } else if (bArr.length < this.f54798j + 16384) {
                    this.f54797i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i2 = this.f55903h.read(this.f54797i, this.f54798j, 16384);
                if (i2 != -1) {
                    this.f54798j += i2;
                }
            }
            if (!this.f54799k) {
                this.f54801m = Arrays.copyOf(this.f54797i, this.f54798j);
            }
            z.a(this.f55903h);
        } catch (Throwable th) {
            z.a(this.f55903h);
            throw th;
        }
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, Object obj, byte[] bArr, String str) {
        super(3, i2, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.f54797i = bArr;
        this.f54800l = str;
    }
}
