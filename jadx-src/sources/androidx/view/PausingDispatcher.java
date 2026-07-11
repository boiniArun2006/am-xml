package androidx.view;

import GJW.OU;
import GJW.lej;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "LGJW/lej;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "Org", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "n1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/DispatchQueue;", "t", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PausingDispatcher extends lej {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // GJW.lej
    public boolean Org(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (OU.t().p0N().Org(context)) {
            return true;
        }
        return !this.dispatchQueue.rl();
    }

    @Override // GJW.lej
    public void n1(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.dispatchQueue.t(context, block);
    }
}
