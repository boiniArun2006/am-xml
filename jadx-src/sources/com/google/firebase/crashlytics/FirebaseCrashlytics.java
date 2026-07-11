package com.google.firebase.crashlytics;

import QG.n;
import QNA.DAz;
import QNA.Dsr;
import QNA.ci;
import QNA.iwV;
import QNA.qz;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Wre;
import h1M.CN3;
import h1M.Ml;
import h1M.o;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import oSp.j;
import s9b.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ci f60280n;

    public void recordException(@NonNull Throwable th) {
        if (th == null) {
            CN3.J2().gh("A null value was passed to recordException. Ignoring.");
        } else {
            this.f60280n.XQ(th, Collections.EMPTY_MAP);
        }
    }

    public void setCrashlyticsCollectionEnabled(boolean z2) {
        this.f60280n.nY(Boolean.valueOf(z2));
    }

    public void setCustomKey(@NonNull String str, boolean z2) {
        this.f60280n.g(str, Boolean.toString(z2));
    }

    public void setCustomKeys(@NonNull BUw.CN3 cn3) {
        throw null;
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f60280n.mUb();
    }

    public void deleteUnsentReports() {
        this.f60280n.gh();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f60280n.qie();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f60280n.o();
    }

    public void log(@NonNull String str) {
        this.f60280n.Z(str);
    }

    public void sendUnsentReports() {
        this.f60280n.ViF();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f60280n.nY(bool);
    }

    public void setCustomKey(@NonNull String str, double d2) {
        this.f60280n.g(str, Double.toString(d2));
    }

    public void setUserId(@NonNull String str) {
        this.f60280n.te(str);
    }

    private FirebaseCrashlytics(ci ciVar) {
        this.f60280n = ciVar;
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) Wre.az().mUb(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics rl(Wre wre, I28 i28, j jVar, j jVar2, j jVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextQie = wre.qie();
        String packageName = contextQie.getPackageName();
        CN3.J2().Uo("Initializing Firebase Crashlytics " + ci.Ik() + " for " + packageName);
        Zlm.Wre wre2 = new Zlm.Wre(executorService, executorService2);
        E8K.CN3 cn3 = new E8K.CN3(contextQie);
        DAz dAz = new DAz(wre);
        iwV iwv = new iwV(contextQie, packageName, i28, dAz);
        Ml ml = new Ml(jVar);
        BUw.Ml ml2 = new BUw.Ml(jVar2);
        qz qzVar = new qz(dAz, cn3);
        XE.j.O(qzVar);
        ci ciVar = new ci(wre, iwv, ml, dAz, ml2.O(), ml2.nr(), cn3, qzVar, new o(jVar3), wre2);
        String strT = wre.ck().t();
        String strAz = Dsr.az(contextQie);
        List<QNA.Wre> listMUb = Dsr.mUb(contextQie);
        CN3.J2().rl("Mapping file ID is: " + strAz);
        for (QNA.Wre wre3 : listMUb) {
            CN3.J2().rl(String.format("Build id for %s on %s: %s", wre3.t(), wre3.n(), wre3.rl()));
        }
        try {
            QNA.j jVarN = QNA.j.n(contextQie, iwv, strT, strAz, listMUb, new h1M.Wre(contextQie));
            CN3.J2().xMQ("Installer package name is: " + jVarN.nr);
            F5.CN3 cn3Qie = F5.CN3.qie(contextQie, strT, iwv, new n(), jVarN.J2, jVarN.Uo, cn3, dAz);
            cn3Qie.ck(wre2).addOnFailureListener(executorService3, new OnFailureListener() { // from class: BUw.fuX
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    h1M.CN3.J2().O("Error fetching settings.", exc);
                }
            });
            if (ciVar.aYN(jVarN, cn3Qie)) {
                ciVar.HI(cn3Qie);
            }
            return new FirebaseCrashlytics(ciVar);
        } catch (PackageManager.NameNotFoundException e2) {
            CN3.J2().O("Error retrieving app package info.", e2);
            return null;
        }
    }

    public void setCustomKey(@NonNull String str, float f3) {
        this.f60280n.g(str, Float.toString(f3));
    }

    public void setCustomKey(@NonNull String str, int i2) {
        this.f60280n.g(str, Integer.toString(i2));
    }

    public void recordException(@NonNull Throwable th, @NonNull BUw.CN3 cn3) {
        if (th == null) {
            CN3.J2().gh("A null value was passed to recordException. Ignoring.");
            return;
        }
        throw null;
    }

    public void setCustomKey(@NonNull String str, long j2) {
        this.f60280n.g(str, Long.toString(j2));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f60280n.g(str, str2);
    }
}
