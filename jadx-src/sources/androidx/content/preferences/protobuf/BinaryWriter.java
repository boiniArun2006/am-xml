package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.Utf8;
import androidx.content.preferences.protobuf.WireFormat;
import androidx.content.preferences.protobuf.Writer;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BufferAllocator f37726n;
    int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayDeque f37727t;

    private static final class SafeDirectWriter extends BinaryWriter {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ByteBuffer f37729O;
        private int Uo;

        private void G7(long j2) {
            dR0((int) j2);
        }

        private void Mx(long j2) {
            k((int) j2);
        }

        private void m(long j2) {
            Nxk((int) j2);
        }

        private void xg(long j2) {
            Y((int) j2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void O(int i2, Object obj, Schema schema) {
            Xw(i2, 4);
            schema.rl(obj, this);
            Xw(i2, 3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void r(boolean z2) {
            a(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            Ik(6);
            a(z2 ? (byte) 1 : (byte) 0);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            Xw(i2, 4);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            Xw(i2, 3);
        }

        private void C(long j2) {
            ByteBuffer byteBuffer = this.f37729O;
            int i2 = this.Uo;
            this.Uo = i2 - 1;
            byteBuffer.put(i2, (byte) (j2 >>> 63));
            ByteBuffer byteBuffer2 = this.f37729O;
            int i3 = this.Uo;
            this.Uo = i3 - 1;
            byteBuffer2.put(i3, (byte) (((j2 >>> 56) & 127) | 128));
            piY(j2 & 72057594037927935L);
        }

        private int D() {
            return this.Uo + 1;
        }

        private int E() {
            return this.J2 - this.Uo;
        }

        private void GR(int i2) {
            ByteBuffer byteBuffer = this.f37729O;
            int i3 = this.Uo;
            this.Uo = i3 - 1;
            byteBuffer.put(i3, (byte) (i2 >>> 28));
            int i5 = this.Uo;
            this.Uo = i5 - 4;
            this.f37729O.putInt(i5 - 3, (i2 & 127) | 128 | ((((i2 >>> 21) & 127) | 128) << 24) | ((((i2 >>> 14) & 127) | 128) << 16) | ((((i2 >>> 7) & 127) | 128) << 8));
        }

        private void Nxk(int i2) {
            int i3 = this.Uo;
            this.Uo = i3 - 4;
            this.f37729O.putInt(i3 - 3, (i2 & 127) | 128 | ((266338304 & i2) << 3) | (((2080768 & i2) | 2097152) << 2) | (((i2 & 16256) | 16384) << 1));
        }

        private void Y(int i2) {
            ByteBuffer byteBuffer = this.f37729O;
            int i3 = this.Uo;
            this.Uo = i3 - 1;
            byteBuffer.put(i3, (byte) i2);
        }

        private void dR0(int i2) {
            int i3 = this.Uo;
            this.Uo = i3 - 2;
            this.f37729O.putShort(i3 - 1, (short) ((i2 & 127) | 128 | ((i2 & 16256) << 1)));
        }

        private void eTf(long j2) {
            ByteBuffer byteBuffer = this.f37729O;
            int i2 = this.Uo;
            this.Uo = i2 - 1;
            byteBuffer.put(i2, (byte) (j2 >>> 56));
            piY(j2 & 72057594037927935L);
        }

        private void ijL(long j2) {
            int i2 = this.Uo;
            this.Uo = i2 - 5;
            this.f37729O.putLong(i2 - 7, (((j2 & 127) | 128) << 24) | ((34091302912L & j2) << 28) | (((266338304 & j2) | 268435456) << 27) | (((2080768 & j2) | 2097152) << 26) | (((16256 & j2) | 16384) << 25));
        }

        private void k(int i2) {
            int i3 = this.Uo - 3;
            this.Uo = i3;
            this.f37729O.putInt(i3, (((i2 & 127) | 128) << 8) | ((2080768 & i2) << 10) | (((i2 & 16256) | 16384) << 9));
        }

        private void ofS(long j2) {
            int i2 = this.Uo;
            this.Uo = i2 - 6;
            this.f37729O.putLong(i2 - 7, (((j2 & 127) | 128) << 16) | ((4363686772736L & j2) << 21) | (((34091302912L & j2) | 34359738368L) << 20) | (((266338304 & j2) | 268435456) << 19) | (((2080768 & j2) | 2097152) << 18) | (((16256 & j2) | 16384) << 17));
        }

        private void pJg(long j2) {
            int i2 = this.Uo - 7;
            this.Uo = i2;
            this.f37729O.putLong(i2, (((j2 & 127) | 128) << 8) | ((558551906910208L & j2) << 14) | (((4363686772736L & j2) | 4398046511104L) << 13) | (((34091302912L & j2) | 34359738368L) << 12) | (((266338304 & j2) | 268435456) << 11) | (((2080768 & j2) | 2097152) << 10) | (((16256 & j2) | 16384) << 9));
        }

        private void piY(long j2) {
            int i2 = this.Uo;
            this.Uo = i2 - 8;
            this.f37729O.putLong(i2 - 7, (j2 & 127) | 128 | (((71494644084506624L & j2) | 72057594037927936L) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        private void z(long j2) {
            int i2 = this.Uo;
            this.Uo = i2 - 8;
            this.f37729O.putLong(i2 - 7, (j2 & 127) | 128 | ((71494644084506624L & j2) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void E2(int i2) {
            if (i2 >= 0) {
                p5(i2);
            } else {
                eF(i2);
            }
        }

        void M() {
            if (this.f37729O != null) {
                this.nr += E();
                Java8Compatibility.t(this.f37729O, this.Uo + 1);
                this.f37729O = null;
                this.Uo = 0;
                this.J2 = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void WPU(int i2) {
            int i3 = this.Uo;
            this.Uo = i3 - 4;
            this.f37729O.putInt(i3 - 3, i2);
        }

        public void a(byte b2) {
            ByteBuffer byteBuffer = this.f37729O;
            int i2 = this.Uo;
            this.Uo = i2 - 1;
            byteBuffer.put(i2, b2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nY(long j2) {
            int i2 = this.Uo;
            this.Uo = i2 - 8;
            this.f37729O.putLong(i2 - 7, j2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void p5(int i2) {
            if ((i2 & (-128)) == 0) {
                Y(i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                dR0(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                k(i2);
            } else if (((-268435456) & i2) == 0) {
                Nxk(i2);
            } else {
                GR(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public int qie() {
            return this.nr + E();
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            Ik(9);
            WPU(i3);
            Xw(i2, 5);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            Ik(13);
            nY(j2);
            Xw(i2, 1);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            Ik(15);
            E2(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            Ik(10);
            nHg(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            Ik(15);
            v(j2);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            Ik(10);
            p5(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            Ik(15);
            eF(j2);
            Xw(i2, 0);
        }

        private void B(int i2) {
            J(ty(i2));
        }

        private void FX() {
            J(az());
        }

        private void J(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.nr()) {
                ByteBuffer byteBufferJ2 = allocatedBuffer.J2();
                if (byteBufferJ2.isDirect()) {
                    M();
                    this.f37727t.addFirst(allocatedBuffer);
                    this.f37729O = byteBufferJ2;
                    Java8Compatibility.n(byteBufferJ2, byteBufferJ2.capacity());
                    Java8Compatibility.t(this.f37729O, 0);
                    this.f37729O.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.f37729O.limit() - 1;
                    this.J2 = iLimit;
                    this.Uo = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        void I(String str) {
            int i2;
            int i3;
            int i5;
            char cCharAt;
            Ik(str.length());
            int length = str.length() - 1;
            this.Uo -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f37729O.put(this.Uo + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.Uo--;
                return;
            }
            this.Uo += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i5 = this.Uo) >= 0) {
                    ByteBuffer byteBuffer = this.f37729O;
                    this.Uo = i5 - 1;
                    byteBuffer.put(i5, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i3 = this.Uo) > 0) {
                    ByteBuffer byteBuffer2 = this.f37729O;
                    this.Uo = i3 - 1;
                    byteBuffer2.put(i3, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f37729O;
                    int i7 = this.Uo;
                    this.Uo = i7 - 1;
                    byteBuffer3.put(i7, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.Uo) > 1) {
                    ByteBuffer byteBuffer4 = this.f37729O;
                    this.Uo = i2 - 1;
                    byteBuffer4.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f37729O;
                    int i8 = this.Uo;
                    this.Uo = i8 - 1;
                    byteBuffer5.put(i8, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f37729O;
                    int i9 = this.Uo;
                    this.Uo = i9 - 1;
                    byteBuffer6.put(i9, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.Uo > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f37729O;
                                int i10 = this.Uo;
                                this.Uo = i10 - 1;
                                byteBuffer7.put(i10, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f37729O;
                                int i11 = this.Uo;
                                this.Uo = i11 - 1;
                                byteBuffer8.put(i11, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f37729O;
                                int i12 = this.Uo;
                                this.Uo = i12 - 1;
                                byteBuffer9.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f37729O;
                                int i13 = this.Uo;
                                this.Uo = i13 - 1;
                                byteBuffer10.put(i13, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    Ik(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Ik(int i2) {
            if (D() < i2) {
                B(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (D() < iRemaining) {
                this.nr += iRemaining;
                this.f37727t.addFirst(AllocatedBuffer.xMQ(byteBuffer));
                FX();
            } else {
                int i2 = this.Uo - iRemaining;
                this.Uo = i2;
                Java8Compatibility.t(this.f37729O, i2 + 1);
                this.f37729O.put(byteBuffer);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) {
            if (D() < i3) {
                B(i3);
            }
            int i5 = this.Uo - i3;
            this.Uo = i5;
            Java8Compatibility.t(this.f37729O, i5 + 1);
            this.f37729O.put(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Xw(int i2, int i3) {
            p5(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void eF(long j2) {
            switch (BinaryWriter.gh(j2)) {
                case 1:
                    xg(j2);
                    break;
                case 2:
                    G7(j2);
                    break;
                case 3:
                    Mx(j2);
                    break;
                case 4:
                    m(j2);
                    break;
                case 5:
                    ijL(j2);
                    break;
                case 6:
                    ofS(j2);
                    break;
                case 7:
                    pJg(j2);
                    break;
                case 8:
                    z(j2);
                    break;
                case 9:
                    eTf(j2);
                    break;
                case 10:
                    C(j2);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nHg(int i2) {
            p5(CodedOutputStream.k(i2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void rl(int i2, ByteString byteString) {
            try {
                byteString.rV9(this);
                Ik(10);
                p5(byteString.size());
                Xw(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void t(int i2, Object obj, Schema schema) {
            int iQie = qie();
            schema.rl(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void v(long j2) {
            eF(CodedOutputStream.dR0(j2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) {
            int iQie = qie();
            Protobuf.n().O(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int iQie = qie();
            I(str);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) {
            if (D() < i3) {
                this.nr += i3;
                this.f37727t.addFirst(AllocatedBuffer.gh(bArr, i2, i3));
                FX();
            } else {
                int i5 = this.Uo - i3;
                this.Uo = i5;
                Java8Compatibility.t(this.f37729O, i5 + 1);
                this.f37729O.put(bArr, i2, i3);
            }
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private byte[] J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private AllocatedBuffer f37730O;
        private int Uo;
        private int gh;
        private int mUb;
        private int xMQ;

        @Override // androidx.content.preferences.protobuf.Writer
        public void O(int i2, Object obj, Schema schema) {
            Xw(i2, 4);
            schema.rl(obj, this);
            Xw(i2, 3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void r(boolean z2) {
            a(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            Ik(6);
            a(z2 ? (byte) 1 : (byte) 0);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            Xw(i2, 4);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            Xw(i2, 3);
        }

        private void C(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (((int) j2) >>> 14);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 3;
            bArr[i5] = (byte) ((j2 & 127) | 128);
        }

        private void GR(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            int i5 = i3 - 1;
            this.gh = i5;
            bArr[i3] = (byte) (i2 >>> 28);
            int i7 = i3 - 2;
            this.gh = i7;
            bArr[i5] = (byte) (((i2 >>> 21) & 127) | 128);
            int i8 = i3 - 3;
            this.gh = i8;
            bArr[i7] = (byte) (((i2 >>> 14) & 127) | 128);
            int i9 = i3 - 4;
            this.gh = i9;
            bArr[i8] = (byte) (((i2 >>> 7) & 127) | 128);
            this.gh = i3 - 5;
            bArr[i9] = (byte) ((i2 & 127) | 128);
        }

        private void Mx(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 7);
            this.gh = i2 - 2;
            bArr[i3] = (byte) ((((int) j2) & 127) | 128);
        }

        private void Nxk(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            int i5 = i3 - 1;
            this.gh = i5;
            bArr[i3] = (byte) (i2 >>> 21);
            int i7 = i3 - 2;
            this.gh = i7;
            bArr[i5] = (byte) (((i2 >>> 14) & 127) | 128);
            int i8 = i3 - 3;
            this.gh = i8;
            bArr[i7] = (byte) (((i2 >>> 7) & 127) | 128);
            this.gh = i3 - 4;
            bArr[i8] = (byte) ((i2 & 127) | 128);
        }

        private void Y(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            this.gh = i3 - 1;
            bArr[i3] = (byte) i2;
        }

        private void dR0(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            int i5 = i3 - 1;
            this.gh = i5;
            bArr[i3] = (byte) (i2 >>> 7);
            this.gh = i3 - 2;
            bArr[i5] = (byte) ((i2 & 127) | 128);
        }

        private void eTf(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            this.gh = i2 - 1;
            bArr[i2] = (byte) j2;
        }

        private void ijL(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 21);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 14) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 4;
            bArr[i7] = (byte) ((j2 & 127) | 128);
        }

        private void k(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            int i5 = i3 - 1;
            this.gh = i5;
            bArr[i3] = (byte) (i2 >>> 14);
            int i7 = i3 - 2;
            this.gh = i7;
            bArr[i5] = (byte) (((i2 >>> 7) & 127) | 128);
            this.gh = i3 - 3;
            bArr[i7] = (byte) ((i2 & 127) | 128);
        }

        private void m(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 56);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 49) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 42) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 35) & 127) | 128);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((j2 >>> 28) & 127) | 128);
            int i10 = i2 - 6;
            this.gh = i10;
            bArr[i9] = (byte) (((j2 >>> 21) & 127) | 128);
            int i11 = i2 - 7;
            this.gh = i11;
            bArr[i10] = (byte) (((j2 >>> 14) & 127) | 128);
            int i12 = i2 - 8;
            this.gh = i12;
            bArr[i11] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 9;
            bArr[i12] = (byte) ((j2 & 127) | 128);
        }

        private void ofS(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 63);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 56) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 49) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 42) & 127) | 128);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((j2 >>> 35) & 127) | 128);
            int i10 = i2 - 6;
            this.gh = i10;
            bArr[i9] = (byte) (((j2 >>> 28) & 127) | 128);
            int i11 = i2 - 7;
            this.gh = i11;
            bArr[i10] = (byte) (((j2 >>> 21) & 127) | 128);
            int i12 = i2 - 8;
            this.gh = i12;
            bArr[i11] = (byte) (((j2 >>> 14) & 127) | 128);
            int i13 = i2 - 9;
            this.gh = i13;
            bArr[i12] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 10;
            bArr[i13] = (byte) ((j2 & 127) | 128);
        }

        private void pJg(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 35);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 28) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 21) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 14) & 127) | 128);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 6;
            bArr[i9] = (byte) ((j2 & 127) | 128);
        }

        private void piY(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 28);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 21) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 14) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 5;
            bArr[i8] = (byte) ((j2 & 127) | 128);
        }

        private void xg(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 42);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 35) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 28) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 21) & 127) | 128);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((j2 >>> 14) & 127) | 128);
            int i10 = i2 - 6;
            this.gh = i10;
            bArr[i9] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 7;
            bArr[i10] = (byte) ((j2 & 127) | 128);
        }

        private void z(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (j2 >>> 49);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((j2 >>> 42) & 127) | 128);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((j2 >>> 35) & 127) | 128);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((j2 >>> 28) & 127) | 128);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((j2 >>> 21) & 127) | 128);
            int i10 = i2 - 6;
            this.gh = i10;
            bArr[i9] = (byte) (((j2 >>> 14) & 127) | 128);
            int i11 = i2 - 7;
            this.gh = i11;
            bArr[i10] = (byte) (((j2 >>> 7) & 127) | 128);
            this.gh = i2 - 8;
            bArr[i11] = (byte) ((j2 & 127) | 128);
        }

        int D() {
            return this.gh - this.xMQ;
        }

        int E() {
            return this.mUb - this.gh;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void E2(int i2) {
            if (i2 >= 0) {
                p5(i2);
            } else {
                eF(i2);
            }
        }

        void M() {
            if (this.f37730O != null) {
                this.nr += E();
                AllocatedBuffer allocatedBuffer = this.f37730O;
                allocatedBuffer.KN((this.gh - allocatedBuffer.rl()) + 1);
                this.f37730O = null;
                this.gh = 0;
                this.mUb = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void WPU(int i2) {
            byte[] bArr = this.J2;
            int i3 = this.gh;
            int i5 = i3 - 1;
            this.gh = i5;
            bArr[i3] = (byte) ((i2 >> 24) & 255);
            int i7 = i3 - 2;
            this.gh = i7;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            int i8 = i3 - 3;
            this.gh = i8;
            bArr[i7] = (byte) ((i2 >> 8) & 255);
            this.gh = i3 - 4;
            bArr[i8] = (byte) (i2 & 255);
        }

        public void a(byte b2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            this.gh = i2 - 1;
            bArr[i2] = b2;
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nY(long j2) {
            byte[] bArr = this.J2;
            int i2 = this.gh;
            int i3 = i2 - 1;
            this.gh = i3;
            bArr[i2] = (byte) (((int) (j2 >> 56)) & 255);
            int i5 = i2 - 2;
            this.gh = i5;
            bArr[i3] = (byte) (((int) (j2 >> 48)) & 255);
            int i7 = i2 - 3;
            this.gh = i7;
            bArr[i5] = (byte) (((int) (j2 >> 40)) & 255);
            int i8 = i2 - 4;
            this.gh = i8;
            bArr[i7] = (byte) (((int) (j2 >> 32)) & 255);
            int i9 = i2 - 5;
            this.gh = i9;
            bArr[i8] = (byte) (((int) (j2 >> 24)) & 255);
            int i10 = i2 - 6;
            this.gh = i10;
            bArr[i9] = (byte) (((int) (j2 >> 16)) & 255);
            int i11 = i2 - 7;
            this.gh = i11;
            bArr[i10] = (byte) (((int) (j2 >> 8)) & 255);
            this.gh = i2 - 8;
            bArr[i11] = (byte) (((int) j2) & 255);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void p5(int i2) {
            if ((i2 & (-128)) == 0) {
                Y(i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                dR0(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                k(i2);
            } else if (((-268435456) & i2) == 0) {
                Nxk(i2);
            } else {
                GR(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public int qie() {
            return this.nr + E();
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            Ik(9);
            WPU(i3);
            Xw(i2, 5);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            Ik(13);
            nY(j2);
            Xw(i2, 1);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            Ik(15);
            E2(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            Ik(10);
            nHg(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            Ik(15);
            v(j2);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            Ik(10);
            p5(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            Ik(15);
            eF(j2);
            Xw(i2, 0);
        }

        private void B(int i2) {
            J(ck(i2));
        }

        private void FX() {
            J(HI());
        }

        private void J(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.t()) {
                M();
                this.f37727t.addFirst(allocatedBuffer);
                this.f37730O = allocatedBuffer;
                this.J2 = allocatedBuffer.n();
                int iRl = allocatedBuffer.rl();
                this.KN = allocatedBuffer.O() + iRl;
                int iUo = iRl + allocatedBuffer.Uo();
                this.Uo = iUo;
                this.xMQ = iUo - 1;
                int i2 = this.KN - 1;
                this.mUb = i2;
                this.gh = i2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        void I(String str) {
            int i2;
            int i3;
            int i5;
            char cCharAt;
            Ik(str.length());
            int length = str.length() - 1;
            this.gh -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.J2[this.gh + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.gh--;
                return;
            }
            this.gh += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i5 = this.gh) > this.xMQ) {
                    byte[] bArr = this.J2;
                    this.gh = i5 - 1;
                    bArr[i5] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i3 = this.gh) > this.Uo) {
                    byte[] bArr2 = this.J2;
                    int i7 = i3 - 1;
                    this.gh = i7;
                    bArr2[i3] = (byte) ((cCharAt2 & '?') | 128);
                    this.gh = i3 - 2;
                    bArr2[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i2 = this.gh) > this.Uo + 1) {
                    byte[] bArr3 = this.J2;
                    int i8 = i2 - 1;
                    this.gh = i8;
                    bArr3[i2] = (byte) ((cCharAt2 & '?') | 128);
                    int i9 = i2 - 2;
                    this.gh = i9;
                    bArr3[i8] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.gh = i2 - 3;
                    bArr3[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.gh > this.Uo + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.J2;
                                int i10 = this.gh;
                                int i11 = i10 - 1;
                                this.gh = i11;
                                bArr4[i10] = (byte) ((codePoint & 63) | 128);
                                int i12 = i10 - 2;
                                this.gh = i12;
                                bArr4[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i13 = i10 - 3;
                                this.gh = i13;
                                bArr4[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.gh = i10 - 4;
                                bArr4[i13] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    Ik(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Ik(int i2) {
            if (D() < i2) {
                B(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (D() < iRemaining) {
                this.nr += iRemaining;
                this.f37727t.addFirst(AllocatedBuffer.xMQ(byteBuffer));
                FX();
            }
            int i2 = this.gh - iRemaining;
            this.gh = i2;
            byteBuffer.get(this.J2, i2 + 1, iRemaining);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) {
            if (D() < i3) {
                B(i3);
            }
            int i5 = this.gh - i3;
            this.gh = i5;
            System.arraycopy(bArr, i2, this.J2, i5 + 1, i3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Xw(int i2, int i3) {
            p5(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void eF(long j2) {
            switch (BinaryWriter.gh(j2)) {
                case 1:
                    eTf(j2);
                    break;
                case 2:
                    Mx(j2);
                    break;
                case 3:
                    C(j2);
                    break;
                case 4:
                    ijL(j2);
                    break;
                case 5:
                    piY(j2);
                    break;
                case 6:
                    pJg(j2);
                    break;
                case 7:
                    xg(j2);
                    break;
                case 8:
                    z(j2);
                    break;
                case 9:
                    m(j2);
                    break;
                case 10:
                    ofS(j2);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nHg(int i2) {
            p5(CodedOutputStream.k(i2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void rl(int i2, ByteString byteString) {
            try {
                byteString.rV9(this);
                Ik(10);
                p5(byteString.size());
                Xw(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void t(int i2, Object obj, Schema schema) {
            int iQie = qie();
            schema.rl(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void v(long j2) {
            eF(CodedOutputStream.dR0(j2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) {
            int iQie = qie();
            Protobuf.n().O(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int iQie = qie();
            I(str);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) {
            if (D() < i3) {
                this.nr += i3;
                this.f37727t.addFirst(AllocatedBuffer.gh(bArr, i2, i3));
                FX();
            } else {
                int i5 = this.gh - i3;
                this.gh = i5;
                System.arraycopy(bArr, i2, this.J2, i5 + 1, i3);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    private static final class UnsafeDirectWriter extends BinaryWriter {
        private long J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ByteBuffer f37731O;
        private long Uo;

        @Override // androidx.content.preferences.protobuf.Writer
        public void O(int i2, Object obj, Schema schema) {
            Xw(i2, 4);
            schema.rl(obj, this);
            Xw(i2, 3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void r(boolean z2) {
            I(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            Ik(6);
            I(z2 ? (byte) 1 : (byte) 0);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            Xw(i2, 4);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            Xw(i2, 3);
        }

        private void C(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 63));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 56) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 49) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 42) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((j2 >>> 35) & 127) | 128));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) (((j2 >>> 28) & 127) | 128));
            long j10 = this.KN;
            this.KN = j10 - 1;
            UnsafeUtil.jB(j10, (byte) (((j2 >>> 21) & 127) | 128));
            long j11 = this.KN;
            this.KN = j11 - 1;
            UnsafeUtil.jB(j11, (byte) (((j2 >>> 14) & 127) | 128));
            long j12 = this.KN;
            this.KN = j12 - 1;
            UnsafeUtil.jB(j12, (byte) (((j2 >>> 7) & 127) | 128));
            long j13 = this.KN;
            this.KN = j13 - 1;
            UnsafeUtil.jB(j13, (byte) ((j2 & 127) | 128));
        }

        private int E() {
            return (int) (this.KN - this.J2);
        }

        private void G7(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 7));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) ((((int) j2) & 127) | 128));
        }

        private int M() {
            return (int) (this.Uo - this.KN);
        }

        private void Mx(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (((int) j2) >>> 14));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 7) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) ((j2 & 127) | 128));
        }

        private void Nxk(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) (i2 >>> 28));
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (((i2 >>> 21) & 127) | 128));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((i2 >>> 14) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((i2 >>> 7) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) ((i2 & 127) | 128));
        }

        private void Y(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) (i2 >>> 21));
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (((i2 >>> 14) & 127) | 128));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((i2 >>> 7) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) ((i2 & 127) | 128));
        }

        private void dR0(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) (i2 >>> 14));
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (((i2 >>> 7) & 127) | 128));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) ((i2 & 127) | 128));
        }

        private void eTf(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 56));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 49) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 42) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 35) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((j2 >>> 28) & 127) | 128));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) (((j2 >>> 21) & 127) | 128));
            long j10 = this.KN;
            this.KN = j10 - 1;
            UnsafeUtil.jB(j10, (byte) (((j2 >>> 14) & 127) | 128));
            long j11 = this.KN;
            this.KN = j11 - 1;
            UnsafeUtil.jB(j11, (byte) (((j2 >>> 7) & 127) | 128));
            long j12 = this.KN;
            this.KN = j12 - 1;
            UnsafeUtil.jB(j12, (byte) ((j2 & 127) | 128));
        }

        private void ijL(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 28));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 21) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 14) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 7) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) ((j2 & 127) | 128));
        }

        private void k(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) i2);
        }

        private void m(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 21));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 14) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 7) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) ((j2 & 127) | 128));
        }

        private void ofS(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 35));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 28) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 21) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 14) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((j2 >>> 7) & 127) | 128));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) ((j2 & 127) | 128));
        }

        private void pJg(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 42));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 35) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 28) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 21) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((j2 >>> 14) & 127) | 128));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) (((j2 >>> 7) & 127) | 128));
            long j10 = this.KN;
            this.KN = j10 - 1;
            UnsafeUtil.jB(j10, (byte) ((j2 & 127) | 128));
        }

        private void piY(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (j2 >>> 49));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((j2 >>> 42) & 127) | 128));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((j2 >>> 35) & 127) | 128));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((j2 >>> 28) & 127) | 128));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((j2 >>> 21) & 127) | 128));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) (((j2 >>> 14) & 127) | 128));
            long j10 = this.KN;
            this.KN = j10 - 1;
            UnsafeUtil.jB(j10, (byte) (((j2 >>> 7) & 127) | 128));
            long j11 = this.KN;
            this.KN = j11 - 1;
            UnsafeUtil.jB(j11, (byte) ((j2 & 127) | 128));
        }

        private void xg(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) j2);
        }

        private void z(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) (i2 >>> 7));
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void E2(int i2) {
            if (i2 >= 0) {
                p5(i2);
            } else {
                eF(i2);
            }
        }

        void FX() {
            if (this.f37731O != null) {
                this.nr += M();
                Java8Compatibility.t(this.f37731O, E() + 1);
                this.f37731O = null;
                this.KN = 0L;
                this.Uo = 0L;
            }
        }

        public void I(byte b2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, b2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void WPU(int i2) {
            long j2 = this.KN;
            this.KN = j2 - 1;
            UnsafeUtil.jB(j2, (byte) ((i2 >> 24) & 255));
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) ((i2 >> 16) & 255));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) ((i2 >> 8) & 255));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (i2 & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nY(long j2) {
            long j3 = this.KN;
            this.KN = j3 - 1;
            UnsafeUtil.jB(j3, (byte) (((int) (j2 >> 56)) & 255));
            long j4 = this.KN;
            this.KN = j4 - 1;
            UnsafeUtil.jB(j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.KN;
            this.KN = j5 - 1;
            UnsafeUtil.jB(j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.KN;
            this.KN = j6 - 1;
            UnsafeUtil.jB(j6, (byte) (((int) (j2 >> 32)) & 255));
            long j7 = this.KN;
            this.KN = j7 - 1;
            UnsafeUtil.jB(j7, (byte) (((int) (j2 >> 24)) & 255));
            long j9 = this.KN;
            this.KN = j9 - 1;
            UnsafeUtil.jB(j9, (byte) (((int) (j2 >> 16)) & 255));
            long j10 = this.KN;
            this.KN = j10 - 1;
            UnsafeUtil.jB(j10, (byte) (((int) (j2 >> 8)) & 255));
            long j11 = this.KN;
            this.KN = j11 - 1;
            UnsafeUtil.jB(j11, (byte) (((int) j2) & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void p5(int i2) {
            if ((i2 & (-128)) == 0) {
                k(i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                z(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                dR0(i2);
            } else if (((-268435456) & i2) == 0) {
                Y(i2);
            } else {
                Nxk(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public int qie() {
            return this.nr + M();
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            Ik(9);
            WPU(i3);
            Xw(i2, 5);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            Ik(13);
            nY(j2);
            Xw(i2, 1);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            Ik(15);
            E2(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            Ik(10);
            nHg(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            Ik(15);
            v(j2);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            Ik(10);
            p5(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            Ik(15);
            eF(j2);
            Xw(i2, 0);
        }

        private void B() {
            D(az());
        }

        private void D(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.nr()) {
                ByteBuffer byteBufferJ2 = allocatedBuffer.J2();
                if (byteBufferJ2.isDirect()) {
                    FX();
                    this.f37727t.addFirst(allocatedBuffer);
                    this.f37731O = byteBufferJ2;
                    Java8Compatibility.n(byteBufferJ2, byteBufferJ2.capacity());
                    Java8Compatibility.t(this.f37731O, 0);
                    long jGh = UnsafeUtil.gh(this.f37731O);
                    this.J2 = jGh;
                    long jLimit = jGh + ((long) (this.f37731O.limit() - 1));
                    this.Uo = jLimit;
                    this.KN = jLimit;
                    return;
                }
                throw new RuntimeException(QTafcm.AfdABCNLoJVT);
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        private void J(int i2) {
            D(ty(i2));
        }

        private int a() {
            return E() + 1;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void GR(String str) {
            char cCharAt;
            Ik(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j2 = this.KN;
                this.KN = j2 - 1;
                UnsafeUtil.jB(j2, (byte) cCharAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128) {
                        long j3 = this.KN;
                        if (j3 >= this.J2) {
                            this.KN = j3 - 1;
                            UnsafeUtil.jB(j3, (byte) cCharAt2);
                        } else if (cCharAt2 < 2048) {
                            long j4 = this.KN;
                            if (j4 > this.J2) {
                                this.KN = j4 - 1;
                                UnsafeUtil.jB(j4, (byte) ((cCharAt2 & '?') | 128));
                                long j5 = this.KN;
                                this.KN = j5 - 1;
                                UnsafeUtil.jB(j5, (byte) ((cCharAt2 >>> 6) | 960));
                            } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                                long j6 = this.KN;
                                if (j6 > this.J2 + 1) {
                                    this.KN = j6 - 1;
                                    UnsafeUtil.jB(j6, (byte) ((cCharAt2 & '?') | 128));
                                    long j7 = this.KN;
                                    this.KN = j7 - 1;
                                    UnsafeUtil.jB(j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                                    long j9 = this.KN;
                                    this.KN = j9 - 1;
                                    UnsafeUtil.jB(j9, (byte) ((cCharAt2 >>> '\f') | 480));
                                } else {
                                    if (this.KN > this.J2 + 2) {
                                        if (length != 0) {
                                            char cCharAt3 = str.charAt(length - 1);
                                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                                length--;
                                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                                long j10 = this.KN;
                                                this.KN = j10 - 1;
                                                UnsafeUtil.jB(j10, (byte) ((codePoint & 63) | 128));
                                                long j11 = this.KN;
                                                this.KN = j11 - 1;
                                                UnsafeUtil.jB(j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                                long j12 = this.KN;
                                                this.KN = j12 - 1;
                                                UnsafeUtil.jB(j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                                long j13 = this.KN;
                                                this.KN = j13 - 1;
                                                UnsafeUtil.jB(j13, (byte) ((codePoint >>> 18) | 240));
                                            }
                                        }
                                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                    }
                                    Ik(length);
                                    length++;
                                }
                            }
                        }
                    }
                    length--;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Ik(int i2) {
            if (a() < i2) {
                J(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (a() < iRemaining) {
                this.nr += iRemaining;
                this.f37727t.addFirst(AllocatedBuffer.xMQ(byteBuffer));
                B();
            } else {
                this.KN -= (long) iRemaining;
                Java8Compatibility.t(this.f37731O, E() + 1);
                this.f37731O.put(byteBuffer);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) {
            if (a() < i3) {
                J(i3);
            }
            this.KN -= (long) i3;
            Java8Compatibility.t(this.f37731O, E() + 1);
            this.f37731O.put(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Xw(int i2, int i3) {
            p5(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void eF(long j2) {
            switch (BinaryWriter.gh(j2)) {
                case 1:
                    xg(j2);
                    break;
                case 2:
                    G7(j2);
                    break;
                case 3:
                    Mx(j2);
                    break;
                case 4:
                    m(j2);
                    break;
                case 5:
                    ijL(j2);
                    break;
                case 6:
                    ofS(j2);
                    break;
                case 7:
                    pJg(j2);
                    break;
                case 8:
                    piY(j2);
                    break;
                case 9:
                    eTf(j2);
                    break;
                case 10:
                    C(j2);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nHg(int i2) {
            p5(CodedOutputStream.k(i2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void rl(int i2, ByteString byteString) {
            try {
                byteString.rV9(this);
                Ik(10);
                p5(byteString.size());
                Xw(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void t(int i2, Object obj, Schema schema) {
            int iQie = qie();
            schema.rl(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void v(long j2) {
            eF(CodedOutputStream.dR0(j2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) {
            int iQie = qie();
            Protobuf.n().O(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int iQie = qie();
            GR(str);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) {
            if (a() < i3) {
                this.nr += i3;
                this.f37727t.addFirst(AllocatedBuffer.gh(bArr, i2, i3));
                B();
            } else {
                this.KN -= (long) i3;
                Java8Compatibility.t(this.f37731O, E() + 1);
                this.f37731O.put(bArr, i2, i3);
            }
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private byte[] J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private AllocatedBuffer f37732O;
        private long Uo;
        private long gh;
        private long mUb;
        private long xMQ;

        @Override // androidx.content.preferences.protobuf.Writer
        public void O(int i2, Object obj, Schema schema) {
            Xw(i2, 4);
            schema.rl(obj, this);
            Xw(i2, 3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void r(boolean z2) {
            I(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeBool(int i2, boolean z2) {
            Ik(6);
            I(z2 ? (byte) 1 : (byte) 0);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeEndGroup(int i2) {
            Xw(i2, 4);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeStartGroup(int i2) {
            Xw(i2, 3);
        }

        private void C(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 63));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 56) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 49) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 42) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((j2 >>> 35) & 127) | 128));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) (((j2 >>> 28) & 127) | 128));
            byte[] bArr7 = this.J2;
            long j10 = this.gh;
            this.gh = j10 - 1;
            UnsafeUtil.U(bArr7, j10, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr8 = this.J2;
            long j11 = this.gh;
            this.gh = j11 - 1;
            UnsafeUtil.U(bArr8, j11, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr9 = this.J2;
            long j12 = this.gh;
            this.gh = j12 - 1;
            UnsafeUtil.U(bArr9, j12, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr10 = this.J2;
            long j13 = this.gh;
            this.gh = j13 - 1;
            UnsafeUtil.U(bArr10, j13, (byte) ((j2 & 127) | 128));
        }

        private int E() {
            return (int) this.gh;
        }

        private void G7(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 7));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) ((((int) j2) & 127) | 128));
        }

        private void Mx(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (((int) j2) >>> 14));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) ((j2 & 127) | 128));
        }

        private void Nxk(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) (i2 >>> 28));
            byte[] bArr2 = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr2, j3, (byte) (((i2 >>> 21) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr3, j4, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr4, j5, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr5, j6, (byte) ((i2 & 127) | 128));
        }

        private void Y(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) (i2 >>> 21));
            byte[] bArr2 = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr2, j3, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr3, j4, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr4, j5, (byte) ((i2 & 127) | 128));
        }

        private void dR0(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) (i2 >>> 14));
            byte[] bArr2 = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr2, j3, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr3, j4, (byte) ((i2 & 127) | 128));
        }

        private void eTf(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 56));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 49) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 42) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 35) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((j2 >>> 28) & 127) | 128));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr7 = this.J2;
            long j10 = this.gh;
            this.gh = j10 - 1;
            UnsafeUtil.U(bArr7, j10, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr8 = this.J2;
            long j11 = this.gh;
            this.gh = j11 - 1;
            UnsafeUtil.U(bArr8, j11, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr9 = this.J2;
            long j12 = this.gh;
            this.gh = j12 - 1;
            UnsafeUtil.U(bArr9, j12, (byte) ((j2 & 127) | 128));
        }

        private void ijL(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 28));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) ((j2 & 127) | 128));
        }

        private void k(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) i2);
        }

        private void m(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 21));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) ((j2 & 127) | 128));
        }

        private void ofS(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 35));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 28) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) ((j2 & 127) | 128));
        }

        private void pJg(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 42));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 35) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 28) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr7 = this.J2;
            long j10 = this.gh;
            this.gh = j10 - 1;
            UnsafeUtil.U(bArr7, j10, (byte) ((j2 & 127) | 128));
        }

        private void piY(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (j2 >>> 49));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((j2 >>> 42) & 127) | 128));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((j2 >>> 35) & 127) | 128));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((j2 >>> 28) & 127) | 128));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((j2 >>> 21) & 127) | 128));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) (((j2 >>> 14) & 127) | 128));
            byte[] bArr7 = this.J2;
            long j10 = this.gh;
            this.gh = j10 - 1;
            UnsafeUtil.U(bArr7, j10, (byte) (((j2 >>> 7) & 127) | 128));
            byte[] bArr8 = this.J2;
            long j11 = this.gh;
            this.gh = j11 - 1;
            UnsafeUtil.U(bArr8, j11, (byte) ((j2 & 127) | 128));
        }

        private void xg(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) j2);
        }

        private void z(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) (i2 >>> 7));
            byte[] bArr2 = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr2, j3, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void E2(int i2) {
            if (i2 >= 0) {
                p5(i2);
            } else {
                eF(i2);
            }
        }

        void FX() {
            if (this.f37732O != null) {
                this.nr += M();
                this.f37732O.KN((E() - this.f37732O.rl()) + 1);
                this.f37732O = null;
                this.gh = 0L;
                this.mUb = 0L;
            }
        }

        public void I(byte b2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, b2);
        }

        int M() {
            return (int) (this.mUb - this.gh);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            Ik(i3);
            this.gh -= (long) i3;
            System.arraycopy(bArr, i2, this.J2, E() + 1, i3);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void WPU(int i2) {
            byte[] bArr = this.J2;
            long j2 = this.gh;
            this.gh = j2 - 1;
            UnsafeUtil.U(bArr, j2, (byte) ((i2 >> 24) & 255));
            byte[] bArr2 = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr2, j3, (byte) ((i2 >> 16) & 255));
            byte[] bArr3 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr3, j4, (byte) ((i2 >> 8) & 255));
            byte[] bArr4 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr4, j5, (byte) (i2 & 255));
        }

        int a() {
            return (int) (this.gh - this.xMQ);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nY(long j2) {
            byte[] bArr = this.J2;
            long j3 = this.gh;
            this.gh = j3 - 1;
            UnsafeUtil.U(bArr, j3, (byte) (((int) (j2 >> 56)) & 255));
            byte[] bArr2 = this.J2;
            long j4 = this.gh;
            this.gh = j4 - 1;
            UnsafeUtil.U(bArr2, j4, (byte) (((int) (j2 >> 48)) & 255));
            byte[] bArr3 = this.J2;
            long j5 = this.gh;
            this.gh = j5 - 1;
            UnsafeUtil.U(bArr3, j5, (byte) (((int) (j2 >> 40)) & 255));
            byte[] bArr4 = this.J2;
            long j6 = this.gh;
            this.gh = j6 - 1;
            UnsafeUtil.U(bArr4, j6, (byte) (((int) (j2 >> 32)) & 255));
            byte[] bArr5 = this.J2;
            long j7 = this.gh;
            this.gh = j7 - 1;
            UnsafeUtil.U(bArr5, j7, (byte) (((int) (j2 >> 24)) & 255));
            byte[] bArr6 = this.J2;
            long j9 = this.gh;
            this.gh = j9 - 1;
            UnsafeUtil.U(bArr6, j9, (byte) (((int) (j2 >> 16)) & 255));
            byte[] bArr7 = this.J2;
            long j10 = this.gh;
            this.gh = j10 - 1;
            UnsafeUtil.U(bArr7, j10, (byte) (((int) (j2 >> 8)) & 255));
            byte[] bArr8 = this.J2;
            long j11 = this.gh;
            this.gh = j11 - 1;
            UnsafeUtil.U(bArr8, j11, (byte) (((int) j2) & 255));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void p5(int i2) {
            if ((i2 & (-128)) == 0) {
                k(i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                z(i2);
                return;
            }
            if (((-2097152) & i2) == 0) {
                dR0(i2);
            } else if (((-268435456) & i2) == 0) {
                Y(i2);
            } else {
                Nxk(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        public int qie() {
            return this.nr + M();
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed32(int i2, int i3) {
            Ik(9);
            WPU(i3);
            Xw(i2, 5);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeFixed64(int i2, long j2) {
            Ik(13);
            nY(j2);
            Xw(i2, 1);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeInt32(int i2, int i3) {
            Ik(15);
            E2(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt32(int i2, int i3) {
            Ik(10);
            nHg(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeSInt64(int i2, long j2) {
            Ik(15);
            v(j2);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt32(int i2, int i3) {
            Ik(10);
            p5(i3);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeUInt64(int i2, long j2) {
            Ik(15);
            eF(j2);
            Xw(i2, 0);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            if (a() >= i3) {
                this.gh -= (long) i3;
                System.arraycopy(bArr, i2, this.J2, E() + 1, i3);
            } else {
                this.nr += i3;
                this.f37727t.addFirst(AllocatedBuffer.gh(bArr, i2, i3));
                B();
            }
        }

        private void B() {
            D(HI());
        }

        private void D(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.t()) {
                FX();
                this.f37727t.addFirst(allocatedBuffer);
                this.f37732O = allocatedBuffer;
                this.J2 = allocatedBuffer.n();
                long jRl = allocatedBuffer.rl();
                this.KN = ((long) allocatedBuffer.O()) + jRl;
                long jUo = jRl + ((long) allocatedBuffer.Uo());
                this.Uo = jUo;
                this.xMQ = jUo - 1;
                long j2 = this.KN - 1;
                this.mUb = j2;
                this.gh = j2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void J(int i2) {
            D(ck(i2));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void GR(String str) {
            char cCharAt;
            Ik(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.J2;
                long j2 = this.gh;
                this.gh = j2 - 1;
                UnsafeUtil.U(bArr, j2, (byte) cCharAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128) {
                        long j3 = this.gh;
                        if (j3 > this.xMQ) {
                            byte[] bArr2 = this.J2;
                            this.gh = j3 - 1;
                            UnsafeUtil.U(bArr2, j3, (byte) cCharAt2);
                        } else if (cCharAt2 < 2048) {
                            long j4 = this.gh;
                            if (j4 > this.Uo) {
                                byte[] bArr3 = this.J2;
                                this.gh = j4 - 1;
                                UnsafeUtil.U(bArr3, j4, (byte) ((cCharAt2 & '?') | 128));
                                byte[] bArr4 = this.J2;
                                long j5 = this.gh;
                                this.gh = j5 - 1;
                                UnsafeUtil.U(bArr4, j5, (byte) ((cCharAt2 >>> 6) | 960));
                            } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                                long j6 = this.gh;
                                if (j6 > this.Uo + 1) {
                                    byte[] bArr5 = this.J2;
                                    this.gh = j6 - 1;
                                    UnsafeUtil.U(bArr5, j6, (byte) ((cCharAt2 & '?') | 128));
                                    byte[] bArr6 = this.J2;
                                    long j7 = this.gh;
                                    this.gh = j7 - 1;
                                    UnsafeUtil.U(bArr6, j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                                    byte[] bArr7 = this.J2;
                                    long j9 = this.gh;
                                    this.gh = j9 - 1;
                                    UnsafeUtil.U(bArr7, j9, (byte) ((cCharAt2 >>> '\f') | 480));
                                } else {
                                    if (this.gh > this.Uo + 2) {
                                        if (length != 0) {
                                            char cCharAt3 = str.charAt(length - 1);
                                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                                length--;
                                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                                byte[] bArr8 = this.J2;
                                                long j10 = this.gh;
                                                this.gh = j10 - 1;
                                                UnsafeUtil.U(bArr8, j10, (byte) ((codePoint & 63) | 128));
                                                byte[] bArr9 = this.J2;
                                                long j11 = this.gh;
                                                this.gh = j11 - 1;
                                                UnsafeUtil.U(bArr9, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                                byte[] bArr10 = this.J2;
                                                long j12 = this.gh;
                                                this.gh = j12 - 1;
                                                UnsafeUtil.U(bArr10, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                                byte[] bArr11 = this.J2;
                                                long j13 = this.gh;
                                                this.gh = j13 - 1;
                                                UnsafeUtil.U(bArr11, j13, (byte) ((codePoint >>> 18) | 240));
                                            }
                                        }
                                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                    }
                                    Ik(length);
                                    length++;
                                }
                            }
                        }
                    }
                    length--;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Ik(int i2) {
            if (a() < i2) {
                J(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (a() < iRemaining) {
                this.nr += iRemaining;
                this.f37727t.addFirst(AllocatedBuffer.xMQ(byteBuffer));
                B();
            }
            this.gh -= (long) iRemaining;
            byteBuffer.get(this.J2, E() + 1, iRemaining);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void Xw(int i2, int i3) {
            p5(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void eF(long j2) {
            switch (BinaryWriter.gh(j2)) {
                case 1:
                    xg(j2);
                    break;
                case 2:
                    G7(j2);
                    break;
                case 3:
                    Mx(j2);
                    break;
                case 4:
                    m(j2);
                    break;
                case 5:
                    ijL(j2);
                    break;
                case 6:
                    ofS(j2);
                    break;
                case 7:
                    pJg(j2);
                    break;
                case 8:
                    piY(j2);
                    break;
                case 9:
                    eTf(j2);
                    break;
                case 10:
                    C(j2);
                    break;
            }
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void nHg(int i2) {
            p5(CodedOutputStream.k(i2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void rl(int i2, ByteString byteString) {
            try {
                byteString.rV9(this);
                Ik(10);
                p5(byteString.size());
                Xw(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void t(int i2, Object obj, Schema schema) {
            int iQie = qie();
            schema.rl(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.BinaryWriter
        void v(long j2) {
            eF(CodedOutputStream.dR0(j2));
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeMessage(int i2, Object obj) {
            int iQie = qie();
            Protobuf.n().O(obj, this);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }

        @Override // androidx.content.preferences.protobuf.Writer
        public void writeString(int i2, String str) {
            int iQie = qie();
            GR(str);
            int iQie2 = qie() - iQie;
            Ik(10);
            p5(iQie2);
            Xw(i2, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte gh(long j2) {
        byte b2;
        if (((-128) & j2) == 0) {
            return (byte) 1;
        }
        if (j2 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j2) != 0) {
            b2 = (byte) 6;
            j2 >>>= 28;
        } else {
            b2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            b2 = (byte) (b2 + 2);
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? (byte) (b2 + 1) : b2;
    }

    abstract void E2(int i2);

    abstract void Ik(int i2);

    abstract void WPU(int i2);

    abstract void Xw(int i2, int i3);

    abstract void eF(long j2);

    abstract void nHg(int i2);

    abstract void nY(long j2);

    abstract void p5(int i2);

    public abstract int qie();

    abstract void r(boolean z2);

    abstract void v(long j2);

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) {
        Xw(1, 4);
        if (obj instanceof ByteString) {
            rl(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i2);
        Xw(1, 3);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37728n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37728n = iArr;
            try {
                iArr[WireFormat.FieldType.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37728n[WireFormat.FieldType.f38217g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37728n[WireFormat.FieldType.f38211S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37728n[WireFormat.FieldType.f38215Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37728n[WireFormat.FieldType.f38219r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37728n[WireFormat.FieldType.jB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37728n[WireFormat.FieldType.f38213U.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37728n[WireFormat.FieldType.P5.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37728n[WireFormat.FieldType.M7.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37728n[WireFormat.FieldType.f38216e.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37728n[WireFormat.FieldType.f38220v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37728n[WireFormat.FieldType.f38218o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37728n[WireFormat.FieldType.J2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37728n[WireFormat.FieldType.f38210O.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37728n[WireFormat.FieldType.f38212T.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37728n[WireFormat.FieldType.f38209N.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37728n[WireFormat.FieldType.Xw.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private void M7(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(i2, ((Long) list.get(size)).longValue());
            }
            return;
        }
        Ik((list.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            eF(((Long) list.get(size2)).longValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    static final void N(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.f37728n[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i2, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i2, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i2, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i2, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i2, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i2, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i2, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i2, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i2, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i2, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i2, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i2, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i2, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i2, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i2, obj);
                return;
            case 16:
                writer.rl(i2, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i2, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(i2, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void P5(int i2, LongArrayList longArrayList, boolean z2) {
        if (!z2) {
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeUInt64(i2, longArrayList.getLong(size));
            }
            return;
        }
        Ik((longArrayList.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            eF(longArrayList.getLong(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void S(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(i2, ((Double) list.get(size)).doubleValue());
            }
            return;
        }
        Ik((list.size() * 8) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            nY(Double.doubleToRawLongBits(((Double) list.get(size2)).doubleValue()));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void T(int i2, Object obj) {
        if (obj instanceof String) {
            writeString(i2, (String) obj);
        } else {
            rl(i2, (ByteString) obj);
        }
    }

    private void U(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(i2, ((Integer) list.get(size)).intValue());
            }
            return;
        }
        Ik((list.size() * 5) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            p5(((Integer) list.get(size2)).intValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void ViF(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(i2, ((Integer) list.get(size)).intValue());
            }
            return;
        }
        Ik((list.size() * 4) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            WPU(((Integer) list.get(size2)).intValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void X(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(i2, ((Integer) list.get(size)).intValue());
            }
            return;
        }
        Ik((list.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            E2(((Integer) list.get(size2)).intValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void XQ(int i2, DoubleArrayList doubleArrayList, boolean z2) {
        if (!z2) {
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeDouble(i2, doubleArrayList.getDouble(size));
            }
            return;
        }
        Ik((doubleArrayList.size() * 8) + 10);
        int iQie = qie();
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            nY(Double.doubleToRawLongBits(doubleArrayList.getDouble(size2)));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void Z(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(i2, ((Boolean) list.get(size)).booleanValue());
            }
            return;
        }
        Ik(list.size() + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            r(((Boolean) list.get(size2)).booleanValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void aYN(int i2, IntArrayList intArrayList, boolean z2) {
        if (!z2) {
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(i2, intArrayList.getInt(size));
            }
            return;
        }
        Ik((intArrayList.size() * 4) + 10);
        int iQie = qie();
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            WPU(intArrayList.getInt(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void bzg(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(i2, ((Long) list.get(size)).longValue());
            }
            return;
        }
        Ik((list.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            v(((Long) list.get(size2)).longValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void e(int i2, IntArrayList intArrayList, boolean z2) {
        if (!z2) {
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(i2, intArrayList.getInt(size));
            }
            return;
        }
        Ik((intArrayList.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            E2(intArrayList.getInt(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void fD(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(i2, ((Float) list.get(size)).floatValue());
            }
            return;
        }
        Ik((list.size() * 4) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            WPU(Float.floatToRawIntBits(((Float) list.get(size2)).floatValue()));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void g(int i2, LongArrayList longArrayList, boolean z2) {
        if (!z2) {
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(i2, longArrayList.getLong(size));
            }
            return;
        }
        Ik((longArrayList.size() * 8) + 10);
        int iQie = qie();
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            nY(longArrayList.getLong(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void iF(int i2, FloatArrayList floatArrayList, boolean z2) {
        if (!z2) {
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFloat(i2, floatArrayList.getFloat(size));
            }
            return;
        }
        Ik((floatArrayList.size() * 4) + 10);
        int iQie = qie();
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            WPU(Float.floatToRawIntBits(floatArrayList.getFloat(size2)));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void jB(int i2, IntArrayList intArrayList, boolean z2) {
        if (!z2) {
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeUInt32(i2, intArrayList.getInt(size));
            }
            return;
        }
        Ik((intArrayList.size() * 5) + 10);
        int iQie = qie();
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            p5(intArrayList.getInt(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void o(int i2, BooleanArrayList booleanArrayList, boolean z2) {
        if (!z2) {
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(i2, booleanArrayList.getBoolean(size));
            }
            return;
        }
        Ik(booleanArrayList.size() + 10);
        int iQie = qie();
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            r(booleanArrayList.getBoolean(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void rV9(int i2, LongArrayList longArrayList, boolean z2) {
        if (!z2) {
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(i2, longArrayList.getLong(size));
            }
            return;
        }
        Ik((longArrayList.size() * 10) + 10);
        int iQie = qie();
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            v(longArrayList.getLong(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void s7N(int i2, IntArrayList intArrayList, boolean z2) {
        if (!z2) {
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(i2, intArrayList.getInt(size));
            }
            return;
        }
        Ik((intArrayList.size() * 5) + 10);
        int iQie = qie();
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            nHg(intArrayList.getInt(size2));
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void te(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(i2, ((Long) list.get(size)).longValue());
            }
            return;
        }
        Ik((list.size() * 8) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            nY(((Long) list.get(size2)).longValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    private void wTp(int i2, List list, boolean z2) {
        if (!z2) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(i2, ((Integer) list.get(size)).intValue());
            }
            return;
        }
        Ik((list.size() * 5) + 10);
        int iQie = qie();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            nHg(((Integer) list.get(size2)).intValue());
        }
        p5(qie() - iQie);
        Xw(i2, 2);
    }

    final AllocatedBuffer HI() {
        return this.f37726n.rl(this.rl);
    }

    final AllocatedBuffer az() {
        return this.f37726n.n(this.rl);
    }

    final AllocatedBuffer ck(int i2) {
        return this.f37726n.rl(Math.max(i2, this.rl));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    final AllocatedBuffer ty(int i2) {
        return this.f37726n.n(Math.max(i2, this.rl));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeBoolList(int i2, List list, boolean z2) {
        if (list instanceof BooleanArrayList) {
            o(i2, (BooleanArrayList) list, z2);
        } else {
            Z(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeDoubleList(int i2, List list, boolean z2) {
        if (list instanceof DoubleArrayList) {
            XQ(i2, (DoubleArrayList) list, z2);
        } else {
            S(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeFixed32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            aYN(i2, (IntArrayList) list, z2);
        } else {
            ViF(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeFixed64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            g(i2, (LongArrayList) list, z2);
        } else {
            te(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeFloatList(int i2, List list, boolean z2) {
        if (list instanceof FloatArrayList) {
            iF(i2, (FloatArrayList) list, z2);
        } else {
            fD(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            e(i2, (IntArrayList) list, z2);
        } else {
            X(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            s7N(i2, (IntArrayList) list, z2);
        } else {
            wTp(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSInt64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            rV9(i2, (LongArrayList) list, z2);
        } else {
            bzg(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeStringList(int i2, List list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i2, (String) list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            T(i2, lazyStringList.getRaw(size2));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeUInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            jB(i2, (IntArrayList) list, z2);
        } else {
            U(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeUInt64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            P5(i2, (LongArrayList) list, z2);
        } else {
            M7(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void J2(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            t(i2, list.get(size), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void n(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            O(i2, list.get(size), schema);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void nr(int i2, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int iQie = qie();
            N(this, 2, metadata.f38085t, entry.getValue());
            N(this, 1, metadata.f38084n, entry.getKey());
            p5(qie() - iQie);
            Xw(i2, 2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeBytesList(int i2, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            rl(i2, (ByteString) list.get(size));
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeDouble(int i2, double d2) {
        writeFixed64(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeEnum(int i2, int i3) {
        writeInt32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeEnumList(int i2, List list, boolean z2) {
        writeInt32List(i2, list, z2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeFloat(int i2, float f3) {
        writeFixed32(i2, Float.floatToRawIntBits(f3));
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeInt64(int i2, long j2) {
        writeUInt64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeInt64List(int i2, List list, boolean z2) {
        writeUInt64List(i2, list, z2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSFixed32(int i2, int i3) {
        writeFixed32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSFixed32List(int i2, List list, boolean z2) {
        writeFixed32List(i2, list, z2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSFixed64(int i2, long j2) {
        writeFixed64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeSFixed64List(int i2, List list, boolean z2) {
        writeFixed64List(i2, list, z2);
    }
}
