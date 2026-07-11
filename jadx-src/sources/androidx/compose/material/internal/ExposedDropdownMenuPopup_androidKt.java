package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u0017\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "currentContent", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n75#2:460\n75#2:461\n75#2:462\n75#2:463\n1247#3,6:464\n1247#3,6:470\n1247#3,6:476\n1247#3,6:482\n1247#3,6:488\n1247#3,6:494\n79#4,6:500\n86#4,4:515\n90#4,2:525\n94#4:530\n79#4,6:531\n86#4,4:546\n90#4,2:556\n94#4:561\n368#5,9:506\n377#5,3:527\n368#5,9:537\n377#5,3:558\n4034#6,6:519\n4034#6,6:550\n85#7:562\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n82#1:460\n83#1:461\n84#1:462\n85#1:463\n89#1:464,6\n115#1:470,6\n129#1:476,6\n137#1:482,6\n149#1:488,6\n160#1:494,6\n146#1:500,6\n146#1:515,4\n146#1:525,2\n146#1:530\n176#1:531,6\n176#1:546,4\n176#1:556,2\n176#1:561\n146#1:506,9\n146#1:527,3\n176#1:537,9\n176#1:558,3\n146#1:519,6\n176#1:550,6\n87#1:562\n*E\n"})
public final class ExposedDropdownMenuPopup_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f23884n = CompositionLocalKt.O(null, new Function0<String>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    public static final void n(Function0 function0, PopupPositionProvider popupPositionProvider, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        final Function0 function03;
        int i7;
        int i8;
        boolean z2;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Composer composerKN = composer.KN(-707851182);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(popupPositionProvider2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function2) ? 256 : 128;
        }
        if (composerKN.HI((i5 & 147) != 146, i5 & 1)) {
            function03 = i9 != 0 ? null : function02;
            if (ComposerKt.v()) {
                ComposerKt.p5(-707851182, i5, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            final String str = (String) composerKN.ty(f23884n);
            final LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
            CompositionContext compositionContextNr = ComposablesKt.nr(composerKN, 0);
            final State stateCk = SnapshotStateKt.ck(function2, composerKN, (i5 >> 6) & 14);
            UUID uuid = (UUID) RememberSaveableKt.O(new Object[0], null, null, new Function0<UUID>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, composerKN, 3072, 6);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                i7 = 4;
                i8 = i5;
                final PopupLayout popupLayout = new PopupLayout(function03, str, view, density, popupPositionProvider2, uuid);
                str = str;
                popupPositionProvider2 = popupPositionProvider2;
                z2 = true;
                popupLayout.HI(compositionContextNr, ComposableLambdaKt.rl(580081703, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i10) {
                        if (!composer2.HI((i10 & 3) != 2, i10 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(580081703, i10, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:99)");
                        }
                        Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.U(semanticsPropertyReceiver);
                            }
                        }, 1, null);
                        boolean zE2 = composer2.E2(popupLayout);
                        final PopupLayout popupLayout2 = popupLayout;
                        Object objIF2 = composer2.iF();
                        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                    n(intSize.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(long j2) {
                                    popupLayout2.m5setPopupContentSizefhxjrPA(IntSize.rl(j2));
                                    popupLayout2.XQ();
                                }
                            };
                            composer2.o(objIF2);
                        }
                        Modifier modifierN = AlphaKt.n(OnRemeasuredModifierKt.n(modifierNr, (Function1) objIF2), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                        Function2 function2Rl = ExposedDropdownMenuPopup_androidKt.rl(stateCk);
                        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                int i11;
                                int i12;
                                int size = list.size();
                                if (size != 0) {
                                    int i13 = 0;
                                    if (size != 1) {
                                        final ArrayList arrayList = new ArrayList(list.size());
                                        int size2 = list.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            arrayList.add(((Measurable) list.get(i14)).dR0(j2));
                                        }
                                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                        if (lastIndex >= 0) {
                                            int iMax = 0;
                                            int iMax2 = 0;
                                            while (true) {
                                                Placeable placeable = (Placeable) arrayList.get(i13);
                                                iMax = Math.max(iMax, placeable.getWidth());
                                                iMax2 = Math.max(iMax2, placeable.getHeight());
                                                if (i13 == lastIndex) {
                                                    break;
                                                }
                                                i13++;
                                            }
                                            i11 = iMax;
                                            i12 = iMax2;
                                        } else {
                                            i11 = 0;
                                            i12 = 0;
                                        }
                                        return MeasureScope.ER(measureScope, i11, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.3
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
                                                int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                                if (lastIndex2 < 0) {
                                                    return;
                                                }
                                                int i15 = 0;
                                                while (true) {
                                                    Placeable.PlacementScope placementScope2 = placementScope;
                                                    Placeable.PlacementScope.az(placementScope2, (Placeable) arrayList.get(i15), 0, 0, 0.0f, 4, null);
                                                    if (i15 == lastIndex2) {
                                                        return;
                                                    }
                                                    i15++;
                                                    placementScope = placementScope2;
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    final Placeable placeableDR0 = ((Measurable) list.get(0)).dR0(j2);
                                    return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.2
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Placeable.PlacementScope placementScope) {
                                            Placeable.PlacementScope.az(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                                return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.1
                                    public final void n(Placeable.PlacementScope placementScope) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        n(placementScope);
                                        return Unit.INSTANCE;
                                    }
                                }, 4, null);
                            }
                        };
                        int iN = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
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
                        Updater.O(composerN, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl2 = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl2);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        function2Rl.invoke(composer2, 0);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }));
                composerKN.o(popupLayout);
                objIF = popupLayout;
            } else {
                i7 = 4;
                i8 = i5;
                z2 = true;
            }
            final PopupLayout popupLayout2 = (PopupLayout) objIF;
            int i10 = i8 & 14;
            boolean zE2 = composerKN.E2(popupLayout2) | (i10 == i7 ? z2 : false) | composerKN.p5(str) | composerKN.p5(layoutDirection);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        popupLayout2.Ik();
                        popupLayout2.Z(function03, str, layoutDirection);
                        final PopupLayout popupLayout3 = popupLayout2;
                        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                popupLayout3.J2();
                                popupLayout3.az();
                            }
                        };
                    }
                };
                composerKN.o(objIF2);
            }
            EffectsKt.rl(popupLayout2, (Function1) objIF2, composerKN, 0);
            boolean zE22 = composerKN.E2(popupLayout2) | (i10 == i7 ? z2 : false) | composerKN.p5(str) | composerKN.p5(layoutDirection);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function0<Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        popupLayout2.Z(function03, str, layoutDirection);
                    }
                };
                composerKN.o(objIF3);
            }
            EffectsKt.KN((Function0) objIF3, composerKN, 0);
            boolean zE23 = composerKN.E2(popupLayout2);
            if ((i8 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = zE23 | z2;
            Object objIF4 = composerKN.iF();
            if (z3 || objIF4 == companion.n()) {
                objIF4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        popupLayout2.setPositionProvider(popupPositionProvider2);
                        popupLayout2.XQ();
                        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                            }
                        };
                    }
                };
                composerKN.o(objIF4);
            }
            EffectsKt.rl(popupPositionProvider2, (Function1) objIF4, composerKN, (i8 >> 3) & 14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean zE24 = composerKN.E2(popupLayout2);
            Object objIF5 = composerKN.iF();
            if (zE24 || objIF5 == companion.n()) {
                objIF5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        n(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    public final void n(LayoutCoordinates layoutCoordinates) {
                        LayoutCoordinates layoutCoordinatesPiY = layoutCoordinates.piY();
                        Intrinsics.checkNotNull(layoutCoordinatesPiY);
                        long jN = layoutCoordinatesPiY.n();
                        long jUo = LayoutCoordinatesKt.Uo(layoutCoordinatesPiY);
                        popupLayout2.ck(IntRectKt.n(IntOffsetKt.n(MathKt.roundToInt(Offset.az(jUo)), MathKt.roundToInt(Offset.ty(jUo))), jN));
                        popupLayout2.XQ();
                    }
                };
                composerKN.o(objIF5);
            }
            Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF5);
            boolean zE25 = composerKN.E2(popupLayout2) | composerKN.p5(layoutDirection);
            Object objIF6 = composerKN.iF();
            if (zE25 || objIF6 == companion.n()) {
                objIF6 = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        popupLayout2.setParentLayoutDirection(layoutDirection);
                        return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1.1
                            public final void n(Placeable.PlacementScope placementScope) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                n(placementScope);
                                return Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicy, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
            function03 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7
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
                    ExposedDropdownMenuPopup_androidKt.n(function03, popupPositionProvider2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 rl(State state) {
        return (Function2) state.getValue();
    }
}
