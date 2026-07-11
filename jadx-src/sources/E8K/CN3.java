package E8K;

import QNA.Dsr;
import android.content.Context;
import h1M.aC;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CN3 {
    private final File J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final File f2251O;
    private final File Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f2252n;
    private final File nr;
    private final File rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final File f2253t;

    private static List S(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    private boolean aYN() {
        return !this.f2252n.isEmpty();
    }

    private File ck(String str) {
        return Z(new File(this.nr, str));
    }

    private static synchronized File o(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                h1M.CN3.J2().rl("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                h1M.CN3.J2().nr("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void rl(String str) {
        File file = new File(this.rl, str);
        if (file.exists() && XQ(file)) {
            h1M.CN3.J2().rl("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void t(final String str) {
        String[] list;
        if (!this.rl.exists() || (list = this.rl.list(new FilenameFilter() { // from class: E8K.Wre
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            rl(str2);
        }
    }

    public List HI() {
        return S(this.f2251O.listFiles());
    }

    public File Ik(String str, String str2) {
        return new File(ck(str), str2);
    }

    public List J2() {
        return S(this.nr.list());
    }

    public List KN(FilenameFilter filenameFilter) {
        return S(this.f2253t.listFiles(filenameFilter));
    }

    public boolean O(String str) {
        return XQ(new File(this.nr, str));
    }

    public File Uo(String str) {
        return new File(this.f2253t, str);
    }

    public List az() {
        return S(this.J2.listFiles());
    }

    public File gh(String str) {
        return Z(new File(ck(str), "native"));
    }

    public List mUb() {
        return S(this.Uo.listFiles());
    }

    public void nr() {
        rl(".com.google.firebase.crashlytics");
        rl(".com.google.firebase.crashlytics-ndk");
        if (aYN()) {
            rl(".com.google.firebase.crashlytics.files.v1");
            t(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public File qie(String str) {
        return new File(this.J2, str);
    }

    public File ty(String str) {
        return new File(this.f2251O, str);
    }

    public File xMQ(String str) {
        return new File(this.Uo, str);
    }

    public CN3(Context context) {
        String str;
        String strNr = aC.f67946n.O(context).nr();
        this.f2252n = strNr;
        File filesDir = context.getFilesDir();
        this.rl = filesDir;
        if (aYN()) {
            str = ".crashlytics.v3" + File.separator + WPU(strNr);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileO = o(new File(filesDir, str));
        this.f2253t = fileO;
        this.nr = o(new File(fileO, "open-sessions"));
        this.f2251O = o(new File(fileO, "reports"));
        this.J2 = o(new File(fileO, "priority-reports"));
        this.Uo = o(new File(fileO, "native-reports"));
    }

    static String WPU(String str) {
        if (str.length() > 40) {
            return Dsr.g(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    static boolean XQ(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                XQ(file2);
            }
        }
        return file.delete();
    }

    private static File Z(File file) {
        file.mkdirs();
        return file;
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return S(ck(str).listFiles(filenameFilter));
    }
}
