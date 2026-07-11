package com.google.firebase.installations;

import T7o.Ml;
import T7o.Wre;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import uOq.C2403c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 implements s9b.I28 {
    private static final Object az = new Object();
    private static final ThreadFactory ty = new j();
    private final s9b.CN3 J2;
    private final ExecutorService KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C2403c f60557O;
    private final Object Uo;
    private Set gh;
    private String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f60558n;
    private final fuX nr;
    private final List qie;
    private final T7o.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final X7.w6 f60559t;
    private final Executor xMQ;

    class j implements ThreadFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicInteger f60560n = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f60560n.getAndIncrement())));
        }

        j() {
        }
    }

    w6(final com.google.firebase.Wre wre, oSp.n nVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, wre, new T7o.w6(wre.qie(), nVar), new X7.w6(wre), fuX.t(), new C2403c(new oSp.n() { // from class: s9b.j
            @Override // oSp.n
            public final Object get() {
                return com.google.firebase.installations.w6.O(wre);
            }
        }), new s9b.CN3());
    }

    private synchronized void g(String str) {
        this.mUb = str;
    }

    private synchronized void te(X7.Ml ml, X7.Ml ml2) {
        if (this.gh.size() != 0 && !TextUtils.equals(ml.nr(), ml2.nr())) {
            Iterator it = this.gh.iterator();
            if (it.hasNext()) {
                android.support.v4.media.j.n(it.next());
                ml2.nr();
                throw null;
            }
        }
    }

    private synchronized String ty() {
        return this.mUb;
    }

    static /* synthetic */ class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60561n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[Wre.n.values().length];
            rl = iArr;
            try {
                iArr[Wre.n.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[Wre.n.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[Wre.n.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Ml.n.values().length];
            f60561n = iArr2;
            try {
                iArr2[Ml.n.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60561n[Ml.n.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private X7.n HI() {
        return (X7.n) this.f60557O.get();
    }

    public static w6 Ik(com.google.firebase.Wre wre) {
        Preconditions.checkArgument(wre != null, "Null is not a valid value of FirebaseApp.");
        return (w6) wre.mUb(s9b.I28.class);
    }

    private Task J2() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        KN(new Ml(this.nr, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void KN(CN3 cn3) {
        synchronized (this.Uo) {
            this.qie.add(cn3);
        }
    }

    public static /* synthetic */ X7.n O(com.google.firebase.Wre wre) {
        return new X7.n(wre);
    }

    private Task Uo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        KN(new I28(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void ViF(Exception exc) {
        synchronized (this.Uo) {
            try {
                Iterator it = this.qie.iterator();
                while (it.hasNext()) {
                    if (((CN3) it.next()).n(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String WPU(X7.Ml ml) {
        if ((!this.f60558n.HI().equals("CHIME_ANDROID_SDK") && !this.f60558n.WPU()) || !ml.az()) {
            return this.J2.n();
        }
        String strJ2 = HI().J2();
        return TextUtils.isEmpty(strJ2) ? this.J2.n() : strJ2;
    }

    /* JADX WARN: Finally extract failed */
    private void XQ(X7.Ml ml) {
        synchronized (az) {
            try {
                com.google.firebase.installations.n nVarN = com.google.firebase.installations.n.n(this.f60558n.qie(), "generatefid.lock");
                try {
                    this.f60559t.rl(ml);
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                } catch (Throwable th) {
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private X7.Ml gh(X7.Ml ml) throws FirebaseInstallationsException {
        T7o.Wre wreO = this.rl.O(qie(), ml.nr(), Z(), ml.J2());
        int i2 = n.rl[wreO.rl().ordinal()];
        if (i2 == 1) {
            return ml.HI(wreO.t(), wreO.nr(), this.nr.rl());
        }
        if (i2 == 2) {
            return ml.Ik("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
        }
        g(null);
        return ml.r();
    }

    private void nY(X7.Ml ml) {
        synchronized (this.Uo) {
            try {
                Iterator it = this.qie.iterator();
                while (it.hasNext()) {
                    if (((CN3) it.next()).rl(ml)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private X7.Ml o() {
        X7.Ml mlNr;
        synchronized (az) {
            try {
                com.google.firebase.installations.n nVarN = com.google.firebase.installations.n.n(this.f60558n.qie(), "generatefid.lock");
                try {
                    mlNr = this.f60559t.nr();
                    if (mlNr.mUb()) {
                        mlNr = this.f60559t.rl(mlNr.Z(WPU(mlNr)));
                    }
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                } catch (Throwable th) {
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlNr;
    }

    /* JADX WARN: Finally extract failed */
    private X7.Ml r() {
        X7.Ml mlNr;
        synchronized (az) {
            try {
                com.google.firebase.installations.n nVarN = com.google.firebase.installations.n.n(this.f60558n.qie(), "generatefid.lock");
                try {
                    mlNr = this.f60559t.nr();
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                } catch (Throwable th) {
                    if (nVarN != null) {
                        nVarN.rl();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlNr;
    }

    String Z() {
        return this.f60558n.ck().O();
    }

    String az() {
        return this.f60558n.ck().t();
    }

    String qie() {
        return this.f60558n.ck().rl();
    }

    private void S() {
        Preconditions.checkNotEmpty(az(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(Z(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(qie(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(fuX.KN(az()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(fuX.Uo(qie()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private X7.Ml aYN(X7.Ml ml) throws FirebaseInstallationsException {
        String strXMQ;
        if (ml.nr() != null && ml.nr().length() == 11) {
            strXMQ = HI().xMQ();
        } else {
            strXMQ = null;
        }
        T7o.Ml mlNr = this.rl.nr(qie(), ml.nr(), Z(), az(), strXMQ);
        int i2 = n.f60561n[mlNr.O().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return ml.Ik("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
        }
        return ml.o(mlNr.t(), mlNr.nr(), this.nr.rl(), mlNr.rl().t(), mlNr.rl().nr());
    }

    public static w6 ck() {
        return Ik(com.google.firebase.Wre.az());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mUb(final boolean z2) {
        X7.Ml mlO = o();
        if (z2) {
            mlO = mlO.ck();
        }
        nY(mlO);
        this.xMQ.execute(new Runnable() { // from class: s9b.Ml
            @Override // java.lang.Runnable
            public final void run() {
                this.f73180n.xMQ(z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xMQ(boolean z2) {
        X7.Ml mlAYN;
        X7.Ml mlR = r();
        try {
            if (!mlR.xMQ() && !mlR.qie()) {
                if (!z2 && !this.nr.J2(mlR)) {
                    return;
                }
                mlAYN = gh(mlR);
            } else {
                mlAYN = aYN(mlR);
            }
            XQ(mlAYN);
            te(mlR, mlAYN);
            if (mlAYN.gh()) {
                g(mlAYN.nr());
            }
            if (mlAYN.xMQ()) {
                ViF(new FirebaseInstallationsException(FirebaseInstallationsException.j.BAD_CONFIG));
            } else if (mlAYN.mUb()) {
                ViF(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                nY(mlAYN);
            }
        } catch (FirebaseInstallationsException e2) {
            ViF(e2);
        }
    }

    @Override // s9b.I28
    public Task getId() {
        S();
        String strTy = ty();
        if (strTy != null) {
            return Tasks.forResult(strTy);
        }
        Task taskUo = Uo();
        this.KN.execute(new Runnable() { // from class: s9b.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f73183n.mUb(false);
            }
        });
        return taskUo;
    }

    @Override // s9b.I28
    public Task n(final boolean z2) {
        S();
        Task taskJ2 = J2();
        this.KN.execute(new Runnable() { // from class: s9b.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f73184n.mUb(z2);
            }
        });
        return taskJ2;
    }

    w6(ExecutorService executorService, Executor executor, com.google.firebase.Wre wre, T7o.w6 w6Var, X7.w6 w6Var2, fuX fux, C2403c c2403c, s9b.CN3 cn3) {
        this.Uo = new Object();
        this.gh = new HashSet();
        this.qie = new ArrayList();
        this.f60558n = wre;
        this.rl = w6Var;
        this.f60559t = w6Var2;
        this.nr = fux;
        this.f60557O = c2403c;
        this.J2 = cn3;
        this.KN = executorService;
        this.xMQ = executor;
    }
}
