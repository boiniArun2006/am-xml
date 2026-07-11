package SF;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f8941n = new j();
    private static final AtomicBoolean nr;
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f8942t;

    /* JADX INFO: renamed from: SF.j$j, reason: collision with other inner class name */
    static final class C0306j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0306j f8943n = new C0306j();

        C0306j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        String string = j.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "GpsTopicsManager::class.java.toString()");
        rl = string;
        f8942t = LazyKt.lazy(C0306j.f8943n);
        nr = new AtomicBoolean(false);
    }

    public static final void n() {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            nr.set(true);
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    private j() {
    }
}
