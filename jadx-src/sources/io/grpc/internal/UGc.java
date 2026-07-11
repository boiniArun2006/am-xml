package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class UGc extends AbstractC2174n {
    private final Queue J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f68385O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Deque f68386n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f68387r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Deque f68388t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Wre f68384o = new j();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Wre f68382Z = new n();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Wre f68381S = new w6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Wre f68383g = new Ml();
    private static final CN3 E2 = new I28();

    private interface CN3 {
        int n(RGN rgn, int i2, Object obj, int i3);
    }

    private interface Wre extends CN3 {
    }

    public UGc(int i2) {
        this.J2 = new ArrayDeque(2);
        this.f68386n = new ArrayDeque(i2);
    }

    class I28 implements CN3 {
        I28() {
        }

        @Override // io.grpc.internal.UGc.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(RGN rgn, int i2, OutputStream outputStream, int i3) {
            rgn.ER(outputStream, i2);
            return 0;
        }
    }

    class Ml implements Wre {
        Ml() {
        }

        @Override // io.grpc.internal.UGc.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(RGN rgn, int i2, ByteBuffer byteBuffer, int i3) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i2);
            rgn.I(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    class j implements Wre {
        j() {
        }

        @Override // io.grpc.internal.UGc.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(RGN rgn, int i2, Void r3, int i3) {
            return rgn.readUnsignedByte();
        }
    }

    class n implements Wre {
        n() {
        }

        @Override // io.grpc.internal.UGc.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(RGN rgn, int i2, Void r3, int i3) {
            rgn.skipBytes(i2);
            return 0;
        }
    }

    class w6 implements Wre {
        w6() {
        }

        @Override // io.grpc.internal.UGc.CN3
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(RGN rgn, int i2, byte[] bArr, int i3) {
            rgn.Rl(bArr, i3, i2);
            return i3 + i2;
        }
    }

    private void T(RGN rgn) {
        if (!(rgn instanceof UGc)) {
            this.f68386n.add(rgn);
            this.f68385O += rgn.nr();
            return;
        }
        UGc uGc = (UGc) rgn;
        while (!uGc.f68386n.isEmpty()) {
            this.f68386n.add((RGN) uGc.f68386n.remove());
        }
        this.f68385O += uGc.f68385O;
        uGc.f68385O = 0;
        uGc.close();
    }

    private void Uo() {
        if (!this.f68387r) {
            ((RGN) this.f68386n.remove()).close();
            return;
        }
        this.f68388t.add((RGN) this.f68386n.remove());
        RGN rgn = (RGN) this.f68386n.peek();
        if (rgn != null) {
            rgn.Po6();
        }
    }

    private void Z() {
        if (((RGN) this.f68386n.peek()).nr() == 0) {
            Uo();
        }
    }

    @Override // io.grpc.internal.RGN
    public void ER(OutputStream outputStream, int i2) {
        jB(E2, i2, outputStream, 0);
    }

    @Override // io.grpc.internal.RGN
    public void I(ByteBuffer byteBuffer) {
        U(f68383g, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
    public void Po6() {
        if (this.f68388t == null) {
            this.f68388t = new ArrayDeque(Math.min(this.f68386n.size(), 16));
        }
        while (!this.f68388t.isEmpty()) {
            ((RGN) this.f68388t.remove()).close();
        }
        this.f68387r = true;
        RGN rgn = (RGN) this.f68386n.peek();
        if (rgn != null) {
            rgn.Po6();
        }
    }

    @Override // io.grpc.internal.RGN
    public void Rl(byte[] bArr, int i2, int i3) {
        U(f68381S, i3, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.RGN] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.RGN] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.UGc] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.UGc] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // io.grpc.internal.RGN
    public RGN S(int i2) {
        RGN rgnS;
        int i3;
        RGN rgnS2;
        ?? r12;
        ?? r02;
        if (i2 <= 0) {
            return B.n();
        }
        n(i2);
        this.f68385O -= i2;
        ?? r03 = 0;
        ?? uGc = 0;
        while (true) {
            RGN rgn = (RGN) this.f68386n.peek();
            int iNr = rgn.nr();
            if (iNr > i2) {
                rgnS2 = rgn.S(i2);
                i3 = 0;
            } else {
                if (this.f68387r) {
                    rgnS = rgn.S(iNr);
                    Uo();
                } else {
                    rgnS = (RGN) this.f68386n.poll();
                }
                RGN rgn2 = rgnS;
                i3 = i2 - iNr;
                rgnS2 = rgn2;
            }
            if (r03 == 0) {
                r02 = rgnS2;
                r12 = uGc;
            } else {
                if (uGc == 0) {
                    uGc = new UGc(i3 != 0 ? Math.min(this.f68386n.size() + 2, 16) : 2);
                    uGc.rl(r03);
                    r03 = uGc;
                }
                uGc.rl(rgnS2);
                r02 = r03;
                r12 = uGc;
            }
            if (i3 <= 0) {
                return r02;
            }
            i2 = i3;
            r03 = r02;
            uGc = r12;
        }
    }

    @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f68386n.isEmpty()) {
            ((RGN) this.f68386n.remove()).close();
        }
        if (this.f68388t != null) {
            while (!this.f68388t.isEmpty()) {
                ((RGN) this.f68388t.remove()).close();
            }
        }
    }

    @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
    public boolean markSupported() {
        Iterator it = this.f68386n.iterator();
        while (it.hasNext()) {
            if (!((RGN) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.RGN
    public int nr() {
        return this.f68385O;
    }

    @Override // io.grpc.internal.RGN
    public int readUnsignedByte() {
        return U(f68384o, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
    public void reset() {
        if (!this.f68387r) {
            throw new InvalidMarkException();
        }
        RGN rgn = (RGN) this.f68386n.peek();
        if (rgn != null) {
            int iNr = rgn.nr();
            rgn.reset();
            this.f68385O += rgn.nr() - iNr;
        }
        while (true) {
            RGN rgn2 = (RGN) this.f68388t.pollLast();
            if (rgn2 == null) {
                return;
            }
            rgn2.reset();
            this.f68386n.addFirst(rgn2);
            this.f68385O += rgn2.nr();
        }
    }

    public void rl(RGN rgn) {
        boolean z2 = this.f68387r && this.f68386n.isEmpty();
        T(rgn);
        if (z2) {
            ((RGN) this.f68386n.peek()).Po6();
        }
    }

    @Override // io.grpc.internal.RGN
    public void skipBytes(int i2) {
        U(f68382Z, i2, null, 0);
    }

    private int U(Wre wre, int i2, Object obj, int i3) {
        try {
            return jB(wre, i2, obj, i3);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private int jB(CN3 cn3, int i2, Object obj, int i3) {
        n(i2);
        if (!this.f68386n.isEmpty()) {
            Z();
        }
        while (i2 > 0 && !this.f68386n.isEmpty()) {
            RGN rgn = (RGN) this.f68386n.peek();
            int iMin = Math.min(i2, rgn.nr());
            i3 = cn3.n(rgn, iMin, obj, i3);
            i2 -= iMin;
            this.f68385O -= iMin;
            Z();
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public UGc() {
        this.J2 = new ArrayDeque(2);
        this.f68386n = new ArrayDeque();
    }
}
