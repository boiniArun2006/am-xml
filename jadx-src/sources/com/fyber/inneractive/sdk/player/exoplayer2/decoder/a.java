package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f54697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f54698b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static void a(a aVar) {
        aVar.f54698b.set(0, 0);
        aVar.f54697a.setPattern(aVar.f54698b);
    }

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f54697a = cryptoInfo;
    }
}
