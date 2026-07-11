package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÂ\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a,\u0010 \u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "rl", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "block", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "nr", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GraphicsLayerModifierKt {
    public static /* synthetic */ Modifier t(Modifier modifier, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, int i3, Object obj) {
        return rl(modifier, (i3 & 1) != 0 ? 1.0f : f3, (i3 & 2) != 0 ? 1.0f : f4, (i3 & 4) == 0 ? f5 : 1.0f, (i3 & 8) != 0 ? 0.0f : f6, (i3 & 16) != 0 ? 0.0f : f7, (i3 & 32) != 0 ? 0.0f : f8, (i3 & 64) != 0 ? 0.0f : f9, (i3 & 128) != 0 ? 0.0f : f10, (i3 & 256) == 0 ? f11 : 0.0f, (i3 & 512) != 0 ? 8.0f : f12, (i3 & 1024) != 0 ? TransformOrigin.INSTANCE.n() : j2, (i3 & 2048) != 0 ? RectangleShapeKt.n() : shape, (i3 & 4096) != 0 ? false : z2, (i3 & 8192) != 0 ? null : renderEffect, (i3 & 16384) != 0 ? GraphicsLayerScopeKt.n() : j3, (32768 & i3) != 0 ? GraphicsLayerScopeKt.n() : j4, (i3 & 65536) != 0 ? CompositingStrategy.INSTANCE.n() : i2);
    }

    public static final Modifier n(Modifier modifier, Function1 function1) {
        return modifier.Zmq(new BlockGraphicsLayerElement(function1));
    }

    public static final Modifier nr(Modifier modifier) {
        return InspectableValueKt.rl() ? modifier.Zmq(t(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }

    public static final Modifier rl(Modifier modifier, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        return modifier.Zmq(new GraphicsLayerElement(f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, j2, shape, z2, renderEffect, j3, j4, i2, null));
    }
}
