package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c*\f\b\u0000\u0010\u001f\"\u00020\u001e2\u00020\u001e*\f\b\u0000\u0010!\"\u00020 2\u00020 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$²\u0006\u000e\u0010\"\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"", "gh", "()Ljava/lang/Object;", "", "jsonContent", "Landroidx/constraintlayout/compose/ConstraintSet;", "O", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/constraintlayout/core/state/WidgetFrame;", "frame", "Landroidx/compose/ui/unit/IntOffset;", "offset", "", "az", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;J)V", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "mUb", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "qie", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeastWrapContent", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State;", "SolverState", "startConstraint", "endConstraint", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2303:1\n359#1,2:2390\n361#1,2:2398\n363#1,7:2401\n401#1,10:2408\n400#1:2418\n412#1,4:2419\n416#1,7:2424\n446#1,12:2431\n472#1:2443\n768#1,3:2604\n771#1,8:2613\n796#1,3:2621\n795#1:2624\n802#1,5:2659\n807#1,2:2665\n829#1,9:2667\n838#1,7:2713\n845#1,16:2724\n1225#2,6:2304\n1225#2,6:2310\n1225#2,3:2316\n1228#2,3:2320\n1225#2,6:2323\n1225#2,6:2329\n1225#2,6:2335\n1225#2,6:2342\n1225#2,6:2348\n1225#2,6:2354\n1225#2,6:2360\n1225#2,6:2366\n1225#2,6:2372\n1225#2,6:2378\n1225#2,6:2384\n1225#2,6:2392\n1225#2,6:2444\n1225#2,6:2450\n1225#2,6:2456\n1225#2,6:2462\n1225#2,6:2468\n1225#2,6:2474\n1225#2,6:2480\n1225#2,6:2500\n1225#2,6:2526\n1225#2,6:2532\n1225#2,6:2539\n1225#2,6:2545\n1225#2,6:2588\n1225#2,6:2598\n1225#2,6:2607\n1225#2,6:2740\n1#3:2319\n1#3:2400\n1#3:2508\n1#3:2641\n77#4:2341\n77#4:2423\n77#4:2538\n77#4:2664\n139#5:2486\n134#5,13:2487\n147#5,2:2506\n152#5:2509\n168#5,14:2510\n167#5:2524\n183#5:2525\n139#5:2625\n134#5,15:2626\n152#5:2642\n168#5,14:2643\n167#5:2657\n183#5:2658\n71#6:2551\n67#6,7:2552\n74#6:2587\n78#6:2597\n71#6:2676\n67#6,7:2677\n74#6:2712\n78#6:2723\n79#7,6:2559\n86#7,4:2574\n90#7,2:2584\n94#7:2596\n79#7,6:2684\n86#7,4:2699\n90#7,2:2709\n94#7:2722\n368#8,9:2565\n377#8:2586\n378#8,2:2594\n368#8,9:2690\n377#8:2711\n378#8,2:2720\n4034#9,6:2578\n4034#9,6:2703\n33#10,6:2746\n81#11:2752\n107#11,2:2753\n81#11:2755\n107#11,2:2756\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n496#1:2390,2\n496#1:2398,2\n496#1:2401,7\n496#1:2408,10\n496#1:2418\n496#1:2419,4\n496#1:2424,7\n496#1:2431,12\n496#1:2443\n886#1:2604,3\n886#1:2613,8\n886#1:2621,3\n886#1:2624\n886#1:2659,5\n886#1:2665,2\n886#1:2667,9\n886#1:2713,7\n886#1:2724,16\n360#1:2304,6\n361#1:2310,6\n362#1:2316,3\n362#1:2320,3\n363#1:2323,6\n364#1:2329,6\n367#1:2335,6\n416#1:2342,6\n417#1:2348,6\n418#1:2354,6\n419#1:2360,6\n420#1:2366,6\n422#1:2372,6\n446#1:2378,6\n455#1:2384,6\n496#1:2392,6\n770#1:2444,6\n771#1:2450,6\n772#1:2456,6\n773#1:2462,6\n774#1:2468,6\n776#1:2474,6\n778#1:2480,6\n795#1:2500,6\n803#1:2526,6\n805#1:2532,6\n807#1:2539,6\n808#1:2545,6\n840#1:2588,6\n848#1:2598,6\n886#1:2607,6\n1350#1:2740,6\n496#1:2400\n795#1:2508\n886#1:2641\n415#1:2341\n496#1:2423\n806#1:2538\n886#1:2664\n795#1:2486\n795#1:2487,13\n795#1:2506,2\n795#1:2509\n795#1:2510,14\n795#1:2524\n795#1:2525\n886#1:2625\n886#1:2626,15\n886#1:2642\n886#1:2643,14\n886#1:2657\n886#1:2658\n837#1:2551\n837#1:2552,7\n837#1:2587\n837#1:2597\n886#1:2676\n886#1:2677,7\n886#1:2712\n886#1:2723\n837#1:2559,6\n837#1:2574,4\n837#1:2584,2\n837#1:2596\n886#1:2684,6\n886#1:2699,4\n886#1:2709,2\n886#1:2722\n837#1:2565,9\n837#1:2586\n837#1:2594,2\n886#1:2690,9\n886#1:2711\n886#1:2720,2\n837#1:2578,6\n886#1:2703,6\n2274#1:2746,6\n770#1:2752\n770#1:2753,2\n771#1:2755\n771#1:2756,2\n*E\n"})
public final class ConstraintLayoutKt {
    public static final ConstraintSet O(String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    public static final void az(Placeable.PlacementScope placementScope, Placeable placeable, final WidgetFrame widgetFrame, long j2) {
        if (widgetFrame.f35464r == 8) {
            return;
        }
        if (widgetFrame.az()) {
            Placeable.PlacementScope.gh(placementScope, placeable, IntOffsetKt.n(widgetFrame.rl - IntOffset.gh(j2), widgetFrame.f35465t - IntOffset.qie(j2)), 0.0f, 2, null);
        } else {
            placementScope.S(placeable, widgetFrame.rl - IntOffset.gh(j2), widgetFrame.f35465t - IntOffset.qie(j2), Float.isNaN(widgetFrame.az) ? 0.0f : widgetFrame.az, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    n(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                public final void n(GraphicsLayerScope graphicsLayerScope) {
                    if (!Float.isNaN(widgetFrame.J2) || !Float.isNaN(widgetFrame.Uo)) {
                        graphicsLayerScope.tUK(TransformOriginKt.n(Float.isNaN(widgetFrame.J2) ? 0.5f : widgetFrame.J2, Float.isNaN(widgetFrame.Uo) ? 0.5f : widgetFrame.Uo));
                    }
                    if (!Float.isNaN(widgetFrame.KN)) {
                        graphicsLayerScope.mUb(widgetFrame.KN);
                    }
                    if (!Float.isNaN(widgetFrame.xMQ)) {
                        graphicsLayerScope.gh(widgetFrame.xMQ);
                    }
                    if (!Float.isNaN(widgetFrame.mUb)) {
                        graphicsLayerScope.qie(widgetFrame.mUb);
                    }
                    if (!Float.isNaN(widgetFrame.gh)) {
                        graphicsLayerScope.ty(widgetFrame.gh);
                    }
                    if (!Float.isNaN(widgetFrame.qie)) {
                        graphicsLayerScope.O(widgetFrame.qie);
                    }
                    if (!Float.isNaN(widgetFrame.az)) {
                        graphicsLayerScope.wTp(widgetFrame.az);
                    }
                    if (!Float.isNaN(widgetFrame.ty) || !Float.isNaN(widgetFrame.HI)) {
                        graphicsLayerScope.Uo(Float.isNaN(widgetFrame.ty) ? 1.0f : widgetFrame.ty);
                        graphicsLayerScope.az(Float.isNaN(widgetFrame.HI) ? 1.0f : widgetFrame.HI);
                    }
                    if (Float.isNaN(widgetFrame.ck)) {
                        return;
                    }
                    graphicsLayerScope.rl(widgetFrame.ck);
                }
            });
        }
    }

    public static final Object gh() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    public static final Dimension.MaxCoercible qie(Dimension.Coercible coercible) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin().t("wrap");
        return dimensionDescription;
    }

    public static /* synthetic */ void ty(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = IntOffset.INSTANCE.rl();
        }
        az(placementScope, placeable, widgetFrame, j2);
    }

    public static final void mUb(State state, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            Object objN = LayoutIdKt.n(measurable);
            if (objN == null && (objN = ConstraintLayoutTagKt.n(measurable)) == null) {
                objN = gh();
            }
            state.o(objN.toString(), measurable);
            Object objRl = ConstraintLayoutTagKt.rl(measurable);
            if (objRl != null && (objRl instanceof String) && (objN instanceof String)) {
                state.g((String) objN, (String) objRl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet n(MutableState mutableState) {
        return (ConstraintSet) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(MutableState mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet t(MutableState mutableState) {
        return (ConstraintSet) mutableState.getValue();
    }
}
