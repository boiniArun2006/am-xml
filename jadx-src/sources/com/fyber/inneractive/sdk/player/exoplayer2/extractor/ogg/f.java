package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import androidx.media3.extractor.ogg.OggPageHeader;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f55378a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55379b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[OggPageHeader.MAX_PAGE_PAYLOAD]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55380c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55382e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i2;
        int i3;
        int i5;
        if (this.f55382e) {
            this.f55382e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55379b;
            nVar.f56207b = 0;
            nVar.f56208c = 0;
        }
        while (true) {
            if (this.f55382e) {
                return true;
            }
            if (this.f55380c < 0) {
                if (!this.f55378a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f55378a;
                int i7 = gVar.f55387d;
                if ((gVar.f55384a & 1) == 1 && this.f55379b.f56208c == 0) {
                    this.f55381d = 0;
                    int i8 = 0;
                    do {
                        int i9 = this.f55381d;
                        g gVar2 = this.f55378a;
                        if (i9 >= gVar2.f55386c) {
                            break;
                        }
                        int[] iArr = gVar2.f55389f;
                        this.f55381d = i9 + 1;
                        i5 = iArr[i9];
                        i8 += i5;
                    } while (i5 == 255);
                    i7 += i8;
                    i3 = this.f55381d;
                } else {
                    i3 = 0;
                }
                bVar.a(i7);
                this.f55380c = i3;
            }
            int i10 = this.f55380c;
            this.f55381d = 0;
            int i11 = 0;
            do {
                int i12 = this.f55381d;
                int i13 = i10 + i12;
                g gVar3 = this.f55378a;
                if (i13 >= gVar3.f55386c) {
                    break;
                }
                int[] iArr2 = gVar3.f55389f;
                this.f55381d = i12 + 1;
                i2 = iArr2[i13];
                i11 += i2;
            } while (i2 == 255);
            int i14 = this.f55380c + this.f55381d;
            if (i11 > 0) {
                int iA = this.f55379b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55379b;
                int i15 = nVar2.f56208c + i11;
                if (iA < i15) {
                    nVar2.f56206a = Arrays.copyOf(nVar2.f56206a, i15);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55379b;
                bVar.b(nVar3.f56206a, nVar3.f56208c, i11, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f55379b;
                nVar4.d(nVar4.f56208c + i11);
                this.f55382e = this.f55378a.f55389f[i14 + (-1)] != 255;
            }
            if (i14 == this.f55378a.f55386c) {
                i14 = -1;
            }
            this.f55380c = i14;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55379b;
        byte[] bArr = nVar.f56206a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f56206a = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, nVar.f56208c));
    }
}
