package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106¨\u0006:"}, d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/unit/Density;", "density", "textIndentPx", "<init>", "(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/unit/Density;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", TtmlNode.TAG_P, "x", "dir", "top", "baseline", "bottom", "", "text", TtmlNode.START, TtmlNode.END, "Landroid/text/Layout;", TtmlNode.TAG_LAYOUT, "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", c.f62177j, "Landroidx/compose/ui/graphics/Shape;", "rl", "F", "t", "nr", "Landroidx/compose/ui/graphics/Brush;", "O", "J2", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Uo", "Landroidx/compose/ui/unit/Density;", "KN", "I", "minimumRequiredIndent", "xMQ", "diff", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,206:1\n33#2:207\n53#3,3:208\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n*L\n90#1:207\n90#1:208,3\n*E\n"})
public final class CustomBulletSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final DrawStyle drawStyle;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int minimumRequiredIndent;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Shape shape;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Brush brush;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float bulletWidthPx;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float bulletHeightPx;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int diff;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas c2, final Paint p2, int x2, final int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        if (c2 == null) {
            return;
        }
        final float f3 = (top + bottom) / 2.0f;
        final int iCoerceAtLeast = RangesKt.coerceAtLeast(x2 - this.minimumRequiredIndent, 0);
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) text).getSpanStart(this) != start || p2 == null) {
            return;
        }
        Paint.Style style = p2.getStyle();
        BulletSpan_androidKt.J2(p2, this.drawStyle);
        float f4 = this.bulletWidthPx;
        final long jNr = Size.nr((((long) Float.floatToRawIntBits(this.bulletHeightPx)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
        BulletSpan_androidKt.O(p2, this.brush, this.alpha, jNr, new Function0<Unit>() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BulletSpan_androidKt.nr(this.f33868n.shape.n(jNr, dir > 0 ? LayoutDirection.f34160n : LayoutDirection.f34161t, this.f33868n.density), c2, p2, iCoerceAtLeast, f3, dir);
            }
        });
        p2.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i2 = this.diff;
        if (i2 >= 0) {
            return 0;
        }
        return Math.abs(i2);
    }

    public CustomBulletSpan(Shape shape, float f3, float f4, float f5, Brush brush, float f6, DrawStyle drawStyle, Density density, float f7) {
        this.shape = shape;
        this.bulletWidthPx = f3;
        this.bulletHeightPx = f4;
        this.brush = brush;
        this.alpha = f6;
        this.drawStyle = drawStyle;
        this.density = density;
        int iRoundToInt = MathKt.roundToInt(f3 + f5);
        this.minimumRequiredIndent = iRoundToInt;
        this.diff = MathKt.roundToInt(f7) - iRoundToInt;
    }
}
