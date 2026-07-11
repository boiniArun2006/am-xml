package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class JniNativeApi implements I28 {
    private static final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FilenameFilter f60282t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.Ml
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(".apk");
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60283n;

    public static boolean J2() {
        return true;
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    private static int nr() {
        return 9216;
    }

    static {
        boolean z2;
        try {
            System.loadLibrary("crashlytics");
            z2 = true;
        } catch (UnsatisfiedLinkError e2) {
            h1M.CN3.J2().nr("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e2.getLocalizedMessage());
            z2 = false;
        }
        rl = z2;
    }

    private static String O(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static void t(List list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", O(packageInfo)));
        if (!file.exists()) {
            h1M.CN3.J2().rl("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = file.listFiles(f60282t);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        h1M.CN3.J2().rl("Found " + fileArrListFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : fileArrListFiles) {
            h1M.CN3.J2().rl("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    public String[] Uo(String str) {
        try {
            PackageInfo packageInfo = this.f60283n.getPackageManager().getPackageInfo(this.f60283n.getPackageName(), nr());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (J2()) {
                t(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e2) {
            h1M.CN3.J2().O("Unable to compose package paths", e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.firebase.crashlytics.ndk.I28
    public boolean n(String str, AssetManager assetManager) {
        String[] strArrUo = Uo(Build.CPU_ABI);
        if (strArrUo.length < 2) {
            return false;
        }
        return rl && nativeInit(new String[]{strArrUo[0], strArrUo[1], str}, assetManager);
    }

    public JniNativeApi(Context context) {
        this.f60283n = context;
    }
}
