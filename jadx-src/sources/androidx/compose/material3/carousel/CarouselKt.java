package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0001\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a}\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a»\u0001\u0010#\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c26\u0010!\u001a2\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020 0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u000721\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b'\u0010&\u001aA\u00100\u001a\u00020\u0004*\u00020\u00042\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u00104\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b4\u00103\u001a'\u00109\u001a\u00020\u001e2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u00020\u001eH\u0002¢\u0006\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "state", "Landroidx/compose/ui/unit/Dp;", "preferredItemWidth", "Landroidx/compose/ui/Modifier;", "modifier", "itemSpacing", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "minSmallItemWidth", "maxSmallItemWidth", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "itemIndex", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "itemWidth", "t", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "maxNonFocalVisibleItemCount", c.f62177j, "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "O", "index", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "strategy", "Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "carouselItemInfo", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "xMQ", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/carousel/CarouselState;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/carousel/CarouselItemInfoImpl;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Uo", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;)F", "KN", "Landroidx/compose/material3/carousel/Keyline;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "unadjustedOffset", "mUb", "(Landroidx/compose/material3/carousel/Keyline;Landroidx/compose/material3/carousel/Keyline;F)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,693:1\n148#2:694\n148#2:695\n148#2:703\n148#2:704\n148#2:712\n77#3:696\n77#3:705\n77#3:719\n77#3:720\n77#3:721\n77#3:722\n77#3:724\n77#3:725\n1223#4,6:697\n1223#4,6:706\n1223#4,6:713\n1#5:723\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n*L\n105#1:694\n110#1:695\n175#1:703\n177#1:704\n238#1:712\n113#1:696\n180#1:705\n301#1:719\n302#1:720\n347#1:721\n350#1:722\n359#1:724\n362#1:725\n117#1:697,6\n184#1:706,6\n246#1:713,6\n*E\n"})
public final class CarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(CarouselState carouselState, final Orientation orientation, final Function2 function2, final PaddingValues paddingValues, final int i2, Modifier modifier, float f3, TargetedFlingBehavior targetedFlingBehavior, final Function4 function4, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        float fKN;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i10;
        boolean z2;
        final CarouselState carouselState2;
        TargetedFlingBehavior targetedFlingBehavior3;
        float f4;
        float fJ2;
        float fO;
        Object objIF;
        Modifier modifier3;
        final float f5;
        final TargetedFlingBehavior targetedFlingBehavior4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2035733443);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(carouselState) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(orientation) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function2) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(paddingValues) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i7 |= 24576;
            i8 = i2;
        } else {
            i8 = i2;
            if ((i3 & 24576) == 0) {
                i7 |= composerKN.t(i8) ? 16384 : 8192;
            }
        }
        int i11 = i5 & 32;
        if (i11 != 0) {
            i7 |= 196608;
        } else {
            if ((196608 & i3) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
            i9 = i5 & 64;
            if (i9 != 0) {
                if ((1572864 & i3) == 0) {
                    fKN = f3;
                    i7 |= composerKN.rl(fKN) ? 1048576 : 524288;
                }
                if ((i3 & 12582912) == 0) {
                    if ((i5 & 128) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        int i12 = composerKN.p5(targetedFlingBehavior2) ? 8388608 : 4194304;
                        i7 |= i12;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i7 |= i12;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                if ((i5 & 256) != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i7 |= composerKN.E2(function4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i10 = i7;
                if ((38347923 & i10) == 38347922 && composerKN.xMQ()) {
                    composerKN.wTp();
                    carouselState2 = carouselState;
                    targetedFlingBehavior4 = targetedFlingBehavior2;
                    f5 = fKN;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i9 != 0) {
                            fKN = Dp.KN(0);
                        }
                        if ((i5 & 128) == 0) {
                            z2 = false;
                            carouselState2 = carouselState;
                            TargetedFlingBehavior targetedFlingBehaviorO = CarouselDefaults.f28872n.O(carouselState2, null, composerKN, (i10 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                            i10 &= -29360129;
                            targetedFlingBehavior3 = targetedFlingBehaviorO;
                        } else {
                            z2 = false;
                            carouselState2 = carouselState;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                        }
                        modifier2 = modifier4;
                        f4 = fKN;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 128) != 0) {
                            i10 &= -29360129;
                        }
                        z2 = false;
                        targetedFlingBehavior3 = targetedFlingBehavior2;
                        f4 = fKN;
                        carouselState2 = carouselState;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-2035733443, i10, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:241)");
                    }
                    int i13 = ((i10 >> 9) & 14) | (i10 & 112);
                    fJ2 = J2(paddingValues, orientation, composerKN, i13);
                    fO = O(paddingValues, orientation, composerKN, i13);
                    if ((i10 & 896) == 256) {
                        z2 = true;
                    }
                    objIF = composerKN.iF();
                    if (!z2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new CarouselPageSize(function2, fJ2, fO);
                        composerKN.o(objIF);
                    }
                    final CarouselPageSize carouselPageSize = (CarouselPageSize) objIF;
                    SnapPosition snapPositionN = KeylineSnapPositionKt.n(carouselPageSize);
                    if (orientation != Orientation.f16970t) {
                        composerKN.eF(-1618653092);
                        int i14 = i8;
                        modifier3 = modifier2;
                        PagerKt.rl(carouselState2.getPagerState(), modifier3, PaddingKt.O(0.0f, paddingValues.getTop(), 0.0f, paddingValues.getBottom(), 5, null), carouselPageSize, i14, f4, null, targetedFlingBehavior3, false, false, null, null, snapPositionN, ComposableLambdaKt.nr(687111200, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                                n(pagerScope, num.intValue(), composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(PagerScope pagerScope, int i15, Composer composer2, int i16) {
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(687111200, i16, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:267)");
                                }
                                Object objIF2 = composer2.iF();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objIF2 == companion.n()) {
                                    objIF2 = new CarouselItemInfoImpl();
                                    composer2.o(objIF2);
                                }
                                final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) objIF2;
                                Object objIF3 = composer2.iF();
                                if (objIF3 == companion.n()) {
                                    objIF3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                                    composer2.o(objIF3);
                                }
                                CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) objIF3;
                                Object objIF4 = composer2.iF();
                                if (objIF4 == companion.n()) {
                                    objIF4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$clipShape$1$1
                                        @Override // androidx.compose.ui.graphics.Shape
                                        public Outline n(long size, LayoutDirection layoutDirection, Density density) {
                                            return new Outline.Rectangle(carouselItemInfoImpl.n());
                                        }
                                    };
                                    composer2.o(objIF4);
                                }
                                CarouselKt$Carousel$1$clipShape$1$1 carouselKt$Carousel$1$clipShape$1$1 = (CarouselKt$Carousel$1$clipShape$1$1) objIF4;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                CarouselState carouselState3 = carouselState2;
                                boolean zP5 = composer2.p5(carouselPageSize);
                                final CarouselPageSize carouselPageSize2 = carouselPageSize;
                                Object objIF5 = composer2.iF();
                                if (zP5 || objIF5 == companion.n()) {
                                    objIF5 = new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Strategy invoke() {
                                            return carouselPageSize2.rl();
                                        }
                                    };
                                    composer2.o(objIF5);
                                }
                                Modifier modifierXMQ = CarouselKt.xMQ(companion2, i15, carouselState3, (Function0) objIF5, carouselItemInfoImpl, carouselKt$Carousel$1$clipShape$1$1);
                                Function4 function42 = function4;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierXMQ);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion3.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function42.invoke(carouselItemScopeImpl, Integer.valueOf(i15), composer2, Integer.valueOf(i16 & 112));
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, ((i10 >> 12) & 112) | (57344 & i10) | ((i10 >> 3) & 458752) | (29360128 & i10), 3072, 3904);
                        composerKN.Xw();
                    } else {
                        modifier3 = modifier2;
                        if (orientation == Orientation.f16969n) {
                            composerKN.eF(-1616959128);
                            PagerKt.nr(carouselState2.getPagerState(), modifier3, PaddingKt.O(PaddingKt.Uo(paddingValues, (LayoutDirection) composerKN.ty(CompositionLocalsKt.az())), 0.0f, PaddingKt.J2(paddingValues, (LayoutDirection) composerKN.ty(CompositionLocalsKt.az())), 0.0f, 10, null), carouselPageSize, i2, f4, null, targetedFlingBehavior3, false, false, null, null, snapPositionN, ComposableLambdaKt.nr(-817308503, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                                    n(pagerScope, num.intValue(), composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(PagerScope pagerScope, int i15, Composer composer2, int i16) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-817308503, i16, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:310)");
                                    }
                                    Object objIF2 = composer2.iF();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objIF2 == companion.n()) {
                                        objIF2 = new CarouselItemInfoImpl();
                                        composer2.o(objIF2);
                                    }
                                    final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) objIF2;
                                    Object objIF3 = composer2.iF();
                                    if (objIF3 == companion.n()) {
                                        objIF3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                                        composer2.o(objIF3);
                                    }
                                    CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) objIF3;
                                    Object objIF4 = composer2.iF();
                                    if (objIF4 == companion.n()) {
                                        objIF4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$clipShape$1$1
                                            @Override // androidx.compose.ui.graphics.Shape
                                            public Outline n(long size, LayoutDirection layoutDirection, Density density) {
                                                return new Outline.Rectangle(carouselItemInfoImpl.n());
                                            }
                                        };
                                        composer2.o(objIF4);
                                    }
                                    CarouselKt$Carousel$2$clipShape$1$1 carouselKt$Carousel$2$clipShape$1$1 = (CarouselKt$Carousel$2$clipShape$1$1) objIF4;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    CarouselState carouselState3 = carouselState2;
                                    boolean zP5 = composer2.p5(carouselPageSize);
                                    final CarouselPageSize carouselPageSize2 = carouselPageSize;
                                    Object objIF5 = composer2.iF();
                                    if (zP5 || objIF5 == companion.n()) {
                                        objIF5 = new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Strategy invoke() {
                                                return carouselPageSize2.rl();
                                            }
                                        };
                                        composer2.o(objIF5);
                                    }
                                    Modifier modifierXMQ = CarouselKt.xMQ(companion2, i15, carouselState3, (Function0) objIF5, carouselItemInfoImpl, carouselKt$Carousel$2$clipShape$1$1);
                                    Function4 function42 = function4;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierXMQ);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion3.n();
                                    if (composer2.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer2.T();
                                    if (composer2.getInserting()) {
                                        composer2.s7N(function0N);
                                    } else {
                                        composer2.r();
                                    }
                                    Composer composerN = Updater.n(composer2);
                                    Updater.O(composerN, measurePolicyUo, companion3.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                    Function2 function2Rl = companion3.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function42.invoke(carouselItemScopeImpl, Integer.valueOf(i15), composer2, Integer.valueOf(i16 & 112));
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, ((i10 >> 12) & 112) | (57344 & i10) | ((i10 >> 3) & 458752) | (29360128 & i10), 3072, 3904);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-1615314857);
                            composerKN.Xw();
                        }
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier2 = modifier3;
                    f5 = f4;
                    targetedFlingBehavior4 = targetedFlingBehavior3;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i15) {
                            CarouselKt.n(carouselState2, orientation, function2, paddingValues, i2, modifier5, f5, targetedFlingBehavior4, function4, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 1572864;
            fKN = f3;
            if ((i3 & 12582912) == 0) {
            }
            if ((i5 & 256) != 0) {
            }
            i10 = i7;
            if ((38347923 & i10) == 38347922) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i5 & 128) == 0) {
                    }
                    modifier2 = modifier4;
                    f4 = fKN;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i132 = ((i10 >> 9) & 14) | (i10 & 112);
                    fJ2 = J2(paddingValues, orientation, composerKN, i132);
                    fO = O(paddingValues, orientation, composerKN, i132);
                    if ((i10 & 896) == 256) {
                    }
                    objIF = composerKN.iF();
                    if (!z2) {
                        objIF = new CarouselPageSize(function2, fJ2, fO);
                        composerKN.o(objIF);
                        final CarouselPageSize carouselPageSize2 = (CarouselPageSize) objIF;
                        SnapPosition snapPositionN2 = KeylineSnapPositionKt.n(carouselPageSize2);
                        if (orientation != Orientation.f16970t) {
                        }
                        if (ComposerKt.v()) {
                        }
                        modifier2 = modifier3;
                        f5 = f4;
                        targetedFlingBehavior4 = targetedFlingBehavior3;
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        fKN = f3;
        if ((i3 & 12582912) == 0) {
        }
        if ((i5 & 256) != 0) {
        }
        i10 = i7;
        if ((38347923 & i10) == 38347922) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final CarouselState carouselState, final float f3, Modifier modifier, float f4, TargetedFlingBehavior targetedFlingBehavior, float f5, float f6, PaddingValues paddingValues, final Function4 function4, Composer composer, final int i2, final int i3) {
        int i5;
        float f7;
        Modifier modifier2;
        int i7;
        float f8;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i8;
        float fT;
        int i9;
        float fRl;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        Composer composer2;
        int i12;
        CarouselState carouselState2;
        PaddingValues paddingValuesN;
        TargetedFlingBehavior targetedFlingBehavior3;
        int i13;
        Modifier modifier3;
        float f9;
        final Density density;
        boolean zP5;
        Object objIF;
        Composer composer3;
        final float f10;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1825706865);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(carouselState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            f7 = f3;
        } else {
            f7 = f3;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.rl(f7) ? 32 : 16;
            }
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    f8 = f4;
                    i5 |= composerKN.rl(f8) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        int i15 = composerKN.p5(targetedFlingBehavior2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i5 |= i15;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        fT = f5;
                        i5 |= composerKN.rl(fT) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        fRl = f6;
                    } else {
                        fRl = f6;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.rl(fRl) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.p5(paddingValues2) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i5;
                    if ((i3 & 256) != 0) {
                        if ((i2 & 100663296) == 0) {
                            i11 |= composerKN.E2(function4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i11 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            f10 = f8;
                            paddingValues3 = paddingValues2;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            modifier3 = modifier2;
                            composer3 = composerKN;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                float fKN = i7 == 0 ? Dp.KN(0) : f8;
                                if ((i3 & 16) == 0) {
                                    composer2 = composerKN;
                                    i12 = 0;
                                    carouselState2 = carouselState;
                                    TargetedFlingBehavior targetedFlingBehaviorO = CarouselDefaults.f28872n.O(carouselState2, null, composer2, (i11 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                    i11 &= -57345;
                                    targetedFlingBehavior2 = targetedFlingBehaviorO;
                                } else {
                                    composer2 = composerKN;
                                    i12 = 0;
                                    carouselState2 = carouselState;
                                }
                                if (i8 != 0) {
                                    fT = CarouselDefaults.f28872n.t();
                                }
                                if (i9 != 0) {
                                    fRl = CarouselDefaults.f28872n.rl();
                                }
                                paddingValuesN = i10 == 0 ? PaddingKt.n(Dp.KN(i12)) : paddingValues2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                i13 = i11;
                                modifier3 = modifier4;
                                f9 = fKN;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i11 &= -57345;
                                }
                                paddingValuesN = paddingValues2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                i13 = i11;
                                f9 = f8;
                                modifier3 = modifier2;
                                composer2 = composerKN;
                                carouselState2 = carouselState;
                            }
                            composer2.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1825706865, i13, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:111)");
                            }
                            density = (Density) composer2.ty(CompositionLocalsKt.J2());
                            Orientation orientation = Orientation.f16970t;
                            PaddingValues paddingValues4 = paddingValuesN;
                            zP5 = ((i13 & 112) != 32) | composer2.p5(density) | composer2.E2(carouselState2) | ((i13 & 458752) != 131072) | ((3670016 & i13) != 1048576);
                            objIF = composer2.iF();
                            if (!zP5 || objIF == Composer.INSTANCE.n()) {
                                final CarouselState carouselState3 = carouselState2;
                                final float f11 = f7;
                                final float f12 = fRl;
                                final float f13 = fT;
                                objIF = new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f14, Float f15) {
                                        return n(f14.floatValue(), f15.floatValue());
                                    }

                                    public final KeylineList n(float f14, float f15) {
                                        Density density2 = density;
                                        return KeylinesKt.t(density2, f14, density2.l(f11), f15, ((Number) ((Function0) carouselState3.getItemCountState().getValue()).invoke()).intValue(), density2.l(f13), density2.l(f12));
                                    }
                                };
                                composer2.o(objIF);
                            }
                            int i16 = i13 << 9;
                            Composer composer4 = composer2;
                            n(carouselState, orientation, (Function2) objIF, paddingValues4, 2, modifier3, f9, targetedFlingBehavior3, function4, composer4, (i13 & 14) | 24624 | ((i13 >> 12) & 7168) | (i16 & 458752) | (3670016 & i16) | (i16 & 29360128) | (234881024 & i13), 0);
                            composer3 = composer4;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            f10 = f9;
                            paddingValues3 = paddingValues4;
                        }
                        final float f14 = fT;
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh != null) {
                            final Modifier modifier5 = modifier3;
                            final TargetedFlingBehavior targetedFlingBehavior4 = targetedFlingBehavior3;
                            final float f15 = fRl;
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i17) {
                                    CarouselKt.rl(carouselState, f3, modifier5, f10, targetedFlingBehavior4, f14, f15, paddingValues3, function4, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 |= 100663296;
                    if ((i11 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i14 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            i13 = i11;
                            modifier3 = modifier4;
                            f9 = fKN;
                            composer2.S();
                            if (ComposerKt.v()) {
                            }
                            density = (Density) composer2.ty(CompositionLocalsKt.J2());
                            Orientation orientation2 = Orientation.f16970t;
                            PaddingValues paddingValues42 = paddingValuesN;
                            zP5 = ((i13 & 112) != 32) | composer2.p5(density) | composer2.E2(carouselState2) | ((i13 & 458752) != 131072) | ((3670016 & i13) != 1048576);
                            objIF = composer2.iF();
                            if (!zP5) {
                                final CarouselState carouselState32 = carouselState2;
                                final float f112 = f7;
                                final float f122 = fRl;
                                final float f132 = fT;
                                objIF = new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f142, Float f152) {
                                        return n(f142.floatValue(), f152.floatValue());
                                    }

                                    public final KeylineList n(float f142, float f152) {
                                        Density density2 = density;
                                        return KeylinesKt.t(density2, f142, density2.l(f112), f152, ((Number) ((Function0) carouselState32.getItemCountState().getValue()).invoke()).intValue(), density2.l(f132), density2.l(f122));
                                    }
                                };
                                composer2.o(objIF);
                                int i162 = i13 << 9;
                                Composer composer42 = composer2;
                                n(carouselState, orientation2, (Function2) objIF, paddingValues42, 2, modifier3, f9, targetedFlingBehavior3, function4, composer42, (i13 & 14) | 24624 | ((i13 >> 12) & 7168) | (i162 & 458752) | (3670016 & i162) | (i162 & 29360128) | (234881024 & i13), 0);
                                composer3 = composer42;
                                if (ComposerKt.v()) {
                                }
                                f10 = f9;
                                paddingValues3 = paddingValues42;
                            }
                        }
                    }
                    final float f142 = fT;
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                fT = f5;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i5;
                if ((i3 & 256) != 0) {
                }
                if ((i11 & 38347923) == 38347922) {
                }
                final float f1422 = fT;
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            f8 = f4;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            fT = f5;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i5;
            if ((i3 & 256) != 0) {
            }
            if ((i11 & 38347923) == 38347922) {
            }
            final float f14222 = fT;
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        f8 = f4;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        fT = f5;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i5;
        if ((i3 & 256) != 0) {
        }
        if ((i11 & 38347923) == 38347922) {
        }
        final float f142222 = fT;
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final CarouselState carouselState, final float f3, Modifier modifier, float f4, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, final Function4 function4, Composer composer, final int i2, final int i3) {
        CarouselState carouselState2;
        int i5;
        Modifier modifier2;
        int i7;
        float fKN;
        TargetedFlingBehavior targetedFlingBehaviorNr;
        int i8;
        PaddingValues paddingValues2;
        Function4 function42;
        PaddingValues paddingValuesN;
        TargetedFlingBehavior targetedFlingBehavior2;
        final Density density;
        boolean z2;
        Object objIF;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final float f5;
        final TargetedFlingBehavior targetedFlingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(529322840);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            carouselState2 = carouselState;
        } else {
            carouselState2 = carouselState;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(carouselState2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fKN = f4;
                    i5 |= composerKN.rl(fKN) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        targetedFlingBehaviorNr = targetedFlingBehavior;
                        int i10 = composerKN.p5(targetedFlingBehaviorNr) ? 16384 : 8192;
                        i5 |= i10;
                    } else {
                        targetedFlingBehaviorNr = targetedFlingBehavior;
                    }
                    i5 |= i10;
                } else {
                    targetedFlingBehaviorNr = targetedFlingBehavior;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        paddingValues2 = paddingValues;
                        i5 |= composerKN.p5(paddingValues2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            function42 = function4;
                            i5 |= composerKN.E2(function42) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            f5 = fKN;
                            targetedFlingBehavior3 = targetedFlingBehaviorNr;
                            paddingValues3 = paddingValues2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    fKN = Dp.KN(0);
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    targetedFlingBehaviorNr = CarouselDefaults.f28872n.nr(composerKN, 6);
                                }
                                if (i8 == 0) {
                                    paddingValuesN = PaddingKt.n(Dp.KN(0));
                                    targetedFlingBehavior2 = targetedFlingBehaviorNr;
                                }
                                boolean z3 = false;
                                float f6 = fKN;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(529322840, i5, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:178)");
                                }
                                density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                Orientation orientation = Orientation.f16970t;
                                boolean zP5 = composerKN.p5(density);
                                if ((i5 & 112) == 32) {
                                    z3 = true;
                                }
                                z2 = z3 | zP5;
                                objIF = composerKN.iF();
                                if (z2 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ KeylineList invoke(Float f7, Float f8) {
                                            return n(f7.floatValue(), f8.floatValue());
                                        }

                                        public final KeylineList n(float f7, float f8) {
                                            Density density2 = density;
                                            return KeylinesKt.nr(density2, f7, density2.l(f3), f8);
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                int i11 = i5 << 9;
                                composer2 = composerKN;
                                Function4 function43 = function42;
                                Modifier modifier4 = modifier2;
                                n(carouselState2, orientation, (Function2) objIF, paddingValuesN, 0, modifier4, f6, targetedFlingBehavior2, function43, composer2, (i5 & 14) | 24624 | ((i5 >> 6) & 7168) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | ((i5 << 6) & 234881024), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                paddingValues3 = paddingValuesN;
                                modifier3 = modifier4;
                                f5 = f6;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                            }
                            targetedFlingBehavior2 = targetedFlingBehaviorNr;
                            paddingValuesN = paddingValues2;
                            boolean z32 = false;
                            float f62 = fKN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            Orientation orientation2 = Orientation.f16970t;
                            boolean zP52 = composerKN.p5(density);
                            if ((i5 & 112) == 32) {
                            }
                            z2 = z32 | zP52;
                            objIF = composerKN.iF();
                            if (z2) {
                                objIF = new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f7, Float f8) {
                                        return n(f7.floatValue(), f8.floatValue());
                                    }

                                    public final KeylineList n(float f7, float f8) {
                                        Density density2 = density;
                                        return KeylinesKt.nr(density2, f7, density2.l(f3), f8);
                                    }
                                };
                                composerKN.o(objIF);
                                int i112 = i5 << 9;
                                composer2 = composerKN;
                                Function4 function432 = function42;
                                Modifier modifier42 = modifier2;
                                n(carouselState2, orientation2, (Function2) objIF, paddingValuesN, 0, modifier42, f62, targetedFlingBehavior2, function432, composer2, (i5 & 14) | 24624 | ((i5 >> 6) & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128) | ((i5 << 6) & 234881024), 0);
                                if (ComposerKt.v()) {
                                }
                                paddingValues3 = paddingValuesN;
                                modifier3 = modifier42;
                                f5 = f62;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i12) {
                                    CarouselKt.t(carouselState, f3, modifier3, f5, targetedFlingBehavior3, paddingValues3, function4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    function42 = function4;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i8 == 0) {
                                targetedFlingBehavior2 = targetedFlingBehaviorNr;
                                paddingValuesN = paddingValues2;
                            }
                            boolean z322 = false;
                            float f622 = fKN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            Orientation orientation22 = Orientation.f16970t;
                            boolean zP522 = composerKN.p5(density);
                            if ((i5 & 112) == 32) {
                            }
                            z2 = z322 | zP522;
                            objIF = composerKN.iF();
                            if (z2) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                paddingValues2 = paddingValues;
                if ((i3 & 64) != 0) {
                }
                function42 = function4;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fKN = f4;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i3 & 64) != 0) {
            }
            function42 = function4;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        fKN = f4;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 64) != 0) {
        }
        function42 = function4;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final Modifier xMQ(Modifier modifier, final int i2, final CarouselState carouselState, final Function0 function0, final CarouselItemInfoImpl carouselItemInfoImpl, final Shape shape) {
        return LayoutModifierKt.n(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return n(measureScope, measurable, constraints.getValue());
            }

            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                final Strategy strategy = (Strategy) function0.invoke();
                if (!strategy.getIsValid()) {
                    return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1.1
                        public final void n(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            n(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                final boolean z2 = carouselState.getPagerState().iF().getOrientation() == Orientation.f16969n;
                final boolean z3 = measureScope.getLayoutDirection() == LayoutDirection.f34161t;
                float fO = strategy.O();
                final Placeable placeableDR0 = measurable.dR0(z2 ? Constraints.t(j2, Constraints.ty(j2), Constraints.qie(j2), MathKt.roundToInt(fO), MathKt.roundToInt(fO)) : Constraints.t(j2, MathKt.roundToInt(fO), MathKt.roundToInt(fO), Constraints.az(j2), Constraints.gh(j2)));
                int width = placeableDR0.getWidth();
                int height = placeableDR0.getHeight();
                final CarouselState carouselState2 = carouselState;
                final int i3 = i2;
                final CarouselItemInfoImpl carouselItemInfoImpl2 = carouselItemInfoImpl;
                final Shape shape2 = shape;
                return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$carouselItem$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        n(placementScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        Placeable placeable = placeableDR0;
                        final CarouselState carouselState3 = carouselState2;
                        final Strategy strategy2 = strategy;
                        final int i5 = i3;
                        final boolean z4 = z2;
                        final CarouselItemInfoImpl carouselItemInfoImpl3 = carouselItemInfoImpl2;
                        final Shape shape3 = shape2;
                        final boolean z5 = z3;
                        Placeable.PlacementScope.WPU(placementScope, placeable, 0, 0, 0.0f, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                n(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(GraphicsLayerScope graphicsLayerScope) {
                                float fUo = CarouselKt.Uo(carouselState3, strategy2);
                                float fKN = CarouselKt.KN(carouselState3, strategy2);
                                KeylineList keylineListKN = Strategy.KN(strategy2, fUo, fKN, false, 4, null);
                                KeylineList keylineListUo = strategy2.Uo(fUo, fKN, true);
                                float fO2 = ((i5 * (strategy2.O() + strategy2.getItemSpacing())) + (strategy2.O() / 2.0f)) - fUo;
                                Keyline keylineAz = keylineListKN.az(fO2);
                                Keyline keylineQie = keylineListKN.qie(fO2);
                                Keyline keylineNr = KeylineListKt.nr(keylineAz, keylineQie, CarouselKt.mUb(keylineAz, keylineQie, fO2));
                                boolean zAreEqual = Intrinsics.areEqual(keylineAz, keylineQie);
                                float fXMQ = (z4 ? Size.xMQ(graphicsLayerScope.getSize()) : strategy2.O()) / 2.0f;
                                float fO3 = (z4 ? strategy2.O() : Size.xMQ(graphicsLayerScope.getSize())) / 2.0f;
                                float fGh = (z4 ? Size.gh(graphicsLayerScope.getSize()) : keylineNr.getSize()) / 2.0f;
                                float size = (z4 ? keylineNr.getSize() : Size.xMQ(graphicsLayerScope.getSize())) / 2.0f;
                                Rect rect = new Rect(fXMQ - fGh, fO3 - size, fXMQ + fGh, fO3 + size);
                                carouselItemInfoImpl3.J2(keylineNr.getSize());
                                CarouselItemInfoImpl carouselItemInfoImpl4 = carouselItemInfoImpl3;
                                Iterator<Keyline> it = keylineListUo.iterator();
                                if (!it.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                Keyline next = it.next();
                                if (it.hasNext()) {
                                    float size2 = next.getSize();
                                    do {
                                        Keyline next2 = it.next();
                                        float size3 = next2.getSize();
                                        if (Float.compare(size2, size3) > 0) {
                                            next = next2;
                                            size2 = size3;
                                        }
                                    } while (it.hasNext());
                                }
                                carouselItemInfoImpl4.O(next.getSize());
                                carouselItemInfoImpl3.nr(keylineListUo.KN().getSize());
                                carouselItemInfoImpl3.t(rect);
                                graphicsLayerScope.X(!Intrinsics.areEqual(rect, new Rect(0.0f, 0.0f, Size.gh(graphicsLayerScope.getSize()), Size.xMQ(graphicsLayerScope.getSize()))));
                                graphicsLayerScope.pS(shape3);
                                float offset = keylineNr.getOffset() - fO2;
                                if (zAreEqual) {
                                    offset += (fO2 - keylineNr.getUnadjustedOffset()) / keylineNr.getSize();
                                }
                                if (z4) {
                                    graphicsLayerScope.O(offset);
                                    return;
                                }
                                if (z5) {
                                    offset = -offset;
                                }
                                graphicsLayerScope.ty(offset);
                            }
                        }, 4, null);
                    }
                }, 4, null);
            }
        });
    }

    private static final float J2(PaddingValues paddingValues, Orientation orientation, Composer composer, int i2) {
        float fUo;
        if (ComposerKt.v()) {
            ComposerKt.p5(1896839347, i2, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
        }
        composer.eF(295830617);
        if (orientation == Orientation.f16969n) {
            fUo = paddingValues.getTop();
        } else {
            fUo = PaddingKt.Uo(paddingValues, (LayoutDirection) composer.ty(CompositionLocalsKt.az()));
        }
        composer.Xw();
        float fL = ((Density) composer.ty(CompositionLocalsKt.J2())).l(fUo);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fL;
    }

    public static final float KN(CarouselState carouselState, Strategy strategy) {
        float fT = carouselState.getPagerState().T();
        return RangesKt.coerceAtLeast(((strategy.O() * fT) + (strategy.getItemSpacing() * (fT - 1))) - strategy.getAvailableSpace(), 0.0f);
    }

    private static final float O(PaddingValues paddingValues, Orientation orientation, Composer composer, int i2) {
        float fJ2;
        if (ComposerKt.v()) {
            ComposerKt.p5(1018496720, i2, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
        }
        composer.eF(-587616383);
        if (orientation == Orientation.f16969n) {
            fJ2 = paddingValues.getBottom();
        } else {
            fJ2 = PaddingKt.J2(paddingValues, (LayoutDirection) composer.ty(CompositionLocalsKt.az()));
        }
        composer.Xw();
        float fL = ((Density) composer.ty(CompositionLocalsKt.J2())).l(fJ2);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fL;
    }

    public static final float Uo(CarouselState carouselState, Strategy strategy) {
        float fO = strategy.O() + strategy.getItemSpacing();
        return ((carouselState.getPagerState().S() * fO) + (carouselState.getPagerState().WPU() * fO)) - KeylineSnapPositionKt.rl(strategy, carouselState.getPagerState().S(), carouselState.getPagerState().T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float mUb(Keyline keyline, Keyline keyline2, float f3) {
        if (Intrinsics.areEqual(keyline, keyline2)) {
            return 1.0f;
        }
        return (f3 - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}
