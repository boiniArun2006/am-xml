package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public abstract class Buffer {
    private int flags;

    @CallSuper
    public void clear() {
        this.flags = 0;
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void addFlag(int i2) {
        this.flags = i2 | this.flags;
    }

    public final void clearFlag(int i2) {
        this.flags = (~i2) & this.flags;
    }

    protected final boolean getFlag(int i2) {
        return (this.flags & i2) == i2;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean notDependedOn() {
        return getFlag(C.BUFFER_FLAG_NOT_DEPENDED_ON);
    }

    public final void setFlags(int i2) {
        this.flags = i2;
    }
}
