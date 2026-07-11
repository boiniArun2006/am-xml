package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class Mp4OrientationData implements Metadata.Entry {
    public final int orientation;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj).orientation;
    }

    public int hashCode() {
        return 527 + Integer.hashCode(this.orientation);
    }

    public String toString() {
        return "Orientation= " + this.orientation;
    }

    public Mp4OrientationData(int i2) {
        boolean z2;
        if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
            z2 = false;
        } else {
            z2 = true;
        }
        Assertions.checkArgument(z2, "Unsupported orientation");
        this.orientation = i2;
    }
}
