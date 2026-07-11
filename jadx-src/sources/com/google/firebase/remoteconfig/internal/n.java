package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.qz;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n {
    private final ScheduledExecutorService J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final N67.w6 f60764O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f60765n;
    private final Wre nr;
    private final HttpURLConnection rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f60766t;
    private final Random Uo = new Random();
    private boolean KN = false;

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f60768n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f60769t;

        j(int i2, long j2) {
            this.f60768n = i2;
            this.f60769t = j2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            n.this.nr(this.f60768n, this.f60769t);
        }
    }

    private synchronized boolean Uo() {
        return this.f60765n.isEmpty();
    }

    private synchronized void mUb(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f60765n.iterator();
        while (it.hasNext()) {
            ((N67.w6) it.next()).n(firebaseRemoteConfigException);
        }
    }

    private synchronized void t(N67.n nVar) {
        Iterator it = this.f60765n.iterator();
        while (it.hasNext()) {
            ((N67.w6) it.next()).rl(nVar);
        }
    }

    public synchronized Task nr(int i2, final long j2) throws Throwable {
        final int i3 = i2 - 1;
        try {
            try {
                final Task taskTy = this.f60766t.ty(qz.n.REALTIME, 3 - i3);
                final Task taskO = this.nr.O();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskTy, taskO}).continueWithTask(this.J2, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return n.n(this.f60754n, taskTy, taskO, j2, i3, task);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = new org.json.JSONObject(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r4.has("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r4.getBoolean("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r8.f60764O.n(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.j.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (Uo() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r4.has("latestTemplateVersionNumber") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r5 = r8.f60766t.r();
        r3 = r4.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r3 <= r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        rl(3, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void J2(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strXMQ = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strXMQ = strXMQ + line;
                if (line.contains("}")) {
                    strXMQ = xMQ(strXMQ);
                    if (!strXMQ.isEmpty()) {
                        try {
                            break;
                        } catch (JSONException e2) {
                            mUb(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e2.getCause(), FirebaseRemoteConfigException.j.CONFIG_UPDATE_MESSAGE_INVALID));
                            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                        }
                    }
                }
            }
        }
        bufferedReader.close();
    }

    private void rl(int i2, long j2) {
        if (i2 == 0) {
            mUb(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.j.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.J2.schedule(new j(i2, j2), this.Uo.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private String xMQ(String str) {
        int iIndexOf = str.indexOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        int iLastIndexOf = str.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    public void KN() {
        HttpURLConnection httpURLConnection = this.rl;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    J2(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e2) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
                }
            } catch (IOException e3) {
                if (!this.KN) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e3);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e4);
                }
            }
            throw th;
        }
    }

    public void gh(boolean z2) {
        this.KN = z2;
    }

    public n(HttpURLConnection httpURLConnection, qz qzVar, Wre wre, Set set, N67.w6 w6Var, ScheduledExecutorService scheduledExecutorService) {
        this.rl = httpURLConnection;
        this.f60766t = qzVar;
        this.nr = wre;
        this.f60765n = set;
        this.f60764O = w6Var;
        this.J2 = scheduledExecutorService;
    }

    private static Boolean O(qz.j jVar, long j2) {
        boolean z2 = false;
        if (jVar.nr() != null) {
            if (jVar.nr().gh() >= j2) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        if (jVar.J2() == 1) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public static /* synthetic */ Task n(n nVar, Task task, Task task2, long j2, int i2, Task task3) throws JSONException {
        nVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        qz.j jVar = (qz.j) task.getResult();
        CN3 cn3N = (CN3) task2.getResult();
        if (!O(jVar, j2).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            nVar.rl(i2, j2);
            return Tasks.forResult(null);
        }
        if (jVar.nr() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (cn3N == null) {
            cn3N = CN3.qie().n();
        }
        Set setJ2 = cn3N.J2(jVar.nr());
        if (setJ2.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        nVar.t(N67.n.n(setJ2));
        return Tasks.forResult(null);
    }
}
