package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Ml extends ci implements QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f53020n = new HashMap();
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f53021t;

    private void J2(String str, String str2, String str3) {
        synchronized (this.rl) {
            try {
                String str4 = str + str2;
                if (!this.rl.containsKey(str4)) {
                    this.rl.put(str4, new HashSet());
                }
                ((Set) this.rl.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void KN(String str, String str2) throws IOException {
        ZipFile zipFile = new ZipFile(mUb(str));
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement != null) {
                    if (zipEntryNextElement.getName().endsWith("/" + str2)) {
                        xMQ(str, zipFile, zipEntryNextElement, str2);
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void Uo(String str, String str2) {
        synchronized (this.f53020n) {
            try {
                if (!this.f53020n.containsKey(str)) {
                    this.f53020n.put(str, new HashSet());
                }
                ((Set) this.f53020n.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ck() throws IOException {
        int iIndexOf;
        int i2;
        String strSubstring = null;
        for (String str : this.f53021t) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i2 = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i2);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(mUb(str));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            Uo(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    private Set gh(String str, String str2) {
        Set set;
        synchronized (this.rl) {
            set = (Set) this.rl.get(str + str2);
        }
        return set;
    }

    private static String mUb(String str) {
        return str.substring(0, str.indexOf(33));
    }

    static Set qie(Context context) {
        HashSet hashSet = new HashSet();
        String strAz = az(context.getApplicationInfo().sourceDir);
        if (strAz != null) {
            hashSet.add(strAz);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strAz2 = az(str);
                if (strAz2 != null) {
                    hashSet.add(strAz2);
                }
            }
        }
        return hashSet;
    }

    private void xMQ(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) throws IOException {
        Dsr dsr = new Dsr(zipFile, zipEntry);
        try {
            for (String str3 : eO.rl(str2, dsr)) {
                if (!str3.startsWith("/")) {
                    J2(str, str2, str3);
                }
            }
            dsr.close();
        } catch (Throwable th) {
            try {
                dsr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.ci
    public int nr(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.rl == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.f53021t) {
            Set set = (Set) this.f53020n.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                qz.J2("SoLoader", str + " not found on " + str2);
            } else {
                HI(str2, str, i2, threadPolicy);
                try {
                    i2 |= 4;
                    SoLoader.rl.n(str2 + File.separator + str, i2);
                    qz.n("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e2) {
                    qz.KN("SoLoader", str + " not found on " + str2 + " flag: " + i2, e2);
                }
            }
        }
        return 0;
    }

    @Override // com.facebook.soloader.QJ
    public ci rl(Context context) {
        Ml ml = new Ml(context);
        try {
            ml.ck();
            return ml;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.ci
    public String t() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.ci
    public String toString() {
        return t() + "[root = " + this.f53021t.toString() + ']';
    }

    public boolean ty() {
        return !this.f53021t.isEmpty();
    }

    public Ml(Context context) {
        this.f53021t = qie(context);
    }

    private void HI(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Set setGh = gh(str, str2);
        if (setGh == null) {
            KN(str, str2);
            setGh = gh(str, str2);
        }
        if (setGh != null) {
            Iterator it = setGh.iterator();
            while (it.hasNext()) {
                SoLoader.r((String) it.next(), i2, threadPolicy);
            }
        }
    }

    private static String az(String str) {
        String[] strArrMUb = SysUtil.mUb();
        String str2 = "empty";
        if (str != null && !str.isEmpty()) {
            if (strArrMUb != null && strArrMUb.length != 0) {
                return str + "!/lib/" + strArrMUb[0];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot compute fallback path, supportedAbis is ");
            if (strArrMUb == null) {
                str2 = V8ValueNull.NULL;
            }
            sb.append(str2);
            qz.Uo("SoLoader", sb.toString());
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot compute fallback path, apk path is ");
        if (str == null) {
            str2 = V8ValueNull.NULL;
        }
        sb2.append(str2);
        qz.Uo("SoLoader", sb2.toString());
        return null;
    }

    @Override // com.facebook.soloader.ci
    protected void O(int i2) throws IOException {
        ck();
    }
}
