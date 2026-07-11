package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1221:1\n1247#2,6:1222\n1247#2,6:1230\n1247#2,6:1239\n1247#2,6:1246\n1761#3,2:1228\n1763#3,3:1236\n1#4:1245\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n*L\n919#1:1222,6\n925#1:1230,6\n932#1:1239,6\n956#1:1246,6\n925#1:1228,2\n925#1:1236,3\n*E\n"})
final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ BoundsTransform E2;
    final /* synthetic */ SharedTransitionScopeImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f15332O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ float f15333S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ SharedTransitionScope.OverlayClip f15334Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f15335g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SharedTransitionScope.SharedContentState f15336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f15337o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ SharedTransitionScope.PlaceHolderSize f15338r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Transition f15339t;

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        Transition transitionKN;
        Composer composer2 = composer;
        composer.eF(-1843478929);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1843478929, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
        }
        Object key = this.f15336n.getKey();
        composer.X(-359689844, key);
        SharedTransitionScopeImpl sharedTransitionScopeImpl = this.J2;
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = sharedTransitionScopeImpl.nY(key);
            composer.o(objIF);
        }
        SharedElement sharedElement = (SharedElement) objIF;
        composer.X(-359686031, this.f15339t);
        boolean z2 = false;
        if (this.f15339t != null) {
            composer.eF(1734686048);
            Transition transition = this.f15339t;
            String string = key.toString();
            Function1 function1 = this.f15332O;
            boolean zP5 = composer.p5(transition);
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == companion.n()) {
                objIF2 = transition.xMQ();
                composer.o(objIF2);
            }
            if (transition.WPU()) {
                objIF2 = transition.xMQ();
            }
            composer.eF(1329676753);
            if (ComposerKt.v()) {
                ComposerKt.p5(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
            }
            Boolean bool = (Boolean) function1.invoke(objIF2);
            bool.booleanValue();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            Object objIk = transition.Ik();
            composer.eF(1329676753);
            if (ComposerKt.v()) {
                ComposerKt.p5(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
            }
            Boolean bool2 = (Boolean) function1.invoke(objIk);
            bool2.booleanValue();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            transitionKN = androidx.compose.animation.core.TransitionKt.nr(transition, bool, bool2, string, composer2, 0);
            composer2 = composer2;
            composer.Xw();
        } else {
            composer.eF(1734936683);
            Function1 function12 = this.f15332O;
            Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
            Boolean bool3 = (Boolean) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1)).invoke(Unit.INSTANCE);
            boolean zBooleanValue = bool3.booleanValue();
            Object objIF3 = composer.iF();
            if (objIF3 == companion.n()) {
                if (sharedElement.t() == null) {
                    z2 = zBooleanValue;
                } else if (!zBooleanValue) {
                    z2 = true;
                }
                objIF3 = new MutableTransitionState(Boolean.valueOf(z2));
                composer.o(objIF3);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) objIF3;
            mutableTransitionState.KN(bool3);
            transitionKN = androidx.compose.animation.core.TransitionKt.KN(mutableTransitionState, null, composer, MutableTransitionState.nr, 2);
            composer.Xw();
        }
        composer.X(-359623378, Boolean.valueOf(this.J2.J2()));
        Transition.DeferredAnimation deferredAnimationO = androidx.compose.animation.core.TransitionKt.O(transitionKN, VectorConvertersKt.t(Rect.INSTANCE), null, composer2, 0, 2);
        composer.P5();
        boolean zP52 = composer.p5(transitionKN);
        SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this.J2;
        BoundsTransform boundsTransform = this.E2;
        Object objIF4 = composer.iF();
        if (zP52 || objIF4 == companion.n()) {
            objIF4 = new BoundsAnimation(sharedTransitionScopeImpl2, transitionKN, deferredAnimationO, boundsTransform);
            composer.o(objIF4);
        }
        BoundsAnimation boundsAnimation = (BoundsAnimation) objIF4;
        boundsAnimation.az(deferredAnimationO, this.E2);
        composer.P5();
        SharedElementInternalState sharedElementInternalStateS = this.J2.S(sharedElement, boundsAnimation, this.f15338r, this.f15337o, this.f15336n, this.f15334Z, this.f15333S, this.f15335g, composer, 0);
        composer.P5();
        Modifier modifierZmq = modifier.Zmq(new SharedBoundsNodeElement(sharedElementInternalStateS));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierZmq;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }
}
