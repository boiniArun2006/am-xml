package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class q extends p {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f56639d;

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public void a(int i2, byte[] bArr) {
        System.arraycopy(this.f56639d, 0, bArr, 0, i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte c(int i2) {
        return this.f56639d[i2];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte d(int i2) {
        return this.f56639d[i2];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final s e(int i2) {
        int iA = s.a(0, i2, size());
        return iA == 0 ? s.f56654b : new n(this.f56639d, g(), iA);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || size() != ((s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof q)) {
            return obj.equals(this);
        }
        q qVar = (q) obj;
        int i2 = this.f56656a;
        int i3 = qVar.f56656a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > qVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > qVar.size()) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Ran off end of other: 0, ", size, ", ");
            sbA.append(qVar.size());
            throw new IllegalArgumentException(sbA.toString());
        }
        byte[] bArr = this.f56639d;
        byte[] bArr2 = qVar.f56639d;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = qVar.g();
        while (iG2 < iG) {
            if (bArr[iG2] != bArr2[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final void a(k kVar) {
        kVar.a(this.f56639d, g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final boolean c() {
        int iG = g();
        return d4.f56549a.b(this.f56639d, iG, size() + iG);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final w d() {
        byte[] bArr = this.f56639d;
        int iG = g();
        int size = size();
        t tVar = new t(bArr, iG, size, true);
        try {
            tVar.d(size);
            return tVar;
        } catch (n1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public int size() {
        return this.f56639d.length;
    }

    public q(byte[] bArr) {
        bArr.getClass();
        this.f56639d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final int a(int i2, int i3) {
        byte[] bArr = this.f56639d;
        int iG = g();
        Charset charset = l1.f56612a;
        for (int i5 = iG; i5 < iG + i3; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final String e() {
        return new String(this.f56639d, g(), size(), l1.f56612a);
    }
}
