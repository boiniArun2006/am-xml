package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {739}, m = "textInputSession", n = {}, s = {})
final class AndroidComposeView$textInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f32736O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f32737n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f32738t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, Continuation continuation) {
        super(continuation);
        this.f32738t = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32737n = obj;
        this.f32736O |= Integer.MIN_VALUE;
        return this.f32738t.ViF(null, this);
    }
}
