package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 62\u00020\u0001:\u00017B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010'R$\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R$\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010'R$\u00102\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010'R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010)¨\u00068"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", TtmlNode.START, TtmlNode.END, "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", c.f62177j, "F", "t", "I", "O", "J2", "r", "o", "()I", "<set-?>", "Z", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "S", "nr", "widthPx", "g", "rl", "heightPx", "", "E2", "isLaidOut", "e", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,191:1\n77#2,8:192\n77#2,8:200\n114#2,8:208\n*S KotlinDebug\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n*L\n92#1:192,8\n100#1:200,8\n118#1:208,8\n*E\n"})
public final class PlaceholderSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean isLaidOut;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int heightUnit;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int widthPx;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int heightPx;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int verticalAlign;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float pxPerSp;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int widthUnit;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f33589X = 8;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x2, int top, int y2, int bottom, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
        float f3;
        int iN;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(n().descent > n().ascent)) {
            InlineClassHelperKt.n("Invalid fontMetrics: line height can not be negative.");
        }
        int i2 = this.widthUnit;
        if (i2 == 0) {
            f3 = this.width * this.pxPerSp;
        } else {
            if (i2 != 1) {
                InlineClassHelperKt.rl("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f3 = this.width * textSize;
        }
        this.widthPx = PlaceholderSpan_androidKt.n(f3);
        int i3 = this.heightUnit;
        if (i3 == 0) {
            iN = PlaceholderSpan_androidKt.n(this.height * this.pxPerSp);
        } else {
            if (i3 != 1) {
                InlineClassHelperKt.rl("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            iN = PlaceholderSpan_androidKt.n(this.height * textSize);
        }
        this.heightPx = iN;
        if (fm2 != null) {
            fm2.ascent = n().ascent;
            fm2.descent = n().descent;
            fm2.leading = n().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm2.ascent > (-rl())) {
                        fm2.ascent = -rl();
                    }
                    break;
                case 1:
                case 4:
                    if (fm2.ascent + rl() > fm2.descent) {
                        fm2.descent = fm2.ascent + rl();
                    }
                    break;
                case 2:
                case 5:
                    if (fm2.ascent > fm2.descent - rl()) {
                        fm2.ascent = fm2.descent - rl();
                    }
                    break;
                case 3:
                case 6:
                    if (fm2.descent - fm2.ascent < rl()) {
                        int iRl = fm2.ascent - ((rl() - (fm2.descent - fm2.ascent)) / 2);
                        fm2.ascent = iRl;
                        fm2.descent = iRl + rl();
                    }
                    break;
                default:
                    InlineClassHelperKt.n("Unknown verticalAlign.");
                    break;
            }
            fm2.top = Math.min(n().top, fm2.ascent);
            fm2.bottom = Math.max(n().bottom, fm2.descent);
        }
        return nr();
    }

    public final Paint.FontMetricsInt n() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int nr() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.t("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    public final int rl() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.t("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public PlaceholderSpan(float f3, int i2, float f4, int i3, float f5, int i5) {
        this.width = f3;
        this.widthUnit = i2;
        this.height = f4;
        this.heightUnit = i3;
        this.pxPerSp = f5;
        this.verticalAlign = i5;
    }
}
