package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c f56062c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f56066g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f56063d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f56064e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f56060a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f56061b = new SparseArray();

    public final void a() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f56060a.values()) {
            if (hVar.f56058c.isEmpty()) {
                linkedList.add(hVar.f56057b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) this.f56060a.remove((String) it.next());
            if (hVar2 != null) {
                if (!hVar2.f56058c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f56061b.remove(hVar2.f56056a);
                this.f56065f = true;
            }
        }
    }

    public final void b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e2;
        Throwable th;
        if (!this.f56065f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVarB = this.f56062c.b();
            p pVar = this.f56066g;
            if (pVar == null) {
                this.f56066g = new p(bVarB);
            } else {
                pVar.a(bVarB);
            }
            dataOutputStream = new DataOutputStream(this.f56066g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f56063d != null ? 1 : 0);
                if (this.f56063d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f56063d.init(1, this.f56064e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f56066g, this.f56063d));
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f56060a.size());
                int i2 = 0;
                for (h hVar : this.f56060a.values()) {
                    dataOutputStream2.writeInt(hVar.f56056a);
                    dataOutputStream2.writeUTF(hVar.f56057b);
                    dataOutputStream2.writeLong(hVar.f56059d);
                    int iHashCode = (hVar.f56057b.hashCode() + (hVar.f56056a * 31)) * 31;
                    long j2 = hVar.f56059d;
                    i2 += iHashCode + ((int) (j2 ^ (j2 >>> 32)));
                }
                dataOutputStream2.writeInt(i2);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.f56062c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.f56175b.delete();
                int i3 = z.f56234a;
                this.f56065f = false;
            } catch (IOException e5) {
                e2 = e5;
                try {
                    throw new a(e2);
                } catch (Throwable th2) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th2;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th3 = th;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    z.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z.a(dataOutputStream);
                throw th;
            }
        } catch (IOException e6) {
            dataOutputStream = dataOutputStream2;
            e2 = e6;
        } catch (Throwable th5) {
            th = th5;
            Throwable th32 = th;
            dataOutputStream = dataOutputStream2;
            th = th32;
            z.a(dataOutputStream);
            throw th;
        }
    }

    public i(File file) {
        this.f56062c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new File(file, "cached_content_index.exi"));
    }

    public final h a(String str, long j2) {
        SparseArray sparseArray = this.f56061b;
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            iKeyAt = i2;
        }
        h hVar = new h(iKeyAt, str, j2);
        this.f56060a.put(str, hVar);
        this.f56061b.put(iKeyAt, str);
        this.f56065f = true;
        return hVar;
    }
}
