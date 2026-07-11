package xgd;

import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final j n() {
        HandlerThread handlerThread = new HandlerThread("BitmapReaderThread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "HandlerThread(\"BitmapRea….apply { start() }.looper");
        return new wIt.j(looper);
    }
}
