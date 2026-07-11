package E8K;

import F5.aC;
import IRN.eO;
import QNA.Z;
import QNA.qz;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.analytics.events.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f2255n = new AtomicInteger(0);
    private final qz nr;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final aC f2256t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Charset f2254O = Charset.forName(C.UTF8_NAME);
    private static final int J2 = 15;
    private static final DMw.aC Uo = new DMw.aC();
    private static final Comparator KN = new Comparator() { // from class: E8K.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };
    private static final FilenameFilter xMQ = new FilenameFilter() { // from class: E8K.n
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(a.f62811a);
        }
    };

    private static String HI(String str) {
        return str.substring(0, J2);
    }

    private static void E2(File file, String str, long j2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2254O);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(KN(j2));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long KN(long j2) {
        return j2 * 1000;
    }

    private SortedSet O(String str) {
        this.rl.nr();
        SortedSet sortedSetCk = ck();
        if (str != null) {
            sortedSetCk.remove(str);
        }
        if (sortedSetCk.size() > 8) {
            while (sortedSetCk.size() > 8) {
                String str2 = (String) sortedSetCk.last();
                h1M.CN3.J2().rl("Removing session over cap: " + str2);
                this.rl.O(str2);
                sortedSetCk.remove(str2);
            }
        }
        return sortedSetCk;
    }

    private void Uo() {
        int i2 = this.f2256t.rl().f2502n.rl;
        List listTy = ty();
        int size = listTy.size();
        if (size <= i2) {
            return;
        }
        Iterator it = listTy.subList(i2, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String ViF(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f2254O);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Z(File file, String str) {
        return str.startsWith(a.f62811a) && !str.endsWith("_");
    }

    private static String az(int i2, boolean z2) {
        return a.f62811a + String.format(Locale.US, "%010d", Integer.valueOf(i2)) + (z2 ? "_" : "");
    }

    private static void fD(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2254O);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void g(String str, long j2) {
        boolean z2;
        List<File> listR = this.rl.r(str, xMQ);
        if (listR.isEmpty()) {
            h1M.CN3.J2().xMQ("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z2 = false;
            for (File file : listR) {
                try {
                    arrayList.add(Uo.mUb(ViF(file)));
                } catch (IOException e2) {
                    h1M.CN3.J2().qie("Could not add event to report for " + file, e2);
                }
                if (z2 || o(file.getName())) {
                    z2 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            te(this.rl.Ik(str, CrashEvent.f62786e), arrayList, j2, z2, eO.qie(str, this.rl), this.nr.nr(str));
        } else {
            h1M.CN3.J2().gh("Could not parse event files for session " + str);
        }
    }

    private int iF(String str, int i2) {
        List listR = this.rl.r(str, new FilenameFilter() { // from class: E8K.w6
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return I28.Z(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: E8K.Ml
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return I28.S((File) obj, (File) obj2);
            }
        });
        return J2(listR, i2);
    }

    private void nY(File file, DAz.Ml ml, String str, DAz.j jVar) {
        String strNr = this.nr.nr(str);
        try {
            DMw.aC aCVar = Uo;
            fD(this.rl.xMQ(str), aCVar.v(aCVar.wTp(ViF(file)).XQ(ml).Ik(jVar).ck(strNr)));
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Could not synthesize final native report file for " + file, e2);
        }
    }

    private static boolean o(String str) {
        return str.startsWith(a.f62811a) && str.endsWith("_");
    }

    private void te(File file, List list, long j2, boolean z2, String str, String str2) {
        try {
            DMw.aC aCVar = Uo;
            DAz dAzR = aCVar.wTp(ViF(file)).S(j2, z2, str).ck(str2).r(list);
            DAz.I28 i28Ty = dAzR.ty();
            if (i28Ty == null) {
                return;
            }
            h1M.CN3.J2().rl("appQualitySessionId: " + str2);
            fD(z2 ? this.rl.qie(i28Ty.xMQ()) : this.rl.ty(i28Ty.xMQ()), aCVar.v(dAzR));
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Could not synthesize final report file for " + file, e2);
        }
    }

    private List ty() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.rl.az());
        arrayList.addAll(this.rl.mUb());
        Comparator comparator = KN;
        Collections.sort(arrayList, comparator);
        List listHI = this.rl.HI();
        Collections.sort(listHI, comparator);
        arrayList.addAll(listHI);
        return arrayList;
    }

    public long Ik(String str) {
        return this.rl.Ik(str, "start-time").lastModified();
    }

    public void WPU(DAz.I28.Ml ml, String str, boolean z2) {
        int i2 = this.f2256t.rl().f2502n.f2506n;
        try {
            fD(this.rl.Ik(str, az(this.f2255n.getAndIncrement(), z2)), Uo.gh(ml));
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Could not persist event for session " + str, e2);
        }
        iF(str, i2);
    }

    public SortedSet ck() {
        return new TreeSet(this.rl.J2()).descendingSet();
    }

    public void qie(String str, DAz.Ml ml, DAz.j jVar) {
        File fileIk = this.rl.Ik(str, CrashEvent.f62786e);
        h1M.CN3.J2().rl("Writing native session report for " + str + " to file: " + fileIk);
        nY(fileIk, ml, str, jVar);
    }

    public boolean r() {
        return (this.rl.HI().isEmpty() && this.rl.az().isEmpty() && this.rl.mUb().isEmpty()) ? false : true;
    }

    public void xMQ() {
        mUb(this.rl.HI());
        mUb(this.rl.az());
        mUb(this.rl.mUb());
    }

    public I28(CN3 cn3, aC aCVar, qz qzVar) {
        this.rl = cn3;
        this.f2256t = aCVar;
        this.nr = qzVar;
    }

    private static int J2(List list, int i2) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i2) {
                break;
            }
            CN3.XQ(file);
            size--;
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int S(File file, File file2) {
        return HI(file.getName()).compareTo(HI(file2.getName()));
    }

    private void mUb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public List XQ() {
        List<File> listTy = ty();
        ArrayList arrayList = new ArrayList();
        for (File file : listTy) {
            try {
                arrayList.add(Z.n(Uo.wTp(ViF(file)), file.getName(), file));
            } catch (IOException e2) {
                h1M.CN3.J2().qie("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void aYN(DAz dAz) {
        DAz.I28 i28Ty = dAz.ty();
        if (i28Ty == null) {
            h1M.CN3.J2().rl("Could not get session for report");
            return;
        }
        String strXMQ = i28Ty.xMQ();
        try {
            fD(this.rl.Ik(strXMQ, CrashEvent.f62786e), Uo.v(dAz));
            E2(this.rl.Ik(strXMQ, "start-time"), "", i28Ty.qie());
        } catch (IOException e2) {
            h1M.CN3.J2().t("Could not persist report for session " + strXMQ, e2);
        }
    }

    public void gh(String str, long j2) {
        for (String str2 : O(str)) {
            h1M.CN3.J2().xMQ("Finalizing report for session " + str2);
            g(str2, j2);
            this.rl.O(str2);
        }
        Uo();
    }
}
