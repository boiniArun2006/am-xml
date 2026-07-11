package dF;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import fJf.Dsr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Dsr bitmapPool, Pools.Pool decodeBuffers, Wre platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // dF.n
    public int nr(int i2, int i3, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return com.facebook.imageutils.Ml.xMQ(i2, i3, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
