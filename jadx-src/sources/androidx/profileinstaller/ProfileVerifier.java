package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ProfileVerifier {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ResolvableFuture f40938n = ResolvableFuture.Z();
    private static final Object rl = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static CompilationStatus f40939t = null;

    @RestrictTo
    static class Cache {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f40940n;
        final long nr;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final long f40941t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.rl == cache.rl && this.f40941t == cache.f40941t && this.f40940n == cache.f40940n && this.nr == cache.nr) {
                    return true;
                }
            }
            return false;
        }

        static Cache n(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } finally {
            }
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.rl), Long.valueOf(this.f40941t), Integer.valueOf(this.f40940n), Long.valueOf(this.nr));
        }

        Cache(int i2, int i3, long j2, long j3) {
            this.f40940n = i2;
            this.rl = i3;
            this.f40941t = j2;
            this.nr = j3;
        }

        void rl(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f40940n);
                dataOutputStream.writeInt(this.rl);
                dataOutputStream.writeLong(this.f40941t);
                dataOutputStream.writeLong(this.nr);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @RequiresApi
    private static class Api33Impl {
        static PackageInfo n(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class CompilationStatus {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f40942n;
        private final boolean nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f40943t;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ResultCode {
        }

        CompilationStatus(int i2, boolean z2, boolean z3, boolean z4) {
            this.f40942n = i2;
            this.f40943t = z3;
            this.rl = z2;
            this.nr = z4;
        }
    }

    private static CompilationStatus rl(int i2, boolean z2, boolean z3, boolean z4) {
        CompilationStatus compilationStatus = new CompilationStatus(i2, z2, z3, z4);
        f40939t = compilationStatus;
        f40938n.ck(compilationStatus);
        return f40939t;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static CompilationStatus t(Context context, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        long length;
        boolean z5;
        File file;
        Cache cacheN;
        Cache cache;
        int i5;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        CompilationStatus compilationStatus;
        if (!z2 && (compilationStatus = f40939t) != null) {
            return compilationStatus;
        }
        synchronized (rl) {
            if (z2) {
                i2 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() <= 0) {
                }
                assetFileDescriptorOpenFd.close();
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists()) {
                        File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file3.length();
                        if (file3.exists()) {
                            long jN = n(context);
                            file = new File(context.getFilesDir(), "profileInstalled");
                            if (file.exists()) {
                            }
                            if (cacheN == null) {
                                if (z3) {
                                }
                            }
                            if (z2) {
                                i2 = 2;
                            }
                            if (cacheN != null) {
                                i2 = 3;
                            }
                            int i7 = i2;
                            cache = new Cache(1, i7, jN, length);
                            if (cacheN != null) {
                                cache.rl(file);
                            }
                            return rl(i7, z4, z5, z3);
                        }
                    }
                }
                return rl(262144, false, false, z3);
            }
            CompilationStatus compilationStatus2 = f40939t;
            if (compilationStatus2 != null) {
                return compilationStatus2;
            }
            i2 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    z3 = assetFileDescriptorOpenFd.getLength() <= 0;
                    assetFileDescriptorOpenFd.close();
                } finally {
                }
            } catch (IOException unused) {
                z3 = false;
            }
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28 && i3 != 30) {
                File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length22 = file22.length();
                z4 = !file22.exists() && length22 > 0;
                File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file32.length();
                z5 = !file32.exists() && length > 0;
                try {
                    long jN2 = n(context);
                    file = new File(context.getFilesDir(), "profileInstalled");
                    if (file.exists()) {
                        cacheN = null;
                    } else {
                        try {
                            cacheN = Cache.n(file);
                        } catch (IOException unused2) {
                            return rl(131072, z4, z5, z3);
                        }
                    }
                    if (cacheN == null && cacheN.f40941t == jN2 && (i5 = cacheN.rl) != 2) {
                        i2 = i5;
                    } else if (z3) {
                        i2 = 327680;
                    } else if (z4) {
                        i2 = 1;
                    } else if (z5) {
                        i2 = 2;
                    }
                    if (z2 && z5 && i2 != 1) {
                        i2 = 2;
                    }
                    if (cacheN != null && cacheN.rl == 2 && i2 == 1 && length22 < cacheN.nr) {
                        i2 = 3;
                    }
                    int i72 = i2;
                    cache = new Cache(1, i72, jN2, length);
                    if (cacheN != null || !cacheN.equals(cache)) {
                        try {
                            cache.rl(file);
                        } catch (IOException unused3) {
                            i72 = 196608;
                        }
                    }
                    return rl(i72, z4, z5, z3);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return rl(65536, z4, z5, z3);
                }
            }
            return rl(262144, false, false, z3);
        }
    }

    private static long n(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.n(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
