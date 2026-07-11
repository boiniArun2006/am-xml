package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f54389p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f54390q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f54391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f54392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f54393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f54394d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f54396f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f54399i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f54402l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f54398h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f54400j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f54403m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f54404n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f54405o = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54395e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54397g = 1;

    public static void a(g gVar, d dVar, boolean z2) {
        int i2;
        synchronized (gVar) {
            e eVar = dVar.f54380a;
            if (eVar.f54387d != dVar) {
                throw new IllegalStateException();
            }
            if (z2 && !eVar.f54386c) {
                for (int i3 = 0; i3 < gVar.f54397g; i3++) {
                    if (!dVar.f54381b[i3]) {
                        a(dVar.f54383d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                    }
                    if (!eVar.b(i3).exists()) {
                        a(dVar.f54383d, dVar, false);
                        return;
                    }
                }
            }
            for (int i5 = 0; i5 < gVar.f54397g; i5++) {
                File fileB = eVar.b(i5);
                if (!z2) {
                    a(fileB);
                } else if (fileB.exists()) {
                    File fileA = eVar.a(i5);
                    fileB.renameTo(fileA);
                    long j2 = eVar.f54385b[i5];
                    long length = fileA.length();
                    eVar.f54385b[i5] = length;
                    gVar.f54398h = (gVar.f54398h - j2) + length;
                }
            }
            gVar.f54401k++;
            eVar.f54387d = null;
            if (eVar.f54386c || z2) {
                eVar.f54386c = true;
                BufferedWriter bufferedWriter = gVar.f54399i;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(eVar.f54384a);
                StringBuilder sb2 = new StringBuilder();
                for (long j3 : eVar.f54385b) {
                    sb2.append(' ');
                    sb2.append(j3);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z2) {
                    gVar.f54403m++;
                }
            } else {
                gVar.f54400j.remove(eVar.f54384a);
                gVar.f54399i.write("REMOVE " + eVar.f54384a + '\n');
            }
            gVar.f54399i.flush();
            if (gVar.f54398h > gVar.f54396f || ((i2 = gVar.f54401k) >= 2000 && i2 >= gVar.f54400j.size())) {
                gVar.f54404n.submit(gVar.f54405o);
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f54392b);
        Charset charset = l.f54413a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f54395e).equals(strA3) || !Integer.toString(this.f54397g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i2++;
                } catch (EOFException unused) {
                    this.f54401k = i2 - this.f54400j.size();
                    if (kVar.f54412e == -1) {
                        c();
                    } else {
                        this.f54399i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54392b, true), l.f54413a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                kVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f54399i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(DTExchangeFilesBridge.fileOutputStreamCtor(this.f54393c), l.f54413a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f54395e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f54397g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (e eVar : this.f54400j.values()) {
                    if (eVar.f54387d != null) {
                        bufferedWriter2.write("DIRTY " + eVar.f54384a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(eVar.f54384a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j2 : eVar.f54385b) {
                            sb2.append(' ');
                            sb2.append(j2);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f54392b.exists()) {
                    File file = this.f54392b;
                    File file2 = this.f54394d;
                    a(file2);
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f54393c.renameTo(this.f54392b)) {
                    throw new IOException();
                }
                this.f54394d.delete();
                this.f54399i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54392b, true), l.f54413a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f54399i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f54400j.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).f54387d;
                if (dVar != null) {
                    a(dVar.f54383d, dVar, false);
                }
            }
            d();
            this.f54399i.close();
            this.f54399i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        while (this.f54398h > this.f54396f) {
            String str = (String) ((Map.Entry) this.f54400j.entrySet().iterator().next()).getKey();
            f fVar = this.f54402l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC2 = false;
                for (String str2 : this.f54400j.keySet()) {
                    if (this.f54402l.a(str2)) {
                        zC2 |= c(str2);
                    }
                }
                if (!zC2) {
                    return;
                }
            }
        }
    }

    public g(File file, long j2) {
        this.f54391a = file;
        this.f54392b = new File(file, "journal");
        this.f54393c = new File(file, "journal.tmp");
        this.f54394d = new File(file, "journal.bkp");
        this.f54396f = j2;
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i2 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i2);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i2);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f54400j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i2, iIndexOf2);
            }
            e eVar = (e) this.f54400j.get(strSubstring);
            if (eVar == null) {
                eVar = new e(this, strSubstring);
                this.f54400j.put(strSubstring, eVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                eVar.f54386c = true;
                eVar.f54387d = null;
                if (strArrSplit.length == eVar.f54388e.f54397g) {
                    for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                        try {
                            eVar.f54385b[i3] = Long.parseLong(strArrSplit[i3]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f54387d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        try {
            IAlog.e("DiskLruCache remove %s", str);
            if (this.f54399i != null) {
                if (f54389p.matcher(str).matches()) {
                    e eVar = (e) this.f54400j.get(str);
                    if (eVar != null && eVar.f54387d == null) {
                        for (int i2 = 0; i2 < this.f54397g; i2++) {
                            File fileA = eVar.a(i2);
                            if (fileA.exists() && !fileA.delete()) {
                                throw new IOException("failed to delete " + fileA);
                            }
                            long j2 = this.f54398h;
                            long[] jArr = eVar.f54385b;
                            this.f54398h = j2 - jArr[i2];
                            jArr[i2] = 0;
                        }
                        this.f54401k++;
                        this.f54399i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f54400j.remove(str);
                        int i3 = this.f54401k;
                        if (i3 >= 2000 && i3 >= this.f54400j.size()) {
                            this.f54404n.submit(this.f54405o);
                        }
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public static g a(File file, long j2) throws IOException {
        if (j2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j2);
            if (gVar.f54392b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e2) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.f54391a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j2);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() throws IOException {
        a(this.f54393c);
        Iterator it = this.f54400j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i2 = 0;
            if (eVar.f54387d == null) {
                while (i2 < this.f54397g) {
                    this.f54398h += eVar.f54385b[i2];
                    i2++;
                }
            } else {
                eVar.f54387d = null;
                while (i2 < this.f54397g) {
                    a(eVar.a(i2));
                    a(eVar.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f54399i != null) {
                    if (f54389p.matcher(str).matches()) {
                        e eVar = (e) this.f54400j.get(str);
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.f54400j.put(str, eVar);
                        } else if (eVar.f54387d != null) {
                            return null;
                        }
                        d dVar = new d(this, eVar);
                        eVar.f54387d = dVar;
                        this.f54399i.write("DIRTY " + str + '\n');
                        this.f54399i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException(wDgKoYAES.VjENFv);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
