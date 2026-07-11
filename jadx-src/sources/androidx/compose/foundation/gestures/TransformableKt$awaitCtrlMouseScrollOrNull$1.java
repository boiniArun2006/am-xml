package androidx.compose.foundation.gestures;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m = "awaitCtrlMouseScrollOrNull", n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, s = {"L$0", "L$1"})
final class TransformableKt$awaitCtrlMouseScrollOrNull$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f17192O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17193n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17194t;

    TransformableKt$awaitCtrlMouseScrollOrNull$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17192O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return TransformableKt.O(null, null, this);
    }
}
