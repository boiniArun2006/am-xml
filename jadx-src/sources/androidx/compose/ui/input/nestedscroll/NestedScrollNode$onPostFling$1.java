package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {103, 113}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f32036O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f32037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f32038o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ NestedScrollNode f32039r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f32040t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, Continuation continuation) {
        super(continuation);
        this.f32039r = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f32038o |= Integer.MIN_VALUE;
        return this.f32039r.z(0L, 0L, this);
    }
}
