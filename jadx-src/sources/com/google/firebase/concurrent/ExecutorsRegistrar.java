package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import uOq.C2403c;
import uOq.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final C2403c f60245n = new C2403c(new oSp.n() { // from class: JWp.n
        @Override // oSp.n
        public final Object get() {
            return ExecutorsRegistrar.az(Executors.newFixedThreadPool(4, ExecutorsRegistrar.gh("Firebase Background", 10, ExecutorsRegistrar.xMQ())));
        }
    });
    static final C2403c rl = new C2403c(new oSp.n() { // from class: JWp.w6
        @Override // oSp.n
        public final Object get() {
            return ExecutorsRegistrar.az(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.gh("Firebase Lite", 0, ExecutorsRegistrar.qie())));
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final C2403c f60246t = new C2403c(new oSp.n() { // from class: JWp.Ml
        @Override // oSp.n
        public final Object get() {
            return ExecutorsRegistrar.az(Executors.newCachedThreadPool(ExecutorsRegistrar.mUb("Firebase Blocking", 11)));
        }
    });
    static final C2403c nr = new C2403c(new oSp.n() { // from class: JWp.I28
        @Override // oSp.n
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.mUb("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService O(uOq.Ml ml) {
        return (ScheduledExecutorService) f60246t.get();
    }

    public static /* synthetic */ ScheduledExecutorService Uo(uOq.Ml ml) {
        return (ScheduledExecutorService) f60245n.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService az(ExecutorService executorService) {
        return new Xo(executorService, (ScheduledExecutorService) nr.get());
    }

    private static ThreadFactory gh(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return new n(str, i2, threadPolicy);
    }

    private static ThreadFactory mUb(String str, int i2) {
        return new n(str, i2, null);
    }

    public static /* synthetic */ ScheduledExecutorService n(uOq.Ml ml) {
        return (ScheduledExecutorService) rl.get();
    }

    private static StrictMode.ThreadPolicy qie() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static StrictMode.ThreadPolicy xMQ() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i2 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i2 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(uOq.w6.J2(g9s.n(F2O.j.class, ScheduledExecutorService.class), g9s.n(F2O.j.class, ExecutorService.class), g9s.n(F2O.j.class, Executor.class)).J2(new uOq.CN3() { // from class: JWp.Wre
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return ExecutorsRegistrar.Uo(ml);
            }
        }).nr(), uOq.w6.J2(g9s.n(F2O.n.class, ScheduledExecutorService.class), g9s.n(F2O.n.class, ExecutorService.class), g9s.n(F2O.n.class, Executor.class)).J2(new uOq.CN3() { // from class: JWp.CN3
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return ExecutorsRegistrar.O(ml);
            }
        }).nr(), uOq.w6.J2(g9s.n(F2O.w6.class, ScheduledExecutorService.class), g9s.n(F2O.w6.class, ExecutorService.class), g9s.n(F2O.w6.class, Executor.class)).J2(new uOq.CN3() { // from class: JWp.fuX
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return ExecutorsRegistrar.n(ml);
            }
        }).nr(), uOq.w6.O(g9s.n(F2O.Ml.class, Executor.class)).J2(new uOq.CN3() { // from class: JWp.Dsr
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return Pl.INSTANCE;
            }
        }).nr());
    }
}
