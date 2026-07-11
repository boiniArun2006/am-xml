package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {747}, m = "collectImeNotifications", n = {"this", "transformedNotifyImeListener"}, s = {"L$0", "L$1"})
final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    final /* synthetic */ TransformedTextFieldState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f20366O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20367n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20368r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20369t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, Continuation continuation) {
        super(continuation);
        this.J2 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20366O = obj;
        this.f20368r |= Integer.MIN_VALUE;
        return this.J2.xMQ(null, this);
    }
}
