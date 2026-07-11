package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f f55375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f55376o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f55375n = null;
            this.f55376o = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i2;
        int i3;
        int i5;
        byte[] bArr = nVar.f56206a;
        int i7 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i8 = (bArr[2] & UByte.MAX_VALUE) >> 4;
        switch (i8) {
            case 1:
                i7 = 192;
                return i7;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i8 - 2;
                i3 = 576;
                i7 = i3 << i2;
                return i7;
            case 6:
            case 7:
                nVar.e(nVar.f56207b + 4);
                long j2 = nVar.f56206a[nVar.f56207b];
                int i9 = 7;
                while (true) {
                    if (i9 >= 0) {
                        int i10 = 1 << i9;
                        if ((((long) i10) & j2) != 0) {
                            i9--;
                        } else if (i9 < 6) {
                            j2 &= (long) (i10 - 1);
                            i5 = 7 - i9;
                        } else if (i9 == 7) {
                            i5 = 1;
                        }
                    }
                }
                i5 = 0;
                if (i5 != 0) {
                    for (int i11 = 1; i11 < i5; i11++) {
                        byte b2 = nVar.f56206a[nVar.f56207b + i11];
                        if ((b2 & 192) != 128) {
                            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j2);
                        }
                        j2 = (j2 << 6) | ((long) (b2 & 63));
                    }
                    nVar.f56207b += i5;
                    int iJ = i8 == 6 ? nVar.j() : nVar.o();
                    nVar.e(0);
                    i7 = iJ + 1;
                    return i7;
                }
                throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j2);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i8 - 8;
                i3 = 256;
                i7 = i3 << i2;
                return i7;
            default:
                return i7;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j2, j jVar) {
        byte[] bArr = nVar.f56206a;
        if (this.f55375n == null) {
            this.f55375n = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, nVar.f56208c);
            bArrCopyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f55375n;
            int i2 = fVar.f56182c;
            int i3 = fVar.f56180a;
            jVar.f55394a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/flac", -1, i2 * i3, fVar.f56181b, i3, listSingletonList, null, null);
        } else {
            byte b2 = bArr[0];
            if ((b2 & ByteCompanionObject.MAX_VALUE) == 3) {
                c cVar = new c(this);
                this.f55376o = cVar;
                nVar.e(nVar.f56207b + 1);
                int iL = nVar.l() / 18;
                cVar.f55370a = new long[iL];
                cVar.f55371b = new long[iL];
                for (int i5 = 0; i5 < iL; i5++) {
                    cVar.f55370a[i5] = nVar.g();
                    cVar.f55371b[i5] = nVar.g();
                    nVar.e(nVar.f56207b + 2);
                }
            } else if (b2 == -1) {
                c cVar2 = this.f55376o;
                if (cVar2 != null) {
                    cVar2.f55372c = j2;
                    jVar.f55395b = cVar2;
                }
                return false;
            }
        }
        return true;
    }
}
