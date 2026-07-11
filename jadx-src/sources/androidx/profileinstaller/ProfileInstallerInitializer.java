package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    public static class Result {
    }

    @RequiresApi
    private static class Handler28Impl {
        public static Handler n(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Uo(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.I28
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstaller.KN(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J2(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? Handler28Impl.n(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.Ml
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.Uo(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // androidx.startup.Initializer
    public List n() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.Initializer
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Result create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.w6
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                this.f40955n.J2(applicationContext);
            }
        });
        return new Result();
    }
}
