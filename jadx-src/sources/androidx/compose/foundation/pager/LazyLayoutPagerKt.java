package androidx.compose.foundation.pager;

import GJW.Lu;
import GJW.vd;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aè\u0001\u0010*\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!21\u0010)\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'¢\u0006\u0002\b(H\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0083\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020.0,2\u0006\u0010\u0003\u001a\u00020\u000221\u0010)\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'¢\u0006\u0002\b(2#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0,H\u0003¢\u0006\u0004\b/\u00100\u001a\u001b\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "", "key", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "pageContent", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "t", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,411:1\n113#2:412\n96#3,5:413\n1247#4,6:418\n1247#4,3:431\n1250#4,3:435\n1247#4,6:438\n1247#4,6:444\n1247#4,6:451\n1247#4,6:457\n557#5:424\n554#5,6:425\n555#6:434\n75#7:450\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n89#1:412\n105#1:413,5\n111#1:418,6\n115#1:431,3\n115#1:435,3\n131#1:438,6\n137#1:444,6\n141#1:451,6\n263#1:457,6\n115#1:424\n115#1:425,6\n115#1:434\n139#1:450\n*E\n"})
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Modifier modifier, final PagerState pagerState, final PaddingValues paddingValues, final boolean z2, final Orientation orientation, final TargetedFlingBehavior targetedFlingBehavior, final boolean z3, final OverscrollEffect overscrollEffect, int i2, float f3, final PageSize pageSize, NestedScrollConnection nestedScrollConnection, final Function1 function1, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final Function4 function4, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final float f4;
        final int i15;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z4;
        float fKN;
        Modifier modifierRl;
        final PagerState pagerState2 = pagerState;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollConnection;
        Composer composerKN = composer.KN(1125194810);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= composerKN.p5(pagerState2) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i8 |= composerKN.p5(paddingValues) ? 256 : 128;
            }
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i8 |= composerKN.n(z2) ? 2048 : 1024;
            }
            if ((i7 & 16) == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i8 |= composerKN.p5(orientation) ? 16384 : 8192;
            }
            if ((i7 & 32) == 0) {
                i8 |= 196608;
            } else if ((i3 & 196608) == 0) {
                i8 |= composerKN.p5(targetedFlingBehavior) ? 131072 : 65536;
            }
            if ((i7 & 64) == 0) {
                i8 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i8 |= composerKN.n(z3) ? 1048576 : 524288;
            }
            if ((i7 & 128) == 0) {
                i8 |= 12582912;
            } else {
                if ((12582912 & i3) == 0) {
                    i8 |= composerKN.p5(overscrollEffect) ? 8388608 : 4194304;
                }
                i9 = i7 & 256;
                if (i9 != 0) {
                    i8 |= 100663296;
                    i10 = i2;
                } else {
                    i10 = i2;
                    if ((i3 & 100663296) == 0) {
                        i8 |= composerKN.t(i10) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i11 = i7 & 512;
                if (i11 != 0) {
                    i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i8 |= composerKN.rl(f3) ? 536870912 : 268435456;
                }
                if ((i7 & 1024) != 0) {
                    i12 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i12 = i5 | (composerKN.p5(pageSize) ? 4 : 2);
                } else {
                    i12 = i5;
                }
                if ((i7 & 2048) != 0) {
                    i12 |= 48;
                } else if ((i5 & 48) == 0) {
                    i12 |= composerKN.E2(nestedScrollConnection2) ? 32 : 16;
                }
                int i16 = i12;
                if ((i7 & 4096) != 0) {
                    i16 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else {
                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i16 |= composerKN.E2(function1) ? 256 : 128;
                    }
                    if ((i7 & 8192) == 0) {
                        i16 |= 3072;
                    } else {
                        if ((i5 & 3072) == 0) {
                            i16 |= composerKN.p5(horizontal) ? 2048 : 1024;
                        }
                        if ((i7 & 16384) == 0) {
                            if ((i5 & 24576) == 0) {
                                i16 |= composerKN.p5(vertical) ? 16384 : 8192;
                            }
                            if ((i7 & 32768) == 0) {
                                i13 = i16 | 196608;
                            } else {
                                int i17 = i16;
                                if ((i5 & 196608) == 0) {
                                    i13 = i17 | (composerKN.p5(snapPosition) ? 131072 : 65536);
                                } else {
                                    i13 = i17;
                                }
                            }
                            if ((i7 & 65536) == 0) {
                                i13 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i13 |= composerKN.E2(function4) ? 1048576 : 524288;
                            }
                            i14 = i13;
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                f4 = f3;
                                i15 = i10;
                            } else {
                                int i18 = i9 != 0 ? 0 : i10;
                                if (i11 != 0) {
                                    z4 = false;
                                    fKN = Dp.KN(0);
                                } else {
                                    z4 = false;
                                    fKN = f3;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1125194810, i8, i14, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)");
                                }
                                if (!(i18 >= 0 ? true : z4)) {
                                    InlineClassHelperKt.n("beyondViewportPageCount should be greater than or equal to 0, you selected " + i18);
                                }
                                int i19 = i8 & 112;
                                boolean z5 = i19 == 32 ? true : z4;
                                Object objIF = composerKN.iF();
                                if (z5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Integer invoke() {
                                            return Integer.valueOf(pagerState2.T());
                                        }
                                    };
                                    composerKN.o(objIF);
                                }
                                Function0 function0 = (Function0) objIF;
                                int i20 = i8 >> 3;
                                int i21 = i18;
                                int i22 = i20 & 14;
                                int i23 = i14 >> 15;
                                int i24 = i8;
                                Function0 function0T = t(pagerState, function4, function1, function0, composerKN, i22 | (i23 & 112) | (i14 & 896));
                                Object objIF2 = composerKN.iF();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objIF2 == companion.n()) {
                                    objIF2 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                    composerKN.o(objIF2);
                                }
                                vd vdVar = (vd) objIF2;
                                boolean z6 = i19 == 32 ? true : z4;
                                Object objIF3 = composerKN.iF();
                                if (z6 || objIF3 == companion.n()) {
                                    objIF3 = new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Integer invoke() {
                                            return Integer.valueOf(pagerState.T());
                                        }
                                    };
                                    composerKN.o(objIF3);
                                }
                                int i25 = i24 >> 9;
                                int i26 = (i24 & 65520) | (i25 & 458752) | (i25 & 3670016) | ((i14 << 21) & 29360128);
                                int i27 = i14 << 15;
                                boolean z7 = z4;
                                Function2 function2N = PagerMeasurePolicyKt.n(function0T, pagerState, paddingValues, z2, orientation, i21, fKN, pageSize, horizontal, vertical, snapPosition, vdVar, (Function0) objIF3, composerKN, i26 | (i27 & 234881024) | (i27 & 1879048192), i23 & 14);
                                float f5 = fKN;
                                Orientation orientation2 = Orientation.f16969n;
                                LazyLayoutSemanticState lazyLayoutSemanticStateN = PagerSemanticsKt.n(pagerState, orientation == orientation2 ? true : z7, composerKN, i22);
                                boolean z9 = ((i24 & 458752) == 131072 ? true : z7) | (i19 == 32 ? true : z7);
                                Object objIF4 = composerKN.iF();
                                if (z9 || objIF4 == companion.n()) {
                                    objIF4 = new PagerWrapperFlingBehavior(targetedFlingBehavior, pagerState);
                                    composerKN.o(objIF4);
                                }
                                PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objIF4;
                                BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) composerKN.ty(BringIntoViewSpec_androidKt.n());
                                boolean zP5 = (i19 == 32 ? true : z7) | composerKN.p5(bringIntoViewSpec);
                                Object objIF5 = composerKN.iF();
                                if (zP5 || objIF5 == companion.n()) {
                                    objIF5 = new PagerBringIntoViewSpec(pagerState, bringIntoViewSpec);
                                    composerKN.o(objIF5);
                                }
                                PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) objIF5;
                                if (z3) {
                                    composerKN.eF(1935359245);
                                    modifierRl = LazyLayoutBeyondBoundsModifierLocalKt.rl(Modifier.INSTANCE, PagerBeyondBoundsModifierKt.n(pagerState, i21, composerKN, i22 | ((i24 >> 21) & 112)), pagerState.getBeyondBoundsInfo(), z2, orientation);
                                    composerKN.Xw();
                                } else {
                                    composerKN.eF(1935788068);
                                    composerKN.Xw();
                                    modifierRl = Modifier.INSTANCE;
                                }
                                pagerState2 = pagerState;
                                nestedScrollConnection2 = nestedScrollConnection;
                                LazyLayoutKt.n(function0T, NestedScrollModifierKt.rl(rl(ScrollingContainerKt.n(PagerKt.KN(LazyLayoutSemanticsKt.t(modifier.Zmq(pagerState.getRemeasurementModifier()).Zmq(pagerState.getAwaitLayoutModifier()), function0T, lazyLayoutSemanticStateN, orientation, z3, z2, composerKN, (i20 & 7168) | ((i24 >> 6) & 57344) | ((i24 << 6) & 458752)), pagerState, orientation == orientation2 ? true : z7, vdVar, z3).Zmq(modifierRl), pagerState, orientation, z3, z2, pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource(), false, overscrollEffect, pagerBringIntoViewSpec), pagerState2), nestedScrollConnection2, null, 2, null), pagerState2.getPrefetchState(), function2N, composerKN, 0, 0);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                i15 = i21;
                                f4 = f5;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final NestedScrollConnection nestedScrollConnection3 = nestedScrollConnection2;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i28) {
                                        LazyLayoutPagerKt.n(modifier, pagerState2, paddingValues, z2, orientation, targetedFlingBehavior, z3, overscrollEffect, i15, f4, pageSize, nestedScrollConnection3, function1, horizontal, vertical, snapPosition, function4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i16 |= 24576;
                        if ((i7 & 32768) == 0) {
                        }
                        if ((i7 & 65536) == 0) {
                        }
                        i14 = i13;
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i7 & 16384) == 0) {
                    }
                    if ((i7 & 32768) == 0) {
                    }
                    if ((i7 & 65536) == 0) {
                    }
                    i14 = i13;
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i7 & 8192) == 0) {
                }
                if ((i7 & 16384) == 0) {
                }
                if ((i7 & 32768) == 0) {
                }
                if ((i7 & 65536) == 0) {
                }
                i14 = i13;
                if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i9 = i7 & 256;
            if (i9 != 0) {
            }
            i11 = i7 & 512;
            if (i11 != 0) {
            }
            if ((i7 & 1024) != 0) {
            }
            if ((i7 & 2048) != 0) {
            }
            int i162 = i12;
            if ((i7 & 4096) != 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if ((i7 & 16384) == 0) {
            }
            if ((i7 & 32768) == 0) {
            }
            if ((i7 & 65536) == 0) {
            }
            i14 = i13;
            if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i7 & 8) == 0) {
        }
        if ((i7 & 16) == 0) {
        }
        if ((i7 & 32) == 0) {
        }
        if ((i7 & 64) == 0) {
        }
        if ((i7 & 128) == 0) {
        }
        i9 = i7 & 256;
        if (i9 != 0) {
        }
        i11 = i7 & 512;
        if (i11 != 0) {
        }
        if ((i7 & 1024) != 0) {
        }
        if ((i7 & 2048) != 0) {
        }
        int i1622 = i12;
        if ((i7 & 4096) != 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if ((i7 & 16384) == 0) {
        }
        if ((i7 & 32768) == 0) {
        }
        if ((i7 & 65536) == 0) {
        }
        i14 = i13;
        if (composerKN.HI((i8 & 306783379) == 306783378 || (599187 & i14) != 599186, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Modifier rl(Modifier modifier, final PagerState pagerState) {
        return modifier.Zmq(SuspendingPointerInputFilterKt.nr(Modifier.INSTANCE, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {l.f62282d}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ PagerState f18833O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f18834n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ PointerInputScope f18835t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, Continuation continuation) {
                    super(2, continuation);
                    this.f18835t = pointerInputScope;
                    this.f18833O = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f18835t, this.f18833O, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {289, 293}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
                @SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,411:1\n87#2,2:412\n34#2,6:414\n89#2:420\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n*L\n294#1:412,2\n294#1:414,6\n294#1:420\n*E\n"})
                static final class C05071 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    int f18836O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f18837n;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ PagerState f18838r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    Object f18839t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05071(PagerState pagerState, Continuation continuation) {
                        super(2, continuation);
                        this.f18838r = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C05071 c05071 = new C05071(this.f18838r, continuation);
                        c05071.J2 = obj;
                        return c05071;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                        return ((C05071) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        PointerInputChange pointerInputChange;
                        PointerInputChange pointerInputChange2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f18836O;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    pointerInputChange = (PointerInputChange) this.f18839t;
                                    pointerInputChange2 = (PointerInputChange) this.f18837n;
                                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.J2;
                                    ResultKt.throwOnFailure(obj);
                                    PointerEvent pointerEvent = (PointerEvent) obj;
                                    List changes = pointerEvent.getChanges();
                                    int size = changes.size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < size) {
                                            if (!PointerEventKt.t((PointerInputChange) changes.get(i3))) {
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            pointerInputChange = (PointerInputChange) pointerEvent.getChanges().get(0);
                                            break;
                                        }
                                    }
                                    if (pointerInputChange != null) {
                                        PointerEventPass pointerEventPass = PointerEventPass.f32078n;
                                        this.J2 = awaitPointerEventScope2;
                                        this.f18837n = pointerInputChange2;
                                        this.f18839t = pointerInputChange;
                                        this.f18836O = 2;
                                        obj = awaitPointerEventScope2.HBN(pointerEventPass, this);
                                    } else {
                                        this.f18838r.m(Offset.ck(pointerInputChange.getPosition(), pointerInputChange2.getPosition()));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
                                ResultKt.throwOnFailure(obj);
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
                            PointerEventPass pointerEventPass2 = PointerEventPass.f32078n;
                            this.J2 = awaitPointerEventScope;
                            this.f18836O = 1;
                            obj = TapGestureDetectorKt.O(awaitPointerEventScope, false, pointerEventPass2, this);
                        }
                        this.f18838r.m(Offset.INSTANCE.t());
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = null;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f18834n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = this.f18835t;
                        C05071 c05071 = new C05071(this.f18833O, null);
                        this.f18834n = 1;
                        if (ForEachGestureKt.O(pointerInputScope, c05071, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objJ2 = Lu.J2(new AnonymousClass1(pointerInputScope, pagerState, null), continuation);
                return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
            }
        }));
    }

    private static final Function0 t(final PagerState pagerState, Function4 function4, Function1 function1, final Function0 function0, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1372505274, i2, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        final State stateCk = SnapshotStateKt.ck(function4, composer, (i2 >> 3) & 14);
        final State stateCk2 = SnapshotStateKt.ck(function1, composer, (i2 >> 6) & 14);
        boolean z3 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(pagerState)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zP5 = z2 | composer.p5(stateCk) | composer.p5(stateCk2);
        if ((((i2 & 7168) ^ 3072) > 2048 && composer.p5(function0)) || (i2 & 3072) == 2048) {
            z3 = true;
        }
        boolean z4 = zP5 | z3;
        Object objIF = composer.iF();
        if (z4 || objIF == Composer.INSTANCE.n()) {
            final State stateNr = SnapshotStateKt.nr(SnapshotStateKt.HI(), new Function0<PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent((Function4) stateCk.getValue(), (Function1) stateCk2.getValue(), ((Number) function0.invoke()).intValue());
                }
            });
            final State stateNr2 = SnapshotStateKt.nr(SnapshotStateKt.HI(), new Function0<PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent pagerLayoutIntervalContent = (PagerLayoutIntervalContent) stateNr.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, pagerLayoutIntervalContent, new NearestRangeKeyIndexMap(pagerState.X(), pagerLayoutIntervalContent));
                }
            });
            objIF = new PropertyReference0Impl(stateNr2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.o(objIF);
        }
        KProperty0 kProperty0 = (KProperty0) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return kProperty0;
    }
}
