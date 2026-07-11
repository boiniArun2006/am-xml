package androidx.compose.material3;

import GJW.vd;
import YgZ.uQga.IYJfqUyym;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0093\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aD\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aD\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010!\u001a5\u0010#\u001a\u00020\u00042\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020%H\u0003¢\u0006\u0004\b(\u0010)\u001a)\u0010+\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "icon", "label", "rl", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "selected", "onClick", "t", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "space", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "", "KN", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionCount", "xMQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "F", "IconSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,774:1\n1223#2,6:775\n1223#2,6:781\n1223#2,6:820\n1223#2,6:863\n1223#2,6:912\n1223#2,6:918\n62#3:787\n62#3:830\n98#4,3:788\n101#4:819\n105#4:829\n98#4,3:831\n101#4:862\n105#4:872\n78#5,6:791\n85#5,4:806\n89#5,2:816\n93#5:828\n78#5,6:834\n85#5,4:849\n89#5,2:859\n93#5:871\n78#5,6:879\n85#5,4:894\n89#5,2:904\n93#5:910\n368#6,9:797\n377#6:818\n378#6,2:826\n368#6,9:840\n377#6:861\n378#6,2:869\n368#6,9:885\n377#6:906\n378#6,2:908\n4032#7,6:810\n4032#7,6:853\n4032#7,6:898\n71#8:873\n69#8,5:874\n74#8:907\n78#8:911\n148#9:924\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n142#1:775,6\n220#1:781,6\n279#1:820,6\n316#1:863,6\n398#1:912,6\n399#1:918,6\n276#1:787\n313#1:830\n270#1:788,3\n270#1:819\n270#1:829\n308#1:831,3\n308#1:862\n308#1:872\n270#1:791,6\n270#1:806,4\n270#1:816,2\n270#1:828\n308#1:834,6\n308#1:849,4\n308#1:859,2\n308#1:871\n326#1:879,6\n326#1:894,4\n326#1:904,2\n326#1:910\n270#1:797,9\n270#1:818\n270#1:826,2\n308#1:840,9\n308#1:861\n308#1:869,2\n326#1:885,9\n326#1:906\n326#1:908,2\n270#1:810,6\n308#1:853,6\n326#1:898,6\n326#1:873\n326#1:874,5\n326#1:907\n326#1:911\n767#1:924\n*E\n"})
public final class SegmentedButtonKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27445n = Dp.KN(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1464121570);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1464121570, i3, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:324)");
            }
            Alignment alignmentO = Alignment.INSTANCE.O();
            Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, ButtonDefaults.f24588n.XQ());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            TextKt.n(TypographyKt.t(OutlinedSegmentedButtonTokens.f29772n.J2(), composerKN, 6), ComposableLambdaKt.nr(1420592651, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1420592651, i5, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:331)");
                    }
                    Object objIF = composer2.iF();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objIF == companion2.n()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.o(compositionScopedCoroutineScopeCanceller);
                        objIF = compositionScopedCoroutineScopeCanceller;
                    }
                    vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                    Object objIF2 = composer2.iF();
                    if (objIF2 == companion2.n()) {
                        objIF2 = new SegmentedButtonContentMeasurePolicy(coroutineScope);
                        composer2.o(objIF2);
                    }
                    SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) objIF2;
                    Modifier modifierN = IntrinsicKt.n(Modifier.INSTANCE, IntrinsicSize.f17696n);
                    Function2 function2Rl2 = LayoutKt.rl(CollectionsKt.listOf((Object[]) new Function2[]{function2, function22}));
                    Object objIF3 = composer2.iF();
                    if (objIF3 == companion2.n()) {
                        objIF3 = MultiContentMeasurePolicyKt.n(segmentedButtonContentMeasurePolicy);
                        composer2.o(objIF3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objIF3;
                    int iN2 = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierN);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion3.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N2);
                    } else {
                        composer2.r();
                    }
                    Composer composerN2 = Updater.n(composer2);
                    Updater.O(composerN2, measurePolicy, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    Function2 function2Rl3 = companion3.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl3);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    function2Rl2.invoke(composer2, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composerKN, 48);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    SegmentedButtonKt.nr(function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z2, final Function1 function1, final Shape shape, Modifier modifier, boolean z3, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, final Function2 function22, Composer composer, final int i2, final int i3, final int i5) {
        MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope2;
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        SegmentedButtonColors segmentedButtonColorsO;
        int i10;
        int i11;
        int i12;
        int i13;
        BorderStroke borderStrokeNr;
        SegmentedButtonColors segmentedButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        final Function2 function2Nr;
        boolean z5;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource4;
        final SegmentedButtonColors segmentedButtonColors3;
        final Function2 function23;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1596038053);
        if ((Integer.MIN_VALUE & i5) != 0) {
            i7 = i2 | 6;
            multiChoiceSegmentedButtonRowScope2 = multiChoiceSegmentedButtonRowScope;
        } else if ((i2 & 6) == 0) {
            multiChoiceSegmentedButtonRowScope2 = multiChoiceSegmentedButtonRowScope;
            i7 = (composerKN.p5(multiChoiceSegmentedButtonRowScope2) ? 4 : 2) | i2;
        } else {
            multiChoiceSegmentedButtonRowScope2 = multiChoiceSegmentedButtonRowScope;
            i7 = i2;
        }
        if ((i5 & 1) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i5 & 2) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.E2(function1) ? 256 : 128;
            }
            if ((i5 & 4) == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.p5(shape) ? 2048 : 1024;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i7 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i7 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z4 = z3;
                            i7 |= composerKN.n(z4) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            segmentedButtonColorsO = segmentedButtonColors;
                            i7 |= ((i5 & 32) == 0 && composerKN.p5(segmentedButtonColorsO)) ? 1048576 : 524288;
                        } else {
                            segmentedButtonColorsO = segmentedButtonColors;
                        }
                        if ((i2 & 12582912) == 0) {
                            i7 |= ((i5 & 64) == 0 && composerKN.p5(borderStroke)) ? 8388608 : 4194304;
                        }
                        i10 = i5 & 128;
                        if (i10 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i11 = i5 & 256;
                        if (i11 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i12 = i11;
                                i7 |= composerKN.E2(function2) ? 536870912 : 268435456;
                            }
                            if ((i5 & 512) == 0) {
                                i13 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i13 = i3 | (composerKN.E2(function22) ? 4 : 2);
                            } else {
                                i13 = i3;
                            }
                            if ((i7 & 306783379) != 306783378 && (i13 & 3) == 2 && composerKN.xMQ()) {
                                composerKN.wTp();
                                borderStroke2 = borderStroke;
                                mutableInteractionSource4 = mutableInteractionSource;
                                function23 = function2;
                                segmentedButtonColors3 = segmentedButtonColorsO;
                                modifier3 = modifier2;
                                z6 = z4;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i9 != 0) {
                                        z4 = true;
                                    }
                                    if ((i5 & 32) != 0) {
                                        segmentedButtonColorsO = SegmentedButtonDefaults.f27433n.O(composerKN, 6);
                                        i7 &= -3670017;
                                    }
                                    if ((i5 & 64) == 0) {
                                        borderStrokeNr = SegmentedButtonDefaults.nr(SegmentedButtonDefaults.f27433n, segmentedButtonColorsO.n(z4, z2), 0.0f, 2, null);
                                        i7 &= -29360129;
                                    } else {
                                        borderStrokeNr = borderStroke;
                                    }
                                    MutableInteractionSource mutableInteractionSource5 = i10 == 0 ? null : mutableInteractionSource;
                                    if (i12 == 0) {
                                        Modifier modifier5 = modifier4;
                                        segmentedButtonColors2 = segmentedButtonColorsO;
                                        mutableInteractionSource2 = mutableInteractionSource5;
                                        function2Nr = ComposableLambdaKt.nr(970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                n(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer2, int i14) {
                                                if ((i14 & 3) == 2 && composer2.xMQ()) {
                                                    composer2.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(970447394, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:137)");
                                                }
                                                SegmentedButtonDefaults.f27433n.rl(z2, null, null, composer2, 3072, 6);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                        z5 = z4;
                                        modifier2 = modifier5;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1596038053, i7, i13, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:139)");
                                        }
                                        composerKN.eF(1788099965);
                                        if (mutableInteractionSource2 != null) {
                                            Object objIF = composerKN.iF();
                                            if (objIF == Composer.INSTANCE.n()) {
                                                objIF = InteractionSourceKt.n();
                                                composerKN.o(objIF);
                                            }
                                            mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                        }
                                        composerKN.Xw();
                                        long jRl = segmentedButtonColors2.rl(z5, z2);
                                        int i14 = i7;
                                        long jT2 = segmentedButtonColors2.t(z5, z2);
                                        boolean z7 = z5;
                                        Modifier modifier6 = modifier2;
                                        Modifier modifierXMQ = xMQ(RowScope.rl(multiChoiceSegmentedButtonRowScope2, modifier6, 1.0f, false, 2, null), z2, KN(mutableInteractionSource3, composerKN, 0));
                                        ButtonDefaults buttonDefaults = ButtonDefaults.f24588n;
                                        Function2 function24 = function2Nr;
                                        SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                                        SurfaceKt.t(z2, function1, SizeKt.n(modifierXMQ, buttonDefaults.r(), buttonDefaults.Ik()), z7, shape, jRl, jT2, 0.0f, 0.0f, borderStrokeNr, mutableInteractionSource3, ComposableLambdaKt.nr(1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$2
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
                                                if ((i15 & 3) == 2 && composer2.xMQ()) {
                                                    composer2.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1635710341, i15, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:164)");
                                                }
                                                SegmentedButtonKt.nr(function2Nr, function22, composer2, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, ((i14 >> 3) & 126) | ((i14 >> 6) & 7168) | (57344 & (i14 << 3)) | (1879048192 & (i14 << 6)), 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        z6 = z7;
                                        borderStroke2 = borderStrokeNr;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        segmentedButtonColors3 = segmentedButtonColors4;
                                        function23 = function24;
                                        modifier3 = modifier6;
                                    } else {
                                        modifier2 = modifier4;
                                        segmentedButtonColors2 = segmentedButtonColorsO;
                                        mutableInteractionSource2 = mutableInteractionSource5;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 32) != 0) {
                                        i7 &= -3670017;
                                    }
                                    if ((i5 & 64) != 0) {
                                        i7 &= -29360129;
                                    }
                                    borderStrokeNr = borderStroke;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    segmentedButtonColors2 = segmentedButtonColorsO;
                                }
                                z5 = z4;
                                function2Nr = function2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                composerKN.eF(1788099965);
                                if (mutableInteractionSource2 != null) {
                                }
                                composerKN.Xw();
                                long jRl2 = segmentedButtonColors2.rl(z5, z2);
                                int i142 = i7;
                                long jT22 = segmentedButtonColors2.t(z5, z2);
                                boolean z72 = z5;
                                Modifier modifier62 = modifier2;
                                Modifier modifierXMQ2 = xMQ(RowScope.rl(multiChoiceSegmentedButtonRowScope2, modifier62, 1.0f, false, 2, null), z2, KN(mutableInteractionSource3, composerKN, 0));
                                ButtonDefaults buttonDefaults2 = ButtonDefaults.f24588n;
                                Function2 function242 = function2Nr;
                                SegmentedButtonColors segmentedButtonColors42 = segmentedButtonColors2;
                                SurfaceKt.t(z2, function1, SizeKt.n(modifierXMQ2, buttonDefaults2.r(), buttonDefaults2.Ik()), z72, shape, jRl2, jT22, 0.0f, 0.0f, borderStrokeNr, mutableInteractionSource3, ComposableLambdaKt.nr(1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$2
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
                                        if ((i15 & 3) == 2 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1635710341, i15, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:164)");
                                        }
                                        SegmentedButtonKt.nr(function2Nr, function22, composer2, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i142 >> 3) & 126) | ((i142 >> 6) & 7168) | (57344 & (i142 << 3)) | (1879048192 & (i142 << 6)), 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                                if (ComposerKt.v()) {
                                }
                                z6 = z72;
                                borderStroke2 = borderStrokeNr;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                segmentedButtonColors3 = segmentedButtonColors42;
                                function23 = function242;
                                modifier3 = modifier62;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$3
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
                                        SegmentedButtonKt.rl(multiChoiceSegmentedButtonRowScope, z2, function1, shape, modifier3, z6, segmentedButtonColors3, borderStroke2, mutableInteractionSource4, function23, function22, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i12 = i11;
                        if ((i5 & 512) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i5 & 32) != 0) {
                                }
                                if ((i5 & 64) == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z4 = z3;
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i5 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i5 & 512) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                modifier2 = modifier;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z4 = z3;
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i5 & 512) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            modifier2 = modifier;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z4 = z3;
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i5 & 512) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z4 = z3;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i5 & 512) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z2, final Function0 function0, final Shape shape, Modifier modifier, boolean z3, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, final Function2 function22, Composer composer, final int i2, final int i3, final int i5) {
        SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope2;
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        SegmentedButtonColors segmentedButtonColorsO;
        int i10;
        int i11;
        int i12;
        int i13;
        BorderStroke borderStrokeNr;
        SegmentedButtonColors segmentedButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        final Function2 function2Nr;
        boolean z5;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource4;
        final SegmentedButtonColors segmentedButtonColors3;
        final Function2 function23;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1016574361);
        if ((Integer.MIN_VALUE & i5) != 0) {
            i7 = i2 | 6;
            singleChoiceSegmentedButtonRowScope2 = singleChoiceSegmentedButtonRowScope;
        } else if ((i2 & 6) == 0) {
            singleChoiceSegmentedButtonRowScope2 = singleChoiceSegmentedButtonRowScope;
            i7 = (composerKN.p5(singleChoiceSegmentedButtonRowScope2) ? 4 : 2) | i2;
        } else {
            singleChoiceSegmentedButtonRowScope2 = singleChoiceSegmentedButtonRowScope;
            i7 = i2;
        }
        if ((i5 & 1) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i5 & 2) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.E2(function0) ? 256 : 128;
            }
            if ((i5 & 4) == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.p5(shape) ? 2048 : 1024;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i7 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i7 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z4 = z3;
                            i7 |= composerKN.n(z4) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            segmentedButtonColorsO = segmentedButtonColors;
                            i7 |= ((i5 & 32) == 0 && composerKN.p5(segmentedButtonColorsO)) ? 1048576 : 524288;
                        } else {
                            segmentedButtonColorsO = segmentedButtonColors;
                        }
                        if ((i2 & 12582912) == 0) {
                            i7 |= ((i5 & 64) == 0 && composerKN.p5(borderStroke)) ? 8388608 : 4194304;
                        }
                        i10 = i5 & 128;
                        if (i10 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i11 = i5 & 256;
                        if (i11 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i12 = i11;
                                i7 |= composerKN.E2(function2) ? 536870912 : 268435456;
                            }
                            if ((i5 & 512) == 0) {
                                i13 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i13 = i3 | (composerKN.E2(function22) ? 4 : 2);
                            } else {
                                i13 = i3;
                            }
                            if ((i7 & 306783379) != 306783378 && (i13 & 3) == 2 && composerKN.xMQ()) {
                                composerKN.wTp();
                                borderStroke2 = borderStroke;
                                mutableInteractionSource4 = mutableInteractionSource;
                                function23 = function2;
                                segmentedButtonColors3 = segmentedButtonColorsO;
                                modifier3 = modifier2;
                                z6 = z4;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i9 != 0) {
                                        z4 = true;
                                    }
                                    if ((i5 & 32) != 0) {
                                        segmentedButtonColorsO = SegmentedButtonDefaults.f27433n.O(composerKN, 6);
                                        i7 &= -3670017;
                                    }
                                    if ((i5 & 64) == 0) {
                                        borderStrokeNr = SegmentedButtonDefaults.nr(SegmentedButtonDefaults.f27433n, segmentedButtonColorsO.n(z4, z2), 0.0f, 2, null);
                                        i7 &= -29360129;
                                    } else {
                                        borderStrokeNr = borderStroke;
                                    }
                                    MutableInteractionSource mutableInteractionSource5 = i10 == 0 ? null : mutableInteractionSource;
                                    if (i12 == 0) {
                                        Modifier modifier5 = modifier4;
                                        segmentedButtonColors2 = segmentedButtonColorsO;
                                        mutableInteractionSource2 = mutableInteractionSource5;
                                        function2Nr = ComposableLambdaKt.nr(1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                n(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer2, int i14) {
                                                if ((i14 & 3) == 2 && composer2.xMQ()) {
                                                    composer2.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1235063168, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:215)");
                                                }
                                                SegmentedButtonDefaults.f27433n.rl(z2, null, null, composer2, 3072, 6);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                        z5 = z4;
                                        modifier2 = modifier5;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1016574361, i7, i13, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:217)");
                                        }
                                        composerKN.eF(1788214045);
                                        if (mutableInteractionSource2 != null) {
                                            Object objIF = composerKN.iF();
                                            if (objIF == Composer.INSTANCE.n()) {
                                                objIF = InteractionSourceKt.n();
                                                composerKN.o(objIF);
                                            }
                                            mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                        }
                                        composerKN.Xw();
                                        long jRl = segmentedButtonColors2.rl(z5, z2);
                                        int i14 = i7;
                                        long jT2 = segmentedButtonColors2.t(z5, z2);
                                        boolean z7 = z5;
                                        Modifier modifier6 = modifier2;
                                        Modifier modifierXMQ = xMQ(RowScope.rl(singleChoiceSegmentedButtonRowScope2, modifier6, 1.0f, false, 2, null), z2, KN(mutableInteractionSource3, composerKN, 0));
                                        ButtonDefaults buttonDefaults = ButtonDefaults.f24588n;
                                        Function2 function24 = function2Nr;
                                        SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                                        SurfaceKt.rl(z2, function0, SemanticsModifierKt.nr(SizeKt.n(modifierXMQ, buttonDefaults.r(), buttonDefaults.Ik()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$5
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.J2());
                                            }
                                        }, 1, null), z7, shape, jRl, jT2, 0.0f, 0.0f, borderStrokeNr, mutableInteractionSource3, ComposableLambdaKt.nr(383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$6
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
                                                if ((i15 & 3) == 2 && composer2.xMQ()) {
                                                    composer2.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(383378045, i15, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:243)");
                                                }
                                                SegmentedButtonKt.nr(function2Nr, function22, composer2, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, ((i14 >> 3) & 126) | ((i14 >> 6) & 7168) | (57344 & (i14 << 3)) | (1879048192 & (i14 << 6)), 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        z6 = z7;
                                        borderStroke2 = borderStrokeNr;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        segmentedButtonColors3 = segmentedButtonColors4;
                                        function23 = function24;
                                        modifier3 = modifier6;
                                    } else {
                                        modifier2 = modifier4;
                                        segmentedButtonColors2 = segmentedButtonColorsO;
                                        mutableInteractionSource2 = mutableInteractionSource5;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 32) != 0) {
                                        i7 &= -3670017;
                                    }
                                    if ((i5 & 64) != 0) {
                                        i7 &= -29360129;
                                    }
                                    borderStrokeNr = borderStroke;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    segmentedButtonColors2 = segmentedButtonColorsO;
                                }
                                z5 = z4;
                                function2Nr = function2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                composerKN.eF(1788214045);
                                if (mutableInteractionSource2 != null) {
                                }
                                composerKN.Xw();
                                long jRl2 = segmentedButtonColors2.rl(z5, z2);
                                int i142 = i7;
                                long jT22 = segmentedButtonColors2.t(z5, z2);
                                boolean z72 = z5;
                                Modifier modifier62 = modifier2;
                                Modifier modifierXMQ2 = xMQ(RowScope.rl(singleChoiceSegmentedButtonRowScope2, modifier62, 1.0f, false, 2, null), z2, KN(mutableInteractionSource3, composerKN, 0));
                                ButtonDefaults buttonDefaults2 = ButtonDefaults.f24588n;
                                Function2 function242 = function2Nr;
                                SegmentedButtonColors segmentedButtonColors42 = segmentedButtonColors2;
                                SurfaceKt.rl(z2, function0, SemanticsModifierKt.nr(SizeKt.n(modifierXMQ2, buttonDefaults2.r(), buttonDefaults2.Ik()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$5
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.J2());
                                    }
                                }, 1, null), z72, shape, jRl2, jT22, 0.0f, 0.0f, borderStrokeNr, mutableInteractionSource3, ComposableLambdaKt.nr(383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$6
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
                                        if ((i15 & 3) == 2 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(383378045, i15, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:243)");
                                        }
                                        SegmentedButtonKt.nr(function2Nr, function22, composer2, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i142 >> 3) & 126) | ((i142 >> 6) & 7168) | (57344 & (i142 << 3)) | (1879048192 & (i142 << 6)), 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                                if (ComposerKt.v()) {
                                }
                                z6 = z72;
                                borderStroke2 = borderStrokeNr;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                segmentedButtonColors3 = segmentedButtonColors42;
                                function23 = function242;
                                modifier3 = modifier62;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$7
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
                                        SegmentedButtonKt.t(singleChoiceSegmentedButtonRowScope, z2, function0, shape, modifier3, z6, segmentedButtonColors3, borderStroke2, mutableInteractionSource4, function23, function22, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i12 = i11;
                        if ((i5 & 512) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i5 & 32) != 0) {
                                }
                                if ((i5 & 64) == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z4 = z3;
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i5 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i5 & 512) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                modifier2 = modifier;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z4 = z3;
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i5 & 512) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            modifier2 = modifier;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z4 = z3;
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i5 & 512) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z4 = z3;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i5 & 512) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Modifier xMQ(Modifier modifier, final boolean z2, final State state) {
        return LayoutModifierKt.n(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionZIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return n(measureScope, measurable, constraints.getValue());
            }

            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                final Placeable placeableDR0 = measurable.dR0(j2);
                int width = placeableDR0.getWidth();
                int height = placeableDR0.getHeight();
                final State state2 = state;
                final boolean z3 = z2;
                return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionZIndex$1.1
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
                        placementScope.KN(placeableDR0, 0, 0, ((Number) state2.getValue()).floatValue() + (z3 ? 5.0f : 0.0f));
                    }
                }, 4, null);
            }
        });
    }

    private static final State KN(InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(281890131, i2, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:396)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        boolean z2 = false;
        if (objIF == companion.n()) {
            objIF = SnapshotIntStateKt.n(0);
            composer.o(objIF);
        }
        MutableIntState mutableIntState = (MutableIntState) objIF;
        int i3 = i2 & 14;
        if (((i3 ^ 6) > 4 && composer.p5(interactionSource)) || (i2 & 6) == 4) {
            z2 = true;
        }
        Object objIF2 = composer.iF();
        if (z2 || objIF2 == companion.n()) {
            objIF2 = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.o(objIF2);
        }
        EffectsKt.O(interactionSource, (Function2) objIF2, composer, i3);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableIntState;
    }

    public static final void O(Modifier modifier, float f3, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(-1520863498);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function3)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i11 != 0) {
                f3 = SegmentedButtonDefaults.f27433n.J2();
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1520863498, i5, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:268)");
            }
            Modifier modifierRl = IntrinsicKt.rl(SizeKt.rl(SelectableGroupKt.n(modifier), 0.0f, OutlinedSegmentedButtonTokens.f29772n.n(), 1, null), IntrinsicSize.f17696n);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(-f3)), Alignment.INSTANCE.xMQ(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerKN.o(objIF);
            }
            function3.invoke((SingleChoiceSegmentedButtonScopeWrapper) objIF, composerKN, Integer.valueOf(((i5 >> 3) & 112) | 6));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    SegmentedButtonKt.O(modifier2, f4, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    public static final void n(Modifier modifier, float f3, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(155922315);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function3)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i11 != 0) {
                f3 = SegmentedButtonDefaults.f27433n.J2();
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(155922315, i5, -1, IYJfqUyym.OBOzcidoW);
            }
            Modifier modifierRl = IntrinsicKt.rl(SizeKt.rl(modifier, 0.0f, OutlinedSegmentedButtonTokens.f29772n.n(), 1, null), IntrinsicSize.f17696n);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(-f3)), Alignment.INSTANCE.xMQ(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerKN.o(objIF);
            }
            function3.invoke((MultiChoiceSegmentedButtonScopeWrapper) objIF, composerKN, Integer.valueOf(((i5 >> 3) & 112) | 6));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    SegmentedButtonKt.n(modifier2, f4, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
