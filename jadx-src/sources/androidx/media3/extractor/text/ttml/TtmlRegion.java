package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class TtmlRegion {
    public final float height;
    public final String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(String str, float f3, float f4, int i2, int i3, float f5, float f6, int i5, float f7, int i7) {
        this.id = str;
        this.position = f3;
        this.line = f4;
        this.lineType = i2;
        this.lineAnchor = i3;
        this.width = f5;
        this.height = f6;
        this.textSizeType = i5;
        this.textSize = f7;
        this.verticalType = i7;
    }
}
