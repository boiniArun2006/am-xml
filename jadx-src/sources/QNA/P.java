package QNA;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class P {
    private final iwV J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final IRN.eO f8073O;
    private final Zlm.Wre Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f8074n;
    private final IRN.Wre nr;
    private final E8K.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pMZ.n f8075t;

    private static DAz.j KN(ApplicationExitInfo applicationExitInfo) {
        String strXMQ = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strXMQ = xMQ(traceInputStream);
            }
        } catch (IOException e2) {
            h1M.CN3.J2().gh("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e2);
        }
        return DAz.j.n().t(applicationExitInfo.getImportance()).O(applicationExitInfo.getProcessName()).Uo(applicationExitInfo.getReason()).xMQ(applicationExitInfo.getTimestamp()).nr(applicationExitInfo.getPid()).J2(applicationExitInfo.getPss()).KN(applicationExitInfo.getRss()).mUb(strXMQ).n();
    }

    public Task ViF(Executor executor) {
        return nY(executor, null);
    }

    private static List HI(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(DAz.w6.n().rl((String) entry.getKey()).t((String) entry.getValue()).n());
        }
        Collections.sort(arrayList, new Comparator() { // from class: QNA.Zs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((DAz.w6) obj).rl().compareTo(((DAz.w6) obj2).rl());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    private DAz.I28.Ml J2(DAz.I28.Ml ml, Map map) {
        return Uo(O(ml, this.nr, this.f8073O, map), this.f8073O);
    }

    private void Z(Throwable th, Thread thread, String str, final IRN.w6 w6Var, boolean z2) {
        final boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final DAz.I28.Ml mlJ2 = J2(this.f8074n.nr(th, thread, str, w6Var.t(), 4, 8, z2), w6Var.n());
        if (z2) {
            this.rl.WPU(mlJ2, w6Var.rl(), zEquals);
        } else {
            this.Uo.rl.nr(new Runnable() { // from class: QNA.psW
                @Override // java.lang.Runnable
                public final void run() {
                    P.n(this.f8135n, mlJ2, w6Var, zEquals);
                }
            });
        }
    }

    public static P mUb(Context context, iwV iwv, E8K.CN3 cn3, j jVar, IRN.Wre wre, IRN.eO eOVar, AVk.Ml ml, F5.aC aCVar, h hVar, qz qzVar, Zlm.Wre wre2) {
        return new P(new afx(context, iwv, jVar, ml, aCVar), new E8K.I28(cn3, aCVar, qzVar), pMZ.n.rl(context, aCVar, hVar), wre, eOVar, iwv, wre2);
    }

    private DAz.I28.Ml nr(DAz.I28.Ml ml, IRN.Wre wre, IRN.eO eOVar) {
        return O(ml, wre, eOVar, Collections.EMPTY_MAP);
    }

    private ApplicationExitInfo ty(String str, List list) {
        long jIk = this.rl.Ik(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoN = androidx.work.impl.utils.n.n(it.next());
            if (applicationExitInfoN.getTimestamp() < jIk) {
                return null;
            }
            if (applicationExitInfoN.getReason() == 6) {
                return applicationExitInfoN;
            }
        }
        return null;
    }

    public static String xMQ(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i2 = bufferedInputStream.read(bArr);
            if (i2 == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            bufferedInputStream.close();
            throw th;
        }
    }

    public SortedSet Ik() {
        return this.rl.ck();
    }

    public void aYN() {
        this.rl.xMQ();
    }

    public void az(long j2, String str) {
        this.rl.gh(str, j2);
    }

    public boolean ck() {
        return this.rl.r();
    }

    public Task nY(Executor executor, String str) {
        List<Z> listXQ = this.rl.XQ();
        ArrayList arrayList = new ArrayList();
        for (Z z2 : listXQ) {
            if (str == null || str.equals(z2.nr())) {
                arrayList.add(this.f8075t.t(gh(z2), str != null).continueWith(executor, new Continuation() { // from class: QNA.Md
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f8072n.o(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void r(String str, long j2) {
        this.rl.aYN(this.f8074n.O(str, j2));
    }

    P(afx afxVar, E8K.I28 i28, pMZ.n nVar, IRN.Wre wre, IRN.eO eOVar, iwV iwv, Zlm.Wre wre2) {
        this.f8074n = afxVar;
        this.rl = i28;
        this.f8075t = nVar;
        this.nr = wre;
        this.f8073O = eOVar;
        this.J2 = iwv;
        this.Uo = wre2;
    }

    private DAz.I28.Ml O(DAz.I28.Ml ml, IRN.Wre wre, IRN.eO eOVar, Map map) {
        DAz.I28.Ml.n nVarKN = ml.KN();
        String strT = wre.t();
        if (strT != null) {
            nVarKN.nr(DAz.I28.Ml.AbstractC1196Ml.n().rl(strT).n());
        } else {
            h1M.CN3.J2().xMQ("No log data to include with this event.");
        }
        List listHI = HI(eOVar.Uo(map));
        List listHI2 = HI(eOVar.KN());
        if (!listHI.isEmpty() || !listHI2.isEmpty()) {
            nVarKN.rl(ml.rl().xMQ().O(listHI).Uo(listHI2).n());
        }
        return nVarKN.n();
    }

    private DAz.I28.Ml Uo(DAz.I28.Ml ml, IRN.eO eOVar) {
        List listXMQ = eOVar.xMQ();
        if (listXMQ.isEmpty()) {
            return ml;
        }
        DAz.I28.Ml.n nVarKN = ml.KN();
        nVarKN.O(DAz.I28.Ml.Wre.n().rl(listXMQ).n());
        return nVarKN.n();
    }

    private Z gh(Z z2) {
        if (z2.rl().KN() != null && z2.rl().Uo() != null) {
            return z2;
        }
        lej lejVarNr = this.J2.nr(true);
        return Z.n(z2.rl().Z(lejVarNr.rl()).o(lejVarNr.n()), z2.nr(), z2.t());
    }

    public static /* synthetic */ void n(P p2, DAz.I28.Ml ml, IRN.w6 w6Var, boolean z2) {
        p2.getClass();
        h1M.CN3.J2().rl("disk worker: log non-fatal event to persistence");
        p2.rl.WPU(ml, w6Var.rl(), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(Task task) {
        if (task.isSuccessful()) {
            Z z2 = (Z) task.getResult();
            h1M.CN3.J2().rl("Crashlytics report successfully enqueued to DataTransport: " + z2.nr());
            File fileT = z2.t();
            if (fileT.delete()) {
                h1M.CN3.J2().rl("Deleted report file: " + fileT.getPath());
                return true;
            }
            h1M.CN3.J2().gh("Crashlytics could not delete report file: " + fileT.getPath());
            return true;
        }
        h1M.CN3.J2().qie("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    public void S(Throwable th, Thread thread, IRN.w6 w6Var) {
        h1M.CN3.J2().xMQ("Persisting non-fatal event for session " + w6Var.rl());
        Z(th, thread, MRAIDPresenter.ERROR, w6Var, false);
    }

    public void WPU(String str, List list, IRN.Wre wre, IRN.eO eOVar) {
        ApplicationExitInfo applicationExitInfoTy = ty(str, list);
        if (applicationExitInfoTy == null) {
            h1M.CN3.J2().xMQ("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        DAz.I28.Ml mlT = this.f8074n.t(KN(applicationExitInfoTy));
        h1M.CN3.J2().rl("Persisting anr for session " + str);
        this.rl.WPU(Uo(nr(mlT, wre, eOVar), eOVar), str, true);
    }

    public void XQ(Throwable th, Thread thread, String str, long j2) {
        h1M.CN3.J2().xMQ("Persisting fatal event for session " + str);
        Z(th, thread, AppMeasurement.CRASH_ORIGIN, new IRN.w6(str, j2), true);
    }

    public void qie(String str, List list, DAz.j jVar) {
        h1M.CN3.J2().rl("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DAz.Ml.n nVarN = ((vd) it.next()).n();
            if (nVarN != null) {
                arrayList.add(nVarN);
            }
        }
        this.rl.qie(str, DAz.Ml.n().rl(Collections.unmodifiableList(arrayList)).n(), jVar);
    }
}
