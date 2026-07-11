package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import cS.Zv.SzFNXybiSxdx;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f54806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f54807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f54808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] f54809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f54810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f54811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f54812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f54814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g f54815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f54816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f54817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f54818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f54819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f54820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b f54821p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, b bVar, o oVar, List list) {
        this.f54810e = kVar;
        this.f54809d = aVarArr;
        this.f54808c = oVar;
        this.f54812g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            oVarArr[i2] = aVarArr[i2].f54905b;
            iArr[i2] = i2;
        }
        this.f54806a = bVar.f54796a.a();
        this.f54807b = bVar.f54796a.a();
        y yVar = new y(oVarArr);
        this.f54811f = yVar;
        this.f54821p = new e(yVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        String strSubstring;
        int length;
        if (str.toLowerCase(Locale.getDefault()).startsWith(SzFNXybiSxdx.YDTWOxdgoLmBw)) {
            strSubstring = str.substring(2);
        } else {
            strSubstring = str;
        }
        byte[] byteArray = new BigInteger(strSubstring, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        if (byteArray.length > 16) {
            length = byteArray.length - 16;
        } else {
            length = 0;
        }
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f54817l = uri;
        this.f54818m = bArr;
        this.f54819n = str;
        this.f54820o = bArr2;
    }
}
