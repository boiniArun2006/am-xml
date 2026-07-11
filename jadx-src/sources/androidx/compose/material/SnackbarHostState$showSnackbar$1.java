package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {368, 371}, m = "showSnackbar", n = {"this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f23041O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f23042S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f23043Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f23044g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f23045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f23046o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f23047r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f23048t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, Continuation continuation) {
        super(continuation);
        this.f23042S = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23043Z = obj;
        this.f23044g |= Integer.MIN_VALUE;
        return this.f23042S.nr(null, null, null, this);
    }
}
