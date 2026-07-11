package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J#\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J+\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/foundation/StretchOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "pointerInputNode", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;)V", "", "jE", "()Z", "ZwA", "Landroid/widget/EdgeEffect;", TtmlNode.LEFT, "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "ni", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "Vd", TtmlNode.RIGHT, "GT", "bottom", CmcdConfiguration.KEY_PLAYBACK_RATE, "", "rotationDegrees", "edgeEffect", "b", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "jB", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "U", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroid/graphics/RenderNode;", "P5", "Landroid/graphics/RenderNode;", "_renderNode", "WKb", "()Landroid/graphics/RenderNode;", "renderNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1073:1\n1#2:1074\n69#3:1075\n65#3:1078\n69#3:1081\n65#3:1084\n70#4:1076\n60#4:1079\n70#4:1082\n60#4:1085\n22#5:1077\n22#5:1080\n22#5:1083\n22#5:1086\n293#6,27:1087\n120#6,7:1114\n321#6,10:1121\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n*L\n278#1:1075\n295#1:1078\n312#1:1081\n330#1:1084\n278#1:1076\n295#1:1079\n312#1:1082\n330#1:1085\n278#1:1077\n295#1:1080\n312#1:1083\n330#1:1086\n348#1:1087,27\n349#1:1114,7\n348#1:1121,10\n*E\n"})
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private RenderNode _renderNode;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final EdgeEffectWrapper edgeEffectWrapper;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    private final boolean Vd(EdgeEffect top, Canvas canvas) {
        return b(0.0f, top, canvas);
    }

    private final boolean b(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean GT(EdgeEffect right, Canvas canvas) {
        return b(90.0f, right, canvas);
    }

    private final RenderNode WKb() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeN = aC.n("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeN;
        return renderNodeN;
    }

    private final boolean ZwA() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.o() || edgeEffectWrapper.Z() || edgeEffectWrapper.S() || edgeEffectWrapper.WPU();
    }

    private final boolean jE() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.nY() || edgeEffectWrapper.g() || edgeEffectWrapper.ck() || edgeEffectWrapper.Ik();
    }

    private final boolean ni(EdgeEffect left, Canvas canvas) {
        return b(270.0f, left, canvas);
    }

    private final boolean pr(EdgeEffect bottom, Canvas canvas) {
        return b(180.0f, bottom, canvas);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        long j2;
        boolean zNi;
        float f3;
        float f4;
        this.overscrollEffect.Ik(contentDrawScope.t());
        Canvas canvasNr = AndroidCanvas_androidKt.nr(contentDrawScope.getDrawContext().KN());
        this.overscrollEffect.getRedrawSignal().getValue();
        if (Size.az(contentDrawScope.t())) {
            contentDrawScope.l2();
            return;
        }
        if (!canvasNr.isHardwareAccelerated()) {
            this.edgeEffectWrapper.J2();
            contentDrawScope.l2();
            return;
        }
        float fL = contentDrawScope.l(ClipScrollableContainerKt.rl());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean zJE = jE();
        boolean zZwA = ZwA();
        if (zJE && zZwA) {
            WKb().setPosition(0, 0, canvasNr.getWidth(), canvasNr.getHeight());
        } else if (zJE) {
            WKb().setPosition(0, 0, canvasNr.getWidth() + (MathKt.roundToInt(fL) * 2), canvasNr.getHeight());
        } else {
            if (!zZwA) {
                contentDrawScope.l2();
                return;
            }
            WKb().setPosition(0, 0, canvasNr.getWidth(), canvasNr.getHeight() + (MathKt.roundToInt(fL) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = WKb().beginRecording();
        if (edgeEffectWrapper.Z()) {
            EdgeEffect edgeEffectMUb = edgeEffectWrapper.mUb();
            GT(edgeEffectMUb, recordingCanvasBeginRecording);
            edgeEffectMUb.finish();
        }
        if (edgeEffectWrapper.o()) {
            EdgeEffect edgeEffectXMQ = edgeEffectWrapper.xMQ();
            zNi = ni(edgeEffectXMQ, recordingCanvasBeginRecording);
            if (edgeEffectWrapper.XQ()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.O() & 4294967295L));
                EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f16103n;
                j2 = 4294967295L;
                edgeEffectCompat.O(edgeEffectWrapper.mUb(), edgeEffectCompat.t(edgeEffectXMQ), 1 - fIntBitsToFloat);
            } else {
                j2 = 4294967295L;
            }
        } else {
            j2 = 4294967295L;
            zNi = false;
        }
        if (edgeEffectWrapper.g()) {
            EdgeEffect edgeEffectTy = edgeEffectWrapper.ty();
            pr(edgeEffectTy, recordingCanvasBeginRecording);
            edgeEffectTy.finish();
        }
        if (edgeEffectWrapper.nY()) {
            EdgeEffect edgeEffectAz = edgeEffectWrapper.az();
            zNi = Vd(edgeEffectAz, recordingCanvasBeginRecording) || zNi;
            if (edgeEffectWrapper.te()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.O() >> 32));
                EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.f16103n;
                edgeEffectCompat2.O(edgeEffectWrapper.ty(), edgeEffectCompat2.t(edgeEffectAz), fIntBitsToFloat2);
            }
        }
        if (edgeEffectWrapper.WPU()) {
            EdgeEffect edgeEffectQie = edgeEffectWrapper.qie();
            ni(edgeEffectQie, recordingCanvasBeginRecording);
            edgeEffectQie.finish();
        }
        if (edgeEffectWrapper.S()) {
            EdgeEffect edgeEffectGh = edgeEffectWrapper.gh();
            zNi = GT(edgeEffectGh, recordingCanvasBeginRecording) || zNi;
            if (edgeEffectWrapper.aYN()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.O() & j2));
                EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.f16103n;
                edgeEffectCompat3.O(edgeEffectWrapper.qie(), edgeEffectCompat3.t(edgeEffectGh), fIntBitsToFloat3);
            }
        }
        if (edgeEffectWrapper.Ik()) {
            EdgeEffect edgeEffectKN = edgeEffectWrapper.KN();
            Vd(edgeEffectKN, recordingCanvasBeginRecording);
            edgeEffectKN.finish();
        }
        if (edgeEffectWrapper.ck()) {
            EdgeEffect edgeEffectUo = edgeEffectWrapper.Uo();
            boolean z2 = pr(edgeEffectUo, recordingCanvasBeginRecording) || zNi;
            if (edgeEffectWrapper.r()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.O() >> 32));
                EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.f16103n;
                edgeEffectCompat4.O(edgeEffectWrapper.KN(), edgeEffectCompat4.t(edgeEffectUo), 1 - fIntBitsToFloat4);
            }
            zNi = z2;
        }
        if (zNi) {
            this.overscrollEffect.gh();
        }
        float f5 = zZwA ? 0.0f : fL;
        if (zJE) {
            fL = 0.0f;
        }
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvasRl = AndroidCanvas_androidKt.rl(recordingCanvasBeginRecording);
        long jT2 = contentDrawScope.t();
        Density density = contentDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvasKN = contentDrawScope.getDrawContext().KN();
        long jT3 = contentDrawScope.getDrawContext().t();
        GraphicsLayer graphicsLayer = contentDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        drawContext.O(contentDrawScope);
        drawContext.rl(layoutDirection);
        drawContext.gh(canvasRl);
        drawContext.xMQ(jT2);
        drawContext.Uo(null);
        canvasRl.O();
        try {
            contentDrawScope.getDrawContext().getTransform().nr(f5, fL);
            try {
                contentDrawScope.l2();
                canvasRl.n();
                DrawContext drawContext2 = contentDrawScope.getDrawContext();
                drawContext2.O(density);
                drawContext2.rl(layoutDirection2);
                drawContext2.gh(canvasKN);
                drawContext2.xMQ(jT3);
                drawContext2.Uo(graphicsLayer);
                WKb().endRecording();
                int iSave = canvasNr.save();
                canvasNr.translate(f3, f4);
                canvasNr.drawRenderNode(WKb());
                canvasNr.restoreToCount(iSave);
            } finally {
                contentDrawScope.getDrawContext().getTransform().nr(-f5, -fL);
            }
        } catch (Throwable th) {
            canvasRl.n();
            DrawContext drawContext3 = contentDrawScope.getDrawContext();
            drawContext3.O(density);
            drawContext3.rl(layoutDirection2);
            drawContext3.gh(canvasKN);
            drawContext3.xMQ(jT3);
            drawContext3.Uo(graphicsLayer);
            throw th;
        }
    }

    public StretchOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        UR(delegatableNode);
    }
}
