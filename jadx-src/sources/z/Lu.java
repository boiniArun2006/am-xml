package z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Lu {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ByteBuffer f76258O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76259n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76260t;

    public final void Uo() {
        this.Uo = true;
    }

    public final int J2() {
        return this.f76259n;
    }

    public final int O() {
        return this.f76260t;
    }

    public final ByteBuffer n() {
        return this.f76258O;
    }

    public final int nr() {
        return this.J2;
    }

    public final int rl() {
        return this.rl;
    }

    public final boolean t() {
        return this.Uo;
    }

    public Lu(int i2, int i3, int i5, int i7) {
        this.f76259n = i2;
        this.rl = i3;
        this.f76260t = i5;
        this.nr = i7;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * i7);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "apply(...)");
        this.f76258O = byteBufferAllocateDirect;
        this.J2 = i7 * i3;
    }
}
