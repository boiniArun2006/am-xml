package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public class FrameInfo {
    public final Format format;
    public final long offsetToAddUs;

    public FrameInfo(Format format, long j2) {
        boolean z2;
        boolean z3;
        if (format.colorInfo != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "format colorInfo must be set");
        if (format.width > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3, "format width must be positive, but is: " + format.width);
        Assertions.checkArgument(format.height > 0, "format height must be positive, but is: " + format.height);
        this.format = format;
        this.offsetToAddUs = j2;
    }
}
