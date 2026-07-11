package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {96, 97}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    final /* synthetic */ NestedScrollNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f32041O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f32042n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f32043r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f32044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation continuation) {
        super(continuation);
        this.J2 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32041O = obj;
        this.f32043r |= Integer.MIN_VALUE;
        return this.J2.lS(0L, this);
    }
}
