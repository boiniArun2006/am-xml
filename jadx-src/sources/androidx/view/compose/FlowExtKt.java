package androidx.view.compose;

import TFv.Wre;
import TFv.rv6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LTFv/rv6;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/State;", "t", "(LTFv/rv6;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "LTFv/Wre;", "initialValue", "rl", "(LTFv/Wre;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", c.f62177j, "(LTFv/Wre;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n77#2:188\n77#2:189\n1225#3,6:190\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n59#1:188\n135#1:189\n176#1:190,6\n*E\n"})
public final class FlowExtKt {
    public static final State n(Wre wre, Object obj, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            state = Lifecycle.State.J2;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.v()) {
            ComposerKt.p5(1977777920, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {wre, lifecycle, state2, coroutineContext2};
        boolean zE2 = composer.E2(lifecycle) | ((((i2 & 7168) ^ 3072) > 2048 && composer.t(state2.ordinal())) || (i2 & 3072) == 2048) | composer.E2(coroutineContext2) | composer.E2(wre);
        Object objIF = composer.iF();
        if (zE2 || objIF == Composer.INSTANCE.n()) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, wre, null);
            composer.o(flowExtKt$collectAsStateWithLifecycle$1$1);
            objIF = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        State stateTy = SnapshotStateKt.ty(obj, objArr, (Function2) objIF, composer, (i2 >> 3) & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateTy;
    }

    public static final State rl(Wre wre, Object obj, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.ty(LocalLifecycleOwnerKt.t());
        }
        if ((i3 & 4) != 0) {
            state = Lifecycle.State.J2;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1485997211, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        State stateN = n(wre, obj, lifecycleOwner.getLifecycleRegistry(), state2, coroutineContext2, composer, (i2 & 14) | (((i2 >> 3) & 8) << 3) | (i2 & 112) | (i2 & 7168) | (57344 & i2), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }

    public static final State t(rv6 rv6Var, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.ty(LocalLifecycleOwnerKt.t());
        }
        if ((i3 & 2) != 0) {
            state = Lifecycle.State.J2;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.v()) {
            ComposerKt.p5(743249048, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i5 = i2 << 3;
        State stateN = n(rv6Var, rv6Var.getValue(), lifecycleOwner.getLifecycleRegistry(), state2, coroutineContext2, composer, (i2 & 14) | (i5 & 7168) | (i5 & 57344), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }
}
