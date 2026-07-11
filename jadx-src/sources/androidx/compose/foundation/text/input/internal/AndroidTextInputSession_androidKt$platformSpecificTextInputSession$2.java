package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {84}, m = "platformSpecificTextInputSession", n = {}, s = {})
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f20030n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f20031t;

    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20030n = obj;
        this.f20031t |= Integer.MIN_VALUE;
        return AndroidTextInputSession_androidKt.O(null, null, null, null, null, null, null, null, null, null, this);
    }
}
