package Be4;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: renamed from: Be4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1311z extends ForwardingSource {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Buffer f586n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f585t = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ByteString f584O = ByteString.INSTANCE.decodeHex("0021F904");

    /* JADX INFO: renamed from: Be4.z$j */
    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private final long indexOf(ByteString byteString) {
        long jIndexOf = -1;
        while (true) {
            jIndexOf = this.f586n.indexOf(byteString.getByte(0), jIndexOf + 1);
            if (jIndexOf == -1 || (request(byteString.size()) && this.f586n.rangeEquals(jIndexOf, byteString))) {
                break;
            }
        }
        return jIndexOf;
    }

    private final long n(Buffer buffer, long j2) {
        return RangesKt.coerceAtLeast(this.f586n.read(buffer, j2), 0L);
    }

    private final boolean request(long j2) {
        if (this.f586n.size() >= j2) {
            return true;
        }
        long size = j2 - this.f586n.size();
        return super.read(this.f586n, size) == size;
    }

    public C1311z(Source source) {
        super(source);
        this.f586n = new Buffer();
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer buffer, long j2) throws EOFException {
        request(j2);
        if (this.f586n.size() == 0) {
            if (j2 == 0) {
                return 0L;
            }
            return -1L;
        }
        long jN = 0;
        while (true) {
            long jIndexOf = indexOf(f584O);
            if (jIndexOf == -1) {
                break;
            }
            jN += n(buffer, jIndexOf + ((long) 4));
            if (request(5L) && this.f586n.getByte(4L) == 0 && (((UByte.m331constructorimpl(this.f586n.getByte(2L)) & UByte.MAX_VALUE) << 8) | (UByte.m331constructorimpl(this.f586n.getByte(1L)) & UByte.MAX_VALUE)) < 2) {
                buffer.writeByte((int) this.f586n.getByte(0L));
                buffer.writeByte(10);
                buffer.writeByte(0);
                this.f586n.skip(3L);
            }
        }
        if (jN < j2) {
            jN += n(buffer, j2 - jN);
        }
        if (jN == 0) {
            return -1L;
        }
        return jN;
    }
}
