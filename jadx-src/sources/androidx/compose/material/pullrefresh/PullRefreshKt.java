package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object rl(PullRefreshState pullRefreshState, float f3, Continuation continuation) {
        return Boxing.boxFloat(pullRefreshState.r(f3));
    }
}
