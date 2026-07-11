package UM7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import bA.C1653C;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 implements w6 {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10645n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f10646t = "SimpleImageTranscoder";

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat rl(com.facebook.imageformat.w6 w6Var) {
            return w6Var == null ? Bitmap.CompressFormat.JPEG : w6Var == com.facebook.imageformat.n.rl ? Bitmap.CompressFormat.JPEG : w6Var == com.facebook.imageformat.n.f52416t ? Bitmap.CompressFormat.PNG : com.facebook.imageformat.n.n(w6Var) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }
    }

    private final int O(C1653C c1653c, dX.fuX fux, dX.CN3 cn3) {
        if (this.f10645n) {
            return UM7.j.rl(fux, cn3, c1653c, this.rl);
        }
        return 1;
    }

    @Override // UM7.w6
    public String n() {
        return this.f10646t;
    }

    @Override // UM7.w6
    public boolean nr(com.facebook.imageformat.w6 imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == com.facebook.imageformat.n.qie || imageFormat == com.facebook.imageformat.n.rl;
    }

    @Override // UM7.w6
    public n rl(C1653C encodedImage, OutputStream outputStream, dX.fuX fux, dX.CN3 cn3, com.facebook.imageformat.w6 w6Var, Integer num, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        dX.fuX fuxN = fux == null ? dX.fuX.f63519t.n() : fux;
        int iO = O(encodedImage, fuxN, cn3);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iO;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.eF(), null, options);
            if (bitmapDecodeStream == null) {
                Dzy.j.KN("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new n(2);
            }
            Matrix matrixUo = I28.Uo(encodedImage, fuxN);
            if (matrixUo != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixUo, false);
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    Dzy.j.xMQ("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    n nVar = new n(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return nVar;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(nr.rl(w6Var), num2.intValue(), outputStream);
                    n nVar2 = new n(iO > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return nVar2;
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    Dzy.j.xMQ("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    n nVar3 = new n(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return nVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e4) {
            Dzy.j.xMQ("SimpleImageTranscoder", "Out-Of-Memory during transcode", e4);
            return new n(2);
        }
    }

    @Override // UM7.w6
    public boolean t(C1653C encodedImage, dX.fuX fux, dX.CN3 cn3) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (fux == null) {
            fux = dX.fuX.f63519t.n();
        }
        return this.f10645n && UM7.j.rl(fux, cn3, encodedImage, this.rl) > 1;
    }

    public CN3(boolean z2, int i2) {
        this.f10645n = z2;
        this.rl = i2;
    }
}
