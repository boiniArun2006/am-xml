package z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2472aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76297n;
    private ShortBuffer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f76296t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: z.aC$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final C2472aC n(short... elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            C2472aC c2472aC = new C2472aC(elements.length);
            c2472aC.t(elements);
            return c2472aC;
        }
    }

    public final ShortBuffer n() {
        return this.rl;
    }

    public final int rl() {
        return this.f76297n;
    }

    public final void t(short[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.rl.position(0);
        this.rl.put(values);
        this.rl.position(0);
    }

    public C2472aC(int i2) {
        this.f76297n = i2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        Intrinsics.checkNotNullExpressionValue(shortBufferAsShortBuffer, "asShortBuffer(...)");
        this.rl = shortBufferAsShortBuffer;
    }
}
