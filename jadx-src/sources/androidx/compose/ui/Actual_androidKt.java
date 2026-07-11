package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "rl", "()J", "delayMillis", "Lkotlin/Function0;", "", "block", "", "t", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "token", "O", "(Ljava/lang/Object;)V", "Landroid/os/Handler;", c.f62177j, "Landroid/os/Handler;", "handler", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Actual_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Handler f31035n = new Handler(Looper.getMainLooper());

    public static final void O(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f31035n.removeCallbacks((Runnable) obj);
    }

    public static final Object t(long j2, final Function0 function0) {
        Runnable runnable = new Runnable() { // from class: androidx.compose.ui.j
            @Override // java.lang.Runnable
            public final void run() {
                Actual_androidKt.nr(function0);
            }
        };
        f31035n.postDelayed(runnable, j2);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(Function0 function0) {
        function0.invoke();
    }

    public static final long rl() {
        return System.currentTimeMillis();
    }
}
