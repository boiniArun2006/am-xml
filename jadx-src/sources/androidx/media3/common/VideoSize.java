package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_WIDTH = 0;

    @IntRange
    public final int height;

    @FloatRange
    public final float pixelWidthHeightRatio;

    @IntRange
    @Deprecated
    public final int unappliedRotationDegrees;

    @IntRange
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(3);

    @UnstableApi
    public VideoSize(@IntRange int i2, @IntRange int i3) {
        this(i2, i3, 1.0f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public VideoSize(@IntRange int i2, @IntRange int i3, @FloatRange float f3) {
        this.width = i2;
        this.height = i3;
        this.unappliedRotationDegrees = 0;
        this.pixelWidthHeightRatio = f3;
    }

    @UnstableApi
    public static VideoSize fromBundle(Bundle bundle) {
        return new VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }

    public int hashCode() {
        return ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.width) * 31) + this.height) * 31) + Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.width;
        if (i2 != 0) {
            bundle.putInt(FIELD_WIDTH, i2);
        }
        int i3 = this.height;
        if (i3 != 0) {
            bundle.putInt(FIELD_HEIGHT, i3);
        }
        float f3 = this.pixelWidthHeightRatio;
        if (f3 != 1.0f) {
            bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, f3);
        }
        return bundle;
    }

    @UnstableApi
    @Deprecated
    public VideoSize(@IntRange int i2, @IntRange int i3, @IntRange int i5, @FloatRange float f3) {
        this(i2, i3, f3);
    }
}
