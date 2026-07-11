package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1804o f48091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f48092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f48093c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f48094d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f48096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48097c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f48095a;
            String str2 = ((c) obj).f48095a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        private c(String str, long j2, b bVar) {
            this.f48095a = str;
            this.f48097c = j2;
            this.f48096b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f48096b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f48097c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f48095a;
        }

        public int hashCode() {
            String str = this.f48095a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f48095a + "', countdownStepMillis=" + this.f48097c + '}';
        }
    }

    public void a() {
        if (C1804o.a()) {
            this.f48091a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f48093c.clear();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f48093c);
        if (C1804o.a()) {
            this.f48091a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f48094d.incrementAndGet();
        for (c cVar : hashSet) {
            if (C1804o.a()) {
                this.f48091a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public b1(Handler handler, C1802k c1802k) {
        if (handler != null) {
            if (c1802k != null) {
                this.f48092b = handler;
                this.f48091a = c1802k.O();
                return;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public void c() {
        if (C1804o.a()) {
            this.f48091a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f48094d.incrementAndGet();
        this.f48092b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j2, b bVar) {
        if (j2 > 0) {
            if (this.f48092b != null) {
                if (C1804o.a()) {
                    this.f48091a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f48093c.add(new c(str, j2, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i2) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f48094d.get() == i2) {
                try {
                    bVarA.a();
                    a(cVar, i2);
                    return;
                } catch (Throwable th) {
                    if (C1804o.a()) {
                        this.f48091a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (C1804o.a()) {
                this.f48091a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f48091a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i2) {
        this.f48092b.postDelayed(new Runnable() { // from class: com.applovin.impl.l3D
            @Override // java.lang.Runnable
            public final void run() {
                this.f48868n.b(cVar, i2);
            }
        }, cVar.b());
    }
}
