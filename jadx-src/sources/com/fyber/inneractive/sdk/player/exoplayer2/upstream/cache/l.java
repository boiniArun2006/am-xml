package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f56071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f56072b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f56074d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f56076f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f56073c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f56075e = new HashMap();

    public final synchronized m a(String str, long j2) {
        String str2;
        m mVarA;
        try {
            a aVar = this.f56076f;
            if (aVar != null) {
                throw aVar;
            }
            h hVar = (h) this.f56074d.f56060a.get(str);
            if (hVar == null) {
                str2 = str;
                mVarA = new m(str2, j2, -1L, -9223372036854775807L, null);
            } else {
                str2 = str;
                while (true) {
                    mVarA = hVar.a(j2);
                    if (!mVarA.f56053d || mVarA.f56054e.length() == mVarA.f56052c) {
                        break;
                    }
                    a();
                }
            }
            if (!mVarA.f56053d) {
                if (this.f56073c.containsKey(str2)) {
                    return null;
                }
                this.f56073c.put(str2, mVarA);
                return mVarA;
            }
            h hVar2 = (h) this.f56074d.f56060a.get(str2);
            if (!hVar2.f56058c.remove(mVarA)) {
                throw new IllegalStateException();
            }
            int i2 = hVar2.f56056a;
            if (!mVarA.f56053d) {
                throw new IllegalStateException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File parentFile = mVarA.f56054e.getParentFile();
            long j3 = mVarA.f56051b;
            Pattern pattern = m.f56077g;
            File file = new File(parentFile, i2 + "." + j3 + "." + jCurrentTimeMillis + ".v3.exo");
            m mVar = new m(mVarA.f56050a, mVarA.f56051b, mVarA.f56052c, jCurrentTimeMillis, file);
            if (!mVarA.f56054e.renameTo(file)) {
                throw new a("Renaming of " + mVarA.f56054e + " to " + file + " failed.");
            }
            hVar2.f56058c.add(mVar);
            ArrayList arrayList = (ArrayList) this.f56075e.get(mVarA.f56050a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j jVar = (j) arrayList.get(size);
                    jVar.f56067a.remove(mVarA);
                    jVar.f56068b -= mVarA.f56052c;
                    jVar.f56067a.add(mVar);
                    jVar.f56068b += mVar.f56052c;
                    jVar.a(this, 0L);
                }
            }
            j jVar2 = this.f56072b;
            jVar2.f56067a.remove(mVarA);
            jVar2.f56068b -= mVarA.f56052c;
            jVar2.f56067a.add(mVar);
            jVar2.f56068b += mVar.f56052c;
            jVar2.a(this, 0L);
            return mVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f56073c.remove(mVar.f56050a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    public l(File file, j jVar) {
        this.f56071a = file;
        this.f56072b = jVar;
        this.f56074d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l lVar) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        File[] fileArrListFiles;
        BufferedInputStream bufferedInputStream;
        if (!lVar.f56071a.exists()) {
            lVar.f56071a.mkdirs();
            return;
        }
        i iVar = lVar.f56074d;
        if (!iVar.f56065f) {
            DataInputStream dataInputStream3 = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(iVar.f56062c.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    try {
                    } catch (FileNotFoundException unused) {
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream2 != null) {
                        z.a(dataInputStream2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = null;
            } catch (IOException e3) {
                e = e3;
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (dataInputStream.readInt() == 1) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (iVar.f56063d != null) {
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            iVar.f56063d.init(2, iVar.f56064e, new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, iVar.f56063d));
                        } catch (InvalidAlgorithmParameterException e4) {
                            e = e4;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e5) {
                            e = e5;
                            throw new IllegalStateException(e);
                        }
                    }
                } else if (iVar.f56063d != null) {
                    iVar.f56065f = true;
                }
                try {
                    int i2 = dataInputStream.readInt();
                    int i3 = 0;
                    for (int i5 = 0; i5 < i2; i5++) {
                        int i7 = dataInputStream.readInt();
                        String utf = dataInputStream.readUTF();
                        h hVar = new h(i7, utf, dataInputStream.readLong());
                        iVar.f56060a.put(utf, hVar);
                        iVar.f56061b.put(i7, utf);
                        int iHashCode = utf.hashCode();
                        long j2 = hVar.f56059d;
                        i3 += ((iHashCode + (i7 * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)));
                    }
                    if (dataInputStream.readInt() == i3) {
                        z.a(dataInputStream);
                        fileArrListFiles = lVar.f56071a.listFiles();
                        if (fileArrListFiles == null) {
                            return;
                        }
                        for (File file : fileArrListFiles) {
                            if (!file.getName().equals("cached_content_index.exi")) {
                                m mVarA = file.length() > 0 ? m.a(file, lVar.f56074d) : null;
                                if (mVarA != null) {
                                    lVar.a(mVarA);
                                } else {
                                    file.delete();
                                }
                            }
                        }
                        lVar.f56074d.a();
                        lVar.f56074d.b();
                        return;
                    }
                    z.a(dataInputStream);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.f56062c;
                    cVar.f56174a.delete();
                    cVar.f56175b.delete();
                    iVar.f56060a.clear();
                    iVar.f56061b.clear();
                    fileArrListFiles = lVar.f56071a.listFiles();
                    if (fileArrListFiles == null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream3 = dataInputStream;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                    }
                    throw th;
                }
            }
            z.a(dataInputStream);
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.f56062c;
            cVar2.f56174a.delete();
            cVar2.f56175b.delete();
            iVar.f56060a.clear();
            iVar.f56061b.clear();
            fileArrListFiles = lVar.f56071a.listFiles();
            if (fileArrListFiles == null) {
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(m mVar) {
        i iVar = this.f56074d;
        String str = mVar.f56050a;
        h hVarA = (h) iVar.f56060a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f56058c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f56075e.get(mVar.f56050a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f56067a.add(mVar);
                jVar.f56068b += mVar.f56052c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f56072b;
        jVar2.f56067a.add(mVar);
        jVar2.f56068b += mVar.f56052c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z2) throws Throwable {
        h hVar = (h) this.f56074d.f56060a.get(gVar.f56050a);
        if (hVar == null || !hVar.f56058c.remove(gVar)) {
            return;
        }
        gVar.f56054e.delete();
        if (z2 && hVar.f56058c.isEmpty()) {
            i iVar = this.f56074d;
            h hVar2 = (h) iVar.f56060a.remove(hVar.f56057b);
            if (hVar2 != null) {
                if (hVar2.f56058c.isEmpty()) {
                    iVar.f56061b.remove(hVar2.f56056a);
                    iVar.f56065f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f56074d.b();
        }
        ArrayList arrayList = (ArrayList) this.f56075e.get(gVar.f56050a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f56067a.remove(gVar);
                jVar.f56068b -= gVar.f56052c;
            }
        }
        j jVar2 = this.f56072b;
        jVar2.f56067a.remove(gVar);
        jVar2.f56068b -= gVar.f56052c;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f56074d.f56060a.values().iterator();
        while (it.hasNext()) {
            for (g gVar : ((h) it.next()).f56058c) {
                if (gVar.f56054e.length() != gVar.f56052c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f56074d.a();
        this.f56074d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f56074d.f56060a.get(str);
        return hVar == null ? -1L : hVar.f56059d;
    }
}
