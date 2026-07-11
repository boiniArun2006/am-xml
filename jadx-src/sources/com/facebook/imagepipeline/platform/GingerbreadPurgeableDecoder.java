package com.facebook.imagepipeline.platform;

import A72.Dsr;
import Hh.C;
import Hh.Ml;
import Hh.Xo;
import Pj0.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import uK.n;
import uK.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Ml
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    private static Method nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f52445t = w6.xMQ();

    private static MemoryFile KN(j jVar, int i2, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        EQK.j jVar2;
        Dsr dsr;
        Dsr dsr2 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i2);
        memoryFile.allowPurging(false);
        try {
            dsr = new Dsr((PooledByteBuffer) jVar.eF());
            try {
                jVar2 = new EQK.j(dsr, i2);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                jVar2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            jVar2 = null;
        }
        try {
            outputStream2 = memoryFile.getOutputStream();
            Hh.j.n(jVar2, outputStream2);
            if (bArr != null) {
                memoryFile.writeBytes(bArr, 0, i2, bArr.length);
            }
            j.M7(jVar);
            Hh.n.rl(dsr);
            Hh.n.rl(jVar2);
            Hh.n.n(outputStream2, true);
            return memoryFile;
        } catch (Throwable th3) {
            th = th3;
            outputStream = outputStream2;
            dsr2 = dsr;
            j.M7(jVar);
            Hh.n.rl(dsr2);
            Hh.n.rl(jVar2);
            Hh.n.n(outputStream, true);
            throw th;
        }
    }

    private synchronized Method mUb() {
        if (nr == null) {
            try {
                nr = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                throw Xo.n(e2);
            }
        }
        return nr;
    }

    private Bitmap xMQ(j jVar, int i2, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFileKN;
        MemoryFile memoryFile = null;
        try {
            try {
                memoryFileKN = KN(jVar, i2, bArr);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            FileDescriptor fileDescriptorGh = gh(memoryFileKN);
            n nVar = this.f52445t;
            if (nVar == null) {
                throw new IllegalStateException("WebpBitmapFactory is null");
            }
            Bitmap bitmap = (Bitmap) C.KN(nVar.rl(fileDescriptorGh, null, options), "BitmapFactory returned null");
            if (memoryFileKN != null) {
                memoryFileKN.close();
            }
            return bitmap;
        } catch (IOException e3) {
            e = e3;
            memoryFile = memoryFileKN;
            throw Xo.n(e);
        } catch (Throwable th2) {
            th = th2;
            memoryFile = memoryFileKN;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }

    @Ml
    public GingerbreadPurgeableDecoder() {
    }

    private FileDescriptor gh(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) C.Uo(mUb().invoke(memoryFile, new Object[0]));
        } catch (Exception e2) {
            throw Xo.n(e2);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap nr(j jVar, int i2, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.O(jVar, i2)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.rl;
        }
        return xMQ(jVar, i2, bArr, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap t(j jVar, BitmapFactory.Options options) {
        return xMQ(jVar, ((PooledByteBuffer) jVar.eF()).size(), null, options);
    }
}
