package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "rl", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,139:1\n1925#2:140\n1923#2:141\n1832#2,7:142\n1247#3,6:149\n70#4:155\n67#4,9:156\n77#4:195\n79#5,6:165\n86#5,3:180\n89#5,2:189\n93#5:194\n347#6,9:171\n356#6,3:191\n4206#7,6:183\n85#8:196\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n127#1:140\n127#1:141\n127#1:142,7\n130#1:149,6\n130#1:155\n130#1:156,9\n130#1:195\n130#1:165,6\n130#1:180,3\n130#1:189,2\n130#1:194\n130#1:171,9\n130#1:191,3\n130#1:183,6\n127#1:196\n*E\n"})
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Object f15163O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Transition f15164n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ FiniteAnimationSpec f15165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$5$1(Transition transition, FiniteAnimationSpec finiteAnimationSpec, Object obj, Function3 function3) {
        super(2);
        this.f15164n = transition;
        this.f15165t = finiteAnimationSpec;
        this.f15163O = obj;
        this.J2 = function3;
    }

    public final void rl(Composer composer, int i2) {
        if (!composer.HI((i2 & 3) != 2, 1 & i2)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1426421288, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
        }
        Transition transition = this.f15164n;
        final FiniteAnimationSpec finiteAnimationSpec = this.f15165t;
        Function3<Transition.Segment<Object>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<Object>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Object> segment, Composer composer2, Integer num) {
                return n(segment, composer2, num.intValue());
            }

            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i3) {
                composer2.eF(438406499);
                if (ComposerKt.v()) {
                    ComposerKt.p5(438406499, i3, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer2.Xw();
                return finiteAnimationSpec2;
            }
        };
        Object obj = this.f15163O;
        TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE);
        Object objXMQ = transition.xMQ();
        composer.eF(-438678252);
        if (ComposerKt.v()) {
            ComposerKt.p5(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f3 = Intrinsics.areEqual(objXMQ, obj) ? 1.0f : 0.0f;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        Float fValueOf = Float.valueOf(f3);
        Object objIk = transition.Ik();
        composer.eF(-438678252);
        if (ComposerKt.v()) {
            ComposerKt.p5(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f4 = Intrinsics.areEqual(objIk, obj) ? 1.0f : 0.0f;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        final State stateJ2 = androidx.compose.animation.core.TransitionKt.J2(transition, fValueOf, Float.valueOf(f4), function3.invoke(transition.HI(), composer, 0), twoWayConverterXMQ, "FloatAnimation", composer, 0);
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean zP5 = composer.p5(stateJ2);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    n(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                public final void n(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.rl(CrossfadeKt$Crossfade$5$1.t(stateJ2));
                }
            };
            composer.o(objIF);
        }
        Modifier modifierN = GraphicsLayerModifierKt.n(companion, (Function1) objIF);
        Function3 function32 = this.J2;
        Object obj2 = this.f15163O;
        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
        int iN = ComposablesKt.n(composer, 0);
        CompositionLocalMap compositionLocalMapIk = composer.Ik();
        Modifier modifierO = ComposedModifierKt.O(composer, modifierN);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0 function0N = companion2.n();
        if (composer.getApplier() == null) {
            ComposablesKt.t();
        }
        composer.T();
        if (composer.getInserting()) {
            composer.s7N(function0N);
        } else {
            composer.r();
        }
        Composer composerN = Updater.n(composer);
        Updater.O(composerN, measurePolicyUo, companion2.t());
        Updater.O(composerN, compositionLocalMapIk, companion2.O());
        Function2 function2Rl = companion2.rl();
        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
            composerN.o(Integer.valueOf(iN));
            composerN.az(Integer.valueOf(iN), function2Rl);
        }
        Updater.O(composerN, modifierO, companion2.nr());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
        function32.invoke(obj2, composer, 0);
        composer.XQ();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        rl(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
