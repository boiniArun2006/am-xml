package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f54699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f54700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f54701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f54702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f54703e;

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f54700b = iArr;
        this.f54701c = iArr2;
        this.f54699a = bArr2;
        int i3 = z.f56234a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f54702d;
            cryptoInfo.numSubSamples = i2;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                a.a(this.f54703e);
            }
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i2 = z.f56234a;
        if (i2 >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f54702d = cryptoInfo;
        this.f54703e = i2 >= 24 ? new a(cryptoInfo) : null;
    }
}
