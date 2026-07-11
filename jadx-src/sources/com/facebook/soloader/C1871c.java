package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C1871c implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runtime f53037n = Runtime.getRuntime();
    private final String nr;
    private final Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f53038t;

    private String rl(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e2) {
            return e2.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        com.facebook.soloader.qz.rl("SoFileLoaderImpl", "Error when loading library: " + r2 + ", library hash is " + rl(r7) + ", LD_LIBRARY_PATH is " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    @Override // com.facebook.soloader.l3D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(String str, int i2) throws Throwable {
        String str2;
        Throwable th;
        if (this.rl == null) {
            System.load(str);
            return;
        }
        String str3 = (i2 & 4) == 4 ? this.f53038t : this.nr;
        String str4 = null;
        try {
            try {
                try {
                    synchronized (this.f53037n) {
                        try {
                            String str5 = (String) this.rl.invoke(this.f53037n, str, SoLoader.class.getClassLoader(), str3);
                            if (str5 != null) {
                                str4 = "nativeLoad() returned error for " + str + ": " + str5;
                                throw new r(str, str4);
                            }
                        } catch (Throwable th2) {
                            str2 = str4;
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } catch (Throwable th4) {
            str2 = str4;
            th = th4;
        }
        try {
            throw th;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            str4 = str2;
            str4 = "nativeLoad() error during invocation for " + str + ": " + str4;
            throw new RuntimeException(str4);
        } catch (Throwable th5) {
            th = th5;
            if (str2 != null) {
                qz.rl("SoFileLoaderImpl", "Error when loading library: " + str2 + ", library hash is " + rl(str) + ", LD_LIBRARY_PATH is " + str3);
            }
            throw th;
        }
    }

    public C1871c() {
        String classLoaderLdLoadLibrary;
        Method nativeLoadRuntimeMethod = SysUtil.getNativeLoadRuntimeMethod();
        this.rl = nativeLoadRuntimeMethod;
        if (nativeLoadRuntimeMethod != null) {
            classLoaderLdLoadLibrary = SysUtil.getClassLoaderLdLoadLibrary();
        } else {
            classLoaderLdLoadLibrary = null;
        }
        this.f53038t = classLoaderLdLoadLibrary;
        this.nr = SysUtil.az(classLoaderLdLoadLibrary);
    }
}
