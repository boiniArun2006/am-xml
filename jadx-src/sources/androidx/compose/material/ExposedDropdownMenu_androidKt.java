package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\u000e\u0010\u001b\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "gh", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/IntRect;", "windowBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "verticalMarginInPx", "onHeightUpdate", "qie", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function1;)V", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "ExposedDropdownMenu_androidKt")
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,671:1\n75#2:672\n1247#3,6:673\n1247#3,6:679\n1247#3,6:686\n1247#3,6:692\n1247#3,6:698\n1247#3,6:704\n1247#3,6:710\n1247#3,6:756\n1247#3,6:762\n1#4:685\n71#5:716\n68#5,6:717\n74#5:751\n78#5:755\n79#6,6:723\n86#6,4:738\n90#6,2:748\n94#6:754\n368#7,9:729\n377#7:750\n378#7,2:752\n4034#8,6:742\n78#9:768\n107#9,2:769\n78#9:771\n107#9,2:772\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n*L\n96#1:672\n98#1:673,6\n99#1:679,6\n101#1:686,6\n104#1:692,6\n117#1:698,6\n121#1:704,6\n133#1:710,6\n141#1:756,6\n143#1:762,6\n119#1:716\n119#1:717,6\n119#1:751\n119#1:755\n119#1:723,6\n119#1:738,4\n119#1:748,2\n119#1:754\n119#1:729,9\n119#1:750\n119#1:752,2\n119#1:742,6\n98#1:768\n98#1:769,2\n99#1:771\n99#1:772,2\n*E\n"})
public final class ExposedDropdownMenu_androidKt {
    private static final Modifier gh(Modifier modifier, final Function0 function0, final String str) {
        return SemanticsModifierKt.nr(modifier.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new ExposedDropdownMenu_androidKt$expandable$1(function0, null)), 6, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
                final Function0 function02 = function0;
                SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        function02.invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        final Ref ref;
        final int i7;
        Composer composerKN = composer.KN(1456052980);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function3) ? 2048 : 1024;
            }
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1456052980, i5, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
                }
                final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                final WindowBoundsCalculator windowBoundsCalculatorNr = ExposedDropdownMenu_android.nr(composerKN, 0);
                Object objIF = composerKN.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotIntStateKt.n(0);
                    composerKN.o(objIF);
                }
                final MutableIntState mutableIntState = (MutableIntState) objIF;
                Object objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = SnapshotIntStateKt.n(0);
                    composerKN.o(objIF2);
                }
                final MutableIntState mutableIntState2 = (MutableIntState) objIF2;
                final int iHow = density.How(MenuKt.mUb());
                Object objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = new Ref();
                    composerKN.o(objIF3);
                }
                final Ref ref2 = (Ref) objIF3;
                boolean zP5 = composerKN.p5(density) | composerKN.t(nr(mutableIntState2)) | composerKN.t(rl(mutableIntState));
                Object objIF4 = composerKN.iF();
                if (zP5 || objIF4 == companion.n()) {
                    objIF4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public Modifier rl(Modifier modifier4, boolean z3) {
                            Density density2 = density;
                            MutableIntState mutableIntState3 = mutableIntState2;
                            MutableIntState mutableIntState4 = mutableIntState;
                            Modifier modifierGh = SizeKt.gh(modifier4, 0.0f, density2.rV9(ExposedDropdownMenu_androidKt.nr(mutableIntState3)), 1, null);
                            return z3 ? SizeKt.ViF(modifierGh, density2.rV9(ExposedDropdownMenu_androidKt.rl(mutableIntState4))) : modifierGh;
                        }
                    };
                    composerKN.o(objIF4);
                }
                ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) objIF4;
                Object objIF5 = composerKN.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = new FocusRequester();
                    composerKN.o(objIF5);
                }
                final FocusRequester focusRequester = (FocusRequester) objIF5;
                boolean zE2 = composerKN.E2(ref2) | composerKN.E2(windowBoundsCalculatorNr) | composerKN.t(iHow);
                Object objIF6 = composerKN.iF();
                if (zE2 || objIF6 == companion.n()) {
                    objIF6 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            n(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        public final void n(LayoutCoordinates layoutCoordinates) {
                            ExposedDropdownMenu_androidKt.t(mutableIntState, IntSize.Uo(layoutCoordinates.n()));
                            ref2.rl(layoutCoordinates);
                            IntRect intRectN = windowBoundsCalculatorNr.n();
                            LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) ref2.getValue();
                            int i9 = iHow;
                            final MutableIntState mutableIntState3 = mutableIntState2;
                            ExposedDropdownMenu_androidKt.qie(intRectN, layoutCoordinates2, i9, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                    n(num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(int i10) {
                                    ExposedDropdownMenu_androidKt.O(mutableIntState3, i10);
                                }
                            });
                        }
                    };
                    ref = ref2;
                    i7 = iHow;
                    composerKN.o(objIF6);
                } else {
                    i7 = iHow;
                    ref = ref2;
                }
                Modifier modifierN = OnGloballyPositionedModifierKt.n(modifier2, (Function1) objIF6);
                int i9 = i5 & 14;
                boolean z3 = ((i5 & 112) == 32) | (i9 == 4);
                Object objIF7 = composerKN.iF();
                int i10 = i5;
                if (z3 || objIF7 == companion.n()) {
                    objIF7 = new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1
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
                            function1.invoke(Boolean.valueOf(!z2));
                        }
                    };
                    composerKN.o(objIF7);
                }
                Modifier modifierN2 = FocusRequesterModifierKt.n(gh(modifierN, (Function0) objIF7, Strings_androidKt.n(Strings.INSTANCE.nr(), composerKN, 6)), focusRequester);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
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
                Modifier modifier4 = modifier2;
                Updater.O(composerN, measurePolicyUo, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, composerKN, Integer.valueOf((i10 >> 6) & 112));
                composerKN.XQ();
                boolean z4 = i9 == 4;
                Object objIF8 = composerKN.iF();
                if (z4 || objIF8 == companion.n()) {
                    objIF8 = new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
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
                            if (z2) {
                                focusRequester.J2();
                            }
                        }
                    };
                    composerKN.o(objIF8);
                }
                EffectsKt.KN((Function0) objIF8, composerKN, 0);
                boolean zE22 = composerKN.E2(windowBoundsCalculatorNr) | composerKN.E2(ref) | composerKN.t(i7);
                Object objIF9 = composerKN.iF();
                if (zE22 || objIF9 == companion.n()) {
                    objIF9 = new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
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
                            IntRect intRectN = windowBoundsCalculatorNr.n();
                            LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ref.getValue();
                            int i11 = i7;
                            final MutableIntState mutableIntState3 = mutableIntState2;
                            ExposedDropdownMenu_androidKt.qie(intRectN, layoutCoordinates, i11, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                    n(num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(int i12) {
                                    ExposedDropdownMenu_androidKt.O(mutableIntState3, i12);
                                }
                            });
                        }
                    };
                    composerKN.o(objIF9);
                }
                ExposedDropdownMenu_android.n((Function0) objIF9, composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6
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
                        ExposedDropdownMenu_androidKt.n(z2, function1, modifier3, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(IntRect intRect, LayoutCoordinates layoutCoordinates, int i2, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.t(layoutCoordinates).getTop() - intRect.getTop(), (intRect.getBottom() - intRect.getTop()) - LayoutCoordinatesKt.t(layoutCoordinates).xMQ())) - i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rl(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }
}
