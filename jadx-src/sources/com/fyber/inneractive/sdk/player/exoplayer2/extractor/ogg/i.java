package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i extends l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55391o = z.a("Opus");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f55392p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f55393n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f55393n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i2;
        byte[] bArr = nVar.f56206a;
        byte b2 = bArr[0];
        int i3 = b2 & UByte.MAX_VALUE;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = bArr[1] & 63;
            }
        } else {
            i2 = 1;
        }
        int i7 = i3 >> 3;
        int i8 = i7 & 3;
        return (((long) this.f55404i) * ((long) (i2 * (i7 >= 16 ? 2500 << i8 : i7 >= 12 ? 10000 << (i7 & 1) : i8 == 3 ? 60000 : 10000 << i8)))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j2, j jVar) {
        if (!this.f55393n) {
            byte[] bArrCopyOf = Arrays.copyOf(nVar.f56206a, nVar.f56208c);
            int i2 = bArrCopyOf[9] & UByte.MAX_VALUE;
            int i3 = ((bArrCopyOf[11] & UByte.MAX_VALUE) << 8) | (bArrCopyOf[10] & UByte.MAX_VALUE);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i3) * 1000000000) / 48000).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) 3840) * 1000000000) / 48000).array());
            jVar.f55394a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/opus", -1, -1, i2, 48000, arrayList, null, null);
            this.f55393n = true;
            return true;
        }
        boolean z2 = nVar.b() == f55391o;
        nVar.e(0);
        return z2;
    }
}
