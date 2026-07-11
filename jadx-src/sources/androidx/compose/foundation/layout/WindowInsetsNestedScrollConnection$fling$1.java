package androidx.compose.foundation.layout;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 327, 352}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f17862O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f17863Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f17865o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f17866r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17867t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.f17865o = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17866r = obj;
        this.f17863Z |= Integer.MIN_VALUE;
        return this.f17865o.gh(0L, 0.0f, false, this);
    }
}
