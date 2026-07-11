package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.database.Kr.FlTC;
import androidx.media3.exoplayer.RendererCapabilities;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a¶\u0001\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0001*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u001728\b\u0002\u0010\u001d\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010$\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0002¢\u0006\u0004\b'\u0010(\u001aW\u0010+\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040%2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010-\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "newValue", "", "confirmStateChange", "Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "KN", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "from", "to", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "thresholds", "Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "t", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/constraintlayout/compose/carousel/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "offset", "", "", "J2", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "O", "(FFLjava/util/Set;Lkotlin/jvm/functions/Function2;FF)F", "Uo", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,850:1\n1225#2,6:851\n1225#2,6:857\n1225#2,6:863\n1225#2,6:869\n1225#2,6:875\n135#3:881\n766#4:882\n857#4,2:883\n766#4:898\n857#4,2:899\n288#4,2:914\n171#5,13:885\n482#5,13:901\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n*L\n459#1:851,6\n483#1:857,6\n490#1:863,6\n491#1:869,6\n496#1:875,6\n555#1:881\n708#1:882\n708#1:883,2\n709#1:898\n709#1:899,2\n766#1:914,2\n708#1:885,13\n709#1:901,13\n*E\n"})
public final class CarouselSwipeableKt {
    private static final List J2(float f3, Set set) {
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

    public static final CarouselSwipeableState KN(final Object obj, final AnimationSpec animationSpec, final Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.f34963n.n();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<Object, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Object obj2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1633385233, i2, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableState (CarouselSwipeable.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = CarouselSwipeableState.INSTANCE.n(animationSpec, function1);
        boolean zE2 = ((((i2 & 14) ^ 6) > 4 && composer.E2(obj)) || (i2 & 6) == 4) | composer.E2(animationSpec) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function1)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object objIF = composer.iF();
        if (zE2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<CarouselSwipeableState<Object>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final CarouselSwipeableState invoke() {
                    return new CarouselSwipeableState(obj, animationSpec, function1);
                }
            };
            composer.o(objIF);
        }
        CarouselSwipeableState carouselSwipeableState = (CarouselSwipeableState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return carouselSwipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(float f3, float f4, Set set, Function2 function2, float f5, float f6) {
        List listJ2 = J2(f3, set);
        int size = listJ2.size();
        if (size != 0) {
            if (size != 1) {
                float fFloatValue = ((Number) listJ2.get(0)).floatValue();
                float fFloatValue2 = ((Number) listJ2.get(1)).floatValue();
                if (f4 > f3 ? f5 > (-f6) && f3 > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f5 >= f6 || f3 >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) {
                    return fFloatValue2;
                }
                return fFloatValue;
            }
            return ((Number) listJ2.get(0)).floatValue();
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float Uo(Map map, Object obj) {
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

    public static final Modifier t(Modifier modifier, final CarouselSwipeableState carouselSwipeableState, final Map map, final Orientation orientation, final boolean z2, final boolean z3, final MutableInteractionSource mutableInteractionSource, final Function2 function2, final ResistanceConfig resistanceConfig, final float f3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable-pPrIpRY$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.getProperties().n("state", carouselSwipeableState);
                    inspectorInfo.getProperties().n("anchors", map);
                    inspectorInfo.getProperties().n(FlTC.CEK, orientation);
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("reverseDirection", Boolean.valueOf(z3));
                    inspectorInfo.getProperties().n("interactionSource", mutableInteractionSource);
                    inspectorInfo.getProperties().n("thresholds", function2);
                    inspectorInfo.getProperties().n("resistance", resistanceConfig);
                    inspectorInfo.getProperties().n("velocityThreshold", Dp.nr(f3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(1858597191);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1858597191, i2, -1, "androidx.constraintlayout.compose.carousel.carouselSwipeable.<anonymous> (CarouselSwipeable.kt:567)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.ty(CompositionLocalsKt.J2());
                carouselSwipeableState.qie(map);
                Map map2 = map;
                Object obj = carouselSwipeableState;
                boolean zP5 = composer.p5(obj) | composer.E2(map) | composer.p5(resistanceConfig) | composer.p5(function2) | composer.p5(density) | composer.rl(f3);
                CarouselSwipeableState carouselSwipeableState2 = carouselSwipeableState;
                Map map3 = map;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                Function2 function22 = function2;
                float f4 = f3;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    Object carouselSwipeableKt$carouselSwipeable$3$3$1 = new CarouselSwipeableKt$carouselSwipeable$3$3$1(carouselSwipeableState2, map3, resistanceConfig2, density, function22, f4, null);
                    composer.o(carouselSwipeableKt$carouselSwipeable$3$3$1);
                    objIF = carouselSwipeableKt$carouselSwipeable$3$3$1;
                }
                EffectsKt.nr(map2, obj, (Function2) objIF, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zAYN = carouselSwipeableState.aYN();
                DraggableState draggableState = carouselSwipeableState.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z4 = z2;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                boolean zP52 = composer.p5(carouselSwipeableState);
                CarouselSwipeableState carouselSwipeableState3 = carouselSwipeableState;
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(carouselSwipeableState3, null);
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
}
