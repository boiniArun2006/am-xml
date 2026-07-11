package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jb\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J;\u0010,\u001a\u00020\u000f2\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010 \u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J;\u00105\u001a\u00020\u000f*\u00020.2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u00106J.\u0010<\u001a\u00020\u000f*\u00020.2\u0006\u00107\u001a\u0002012\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J|\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u000f2\n\u0010&\u001a\u00060$j\u0002`%¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u0010HJ/\u0010K\u001a\u00020\u000f*\u00020.2\b\b\u0002\u0010I\u001a\u00020\u00162\b\b\u0002\u0010J\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020\u0016¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u000f¢\u0006\u0004\bM\u0010HJ5\u0010P\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0017\u0010\u001e\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001e\u0010_\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "optimizationLevel", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "fD", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "Landroidx/constraintlayout/compose/CompositionSource;", "source", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "invalidateOnConstraintsCallback", "", "E2", "(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", "transition", "", "progress", "remeasure", "X", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", "location", "", "types", JavetError.PARAMETER_COUNT, "nY", "(Ljava/lang/StringBuilder;[F[I[II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "parentWidth", "parentHeight", "Landroidx/constraintlayout/core/state/WidgetFrame;", "startFrame", "drawPath", "drawKeyPositions", "ViF", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;ZZ)V", "frame", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "aYN", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "", "Landroidx/compose/ui/layout/Placeable;", "placeableMap", "compositionSource", "Landroidx/compose/ui/unit/IntSize;", "e", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;Ljava/util/Map;IFLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)J", "g", "(Ljava/lang/StringBuilder;)V", "O", "()V", "drawBounds", "drawPaths", "WPU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;ZZZ)V", "S", TtmlNode.START, TtmlNode.END, "iF", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/TransitionImpl;F)V", "gh", "Z", "DEBUG", "qie", "F", "lastProgressInInterpolation", "Landroidx/constraintlayout/core/state/Transition;", "az", "Landroidx/constraintlayout/core/state/Transition;", "te", "()Landroidx/constraintlayout/core/state/Transition;", "ty", "Landroidx/compose/ui/unit/Constraints;", "oldConstraints", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n33#2,6:582\n33#2,6:588\n33#2,6:594\n33#2,6:600\n33#2,4:606\n38#2:617\n128#3,7:610\n1#4:618\n169#5:619\n*S KotlinDebug\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n*L\n63#1:582,6\n69#1:588,6\n224#1:594,6\n289#1:600,6\n330#1:606,4\n330#1:617\n337#1:610,7\n48#1:619\n*E\n"})
public final class MotionMeasurer extends Measurer2 {

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.state.Transition transition;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final boolean DEBUG;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float lastProgressInInterpolation;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private Constraints oldConstraints;

    private final boolean E2(long constraints, CompositionSource source, ShouldInvalidateCallback invalidateOnConstraintsCallback) {
        if (this.transition.T() || getFrameCache().isEmpty()) {
            return true;
        }
        Constraints constraints2 = this.oldConstraints;
        if (constraints2 != null && invalidateOnConstraintsCallback != null) {
            Intrinsics.checkNotNull(constraints2);
            if (invalidateOnConstraintsCallback.n(constraints2.getValue(), constraints)) {
                return true;
            }
        } else if ((Constraints.xMQ(constraints) && !getState().S(Constraints.gh(constraints))) || (Constraints.mUb(constraints) && !getState().WPU(Constraints.qie(constraints)))) {
            return true;
        }
        return source == CompositionSource.Content;
    }

    private final void ViF(DrawScope drawScope, float f3, float f4, WidgetFrame widgetFrame, boolean z2, boolean z3) {
        new MotionRenderDebug(23.0f).n(AndroidCanvas_androidKt.nr(drawScope.getDrawContext().KN()), this.transition.ViF(widgetFrame.f35462n.HI), 1000, (int) f3, (int) f4, z2, z3);
    }

    private final void X(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List measurables, int optimizationLevel, float progress, boolean remeasure) {
        WidgetFrame widgetFrameZ;
        this.lastProgressInInterpolation = progress;
        int i2 = 0;
        if (remeasure) {
            this.transition.az();
            o();
            getState().E2(Constraints.mUb(constraints) ? androidx.constraintlayout.core.state.Dimension.rl(Constraints.qie(constraints)) : androidx.constraintlayout.core.state.Dimension.KN().HI(Constraints.ty(constraints)));
            getState().az(Constraints.xMQ(constraints) ? androidx.constraintlayout.core.state.Dimension.rl(Constraints.gh(constraints)) : androidx.constraintlayout.core.state.Dimension.KN().HI(Constraints.az(constraints)));
            getState().N(constraints);
            getState().nY(layoutDirection == LayoutDirection.f34161t);
            fD(optimizationLevel, constraintSetStart, measurables, constraints);
            this.transition.rV9(getRoot(), 0);
            fD(optimizationLevel, constraintSetEnd, measurables, constraints);
            this.transition.rV9(getRoot(), 1);
            if (transition != null) {
                transition.O(this.transition);
            }
        } else {
            ConstraintLayoutKt.mUb(getState(), measurables);
        }
        this.transition.X(getRoot().J(), getRoot().nY(), progress);
        getRoot().vl(this.transition.WPU());
        getRoot().a63(this.transition.S());
        ArrayList arrayListMh = getRoot().Mh();
        int size = arrayListMh.size();
        while (true) {
            if (i2 >= size) {
                break;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i2);
            Object objXQ = constraintWidget.XQ();
            Measurable measurable = objXQ instanceof Measurable ? (Measurable) objXQ : null;
            if (measurable != null && (widgetFrameZ = this.transition.Z(constraintWidget)) != null) {
                getPlaceables().put(measurable, measurable.dR0(Constraints.INSTANCE.t(widgetFrameZ.aYN(), widgetFrameZ.mUb())));
                getFrameCache().put(MeasurerKt.n(measurable), widgetFrameZ);
            }
            i2++;
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            O();
        }
    }

    private final void aYN(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j2) {
        if (widgetFrame.az()) {
            DrawScope.h(drawScope, j2, OffsetKt.n(widgetFrame.rl, widgetFrame.f35465t), SizeKt.n(widgetFrame.aYN(), widgetFrame.mUb()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.mUb)) {
            matrix.preRotate(widgetFrame.mUb, widgetFrame.O(), widgetFrame.J2());
        }
        matrix.preScale(Float.isNaN(widgetFrame.ty) ? 1.0f : widgetFrame.ty, Float.isNaN(widgetFrame.HI) ? 1.0f : widgetFrame.HI, widgetFrame.O(), widgetFrame.J2());
        int i2 = widgetFrame.rl;
        int i3 = widgetFrame.f35465t;
        int i5 = widgetFrame.nr;
        int i7 = widgetFrame.f35460O;
        float[] fArr = {i2, i3, i5, i3, i5, i7, i2, i7};
        matrix.mapPoints(fArr);
        DrawScope.mI(drawScope, j2, OffsetKt.n(fArr[0], fArr[1]), OffsetKt.n(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.mI(drawScope, j2, OffsetKt.n(fArr[2], fArr[3]), OffsetKt.n(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.mI(drawScope, j2, OffsetKt.n(fArr[4], fArr[5]), OffsetKt.n(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.mI(drawScope, j2, OffsetKt.n(fArr[6], fArr[7]), OffsetKt.n(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    private final void nY(StringBuilder json, float[] location, int[] types, int[] progress, int count) {
        if (count == 0) {
            return;
        }
        json.append("keyTypes : [");
        for (int i2 = 0; i2 < count; i2++) {
            int i3 = types[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(i3);
            sb.append(',');
            json.append(sb.toString());
        }
        json.append("],\n");
        json.append("keyPos : [");
        int i5 = count * 2;
        for (int i7 = 0; i7 < i5; i7++) {
            float f3 = location[i7];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(f3);
            sb2.append(',');
            json.append(sb2.toString());
        }
        json.append("],\n ");
        json.append("keyFrames : [");
        for (int i8 = 0; i8 < count; i8++) {
            int i9 = progress[i8];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(i9);
            sb3.append(',');
            json.append(sb3.toString());
        }
        json.append("],\n ");
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public void O() {
        MotionMeasurer motionMeasurer = this;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        motionMeasurer.g(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList arrayListMh = motionMeasurer.getRoot().Mh();
        int size = arrayListMh.size();
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i2);
            WidgetFrame widgetFrameTe = motionMeasurer.transition.te(constraintWidget.HI);
            WidgetFrame widgetFrameO = motionMeasurer.transition.o(constraintWidget.HI);
            WidgetFrame widgetFrameXQ = motionMeasurer.transition.XQ(constraintWidget.HI);
            float[] fArrNY = motionMeasurer.transition.nY(constraintWidget.HI);
            int iAYN = motionMeasurer.transition.aYN(constraintWidget.HI, fArr, iArr, iArr2);
            sb.append(' ' + constraintWidget.HI + ": {");
            sb.append(" interpolated : ");
            widgetFrameXQ.HI(sb, true);
            sb.append(", start : ");
            widgetFrameTe.ty(sb);
            sb.append(", end : ");
            widgetFrameO.ty(sb);
            motionMeasurer.nY(sb, fArr, iArr, iArr2, iAYN);
            sb.append(" path : [");
            for (float f3 : fArrNY) {
                sb.append(' ' + f3 + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
            i2++;
            motionMeasurer = this;
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.xMQ(sb.toString());
        }
    }

    public final void S() {
        this.transition.az();
        getFrameCache().clear();
    }

    public final void WPU(DrawScope drawScope, boolean z2, boolean z3, boolean z4) {
        WidgetFrame widgetFrame;
        PathEffect pathEffect;
        PathEffect pathEffectN = PathEffect.INSTANCE.n(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList arrayListMh = getRoot().Mh();
        int size = arrayListMh.size();
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i2);
            WidgetFrame widgetFrameG = this.transition.g(constraintWidget);
            WidgetFrame widgetFrameR = this.transition.r(constraintWidget);
            if (z2) {
                Color.Companion companion = Color.INSTANCE;
                aYN(drawScope, widgetFrameG, pathEffectN, companion.rl());
                aYN(drawScope, widgetFrameR, pathEffectN, companion.rl());
                drawScope.getDrawContext().getTransform().nr(2.0f, 2.0f);
                try {
                    aYN(drawScope, widgetFrameG, pathEffectN, companion.KN());
                    widgetFrame = widgetFrameG;
                    aYN(drawScope, widgetFrameR, pathEffectN, companion.KN());
                    pathEffect = pathEffectN;
                } finally {
                    drawScope.getDrawContext().getTransform().nr(-2.0f, -2.0f);
                }
            } else {
                widgetFrame = widgetFrameG;
                pathEffect = pathEffectN;
            }
            ViF(drawScope, Size.gh(drawScope.t()), Size.xMQ(drawScope.t()), widgetFrame, z3, z4);
            i2++;
            pathEffectN = pathEffect;
        }
    }

    public final void g(StringBuilder json) {
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().J() + " ,");
        json.append("  bottom:  " + getRoot().nY() + " ,");
        json.append(" } }");
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public MotionMeasurer(final Density density) {
        super(density);
        this.transition = new androidx.constraintlayout.core.state.Transition(new CorePixelDp() { // from class: androidx.constraintlayout.compose.n
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float n(float f3) {
                return MotionMeasurer.T(density, f3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T(Density density, float f3) {
        return density.l(Dp.KN(f3));
    }

    private final void fD(int optimizationLevel, ConstraintSet constraintSet, List measurables, long constraints) {
        Measurable measurable;
        String string;
        Object objN;
        getState().XQ();
        constraintSet.n(getState(), measurables);
        ConstraintLayoutKt.mUb(getState(), measurables);
        getState().n(getRoot());
        ArrayList arrayListMh = getRoot().Mh();
        int size = arrayListMh.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) arrayListMh.get(i2)).EWS(true);
        }
        nr(constraints);
        getRoot().A();
        if (this.DEBUG) {
            getRoot().i("ConstraintLayout");
            ArrayList arrayListMh2 = getRoot().Mh();
            int size2 = arrayListMh2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh2.get(i3);
                Object objXQ = constraintWidget.XQ();
                if (objXQ instanceof Measurable) {
                    measurable = (Measurable) objXQ;
                } else {
                    measurable = null;
                }
                if (measurable == null || (objN = LayoutIdKt.n(measurable)) == null || (string = objN.toString()) == null) {
                    string = "NOTAG";
                }
                constraintWidget.i(string);
            }
        }
        getRoot().I4p(optimizationLevel);
        getRoot().uQ(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final long e(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List measurables, Map placeableMap, int optimizationLevel, float progress, CompositionSource compositionSource, ShouldInvalidateCallback invalidateOnConstraintsCallback) {
        long j2;
        MotionMeasurer motionMeasurer;
        LayoutInformationReceiver layoutInformationReceiver;
        LayoutInformationReceiver layoutInformationReceiver2;
        Z(placeableMap);
        boolean zE2 = E2(constraints, compositionSource, invalidateOnConstraintsCallback);
        if (this.lastProgressInInterpolation != progress || ((((layoutInformationReceiver = getLayoutInformationReceiver()) == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) && ((layoutInformationReceiver2 = getLayoutInformationReceiver()) == null || layoutInformationReceiver2.getForcedHeight() != Integer.MIN_VALUE)) || zE2)) {
            j2 = constraints;
            motionMeasurer = this;
            motionMeasurer.X(j2, layoutDirection, constraintSetStart, constraintSetEnd, transition, measurables, optimizationLevel, progress, zE2);
        } else {
            j2 = constraints;
            motionMeasurer = this;
        }
        motionMeasurer.oldConstraints = Constraints.n(j2);
        return IntSizeKt.n(getRoot().J(), getRoot().nY());
    }

    public final void iF(ConstraintSet start, ConstraintSet end, LayoutDirection layoutDirection, TransitionImpl transition, float progress) {
        boolean z2;
        S();
        State state = getState();
        if (layoutDirection == LayoutDirection.f34161t) {
            z2 = true;
        } else {
            z2 = false;
        }
        state.nY(z2);
        start.n(getState(), CollectionsKt.emptyList());
        start.KN(this.transition, 0);
        getState().n(getRoot());
        this.transition.rV9(getRoot(), 0);
        start.n(getState(), CollectionsKt.emptyList());
        end.KN(this.transition, 1);
        getState().n(getRoot());
        this.transition.rV9(getRoot(), 1);
        this.transition.X(0, 0, progress);
        transition.nr(this.transition);
    }
}
