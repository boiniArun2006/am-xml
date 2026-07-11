package cIr;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class qz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile long f43604O = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aC f43605n;
    private volatile ScheduledFuture nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f43606t;

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.f43605n.az().addOnFailureListener(this.rl, new OnFailureListener() { // from class: cIr.o
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f43603n.Uo();
            }
        });
    }

    private long nr() {
        if (this.f43604O == -1) {
            return 30L;
        }
        if (this.f43604O * 2 < 960) {
            return this.f43604O * 2;
        }
        return 960L;
    }

    public void t() {
        if (this.nr == null || this.nr.isDone()) {
            return;
        }
        this.nr.cancel(false);
    }

    qz(aC aCVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f43605n = (aC) Preconditions.checkNotNull(aCVar);
        this.rl = executor;
        this.f43606t = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Uo() {
        t();
        this.f43604O = nr();
        this.nr = this.f43606t.schedule(new C(this), this.f43604O, TimeUnit.SECONDS);
    }

    public void J2(long j2) {
        t();
        this.f43604O = -1L;
        this.nr = this.f43606t.schedule(new C(this), Math.max(0L, j2), TimeUnit.MILLISECONDS);
    }
}
