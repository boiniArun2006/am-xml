package w9;

import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import t2.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap O(Bitmap bitmap, ExifInterface exifInterface) {
        int iUo = exifInterface.Uo("Orientation", 1);
        int i2 = iUo != 3 ? iUo != 6 ? iUo != 8 ? 0 : 270 : 90 : 180;
        if (i2 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "{\n        val matrix = M…ight, matrix, true)\n    }");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LQ.j nr(Context context, Uri uri, int i2) throws fuX.j {
        LQ.fuX fux = new LQ.fuX();
        try {
            LQ.j jVarN = v9.Ml.n(context, uri);
            if (jVarN instanceof j.n) {
                jVarN = new j.n(t2.n.n((t2.I28) ((j.n) jVarN).n()));
            } else if (!(jVarN instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Closeable closeable = (Closeable) fux.O(jVarN);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = i2;
                options.inMutable = true;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((InputStream) closeable, null, options);
                if (bitmapDecodeStream == null) {
                    fux.n(j.C1178j.f73438n);
                    throw new KotlinNothingValueException();
                }
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeStream, "ensureNotNull(BitmapFact…ecodeBitmap\n            }");
                CloseableKt.closeFinally(closeable, null);
                return new j.w6(bitmapDecodeStream);
            } finally {
            }
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    public static final LQ.j t(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        LQ.j jVarN = v9.Ml.n(context, uri);
        if (jVarN instanceof j.n) {
            return jVarN;
        }
        if (!(jVarN instanceof j.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        InputStream inputStream = (InputStream) ((j.w6) jVarN).n();
        try {
            ExifInterface exifInterface = new ExifInterface(inputStream);
            CloseableKt.closeFinally(inputStream, null);
            return new j.w6(exifInterface);
        } finally {
        }
    }
}
