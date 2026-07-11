package HI0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f3876n = LazyKt.lazy(new Function0() { // from class: HI0.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qz.J2();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Executor executor, AsyncTaskC1374z asyncTaskC1374z) {
        if (executor != null) {
            asyncTaskC1374z.executeOnExecutor(executor, new Void[0]);
        } else {
            asyncTaskC1374z.execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler J2() {
        return new Handler(Looper.getMainLooper());
    }

    private static final Handler Uo() {
        return (Handler) f3876n.getValue();
    }

    public static /* synthetic */ AsyncTaskC1374z nr(Executor executor, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            executor = null;
        }
        return t(executor, function0);
    }

    public static final AsyncTaskC1374z t(final Executor executor, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        final AsyncTaskC1374z asyncTaskC1374z = new AsyncTaskC1374z(action);
        Uo().post(new Runnable() { // from class: HI0.C
            @Override // java.lang.Runnable
            public final void run() {
                qz.O(executor, asyncTaskC1374z);
            }
        });
        return asyncTaskC1374z;
    }
}
