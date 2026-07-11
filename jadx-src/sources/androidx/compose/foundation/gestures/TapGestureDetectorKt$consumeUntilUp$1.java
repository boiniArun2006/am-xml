package androidx.compose.foundation.gestures;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f17101O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17102n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f17103t;

    TapGestureDetectorKt$consumeUntilUp$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17103t = obj;
        this.f17101O |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.mUb(null, this);
    }
}
