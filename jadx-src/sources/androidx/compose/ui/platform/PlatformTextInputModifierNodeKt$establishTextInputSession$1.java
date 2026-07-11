package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {136}, m = "establishTextInputSession", n = {}, s = {})
final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f33018n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f33019t;

    PlatformTextInputModifierNodeKt$establishTextInputSession$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33018n = obj;
        this.f33019t |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.t(null, null, this);
    }
}
