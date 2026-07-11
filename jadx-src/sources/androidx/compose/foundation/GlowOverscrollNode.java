package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001b\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J6\u0010!\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/GlowOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "pointerInputNode", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", TtmlNode.LEFT, "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "ni", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "Vd", TtmlNode.RIGHT, "GT", "bottom", CmcdConfiguration.KEY_PLAYBACK_RATE, "", "rotationDegrees", "Landroidx/compose/ui/geometry/Offset;", "offset", "edgeEffect", "b", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "jB", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "U", "Landroidx/compose/foundation/EdgeEffectWrapper;", "P5", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,1073:1\n61#2:1074\n57#2:1085\n57#2:1092\n61#2:1095\n70#3:1075\n53#3,3:1078\n53#3,3:1082\n60#3:1086\n53#3,3:1089\n60#3:1093\n70#3:1096\n53#3,3:1098\n60#3:1102\n70#3:1105\n22#4:1076\n22#4:1087\n22#4:1094\n22#4:1103\n30#5:1077\n30#5:1081\n30#5:1088\n30#5:1097\n65#6:1101\n69#6:1104\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n*L\n461#1:1074\n481#1:1085\n494#1:1092\n494#1:1095\n461#1:1075\n461#1:1078,3\n471#1:1082,3\n481#1:1086\n483#1:1089,3\n494#1:1093\n494#1:1096\n494#1:1098,3\n511#1:1102\n511#1:1105\n461#1:1076\n481#1:1087\n494#1:1094\n511#1:1103\n461#1:1077\n471#1:1081\n483#1:1088\n494#1:1097\n511#1:1101\n511#1:1104\n*E\n"})
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final PaddingValues glowDrawPadding;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final EdgeEffectWrapper edgeEffectWrapper;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    private final boolean Vd(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fL = drawScope.l(this.glowDrawPadding.getTop());
        return b(0.0f, Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fL)) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean pr(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fL = drawScope.l(this.glowDrawPadding.getBottom());
        float f3 = -Float.intBitsToFloat((int) (drawScope.t() >> 32));
        float f4 = (-Float.intBitsToFloat((int) (drawScope.t() & 4294967295L))) + fL;
        return b(180.0f, Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), edgeEffect, canvas);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        this.overscrollEffect.Ik(contentDrawScope.t());
        if (Size.az(contentDrawScope.t())) {
            contentDrawScope.l2();
            return;
        }
        contentDrawScope.l2();
        this.overscrollEffect.getRedrawSignal().getValue();
        Canvas canvasNr = AndroidCanvas_androidKt.nr(contentDrawScope.getDrawContext().KN());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean zNi = edgeEffectWrapper.o() ? ni(contentDrawScope, edgeEffectWrapper.xMQ(), canvasNr) : false;
        if (edgeEffectWrapper.nY()) {
            zNi = Vd(contentDrawScope, edgeEffectWrapper.az(), canvasNr) || zNi;
        }
        if (edgeEffectWrapper.S()) {
            zNi = GT(contentDrawScope, edgeEffectWrapper.gh(), canvasNr) || zNi;
        }
        if (edgeEffectWrapper.ck()) {
            zNi = pr(contentDrawScope, edgeEffectWrapper.Uo(), canvasNr) || zNi;
        }
        if (zNi) {
            this.overscrollEffect.gh();
        }
    }

    public GlowOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        UR(delegatableNode);
    }

    private final boolean GT(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return b(90.0f, Offset.O((((long) Float.floatToRawIntBits((-MathKt.roundToInt(Float.intBitsToFloat((int) (drawScope.t() >> 32)))) + drawScope.l(this.glowDrawPadding.t(drawScope.getLayoutDirection())))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean b(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean ni(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f3 = -Float.intBitsToFloat((int) (drawScope.t() & 4294967295L));
        float fL = drawScope.l(this.glowDrawPadding.rl(drawScope.getLayoutDirection()));
        return b(270.0f, Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fL)))), edgeEffect, canvas);
    }
}
