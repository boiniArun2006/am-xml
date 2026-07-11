package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u009f\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u000423\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a©\u0001\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u001623\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "tabPositions", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "rl", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "edgePadding", c.f62177j, "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Landroidx/compose/animation/core/AnimationSpec;", "", "Landroidx/compose/animation/core/AnimationSpec;", "ScrollableTabRowScrollSpec", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,491:1\n149#2:492\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n486#1:492\n*E\n"})
public final class TabRowKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23412n = Dp.KN(90);
    private static final AnimationSpec rl = AnimationSpecKt.ty(250, 0, EasingKt.nr(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final int i2, Modifier modifier, long j2, long j3, float f3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        long jJ2;
        long jRl;
        int i8;
        float f4;
        int i9;
        Function3 function32;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final long j4;
        final long j5;
        final float f5;
        final Function3 function33;
        final Function2 function23;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fNr;
        Modifier modifier3;
        Function3 function34;
        Function2 function2Rl;
        Composer composerKN = composer.KN(-1473476840);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jJ2 = j2;
                    int i12 = composerKN.nr(jJ2) ? 256 : 128;
                    i7 |= i12;
                } else {
                    jJ2 = j2;
                }
                i7 |= i12;
            } else {
                jJ2 = j2;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jRl = j3;
                    int i13 = composerKN.nr(jRl) ? 2048 : 1024;
                    i7 |= i13;
                } else {
                    jRl = j3;
                }
                i7 |= i13;
            } else {
                jRl = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    f4 = f3;
                    i7 |= composerKN.rl(f4) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        function32 = function3;
                        i7 |= composerKN.E2(function32) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((i5 & 128) != 0) {
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerKN.E2(function22) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
                            composerKN.e();
                            if ((i3 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i5 & 4) != 0) {
                                    jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    jRl = ColorsKt.rl(jJ2, composerKN, (i7 >> 6) & 14);
                                    i7 &= -7169;
                                }
                                fNr = i8 != 0 ? TabRowDefaults.f23397n.nr() : f4;
                                Function3 function3Nr = i9 != 0 ? ComposableLambdaKt.nr(-655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                        n(list, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(List list, Composer composer3, int i14) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-655609869, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f23397n;
                                        tabRowDefaults.rl(tabRowDefaults.O(Modifier.INSTANCE, (TabPosition) list.get(i2)), 0.0f, 0L, composer3, 3072, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : function32;
                                if (i10 != 0) {
                                    function2Rl = ComposableSingletons$TabRowKt.f21741n.rl();
                                    Function3 function35 = function3Nr;
                                    modifier3 = modifier4;
                                    function34 = function35;
                                } else {
                                    Function3 function36 = function3Nr;
                                    modifier3 = modifier4;
                                    function34 = function36;
                                    function2Rl = function2;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                                function2Rl = function2;
                                fNr = f4;
                                function34 = function32;
                                modifier3 = modifier;
                            }
                            long j6 = jJ2;
                            long j7 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1473476840, i7, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)");
                            }
                            final Function3 function37 = function34;
                            final float f6 = fNr;
                            final Function2 function24 = function2Rl;
                            composer2 = composerKN;
                            SurfaceKt.n(modifier3, null, j6, j7, null, 0.0f, ComposableLambdaKt.nr(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i14) {
                                    if (!composer3.HI((i14 & 3) != 2, i14 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1455860572, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
                                    }
                                    ScrollState scrollStateT = ScrollKt.t(0, composer3, 0, 1);
                                    Object objIF = composer3.iF();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objIF == companion.n()) {
                                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3);
                                        composer3.o(objIF);
                                    }
                                    vd vdVar = (vd) objIF;
                                    boolean zP5 = composer3.p5(scrollStateT) | composer3.p5(vdVar);
                                    Object objIF2 = composer3.iF();
                                    if (zP5 || objIF2 == companion.n()) {
                                        objIF2 = new ScrollableTabData(scrollStateT, vdVar);
                                        composer3.o(objIF2);
                                    }
                                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objIF2;
                                    Modifier modifierRl = ClipKt.rl(SelectableGroupKt.n(ScrollKt.rl(SizeKt.E2(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.KN(), false, 2, null), scrollStateT, false, null, false, 14, null)));
                                    boolean zRl = composer3.rl(f6) | composer3.p5(function22) | composer3.p5(function24) | composer3.p5(function37) | composer3.E2(scrollableTabData) | composer3.t(i2);
                                    final float f7 = f6;
                                    final Function2 function25 = function22;
                                    final Function2 function26 = function24;
                                    final int i15 = i2;
                                    final Function3 function38 = function37;
                                    Object objIF3 = composer3.iF();
                                    if (zRl || objIF3 == companion.n()) {
                                        Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                                int iHow = subcomposeMeasureScope.How(TabRowKt.f23412n);
                                                final int iHow2 = subcomposeMeasureScope.How(f7);
                                                long jNr = Constraints.nr(j9, iHow, 0, 0, 0, 14, null);
                                                List listY = subcomposeMeasureScope.Y(TabSlots.f23467n, function25);
                                                final ArrayList arrayList = new ArrayList(listY.size());
                                                int size = listY.size();
                                                for (int i16 = 0; i16 < size; i16++) {
                                                    arrayList.add(((Measurable) listY.get(i16)).dR0(jNr));
                                                }
                                                final Ref.IntRef intRef = new Ref.IntRef();
                                                intRef.element = iHow2 * 2;
                                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                                int size2 = arrayList.size();
                                                for (int i17 = 0; i17 < size2; i17++) {
                                                    Placeable placeable = (Placeable) arrayList.get(i17);
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i18 = intRef.element;
                                                int i19 = intRef2.element;
                                                final Function2 function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i20 = i15;
                                                final Function3 function39 = function38;
                                                return MeasureScope.ER(subcomposeMeasureScope, i18, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
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
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        int i21 = iHow2;
                                                        List list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        int size3 = list.size();
                                                        int width = i21;
                                                        for (int i22 = 0; i22 < size3; i22++) {
                                                            Placeable placeable2 = (Placeable) list.get(i22);
                                                            Placeable.PlacementScope.az(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.rV9(width), subcomposeMeasureScope2.rV9(placeable2.getWidth()), null));
                                                            width += placeable2.getWidth();
                                                        }
                                                        List listY2 = subcomposeMeasureScope.Y(TabSlots.f23469t, function27);
                                                        long j10 = j9;
                                                        Ref.IntRef intRef3 = intRef;
                                                        Ref.IntRef intRef4 = intRef2;
                                                        int size4 = listY2.size();
                                                        for (int i23 = 0; i23 < size4; i23++) {
                                                            Measurable measurable = (Measurable) listY2.get(i23);
                                                            int i24 = intRef3.element;
                                                            Placeable placeableDR0 = measurable.dR0(Constraints.nr(j10, i24, i24, 0, 0, 8, null));
                                                            Placeable.PlacementScope.az(placementScope, placeableDR0, 0, intRef4.element - placeableDR0.getHeight(), 0.0f, 4, null);
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.f23466O;
                                                        final Function3 function310 = function39;
                                                        List listY3 = subcomposeMeasureScope3.Y(tabSlots, ComposableLambdaKt.rl(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                n(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer4, int i25) {
                                                                if (!composer4.HI((i25 & 3) != 2, i25 & 1)) {
                                                                    composer4.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(-411868839, i25, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                                                                }
                                                                function310.invoke(arrayList2, composer4, 0);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }));
                                                        Ref.IntRef intRef5 = intRef;
                                                        Ref.IntRef intRef6 = intRef2;
                                                        int size5 = listY3.size();
                                                        for (int i25 = 0; i25 < size5; i25++) {
                                                            Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i25)).dR0(Constraints.INSTANCE.t(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.t(subcomposeMeasureScope, iHow2, arrayList2, i20);
                                                    }
                                                }, 4, null);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return n(subcomposeMeasureScope, constraints.getValue());
                                            }
                                        };
                                        composer3.o(obj);
                                        objIF3 = obj;
                                    }
                                    SubcomposeLayoutKt.n(modifierRl, (Function2) objIF3, composer3, 0, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, ((i7 >> 3) & 14) | 1572864 | (i7 & 896) | (i7 & 7168), 50);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function33 = function34;
                            function23 = function24;
                            f5 = fNr;
                            modifier2 = modifier3;
                            j4 = j6;
                            j5 = j7;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier2 = modifier;
                            j4 = jJ2;
                            j5 = jRl;
                            f5 = f4;
                            function33 = function32;
                            function23 = function2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i14) {
                                    TabRowKt.n(i2, modifier2, j4, j5, f5, function33, function23, function22, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 12582912;
                    if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function32 = function3;
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            f4 = f3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            function32 = function3;
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        f4 = f3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        function32 = function3;
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final int i2, Modifier modifier, long j2, long j3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        long jJ2;
        long jRl;
        int i8;
        Function3 function32;
        int i9;
        Function2 function23;
        Composer composer2;
        final Modifier modifier2;
        final long j4;
        final long j5;
        final Function3 function33;
        final Function2 function24;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        final Function3 function3Nr;
        int i10;
        final Function2 function2N;
        long j6;
        Composer composerKN = composer.KN(-249175289);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jJ2 = j2;
                    int i12 = composerKN.nr(jJ2) ? 256 : 128;
                    i7 |= i12;
                } else {
                    jJ2 = j2;
                }
                i7 |= i12;
            } else {
                jJ2 = j2;
            }
            if ((i3 & 3072) != 0) {
                jRl = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(jRl)) ? 2048 : 1024;
            } else {
                jRl = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    function32 = function3;
                    i7 |= composerKN.E2(function32) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                    if ((196608 & i3) == 0) {
                        function23 = function2;
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i5 & 64) == 0) {
                        i7 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.E2(function22) ? 1048576 : 524288;
                    }
                    if (composerKN.HI((i7 & 599187) == 599186, i7 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier2 = modifier;
                        j4 = jJ2;
                        j5 = jRl;
                        function33 = function32;
                        function24 = function23;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                            modifier3 = i11 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i5 & 4) != 0) {
                                jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                i7 &= -897;
                            }
                            if ((i5 & 8) != 0) {
                                jRl = ColorsKt.rl(jJ2, composerKN, (i7 >> 6) & 14);
                                i7 &= -7169;
                            }
                            function3Nr = i8 != 0 ? ComposableLambdaKt.nr(-553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                    n(list, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(List list, Composer composer3, int i13) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-553782708, i13, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f23397n;
                                    tabRowDefaults.rl(tabRowDefaults.O(Modifier.INSTANCE, (TabPosition) list.get(i2)), 0.0f, 0L, composer3, 3072, 6);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54) : function32;
                            if (i9 != 0) {
                                long j7 = jJ2;
                                i10 = i7;
                                function2N = ComposableSingletons$TabRowKt.f21741n.n();
                                j6 = j7;
                            }
                            long j9 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-249175289, i10, -1, "androidx.compose.material.TabRow (TabRow.kt:145)");
                            }
                            composer2 = composerKN;
                            SurfaceKt.n(SelectableGroupKt.n(modifier3), null, j6, j9, null, 0.0f, ComposableLambdaKt.nr(-1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i13) {
                                    if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1961746365, i13, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
                                    }
                                    Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                                    boolean zP5 = composer3.p5(function22) | composer3.p5(function2N) | composer3.p5(function3Nr);
                                    final Function2 function25 = function22;
                                    final Function2 function26 = function2N;
                                    final Function3 function34 = function3Nr;
                                    Object objIF = composer3.iF();
                                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return n(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j10) {
                                                int i14;
                                                Object obj;
                                                final int iQie = Constraints.qie(j10);
                                                List listY = subcomposeMeasureScope.Y(TabSlots.f23467n, function25);
                                                int size = listY.size();
                                                final int i15 = iQie / size;
                                                final ArrayList arrayList = new ArrayList(listY.size());
                                                int size2 = listY.size();
                                                for (int i16 = 0; i16 < size2; i16++) {
                                                    Measurable measurable = (Measurable) listY.get(i16);
                                                    int i17 = i15;
                                                    long jNr = Constraints.nr(j10, i17, i15, 0, 0, 12, null);
                                                    i15 = i17;
                                                    arrayList.add(measurable.dR0(jNr));
                                                }
                                                if (arrayList.isEmpty()) {
                                                    obj = null;
                                                    i14 = 0;
                                                } else {
                                                    i14 = 0;
                                                    obj = arrayList.get(0);
                                                    int height = ((Placeable) obj).getHeight();
                                                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                                    int i18 = 1;
                                                    if (1 <= lastIndex) {
                                                        while (true) {
                                                            Object obj2 = arrayList.get(i18);
                                                            int height2 = ((Placeable) obj2).getHeight();
                                                            if (height < height2) {
                                                                obj = obj2;
                                                                height = height2;
                                                            }
                                                            if (i18 == lastIndex) {
                                                                break;
                                                            }
                                                            i18++;
                                                        }
                                                    }
                                                }
                                                Placeable placeable = (Placeable) obj;
                                                final int height3 = placeable != null ? placeable.getHeight() : i14;
                                                final ArrayList arrayList2 = new ArrayList(size);
                                                for (int i19 = i14; i19 < size; i19++) {
                                                    arrayList2.add(new TabPosition(Dp.KN(subcomposeMeasureScope.rV9(i15) * i19), subcomposeMeasureScope.rV9(i15), null));
                                                }
                                                final Function2 function27 = function26;
                                                final Function3 function35 = function34;
                                                return MeasureScope.ER(subcomposeMeasureScope, iQie, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                                        List list = arrayList;
                                                        int i20 = i15;
                                                        int size3 = list.size();
                                                        for (int i21 = 0; i21 < size3; i21++) {
                                                            Placeable.PlacementScope.az(placementScope, (Placeable) list.get(i21), i21 * i20, 0, 0.0f, 4, null);
                                                        }
                                                        List listY2 = subcomposeMeasureScope.Y(TabSlots.f23469t, function27);
                                                        long j11 = j10;
                                                        int i22 = height3;
                                                        int size4 = listY2.size();
                                                        for (int i23 = 0; i23 < size4; i23++) {
                                                            Placeable placeableDR0 = ((Measurable) listY2.get(i23)).dR0(Constraints.nr(j11, 0, 0, 0, 0, 11, null));
                                                            Placeable.PlacementScope.az(placementScope, placeableDR0, 0, i22 - placeableDR0.getHeight(), 0.0f, 4, null);
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.f23466O;
                                                        final Function3 function36 = function35;
                                                        final List list2 = arrayList2;
                                                        List listY3 = subcomposeMeasureScope2.Y(tabSlots, ComposableLambdaKt.rl(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                n(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer4, int i24) {
                                                                if (!composer4.HI((i24 & 3) != 2, i24 & 1)) {
                                                                    composer4.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(-641946361, i24, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                                                                }
                                                                function36.invoke(list2, composer4, 0);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }));
                                                        int i24 = iQie;
                                                        int i25 = height3;
                                                        int size5 = listY3.size();
                                                        for (int i26 = 0; i26 < size5; i26++) {
                                                            Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i26)).dR0(Constraints.INSTANCE.t(i24, i25)), 0, 0, 0.0f, 4, null);
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer3.o(objIF);
                                    }
                                    SubcomposeLayoutKt.n(modifierKN, (Function2) objIF, composer3, 6, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier2 = modifier3;
                            function33 = function3Nr;
                            j5 = j9;
                            function24 = function2N;
                            j4 = j6;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i5 & 8) != 0) {
                                i7 &= -7169;
                            }
                            modifier3 = modifier;
                            function3Nr = function32;
                        }
                        j6 = jJ2;
                        i10 = i7;
                        function2N = function23;
                        long j92 = jRl;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        SurfaceKt.n(SelectableGroupKt.n(modifier3), null, j6, j92, null, 0.0f, ComposableLambdaKt.nr(-1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1961746365, i13, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
                                }
                                Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                                boolean zP5 = composer3.p5(function22) | composer3.p5(function2N) | composer3.p5(function3Nr);
                                final Function2 function25 = function22;
                                final Function2 function26 = function2N;
                                final Function3 function34 = function3Nr;
                                Object objIF = composer3.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return n(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j10) {
                                            int i14;
                                            Object obj;
                                            final int iQie = Constraints.qie(j10);
                                            List listY = subcomposeMeasureScope.Y(TabSlots.f23467n, function25);
                                            int size = listY.size();
                                            final int i15 = iQie / size;
                                            final List arrayList = new ArrayList(listY.size());
                                            int size2 = listY.size();
                                            for (int i16 = 0; i16 < size2; i16++) {
                                                Measurable measurable = (Measurable) listY.get(i16);
                                                int i17 = i15;
                                                long jNr = Constraints.nr(j10, i17, i15, 0, 0, 12, null);
                                                i15 = i17;
                                                arrayList.add(measurable.dR0(jNr));
                                            }
                                            if (arrayList.isEmpty()) {
                                                obj = null;
                                                i14 = 0;
                                            } else {
                                                i14 = 0;
                                                obj = arrayList.get(0);
                                                int height = ((Placeable) obj).getHeight();
                                                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                                int i18 = 1;
                                                if (1 <= lastIndex) {
                                                    while (true) {
                                                        Object obj2 = arrayList.get(i18);
                                                        int height2 = ((Placeable) obj2).getHeight();
                                                        if (height < height2) {
                                                            obj = obj2;
                                                            height = height2;
                                                        }
                                                        if (i18 == lastIndex) {
                                                            break;
                                                        }
                                                        i18++;
                                                    }
                                                }
                                            }
                                            Placeable placeable = (Placeable) obj;
                                            final int height3 = placeable != null ? placeable.getHeight() : i14;
                                            final List arrayList2 = new ArrayList(size);
                                            for (int i19 = i14; i19 < size; i19++) {
                                                arrayList2.add(new TabPosition(Dp.KN(subcomposeMeasureScope.rV9(i15) * i19), subcomposeMeasureScope.rV9(i15), null));
                                            }
                                            final Function2 function27 = function26;
                                            final Function3 function35 = function34;
                                            return MeasureScope.ER(subcomposeMeasureScope, iQie, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                                    List list = arrayList;
                                                    int i20 = i15;
                                                    int size3 = list.size();
                                                    for (int i21 = 0; i21 < size3; i21++) {
                                                        Placeable.PlacementScope.az(placementScope, (Placeable) list.get(i21), i21 * i20, 0, 0.0f, 4, null);
                                                    }
                                                    List listY2 = subcomposeMeasureScope.Y(TabSlots.f23469t, function27);
                                                    long j11 = j10;
                                                    int i22 = height3;
                                                    int size4 = listY2.size();
                                                    for (int i23 = 0; i23 < size4; i23++) {
                                                        Placeable placeableDR0 = ((Measurable) listY2.get(i23)).dR0(Constraints.nr(j11, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.az(placementScope, placeableDR0, 0, i22 - placeableDR0.getHeight(), 0.0f, 4, null);
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.f23466O;
                                                    final Function3 function36 = function35;
                                                    final List list2 = arrayList2;
                                                    List listY3 = subcomposeMeasureScope2.Y(tabSlots, ComposableLambdaKt.rl(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            n(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer4, int i24) {
                                                            if (!composer4.HI((i24 & 3) != 2, i24 & 1)) {
                                                                composer4.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(-641946361, i24, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                                                            }
                                                            function36.invoke(list2, composer4, 0);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }));
                                                    int i24 = iQie;
                                                    int i25 = height3;
                                                    int size5 = listY3.size();
                                                    for (int i26 = 0; i26 < size5; i26++) {
                                                        Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i26)).dR0(Constraints.INSTANCE.t(i24, i25)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer3.o(objIF);
                                }
                                SubcomposeLayoutKt.n(modifierKN, (Function2) objIF, composer3, 6, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                        if (ComposerKt.v()) {
                        }
                        modifier2 = modifier3;
                        function33 = function3Nr;
                        j5 = j92;
                        function24 = function2N;
                        j4 = j6;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                TabRowKt.rl(i2, modifier2, j4, j5, function33, function24, function22, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 196608;
                function23 = function2;
                if ((i5 & 64) == 0) {
                }
                if (composerKN.HI((i7 & 599187) == 599186, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function32 = function3;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            function23 = function2;
            if ((i5 & 64) == 0) {
            }
            if (composerKN.HI((i7 & 599187) == 599186, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        function32 = function3;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        function23 = function2;
        if ((i5 & 64) == 0) {
        }
        if (composerKN.HI((i7 & 599187) == 599186, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
