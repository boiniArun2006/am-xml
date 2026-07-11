package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "isPersistent", "Lkotlin/Function0;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "enabled", "Landroidx/compose/material3/TooltipState;", "state", c.f62177j, "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,143:1\n1223#2,6:144\n1223#2,6:150\n1223#2,6:156\n1223#2,6:162\n1223#2,6:168\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n*L\n73#1:144,6\n77#1:150,6\n80#1:156,6\n81#1:162,6\n111#1:168,6\n*E\n"})
public final class LabelKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019e  */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function3 function3, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        TooltipState tooltipStateN;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource5;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-544399326);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i5 |= composerKN.p5(mutableInteractionSource2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        z3 = z2;
                        i5 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= composerKN.E2(function2) ? 16384 : 8192;
                    }
                    if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        mutableInteractionSource3 = i7 == 0 ? null : mutableInteractionSource2;
                        z4 = i8 == 0 ? false : z3;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-544399326, i5, -1, "androidx.compose.material3.Label (Label.kt:70)");
                        }
                        composerKN.eF(519104973);
                        if (mutableInteractionSource3 != null) {
                            Object objIF3 = composerKN.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = InteractionSourceKt.n();
                                composerKN.o(objIF3);
                            }
                            mutableInteractionSource4 = (MutableInteractionSource) objIF3;
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        composerKN.Xw();
                        PopupPositionProvider popupPositionProviderJ2 = TooltipDefaults.f28770n.J2(0.0f, composerKN, 48, 1);
                        if (z4) {
                            composerKN.eF(519114025);
                            tooltipStateN = BasicTooltipKt.n(false, false, new MutatorMutex(), composerKN, 0, 3);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-1087377900);
                            Object objIF4 = composerKN.iF();
                            if (objIF4 == Composer.INSTANCE.n()) {
                                objIF4 = new LabelStateImpl(false, false, 3, null);
                                composerKN.o(objIF4);
                            }
                            tooltipStateN = (LabelStateImpl) objIF4;
                            composerKN.Xw();
                        }
                        TooltipState tooltipState = tooltipStateN;
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                            composerKN.o(objIF);
                        }
                        objectRef.element = (MutableState) objIF;
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                            objIF2 = new TooltipScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.material3.LabelKt$Label$scope$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final LayoutCoordinates invoke() {
                                    return (LayoutCoordinates) ((MutableState) objectRef.element).getValue();
                                }
                            });
                            composerKN.o(objIF2);
                        }
                        final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) objIF2;
                        BasicTooltip_androidKt.n(popupPositionProviderJ2, ComposableLambdaKt.nr(784196780, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$1
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
                                if ((i10 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(784196780, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                                }
                                function3.invoke(tooltipScopeImpl, composer2, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), tooltipState, modifier4, false, false, ComposableLambdaKt.nr(1950723216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1
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
                                if ((i10 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1950723216, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:83)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                final Ref.ObjectRef objectRef2 = objectRef;
                                Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                        n(layoutCoordinates);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LayoutCoordinates layoutCoordinates) {
                                        ((MutableState) objectRef2.element).setValue(layoutCoordinates);
                                    }
                                });
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
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
                                function22.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, ((i5 << 6) & 7168) | 1794096, 0);
                        composerKN = composerKN;
                        n(!z4, tooltipState, mutableInteractionSource4, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        mutableInteractionSource5 = mutableInteractionSource3;
                        z5 = z4;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        z5 = z3;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$2
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
                                LabelKt.rl(function3, modifier3, mutableInteractionSource5, z5, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                z3 = z2;
                if ((i3 & 16) == 0) {
                }
                if ((i5 & 9363) == 9362) {
                    if (i9 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    composerKN.eF(519104973);
                    if (mutableInteractionSource3 != null) {
                    }
                    composerKN.Xw();
                    PopupPositionProvider popupPositionProviderJ22 = TooltipDefaults.f28770n.J2(0.0f, composerKN, 48, 1);
                    if (z4) {
                    }
                    TooltipState tooltipState2 = tooltipStateN;
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    objectRef2.element = (MutableState) objIF;
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                    }
                    final TooltipScopeImpl tooltipScopeImpl2 = (TooltipScopeImpl) objIF2;
                    BasicTooltip_androidKt.n(popupPositionProviderJ22, ComposableLambdaKt.nr(784196780, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$1
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
                            if ((i10 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(784196780, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                            }
                            function3.invoke(tooltipScopeImpl2, composer2, 6);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), tooltipState2, modifier4, false, false, ComposableLambdaKt.nr(1950723216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1
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
                            if ((i10 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1950723216, i10, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:83)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final Ref.ObjectRef objectRef22 = objectRef2;
                            Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    n(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                public final void n(LayoutCoordinates layoutCoordinates) {
                                    ((MutableState) objectRef22.element).setValue(layoutCoordinates);
                                }
                            });
                            Function2 function22 = function2;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
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
                            function22.invoke(composer2, 0);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, ((i5 << 6) & 7168) | 1794096, 0);
                    composerKN = composerKN;
                    n(!z4, tooltipState2, mutableInteractionSource4, composerKN, 0);
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                    mutableInteractionSource5 = mutableInteractionSource3;
                    z5 = z4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            z3 = z2;
            if ((i3 & 16) == 0) {
            }
            if ((i5 & 9363) == 9362) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        if ((i3 & 16) == 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final boolean z2, final TooltipState tooltipState, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2) {
        int i3;
        boolean z3;
        int i5;
        boolean zE2;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-627258109);
        if ((i2 & 6) == 0) {
            if (composerKN.n(z2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zE2 = composerKN.p5(tooltipState);
            } else {
                zE2 = composerKN.E2(tooltipState);
            }
            if (zE2) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(mutableInteractionSource)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-627258109, i3, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            if (z2) {
                boolean z4 = false;
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerKN.E2(tooltipState))) {
                    z4 = true;
                }
                boolean z5 = z3 | z4;
                Object objIF = composerKN.iF();
                if (z5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                    composerKN.o(objIF);
                }
                EffectsKt.O(mutableInteractionSource, (Function2) objIF, composerKN, (i3 >> 6) & 14);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$HandleInteractions$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    LabelKt.n(z2, tooltipState, mutableInteractionSource, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
