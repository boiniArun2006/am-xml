package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u0000 12\u00020\u0001:\u0001tJ*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#R\"\u0010)\u001a\u00020$8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010/\u001a\u00020*8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u0002068&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001e\u0010?\u001a\u0004\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u00102\"\u0004\bA\u00104R\u001c\u0010E\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u00102\"\u0004\bD\u00104R\u001c\u0010H\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\u001c\u0010K\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u00102\"\u0004\bJ\u00104R\u001c\u0010N\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u00102\"\u0004\bM\u00104R\"\u0010R\u001a\u00020O8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\"\u0010U\u001a\u00020O8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bS\u0010,\"\u0004\bT\u0010.R\u001c\u0010X\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00102\"\u0004\bW\u00104R\u001c\u0010[\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00102\"\u0004\bZ\u00104R\u001c\u0010^\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u00102\"\u0004\b]\u00104R\u001c\u0010a\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b_\u00102\"\u0004\b`\u00104R\u001c\u0010g\u001a\u00020b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010m\u001a\u0004\u0018\u00010h8&@&X¦\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001c\u0010n\u001a\u00020b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bn\u0010d\"\u0004\bo\u0010fR\u0014\u0010q\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010dR\u0014\u0010s\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006uÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "", "Z", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "te", "(Landroid/graphics/Outline;J)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "nHg", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "r", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "J2", "()V", "Landroid/graphics/Matrix;", "aYN", "()Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "o", "()I", "e", "(I)V", "compositingStrategy", "Landroidx/compose/ui/geometry/Offset;", "getPivotOffset-F1C5BW0", "()J", "fD", "(J)V", "pivotOffset", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()F", "rl", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "ck", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "nr", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "s7N", "Uo", "scaleX", "J", "az", "scaleY", "p5", "ty", "translationX", "M7", "O", "translationY", "N", "wTp", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "XQ", "iF", "ambientShadowColor", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "spotShadowColor", "eF", "mUb", "rotationX", "WPU", "gh", "rotationY", "nY", "qie", "rotationZ", "E2", "xMQ", "cameraDistance", "", "getClip", "()Z", "X", "(Z)V", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "Ik", "()Landroidx/compose/ui/graphics/RenderEffect;", "KN", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "isInvalidated", "g", "ViF", "supportsSoftwareRendering", "HI", "hasDisplayList", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GraphicsLayerImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31678n;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "rl", "Lkotlin/jvm/functions/Function1;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Lkotlin/jvm/functions/Function1;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31678n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Function1 DefaultDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                DrawScope.h(drawScope, Color.INSTANCE.J2(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        };

        public final Function1 n() {
            return DefaultDrawBlock;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: E2 */
    float getCameraDistance();

    default boolean HI() {
        return true;
    }

    /* JADX INFO: renamed from: Ik */
    RenderEffect getRenderEffect();

    /* JADX INFO: renamed from: J */
    float getScaleY();

    void J2();

    void KN(RenderEffect renderEffect);

    /* JADX INFO: renamed from: M7 */
    float getTranslationY();

    /* JADX INFO: renamed from: N */
    float getShadowElevation();

    void O(float f3);

    /* JADX INFO: renamed from: S */
    long getSpotShadowColor();

    void T(long j2);

    void Uo(float f3);

    /* JADX INFO: renamed from: ViF */
    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    /* JADX INFO: renamed from: WPU */
    float getRotationY();

    void X(boolean z2);

    /* JADX INFO: renamed from: XQ */
    long getAmbientShadowColor();

    void Z(int x2, int y2, long size);

    Matrix aYN();

    void az(float f3);

    /* JADX INFO: renamed from: ck */
    int getBlendMode();

    void e(int i2);

    /* JADX INFO: renamed from: eF */
    float getRotationX();

    void fD(long j2);

    void g(boolean z2);

    void gh(float f3);

    void iF(long j2);

    void mUb(float f3);

    /* JADX INFO: renamed from: n */
    float getAlpha();

    void nHg(Canvas canvas);

    /* JADX INFO: renamed from: nY */
    float getRotationZ();

    /* JADX INFO: renamed from: nr */
    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: o */
    int getCompositingStrategy();

    /* JADX INFO: renamed from: p5 */
    float getTranslationX();

    void qie(float f3);

    void r(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1 block);

    void rl(float f3);

    /* JADX INFO: renamed from: s7N */
    float getScaleX();

    void te(Outline outline, long outlineSize);

    void ty(float f3);

    void wTp(float f3);

    void xMQ(float f3);
}
