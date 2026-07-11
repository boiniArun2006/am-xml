package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001fR$\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b \u00101R$\u00104\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b!\u00101¨\u00065"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "preserveMinimumHeight", "<init>", "(FIIZZFZ)V", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", c.f62177j, "(Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", TtmlNode.START, TtmlNode.END, "spanStartVertical", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "rl", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "F", "getLineHeight", "()F", "I", "t", "nr", "Z", "O", "()Z", "J2", "Uo", "KN", "firstAscent", "xMQ", "ascent", "mUb", "descent", "gh", "lastDescent", "<set-?>", "qie", "()I", "firstAscentDiff", "az", "lastDescentDiff", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLineHeightStyleSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,157:1\n77#2,8:158\n*S KotlinDebug\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n*L\n68#1:158,8\n*E\n"})
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float topRatio;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean trimLastLineBottom;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean preserveMinimumHeight;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int lastDescentDiff;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float lineHeight;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean trimFirstLineTop;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int firstAscentDiff;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private int firstAscent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int ascent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private int descent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int lastDescent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final LineHeightStyleSpan rl(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new LineHeightStyleSpan(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public LineHeightStyleSpan(float f3, int i2, int i3, boolean z2, boolean z3, float f4, boolean z4) {
        boolean z5;
        this.lineHeight = f3;
        this.startIndex = i2;
        this.endIndex = i3;
        this.trimFirstLineTop = z2;
        this.trimLastLineBottom = z3;
        this.topRatio = f4;
        this.preserveMinimumHeight = z4;
        if ((0.0f <= f4 && f4 <= 1.0f) || f4 == -1.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            InlineClassHelperKt.t("topRatio should be in [0..1] range or -1");
        }
    }

    private final void n(Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iN = iCeil - LineHeightStyleSpan_androidKt.n(fontMetricsInt);
        if (this.preserveMinimumHeight && iN <= 0) {
            int i2 = fontMetricsInt.ascent;
            this.ascent = i2;
            int i3 = fontMetricsInt.descent;
            this.descent = i3;
            this.firstAscent = i2;
            this.lastDescent = i3;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.n(fontMetricsInt);
        }
        if (iN <= 0) {
            dCeil = Math.ceil(iN * fAbs);
        } else {
            dCeil = Math.ceil(iN * (1.0f - fAbs));
        }
        int i5 = (int) dCeil;
        int i7 = fontMetricsInt.descent;
        int i8 = i5 + i7;
        this.descent = i8;
        int i9 = i8 - iCeil;
        this.ascent = i9;
        if (this.trimFirstLineTop) {
            i9 = fontMetricsInt.ascent;
        }
        this.firstAscent = i9;
        if (this.trimLastLineBottom) {
            i8 = i7;
        }
        this.lastDescent = i8;
        this.firstAscentDiff = fontMetricsInt.ascent - i9;
        this.lastDescentDiff = i8 - i7;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        boolean z2;
        int i2;
        int i3;
        if (LineHeightStyleSpan_androidKt.n(fontMetricsInt) > 0) {
            boolean z3 = false;
            if (start == this.startIndex) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (end == this.endIndex) {
                z3 = true;
            }
            if (z2 && z3 && this.trimFirstLineTop && this.trimLastLineBottom) {
                return;
            }
            if (this.firstAscent == Integer.MIN_VALUE) {
                n(fontMetricsInt);
            }
            if (z2) {
                i2 = this.firstAscent;
            } else {
                i2 = this.ascent;
            }
            fontMetricsInt.ascent = i2;
            if (z3) {
                i3 = this.lastDescent;
            } else {
                i3 = this.descent;
            }
            fontMetricsInt.descent = i3;
        }
    }
}
