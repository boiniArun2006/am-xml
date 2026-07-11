package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {49}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {
    final /* synthetic */ AwaitFirstLayoutModifier J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f18386O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18387n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f18388r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18389t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, Continuation continuation) {
        super(continuation);
        this.J2 = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18386O = obj;
        this.f18388r |= Integer.MIN_VALUE;
        return this.J2.rl(this);
    }
}
