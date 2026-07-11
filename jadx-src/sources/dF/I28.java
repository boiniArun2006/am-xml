package dF;

import android.os.Build;
import androidx.core.util.Pools;
import fJf.Dsr;
import fJf.Ew;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f63467n = new I28();

    public static final Ml n(Ew poolFactory, boolean z2, boolean z3, Wre platformDecoderOptions) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            Dsr dsrRl = poolFactory.rl();
            Intrinsics.checkNotNullExpressionValue(dsrRl, "getBitmapPool(...)");
            return new w6(dsrRl, rl(poolFactory, z3), platformDecoderOptions);
        }
        Dsr dsrRl2 = poolFactory.rl();
        Intrinsics.checkNotNullExpressionValue(dsrRl2, "getBitmapPool(...)");
        return new j(dsrRl2, rl(poolFactory, z3), platformDecoderOptions);
    }

    public static final Pools.Pool rl(Ew poolFactory, boolean z2) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        if (z2) {
            A72.n INSTANCE = A72.n.f16n;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iO = poolFactory.O();
        Pools.SynchronizedPool synchronizedPool = new Pools.SynchronizedPool(iO);
        for (int i2 = 0; i2 < iO; i2++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(A72.n.nr());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            synchronizedPool.n(byteBufferAllocate);
        }
        return synchronizedPool;
    }

    private I28() {
    }
}
