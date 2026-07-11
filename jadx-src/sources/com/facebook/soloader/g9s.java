package com.facebook.soloader;

import android.os.StrictMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class g9s extends ci {
    @Override // com.facebook.soloader.ci
    public String t() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.ci
    public String toString() {
        return t() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }

    @Override // com.facebook.soloader.ci
    public int nr(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e2) {
            qz.t("SoLoader", "Error loading library: " + str, e2);
            return 0;
        }
    }
}
