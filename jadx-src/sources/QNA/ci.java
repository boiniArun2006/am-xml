package QNA;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ci {
    private final h1M.j HI;
    private final Zlm.Wre Ik;
    private g9s J2;
    private boolean KN;
    private g9s Uo;
    private final YSF.j az;
    private final h1M.o ck;
    private final E8K.CN3 gh;
    private final iwV mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8097n;
    public final po.n qie;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DAz f8098t;
    private final qz ty;
    private eO xMQ;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f8096O = System.currentTimeMillis();
    private final h nr = new h();

    static boolean r(String str, boolean z2) {
        if (!z2) {
            h1M.CN3.J2().xMQ("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public static String Ik() {
        return "19.4.4";
    }

    private void ck(final F5.aC aCVar) {
        Future<?> futureSubmit = this.Ik.f12590n.t().submit(new Runnable() { // from class: QNA.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f8078n.ty(aCVar);
            }
        });
        h1M.CN3.J2().rl("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            h1M.CN3.J2().O("Crashlytics was interrupted during initialization.", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            h1M.CN3.J2().O("Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            h1M.CN3.J2().O("Crashlytics timed out during initialization.", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(F5.aC aCVar) {
        Zlm.Wre.t();
        WPU();
        try {
            try {
                this.qie.n(new po.j() { // from class: QNA.r
                    @Override // po.j
                    public final void n(String str) {
                        this.f8145n.Z(str);
                    }
                });
                this.xMQ.P5();
                if (!aCVar.rl().rl.f2504n) {
                    h1M.CN3.J2().rl("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.xMQ.g(aCVar)) {
                    h1M.CN3.J2().gh("Previous sessions could not be finalized.");
                }
                this.xMQ.M(aCVar.n());
                S();
            } catch (Exception e2) {
                h1M.CN3.J2().O("Crashlytics encountered a problem during asynchronous initialization.", e2);
                S();
            }
        } catch (Throwable th) {
            S();
            throw th;
        }
    }

    private void xMQ() {
        try {
            this.KN = Boolean.TRUE.equals((Boolean) this.Ik.f12590n.t().submit(new Callable() { // from class: QNA.s4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f8147n.xMQ.Z());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.KN = false;
        }
    }

    public Task HI(final F5.aC aCVar) {
        return this.Ik.f12590n.nr(new Runnable() { // from class: QNA.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f8156n.ty(aCVar);
            }
        });
    }

    public Task ViF() {
        return this.xMQ.M7();
    }

    public void XQ(final Throwable th, final Map map) {
        this.Ik.f12590n.nr(new Runnable() { // from class: QNA.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8094n.xMQ.J(Thread.currentThread(), th, map);
            }
        });
    }

    public boolean aYN(j jVar, F5.aC aCVar) {
        if (!r(jVar.rl, Dsr.xMQ(this.f8097n, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strT = new fuX().t();
        try {
            this.Uo = new g9s("crash_marker", this.gh);
            this.J2 = new g9s("initialization_marker", this.gh);
            IRN.eO eOVar = new IRN.eO(strT, this.gh, this.Ik);
            IRN.Wre wre = new IRN.Wre(this.gh);
            AVk.j jVar2 = new AVk.j(1024, new AVk.w6(10));
            this.ck.rl(eOVar);
            this.xMQ = new eO(this.f8097n, this.mUb, this.f8098t, this.gh, this.Uo, jVar, eOVar, wre, P.mUb(this.f8097n, this.mUb, this.gh, jVar, wre, eOVar, jVar2, aCVar, this.nr, this.ty, this.Ik), this.HI, this.az, this.ty, this.Ik);
            boolean zAz = az();
            xMQ();
            this.xMQ.ViF(strT, Thread.getDefaultUncaughtExceptionHandler(), aCVar);
            if (!zAz || !Dsr.nr(this.f8097n)) {
                h1M.CN3.J2().rl("Successfully configured exception handler.");
                return true;
            }
            h1M.CN3.J2().rl("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            ck(aCVar);
            return false;
        } catch (Exception e2) {
            h1M.CN3.J2().O("Crashlytics was not started due to an exception during initialization", e2);
            this.xMQ = null;
            return false;
        }
    }

    boolean az() {
        return this.J2.t();
    }

    public void g(final String str, final String str2) {
        this.Ik.f12590n.nr(new Runnable() { // from class: QNA.l3D
            @Override // java.lang.Runnable
            public final void run() {
                this.f8126n.xMQ.p5(str, str2);
            }
        });
    }

    public Task gh() {
        return this.xMQ.o();
    }

    public Task mUb() {
        return this.xMQ.ty();
    }

    public void nY(Boolean bool) {
        this.f8098t.KN(bool);
    }

    public boolean o() {
        return this.f8098t.nr();
    }

    public boolean qie() {
        return this.KN;
    }

    public void te(final String str) {
        this.Ik.f12590n.nr(new Runnable() { // from class: QNA.QJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f8080n.xMQ.E(str);
            }
        });
    }

    public ci(com.google.firebase.Wre wre, iwV iwv, h1M.j jVar, DAz dAz, po.n nVar, YSF.j jVar2, E8K.CN3 cn3, qz qzVar, h1M.o oVar, Zlm.Wre wre2) {
        this.rl = wre;
        this.f8098t = dAz;
        this.f8097n = wre.qie();
        this.mUb = iwv;
        this.HI = jVar;
        this.qie = nVar;
        this.az = jVar2;
        this.gh = cn3;
        this.ty = qzVar;
        this.ck = oVar;
        this.Ik = wre2;
    }

    void S() {
        Zlm.Wre.t();
        try {
            if (!this.J2.nr()) {
                h1M.CN3.J2().gh("Initialization marker file was not properly removed.");
            }
        } catch (Exception e2) {
            h1M.CN3.J2().O("Problem encountered deleting Crashlytics initialization marker.", e2);
        }
    }

    void WPU() {
        Zlm.Wre.t();
        this.J2.n();
        h1M.CN3.J2().xMQ("Initialization marker file was created.");
    }

    public void Z(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f8096O;
        this.Ik.f12590n.nr(new Runnable() { // from class: QNA.UGc
            @Override // java.lang.Runnable
            public final void run() {
                ci ciVar = this.f8086n;
                ciVar.Ik.rl.nr(new Runnable() { // from class: QNA.SPz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8083n.xMQ.D(j, str);
                    }
                });
            }
        });
    }
}
