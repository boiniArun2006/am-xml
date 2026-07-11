package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {446, 449}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f27859O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f27860Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f27861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f27862o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f27863r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f27864t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, Continuation continuation) {
        super(continuation);
        this.f27862o = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27863r = obj;
        this.f27860Z |= Integer.MIN_VALUE;
        return this.f27862o.nr(null, this);
    }
}
