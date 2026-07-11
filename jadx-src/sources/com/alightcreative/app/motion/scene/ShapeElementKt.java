package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.yg;
import android.graphics.RectF;
import android.net.Uri;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle;
import com.alightcreative.app.motion.scene.liveshape.ShapeHandleIcon;
import com.alightcreative.app.motion.scene.liveshape.ShapeHandleStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yc.RP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\t\u001a¯\u0001\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+\"\u0014\u00101\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00102\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010+\"\u0014\u00103\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010+\"\u0014\u00105\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+\"\u0014\u00107\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+¨\u00068"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/PositionedShapeHandle;", "LWzY/s4;", "canvas", "", "radius", "LWzY/yg;", "paint", "", "drawHandleOutline", "(Lcom/alightcreative/app/motion/scene/liveshape/PositionedShapeHandle;LWzY/s4;FLWzY/yg;)V", "drawHandleIcon", "Lcom/alightcreative/app/motion/scene/KeyableTransform;", "transform", "", "startTime", "endTime", "Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "outline", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "fillColor", "Landroid/net/Uri;", "fillImage", "fillVideo", "", "id", "", "label", "inTime", "outTime", "Lcom/alightcreative/app/motion/scene/FillType;", "fillType", "", "loop", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "liveShape", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "blendingMode", "Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "stroke", "Lcom/alightcreative/app/motion/scene/SceneElement;", "ShapeElement", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;IILcom/alightcreative/app/motion/scene/CompoundCubicBSpline;Lcom/alightcreative/app/motion/scene/Keyable;Landroid/net/Uri;Landroid/net/Uri;JLjava/lang/String;IILcom/alightcreative/app/motion/scene/FillType;ZLcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;Lcom/alightcreative/app/motion/scene/BlendingMode;Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;)Lcom/alightcreative/app/motion/scene/SceneElement;", "LWzY/yg;", "Landroid/graphics/RectF;", "scratchRectF", "Landroid/graphics/RectF;", "selectionPaintBase", "addPointPaint", "addSegmentPaint", "selectionPaintKnot", "selectionPaintKnotActive", "selectionPaintKnotUnselect", "selectionPaintKnotActiveMain", "selectionCurveActive", "keyframeOutlinePaint", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ShapeElementKt {
    private static final WzY.yg addPointPaint;
    private static final WzY.yg addSegmentPaint;
    private static final WzY.yg keyframeOutlinePaint;
    private static final WzY.yg paint = new WzY.yg();
    private static final RectF scratchRectF = new RectF();
    private static final WzY.yg selectionCurveActive;
    private static final WzY.yg selectionPaintBase;
    private static final WzY.yg selectionPaintKnot;
    private static final WzY.yg selectionPaintKnotActive;
    private static final WzY.yg selectionPaintKnotActiveMain;
    private static final WzY.yg selectionPaintKnotUnselect;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShapeHandleStyle.values().length];
            try {
                iArr[ShapeHandleStyle.Round.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeHandleStyle.Square.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShapeHandleIcon.values().length];
            try {
                iArr2[ShapeHandleIcon.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShapeHandleIcon.Dot.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShapeHandleIcon.HollowDot.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShapeHandleIcon.Grip.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ShapeHandleIcon.HollowArrow.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ShapeHandleIcon.Arrow.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        WzY.yg ygVar = new WzY.yg();
        yg.w6 w6Var = yg.w6.f11694O;
        ygVar.ty(w6Var);
        ygVar.az(3.0f);
        SolidColor.Companion companion = SolidColor.INSTANCE;
        ygVar.gh(companion.getBLACK());
        selectionPaintBase = ygVar;
        WzY.yg ygVar2 = new WzY.yg();
        ygVar2.ty(w6Var);
        ygVar2.az(3.0f);
        ygVar2.gh(companion.getBLACK());
        addPointPaint = ygVar2;
        WzY.yg ygVar3 = new WzY.yg();
        ygVar3.ty(w6Var);
        ygVar3.az(2.0f);
        ygVar3.gh(companion.getBLACK());
        ygVar3.xMQ(0.4f);
        addSegmentPaint = ygVar3;
        WzY.yg ygVar4 = new WzY.yg();
        yg.w6 w6Var2 = yg.w6.f11697t;
        ygVar4.ty(w6Var2);
        ygVar4.gh(companion.getBLACK());
        selectionPaintKnot = ygVar4;
        WzY.yg ygVar5 = new WzY.yg();
        ygVar5.ty(w6Var2);
        ygVar5.gh(companion.getP2());
        selectionPaintKnotActive = ygVar5;
        WzY.yg ygVar6 = new WzY.yg();
        ygVar6.ty(w6Var2);
        ygVar6.gh(companion.getP6());
        selectionPaintKnotUnselect = ygVar6;
        WzY.yg ygVar7 = new WzY.yg();
        ygVar7.ty(w6Var2);
        ygVar7.gh(HI0.qf.t(-16711768));
        selectionPaintKnotActiveMain = ygVar7;
        WzY.yg ygVar8 = new WzY.yg();
        ygVar8.ty(w6Var);
        ygVar8.az(5.0f);
        ygVar8.gh(HI0.qf.t(-16711768));
        selectionCurveActive = ygVar8;
        WzY.yg ygVar9 = new WzY.yg();
        ygVar9.ty(w6Var);
        ygVar9.gh(companion.getBLACK());
        keyframeOutlinePaint = ygVar9;
    }

    public static final SceneElement ShapeElement(KeyableTransform transform, int i2, int i3, CompoundCubicBSpline outline, Keyable<SolidColor> fillColor, Uri uri, Uri uri2, long j2, String label, int i5, int i7, FillType fillType, boolean z2, LiveShapeRef liveShape, BlendingMode blendingMode, KeyableEdgeDecoration stroke) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(liveShape, "liveShape");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        return new SceneElement(SceneElementType.Shape, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, transform, fillColor, uri, uri2, null, fillType, null, CubicBSplineKt.keyable(outline), null, null, liveShape, i5, i7, z2, null, null, blendingMode, SceneKt.getEMPTY_SCENE(), null, null, null, null, null, null, stroke, null, null, false, null, null, false, null, null, -1104096256, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawHandleIcon(PositionedShapeHandle positionedShapeHandle, WzY.s4 s4Var, float f3, WzY.yg ygVar) {
        float fKN = f3 / RP.KN(s4Var.ck().getUserPreviewMode());
        switch (WhenMappings.$EnumSwitchMapping$1[positionedShapeHandle.getIcon().ordinal()]) {
            case 1:
                return;
            case 2:
                ygVar.ty(yg.w6.f11697t);
                s4Var.Z(positionedShapeHandle.getX(), positionedShapeHandle.getY(), fKN / 2.0f, ygVar);
                return;
            case 3:
                ygVar.ty(yg.w6.f11694O);
                ygVar.az(fKN / 8.0f);
                s4Var.Z(positionedShapeHandle.getX(), positionedShapeHandle.getY(), fKN / 2.0f, ygVar);
                return;
            case 4:
                ygVar.ty(yg.w6.f11694O);
                ygVar.az(fKN / 8.0f);
                Vector2D vector2DTimes = GeometryKt.times(positionedShapeHandle.getAxis(), fKN);
                Vector2D vector2DPerpCw = GeometryKt.perpCw(vector2DTimes);
                WzY.SPz.KN(s4Var, GeometryKt.minus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes, 4.0f)), GeometryKt.div(vector2DPerpCw, 2.0f)), GeometryKt.plus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes, 4.0f)), GeometryKt.div(vector2DPerpCw, 2.0f)), ygVar);
                WzY.SPz.KN(s4Var, GeometryKt.minus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes, 4.0f)), GeometryKt.div(vector2DPerpCw, 2.0f)), GeometryKt.plus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes, 4.0f)), GeometryKt.div(vector2DPerpCw, 2.0f)), ygVar);
                return;
            case 5:
                ygVar.ty(yg.w6.f11694O);
                ygVar.az(fKN / 8.0f);
                Vector2D vector2DTimes2 = GeometryKt.times(positionedShapeHandle.getAxis(), fKN);
                Vector2D vector2DPerpCw2 = GeometryKt.perpCw(vector2DTimes2);
                WzY.SPz.KN(s4Var, GeometryKt.minus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 4.0f)), GeometryKt.div(vector2DPerpCw2, 2.0f)), GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 2.0f)), ygVar);
                WzY.SPz.KN(s4Var, GeometryKt.plus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 4.0f)), GeometryKt.div(vector2DPerpCw2, 2.0f)), GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 2.0f)), ygVar);
                WzY.SPz.KN(s4Var, GeometryKt.minus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 4.0f)), GeometryKt.div(vector2DPerpCw2, 2.0f)), GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 2.0f)), ygVar);
                WzY.SPz.KN(s4Var, GeometryKt.plus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 4.0f)), GeometryKt.div(vector2DPerpCw2, 2.0f)), GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes2, 2.0f)), ygVar);
                return;
            case 6:
                ygVar.ty(yg.w6.f11697t);
                Vector2D vector2DTimes3 = GeometryKt.times(positionedShapeHandle.getAxis(), fKN);
                Vector2D vector2DPerpCw3 = GeometryKt.perpCw(vector2DTimes3);
                C1487z c1487z = new C1487z();
                c1487z.k(GeometryKt.minus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 4.0f)), GeometryKt.div(vector2DPerpCw3, 2.0f)));
                c1487z.D(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.minus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 4.0f)), GeometryKt.div(vector2DPerpCw3, 2.0f)));
                s4Var.te(c1487z, ygVar);
                c1487z.ijL();
                c1487z.k(GeometryKt.minus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 4.0f)), GeometryKt.div(vector2DPerpCw3, 2.0f)));
                c1487z.D(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(positionedShapeHandle.getPosition(), GeometryKt.div(vector2DTimes3, 4.0f)), GeometryKt.div(vector2DPerpCw3, 2.0f)));
                s4Var.te(c1487z, ygVar);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawHandleOutline(PositionedShapeHandle positionedShapeHandle, WzY.s4 s4Var, float f3, WzY.yg ygVar) {
        float fKN = f3 / RP.KN(s4Var.ck().getUserPreviewMode());
        int i2 = WhenMappings.$EnumSwitchMapping$0[positionedShapeHandle.getStyle().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                Vector2D vector2DTimes = GeometryKt.times(positionedShapeHandle.getAxis(), fKN);
                Vector2D vector2DPerpCw = GeometryKt.perpCw(vector2DTimes);
                Vector2D vector2D = new Vector2D(positionedShapeHandle.getX(), positionedShapeHandle.getY());
                C1487z c1487z = new C1487z();
                c1487z.k(GeometryKt.minus(GeometryKt.minus(vector2D, vector2DTimes), vector2DPerpCw));
                c1487z.D(GeometryKt.plus(GeometryKt.minus(vector2D, vector2DTimes), vector2DPerpCw));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, vector2DTimes), vector2DPerpCw));
                c1487z.D(GeometryKt.minus(GeometryKt.plus(vector2D, vector2DTimes), vector2DPerpCw));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        s4Var.Z(positionedShapeHandle.getX(), positionedShapeHandle.getY(), fKN * s4Var.Uo(), ygVar);
    }
}
