package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.C1914c;
import com.google.firebase.iid.QJ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Deprecated
public class FirebaseInstanceId {
    private static C1914c mUb;
    static ScheduledExecutorService qie;
    private final s9b.I28 J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QJ f60511O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Executor f60512n;
    private final C nr;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pl f60513t;
    private static final long xMQ = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern gh = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(com.google.firebase.Wre wre, Pl pl, Executor executor, Executor executor2, oSp.n nVar, oSp.n nVar2, s9b.I28 i28) {
        this.Uo = false;
        this.KN = new ArrayList();
        if (Pl.t(wre) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (mUb == null) {
                    mUb = new C1914c(wre.qie());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.rl = wre;
        this.f60513t = pl;
        this.nr = new C(wre, pl, nVar, nVar2, i28);
        this.f60512n = executor2;
        this.f60511O = new QJ(executor);
        this.J2 = i28;
    }

    com.google.firebase.Wre J2() {
        return this.rl;
    }

    synchronized void e(long j2) {
        O(new s4(this, Math.min(Math.max(30L, j2 + j2), xMQ)), j2);
        this.Uo = true;
    }

    synchronized void fD() {
        if (this.Uo) {
            return;
        }
        e(0L);
    }

    synchronized void iF(boolean z2) {
        this.Uo = z2;
    }

    synchronized void te() {
        mUb.nr();
    }

    static boolean XQ(String str) {
        return str.contains(":");
    }

    static boolean Z(String str) {
        return gh.matcher(str).matches();
    }

    private String az() {
        return "[DEFAULT]".equals(this.rl.HI()) ? "" : this.rl.Ik();
    }

    private Object n(Task task) throws IOException {
        try {
            return Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    te();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    static boolean r() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    private static Object rl(Task task) throws InterruptedException {
        Preconditions.checkNotNull(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(Ml.f60515n, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.I28

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CountDownLatch f60514n;

            {
                this.f60514n = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                this.f60514n.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return qie(task);
    }

    public String HI(String str, String str2) throws IOException {
        nr(this.rl);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((o) n(gh(str, str2))).n();
        }
        throw new IOException("MAIN_THREAD");
    }

    C1914c.j Ik(String str, String str2) {
        return mUb.J2(az(), str, str2);
    }

    String KN() {
        try {
            mUb.xMQ(this.rl.Ik());
            return (String) rl(this.J2.getId());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    void O(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (qie == null) {
                    qie = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
                }
                qie.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String Uo() {
        nr(this.rl);
        E2();
        return KN();
    }

    final /* synthetic */ Task ViF(final String str, final String str2, final String str3, final C1914c.j jVar) {
        return this.nr.nr(str, str2, str3).onSuccessTask(this.f60512n, new SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.CN3

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final FirebaseInstanceId f60508n;
            private final String nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final String f60509t;

            {
                this.f60508n = this;
                this.rl = str2;
                this.f60509t = str3;
                this.nr = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                return this.f60508n.WPU(this.rl, this.f60509t, this.nr, (String) obj);
            }
        }).addOnSuccessListener(fuX.f60531n, new OnSuccessListener(this, jVar) { // from class: com.google.firebase.iid.Dsr

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final FirebaseInstanceId f60510n;
            private final C1914c.j rl;

            {
                this.f60510n = this;
                this.rl = jVar;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f60510n.aYN(this.rl, (o) obj);
            }
        });
    }

    final /* synthetic */ Task WPU(String str, String str2, String str3, String str4) {
        mUb.KN(az(), str, str2, str4, this.f60513t.n());
        return Tasks.forResult(new qz(str3, str4));
    }

    boolean X(C1914c.j jVar) {
        return jVar == null || jVar.t(this.f60513t.n());
    }

    C1914c.j ck() {
        return Ik(Pl.t(this.rl), "*");
    }

    public Task mUb() {
        nr(this.rl);
        return gh(Pl.t(this.rl), "*");
    }

    public boolean o() {
        return this.f60513t.Uo();
    }

    String t() {
        return HI(Pl.t(this.rl), "*");
    }

    public String ty() {
        nr(this.rl);
        C1914c.j jVarCk = ck();
        if (X(jVarCk)) {
            fD();
        }
        return C1914c.j.rl(jVarCk);
    }

    private void E2() {
        if (X(ck())) {
            fD();
        }
    }

    private static String g(String str) {
        if (!str.isEmpty() && !str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) && !str.equalsIgnoreCase("gcm")) {
            return str;
        }
        return "*";
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull com.google.firebase.Wre wre) {
        nr(wre);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) wre.mUb(FirebaseInstanceId.class);
        Preconditions.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private Task gh(final String str, String str2) {
        final String strG = g(str2);
        return Tasks.forResult(null).continueWithTask(this.f60512n, new Continuation(this, str, strG) { // from class: com.google.firebase.iid.w6

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final FirebaseInstanceId f60541n;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final String f60542t;

            {
                this.f60541n = this;
                this.rl = str;
                this.f60542t = strG;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return this.f60541n.nY(this.rl, this.f60542t, task);
            }
        });
    }

    private static void nr(com.google.firebase.Wre wre) {
        Preconditions.checkNotEmpty(wre.ck().O(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(wre.ck().t(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(wre.ck().rl(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(XQ(wre.ck().t()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Z(wre.ck().rl()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private static Object qie(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new CancellationException("Task is already canceled");
    }

    public static FirebaseInstanceId xMQ() {
        return getInstance(com.google.firebase.Wre.az());
    }

    final /* synthetic */ void aYN(C1914c.j jVar, o oVar) {
        String strN = oVar.n();
        if (jVar == null || !strN.equals(jVar.f60528n)) {
            Iterator it = this.KN.iterator();
            if (!it.hasNext()) {
                return;
            }
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    final /* synthetic */ Task nY(final String str, final String str2, Task task) {
        final String strKN = KN();
        final C1914c.j jVarIk = Ik(str, str2);
        if (!X(jVarIk)) {
            return Tasks.forResult(new qz(strKN, jVarIk.f60528n));
        }
        return this.f60511O.n(str, str2, new QJ.j(this, strKN, str, str2, jVarIk) { // from class: com.google.firebase.iid.Wre

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final C1914c.j f60521O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final FirebaseInstanceId f60522n;
            private final String nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final String f60523t;

            {
                this.f60522n = this;
                this.rl = strKN;
                this.f60523t = str;
                this.nr = str2;
                this.f60521O = jVarIk;
            }

            @Override // com.google.firebase.iid.QJ.j
            public Task start() {
                return this.f60522n.ViF(this.rl, this.f60523t, this.nr, this.f60521O);
            }
        });
    }

    FirebaseInstanceId(com.google.firebase.Wre wre, oSp.n nVar, oSp.n nVar2, s9b.I28 i28) {
        this(wre, new Pl(wre.qie()), n.rl(), n.rl(), nVar, nVar2, i28);
    }
}
