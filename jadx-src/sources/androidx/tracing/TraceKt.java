package androidx.tracing;

import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001e\b\u0004\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086Hø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", JavetError.PARAMETER_METHOD_NAME, "", "cookie", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", c.f62177j, "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracing-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TraceKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(String str, int i2, Function1 function1, Continuation continuation) {
        TraceKt$traceAsync$1 traceKt$traceAsync$1;
        if (continuation instanceof TraceKt$traceAsync$1) {
            traceKt$traceAsync$1 = (TraceKt$traceAsync$1) continuation;
            int i3 = traceKt$traceAsync$1.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                traceKt$traceAsync$1.J2 = i3 - Integer.MIN_VALUE;
            } else {
                traceKt$traceAsync$1 = new TraceKt$traceAsync$1(continuation);
            }
        }
        Object objInvoke = traceKt$traceAsync$1.f42130O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = traceKt$traceAsync$1.J2;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Trace.n(str, i2);
                traceKt$traceAsync$1.f42131n = str;
                traceKt$traceAsync$1.f42132t = i2;
                traceKt$traceAsync$1.J2 = 1;
                objInvoke = function1.invoke(traceKt$traceAsync$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = traceKt$traceAsync$1.f42132t;
                str = (String) traceKt$traceAsync$1.f42131n;
                ResultKt.throwOnFailure(objInvoke);
            }
            return objInvoke;
        } finally {
            InlineMarker.finallyStart(1);
            Trace.nr(str, i2);
            InlineMarker.finallyEnd(1);
        }
    }
}
