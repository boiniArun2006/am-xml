package com.google.firebase.crashlytics.ndk;

import QNA.Dsr;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.android.exoplayer2.C;
import com.google.firebase.crashlytics.ndk.Wre;
import j$.util.Base64;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import tq6.DAz;
import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j {
    private static final Charset nr = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60291n;
    private final I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final E8K.CN3 f60292t;

    private static void Ik(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), nr));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            Dsr.J2(bufferedWriter, "Failed to close " + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            Dsr.J2(bufferedWriter2, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            Dsr.J2(bufferedWriter2, "Failed to close " + file);
            throw th;
        }
    }

    private DAz.j J2(String str) {
        List historicalProcessExitReasons = ((ActivityManager) this.f60291n.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File fileIk = this.f60292t.Ik(str, "start-time");
        return Uo(fileIk == null ? System.currentTimeMillis() : fileIk.lastModified(), historicalProcessExitReasons);
    }

    private Wre.w6 O(String str, File file) {
        return new Wre.w6(KN(file, ".dmp"), t(str));
    }

    private DAz.j Uo(long j2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoN = androidx.work.impl.utils.n.n(it.next());
            if (applicationExitInfoN.getReason() == 5 && applicationExitInfoN.getTimestamp() >= j2) {
                arrayList.add(applicationExitInfoN);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return n(androidx.work.impl.utils.n.n(arrayList.get(0)));
    }

    private static String r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String rl(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    private DAz.j t(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return J2(str);
        }
        return null;
    }

    public boolean gh(String str, String str2, long j2, u uVar) throws Throwable {
        File fileGh = this.f60292t.gh(str);
        if (fileGh == null) {
            return false;
        }
        try {
            if (!this.rl.n(fileGh.getCanonicalPath(), this.f60291n.getAssets())) {
                return false;
            }
            qie(str, str2, j2);
            az(str, uVar.n());
            ck(str, uVar.nr());
            ty(str, uVar.t());
            return true;
        } catch (IOException e2) {
            h1M.CN3.J2().O("Error initializing Crashlytics NDK", e2);
            return false;
        }
    }

    public Wre nr(String str) {
        File fileGh = this.f60292t.gh(str);
        File file = new File(fileGh, "pending");
        h1M.CN3.J2().xMQ("Minidump directory: " + file.getAbsolutePath());
        File fileKN = KN(file, ".dmp");
        h1M.CN3 cn3J2 = h1M.CN3.J2();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((fileKN == null || !fileKN.exists()) ? "does not exist" : "exists");
        cn3J2.xMQ(sb.toString());
        Wre.n nVar = new Wre.n();
        if (fileGh != null && fileGh.exists() && file.exists()) {
            nVar.qie(O(str, file)).gh(KN(fileGh, ".device_info")).ty(new File(fileGh, "session.json")).KN(new File(fileGh, "app.json")).mUb(new File(fileGh, "device.json")).az(new File(fileGh, "os.json"));
        }
        return nVar.xMQ();
    }

    j(Context context, I28 i28, E8K.CN3 cn3) {
        this.f60291n = context;
        this.rl = i28;
        this.f60292t = cn3;
    }

    private static void HI(E8K.CN3 cn3, String str, String str2, String str3) throws Throwable {
        Ik(new File(cn3.gh(str), str3), str2);
    }

    private static File KN(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static DAz.j n(ApplicationExitInfo applicationExitInfo) {
        return DAz.j.n().t(applicationExitInfo.getImportance()).O(applicationExitInfo.getProcessName()).Uo(applicationExitInfo.getReason()).xMQ(applicationExitInfo.getTimestamp()).nr(applicationExitInfo.getPid()).J2(applicationExitInfo.getPss()).KN(applicationExitInfo.getRss()).mUb(xMQ(applicationExitInfo)).n();
    }

    private static String xMQ(ApplicationExitInfo applicationExitInfo) {
        try {
            return rl(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            h1M.CN3.J2().gh("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    public void az(String str, u.j jVar) throws Throwable {
        HI(this.f60292t, str, fuX.t(jVar.n(), jVar.J2(), jVar.Uo(), jVar.O(), jVar.t(), jVar.nr().nr(), jVar.nr().O()), "app.json");
    }

    public void ck(String str, u.w6 w6Var) throws Throwable {
        HI(this.f60292t, str, fuX.O(w6Var.nr(), w6Var.t(), w6Var.rl()), "os.json");
    }

    public boolean mUb(String str) {
        Wre.w6 w6Var = nr(str).f60285n;
        if (w6Var != null && w6Var.n()) {
            return true;
        }
        return false;
    }

    public void qie(String str, String str2, long j2) throws Throwable {
        HI(this.f60292t, str, fuX.rl(str, str2, j2), "session.json");
    }

    public void ty(String str, u.n nVar) throws Throwable {
        HI(this.f60292t, str, fuX.nr(nVar.n(), nVar.Uo(), nVar.rl(), nVar.mUb(), nVar.nr(), nVar.O(), nVar.xMQ(), nVar.J2(), nVar.KN()), "device.json");
    }
}
