package Ic;

import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import lN.Ml;
import ln.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Bitmap.Config f4295n = Bitmap.Config.ARGB_8888;
    private static Method rl;

    @Override // Ic.n
    public Ml n() {
        return null;
    }

    public abstract void nr(Bitmap bitmap);

    private static void t(Bitmap bitmap, Bitmap bitmap2) {
        if (!Q.n() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (rl == null) {
                int i2 = Bitmaps.f52435n;
                rl = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            rl.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
        }
    }

    @Override // Ic.n
    public String getName() {
        return "Unknown postprocessor";
    }

    public void O(Bitmap bitmap, Bitmap bitmap2) {
        t(bitmap, bitmap2);
        nr(bitmap);
    }

    @Override // Ic.n
    public Pj0.j rl(Bitmap bitmap, AbstractC1501Ml abstractC1501Ml) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f4295n;
        }
        Pj0.j jVarNr = abstractC1501Ml.nr(width, height, config);
        try {
            O((Bitmap) jVarNr.eF(), bitmap);
            return jVarNr.clone();
        } finally {
            Pj0.j.M7(jVarNr);
        }
    }
}
