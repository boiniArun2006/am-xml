package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f59828n = null;
    private Boolean rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f59829t = null;
    private Thread.UncaughtExceptionHandler nr = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ThreadFactory f59827O = null;

    class j implements ThreadFactory {
        final /* synthetic */ Boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AtomicLong f59830O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f59831n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f59832o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Integer f59833r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f59834t;

        j(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f59831n = threadFactory;
            this.f59834t = str;
            this.f59830O = atomicLong;
            this.J2 = bool;
            this.f59833r = num;
            this.f59832o = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f59831n.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f59834t;
            if (str != null) {
                AtomicLong atomicLong = this.f59830O;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(Q.nr(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.J2;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f59833r;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f59832o;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public Q J2(String str) {
        nr(str, 0);
        this.f59828n = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nr(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    private static ThreadFactory t(Q q2) {
        String str = q2.f59828n;
        Boolean bool = q2.rl;
        Integer num = q2.f59829t;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = q2.nr;
        ThreadFactory threadFactoryDefaultThreadFactory = q2.f59827O;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new j(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public Q O(boolean z2) {
        this.rl = Boolean.valueOf(z2);
        return this;
    }

    public ThreadFactory rl() {
        return t(this);
    }
}
