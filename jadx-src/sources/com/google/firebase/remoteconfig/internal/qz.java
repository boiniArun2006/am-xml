package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C1916c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class qz {
    private final Wre J2;
    private final C1916c KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Random f60771O;
    private final ConfigFetchHttpClient Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s9b.I28 f60772n;
    private final Clock nr;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f60773t;
    private final Map xMQ;
    public static final long mUb = TimeUnit.HOURS.toSeconds(12);
    static final int[] gh = {2, 4, 8, 16, 32, 64, 128, 256};

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Date f60774n;
        private final String nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final CN3 f60775t;

        public static j n(Date date, CN3 cn3) {
            return new j(date, 1, cn3, null);
        }

        public static j rl(CN3 cn3, String str) {
            return new j(cn3.KN(), 0, cn3, str);
        }

        public static j t(Date date) {
            return new j(date, 2, null, null);
        }

        int J2() {
            return this.rl;
        }

        String O() {
            return this.nr;
        }

        public CN3 nr() {
            return this.f60775t;
        }

        private j(Date date, int i2, CN3 cn3, String str) {
            this.f60774n = date;
            this.rl = i2;
            this.f60775t = cn3;
            this.nr = str;
        }
    }

    public enum n {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f60778n;

        String rl() {
            return this.f60778n;
        }

        n(String str) {
            this.f60778n = str;
        }
    }

    private boolean Z(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    private Date HI(Date date) {
        Date dateN = this.KN.n().n();
        if (date.before(dateN)) {
            return dateN;
        }
        return null;
    }

    private long Ik(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = gh;
        long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f60771O.nextInt((int) millis));
    }

    private boolean J2(long j2, Date date) {
        Date dateJ2 = this.KN.J2();
        if (dateJ2.equals(C1916c.J2)) {
            return false;
        }
        return date.before(new Date(dateJ2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private String KN(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private void WPU(Date date) {
        int iRl = this.KN.n().rl() + 1;
        this.KN.qie(iRl, new Date(date.getTime() + Ik(iRl)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task az(Task task, long j2, final Map map) {
        final qz qzVar;
        Task taskContinueWithTask;
        final Date date = new Date(this.nr.currentTimeMillis());
        if (task.isSuccessful() && J2(j2, date)) {
            return Tasks.forResult(j.t(date));
        }
        Date dateHI = HI(date);
        if (dateHI != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(KN(dateHI.getTime() - date.getTime()), dateHI.getTime()));
            qzVar = this;
        } else {
            final Task id = this.f60772n.getId();
            final Task taskN = this.f60772n.n(false);
            qzVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, taskN}).continueWithTask(this.f60773t, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.Dsr
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return qz.n(this.f60720n, id, taskN, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(qzVar.f60773t, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.aC
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return qz.t(this.f60742n, date, task2);
            }
        });
    }

    private Long ck() {
        SHQ.j jVar = (SHQ.j) this.rl.get();
        if (jVar == null) {
            return null;
        }
        return (Long) jVar.t(true).get("_fot");
    }

    private j gh(String str, String str2, Date date, Map map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                j jVarFetch = this.Uo.fetch(this.Uo.nr(), str, str2, o(), this.KN.O(), map, ck(), date2, this.KN.rl());
                if (jVarFetch.nr() != null) {
                    this.KN.ty(jVarFetch.nr().gh());
                }
                if (jVarFetch.O() != null) {
                    this.KN.az(jVarFetch.O());
                }
                this.KN.mUb();
                return jVarFetch;
            } catch (FirebaseRemoteConfigServerException e2) {
                e = e2;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                C1916c.j jVarS = S(firebaseRemoteConfigServerException.n(), date2);
                if (XQ(jVarS, firebaseRemoteConfigServerException.n())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(jVarS.n().getTime());
                }
                throw Uo(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e3) {
            e = e3;
            date2 = date;
        }
    }

    private Map o() {
        HashMap map = new HashMap();
        SHQ.j jVar = (SHQ.j) this.rl.get();
        if (jVar != null) {
            for (Map.Entry entry : jVar.t(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    public Task mUb(final long j2) {
        final HashMap map = new HashMap(this.xMQ);
        map.put("X-Firebase-RC-Fetch-Type", n.BASE.rl() + "/1");
        return this.J2.O().continueWithTask(this.f60773t, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.fuX
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f60751n.az(task, j2, map);
            }
        });
    }

    public long r() {
        return this.KN.Uo();
    }

    public Task ty(n nVar, int i2) {
        final HashMap map = new HashMap(this.xMQ);
        map.put("X-Firebase-RC-Fetch-Type", nVar.rl() + "/" + i2);
        return this.J2.O().continueWithTask(this.f60773t, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.C
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f60709n.az(task, 0L, map);
            }
        });
    }

    public Task xMQ() {
        return mUb(this.KN.KN());
    }

    public qz(s9b.I28 i28, oSp.n nVar, Executor executor, Clock clock, Random random, Wre wre, ConfigFetchHttpClient configFetchHttpClient, C1916c c1916c, Map map) {
        this.f60772n = i28;
        this.rl = nVar;
        this.f60773t = executor;
        this.nr = clock;
        this.f60771O = random;
        this.J2 = wre;
        this.Uo = configFetchHttpClient;
        this.KN = c1916c;
        this.xMQ = map;
    }

    private C1916c.j S(int i2, Date date) {
        if (Z(i2)) {
            WPU(date);
        }
        return this.KN.n();
    }

    private FirebaseRemoteConfigServerException Uo(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iN = firebaseRemoteConfigServerException.n();
        if (iN != 401) {
            if (iN != 403) {
                if (iN != 429) {
                    if (iN != 500) {
                        switch (iN) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.n(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private boolean XQ(C1916c.j jVar, int i2) {
        if (jVar.rl() > 1 || i2 == 429) {
            return true;
        }
        return false;
    }

    private void aYN(Task task, Date date) {
        if (task.isSuccessful()) {
            this.KN.Ik(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.KN.r();
        } else {
            this.KN.ck();
        }
    }

    public static /* synthetic */ Task n(qz qzVar, Task task, Task task2, Date date, Map map, Task task3) {
        qzVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return qzVar.qie((String) task.getResult(), ((com.google.firebase.installations.Wre) task2.getResult()).rl(), date, map);
    }

    private Task qie(String str, String str2, Date date, Map map) {
        try {
            final j jVarGh = gh(str, str2, date, map);
            if (jVarGh.J2() != 0) {
                return Tasks.forResult(jVarGh);
            }
            return this.J2.xMQ(jVarGh.nr()).onSuccessTask(this.f60773t, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.o
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(jVarGh);
                }
            });
        } catch (FirebaseRemoteConfigException e2) {
            return Tasks.forException(e2);
        }
    }

    public static /* synthetic */ Task t(qz qzVar, Date date, Task task) {
        qzVar.aYN(task, date);
        return task;
    }
}
