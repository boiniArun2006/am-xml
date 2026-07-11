package androidx.constraintlayout.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableKt;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$1;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import androidx.constraintlayout.compose.carousel.FractionalThreshold;
import androidx.constraintlayout.compose.carousel.SwipeableDefaults;
import androidx.constraintlayout.compose.carousel.ThresholdConfig;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a:\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\"²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "motionScene", "", "initialSlotIndex", "numSlots", "", "backwardTransition", "forwardTransition", "slotPrefix", "", "showSlots", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionCarouselScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/constraintlayout/compose/MotionScene;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "showSlot", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "function", c.f62177j, "(ILjava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionItemsProvider;", "gh", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "componentWidth", "Landroidx/constraintlayout/compose/CarouselState;", "state", "currentIndex", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n1225#2,6:392\n1225#2,6:398\n1225#2,6:404\n1225#2,6:410\n1225#2,6:429\n1225#2,6:492\n249#3:416\n245#3,12:417\n257#3,2:435\n262#3:438\n279#3,10:439\n278#3:449\n290#3:450\n1#4:437\n149#5:451\n149#5:452\n71#6:453\n69#6,5:454\n74#6:487\n78#6:491\n79#7,6:459\n86#7,4:474\n90#7,2:484\n94#7:490\n368#8,9:465\n377#8:486\n378#8,2:488\n4034#9,6:478\n79#10:498\n112#10,2:499\n81#11:501\n107#11,2:502\n78#12:504\n111#12,2:505\n*S KotlinDebug\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n*L\n156#1:374,6\n160#1:380,6\n163#1:386,6\n178#1:392,6\n194#1:398,6\n205#1:404,6\n231#1:410,6\n216#1:429,6\n310#1:492,6\n216#1:416\n216#1:417,12\n216#1:435,2\n216#1:438\n216#1:439,10\n216#1:449\n216#1:450\n216#1:437\n257#1:451\n258#1:452\n260#1:453\n260#1:454,5\n260#1:487\n260#1:491\n260#1:459,6\n260#1:474,4\n260#1:484,2\n260#1:490\n260#1:465,9\n260#1:486\n260#1:488,2\n260#1:478,6\n156#1:498\n156#1:499,2\n160#1:501\n160#1:502,2\n163#1:504\n163#1:505,2\n*E\n"})
public final class MotionCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final MotionScene motionScene, final int i2, final int i3, String str, String str2, String str3, boolean z2, final Function1 function1, Composer composer, final int i5, final int i7) {
        MotionScene motionScene2;
        int i8;
        int i9;
        String str4;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        boolean z3;
        final int i13;
        Object objIF;
        Composer.Companion companion;
        String str7;
        float fN;
        Object objIF2;
        Object objIF3;
        final MutableIntState mutableIntState;
        String str8;
        Map mapMapOf;
        Object objIF4;
        MutableState mutableState;
        Map map;
        float f3;
        String str9;
        MutableState mutableState2;
        final androidx.compose.runtime.State state;
        Object objIF5;
        Object objIF6;
        Object objIF7;
        boolean z4;
        final String str10;
        final String str11;
        MutableState mutableState3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1035994944);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
            motionScene2 = motionScene;
        } else {
            motionScene2 = motionScene;
            if ((i5 & 6) == 0) {
                i8 = (composerKN.p5(motionScene2) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            i9 = i3;
        } else {
            i9 = i3;
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i8 |= composerKN.t(i9) ? 256 : 128;
            }
        }
        int i14 = i7 & 8;
        if (i14 != 0) {
            i8 |= 3072;
        } else {
            if ((i5 & 3072) == 0) {
                str4 = str;
                i8 |= composerKN.p5(str4) ? 2048 : 1024;
            }
            i10 = i7 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    str5 = str2;
                    i8 |= composerKN.p5(str5) ? 16384 : 8192;
                }
                i11 = i7 & 32;
                if (i11 == 0) {
                    if ((196608 & i5) == 0) {
                        str6 = str3;
                        i8 |= composerKN.p5(str6) ? 131072 : 65536;
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i5 & 1572864) == 0) {
                            i8 |= composerKN.n(z3) ? 1048576 : 524288;
                        }
                    }
                    if ((i7 & 128) == 0) {
                        i8 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i8 |= composerKN.E2(function1) ? 8388608 : 4194304;
                    }
                    i13 = i8;
                    if ((4793491 & i13) == 4793490 || !composerKN.xMQ()) {
                        String str12 = i14 == 0 ? "backward" : str4;
                        if (i10 != 0) {
                            str5 = "forward";
                        }
                        final String str13 = i11 == 0 ? "slot" : str6;
                        final boolean z5 = i12 == 0 ? false : z3;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1035994944, i13, -1, "androidx.constraintlayout.compose.MotionCarousel (MotionCarousel.kt:147)");
                        }
                        androidx.compose.runtime.State stateGh = gh(function1, composerKN, (i13 >> 21) & 14);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = PrimitiveSnapshotStateKt.n(1000.0f);
                            composerKN.o(objIF);
                        }
                        final MutableFloatState mutableFloatState = (MutableFloatState) objIF;
                        String str14 = str5;
                        str7 = str12;
                        CarouselSwipeableState carouselSwipeableStateKN = CarouselSwipeableKt.KN(TtmlNode.START, null, null, composerKN, 6, 6);
                        fN = carouselSwipeableStateKN.Z().n() / t(mutableFloatState);
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                            MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(new CarouselState(MotionCarouselDirection.FORWARD, 0, 0, false, false), null, 2, null);
                            composerKN.o(mutableStateO);
                            objIF2 = mutableStateO;
                        }
                        MutableState mutableState4 = (MutableState) objIF2;
                        objIF3 = composerKN.iF();
                        if (objIF3 == companion.n()) {
                            objIF3 = SnapshotIntStateKt.n(0);
                            composerKN.o(objIF3);
                        }
                        mutableIntState = (MutableIntState) objIF3;
                        if (J2(mutableIntState) != 0) {
                            mapMapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), TtmlNode.START), TuplesKt.to(Float.valueOf(t(mutableFloatState)), "next"));
                        } else if (J2(mutableIntState) == ((MotionItemsProvider) stateGh.getValue()).getItemsCount() - 1) {
                            mapMapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(-t(mutableFloatState)), "previous"), TuplesKt.to(Float.valueOf(0.0f), TtmlNode.START));
                        } else {
                            Pair pair = TuplesKt.to(Float.valueOf(-t(mutableFloatState)), "previous");
                            Pair pair2 = TuplesKt.to(Float.valueOf(0.0f), TtmlNode.START);
                            float fT = t(mutableFloatState);
                            str8 = TtmlNode.START;
                            mapMapOf = MapsKt.mapOf(pair, pair2, TuplesKt.to(Float.valueOf(fT), "next"));
                            objIF4 = composerKN.iF();
                            if (objIF4 == companion.n()) {
                                MutableState mutableStateO2 = SnapshotStateKt__SnapshotStateKt.O(str14, null, 2, null);
                                composerKN.o(mutableStateO2);
                                objIF4 = mutableStateO2;
                            }
                            mutableState = (MutableState) objIF4;
                            if (fN >= 0.0f || O(mutableState4).getIndex() <= 0) {
                                map = mapMapOf;
                                O(mutableState4).t(MotionCarouselDirection.FORWARD);
                                mutableState.setValue(str14);
                                f3 = fN;
                            } else {
                                map = mapMapOf;
                                O(mutableState4).t(MotionCarouselDirection.BACKWARD);
                                mutableState.setValue(str7);
                                f3 = (-1) * fN;
                            }
                            composerKN.eF(1162062662);
                            if (carouselSwipeableStateKN.aYN()) {
                                str9 = str14;
                                mutableState2 = mutableState;
                                if (O(mutableState4).getDirection() == MotionCarouselDirection.FORWARD && ((String) carouselSwipeableStateKN.ck()).equals("next")) {
                                    composerKN.eF(1664382685);
                                    Boolean bool = Boolean.TRUE;
                                    boolean zP5 = composerKN.p5(stateGh) | composerKN.p5(carouselSwipeableStateKN);
                                    Object objIF8 = composerKN.iF();
                                    if (zP5 || objIF8 == companion.n()) {
                                        objIF8 = new MotionCarouselKt$MotionCarousel$1$1(stateGh, carouselSwipeableStateKN, str8, mutableState4, null);
                                        state = stateGh;
                                        mutableState3 = mutableState4;
                                        composerKN.o(objIF8);
                                    } else {
                                        state = stateGh;
                                        mutableState3 = mutableState4;
                                    }
                                    EffectsKt.O(bool, (Function2) objIF8, composerKN, 6);
                                    composerKN.Xw();
                                } else {
                                    state = stateGh;
                                    String str15 = str8;
                                    mutableState3 = mutableState4;
                                    if (O(mutableState3).getDirection() == MotionCarouselDirection.BACKWARD && ((String) carouselSwipeableStateKN.ck()).equals("previous")) {
                                        composerKN.eF(1664841950);
                                        Boolean bool2 = Boolean.TRUE;
                                        boolean zP52 = composerKN.p5(carouselSwipeableStateKN);
                                        Object objIF9 = composerKN.iF();
                                        if (zP52 || objIF9 == companion.n()) {
                                            objIF9 = new MotionCarouselKt$MotionCarousel$2$1(carouselSwipeableStateKN, str15, mutableState3, null);
                                            composerKN.o(objIF9);
                                        }
                                        EffectsKt.O(bool2, (Function2) objIF9, composerKN, 6);
                                        composerKN.Xw();
                                    } else {
                                        composerKN.eF(1665103342);
                                        composerKN.Xw();
                                    }
                                }
                                Uo(mutableIntState, O(mutableState3).getIndex());
                            } else {
                                str9 = str14;
                                mutableState2 = mutableState;
                                state = stateGh;
                            }
                            composerKN.Xw();
                            String str16 = (String) mutableState2.getValue();
                            Map map2 = map;
                            Modifier modifierT = CarouselSwipeableKt.t(BackgroundKt.nr(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.KN(), null, 2, null), carouselSwipeableStateKN, map2, Orientation.f16970t, (424 & 8) != 0, (424 & 16) != 0 ? false : true, (424 & 32) != 0 ? null : null, (424 & 64) != 0 ? CarouselSwipeableKt$carouselSwipeable$1.f34871n : new Function2<String, String, ThresholdConfig>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$3
                                @Override // kotlin.jvm.functions.Function2
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final ThresholdConfig invoke(String str17, String str18) {
                                    return new FractionalThreshold(0.3f);
                                }
                            }, (424 & 128) != 0 ? SwipeableDefaults.nr(SwipeableDefaults.f34963n, map2.keySet(), 0.0f, 0.0f, 6, null) : null, (424 & 256) != 0 ? SwipeableDefaults.f34963n.rl() : 0.0f);
                            objIF5 = composerKN.iF();
                            if (objIF5 == companion.n()) {
                                objIF5 = new Function1<IntSize, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$4$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                        n(intSize.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(long j2) {
                                        MotionCarouselKt.nr(mutableFloatState, IntSize.Uo(j2));
                                    }
                                };
                                composerKN.o(objIF5);
                            }
                            Modifier modifierN = OnRemeasuredModifierKt.n(modifierT, (Function1) objIF5);
                            int iN = DebugFlags.INSTANCE.n();
                            final InvalidationStrategy invalidationStrategyN = InvalidationStrategy.INSTANCE.n();
                            objIF6 = composerKN.iF();
                            if (objIF6 == companion.n()) {
                                objIF6 = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                                composerKN.o(objIF6);
                            }
                            final MutableState mutableState5 = (MutableState) objIF6;
                            objIF7 = composerKN.iF();
                            Object obj = objIF7;
                            if (objIF7 == companion.n()) {
                                Ref ref = new Ref();
                                ref.rl(CompositionSource.Unknown);
                                composerKN.o(ref);
                                obj = ref;
                            }
                            final Ref ref2 = (Ref) obj;
                            final int i15 = i9;
                            Function3<MotionLayoutScope, Composer, Integer, Unit> function3 = new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$$inlined$MotionLayout-6oYECBM$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                                    n(motionLayoutScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(final MotionLayoutScope motionLayoutScope, Composer composer2, int i16) {
                                    final boolean z6;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-23317463, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:264)");
                                    }
                                    mutableState5.setValue(Unit.INSTANCE);
                                    if (invalidationStrategyN.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                                        ref2.rl(CompositionSource.Content);
                                    }
                                    composer2.eF(-1854403913);
                                    composer2.eF(1187106508);
                                    int i17 = 0;
                                    while (i17 < i15) {
                                        final int iJ2 = (MotionCarouselKt.J2(mutableIntState) + i17) - i2;
                                        if (iJ2 >= 0 && iJ2 < ((MotionItemsProvider) state.getValue()).getItemsCount()) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        final String str17 = str13;
                                        boolean z7 = z5;
                                        final int i18 = i17;
                                        final androidx.compose.runtime.State state2 = state;
                                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-2020349941, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i19) {
                                                if ((i19 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-2020349941, i19, -1, "androidx.constraintlayout.compose.MotionCarousel.<anonymous>.<anonymous> (MotionCarousel.kt:236)");
                                                }
                                                if (z6) {
                                                    if (((MotionItemsProvider) state2.getValue()).n()) {
                                                        composer3.eF(-2023112919);
                                                        ((MotionItemsProvider) state2.getValue()).rl(iJ2, motionLayoutScope.rl(str17 + i18, composer3, 0)).invoke(composer3, 0);
                                                        composer3.Xw();
                                                    } else {
                                                        composer3.eF(-2022913031);
                                                        ((MotionItemsProvider) state2.getValue()).t(iJ2).invoke(composer3, 0);
                                                        composer3.Xw();
                                                    }
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer2, 54);
                                        int i19 = i13;
                                        MotionCarouselKt.n(i18, str17, z7, composableLambdaNr, composer2, ((i19 >> 12) & 896) | ((i19 >> 12) & 112) | 3072);
                                        i17 = i18 + 1;
                                    }
                                    composer2.Xw();
                                    composer2.Xw();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            };
                            String str17 = str13;
                            z4 = z5;
                            MotionLayoutKt.rl(motionScene2, f3, str16, 257, iN, modifierN, mutableState5, ref2, invalidationStrategyN, ComposableLambdaKt.nr(-23317463, true, function3, composerKN, 54), composerKN, 806879232 | (i13 & 14) | (Ref.rl << 21));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str10 = str17;
                            str11 = str9;
                        }
                        str8 = TtmlNode.START;
                        objIF4 = composerKN.iF();
                        if (objIF4 == companion.n()) {
                        }
                        mutableState = (MutableState) objIF4;
                        if (fN >= 0.0f) {
                            map = mapMapOf;
                            O(mutableState4).t(MotionCarouselDirection.FORWARD);
                            mutableState.setValue(str14);
                            f3 = fN;
                            composerKN.eF(1162062662);
                            if (carouselSwipeableStateKN.aYN()) {
                            }
                            composerKN.Xw();
                            String str162 = (String) mutableState2.getValue();
                            Map map22 = map;
                            Modifier modifierT2 = CarouselSwipeableKt.t(BackgroundKt.nr(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.KN(), null, 2, null), carouselSwipeableStateKN, map22, Orientation.f16970t, (424 & 8) != 0, (424 & 16) != 0 ? false : true, (424 & 32) != 0 ? null : null, (424 & 64) != 0 ? CarouselSwipeableKt$carouselSwipeable$1.f34871n : new Function2<String, String, ThresholdConfig>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$3
                                @Override // kotlin.jvm.functions.Function2
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final ThresholdConfig invoke(String str172, String str18) {
                                    return new FractionalThreshold(0.3f);
                                }
                            }, (424 & 128) != 0 ? SwipeableDefaults.nr(SwipeableDefaults.f34963n, map22.keySet(), 0.0f, 0.0f, 6, null) : null, (424 & 256) != 0 ? SwipeableDefaults.f34963n.rl() : 0.0f);
                            objIF5 = composerKN.iF();
                            if (objIF5 == companion.n()) {
                            }
                            Modifier modifierN2 = OnRemeasuredModifierKt.n(modifierT2, (Function1) objIF5);
                            int iN2 = DebugFlags.INSTANCE.n();
                            final InvalidationStrategy invalidationStrategyN2 = InvalidationStrategy.INSTANCE.n();
                            objIF6 = composerKN.iF();
                            if (objIF6 == companion.n()) {
                            }
                            final MutableState mutableState52 = (MutableState) objIF6;
                            objIF7 = composerKN.iF();
                            Object obj2 = objIF7;
                            if (objIF7 == companion.n()) {
                            }
                            final Ref ref22 = (Ref) obj2;
                            final int i152 = i9;
                            Function3<MotionLayoutScope, Composer, Integer, Unit> function32 = new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$$inlined$MotionLayout-6oYECBM$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                                    n(motionLayoutScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(final MotionLayoutScope motionLayoutScope, Composer composer2, int i16) {
                                    final boolean z6;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-23317463, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:264)");
                                    }
                                    mutableState52.setValue(Unit.INSTANCE);
                                    if (invalidationStrategyN2.getOnObservedStateChange() == null && ref22.getValue() == CompositionSource.Unknown) {
                                        ref22.rl(CompositionSource.Content);
                                    }
                                    composer2.eF(-1854403913);
                                    composer2.eF(1187106508);
                                    int i17 = 0;
                                    while (i17 < i152) {
                                        final int iJ2 = (MotionCarouselKt.J2(mutableIntState) + i17) - i2;
                                        if (iJ2 >= 0 && iJ2 < ((MotionItemsProvider) state.getValue()).getItemsCount()) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        final String str172 = str13;
                                        boolean z7 = z5;
                                        final int i18 = i17;
                                        final androidx.compose.runtime.State state2 = state;
                                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-2020349941, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i19) {
                                                if ((i19 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-2020349941, i19, -1, "androidx.constraintlayout.compose.MotionCarousel.<anonymous>.<anonymous> (MotionCarousel.kt:236)");
                                                }
                                                if (z6) {
                                                    if (((MotionItemsProvider) state2.getValue()).n()) {
                                                        composer3.eF(-2023112919);
                                                        ((MotionItemsProvider) state2.getValue()).rl(iJ2, motionLayoutScope.rl(str172 + i18, composer3, 0)).invoke(composer3, 0);
                                                        composer3.Xw();
                                                    } else {
                                                        composer3.eF(-2022913031);
                                                        ((MotionItemsProvider) state2.getValue()).t(iJ2).invoke(composer3, 0);
                                                        composer3.Xw();
                                                    }
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer2, 54);
                                        int i19 = i13;
                                        MotionCarouselKt.n(i18, str172, z7, composableLambdaNr, composer2, ((i19 >> 12) & 896) | ((i19 >> 12) & 112) | 3072);
                                        i17 = i18 + 1;
                                    }
                                    composer2.Xw();
                                    composer2.Xw();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            };
                            String str172 = str13;
                            z4 = z5;
                            MotionLayoutKt.rl(motionScene2, f3, str162, 257, iN2, modifierN2, mutableState52, ref22, invalidationStrategyN2, ComposableLambdaKt.nr(-23317463, true, function32, composerKN, 54), composerKN, 806879232 | (i13 & 14) | (Ref.rl << 21));
                            if (ComposerKt.v()) {
                            }
                            str10 = str172;
                            str11 = str9;
                        }
                    } else {
                        composerKN.wTp();
                        str11 = str5;
                        z4 = z3;
                        str10 = str6;
                        str7 = str4;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final String str18 = str7;
                        final boolean z6 = z4;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i16) {
                                MotionCarouselKt.rl(motionScene, i2, i3, str18, str11, str10, z6, function1, composer2, RecomposeScopeImplKt.n(i5 | 1), i7);
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 |= 196608;
                str6 = str3;
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                if ((i7 & 128) == 0) {
                }
                i13 = i8;
                if ((4793491 & i13) == 4793490) {
                    if (i14 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    androidx.compose.runtime.State stateGh2 = gh(function1, composerKN, (i13 >> 21) & 14);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    final MutableFloatState mutableFloatState2 = (MutableFloatState) objIF;
                    String str142 = str5;
                    str7 = str12;
                    CarouselSwipeableState carouselSwipeableStateKN2 = CarouselSwipeableKt.KN(TtmlNode.START, null, null, composerKN, 6, 6);
                    fN = carouselSwipeableStateKN2.Z().n() / t(mutableFloatState2);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                    }
                    MutableState mutableState42 = (MutableState) objIF2;
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                    }
                    mutableIntState = (MutableIntState) objIF3;
                    if (J2(mutableIntState) != 0) {
                    }
                    str8 = TtmlNode.START;
                    objIF4 = composerKN.iF();
                    if (objIF4 == companion.n()) {
                    }
                    mutableState = (MutableState) objIF4;
                    if (fN >= 0.0f) {
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            str5 = str2;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            str6 = str3;
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            if ((i7 & 128) == 0) {
            }
            i13 = i8;
            if ((4793491 & i13) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        str4 = str;
        i10 = i7 & 16;
        if (i10 == 0) {
        }
        str5 = str2;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        str6 = str3;
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        if ((i7 & 128) == 0) {
        }
        i13 = i8;
        if ((4793491 & i13) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState O(MutableState mutableState) {
        return (CarouselState) mutableState.getValue();
    }

    private static final void Uo(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    private static final androidx.compose.runtime.State gh(Function1 function1, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1507876322, i2, -1, "androidx.constraintlayout.compose.rememberStateOfItemsProvider (MotionCarousel.kt:307)");
        }
        final androidx.compose.runtime.State stateCk = SnapshotStateKt.ck(function1, composer, i2 & 14);
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt.O(new Function0<MotionCarouselScopeImpl>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$rememberStateOfItemsProvider$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final MotionCarouselScopeImpl invoke() {
                    MotionCarouselScopeImpl motionCarouselScopeImpl = new MotionCarouselScopeImpl();
                    ((Function1) stateCk.getValue()).invoke(motionCarouselScopeImpl);
                    return motionCarouselScopeImpl;
                }
            });
            composer.o(objIF);
        }
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return state;
    }

    public static final void n(final int i2, final String str, final boolean z2, final Function2 function2, Composer composer, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composerKN = composer.KN(1970516035);
        if ((i3 & 6) == 0) {
            if (composerKN.t(i2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (composerKN.p5(str)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i5 |= i9;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.n(z2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (composerKN.E2(function2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i5 |= i7;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1970516035, i5, -1, "androidx.constraintlayout.compose.ItemHolder (MotionCarousel.kt:250)");
            }
            Modifier modifierNr = ConstraintLayoutTagKt.nr(Modifier.INSTANCE, str + i2, null, 2, null);
            if (z2) {
                float f3 = 20;
                modifierNr = BorderKt.J2(ClipKt.n(modifierNr, RoundedCornerShapeKt.t(Dp.KN(f3))), Dp.KN(2), ColorKt.t(0, 0, 0, 60), RoundedCornerShapeKt.t(Dp.KN(f3)));
            }
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf((i5 >> 9) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$ItemHolder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    MotionCarouselKt.n(i2, str, z2, function2, composer2, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    private static final float t(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }
}
