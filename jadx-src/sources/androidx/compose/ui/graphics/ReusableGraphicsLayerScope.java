package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R*\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R*\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b\u0018\u0010\u0016R*\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R0\u00100\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020+8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b\u001c\u0010-\"\u0004\b.\u0010/R0\u00103\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020+8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R*\u00107\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R*\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R*\u0010>\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010\u0016R*\u0010@\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b?\u0010\u0016R0\u0010E\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020A8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bB\u0010\u0019\u001a\u0004\bC\u0010-\"\u0004\bD\u0010/R*\u0010K\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020F8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bB\u0010H\"\u0004\bI\u0010JR*\u0010Q\u001a\u00020L2\u0006\u0010\u0010\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010'\u001a\u0004\bN\u0010O\"\u0004\b;\u0010PR0\u0010T\u001a\u00020R2\u0006\u0010\u0010\u001a\u00020R8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bS\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b,\u0010\rR(\u0010W\u001a\u00020U8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bV\u0010\u0019\u001a\u0004\b\u0011\u0010-\"\u0004\bV\u0010/R\"\u0010\\\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010Y\u001a\u0004\b$\u0010Z\"\u0004\bM\u0010[R\"\u0010b\u001a\u00020]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010^\u001a\u0004\b_\u0010`\"\u0004\bS\u0010aR.\u0010i\u001a\u0004\u0018\u00010c2\b\u0010\u0010\u001a\u0004\u0018\u00010c8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR.\u0010q\u001a\u0004\u0018\u00010j2\b\u0010k\u001a\u0004\u0018\u00010j8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u0014R\u0014\u0010u\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "<init>", "()V", "", "v", "P5", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "g", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "t", "F", "s7N", "()F", "Uo", "(F)V", "scaleX", "O", "J", "az", "scaleY", "J2", "nr", "rl", "alpha", "r", "p5", "ty", "translationX", "o", "M7", "translationY", "Z", "e", "wTp", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "S", "()J", "iF", "(J)V", "ambientShadowColor", "nHg", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "spotShadowColor", "E2", "eF", "mUb", "rotationX", "WPU", "gh", "rotationY", "X", "nY", "qie", "rotationZ", "xMQ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "N", "K", "tUK", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Shape;", "()Landroidx/compose/ui/graphics/Shape;", "pS", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "", "Xw", "HI", "()Z", "(Z)V", "clip", "Landroidx/compose/ui/graphics/CompositingStrategy;", "jB", "compositingStrategy", "Landroidx/compose/ui/geometry/Size;", "U", "size", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "graphicsDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "aYN", "()Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "fD", "()Landroidx/compose/ui/graphics/RenderEffect;", "KN", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "Landroidx/compose/ui/graphics/Outline;", "te", "()Landroidx/compose/ui/graphics/Outline;", "setOutline$ui_release", "(Landroidx/compose/ui/graphics/Outline;)V", "outline", "getDensity", "density", "yAc", "fontScale", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Outline outline;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = GraphicsLayerScopeKt.n();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = GraphicsLayerScopeKt.n();

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = TransformOrigin.INSTANCE.n();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Shape shape = RectangleShapeKt.n();

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private int compositingStrategy = CompositingStrategy.INSTANCE.n();

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private long size = Size.INSTANCE.n();

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Density graphicsDensity = DensityKt.rl(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.f34160n;

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: E2, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: K, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void KN(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: M7, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void O(float f3) {
        if (this.translationY == f3) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f3;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void S(int i2) {
        if (CompositingStrategy.J2(this.compositingStrategy, i2)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void T(long j2) {
        if (Color.HI(this.spotShadowColor, j2)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j2;
    }

    public void U(long j2) {
        this.size = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void Uo(float f3) {
        if (this.scaleX == f3) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f3;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: WPU, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void X(boolean z2) {
        if (this.clip != z2) {
            this.mutatedFields |= 16384;
            this.clip = z2;
        }
    }

    public final void Xw(Density density) {
        this.graphicsDensity = density;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void az(float f3) {
        if (this.scaleY == f3) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f3;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: eF, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void gh(float f3) {
        if (this.rotationY == f3) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f3;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void iF(long j2) {
        if (Color.HI(this.ambientShadowColor, j2)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j2;
    }

    public final void jB(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void mUb(float f3) {
        if (this.rotationX == f3) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f3;
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: nY, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Density getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: p5, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void pS(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void qie(float f3) {
        if (this.rotationZ == f3) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f3;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void rl(float f3) {
        if (this.alpha == f3) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f3;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: s7N, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* JADX INFO: renamed from: t, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void tUK(long j2) {
        if (TransformOrigin.O(this.transformOrigin, j2)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j2;
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final Outline getOutline() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void ty(float f3) {
        if (this.translationX == f3) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f3;
    }

    public final void v() {
        Uo(1.0f);
        az(1.0f);
        rl(1.0f);
        ty(0.0f);
        O(0.0f);
        wTp(0.0f);
        iF(GraphicsLayerScopeKt.n());
        T(GraphicsLayerScopeKt.n());
        mUb(0.0f);
        gh(0.0f);
        qie(0.0f);
        xMQ(8.0f);
        tUK(TransformOrigin.INSTANCE.n());
        pS(RectangleShapeKt.n());
        X(false);
        KN(null);
        S(CompositingStrategy.INSTANCE.n());
        U(Size.INSTANCE.n());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void wTp(float f3) {
        if (this.shadowElevation == f3) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f3;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void xMQ(float f3) {
        if (this.cameraDistance == f3) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f3;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final void P5() {
        this.outline = getShape().n(getSize(), this.layoutDirection, this.graphicsDensity);
    }
}
