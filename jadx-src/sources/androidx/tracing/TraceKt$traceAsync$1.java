package androidx.tracing;

import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.tracing.TraceKt", f = "Trace.kt", i = {0, 0}, l = {76}, m = "traceAsync", n = {JavetError.PARAMETER_METHOD_NAME, "cookie"}, s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trace.kt\nandroidx/tracing/TraceKt$traceAsync$1\n*L\n1#1,111:1\n*E\n"})
final class TraceKt$traceAsync$1<T> extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f42130O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f42131n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f42132t;

    TraceKt$traceAsync$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f42130O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return TraceKt.n(null, 0, null, this);
    }
}
