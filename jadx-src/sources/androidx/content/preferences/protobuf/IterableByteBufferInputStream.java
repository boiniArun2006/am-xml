package androidx.content.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class IterableByteBufferInputStream extends InputStream {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38037O = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f38038S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private byte[] f38039Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38040g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Iterator f38041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38042o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f38043r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ByteBuffer f38044t;

    @Override // java.io.InputStream
    public int read() {
        if (this.J2 == this.f38037O) {
            return -1;
        }
        if (this.f38042o) {
            int i2 = this.f38039Z[this.f38043r + this.f38038S] & UByte.MAX_VALUE;
            rl(1);
            return i2;
        }
        int iAYN = UnsafeUtil.aYN(((long) this.f38043r) + this.f38040g) & UByte.MAX_VALUE;
        rl(1);
        return iAYN;
    }

    private boolean n() {
        this.J2++;
        if (!this.f38041n.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f38041n.next();
        this.f38044t = byteBuffer;
        this.f38043r = byteBuffer.position();
        if (this.f38044t.hasArray()) {
            this.f38042o = true;
            this.f38039Z = this.f38044t.array();
            this.f38038S = this.f38044t.arrayOffset();
        } else {
            this.f38042o = false;
            this.f38040g = UnsafeUtil.gh(this.f38044t);
            this.f38039Z = null;
        }
        return true;
    }

    private void rl(int i2) {
        int i3 = this.f38043r + i2;
        this.f38043r = i3;
        if (i3 == this.f38044t.limit()) {
            n();
        }
    }

    IterableByteBufferInputStream(Iterable iterable) {
        this.f38041n = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f38037O++;
        }
        this.J2 = -1;
        if (!n()) {
            this.f38044t = Internal.f38019O;
            this.J2 = 0;
            this.f38043r = 0;
            this.f38040g = 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (this.J2 == this.f38037O) {
            return -1;
        }
        int iLimit = this.f38044t.limit();
        int i5 = this.f38043r;
        int i7 = iLimit - i5;
        if (i3 > i7) {
            i3 = i7;
        }
        if (this.f38042o) {
            System.arraycopy(this.f38039Z, i5 + this.f38038S, bArr, i2, i3);
            rl(i3);
            return i3;
        }
        int iPosition = this.f38044t.position();
        Java8Compatibility.t(this.f38044t, this.f38043r);
        this.f38044t.get(bArr, i2, i3);
        Java8Compatibility.t(this.f38044t, iPosition);
        rl(i3);
        return i3;
    }
}
