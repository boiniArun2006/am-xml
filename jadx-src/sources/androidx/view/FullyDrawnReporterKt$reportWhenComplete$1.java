package androidx.view;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {173}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f13209O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f13210n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f13211t;

    FullyDrawnReporterKt$reportWhenComplete$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13211t = obj;
        this.f13209O |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.n(null, null, this);
    }
}
