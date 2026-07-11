package androidx.compose.runtime;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ProduceStateScopeImpl f30263O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30264n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f30265t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl produceStateScopeImpl, Continuation continuation) {
        super(continuation);
        this.f30263O = produceStateScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30265t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f30263O.HI(null, this);
    }
}
