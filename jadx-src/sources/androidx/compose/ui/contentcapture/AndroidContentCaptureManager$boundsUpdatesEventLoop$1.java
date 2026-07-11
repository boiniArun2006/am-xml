package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", i = {0, 1}, l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release", n = {"this", "this"}, s = {"L$0", "L$0"})
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    final /* synthetic */ AndroidContentCaptureManager J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f31193O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f31194n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f31195r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f31196t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, Continuation continuation) {
        super(continuation);
        this.J2 = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31193O = obj;
        this.f31195r |= Integer.MIN_VALUE;
        return this.J2.O(this);
    }
}
