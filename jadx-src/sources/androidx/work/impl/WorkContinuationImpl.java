package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class WorkContinuationImpl extends WorkContinuation {
    private static final String mUb = Logger.J2("WorkContinuationImpl");
    private final List J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f42785O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkManagerImpl f42786n;
    private final List nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ExistingWorkPolicy f42787t;
    private Operation xMQ;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, List list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    public void gh() {
        this.KN = true;
    }

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, List list, List list2) {
        this.f42786n = workManagerImpl;
        this.rl = str;
        this.f42787t = existingWorkPolicy;
        this.nr = list;
        this.Uo = list2;
        this.f42785O = new ArrayList(list.size());
        this.J2 = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.J2.addAll(((WorkContinuationImpl) it.next()).J2);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strN = ((WorkRequest) list.get(i2)).n();
            this.f42785O.add(strN);
            this.J2.add(strN);
        }
    }

    public static Set qie(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List listO = workContinuationImpl.O();
        if (listO != null && !listO.isEmpty()) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((WorkContinuationImpl) it.next()).t());
            }
        }
        return hashSet;
    }

    public List J2() {
        return this.nr;
    }

    public boolean KN() {
        return xMQ(this, new HashSet());
    }

    public List O() {
        return this.Uo;
    }

    public WorkManagerImpl Uo() {
        return this.f42786n;
    }

    public boolean mUb() {
        return this.KN;
    }

    public Operation n() {
        if (this.KN) {
            Logger.t().KN(mUb, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f42785O)), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(this);
            this.f42786n.ck().rl(enqueueRunnable);
            this.xMQ = enqueueRunnable.nr();
        }
        return this.xMQ;
    }

    public String nr() {
        return this.rl;
    }

    public ExistingWorkPolicy rl() {
        return this.f42787t;
    }

    public List t() {
        return this.f42785O;
    }

    private static boolean xMQ(WorkContinuationImpl workContinuationImpl, Set set) {
        set.addAll(workContinuationImpl.t());
        Set setQie = qie(workContinuationImpl);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setQie.contains((String) it.next())) {
                return true;
            }
        }
        List listO = workContinuationImpl.O();
        if (listO != null && !listO.isEmpty()) {
            Iterator it2 = listO.iterator();
            while (it2.hasNext()) {
                if (xMQ((WorkContinuationImpl) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.t());
        return false;
    }
}
