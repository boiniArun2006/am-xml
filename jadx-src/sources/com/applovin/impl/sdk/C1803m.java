package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.core.util.AtomicFile;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.d2;
import com.applovin.impl.d4;
import com.applovin.impl.d6;
import com.applovin.impl.g2;
import com.applovin.impl.h2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.internal.partials.AppLovinFilesBridge;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.sdk.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1803m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f50293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1804o f50294c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50297f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50292a = "FileManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f50295d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f50296e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g2 f50298g = a();

    private g2 a() {
        if (o0.d() && ((Boolean) this.f50293b.a(x4.s3)).booleanValue()) {
            try {
                return new d4(this.f50293b);
            } catch (Throwable th) {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f50293b.D().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new h2(this.f50293b);
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f50295d) {
            try {
                if (this.f50296e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Context context) {
        if (this.f50293b.E0()) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f50293b.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50293b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.RGN
            @Override // java.lang.Runnable
            public final void run() {
                this.f50023n.a(bVar, context);
            }
        }), d6.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f50293b.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50293b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f49997n.b(bVar, context);
            }
        }), d6.b.CACHING);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f50295d) {
            zContains = this.f50296e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f50295d) {
            boolean zAdd = this.f50296e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f50295d.wait();
                    zAdd = this.f50296e.add(absolutePath);
                } catch (InterruptedException e2) {
                    if (C1804o.a()) {
                        this.f50294c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e2);
                    }
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    private boolean g(File file) {
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(JavetError.PARAMETER_PATH, file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f50293b.D().a(d2.Q0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f50293b.D().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } catch (Throwable th2) {
                h(file);
                throw th2;
            }
        }
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z2 = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String strA = a(fileInputStream);
                            boolean z3 = strA == null;
                            fileInputStream.close();
                            if (z3 && ((Boolean) this.f50293b.a(x4.M0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return strA;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        if (C1804o.a()) {
                            this.f50294c.d("FileManager", "File not found. " + e2);
                        }
                        this.f50294c.a("FileManager", e2);
                        this.f50293b.D().a("FileManager", "readFileNotFound", e2);
                        if (0 != 0 && ((Boolean) this.f50293b.a(x4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (IOException e3) {
                    if (C1804o.a()) {
                        this.f50294c.a("FileManager", "Failed to read file: " + file.getName() + e3);
                    }
                    this.f50294c.a("FileManager", e3);
                    this.f50293b.D().a("FileManager", "readFileIO", e3);
                    if (((Boolean) this.f50293b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                } catch (Throwable th3) {
                    if (C1804o.a()) {
                        this.f50294c.a("FileManager", "Unknown failure to read file.", th3);
                    }
                    this.f50294c.a("FileManager", th3);
                    this.f50293b.D().a("FileManager", "readFile", th3);
                    if (((Boolean) this.f50293b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = false;
                if (z2 && ((Boolean) this.f50293b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    C1803m(C1802k c1802k) {
        this.f50293b = c1802k;
        this.f50294c = c1802k.O();
        this.f50297f = ((Boolean) c1802k.a(x4.U0)).booleanValue();
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f50295d) {
            try {
                if (!this.f50296e.remove(absolutePath)) {
                    this.f50293b.D().a(d2.Q0, "unlockFile", CollectionUtils.hashMap(JavetError.PARAMETER_PATH, absolutePath));
                }
                this.f50295d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.l0() == null) {
            return;
        }
        g(a(bVar.l0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z2, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z2) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Unable to make cache directory at " + fileD, th);
            }
            this.f50293b.D().a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (C1804o.a()) {
                this.f50294c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f50293b.D().a(d2.Q0, "createNoMediaFile");
        } catch (IOException e2) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Failed to create .nomedia file", e2);
            }
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z2 = false;
            boolean z3 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z4 = parentFile != null && parentFile.exists();
            if (z4 && parentFile.canWrite()) {
                z2 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z3 + "\nparentDirectoryExists: " + z4 + "\nisParentDirectoryWritable: " + z2;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f50297f) {
            return b(str, context);
        }
        boolean z2 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z2 = true;
        }
        h(fileA);
        return z2;
    }

    private long b() {
        long jLongValue = ((Long) this.f50293b.a(x4.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th) {
            this.f50294c.a("FileManager", th);
            this.f50293b.D().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
        while (true) {
            int i2 = inputStream.read(bArr, 0, 8192);
            if (i2 >= 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                String string = byteArrayOutputStream.toString(com.google.android.exoplayer2.C.UTF8_NAME);
                byteArrayOutputStream.close();
                return string;
            }
            this.f50294c.a("FileManager", th);
            this.f50293b.D().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean a(InputStream inputStream, File file, boolean z2) {
        return a(inputStream, file, z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0301 A[Catch: all -> 0x0307, TRY_LEAVE, TryCatch #8 {all -> 0x0307, blocks: (B:184:0x02fb, B:186:0x0301), top: B:239:0x02fb }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02c4 A[EDGE_INSN: B:272:0x02c4->B:166:0x02c4 BREAK  A[LOOP:1: B:139:0x0267->B:273:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[Catch: all -> 0x0154, TryCatch #17 {all -> 0x0154, blocks: (B:73:0x0148, B:75:0x014e, B:78:0x0157), top: B:256:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(InputStream inputStream, File file, boolean z2, boolean z3) throws Throwable {
        AtomicFile atomicFile;
        FileOutputStream fileOutputStreamNr;
        boolean z4;
        Throwable th;
        byte[] bArr;
        int i2;
        boolean z5;
        Throwable th2;
        Throwable th3;
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        if (!this.f50297f) {
            if (!z3) {
                d(file);
            }
            if (((Boolean) this.f50293b.a(x4.Q0)).booleanValue() && !z2 && file.exists()) {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.f50293b.D().a(d2.Q0, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap(JavetError.PARAMETER_PATH, file.getAbsolutePath()));
                return true;
            }
            try {
                FileOutputStream fileOutputStreamFileOutputStreamCtor = AppLovinFilesBridge.fileOutputStreamCtor(file);
                int i3 = 8192;
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int i5 = inputStream.read(bArr2, 0, i3);
                        if (i5 < 0) {
                            break;
                        }
                        try {
                            fileOutputStreamFileOutputStreamCtor.write(bArr2, 0, i5);
                            i3 = 8192;
                        } catch (Throwable th4) {
                            if (C1804o.a()) {
                                this.f50294c.a("FileManager", "Failed to write next buffer to file", th4);
                            }
                            try {
                                this.f50293b.D().a("FileManager", "writeResourceStream", th4);
                                try {
                                    fileOutputStreamFileOutputStreamCtor.close();
                                    a(file, "removeFileAfterCacheFail");
                                    if (!z3) {
                                        h(file);
                                    }
                                    if (!((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                                        return false;
                                    }
                                    try {
                                        inputStream.close();
                                        return false;
                                    } catch (Throwable th5) {
                                        if (C1804o.a()) {
                                            this.f50294c.a("FileManager", "Unable to close resourceStream.", th5);
                                        }
                                        this.f50293b.D().a("FileManager", "closeResourceStream", th5);
                                        return false;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    z5 = true;
                                    try {
                                        if (C1804o.a()) {
                                            this.f50294c.a("FileManager", "Unknown failure to write file.", th);
                                        }
                                        this.f50294c.a("FileManager", th);
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                    }
                                    try {
                                        this.f50293b.D().a("FileManager", "writeResource", th);
                                        a(file, "removeFileAfterCacheFail");
                                        if (!z3) {
                                            h(file);
                                        }
                                        if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                                            return false;
                                        }
                                        try {
                                            inputStream.close();
                                            return false;
                                        } catch (Throwable th8) {
                                            if (C1804o.a()) {
                                                this.f50294c.a("FileManager", "Unable to close resourceStream.", th8);
                                            }
                                            this.f50293b.D().a("FileManager", "closeResourceStream", th8);
                                            return false;
                                        }
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        z5 = true;
                                        if (z5) {
                                            a(file, "removeFileAfterCacheFail");
                                        }
                                        if (!z3) {
                                            h(file);
                                        }
                                        if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                                            try {
                                                inputStream.close();
                                                throw th2;
                                            } catch (Throwable th10) {
                                                if (C1804o.a()) {
                                                    this.f50294c.a("FileManager", "Unable to close resourceStream.", th10);
                                                }
                                                this.f50293b.D().a("FileManager", "closeResourceStream", th10);
                                                throw th2;
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th11) {
                                th3 = th11;
                                z5 = true;
                                try {
                                    try {
                                        fileOutputStreamFileOutputStreamCtor.close();
                                        throw th3;
                                    } catch (Throwable th12) {
                                        th3.addSuppressed(th12);
                                        throw th3;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    if (C1804o.a()) {
                                    }
                                    this.f50294c.a("FileManager", th);
                                    this.f50293b.D().a("FileManager", "writeResource", th);
                                    a(file, "removeFileAfterCacheFail");
                                    if (!z3) {
                                    }
                                    if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                                    }
                                }
                            }
                        }
                    }
                    fileOutputStreamFileOutputStreamCtor.close();
                    if (!z3) {
                        h(file);
                    }
                    if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                        try {
                            inputStream.close();
                        } catch (Throwable th14) {
                            if (C1804o.a()) {
                                this.f50294c.a("FileManager", "Unable to close resourceStream.", th14);
                            }
                            this.f50293b.D().a("FileManager", "closeResourceStream", th14);
                        }
                    }
                    return true;
                } catch (Throwable th15) {
                    th3 = th15;
                    z5 = false;
                    fileOutputStreamFileOutputStreamCtor.close();
                    throw th3;
                }
            } catch (Throwable th16) {
                th = th16;
                z5 = false;
            }
        } else {
            if (!z3) {
                try {
                    d(file);
                    if (!((Boolean) this.f50293b.a(x4.Q0)).booleanValue() && !z2 && file.exists()) {
                        if (C1804o.a()) {
                            this.f50294c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                        }
                        this.f50293b.D().a(d2.Q0, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap(JavetError.PARAMETER_PATH, file.getAbsolutePath()));
                        if (!z3) {
                            h(file);
                        }
                        if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Throwable th17) {
                                if (C1804o.a()) {
                                    this.f50294c.a("FileManager", "Unable to close resourceStream.", th17);
                                }
                                this.f50293b.D().a("FileManager", "closeResourceStream", th17);
                            }
                        }
                        return true;
                    }
                    atomicFile = new AtomicFile(file);
                    try {
                        fileOutputStreamNr = atomicFile.nr();
                    } catch (Throwable th18) {
                        th = th18;
                        fileOutputStreamNr = null;
                        z4 = false;
                        if (C1804o.a()) {
                        }
                        this.f50293b.D().a("FileManager", "writeResource", th);
                        if (atomicFile != null) {
                        }
                        if (!z3) {
                        }
                        if (!((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                        }
                    }
                    try {
                        bArr = new byte[8192];
                        while (true) {
                            i2 = inputStream.read(bArr, 0, 8192);
                            if (i2 >= 0) {
                                break;
                            }
                            try {
                                fileOutputStreamNr.write(bArr, 0, i2);
                            } catch (Throwable th19) {
                                if (C1804o.a()) {
                                    this.f50294c.a("FileManager", "Failed to write next buffer to file", th19);
                                }
                                try {
                                    this.f50293b.D().a("FileManager", "writeResourceStream", th19);
                                    atomicFile.n(fileOutputStreamNr);
                                    if (!z3) {
                                        h(file);
                                    }
                                    if (!((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                                        return false;
                                    }
                                    try {
                                        inputStream.close();
                                        return false;
                                    } catch (Throwable th20) {
                                        if (C1804o.a()) {
                                            this.f50294c.a("FileManager", "Unable to close resourceStream.", th20);
                                        }
                                        this.f50293b.D().a("FileManager", "closeResourceStream", th20);
                                        return false;
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                    z4 = true;
                                }
                            }
                        }
                        atomicFile.rl(fileOutputStreamNr);
                        if (!z3) {
                            h(file);
                        }
                        if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                            try {
                                inputStream.close();
                            } catch (Throwable th22) {
                                if (C1804o.a()) {
                                    this.f50294c.a("FileManager", "Unable to close resourceStream.", th22);
                                }
                                this.f50293b.D().a("FileManager", "closeResourceStream", th22);
                            }
                        }
                        return true;
                    } catch (Throwable th23) {
                        th = th23;
                        z4 = false;
                    }
                } catch (Throwable th24) {
                    th = th24;
                    atomicFile = null;
                    fileOutputStreamNr = null;
                    z4 = false;
                    if (C1804o.a()) {
                    }
                    this.f50293b.D().a("FileManager", "writeResource", th);
                    if (atomicFile != null) {
                    }
                    if (!z3) {
                    }
                    if (!((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                    }
                }
            } else {
                if (!((Boolean) this.f50293b.a(x4.Q0)).booleanValue()) {
                }
                atomicFile = new AtomicFile(file);
                fileOutputStreamNr = atomicFile.nr();
                bArr = new byte[8192];
                while (true) {
                    i2 = inputStream.read(bArr, 0, 8192);
                    if (i2 >= 0) {
                    }
                }
                atomicFile.rl(fileOutputStreamNr);
                if (!z3) {
                }
                if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                }
                return true;
            }
            try {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Unknown failure to write file.", th);
                }
            } catch (Throwable th25) {
                th = th25;
            }
            try {
                this.f50293b.D().a("FileManager", "writeResource", th);
                if (atomicFile != null) {
                    atomicFile.n(fileOutputStreamNr);
                }
                if (!z3) {
                    h(file);
                }
                if (!((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (Throwable th26) {
                    if (C1804o.a()) {
                        this.f50294c.a("FileManager", "Unable to close resourceStream.", th26);
                    }
                    this.f50293b.D().a("FileManager", "closeResourceStream", th26);
                    return false;
                }
            } catch (Throwable th27) {
                th = th27;
                z4 = true;
                if (atomicFile != null) {
                    if (z4) {
                        atomicFile.n(fileOutputStreamNr);
                    } else {
                        atomicFile.rl(fileOutputStreamNr);
                    }
                }
                if (!z3) {
                    h(file);
                }
                if (((Boolean) this.f50293b.a(x4.r3)).booleanValue()) {
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Throwable th28) {
                        if (C1804o.a()) {
                            this.f50294c.a("FileManager", "Unable to close resourceStream.", th28);
                        }
                        this.f50293b.D().a("FileManager", "closeResourceStream", th28);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public boolean a(File file, String str, List list, int i2, String str2, Map map) {
        return a(file, str, list, true, i2, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z2, int i2, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f50293b.g().d(d2.f48259L, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = 1;
        while (i3 <= i2) {
            if (a(file, str, list, z2, str2, map2)) {
                a(true, str, i3, jElapsedRealtime, map);
                return true;
            }
            i3++;
            map2 = map;
        }
        a(false, str, i2, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z2, String str2, Map map) {
        Boolean bool = (Boolean) this.f50293b.a(x4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f50293b.g().d(d2.f48260M, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z2, map);
            try {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (C1804o.a()) {
                        this.f50294c.a("FileManager", "Caching completed for " + file);
                    }
                    double d2 = n7.d(jElapsedRealtime2);
                    double dC2 = n7.c(file.length());
                    long j2 = (long) (dC2 / d2);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j2), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC2), mapA);
                    this.f50293b.g().d(d2.f48265R, mapA);
                    this.f50293b.d0().b(j2, str, str2);
                } else {
                    if (C1804o.a()) {
                        this.f50294c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f50293b.g().d(d2.f48267S, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f50294c.a("FileManager", th);
                this.f50293b.D().a("FileManager", "loadAndCacheResource", th);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(JavetError.PARAMETER_PATH, file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j2), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z2, String str, int i2, long j2, Map map) {
        d2 d2Var = z2 ? d2.f48261N : d2.f48262O;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i2));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f50293b.g().d(d2Var, map2);
    }

    public InputStream a(String str, List list, boolean z2, Map map) {
        if (z2 && !n7.a(str, list)) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f50293b.g().d(d2.f48263P, mapHashMap);
        try {
            return this.f50298g.a(httpsString, map);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.f50293b.D().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listT = bVar.T();
        if (bVar.M0() || listT.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z2, int i2, String str3, Map map) {
        return a(context, str, str2, list, z2, false, i2, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z2, boolean z3, int i2, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f50293b.D().a(d2.Q0, "cacheResource");
            return null;
        }
        String strA = n7.a(Uri.parse(str), str2, this.f50293b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z2, i2, str3, map)) {
            return null;
        }
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z3 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z2 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f50293b.c(x4.G0);
        long length = 0;
        for (File file : c(context)) {
            if (!z2 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j2, Context context) {
        long jIntValue = ((Integer) this.f50293b.a(x4.C0)).intValue();
        if (jIntValue == -1) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j2) > jIntValue) {
                if (C1804o.a()) {
                    this.f50294c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriL0 = bVar.l0();
        if (uriL0 != null) {
            g(a(uriL0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (C1804o.a()) {
            this.f50294c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(JavetError.PARAMETER_PATH, file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f50293b.D().a(d2.Q0, str, mapHashMap);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f50294c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f50293b.D().a("FileManager", str, th);
        }
    }

    private long a(long j2) {
        return j2 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
