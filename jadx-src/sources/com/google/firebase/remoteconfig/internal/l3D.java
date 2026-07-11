package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class l3D {
    private final String HI;
    private HttpURLConnection J2;
    private com.google.firebase.remoteconfig.internal.n Uo;
    Wre az;
    private final com.google.firebase.Wre gh;
    private final qz mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f60758n;
    private final s9b.I28 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1916c f60760r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60761t;
    private final Context ty;
    private final ScheduledExecutorService xMQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final int[] f60756Z = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern XQ = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final int KN = 8;
    private boolean rl = false;
    private final Random ck = new Random();
    private final Clock Ik = DefaultClock.getInstance();
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f60757O = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f60759o = new Object();

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l3D.this.O();
        }
    }

    class n implements N67.w6 {
        @Override // N67.w6
        public void rl(N67.n nVar) {
        }

        n() {
        }

        @Override // N67.w6
        public void n(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            l3D.this.qie();
            l3D.this.XQ(firebaseRemoteConfigException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean J2() {
        boolean z2;
        if (this.f60758n.isEmpty() || this.rl || this.nr) {
            z2 = false;
        } else if (!this.f60757O) {
            z2 = true;
        }
        return z2;
    }

    private synchronized void S() {
        this.f60761t = 8;
    }

    private synchronized boolean Uo() {
        boolean zJ2;
        zJ2 = J2();
        if (zJ2) {
            ViF(true);
        }
        return zJ2;
    }

    private synchronized void ViF(boolean z2) {
        this.rl = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void XQ(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f60758n.iterator();
        while (it.hasNext()) {
            ((N67.w6) it.next()).n(firebaseRemoteConfigException);
        }
    }

    private synchronized void o(long j2) {
        try {
            if (J2()) {
                int i2 = this.f60761t;
                if (i2 > 0) {
                    this.f60761t = i2 - 1;
                    this.xMQ.schedule(new j(), j2, TimeUnit.MILLISECONDS);
                } else if (!this.f60757O) {
                    XQ(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.j.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qie() {
        this.nr = true;
    }

    private boolean r(int i2) {
        return i2 == 408 || i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    public synchronized void WPU() {
        o(Math.max(0L, this.f60760r.xMQ().n().getTime() - new Date(this.Ik.currentTimeMillis()).getTime()));
    }

    public synchronized com.google.firebase.remoteconfig.internal.n te(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.n(httpURLConnection, this.mUb, this.az, this.f60758n, new n(), this.xMQ);
    }

    private long HI(int i2) {
        int length = f60756Z.length;
        if (i2 >= length) {
            i2 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(r0[i2 - 1]);
        return (millis / 2) + ((long) this.ck.nextInt((int) millis));
    }

    private URL Ik() {
        try {
            return new URL(ck(this.HI));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private void KN(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    private String Z(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    private void aYN(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.gh.ck().rl());
        httpURLConnection.setRequestProperty("X-Android-Package", this.ty.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", ty());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(com.safedk.android.utils.n.f63222c, "application/json");
    }

    private static String az(String str) {
        Matcher matcher = XQ.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String ck(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", az(this.gh.ck().t()), str);
    }

    private void fD(Date date) {
        int iRl = this.f60760r.xMQ().rl() + 1;
        this.f60760r.HI(iRl, new Date(date.getTime() + HI(iRl)));
    }

    private JSONObject gh(String str) {
        HashMap map = new HashMap();
        map.put("project", az(this.gh.ck().t()));
        map.put("namespace", this.HI);
        map.put("lastKnownVersionNumber", Long.toString(this.mUb.r()));
        map.put("appId", this.gh.ck().t());
        map.put("sdkVersion", "22.1.2");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    private String ty() {
        try {
            Context context = this.ty;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.ty.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.ty.getPackageName());
            return null;
        }
    }

    public void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        aYN(httpURLConnection, str2);
        byte[] bytes = gh(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public void iF() {
        o(0L);
    }

    public Task mUb() {
        final Task taskN = this.qie.n(false);
        final Task id = this.qie.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskN, id}).continueWithTask(this.xMQ, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.QJ
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return l3D.rl(this.f60729n, taskN, id, task);
            }
        });
    }

    public void nY(boolean z2) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f60759o) {
            try {
                this.f60757O = z2;
                com.google.firebase.remoteconfig.internal.n nVar = this.Uo;
                if (nVar != null) {
                    nVar.gh(z2);
                }
                if (Build.VERSION.SDK_INT >= 26 && z2 && (httpURLConnection = this.J2) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void xMQ(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.J2;
        if (httpURLConnection != null && !this.f60757O) {
            httpURLConnection.disconnect();
        }
        KN(inputStream);
        KN(inputStream2);
    }

    public l3D(com.google.firebase.Wre wre, s9b.I28 i28, qz qzVar, Wre wre2, Context context, String str, Set set, C1916c c1916c, ScheduledExecutorService scheduledExecutorService) {
        this.f60758n = set;
        this.xMQ = scheduledExecutorService;
        this.f60761t = Math.max(8 - c1916c.xMQ().rl(), 1);
        this.gh = wre;
        this.mUb = qzVar;
        this.qie = i28;
        this.az = wre2;
        this.ty = context;
        this.HI = str;
        this.f60760r = c1916c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Task n(l3D l3d, Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        Throwable th;
        InputStream inputStream;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        l3d.getClass();
        boolean z2 = true;
        try {
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            errorStream = null;
        } catch (Throwable th2) {
            errorStream = null;
            numValueOf = 0;
            th = th2;
            inputStream = null;
        }
        if (task.isSuccessful()) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
            l3d.J2 = httpURLConnection;
            inputStream = httpURLConnection.getInputStream();
            try {
                errorStream = l3d.J2.getErrorStream();
                try {
                    responseCode = l3d.J2.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            try {
                                l3d.S();
                                l3d.f60760r.gh();
                                com.google.firebase.remoteconfig.internal.n nVarTe = l3d.te(l3d.J2);
                                l3d.Uo = nVarTe;
                                nVarTe.KN();
                            } catch (IOException e3) {
                                e = e3;
                                if (!l3d.f60757O) {
                                    l3d.S();
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                l3d.xMQ(inputStream, errorStream);
                                l3d.ViF(false);
                                if (!l3d.f60757O || (numValueOf != 0 && !l3d.r(numValueOf.intValue()))) {
                                    z2 = false;
                                }
                                if (z2) {
                                    l3d.fD(new Date(l3d.Ik.currentTimeMillis()));
                                }
                                if (!z2 && numValueOf.intValue() != 200) {
                                    String strZ = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strZ = l3d.Z(l3d.J2.getErrorStream());
                                    }
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strZ, FirebaseRemoteConfigException.j.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                l3d.WPU();
                                l3d.J2 = null;
                                l3d.Uo = null;
                                return Tasks.forResult(null);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            l3d.xMQ(inputStream, errorStream);
                            l3d.ViF(false);
                            if (l3d.f60757O || (numValueOf != 0 && !l3d.r(numValueOf.intValue()))) {
                                z2 = false;
                            }
                            if (z2) {
                                l3d.fD(new Date(l3d.Ik.currentTimeMillis()));
                            }
                            if (!z2 && numValueOf.intValue() != 200) {
                                String strZ2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strZ2 = l3d.Z(l3d.J2.getErrorStream());
                                }
                                l3d.XQ(new FirebaseRemoteConfigServerException(numValueOf.intValue(), strZ2, FirebaseRemoteConfigException.j.CONFIG_UPDATE_STREAM_ERROR));
                            } else {
                                l3d.WPU();
                            }
                            throw th;
                        }
                    }
                    l3d.xMQ(inputStream, errorStream);
                    l3d.ViF(false);
                    if (l3d.f60757O || !l3d.r(responseCode)) {
                        z2 = false;
                    }
                    if (z2) {
                        l3d.fD(new Date(l3d.Ik.currentTimeMillis()));
                    }
                } catch (IOException e4) {
                    e = e4;
                    numValueOf = 0;
                } catch (Throwable th4) {
                    numValueOf = 0;
                    th = th4;
                }
            } catch (IOException e5) {
                e = e5;
                errorStream = null;
                numValueOf = errorStream;
                if (!l3d.f60757O) {
                }
                l3d.xMQ(inputStream, errorStream);
                l3d.ViF(false);
                if (!l3d.f60757O) {
                    z2 = false;
                    if (z2) {
                    }
                    if (!z2) {
                        String strZ3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (numValueOf.intValue() == 403) {
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strZ3, FirebaseRemoteConfigException.j.CONFIG_UPDATE_STREAM_ERROR);
                        l3d.XQ(firebaseRemoteConfigServerException);
                    }
                    l3d.WPU();
                }
                l3d.J2 = null;
                l3d.Uo = null;
                return Tasks.forResult(null);
            } catch (Throwable th5) {
                numValueOf = 0;
                th = th5;
                errorStream = null;
            }
            if (!z2 && responseCode != 200) {
                String strZ4 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                if (responseCode == 403) {
                    strZ4 = l3d.Z(l3d.J2.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strZ4, FirebaseRemoteConfigException.j.CONFIG_UPDATE_STREAM_ERROR);
                l3d.XQ(firebaseRemoteConfigServerException);
                l3d.J2 = null;
                l3d.Uo = null;
                return Tasks.forResult(null);
            }
            l3d.WPU();
            l3d.J2 = null;
            l3d.Uo = null;
            return Tasks.forResult(null);
        }
        throw new IOException(task.getException());
    }

    public static /* synthetic */ Task rl(l3D l3d, Task task, Task task2, Task task3) {
        l3d.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) l3d.Ik().openConnection();
            l3d.g(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.Wre) task.getResult()).rl());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e2) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e2));
        }
    }

    public void O() {
        if (!Uo()) {
            return;
        }
        if (new Date(this.Ik.currentTimeMillis()).before(this.f60760r.xMQ().n())) {
            WPU();
        } else {
            final Task taskMUb = mUb();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskMUb}).continueWith(this.xMQ, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.z
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return l3D.n(this.f60783n, taskMUb, task);
                }
            });
        }
    }
}
