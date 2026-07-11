package androidx.compose.foundation.text.input.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyCommand;", "", "handler", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", "nr", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "t", "(Lkotlin/jvm/functions/Function1;)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ClipboardKeyCommandsHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 handler;

    public static Function1 n(Function1 function1) {
        return function1;
    }

    public static String nr(Function1 function1) {
        return "ClipboardKeyCommandsHandler(handler=" + function1 + ')';
    }

    public static boolean rl(Function1 function1, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && Intrinsics.areEqual(function1, ((ClipboardKeyCommandsHandler) obj).getHandler());
    }

    public static int t(Function1 function1) {
        return function1.hashCode();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final /* synthetic */ Function1 getHandler() {
        return this.handler;
    }

    public boolean equals(Object obj) {
        return rl(this.handler, obj);
    }

    public int hashCode() {
        return t(this.handler);
    }

    public String toString() {
        return nr(this.handler);
    }
}
