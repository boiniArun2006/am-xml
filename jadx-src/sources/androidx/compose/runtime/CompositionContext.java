package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H ¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H ¢\u0006\u0004\b&\u0010%J+\u0010+\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030)H ¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\"H\u0010¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b/\u0010\u0011R\u0014\u00103\u001a\u0002008 X \u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002048 X \u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u0002048 X \u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0016\u0010?\u001a\u0004\u0018\u00010<8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010B¨\u0006F"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "r", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "az", "(Landroidx/compose/runtime/ControlledComposition;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "ck", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/Composer;", "composer", "Ik", "(Landroidx/compose/runtime/Composer;)V", "XQ", "S", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Uo", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Z", "t", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "qie", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "rl", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "ty", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "HI", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "o", "", "KN", "()I", "compoundHashKey", "", "O", "()Z", "collectingParameterInformation", "J2", "collectingSourceInformation", "nr", "collectingCallByInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "mUb", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "xMQ", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "gh", "recomposeCoroutineContext", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CompositionContext {
    public MovableContentState HI(MovableContentStateReference reference) {
        return null;
    }

    public void Ik(Composer composer) {
    }

    public abstract boolean J2();

    public abstract int KN();

    public abstract boolean O();

    public abstract void S(ControlledComposition composition);

    public void XQ(Composer composer) {
    }

    public void Z() {
    }

    public abstract void az(ControlledComposition composition);

    public void ck(Set table) {
    }

    public abstract CoroutineContext gh();

    public CompositionObserverHolder mUb() {
        return null;
    }

    public abstract void n(ControlledComposition composition, Function2 content);

    public abstract boolean nr();

    public abstract void o(ControlledComposition composition);

    public abstract void qie(MovableContentStateReference reference);

    public abstract void r(RecomposeScopeImpl scope);

    public abstract void rl(MovableContentStateReference reference);

    public void t() {
    }

    public abstract void ty(MovableContentStateReference reference, MovableContentState data, Applier applier);

    /* JADX INFO: renamed from: xMQ */
    public abstract CoroutineContext getEffectCoroutineContext();

    public PersistentCompositionLocalMap Uo() {
        return CompositionContextKt.f30110n;
    }
}
