package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
class s4 implements Runnable {
    ExecutorService J2 = n.rl();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final FirebaseInstanceId f60537O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f60538n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PowerManager.WakeLock f60539t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class j extends BroadcastReceiver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private s4 f60540n;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s4 s4Var = this.f60540n;
            if (s4Var != null && s4Var.t()) {
                if (FirebaseInstanceId.r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f60540n.f60537O.O(this.f60540n, 0L);
                this.f60540n.rl().unregisterReceiver(this);
                this.f60540n = null;
            }
        }

        public j(s4 s4Var) {
            this.f60540n = s4Var;
        }

        public void n() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f60540n.rl().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    boolean nr() throws IOException {
        if (!this.f60537O.X(this.f60537O.ck())) {
            return true;
        }
        try {
            if (this.f60537O.t() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e2) {
            if (!C.J2(e2.getMessage())) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    Context rl() {
        return this.f60537O.J2().qie();
    }

    s4(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f60537O = firebaseInstanceId;
        this.f60538n = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) rl().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f60539t = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (l3D.n().t(rl())) {
            this.f60539t.acquire();
        }
        try {
            try {
                this.f60537O.iF(true);
                if (!this.f60537O.o()) {
                    this.f60537O.iF(false);
                    if (!l3D.n().t(rl())) {
                        return;
                    }
                } else if (l3D.n().rl(rl()) && !t()) {
                    new j(this).n();
                    if (!l3D.n().t(rl())) {
                        return;
                    }
                } else {
                    if (nr()) {
                        this.f60537O.iF(false);
                    } else {
                        this.f60537O.e(this.f60538n);
                    }
                    if (!l3D.n().t(rl())) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f60537O.iF(false);
                if (!l3D.n().t(rl())) {
                    return;
                }
            }
            this.f60539t.release();
        } catch (Throwable th) {
            if (l3D.n().t(rl())) {
                this.f60539t.release();
            }
            throw th;
        }
    }

    boolean t() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) rl().getSystemService(HrvQKfmFZJudBc.FOM);
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
