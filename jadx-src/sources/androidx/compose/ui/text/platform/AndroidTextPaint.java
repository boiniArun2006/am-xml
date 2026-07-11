package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R\u001e\u00102\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u00101R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u00103\u0012\u0004\b8\u0010\n\u001a\u0004\b4\u00105\"\u0004\b6\u00107R2\u0010A\u001a\u0012\u0012\f\u0012\n\u0018\u00010:j\u0004\u0018\u0001`;\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010H\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b\u0011\u0010B\u0012\u0004\bG\u0010\n\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010K\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010JR*\u0010O\u001a\u00020'2\u0006\u0010L\u001a\u00020'8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010M\"\u0004\b+\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "", c.f62177j, "()V", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "xMQ", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "KN", "(Landroidx/compose/ui/graphics/Shadow;)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "J2", "(J)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "O", "(Landroidx/compose/ui/graphics/Brush;JF)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Uo", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Paint;", "backingComposePaint", "rl", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/BlendMode;", "t", "I", "backingBlendMode", "nr", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "Landroidx/compose/ui/graphics/Color;", "lastColor", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text_release", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text_release", "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush$ui_text_release$annotations", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/runtime/State;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/State;)V", "shaderState", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text_release", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text_release", "(Landroidx/compose/ui/geometry/Size;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "()Landroidx/compose/ui/graphics/Paint;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n65#3:205\n69#3:208\n60#4:206\n70#4:209\n22#5:207\n22#5:210\n635#6:211\n148#7:212\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n101#1:205\n102#1:208\n101#1:206\n102#1:209\n101#1:207\n102#1:210\n110#1:211\n137#1:212\n*E\n"})
public final class AndroidTextPaint extends TextPaint {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Brush brush;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Size brushSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Color lastColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private State shaderState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Paint backingComposePaint;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Shadow shadow;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private TextDecoration textDecoration;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int backingBlendMode;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private DrawStyle drawStyle;

    private final void n() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final Paint t() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintRl = AndroidPaint_androidKt.rl(this);
        this.backingComposePaint = paintRl;
        return paintRl;
    }

    public final void J2(long color) {
        Color color2 = this.lastColor;
        if (color2 == null ? false : Color.HI(color2.getValue(), color)) {
            return;
        }
        if (color != 16) {
            this.lastColor = Color.xMQ(color);
            setColor(ColorKt.mUb(color));
            n();
        }
    }

    public final void KN(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.INSTANCE.n())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.rl(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & 4294967295L)), ColorKt.mUb(this.shadow.getColor()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(final Brush brush, final long size, float alpha) {
        if (brush == null) {
            n();
            return;
        }
        if (brush instanceof SolidColor) {
            J2(TextDrawStyleKt.t(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (brush instanceof ShaderBrush) {
            if (Intrinsics.areEqual(this.brush, brush)) {
                Size size2 = this.brushSize;
                if (!(size2 == null ? false : Size.KN(size2.getPackedValue(), size))) {
                }
            } else {
                if (size != 9205357640488583168L) {
                    this.brush = brush;
                    this.brushSize = Size.t(size);
                    this.shaderState = SnapshotStateKt.O(new Function0<Shader>() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Shader invoke() {
                            return ((ShaderBrush) brush).t(size);
                        }
                    });
                }
            }
            Paint paintT = t();
            State state = this.shaderState;
            paintT.te(state != null ? (Shader) state.getValue() : null);
            this.lastColor = null;
            AndroidTextPaint_androidKt.n(this, alpha);
        }
    }

    public final void Uo(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, Fill.f31654n)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            t().X(PaintingStyle.INSTANCE.rl());
            Stroke stroke = (Stroke) drawStyle;
            t().T(stroke.getWidth());
            t().E2(stroke.getMiter());
            t().S(stroke.getJoin());
            t().Ik(stroke.getCap());
            t().XQ(stroke.getPathEffect());
        }
    }

    public final void nr(int i2) {
        if (BlendMode.e(i2, this.backingBlendMode)) {
            return;
        }
        t().r(i2);
        this.backingBlendMode = i2;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void xMQ(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.nr(companion.nr()));
        setStrikeThruText(this.textDecoration.nr(companion.rl()));
    }

    public AndroidTextPaint(int i2, float f3) {
        super(i2);
        ((TextPaint) this).density = f3;
        this.textDecoration = TextDecoration.INSTANCE.t();
        this.backingBlendMode = DrawScope.INSTANCE.n();
        this.shadow = Shadow.INSTANCE.n();
    }
}
