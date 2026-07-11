package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {71}, m = "startInputMethod", n = {}, s = {})
final class AndroidPlatformTextInputSession$startInputMethod$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f32821O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f32822n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AndroidPlatformTextInputSession f32823t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, Continuation continuation) {
        super(continuation);
        this.f32823t = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32822n = obj;
        this.f32821O |= Integer.MIN_VALUE;
        return this.f32823t.n(null, this);
    }
}
