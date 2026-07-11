package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R%\u00101\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0-¢\u0006\u0002\b.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00104\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", "az", "()Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "KN", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "", "alpha", "Uo", "(F)V", "Landroidx/compose/ui/unit/LayoutDirection;", "rtl", "xMQ", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ty", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", c.f62177j, "(F)Z", "rl", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "layoutDirection", "J2", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/geometry/Size;", "size", "mUb", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/Paint;", "layerPaint", "t", "Z", "useLayer", "O", "Landroidx/compose/ui/graphics/ColorFilter;", "F", "r", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "o", "Lkotlin/jvm/functions/Function1;", "drawLambda", "qie", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,198:1\n57#2:199\n61#2:202\n57#2:208\n61#2:211\n57#2:213\n61#2:216\n60#3:200\n70#3:203\n60#3:209\n70#3:212\n60#3:214\n70#3:217\n53#3,3:219\n22#4:201\n22#4:204\n22#4:210\n22#4:215\n68#5,3:205\n233#5:222\n72#5,3:230\n33#6:218\n95#7,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n181#1:199\n182#1:202\n184#1:208\n184#1:211\n186#1:213\n186#1:216\n181#1:200\n182#1:203\n184#1:209\n184#1:212\n186#1:214\n186#1:217\n186#1:219,3\n181#1:201\n182#1:204\n184#1:210\n186#1:215\n178#1:205,3\n188#1:222\n178#1:230,3\n186#1:218\n189#1:223,7\n*E\n"})
public abstract class Painter {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.f34160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Function1 drawLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            n(drawScope);
            return Unit.INSTANCE;
        }

        public final void n(DrawScope drawScope) {
            this.f31764n.ty(drawScope);
        }
    };

    protected boolean J2(LayoutDirection layoutDirection) {
        return false;
    }

    protected boolean n(float alpha) {
        return false;
    }

    public abstract long qie();

    protected boolean rl(ColorFilter colorFilter) {
        return false;
    }

    protected abstract void ty(DrawScope drawScope);

    private final void KN(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.colorFilter, colorFilter)) {
            return;
        }
        if (!rl(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.fD(null);
                }
                this.useLayer = false;
            } else {
                az().fD(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void Uo(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!n(alpha)) {
            if (alpha == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.rl(alpha);
                }
                this.useLayer = false;
            } else {
                az().rl(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final Paint az() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paintN = AndroidPaint_androidKt.n();
        this.layerPaint = paintN;
        return paintN;
    }

    public static /* synthetic */ void gh(Painter painter, DrawScope drawScope, long j2, float f3, ColorFilter colorFilter, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        painter.mUb(drawScope, j2, f4, colorFilter);
    }

    private final void xMQ(LayoutDirection rtl) {
        if (this.layoutDirection != rtl) {
            J2(rtl);
            this.layoutDirection = rtl;
        }
    }

    public final void mUb(DrawScope drawScope, long j2, float f3, ColorFilter colorFilter) {
        Uo(f3);
        KN(colorFilter);
        xMQ(drawScope.getLayoutDirection());
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.t() >> 32)) - Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.t() & 4294967295L)) - Float.intBitsToFloat(i3);
        drawScope.getDrawContext().getTransform().xMQ(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f3 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i2) > 0.0f && Float.intBitsToFloat(i3) > 0.0f) {
                    if (this.useLayer) {
                        long jT2 = Offset.INSTANCE.t();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                        Rect rectT = RectKt.t(jT2, Size.nr((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        Canvas canvasKN = drawScope.getDrawContext().KN();
                        try {
                            canvasKN.HI(rectT, az());
                            ty(drawScope);
                            canvasKN.n();
                        } catch (Throwable th) {
                            canvasKN.n();
                            throw th;
                        }
                    } else {
                        ty(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.getDrawContext().getTransform().xMQ(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.getDrawContext().getTransform().xMQ(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }
}
