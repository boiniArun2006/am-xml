package com.facebook.imagepipeline.nativecode;

import Hh.C;
import Hh.Xo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import bA.C1653C;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.soloader.Wre;
import fJf.CN3;
import fJf.fuX;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Hh.Ml
public abstract class DalvikPurgeableDecoder implements dF.Ml {
    protected static final byte[] rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f52436n = fuX.n();

    @Wre
    private static class OreoUtils {
        static void n(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }

        private OreoUtils() {
        }
    }

    @Hh.Ml
    private static native void nativePinBitmap(Bitmap bitmap);

    protected abstract Bitmap nr(Pj0.j jVar, int i2, BitmapFactory.Options options);

    protected abstract Bitmap t(Pj0.j jVar, BitmapFactory.Options options);

    public static BitmapFactory.Options J2(int i2, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        return options;
    }

    static {
        j.n();
        rl = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean O(Pj0.j jVar, int i2) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) jVar.eF();
        if (i2 >= 2 && pooledByteBuffer.xMQ(i2 - 2) == -1 && pooledByteBuffer.xMQ(i2 - 1) == -39) {
            return true;
        }
        return false;
    }

    public Pj0.j Uo(Bitmap bitmap) {
        C.Uo(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f52436n.Uo(bitmap)) {
                return Pj0.j.Mx(bitmap, this.f52436n.O());
            }
            int iMUb = com.facebook.imageutils.Ml.mUb(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iMUb), Integer.valueOf(this.f52436n.rl()), Long.valueOf(this.f52436n.J2()), Integer.valueOf(this.f52436n.t()), Integer.valueOf(this.f52436n.nr())));
        } catch (Exception e2) {
            bitmap.recycle();
            throw Xo.n(e2);
        }
    }

    @Override // dF.Ml
    public Pj0.j n(C1653C c1653c, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsJ2 = J2(c1653c.FX(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.n(optionsJ2, colorSpace);
        }
        Pj0.j jVarT = c1653c.T();
        C.Uo(jVarT);
        try {
            return Uo(t(jVarT, optionsJ2));
        } finally {
            Pj0.j.M7(jVarT);
        }
    }

    @Override // dF.Ml
    public Pj0.j rl(C1653C c1653c, Bitmap.Config config, Rect rect, int i2, ColorSpace colorSpace) {
        BitmapFactory.Options optionsJ2 = J2(c1653c.FX(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.n(optionsJ2, colorSpace);
        }
        Pj0.j jVarT = c1653c.T();
        C.Uo(jVarT);
        try {
            return Uo(nr(jVarT, i2, optionsJ2));
        } finally {
            Pj0.j.M7(jVarT);
        }
    }
}
