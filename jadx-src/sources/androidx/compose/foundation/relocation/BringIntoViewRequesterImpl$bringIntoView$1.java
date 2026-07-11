package androidx.compose.foundation.relocation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {100}, m = "bringIntoView", n = {"rect", "content$iv", "i$iv", "size$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f19039O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f19040Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ BringIntoViewRequesterImpl f19042o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f19043r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f19044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, Continuation continuation) {
        super(continuation);
        this.f19042o = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19043r = obj;
        this.f19040Z |= Integer.MIN_VALUE;
        return this.f19042o.n(null, this);
    }
}
