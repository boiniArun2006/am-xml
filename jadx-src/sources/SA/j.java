package SA;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static boolean n(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zRl = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zRl &= rl(file2);
            }
        }
        return zRl;
    }

    public static boolean rl(File file) {
        if (file.isDirectory()) {
            n(file);
        }
        return file.delete();
    }

    public static void t(File file, n nVar) {
        nVar.t(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    t(file2, nVar);
                } else {
                    nVar.rl(file2);
                }
            }
        }
        nVar.n(file);
    }
}
