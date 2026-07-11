package QNA;

import QNA.Ew;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import tq6.DAz;
import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class eO {
    private final iwV J2;
    private final QNA.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Zlm.Wre f8100O;
    private final E8K.CN3 Uo;
    private final P az;
    private final YSF.j gh;
    private final h1M.j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8101n;
    private final IRN.eO nr;
    private final qz qie;
    private final DAz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g9s f8104t;
    private Ew ty;
    private final IRN.Wre xMQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final FilenameFilter f8099Z = new FilenameFilter() { // from class: QNA.Xo
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    private static final Charset XQ = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    private F5.aC HI = null;
    final TaskCompletionSource ck = new TaskCompletionSource();
    final TaskCompletionSource Ik = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final TaskCompletionSource f8103r = new TaskCompletionSource();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final AtomicBoolean f8102o = new AtomicBoolean(false);

    class I28 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f8105n;

        I28(long j2) {
            this.f8105n = j2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(StatsEvent.f62824A, this.f8105n);
            eO.this.gh.n("_ae", bundle);
            return null;
        }
    }

    class Ml implements SuccessContinuation {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Task f8106n;

        class j implements SuccessContinuation {
            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Task then(F5.Ml ml) {
                if (ml == null) {
                    h1M.CN3.J2().gh("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                eO.this.rV9();
                eO.this.az.ViF(eO.this.f8100O.f12590n);
                eO.this.f8103r.trySetResult(null);
                return Tasks.forResult(null);
            }

            j() {
            }
        }

        Ml(Task task) {
            this.f8106n = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            if (!bool.booleanValue()) {
                h1M.CN3.J2().xMQ("Deleting cached crash reports...");
                eO.r(eO.this.wTp());
                eO.this.az.aYN();
                eO.this.f8103r.trySetResult(null);
                return Tasks.forResult(null);
            }
            h1M.CN3.J2().rl("Sending cached crash reports...");
            eO.this.rl.t(bool.booleanValue());
            return this.f8106n.onSuccessTask(eO.this.f8100O.f12590n, new j());
        }
    }

    class j implements Ew.j {
        j() {
        }

        @Override // QNA.Ew.j
        public void n(F5.aC aCVar, Thread thread, Throwable th) throws Throwable {
            eO.this.N(aCVar, thread, th);
        }
    }

    class n implements Callable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f8109O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f8110n;
        final /* synthetic */ F5.aC nr;
        final /* synthetic */ Throwable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Thread f8111t;

        class j implements SuccessContinuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f8112n;

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Task then(F5.Ml ml) {
                if (ml != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{eO.this.rV9(), eO.this.az.nY(eO.this.f8100O.f12590n, n.this.f8109O ? this.f8112n : null)});
                }
                h1M.CN3.J2().gh("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }

            j(String str) {
                this.f8112n = str;
            }
        }

        n(long j2, Throwable th, Thread thread, F5.aC aCVar, boolean z2) {
            this.f8110n = j2;
            this.rl = th;
            this.f8111t = thread;
            this.nr = aCVar;
            this.f8109O = z2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long jX = eO.X(this.f8110n);
            String strIF = eO.this.iF();
            if (strIF == null) {
                h1M.CN3.J2().nr("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            eO.this.f8104t.n();
            eO.this.az.XQ(this.rl, this.f8111t, strIF, jX);
            eO.this.aYN(this.f8110n);
            eO.this.XQ(this.nr);
            eO.this.WPU(new fuX().t(), Boolean.valueOf(this.f8109O));
            return !eO.this.rl.nr() ? Tasks.forResult(null) : this.nr.n().onSuccessTask(eO.this.f8100O.f12590n, new j(strIF));
        }
    }

    class w6 implements SuccessContinuation {
        w6() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Task then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    private static vd Xw(h1M.fuX fux) {
        File fileT = fux.t();
        return (fileT == null || !fileT.exists()) ? new CN3("minidump_file", "minidump", new byte[]{0}) : new Ln("minidump_file", "minidump", fileT);
    }

    void N(F5.aC aCVar, Thread thread, Throwable th) throws Throwable {
        nHg(aCVar, thread, th, false);
    }

    void XQ(F5.aC aCVar) {
        S(false, aCVar, false);
    }

    synchronized void nHg(F5.aC aCVar, Thread thread, Throwable th, boolean z2) throws Throwable {
        try {
            try {
                h1M.CN3.J2().rl("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                Task taskO = this.f8100O.f12590n.O(new n(System.currentTimeMillis(), th, thread, aCVar, z2));
                if (!z2) {
                    try {
                        try {
                            yg.rl(taskO);
                        } catch (TimeoutException unused) {
                            h1M.CN3.J2().nr("Cannot send reports. Timed out while fetching settings.");
                        }
                    } catch (Exception e2) {
                        h1M.CN3.J2().O("Error handling uncaught exception", e2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    private void B(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            h1M.CN3.J2().xMQ("ANR feature enabled, but device is API " + i2);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f8101n.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.az.WPU(str, historicalProcessExitReasons, new IRN.Wre(this.Uo, str), IRN.eO.gh(str, this.Uo, this.f8100O));
        } else {
            h1M.CN3.J2().xMQ("No ApplicationExitInfo available. Session: " + str);
        }
    }

    static List E2(h1M.fuX fux, String str, E8K.CN3 cn3, byte[] bArr) {
        File fileIk = cn3.Ik(str, "user-data");
        File fileIk2 = cn3.Ik(str, IV8ValueMap.FUNCTION_KEYS);
        File fileIk3 = cn3.Ik(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CN3("logs_file", "logs", bArr));
        arrayList.add(new Ln("crash_meta_file", TtmlNode.TAG_METADATA, fux.nr()));
        arrayList.add(new Ln("session_meta_file", "session", fux.Uo()));
        arrayList.add(new Ln("app_meta_file", PangleCreativeInfo.f62498a, fux.O()));
        arrayList.add(new Ln("device_meta_file", "device", fux.n()));
        arrayList.add(new Ln("os_meta_file", "os", fux.J2()));
        arrayList.add(Xw(fux));
        arrayList.add(new Ln("user_meta_file", "user", fileIk));
        arrayList.add(new Ln("keys_file", IV8ValueMap.FUNCTION_KEYS, fileIk2));
        arrayList.add(new Ln("rollouts_file", "rollouts", fileIk3));
        return arrayList;
    }

    private Task FX() {
        if (this.rl.nr()) {
            h1M.CN3.J2().rl("Automatic data collection is enabled. Allowing upload.");
            this.ck.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        h1M.CN3.J2().rl("Automatic data collection is disabled.");
        h1M.CN3.J2().xMQ("Notifying that unsent reports are available.");
        this.ck.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.rl.mUb().onSuccessTask(new w6());
        h1M.CN3.J2().rl("Waiting for send/deleteUnsentReports to be called.");
        return Zlm.n.rl(taskOnSuccessTask, this.Ik.getTask());
    }

    private static u.w6 Ik() {
        return u.w6.n(Build.VERSION.RELEASE, Build.VERSION.CODENAME, Dsr.ViF());
    }

    private static byte[] U(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static long X(long j2) {
        return j2 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aYN(long j2) {
        try {
            if (this.Uo.Uo(".ae" + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Could not create app exception marker file.", e2);
        }
    }

    private static boolean bzg(String str, File file, DAz.j jVar) {
        if (file == null || !file.exists()) {
            h1M.CN3.J2().gh("No minidump data found for session " + str);
        }
        if (jVar == null) {
            h1M.CN3.J2().Uo("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && jVar == null;
    }

    private static u.n ck(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return u.n.t(Dsr.gh(), Build.MODEL, Runtime.getRuntime().availableProcessors(), Dsr.rl(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), Dsr.aYN(), Dsr.qie(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String iF() {
        SortedSet sortedSetIk = this.az.Ik();
        if (sortedSetIk.isEmpty()) {
            return null;
        }
        return (String) sortedSetIk.first();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task rV9() {
        ArrayList arrayList = new ArrayList();
        for (File file : wTp()) {
            try {
                arrayList.add(v(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                h1M.CN3.J2().gh("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean te() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(String str) {
        this.nr.Ik(str);
    }

    void M(Task task) {
        if (this.az.ck()) {
            h1M.CN3.J2().xMQ("Crash reports are available to be sent.");
            FX().onSuccessTask(this.f8100O.f12590n, new Ml(task));
        } else {
            h1M.CN3.J2().xMQ("No crash reports are available to be sent.");
            this.ck.trySetResult(Boolean.FALSE);
        }
    }

    Task M7() {
        this.Ik.trySetResult(Boolean.TRUE);
        return this.f8103r.getTask();
    }

    String T() throws IOException {
        String strR = Dsr.r(this.f8101n);
        if (strR != null) {
            h1M.CN3.J2().rl("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(XQ), 0);
        }
        InputStream inputStreamE = e("META-INF/version-control-info.textproto");
        if (inputStreamE == null) {
            if (inputStreamE != null) {
                inputStreamE.close();
            }
            h1M.CN3.J2().Uo("No version control information found");
            return null;
        }
        try {
            h1M.CN3.J2().rl("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(U(inputStreamE), 0);
            inputStreamE.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    void ViF(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, F5.aC aCVar) {
        this.HI = aCVar;
        jB(str);
        Ew ew = new Ew(new j(), aCVar, uncaughtExceptionHandler, this.mUb);
        this.ty = ew;
        Thread.setDefaultUncaughtExceptionHandler(ew);
    }

    void eF(String str, String str2) {
        try {
            this.nr.HI(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.f8101n;
            if (context != null && Dsr.S(context)) {
                throw e2;
            }
            h1M.CN3.J2().nr("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void jB(final String str) {
        this.f8100O.f12590n.nr(new Runnable() { // from class: QNA.Pl
            @Override // java.lang.Runnable
            public final void run() {
                this.f8076n.WPU(str, Boolean.FALSE);
            }
        });
    }

    Task o() {
        this.Ik.trySetResult(Boolean.FALSE);
        return this.f8103r.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p5(String str, String str2) {
        try {
            this.nr.ty(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.f8101n;
            if (context != null && Dsr.S(context)) {
                throw e2;
            }
            h1M.CN3.J2().nr("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    boolean s7N() {
        Ew ew = this.ty;
        return ew != null && ew.n();
    }

    Task ty() {
        if (this.f8102o.compareAndSet(false, true)) {
            return this.ck.getTask();
        }
        h1M.CN3.J2().gh("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    List wTp() {
        return this.Uo.KN(f8099Z);
    }

    eO(Context context, iwV iwv, DAz dAz, E8K.CN3 cn3, g9s g9sVar, QNA.j jVar, IRN.eO eOVar, IRN.Wre wre, P p2, h1M.j jVar2, YSF.j jVar3, qz qzVar, Zlm.Wre wre2) {
        this.f8101n = context;
        this.J2 = iwv;
        this.rl = dAz;
        this.Uo = cn3;
        this.f8104t = g9sVar;
        this.KN = jVar;
        this.nr = eOVar;
        this.xMQ = wre;
        this.mUb = jVar2;
        this.gh = jVar3;
        this.qie = qzVar;
        this.az = p2;
        this.f8100O = wre2;
    }

    private static u.j HI(iwV iwv, QNA.j jVar) {
        return u.j.rl(iwv.J2(), jVar.J2, jVar.Uo, iwv.n().t(), u.rl(jVar.nr).t(), jVar.KN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void S(boolean z2, F5.aC aCVar, boolean z3) {
        String str;
        Zlm.Wre.t();
        ArrayList arrayList = new ArrayList(this.az.Ik());
        if (arrayList.size() <= z2) {
            h1M.CN3.J2().xMQ("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z2 ? 1 : 0);
        if (z3 && aCVar.rl().rl.rl) {
            B(str2);
        } else {
            h1M.CN3.J2().xMQ("ANR feature disabled.");
        }
        if (z3 && this.mUb.t(str2)) {
            nY(str2);
        }
        if (z2 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.qie.O(null);
            str = null;
        }
        this.az.az(fD(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WPU(String str, Boolean bool) {
        long jFD = fD();
        h1M.CN3.J2().rl("Opening a new session with ID " + str);
        this.mUb.nr(str, String.format(Locale.US, "Crashlytics Android SDK/%s", ci.Ik()), jFD, tq6.u.rl(HI(this.J2, this.KN), Ik(), ck(this.f8101n)));
        if (bool.booleanValue() && str != null) {
            this.nr.ck(str);
        }
        this.xMQ.O(str);
        this.qie.O(str);
        this.az.r(str, jFD);
    }

    private InputStream e(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            h1M.CN3.J2().gh("Couldn't get Class Loader");
            return null;
        }
        return classLoader.getResourceAsStream(str);
    }

    private static long fD() {
        return X(System.currentTimeMillis());
    }

    private void nY(String str) {
        h1M.CN3.J2().xMQ("Finalizing native report for session " + str);
        h1M.fuX fuxN = this.mUb.n(str);
        File fileT = fuxN.t();
        DAz.j jVarRl = fuxN.rl();
        if (bzg(str, fileT, jVarRl)) {
            h1M.CN3.J2().gh("No native core present");
            return;
        }
        long jLastModified = fileT.lastModified();
        IRN.Wre wre = new IRN.Wre(this.Uo, str);
        File fileGh = this.Uo.gh(str);
        if (!fileGh.isDirectory()) {
            h1M.CN3.J2().gh("Couldn't create directory to store native session files, aborting.");
            return;
        }
        aYN(jLastModified);
        List listE2 = E2(fuxN, str, this.Uo, wre.rl());
        Lu.rl(fileGh, listE2);
        h1M.CN3.J2().rl("CrashlyticsController#finalizePreviousNativeSession");
        this.az.qie(str, listE2, jVarRl);
        wre.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private Task v(long j2) {
        if (te()) {
            h1M.CN3.J2().gh("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        h1M.CN3.J2().rl("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new I28(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(long j2, String str) {
        if (!s7N()) {
            this.xMQ.Uo(j2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Thread thread, Throwable th, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!s7N()) {
            long jX = X(jCurrentTimeMillis);
            String strIF = iF();
            if (strIF == null) {
                h1M.CN3.J2().gh("Tried to write a non-fatal exception while no session was open.");
            } else {
                this.az.S(th, thread, new IRN.w6(strIF, jX, map));
            }
        }
    }

    void P5() {
        try {
            String strT = T();
            if (strT != null) {
                eF("com.crashlytics.version-control-info", strT);
                h1M.CN3.J2().Uo("Saved version control info");
            }
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Unable to save version control info", e2);
        }
    }

    boolean Z() {
        Zlm.Wre.t();
        if (!this.f8104t.t()) {
            String strIF = iF();
            if (strIF != null && this.mUb.t(strIF)) {
                return true;
            }
            return false;
        }
        h1M.CN3.J2().xMQ("Found previous crash marker.");
        this.f8104t.nr();
        return true;
    }

    boolean g(F5.aC aCVar) {
        Zlm.Wre.t();
        if (s7N()) {
            h1M.CN3.J2().gh("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        h1M.CN3.J2().xMQ("Finalizing previously open sessions.");
        try {
            S(true, aCVar, true);
            h1M.CN3.J2().xMQ("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            h1M.CN3.J2().O("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
