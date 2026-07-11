package com.facebook.imagepipeline.platform;

import Hh.C;
import Hh.Ml;
import Pj0.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.w6;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Ml
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f52446t;

    private static void KN(byte[] bArr, int i2) {
        bArr[i2] = -1;
        bArr[i2 + 1] = -39;
    }

    @Ml
    public KitKatPurgeableDecoder(w6 w6Var) {
        this.f52446t = w6Var;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap nr(j jVar, int i2, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z2;
        if (DalvikPurgeableDecoder.O(jVar, i2)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.rl;
        }
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVar.eF();
        if (i2 <= pooledByteBuffer.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        int i3 = i2 + 2;
        j jVarN = this.f52446t.n(i3);
        try {
            byte[] bArr2 = (byte[]) jVarN.eF();
            pooledByteBuffer.O(0, bArr2, 0, i2);
            if (bArr != null) {
                KN(bArr2, i2);
                i2 = i3;
            }
            Bitmap bitmap = (Bitmap) C.KN(BitmapFactory.decodeByteArray(bArr2, 0, i2, options), "BitmapFactory returned null");
            j.M7(jVarN);
            return bitmap;
        } catch (Throwable th) {
            j.M7(jVarN);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap t(j jVar, BitmapFactory.Options options) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVar.eF();
        int size = pooledByteBuffer.size();
        j jVarN = this.f52446t.n(size);
        try {
            byte[] bArr = (byte[]) jVarN.eF();
            pooledByteBuffer.O(0, bArr, 0, size);
            return (Bitmap) C.KN(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            j.M7(jVarN);
        }
    }
}
