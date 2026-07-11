package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public abstract class EmojiSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TypefaceEmojiRasterizer f38342t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint.FontMetricsInt f38340n = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private short f38339O = -1;
    private short J2 = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f38341r = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f38340n);
        Paint.FontMetricsInt fontMetricsInt2 = this.f38340n;
        this.f38341r = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f38342t.O();
        this.J2 = (short) (this.f38342t.O() * this.f38341r);
        short sXMQ = (short) (this.f38342t.xMQ() * this.f38341r);
        this.f38339O = sXMQ;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f38340n;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sXMQ;
    }

    public final TypefaceEmojiRasterizer n() {
        return this.f38342t;
    }

    final int rl() {
        return this.f38339O;
    }

    EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.KN(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f38342t = typefaceEmojiRasterizer;
    }
}
