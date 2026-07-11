package YF;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Wre {
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f12036n;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object objM313constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(new Ml(n(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        f12036n = (I28) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
    }

    public static final Handler n(Looper looper, boolean z2) throws IllegalAccessException, InvocationTargetException {
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final I28 rl(Handler handler, String str) {
        return new Ml(handler, str);
    }

    public static /* synthetic */ I28 t(Handler handler, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return rl(handler, str);
    }
}
