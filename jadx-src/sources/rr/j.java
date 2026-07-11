package rr;

import as.fuX;
import as.o;
import com.caoccao.javet.utils.Float16;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73132n = new j();

    public final ByteBuffer n(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!Intrinsics.areEqual(buffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            throw new IllegalArgumentException(("The given buffer must be ordered as little endian, found " + buffer.order() + '.').toString());
        }
        int iT = as.j.f43098n.t();
        if (!v9.n.xMQ(buffer, iT)) {
            throw new IllegalArgumentException(("Buffer bytes must be a multiple of " + ((Object) o.J2(iT)) + ", found: " + buffer.remaining()).toString());
        }
        int iT2 = fuX.t(v9.n.KN(buffer), iT);
        ByteBuffer byteBufferT = n.t(iT2);
        ByteBuffer byteBufferAsReadOnlyBuffer = buffer.asReadOnlyBuffer();
        for (int i2 = 0; i2 < iT2; i2++) {
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 1);
            byteBufferT.put(byteBufferAsReadOnlyBuffer.get());
            byteBufferT.put(byteBufferAsReadOnlyBuffer.get());
        }
        byteBufferT.position(0);
        return byteBufferT;
    }

    public final ByteBuffer nr(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iT = fuX.t(v9.n.KN(buffer), as.j.f43098n.J2());
        ByteBuffer byteBufferT = n.t(iT);
        ByteBuffer byteBufferOrder = buffer.asReadOnlyBuffer().order(buffer.order());
        for (int i2 = 0; i2 < iT; i2++) {
            byteBufferT.putShort((short) (byteBufferOrder.getFloat() * Float16.EXPONENT_SIGNIFICAND_MASK));
        }
        byteBufferT.position(0);
        return byteBufferT;
    }

    public final ByteBuffer rl(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!Intrinsics.areEqual(buffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            throw new IllegalArgumentException(("The given buffer must be ordered as little endian, found " + buffer.order() + '.').toString());
        }
        int iT = fuX.t(v9.n.KN(buffer), as.j.f43098n.nr());
        ByteBuffer byteBufferT = n.t(iT);
        ByteBuffer byteBufferAsReadOnlyBuffer = buffer.asReadOnlyBuffer();
        for (int i2 = 0; i2 < iT; i2++) {
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 2);
            byteBufferT.put(byteBufferAsReadOnlyBuffer.get());
            byteBufferT.put(byteBufferAsReadOnlyBuffer.get());
        }
        byteBufferT.position(0);
        return byteBufferT;
    }

    public final ByteBuffer t(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iT = fuX.t(v9.n.KN(buffer), as.j.f43098n.O());
        ByteBuffer byteBufferT = n.t(iT);
        ByteBuffer byteBufferN = v9.n.n(buffer);
        for (int i2 = 0; i2 < iT; i2++) {
            byteBufferT.putShort((short) (((UByte.m331constructorimpl(byteBufferN.get()) & UByte.MAX_VALUE) - (n.f73133n / 2)) * n.f73133n));
        }
        byteBufferT.position(0);
        return byteBufferT;
    }

    private j() {
    }
}
