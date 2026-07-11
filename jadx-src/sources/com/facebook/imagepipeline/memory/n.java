package com.facebook.imagepipeline.memory;

import Hh.C;
import android.graphics.Bitmap;
import fJf.DAz;
import fJf.Dsr;
import fJf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n extends BasePool implements Dsr {
    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int HI(int i2) {
        return i2;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int az(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public Bitmap J2(int i2) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i2) / 2.0d), Bitmap.Config.RGB_565);
    }

    public n(A72.Ml ml, nKK nkk, DAz dAz, boolean z2) {
        super(ml, nkk, dAz, z2);
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: fD, reason: merged with bridge method [inline-methods] */
    public boolean Z(Bitmap bitmap) {
        C.Uo(bitmap);
        if (!bitmap.isRecycled() && bitmap.isMutable()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mUb(Bitmap bitmap) {
        C.Uo(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public Bitmap ck(j jVar) {
        Bitmap bitmap = (Bitmap) super.ck(jVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public int ty(Bitmap bitmap) {
        C.Uo(bitmap);
        return bitmap.getAllocationByteCount();
    }
}
