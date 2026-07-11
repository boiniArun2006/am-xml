package androidx.media3.common.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i2, int i3) {
        this(0, 0, i2, i3);
    }

    public GlRect(int i2, int i3, int i5, int i7) {
        Assertions.checkArgument(i2 <= i5 && i3 <= i7);
        this.left = i2;
        this.bottom = i3;
        this.right = i5;
        this.top = i7;
    }
}
