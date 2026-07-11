package androidx.compose.material;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "emit", n = {"this"}, s = {"L$0"})
final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SwipeableState$snapTo$2 f23287O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f23288n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f23289t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.f23287O = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23289t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f23287O.rl(null, this);
    }
}
