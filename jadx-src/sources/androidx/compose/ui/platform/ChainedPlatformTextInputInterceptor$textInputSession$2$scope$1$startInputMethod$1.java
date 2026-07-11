package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {230}, m = "startInputMethod", n = {}, s = {})
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f32882O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f32883n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 f32884t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, Continuation continuation) {
        super(continuation);
        this.f32884t = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32883n = obj;
        this.f32882O |= Integer.MIN_VALUE;
        return this.f32884t.n(null, this);
    }
}
