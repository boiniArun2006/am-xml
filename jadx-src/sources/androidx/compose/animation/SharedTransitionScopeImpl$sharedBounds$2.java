package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1221:1\n1247#2,6:1222\n1247#2,6:1228\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n*L\n746#1:1222,6\n751#1:1228,6\n*E\n"})
final class SharedTransitionScopeImpl$sharedBounds$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ SharedTransitionScope.SharedContentState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ExitTransition f15326O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ AnimatedVisibilityScope f15327n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ SharedTransitionScope.ResizeMode f15328r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ EnterTransition f15329t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        Modifier modifierN;
        composer.eF(-419341573);
        if (ComposerKt.v()) {
            ComposerKt.p5(-419341573, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
        }
        Transition transition = this.f15327n.getTransition();
        EnterTransition enterTransition = this.f15329t;
        ExitTransition exitTransition = this.f15326O;
        boolean zE2 = composer.E2(this.J2);
        final SharedTransitionScope.SharedContentState sharedContentState = this.J2;
        Object objIF = composer.iF();
        if (zE2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(sharedContentState.J2());
                }
            };
            composer.o(objIF);
        }
        Modifier modifierUo = EnterExitTransitionKt.Uo(transition, enterTransition, exitTransition, (Function0) objIF, "enter/exit for " + this.J2.getKey(), composer, 0, 0);
        if (this.f15328r instanceof ScaleToBoundsImpl) {
            composer.eF(-805568624);
            Modifier.Companion companion = Modifier.INSTANCE;
            ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) this.f15328r;
            boolean zE22 = composer.E2(this.J2);
            final SharedTransitionScope.SharedContentState sharedContentState2 = this.J2;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.valueOf(sharedContentState2.J2());
                    }
                };
                composer.o(objIF2);
            }
            modifierN = SkipToLookaheadNodeKt.n(companion, scaleToBoundsImpl, (Function0) objIF2);
            composer.Xw();
        } else {
            composer.eF(-804951414);
            composer.Xw();
            modifierN = Modifier.INSTANCE;
        }
        Modifier modifierZmq = modifierUo.Zmq(modifierN);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierZmq;
    }
}
