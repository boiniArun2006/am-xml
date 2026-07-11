package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\t\u001a¶\u0001\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f28\b\u0002\u0010\u0014\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d2\u0006\u0010\u001b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aW\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#\u001a/\u0010$\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/SwipeableState;", "state", "", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "from", "to", "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "J2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "offset", "", "", "nr", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "t", "(FFLjava/util/Set;Lkotlin/jvm/functions/Function2;FF)F", "O", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,881:1\n1247#2,6:882\n1247#2,6:888\n1247#2,6:894\n1247#2,6:900\n1247#2,6:906\n135#3:912\n766#4:913\n857#4,2:914\n766#4:929\n857#4,2:930\n288#4,2:945\n171#5,13:916\n482#5,13:932\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n474#1:882,6\n499#1:888,6\n506#1:894,6\n507#1:900,6\n512#1:906,6\n573#1:912\n733#1:913\n733#1:914,2\n734#1:929\n734#1:930,2\n791#1:945,2\n733#1:916,13\n734#1:932,13\n*E\n"})
public final class SwipeableKt {
    private static final List nr(float f3, Set set) {
        Object obj;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= ((double) f3) + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Object obj3 = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i3);
                    float fFloatValue2 = ((Number) obj4).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj4;
                        fFloatValue = fFloatValue2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Float f4 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : set2) {
            if (((Number) obj5).floatValue() >= ((double) f3) - 0.001d) {
                arrayList2.add(obj5);
            }
        }
        if (!arrayList2.isEmpty()) {
            Object obj6 = arrayList2.get(0);
            float fFloatValue3 = ((Number) obj6).floatValue();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj7 = arrayList2.get(i2);
                    float fFloatValue4 = ((Number) obj7).floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        obj6 = obj7;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            obj3 = obj6;
        }
        Float f5 = (Float) obj3;
        return f4 == null ? CollectionsKt.listOfNotNull(f5) : f5 == null ? CollectionsKt.listOf(f4) : Intrinsics.areEqual(f4, f5) ? CollectionsKt.listOf(f4) : CollectionsKt.listOf((Object[]) new Float[]{f4, f5});
    }

    public static final Modifier J2(Modifier modifier, final SwipeableState swipeableState, final Map map, final Orientation orientation, final boolean z2, final boolean z3, final MutableInteractionSource mutableInteractionSource, final Function2 function2, final ResistanceConfig resistanceConfig, final float f3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("swipeable");
                    inspectorInfo.getProperties().n("state", swipeableState);
                    inspectorInfo.getProperties().n("anchors", map);
                    inspectorInfo.getProperties().n("orientation", orientation);
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("reverseDirection", Boolean.valueOf(z3));
                    inspectorInfo.getProperties().n("interactionSource", mutableInteractionSource);
                    inspectorInfo.getProperties().n("thresholds", function2);
                    inspectorInfo.getProperties().n(inFlMLxL.bTQAUXymnh, resistanceConfig);
                    inspectorInfo.getProperties().n("velocityThreshold", Dp.nr(f3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(43594985);
                if (ComposerKt.v()) {
                    ComposerKt.p5(43594985, i2, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.ty(CompositionLocalsKt.J2());
                swipeableState.qie(map);
                Map map2 = map;
                Object obj = swipeableState;
                boolean zP5 = composer.p5(obj) | composer.E2(map) | composer.p5(resistanceConfig) | composer.p5(function2) | composer.p5(density) | composer.rl(f3);
                SwipeableState swipeableState2 = swipeableState;
                Map map3 = map;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                Function2 function22 = function2;
                float f4 = f3;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    Object swipeableKt$swipeable$3$3$1 = new SwipeableKt$swipeable$3$3$1(swipeableState2, map3, resistanceConfig2, density, function22, f4, null);
                    composer.o(swipeableKt$swipeable$3$3$1);
                    objIF = swipeableKt$swipeable$3$3$1;
                }
                EffectsKt.nr(map2, obj, (Function2) objIF, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zAYN = swipeableState.aYN();
                DraggableState draggableState = swipeableState.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z4 = z2;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                boolean zP52 = composer.p5(swipeableState);
                SwipeableState swipeableState3 = swipeableState;
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new SwipeableKt$swipeable$3$4$1(swipeableState3, null);
                    composer.o(objIF2);
                }
                Modifier modifierKN = DraggableKt.KN(companion, draggableState, orientation2, z4, mutableInteractionSource2, zAYN, null, (Function3) objIF2, z3, 32, null);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierKN;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float O(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((Map.Entry) next).getValue(), obj)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(float f3, float f4, Set set, Function2 function2, float f5, float f6) {
        List listNr = nr(f3, set);
        int size = listNr.size();
        if (size != 0) {
            if (size != 1) {
                float fFloatValue = ((Number) listNr.get(0)).floatValue();
                float fFloatValue2 = ((Number) listNr.get(1)).floatValue();
                if (f4 > f3 ? f5 > (-f6) && f3 > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f5 >= f6 || f3 >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) {
                    return fFloatValue2;
                }
                return fFloatValue;
            }
            return ((Number) listNr.get(0)).floatValue();
        }
        return f4;
    }
}
