package com.safedk.android.a;

import com.google.android.exoplayer2.C;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61236a = "ConfigDownload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f61237b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f61238c = {60000, 300000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f61239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f61240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f61241f;

    public b(e eVar, String str, String str2) {
        this.f61239d = new e();
        this.f61239d = eVar;
        this.f61240e = str;
        this.f61241f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[PHI: r8
      0x0076: PHI (r8v4 com.safedk.android.a.f) = (r8v2 com.safedk.android.a.f), (r8v6 com.safedk.android.a.f) binds: [B:22:0x0074, B:38:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        f fVar;
        Throwable th;
        Exception e2;
        String userId = SafeDK.getInstance().getUserId();
        f fVar2 = null;
        for (int i2 = 0; i2 <= 2; i2++) {
            try {
                URL url = new URL(this.f61240e);
                Logger.d(f61236a, "Config url: ", url);
                fVar = new f(url.openConnection());
                try {
                    fVar.a(false);
                    if (userId != null) {
                        fVar.a("Cookie", "user_id=" + userId);
                    }
                    if (this.f61241f != null) {
                        fVar.a("If-None-Match", this.f61241f);
                    }
                    fVar.f();
                    a(fVar);
                } catch (Exception e3) {
                    e2 = e3;
                    Logger.e(f61236a, "Failed to download configuration", e2);
                    this.f61239d.b(e2.getMessage());
                    if (i2 < 2 && a(e2)) {
                        int iA = a(i2);
                        try {
                            Logger.d(f61236a, "Next retry in ", Integer.valueOf(iA), " ms");
                            Thread.sleep(iA);
                        } catch (InterruptedException e4) {
                            Logger.e(f61236a, "Thread interrupted while sleeping: ", e4);
                            Thread.currentThread().interrupt();
                        }
                        if (fVar != null) {
                            fVar.d();
                        }
                        fVar2 = fVar;
                    } else if (fVar == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Logger.e(f61236a, "Caught exception", th);
                        new CrashReporter().caughtException(th);
                        if (fVar != null) {
                        }
                        fVar2 = fVar;
                    } finally {
                        if (fVar != null) {
                            fVar.d();
                        }
                    }
                }
            } catch (Exception e5) {
                fVar = fVar2;
                e2 = e5;
            } catch (Throwable th3) {
                fVar = fVar2;
                th = th3;
            }
            return;
        }
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C.UTF8_NAME);
            char[] cArr = new char[65536];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    break;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            Logger.e(f61236a, "Failed to read configuration from input stream", e2);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int a(f fVar) throws IOException {
        int iB = fVar.b();
        Logger.d(f61236a, "response code = ", Integer.valueOf(iB));
        InputStream inputStreamE = null;
        try {
            if (iB < 300) {
                try {
                    inputStreamE = fVar.e();
                    String strA = a(inputStreamE);
                    Logger.d(f61236a, "response = ", strA);
                    this.f61239d.a(strA, b(fVar));
                } catch (IOException e2) {
                    Logger.e(f61236a, "Failed to get response from server", e2);
                    this.f61239d.a("Failed to read data from connection");
                    return iB;
                } catch (Throwable th) {
                    Logger.e(f61236a, "Caught exception", th);
                    new CrashReporter().caughtException(th);
                    if (inputStreamE != null) {
                    }
                    return iB;
                }
            } else {
                if (iB != 304) {
                    InputStream inputStreamG = fVar.g();
                    String strA2 = a(inputStreamG);
                    this.f61239d.a(strA2);
                    if (inputStreamG != null) {
                        inputStreamG.close();
                    }
                    throw new HttpRetryException(strA2, iB);
                }
                this.f61239d.a(null, b(fVar));
            }
            return iB;
        } finally {
            if (inputStreamE != null) {
                inputStreamE.close();
            }
        }
    }

    private int a(int i2) {
        return f61238c[i2];
    }

    private boolean a(Exception exc) {
        if (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) {
            return false;
        }
        return true;
    }

    private String b(f fVar) {
        return fVar.b("ETag");
    }
}
