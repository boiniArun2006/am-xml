package androidx.content.preferences.protobuf;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
abstract class AllocatedBuffer {
    public static AllocatedBuffer mUb(byte[] bArr) {
        return qie(bArr, 0, bArr.length);
    }

    public abstract ByteBuffer J2();

    public abstract AllocatedBuffer KN(int i2);

    public abstract int O();

    public abstract int Uo();

    public abstract byte[] n();

    public abstract boolean nr();

    public abstract int rl();

    public abstract boolean t();

    public static AllocatedBuffer gh(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        return qie(bArr, i2, i3);
    }

    private static AllocatedBuffer qie(final byte[] bArr, final int i2, final int i3) {
        return new AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.2

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f37711n;

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public boolean nr() {
                return false;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public boolean t() {
                return true;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public ByteBuffer J2() {
                throw new UnsupportedOperationException();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer KN(int i5) {
                if (i5 >= 0 && i5 <= i3) {
                    this.f37711n = i5;
                    return this;
                }
                throw new IllegalArgumentException("Invalid position: " + i5);
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int O() {
                return i3;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int Uo() {
                return this.f37711n;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public byte[] n() {
                return bArr;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int rl() {
                return i2;
            }
        };
    }

    public static AllocatedBuffer xMQ(final ByteBuffer byteBuffer) {
        Internal.rl(byteBuffer, V8ValueTypedArray.PROPERTY_BUFFER);
        return new AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.1
            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public boolean nr() {
                return true;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public ByteBuffer J2() {
                return byteBuffer;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer KN(int i2) {
                Java8Compatibility.t(byteBuffer, i2);
                return this;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int O() {
                return byteBuffer.limit();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int Uo() {
                return byteBuffer.position();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public byte[] n() {
                return byteBuffer.array();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public int rl() {
                return byteBuffer.arrayOffset();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public boolean t() {
                return byteBuffer.hasArray();
            }
        };
    }

    AllocatedBuffer() {
    }
}
