package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f54896g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f54897h = Pattern.compile("MPEGTS:(\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f54899b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f54901d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54903f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f54900c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f54902e = new byte[1024];

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f54901d = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    public p(String str, v vVar) {
        this.f54898a = str;
        this.f54899b = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, r, EOFException {
        int iMin;
        Matcher matcher;
        String strC;
        int i2 = (int) bVar.f54725b;
        int i3 = this.f54903f;
        byte[] bArr = this.f54902e;
        if (i3 == bArr.length) {
            this.f54902e = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f54902e;
        int i5 = this.f54903f;
        int length = bArr2.length - i5;
        int i7 = bVar.f54729f;
        if (i7 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i7, length);
            System.arraycopy(bVar.f54727d, 0, bArr2, i5, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr2, i5, length, 0, true);
        }
        if (iMin != -1) {
            bVar.f54726c += (long) iMin;
        }
        if (iMin != -1) {
            int i8 = this.f54903f + iMin;
            this.f54903f = i8;
            if (i2 == -1 || i8 != i2) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.f54902e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f55995a;
            String strC2 = nVar.c();
            if (strC2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f55996b.matcher(strC2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + strC2);
            }
            long j2 = 0;
            long j3 = 0;
            while (true) {
                String strC3 = nVar.c();
                if (TextUtils.isEmpty(strC3)) {
                    while (true) {
                        String strC4 = nVar.c();
                        if (strC4 == null) {
                            matcher = null;
                            break;
                        }
                        if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f55995a.matcher(strC4).matches()) {
                            do {
                                strC = nVar.c();
                                if (strC != null) {
                                }
                            } while (!strC.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f55994a.matcher(strC4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.f54901d.a(0, 3).a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f54898a, -1, null, 0L, Collections.EMPTY_LIST));
                        this.f54901d.b();
                    } else {
                        long jA = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long jA2 = this.f54899b.a((j3 + jA) - j2);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f54901d.a(0, 3);
                        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f54898a, -1, null, jA2 - jA, Collections.EMPTY_LIST));
                        this.f54901d.b();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f54900c;
                        byte[] bArr3 = this.f54902e;
                        int i9 = this.f54903f;
                        nVar2.f56206a = bArr3;
                        nVar2.f56208c = i9;
                        nVar2.f56207b = 0;
                        gVarA.a(i9, nVar2);
                        gVarA.a(jA2, 1, this.f54903f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (strC3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f54896g.matcher(strC3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f54897h.matcher(strC3);
                        if (matcher3.find()) {
                            long jA3 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j3 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                            j2 = jA3;
                        } else {
                            throw new r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strC3));
                        }
                    } else {
                        throw new r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strC3));
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e2) {
            throw new r(e2);
        }
    }
}
