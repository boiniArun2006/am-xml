package androidx.media3.container;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public final class Mp4LocationData implements Metadata.Entry {
    public final float latitude;
    public final float longitude;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + w6.n(this.latitude)) * 31) + w6.n(this.longitude);
    }

    public String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }

    public Mp4LocationData(@FloatRange float f3, @FloatRange float f4) {
        boolean z2;
        if (f3 >= -90.0f && f3 <= 90.0f && f4 >= -180.0f && f4 <= 180.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Invalid latitude or longitude");
        this.latitude = f3;
        this.longitude = f4;
    }
}
