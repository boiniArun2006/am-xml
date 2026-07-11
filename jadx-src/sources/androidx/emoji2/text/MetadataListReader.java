package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AnyThread
@RequiresApi
@RestrictTo
class MetadataListReader {

    private static class ByteBufferReader implements OpenTypeReader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ByteBuffer f38349n;

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.f38349n.position();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int n() {
            return this.f38349n.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() {
            return MetadataListReader.nr(this.f38349n.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long rl() {
            return MetadataListReader.t(this.f38349n.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i2) {
            ByteBuffer byteBuffer = this.f38349n;
            byteBuffer.position(byteBuffer.position() + i2);
        }

        ByteBufferReader(ByteBuffer byteBuffer) {
            this.f38349n = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    private static class InputStreamOpenTypeReader implements OpenTypeReader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final byte[] f38350n;
        private long nr;
        private final ByteBuffer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final InputStream f38351t;

        private void t(int i2) throws IOException {
            if (this.f38351t.read(this.f38350n, 0, i2) != i2) {
                throw new IOException("read failed");
            }
            this.nr += (long) i2;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.nr;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int n() throws IOException {
            this.rl.position(0);
            t(4);
            return this.rl.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            this.rl.position(0);
            t(2);
            return MetadataListReader.nr(this.rl.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long rl() throws IOException {
            this.rl.position(0);
            t(4);
            return MetadataListReader.t(this.rl.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i2) throws IOException {
            while (i2 > 0) {
                int iSkip = (int) this.f38351t.skip(i2);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i2 -= iSkip;
                this.nr += (long) iSkip;
            }
        }
    }

    private static class OffsetInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f38352n;
        private final long rl;

        long n() {
            return this.f38352n;
        }

        OffsetInfo(long j2, long j3) {
            this.f38352n = j2;
            this.rl = j3;
        }
    }

    private interface OpenTypeReader {
        long getPosition();

        int n();

        int readUnsignedShort();

        long rl();

        void skip(int i2);
    }

    private static OffsetInfo n(OpenTypeReader openTypeReader) throws IOException {
        long jRl;
        openTypeReader.skip(4);
        int unsignedShort = openTypeReader.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        openTypeReader.skip(6);
        int i2 = 0;
        while (true) {
            if (i2 >= unsignedShort) {
                jRl = -1;
                break;
            }
            int iN = openTypeReader.n();
            openTypeReader.skip(4);
            jRl = openTypeReader.rl();
            openTypeReader.skip(4);
            if (1835365473 == iN) {
                break;
            }
            i2++;
        }
        if (jRl != -1) {
            openTypeReader.skip((int) (jRl - openTypeReader.getPosition()));
            openTypeReader.skip(12);
            long jRl2 = openTypeReader.rl();
            for (int i3 = 0; i3 < jRl2; i3++) {
                int iN2 = openTypeReader.n();
                long jRl3 = openTypeReader.rl();
                long jRl4 = openTypeReader.rl();
                if (1164798569 == iN2 || 1701669481 == iN2) {
                    return new OffsetInfo(jRl3 + jRl, jRl4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static int nr(short s2) {
        return s2 & UShort.MAX_VALUE;
    }

    static long t(int i2) {
        return ((long) i2) & 4294967295L;
    }

    static MetadataList rl(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) n(new ByteBufferReader(byteBufferDuplicate)).n());
        return MetadataList.xMQ(byteBufferDuplicate);
    }
}
