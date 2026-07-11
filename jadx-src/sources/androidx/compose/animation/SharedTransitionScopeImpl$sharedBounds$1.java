package androidx.compose.animation;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "it", "", c.f62177j, "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
final class SharedTransitionScopeImpl$sharedBounds$1 extends Lambda implements Function1<EnterExitState, Boolean> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SharedTransitionScopeImpl$sharedBounds$1 f15325n = new SharedTransitionScopeImpl$sharedBounds$1();

    SharedTransitionScopeImpl$sharedBounds$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.f15177t);
    }
}
