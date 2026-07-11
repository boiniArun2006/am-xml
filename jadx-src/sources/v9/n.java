package v9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final void HI(ByteBuffer limit, int i2) {
        Intrinsics.checkNotNullParameter(limit, "$this$limit");
        limit.limit(i2);
    }

    public static final int J2(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return w9.Ml.J2(byteBuffer.limit());
    }

    public static final int KN(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return w9.w6.J2(byteBuffer.remaining());
    }

    public static /* synthetic */ ByteBuffer O(int i2, ByteOrder byteOrder, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            byteOrder = ByteOrder.nativeOrder();
            Intrinsics.checkNotNullExpressionValue(byteOrder, "nativeOrder()");
        }
        return nr(i2, byteOrder);
    }

    public static final int Uo(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return w9.Ml.J2(byteBuffer.position());
    }

    public static final ByteBuffer az(ByteBuffer paddedBy, int i2) {
        Intrinsics.checkNotNullParameter(paddedBy, "$this$paddedBy");
        LRC.n.t(i2, "padding size");
        ByteBuffer byteBufferO = O(w9.w6.qie(KN(paddedBy), i2), null, 2, null);
        byteBufferO.put(n(paddedBy));
        byteBufferO.position(0);
        return byteBufferO;
    }

    public static final void ck(ByteBuffer position, int i2) {
        Intrinsics.checkNotNullParameter(position, "$this$position");
        position.position(i2);
    }

    public static final ByteBuffer gh(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(ByteOrder.nativeOrder());
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "slice().order(ByteOrder.nativeOrder())");
        return byteBufferOrder;
    }

    public static final boolean mUb(ByteBuffer hasByteCountCompatibleWith, int i2) {
        Intrinsics.checkNotNullParameter(hasByteCountCompatibleWith, "$this$hasByteCountCompatibleWith");
        return hasByteCountCompatibleWith.remaining() % i2 == 0;
    }

    public static final ByteBuffer n(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer byteBufferOrder = byteBuffer.asReadOnlyBuffer().order(ByteOrder.nativeOrder());
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "asReadOnlyBuffer().order(ByteOrder.nativeOrder())");
        return byteBufferOrder;
    }

    public static final ByteBuffer nr(int i2, ByteOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(order);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "allocateDirect(capacity.value).order(order)");
        return byteBufferOrder;
    }

    public static final ByteBuffer qie(ByteBuffer byteBuffer, w9.I28 range) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (w9.Ml.nr(range.n(), J2(byteBuffer)) <= 0) {
            ByteBuffer byteBufferN = n(byteBuffer);
            ck(byteBufferN, range.rl());
            HI(byteBufferN, range.n());
            return gh(byteBufferN);
        }
        throw new IllegalArgumentException(("Slice: end index (" + ((Object) w9.Ml.az(range.n())) + ") must not be greater than the limit " + ((Object) w9.Ml.az(J2(byteBuffer))) + '.').toString());
    }

    public static final ShortBuffer rl(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.order(ByteOrder.nativeOrder()).asShortBuffer();
        Intrinsics.checkNotNullExpressionValue(shortBufferAsShortBuffer, "this.order(ByteOrder.nat…eOrder()).asShortBuffer()");
        return shortBufferAsShortBuffer;
    }

    public static final ByteBuffer t(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer byteBufferN = n(byteBuffer);
        ByteBuffer clone = (byteBufferN.isDirect() ? ByteBuffer.allocateDirect(byteBufferN.remaining()) : ByteBuffer.allocate(byteBufferN.remaining())).order(byteBuffer.order());
        clone.put(byteBufferN);
        clone.flip();
        Intrinsics.checkNotNullExpressionValue(clone, "clone");
        return clone;
    }

    public static final int ty(ByteBuffer byteBuffer, ByteBuffer source) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iJ2 = J2(source);
        int iHI = ((w9.w6) ComparisonsKt.minOf(w9.w6.rl(KN(source)), w9.w6.rl(KN(byteBuffer)))).HI();
        HI(source, w9.Ml.qie(Uo(source), iHI));
        byteBuffer.put(source);
        HI(source, iJ2);
        return iHI;
    }

    public static final boolean xMQ(ByteBuffer hasByteCountCompatibleWith, int i2) {
        Intrinsics.checkNotNullParameter(hasByteCountCompatibleWith, "$this$hasByteCountCompatibleWith");
        return hasByteCountCompatibleWith.remaining() % i2 == 0;
    }
}
