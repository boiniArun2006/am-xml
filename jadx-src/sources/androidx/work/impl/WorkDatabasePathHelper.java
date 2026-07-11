package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WorkDatabasePathHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42794n = Logger.J2("WrkDbPathHelper");
    private static final String[] rl = {"-journal", "-shm", "-wal"};

    public static Map J2(Context context) {
        HashMap map = new HashMap();
        File fileRl = rl(context);
        File fileN = n(context);
        map.put(fileRl, fileN);
        for (String str : rl) {
            map.put(new File(fileRl.getPath() + str), new File(fileN.getPath() + str));
        }
        return map;
    }

    public static File n(Context context) {
        return t(context, "androidx.work.workdb");
    }

    public static String nr() {
        return "androidx.work.workdb";
    }

    public static File rl(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File t(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static void O(Context context) {
        String str;
        if (rl(context).exists()) {
            Logger.t().n(f42794n, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map mapJ2 = J2(context);
            for (File file : mapJ2.keySet()) {
                File file2 = (File) mapJ2.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        Logger.t().KN(f42794n, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    if (file.renameTo(file2)) {
                        str = String.format("Migrated %s to %s", file, file2);
                    } else {
                        str = String.format("Renaming %s to %s failed", file, file2);
                    }
                    Logger.t().n(f42794n, str, new Throwable[0]);
                }
            }
        }
    }
}
