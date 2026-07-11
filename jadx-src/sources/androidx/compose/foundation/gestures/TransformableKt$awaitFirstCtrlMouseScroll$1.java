package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {299}, m = "awaitFirstCtrlMouseScroll", n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, s = {"L$0", "L$1"})
final class TransformableKt$awaitFirstCtrlMouseScroll$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f17195O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17196n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17197t;

    TransformableKt$awaitFirstCtrlMouseScroll$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17195O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return TransformableKt.J2(null, null, this);
    }
}
