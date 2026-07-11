package dzu;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Collection f63558n = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(GJW.iwV.class, GJW.iwV.class.getClassLoader()).iterator()));

    public static final Collection n() {
        return f63558n;
    }

    public static final void rl(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
