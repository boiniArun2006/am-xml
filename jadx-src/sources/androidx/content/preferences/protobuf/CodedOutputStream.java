package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Utf8;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CodedOutputStreamWriter f37769n;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f37768t = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean nr = UnsafeUtil.nHg();

    private static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final int J2;
        int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final byte[] f37770O;
        int Uo;

        AbstractBufferedEncoder(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.f37770O = bArr;
            this.J2 = bArr.length;
        }

        final void F(byte b2) {
            byte[] bArr = this.f37770O;
            int i2 = this.Uo;
            this.Uo = i2 + 1;
            bArr[i2] = b2;
            this.KN++;
        }

        final void QZ6(int i2) {
            byte[] bArr = this.f37770O;
            int i3 = this.Uo;
            int i5 = i3 + 1;
            this.Uo = i5;
            bArr[i3] = (byte) (i2 & 255);
            int i7 = i3 + 2;
            this.Uo = i7;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            int i8 = i3 + 3;
            this.Uo = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.Uo = i3 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
            this.KN += 4;
        }

        final void VwL(int i2) {
            if (i2 >= 0) {
                T3L(i2);
            } else {
                Bu(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int pJg() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void tFV(long j2) {
            byte[] bArr = this.f37770O;
            int i2 = this.Uo;
            int i3 = i2 + 1;
            this.Uo = i3;
            bArr[i2] = (byte) (j2 & 255);
            int i5 = i2 + 2;
            this.Uo = i5;
            bArr[i3] = (byte) ((j2 >> 8) & 255);
            int i7 = i2 + 3;
            this.Uo = i7;
            bArr[i5] = (byte) ((j2 >> 16) & 255);
            int i8 = i2 + 4;
            this.Uo = i8;
            bArr[i7] = (byte) (255 & (j2 >> 24));
            int i9 = i2 + 5;
            this.Uo = i9;
            bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
            int i10 = i2 + 6;
            this.Uo = i10;
            bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
            int i11 = i2 + 7;
            this.Uo = i11;
            bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
            this.Uo = i2 + 8;
            bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
            this.KN += 8;
        }

        final void Bu(long j2) {
            if (CodedOutputStream.nr) {
                long j3 = this.Uo;
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f37770O;
                    int i2 = this.Uo;
                    this.Uo = i2 + 1;
                    UnsafeUtil.U(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f37770O;
                int i3 = this.Uo;
                this.Uo = i3 + 1;
                UnsafeUtil.U(bArr2, i3, (byte) j2);
                this.KN += (int) (((long) this.Uo) - j3);
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.f37770O;
                int i5 = this.Uo;
                this.Uo = i5 + 1;
                bArr3[i5] = (byte) ((((int) j2) | 128) & 255);
                this.KN++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f37770O;
            int i7 = this.Uo;
            this.Uo = i7 + 1;
            bArr4[i7] = (byte) j2;
            this.KN++;
        }

        final void T3L(int i2) {
            if (CodedOutputStream.nr) {
                long j2 = this.Uo;
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f37770O;
                    int i3 = this.Uo;
                    this.Uo = i3 + 1;
                    UnsafeUtil.U(bArr, i3, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f37770O;
                int i5 = this.Uo;
                this.Uo = i5 + 1;
                UnsafeUtil.U(bArr2, i5, (byte) i2);
                this.KN += (int) (((long) this.Uo) - j2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.f37770O;
                int i7 = this.Uo;
                this.Uo = i7 + 1;
                bArr3[i7] = (byte) ((i2 | 128) & 255);
                this.KN++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f37770O;
            int i8 = this.Uo;
            this.Uo = i8 + 1;
            bArr4[i8] = (byte) i2;
            this.KN++;
        }

        final void mI(int i2, int i3) {
            T3L(WireFormat.t(i2, i3));
        }
    }

    private static class ArrayEncoder extends CodedOutputStream {
        private final int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final byte[] f37771O;
        private final int Uo;

        ArrayEncoder(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException(V8ValueTypedArray.PROPERTY_BUFFER);
            }
            int i5 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f37771O = bArr;
            this.J2 = i2;
            this.KN = i2;
            this.Uo = i5;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void EWS(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(i2, 2);
            UhV(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void K(int i2, ByteString byteString) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            rl(3, byteString);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        final void hRu(int i2, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            W(i2, 2);
            RQ(((AbstractMessageLite) messageLite).nr(schema));
            schema.rl(messageLite, this.f37769n);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void i(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            EWS(3, messageLite);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void rl(int i2, ByteString byteString) throws OutOfSpaceException {
            W(i2, 2);
            fcU(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) throws OutOfSpaceException {
            W(i2, 0);
            ofS(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 5);
            n1(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 1);
            Jk(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            GD(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws OutOfSpaceException {
            W(i2, 2);
            kSg(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            RQ(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 0);
            a63(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z() {
        }

        public final int F() {
            return this.KN - this.J2;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void GD(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                RQ(i2);
            } else {
                a63(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void Jk(long j2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37771O;
                int i2 = this.KN;
                int i3 = i2 + 1;
                this.KN = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i5 = i2 + 2;
                this.KN = i5;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i7 = i2 + 3;
                this.KN = i7;
                bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
                int i8 = i2 + 4;
                this.KN = i8;
                bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
                int i9 = i2 + 5;
                this.KN = i9;
                bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
                int i10 = i2 + 6;
                this.KN = i10;
                bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
                int i11 = i2 + 7;
                this.KN = i11;
                bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
                this.KN = i2 + 8;
                bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void RQ(int i2) throws OutOfSpaceException {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f37771O;
                    int i3 = this.KN;
                    this.KN = i3 + 1;
                    bArr[i3] = (byte) ((i2 | 128) & 255);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
                }
            }
            byte[] bArr2 = this.f37771O;
            int i5 = this.KN;
            this.KN = i5 + 1;
            bArr2[i5] = (byte) i2;
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void Uo(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i2, this.f37771O, this.KN, i3);
                this.KN += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), Integer.valueOf(i3)), e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void kSg(String str) throws OutOfSpaceException {
            int i2 = this.KN;
            try {
                int iGR = CodedOutputStream.GR(str.length() * 3);
                int iGR2 = CodedOutputStream.GR(str.length());
                if (iGR2 != iGR) {
                    RQ(Utf8.gh(str));
                    this.KN = Utf8.xMQ(str, this.f37771O, this.KN, pJg());
                    return;
                }
                int i3 = i2 + iGR2;
                this.KN = i3;
                int iXMQ = Utf8.xMQ(str, this.f37771O, i3, pJg());
                this.KN = i2;
                RQ((iXMQ - i2) - iGR2);
                this.KN = iXMQ;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.KN = i2;
                piY(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void n1(int i2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37771O;
                int i3 = this.KN;
                int i5 = i3 + 1;
                this.KN = i5;
                bArr[i3] = (byte) (i2 & 255);
                int i7 = i3 + 2;
                this.KN = i7;
                bArr[i5] = (byte) ((i2 >> 8) & 255);
                int i8 = i3 + 3;
                this.KN = i8;
                bArr[i7] = (byte) ((i2 >> 16) & 255);
                this.KN = i3 + 4;
                bArr[i8] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void ofS(byte b2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f37771O;
                int i2 = this.KN;
                this.KN = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final int pJg() {
            return this.Uo - this.KN;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void G7(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            RQ(i3);
            Uo(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public final void KN(ByteBuffer byteBuffer) throws OutOfSpaceException {
            QZ6(byteBuffer);
        }

        public final void QZ6(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f37771O, this.KN, iRemaining);
                this.KN += iRemaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), Integer.valueOf(iRemaining)), e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void UhV(MessageLite messageLite) throws OutOfSpaceException {
            RQ(messageLite.getSerializedSize());
            messageLite.n(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void W(int i2, int i3) throws OutOfSpaceException {
            RQ(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void a63(long j2) throws OutOfSpaceException {
            if (CodedOutputStream.nr && pJg() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f37771O;
                    int i2 = this.KN;
                    this.KN = i2 + 1;
                    UnsafeUtil.U(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f37771O;
                int i3 = this.KN;
                this.KN = i3 + 1;
                UnsafeUtil.U(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f37771O;
                    int i5 = this.KN;
                    this.KN = i5 + 1;
                    bArr3[i5] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
                }
            }
            byte[] bArr4 = this.f37771O;
            int i7 = this.KN;
            this.KN = i7 + 1;
            bArr4[i7] = (byte) j2;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public final void fcU(ByteString byteString) throws OutOfSpaceException {
            RQ(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public final void xMQ(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            Uo(bArr, i2, i3);
        }
    }

    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput xMQ;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void EWS(int i2, MessageLite messageLite) {
            W(i2, 2);
            UhV(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void K(int i2, ByteString byteString) {
            W(1, 3);
            writeUInt32(2, i2);
            rl(3, byteString);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void RQ(int i2) {
            Uf(5);
            T3L(i2);
        }

        void f(MessageLite messageLite, Schema schema) {
            RQ(((AbstractMessageLite) messageLite).nr(schema));
            schema.rl(messageLite, this.f37769n);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void hRu(int i2, MessageLite messageLite, Schema schema) {
            W(i2, 2);
            f(messageLite, schema);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i(int i2, MessageLite messageLite) {
            W(1, 3);
            writeUInt32(2, i2);
            EWS(3, messageLite);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void n1(int i2) {
            Uf(4);
            QZ6(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void rl(int i2, ByteString byteString) {
            W(i2, 2);
            fcU(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            W(i2, 2);
            kSg(str);
        }

        private void Uf(int i2) {
            if (this.J2 - this.Uo < i2) {
                p0N();
            }
        }

        private void p0N() {
            this.xMQ.Uo(this.f37770O, 0, this.Uo);
            this.Uo = 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void GD(int i2) {
            if (i2 >= 0) {
                RQ(i2);
            } else {
                a63(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Jk(long j2) {
            Uf(8);
            tFV(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void a63(long j2) {
            Uf(10);
            Bu(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void ofS(byte b2) {
            if (this.Uo == this.J2) {
                p0N();
            }
            F(b2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) {
            Uf(11);
            mI(i2, 0);
            F(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) {
            Uf(14);
            mI(i2, 5);
            QZ6(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) {
            Uf(18);
            mI(i2, 1);
            tFV(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) {
            Uf(20);
            mI(i2, 0);
            VwL(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) {
            Uf(20);
            mI(i2, 0);
            T3L(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) {
            Uf(20);
            mI(i2, 0);
            Bu(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z() {
            if (this.Uo > 0) {
                p0N();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void G7(byte[] bArr, int i2, int i3) {
            RQ(i3);
            Uo(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) {
            z();
            int iRemaining = byteBuffer.remaining();
            this.xMQ.KN(byteBuffer);
            this.KN += iRemaining;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void UhV(MessageLite messageLite) {
            RQ(messageLite.getSerializedSize());
            messageLite.n(this);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) {
            z();
            this.xMQ.Uo(bArr, i2, i3);
            this.KN += i3;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void W(int i2, int i3) {
            RQ(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void fcU(ByteString byteString) {
            RQ(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void kSg(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iGR = CodedOutputStream.GR(length);
            int i2 = iGR + length;
            int i3 = this.J2;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iXMQ = Utf8.xMQ(str, bArr, 0, length);
                RQ(iXMQ);
                xMQ(bArr, 0, iXMQ);
                return;
            }
            if (i2 > i3 - this.Uo) {
                p0N();
            }
            int i5 = this.Uo;
            try {
                int iGR2 = CodedOutputStream.GR(str.length());
                if (iGR2 == iGR) {
                    int i7 = i5 + iGR2;
                    this.Uo = i7;
                    int iXMQ2 = Utf8.xMQ(str, this.f37770O, i7, this.J2 - i7);
                    this.Uo = i5;
                    int i8 = (iXMQ2 - i5) - iGR2;
                    T3L(i8);
                    this.Uo = iXMQ2;
                    this.KN += i8;
                    return;
                }
                int iGh = Utf8.gh(str);
                T3L(iGh);
                this.Uo = Utf8.xMQ(str, this.f37770O, this.Uo, iGh);
                this.KN += iGh;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.KN -= this.Uo - i5;
                this.Uo = i5;
                piY(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) {
            z();
            this.xMQ.xMQ(bArr, i2, i3);
            this.KN += i3;
        }
    }

    private static final class HeapNioEncoder extends ArrayEncoder {
        private int mUb;
        private final ByteBuffer xMQ;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.content.preferences.protobuf.CodedOutputStream
        public void z() {
            Java8Compatibility.t(this.xMQ, this.mUb + F());
        }
    }

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream xMQ;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void EWS(int i2, MessageLite messageLite) throws IOException {
            W(i2, 2);
            UhV(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void K(int i2, ByteString byteString) throws IOException {
            W(1, 3);
            writeUInt32(2, i2);
            rl(3, byteString);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void RQ(int i2) throws IOException {
            Uf(5);
            T3L(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void hRu(int i2, MessageLite messageLite, Schema schema) throws IOException {
            W(i2, 2);
            ub(messageLite, schema);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i(int i2, MessageLite messageLite) throws IOException {
            W(1, 3);
            writeUInt32(2, i2);
            EWS(3, messageLite);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void n1(int i2) throws IOException {
            Uf(4);
            QZ6(i2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void rl(int i2, ByteString byteString) throws IOException {
            W(i2, 2);
            fcU(byteString);
        }

        void ub(MessageLite messageLite, Schema schema) throws IOException {
            RQ(((AbstractMessageLite) messageLite).nr(schema));
            schema.rl(messageLite, this.f37769n);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            W(i2, 2);
            kSg(str);
        }

        private void Uf(int i2) throws IOException {
            if (this.J2 - this.Uo < i2) {
                p0N();
            }
        }

        private void p0N() throws IOException {
            this.xMQ.write(this.f37770O, 0, this.Uo);
            this.Uo = 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void GD(int i2) throws IOException {
            if (i2 >= 0) {
                RQ(i2);
            } else {
                a63(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Jk(long j2) throws IOException {
            Uf(8);
            tFV(j2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) throws IOException {
            int i5 = this.J2;
            int i7 = this.Uo;
            if (i5 - i7 >= i3) {
                System.arraycopy(bArr, i2, this.f37770O, i7, i3);
                this.Uo += i3;
                this.KN += i3;
                return;
            }
            int i8 = i5 - i7;
            System.arraycopy(bArr, i2, this.f37770O, i7, i8);
            int i9 = i2 + i8;
            int i10 = i3 - i8;
            this.Uo = this.J2;
            this.KN += i8;
            p0N();
            if (i10 <= this.J2) {
                System.arraycopy(bArr, i9, this.f37770O, 0, i10);
                this.Uo = i10;
            } else {
                this.xMQ.write(bArr, i9, i10);
            }
            this.KN += i10;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void a63(long j2) throws IOException {
            Uf(10);
            Bu(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void ofS(byte b2) throws IOException {
            if (this.Uo == this.J2) {
                p0N();
            }
            F(b2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws IOException {
            Uf(11);
            mI(i2, 0);
            F(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            Uf(14);
            mI(i2, 5);
            QZ6(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            Uf(18);
            mI(i2, 1);
            tFV(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            Uf(20);
            mI(i2, 0);
            VwL(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            Uf(20);
            mI(i2, 0);
            T3L(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            Uf(20);
            mI(i2, 0);
            Bu(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z() throws IOException {
            if (this.Uo > 0) {
                p0N();
            }
        }

        OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.xMQ = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void G7(byte[] bArr, int i2, int i3) throws IOException {
            RQ(i3);
            Uo(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) throws IOException {
            f(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void UhV(MessageLite messageLite) throws IOException {
            RQ(messageLite.getSerializedSize());
            messageLite.n(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void W(int i2, int i3) throws IOException {
            RQ(WireFormat.t(i2, i3));
        }

        public void f(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.J2;
            int i3 = this.Uo;
            if (i2 - i3 >= iRemaining) {
                byteBuffer.get(this.f37770O, i3, iRemaining);
                this.Uo += iRemaining;
                this.KN += iRemaining;
                return;
            }
            int i5 = i2 - i3;
            byteBuffer.get(this.f37770O, i3, i5);
            int i7 = iRemaining - i5;
            this.Uo = this.J2;
            this.KN += i5;
            p0N();
            while (true) {
                int i8 = this.J2;
                if (i7 > i8) {
                    byteBuffer.get(this.f37770O, 0, i8);
                    this.xMQ.write(this.f37770O, 0, this.J2);
                    int i9 = this.J2;
                    i7 -= i9;
                    this.KN += i9;
                } else {
                    byteBuffer.get(this.f37770O, 0, i7);
                    this.Uo = i7;
                    this.KN += i7;
                    return;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void fcU(ByteString byteString) throws IOException {
            RQ(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void kSg(String str) throws IOException {
            int iGh;
            try {
                int length = str.length() * 3;
                int iGR = CodedOutputStream.GR(length);
                int i2 = iGR + length;
                int i3 = this.J2;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iXMQ = Utf8.xMQ(str, bArr, 0, length);
                    RQ(iXMQ);
                    xMQ(bArr, 0, iXMQ);
                    return;
                }
                if (i2 > i3 - this.Uo) {
                    p0N();
                }
                int iGR2 = CodedOutputStream.GR(str.length());
                int i5 = this.Uo;
                try {
                    if (iGR2 == iGR) {
                        int i7 = i5 + iGR2;
                        this.Uo = i7;
                        int iXMQ2 = Utf8.xMQ(str, this.f37770O, i7, this.J2 - i7);
                        this.Uo = i5;
                        iGh = (iXMQ2 - i5) - iGR2;
                        T3L(iGh);
                        this.Uo = iXMQ2;
                    } else {
                        iGh = Utf8.gh(str);
                        T3L(iGh);
                        this.Uo = Utf8.xMQ(str, this.f37770O, this.Uo, iGh);
                    }
                    this.KN += iGh;
                } catch (Utf8.UnpairedSurrogateException e2) {
                    this.KN -= this.Uo - i5;
                    this.Uo = i5;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (Utf8.UnpairedSurrogateException e4) {
                piY(str, e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) throws IOException {
            Uo(bArr, i2, i3);
        }
    }

    private static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ByteBuffer f37772O;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void EWS(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(i2, 2);
            UhV(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void K(int i2, ByteString byteString) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            rl(3, byteString);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void hRu(int i2, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            W(i2, 2);
            tFV(messageLite, schema);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            EWS(3, messageLite);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void rl(int i2, ByteString byteString) throws OutOfSpaceException {
            W(i2, 2);
            fcU(byteString);
        }

        void tFV(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            RQ(((AbstractMessageLite) messageLite).nr(schema));
            schema.rl(messageLite, this.f37769n);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws OutOfSpaceException {
            W(i2, 0);
            ofS(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 5);
            n1(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 1);
            Jk(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            GD(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            W(i2, 2);
            kSg(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            RQ(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 0);
            a63(j2);
        }

        private void F(String str) throws OutOfSpaceException {
            try {
                Utf8.mUb(str, this.J2);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void GD(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                RQ(i2);
            } else {
                a63(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Jk(long j2) throws OutOfSpaceException {
            try {
                this.J2.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public void QZ6(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.J2.put(byteBuffer);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void RQ(int i2) throws OutOfSpaceException {
            while ((i2 & (-128)) != 0) {
                try {
                    this.J2.put((byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
            }
            this.J2.put((byte) i2);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                this.J2.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void a63(long j2) throws OutOfSpaceException {
            while (((-128) & j2) != 0) {
                try {
                    this.J2.put((byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
            }
            this.J2.put((byte) j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void kSg(String str) throws OutOfSpaceException {
            int iPosition = this.J2.position();
            try {
                int iGR = CodedOutputStream.GR(str.length() * 3);
                int iGR2 = CodedOutputStream.GR(str.length());
                if (iGR2 != iGR) {
                    RQ(Utf8.gh(str));
                    F(str);
                    return;
                }
                int iPosition2 = this.J2.position() + iGR2;
                Java8Compatibility.t(this.J2, iPosition2);
                F(str);
                int iPosition3 = this.J2.position();
                Java8Compatibility.t(this.J2, iPosition);
                RQ(iPosition3 - iPosition2);
                Java8Compatibility.t(this.J2, iPosition3);
            } catch (Utf8.UnpairedSurrogateException e2) {
                Java8Compatibility.t(this.J2, iPosition);
                piY(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void n1(int i2) throws OutOfSpaceException {
            try {
                this.J2.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void ofS(byte b2) throws OutOfSpaceException {
            try {
                this.J2.put(b2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int pJg() {
            return this.J2.remaining();
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z() {
            Java8Compatibility.t(this.f37772O, this.J2.position());
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void G7(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            RQ(i3);
            Uo(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) throws OutOfSpaceException {
            QZ6(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void UhV(MessageLite messageLite) throws OutOfSpaceException {
            RQ(messageLite.getSerializedSize());
            messageLite.n(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void W(int i2, int i3) throws OutOfSpaceException {
            RQ(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void fcU(ByteString byteString) throws OutOfSpaceException {
            RQ(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            Uo(bArr, i2, i3);
        }
    }

    private static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer J2;
        private final long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ByteBuffer f37773O;
        private final long Uo;
        private long mUb;
        private final long xMQ;

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void EWS(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(i2, 2);
            UhV(messageLite);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void K(int i2, ByteString byteString) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            rl(3, byteString);
            W(1, 4);
        }

        void VwL(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            RQ(((AbstractMessageLite) messageLite).nr(schema));
            schema.rl(messageLite, this.f37769n);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        void hRu(int i2, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            W(i2, 2);
            VwL(messageLite, schema);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void i(int i2, MessageLite messageLite) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i2);
            EWS(3, messageLite);
            W(1, 4);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void rl(int i2, ByteString byteString) throws OutOfSpaceException {
            W(i2, 2);
            fcU(byteString);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws OutOfSpaceException {
            W(i2, 0);
            ofS(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 5);
            n1(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 1);
            Jk(j2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            GD(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            W(i2, 2);
            kSg(str);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            W(i2, 0);
            RQ(i3);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            W(i2, 0);
            a63(j2);
        }

        private int F(long j2) {
            return (int) (j2 - this.Uo);
        }

        private void QZ6(long j2) {
            Java8Compatibility.t(this.J2, F(j2));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void GD(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                RQ(i2);
            } else {
                a63(i2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void Jk(long j2) {
            this.J2.putLong(F(this.mUb), j2);
            this.mUb += 8;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void RQ(int i2) throws OutOfSpaceException {
            if (this.mUb <= this.xMQ) {
                while ((i2 & (-128)) != 0) {
                    long j2 = this.mUb;
                    this.mUb = j2 + 1;
                    UnsafeUtil.jB(j2, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                long j3 = this.mUb;
                this.mUb = 1 + j3;
                UnsafeUtil.jB(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.mUb;
                if (j4 >= this.KN) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.mUb), Long.valueOf(this.KN), 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.mUb = 1 + j4;
                    UnsafeUtil.jB(j4, (byte) i2);
                    return;
                } else {
                    this.mUb = j4 + 1;
                    UnsafeUtil.jB(j4, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void Uo(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = this.KN - j2;
                long j4 = this.mUb;
                if (j3 >= j4) {
                    UnsafeUtil.Ik(bArr, i2, j4, j2);
                    this.mUb += j2;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.mUb), Long.valueOf(this.KN), Integer.valueOf(i3)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void a63(long j2) throws OutOfSpaceException {
            if (this.mUb <= this.xMQ) {
                while ((j2 & (-128)) != 0) {
                    long j3 = this.mUb;
                    this.mUb = j3 + 1;
                    UnsafeUtil.jB(j3, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                long j4 = this.mUb;
                this.mUb = 1 + j4;
                UnsafeUtil.jB(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.mUb;
                if (j5 >= this.KN) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.mUb), Long.valueOf(this.KN), 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.mUb = 1 + j5;
                    UnsafeUtil.jB(j5, (byte) j2);
                    return;
                } else {
                    this.mUb = j5 + 1;
                    UnsafeUtil.jB(j5, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void kSg(String str) throws OutOfSpaceException {
            long j2 = this.mUb;
            try {
                int iGR = CodedOutputStream.GR(str.length() * 3);
                int iGR2 = CodedOutputStream.GR(str.length());
                if (iGR2 != iGR) {
                    int iGh = Utf8.gh(str);
                    RQ(iGh);
                    QZ6(this.mUb);
                    Utf8.mUb(str, this.J2);
                    this.mUb += (long) iGh;
                    return;
                }
                int iF = F(this.mUb) + iGR2;
                Java8Compatibility.t(this.J2, iF);
                Utf8.mUb(str, this.J2);
                int iPosition = this.J2.position() - iF;
                RQ(iPosition);
                this.mUb += (long) iPosition;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.mUb = j2;
                QZ6(j2);
                piY(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void n1(int i2) {
            this.J2.putInt(F(this.mUb), i2);
            this.mUb += 4;
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void ofS(byte b2) throws OutOfSpaceException {
            long j2 = this.mUb;
            if (j2 >= this.KN) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.mUb), Long.valueOf(this.KN), 1));
            }
            this.mUb = 1 + j2;
            UnsafeUtil.jB(j2, b2);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public int pJg() {
            return (int) (this.KN - this.mUb);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void z() {
            Java8Compatibility.t(this.f37773O, F(this.mUb));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void G7(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            RQ(i3);
            Uo(bArr, i2, i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteOutput
        public void KN(ByteBuffer byteBuffer) throws OutOfSpaceException {
            tFV(byteBuffer);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void UhV(MessageLite messageLite) throws OutOfSpaceException {
            RQ(messageLite.getSerializedSize());
            messageLite.n(this);
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void W(int i2, int i3) throws OutOfSpaceException {
            RQ(WireFormat.t(i2, i3));
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream
        public void fcU(ByteString byteString) throws OutOfSpaceException {
            RQ(byteString.size());
            byteString.v(this);
        }

        public void tFV(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                QZ6(this.mUb);
                this.J2.put(byteBuffer);
                this.mUb += (long) iRemaining;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedOutputStream, androidx.content.preferences.protobuf.ByteOutput
        public void xMQ(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            Uo(bArr, i2, i3);
        }
    }

    public static int E2(int i2) {
        return Y(i2);
    }

    public static int M7(int i2) {
        return 4;
    }

    public static int S(int i2) {
        return 4;
    }

    public static int T(int i2, LazyFieldLite lazyFieldLite) {
        return (a(1) * 2) + I(2, i2) + N(3, lazyFieldLite);
    }

    public static int U(int i2, ByteString byteString) {
        return (a(1) * 2) + I(2, i2) + HI(3, byteString);
    }

    public static int a(int i2) {
        return GR(WireFormat.t(i2, 0));
    }

    public static int aYN(long j2) {
        return 8;
    }

    public static int az(boolean z2) {
        return 1;
    }

    public static long dR0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int eF(long j2) {
        return 8;
    }

    public static CodedOutputStream eTf(byte[] bArr) {
        return xg(bArr, 0, bArr.length);
    }

    static int jB(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int k(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int nY(float f3) {
        return 4;
    }

    public static int r(double d2) {
        return 8;
    }

    public static int ty(byte[] bArr) {
        return s7N(bArr.length);
    }

    public static int wTp(int i2, MessageLite messageLite) {
        return (a(1) * 2) + I(2, i2) + v(3, messageLite);
    }

    public final void C(boolean z2) {
        ofS(z2 ? (byte) 1 : (byte) 0);
    }

    public abstract void EWS(int i2, MessageLite messageLite);

    abstract void G7(byte[] bArr, int i2, int i3);

    public abstract void GD(int i2);

    public abstract void Jk(long j2);

    public abstract void K(int i2, ByteString byteString);

    public final void Mx(byte[] bArr) {
        G7(bArr, 0, bArr.length);
    }

    public abstract void RQ(int i2);

    public abstract void UhV(MessageLite messageLite);

    public abstract void W(int i2, int i3);

    public abstract void a63(long j2);

    public abstract void fcU(ByteString byteString);

    abstract void hRu(int i2, MessageLite messageLite, Schema schema);

    public abstract void i(int i2, MessageLite messageLite);

    public abstract void kSg(String str);

    final void mYa(int i2, MessageLite messageLite, Schema schema) {
        W(i2, 3);
        HV(messageLite, schema);
        W(i2, 4);
    }

    public abstract void n1(int i2);

    public abstract void ofS(byte b2);

    public abstract int pJg();

    public final void qm(int i2, MessageLite messageLite) {
        W(i2, 3);
        Org(messageLite);
        W(i2, 4);
    }

    public abstract void rl(int i2, ByteString byteString);

    public abstract void writeBool(int i2, boolean z2);

    public abstract void writeFixed32(int i2, int i3);

    public abstract void writeFixed64(int i2, long j2);

    public abstract void writeInt32(int i2, int i3);

    public abstract void writeString(int i2, String str);

    public abstract void writeUInt32(int i2, int i3);

    public abstract void writeUInt64(int i2, long j2);

    @Override // androidx.content.preferences.protobuf.ByteOutput
    public abstract void xMQ(byte[] bArr, int i2, int i3);

    public abstract void z();

    private CodedOutputStream() {
    }

    static int Xw(MessageLite messageLite, Schema schema) {
        return s7N(((AbstractMessageLite) messageLite).nr(schema));
    }

    static int iF(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).nr(schema);
    }

    public static CodedOutputStream m(OutputStream outputStream, int i2) {
        return new OutputStreamEncoder(outputStream, i2);
    }

    public static CodedOutputStream xg(byte[] bArr, int i2, int i3) {
        return new ArrayEncoder(bArr, i2, i3);
    }

    final void HV(MessageLite messageLite, Schema schema) {
        schema.rl(messageLite, this.f37769n);
    }

    boolean ijL() {
        return this.rl;
    }

    final void piY(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        f37768t.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.rl);
        try {
            RQ(bytes.length);
            xMQ(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public static int B(long j2) {
        return Y(dR0(j2));
    }

    public static int D(String str) {
        int length;
        try {
            length = Utf8.gh(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.rl).length;
        }
        return s7N(length);
    }

    public static int E(int i2, int i3) {
        return a(i2) + M(i3);
    }

    public static int FX(int i2, long j2) {
        return a(i2) + B(j2);
    }

    public static int GR(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int HI(int i2, ByteString byteString) {
        return a(i2) + ck(byteString);
    }

    public static int I(int i2, int i3) {
        return a(i2) + GR(i3);
    }

    public static int Ik(int i2, double d2) {
        return a(i2) + r(d2);
    }

    public static int J(int i2, String str) {
        return a(i2) + D(str);
    }

    public static int M(int i2) {
        return GR(k(i2));
    }

    public static int N(int i2, LazyFieldLite lazyFieldLite) {
        return a(i2) + nHg(lazyFieldLite);
    }

    public static int Nxk(int i2, long j2) {
        return a(i2) + Y(j2);
    }

    public static int P5(int i2, int i3) {
        return a(i2) + M7(i3);
    }

    public static int ViF(int i2, float f3) {
        return a(i2) + nY(f3);
    }

    public static int WPU(int i2, long j2) {
        return a(i2) + aYN(j2);
    }

    public static int X(long j2) {
        return Y(j2);
    }

    public static int XQ(int i2, int i3) {
        return a(i2) + S(i3);
    }

    public static int Y(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int Z(int i2) {
        return E2(i2);
    }

    public static int bzg(MessageLite messageLite) {
        return s7N(messageLite.getSerializedSize());
    }

    public static int ck(ByteString byteString) {
        return s7N(byteString.size());
    }

    public static int e(int i2, long j2) {
        return a(i2) + X(j2);
    }

    public static int fD(int i2, int i3) {
        return a(i2) + E2(i3);
    }

    static int g(int i2, MessageLite messageLite, Schema schema) {
        return (a(i2) * 2) + iF(messageLite, schema);
    }

    public static int nHg(LazyFieldLite lazyFieldLite) {
        return s7N(lazyFieldLite.rl());
    }

    public static int o(int i2, int i3) {
        return a(i2) + Z(i3);
    }

    public static int p5(int i2, long j2) {
        return a(i2) + eF(j2);
    }

    public static int qie(int i2, boolean z2) {
        return a(i2) + az(z2);
    }

    static int rV9(int i2, MessageLite messageLite, Schema schema) {
        return a(i2) + Xw(messageLite, schema);
    }

    static int s7N(int i2) {
        return GR(i2) + i2;
    }

    public static int te(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int v(int i2, MessageLite messageLite) {
        return a(i2) + bzg(messageLite);
    }

    public final void ER(int i2) {
        RQ(k(i2));
    }

    public final void How(int i2) {
        n1(i2);
    }

    public final void Org(MessageLite messageLite) {
        messageLite.n(this);
    }

    public final void Po6(long j2) {
        a63(j2);
    }

    public final void Rl(float f3) {
        n1(Float.floatToRawIntBits(f3));
    }

    public final void eWT(double d2) {
        Jk(Double.doubleToRawLongBits(d2));
    }

    public final void gh() {
        if (pJg() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void lLA(long j2) {
        a63(dR0(j2));
    }

    public final void tUK(long j2) {
        Jk(j2);
    }

    public final void ul(int i2) {
        GD(i2);
    }

    public final void writeDouble(int i2, double d2) {
        writeFixed64(i2, Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i2, int i3) {
        writeInt32(i2, i3);
    }

    public final void writeFloat(int i2, float f3) {
        writeFixed32(i2, Float.floatToRawIntBits(f3));
    }

    public final void writeInt64(int i2, long j2) {
        writeUInt64(i2, j2);
    }

    public final void writeSFixed32(int i2, int i3) {
        writeFixed32(i2, i3);
    }

    public final void writeSFixed64(int i2, long j2) {
        writeFixed64(i2, j2);
    }

    public final void writeSInt32(int i2, int i3) {
        writeUInt32(i2, k(i3));
    }

    public final void writeSInt64(int i2, long j2) {
        writeUInt64(i2, dR0(j2));
    }
}
