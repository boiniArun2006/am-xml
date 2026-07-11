package QNA;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class afx {
    static final String KN;
    private static final Map Uo;
    private final h1M.aC J2 = h1M.aC.f67946n;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final F5.aC f8090O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8091n;
    private final AVk.Ml nr;
    private final iwV rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f8092t;

    private DAz.I28.Ml.j.n.AbstractC1198I28 aYN(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return ViF(thread, stackTraceElementArr, 0);
    }

    private DAz.I28.Ml.j.n.w6 az(AVk.I28 i28, int i2, int i3) {
        return ty(i28, i2, i3, 0);
    }

    static {
        HashMap map = new HashMap();
        Uo = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        KN = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.4");
    }

    private static long J2(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    private static int Uo() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) Uo.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private DAz.I28.w6 XQ() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iUo = Uo();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jRl = Dsr.rl(this.f8091n);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zAYN = Dsr.aYN();
        int iQie = Dsr.qie();
        String str = Build.MANUFACTURER;
        return DAz.I28.w6.n().rl(iUo).J2(Build.MODEL).t(iAvailableProcessors).KN(jRl).nr(blockCount).xMQ(zAYN).mUb(iQie).O(str).Uo(Build.PRODUCT).n();
    }

    private DAz.I28.Ml.j.w6 g(DAz.j jVar) {
        return this.J2.n(jVar.O(), jVar.nr(), jVar.t());
    }

    private DAz.I28.Ml.j mUb(int i2, AVk.I28 i28, Thread thread, int i3, int i5, boolean z2) {
        Boolean boolValueOf;
        DAz.I28.Ml.j.w6 w6VarO = this.J2.O(this.f8091n);
        if (w6VarO.rl() > 0) {
            boolValueOf = Boolean.valueOf(w6VarO.rl() != 100);
        } else {
            boolValueOf = null;
        }
        return DAz.I28.Ml.j.n().t(boolValueOf).nr(w6VarO).rl(this.J2.nr(this.f8091n)).KN(i2).J2(HI(i28, thread, i3, i5, z2)).n();
    }

    private DAz.j n(DAz.j jVar) {
        List listUnmodifiableList;
        if (!this.f8090O.rl().rl.f2505t || this.f8092t.f8124t.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Wre wre : this.f8092t.f8124t) {
                arrayList.add(DAz.j.AbstractC1210j.n().nr(wre.t()).rl(wre.n()).t(wre.rl()).n());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return DAz.j.n().t(jVar.t()).O(jVar.O()).Uo(jVar.Uo()).xMQ(jVar.xMQ()).nr(jVar.nr()).J2(jVar.J2()).KN(jVar.KN()).mUb(jVar.mUb()).rl(listUnmodifiableList).n();
    }

    private List nY(AVk.I28 i28, Thread thread, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ViF(thread, i28.f79t, i2));
        if (z2) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(aYN(key, this.nr.n(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private DAz.I28.Ml.w6 qie(int i2) {
        I28 i28N = I28.n(this.f8091n);
        Float fRl = i28N.rl();
        Double dValueOf = fRl != null ? Double.valueOf(fRl.doubleValue()) : null;
        int iT = i28N.t();
        boolean zTy = Dsr.ty(this.f8091n);
        return DAz.I28.Ml.w6.n().rl(dValueOf).t(iT).J2(zTy).O(i2).Uo(J2(Dsr.rl(this.f8091n) - Dsr.n(this.f8091n))).nr(Dsr.t(Environment.getDataDirectory().getPath())).n();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(Ik(stackTraceElement, DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.n().t(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private DAz.I28.Ml.j.n.w6 ty(AVk.I28 i28, int i2, int i3, int i5) {
        String str = i28.rl;
        String str2 = i28.f78n;
        StackTraceElement[] stackTraceElementArr = i28.f79t;
        int i7 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        AVk.I28 i282 = i28.nr;
        if (i5 >= i3) {
            AVk.I28 i283 = i282;
            while (i283 != null) {
                i283 = i283.nr;
                i7++;
            }
        }
        DAz.I28.Ml.j.n.w6.AbstractC1207j abstractC1207jNr = DAz.I28.Ml.j.n.w6.n().J2(str).O(str2).t(r(stackTraceElementArr, i2)).nr(i7);
        if (i282 != null && i7 == 0) {
            abstractC1207jNr.rl(ty(i282, i2, i3, i5 + 1));
        }
        return abstractC1207jNr.n();
    }

    public DAz.I28.Ml nr(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z2) {
        int i5 = this.f8091n.getResources().getConfiguration().orientation;
        return DAz.I28.Ml.n().Uo(str).J2(j2).rl(mUb(i5, AVk.I28.n(th, this.nr), thread, i2, i3, z2)).t(qie(i5)).n();
    }

    public DAz.I28.Ml t(DAz.j jVar) {
        int i2 = this.f8091n.getResources().getConfiguration().orientation;
        return DAz.I28.Ml.n().Uo("anr").J2(jVar.xMQ()).rl(gh(i2, n(jVar))).t(qie(i2)).n();
    }

    public afx(Context context, iwV iwv, j jVar, AVk.Ml ml, F5.aC aCVar) {
        this.f8091n = context;
        this.rl = iwv;
        this.f8092t = jVar;
        this.nr = ml;
        this.f8090O = aCVar;
    }

    private DAz.I28.Ml.j.n HI(AVk.I28 i28, Thread thread, int i2, int i3, boolean z2) {
        return DAz.I28.Ml.j.n.n().J2(nY(i28, thread, i2, z2)).nr(az(i28, i2, i3)).O(WPU()).t(xMQ()).n();
    }

    private DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n Ik(StackTraceElement stackTraceElement, DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j abstractC1201j) {
        long jMax;
        long lineNumber = 0;
        if (stackTraceElement.isNativeMethod()) {
            jMax = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            jMax = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC1201j.O(jMax).J2(str).rl(fileName).nr(lineNumber).n();
    }

    private DAz.I28.Ml.j.n.AbstractC1204j KN() {
        return DAz.I28.Ml.j.n.AbstractC1204j.n().rl(0L).nr(0L).t(this.f8092t.f8122O).O(this.f8092t.rl).n();
    }

    private DAz.I28.AbstractC1194I28 S() {
        return DAz.I28.AbstractC1194I28.n().nr(3).O(Build.VERSION.RELEASE).rl(Build.VERSION.CODENAME).t(Dsr.ViF()).n();
    }

    private DAz.I28.Ml.j.n.AbstractC1198I28 ViF(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return DAz.I28.Ml.j.n.AbstractC1198I28.n().nr(thread.getName()).t(i2).rl(r(stackTraceElementArr, i2)).n();
    }

    private DAz.I28.Ml.j.n.AbstractC1202Ml WPU() {
        return DAz.I28.Ml.j.n.AbstractC1202Ml.n().nr("0").t("0").rl(0L).n();
    }

    private DAz.I28 Z(String str, long j2) {
        return DAz.I28.n().az(j2).mUb(str).KN(KN).rl(o()).qie(S()).O(XQ()).xMQ(3).n();
    }

    private DAz.I28.Ml.j.n ck(DAz.j jVar) {
        return DAz.I28.Ml.j.n.n().rl(jVar).O(WPU()).t(xMQ()).n();
    }

    private DAz.I28.Ml.j gh(int i2, DAz.j jVar) {
        boolean z2;
        if (jVar.t() != 100) {
            z2 = true;
        } else {
            z2 = false;
        }
        return DAz.I28.Ml.j.n().t(Boolean.valueOf(z2)).nr(g(jVar)).KN(i2).J2(ck(jVar)).n();
    }

    private DAz.I28.j o() {
        return DAz.I28.j.n().O(this.rl.J2()).Uo(this.f8092t.J2).nr(this.f8092t.Uo).J2(this.rl.n().t()).rl(this.f8092t.KN.nr()).t(this.f8092t.KN.O()).n();
    }

    private DAz.n rl() {
        return tq6.DAz.rl().qie("19.4.4").KN(this.f8092t.f8123n).xMQ(this.rl.n().t()).Uo(this.rl.n().O()).J2(this.rl.n().nr()).nr(this.f8092t.J2).O(this.f8092t.Uo).gh(4);
    }

    private List xMQ() {
        return Collections.singletonList(KN());
    }

    public tq6.DAz O(String str, long j2) {
        return rl().az(Z(str, j2)).n();
    }
}
