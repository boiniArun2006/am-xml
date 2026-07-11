package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@RestrictTo
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Method f36422O;
    private static Method nr;
    private static Class rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Constructor f36423t;

    private File ty(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface t(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface typefaceO;
        if (fontInfoArr.length < 1) {
            return null;
        }
        FontsContractCompat.FontInfo fontInfoMUb = mUb(fontInfoArr, i2);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfoMUb.nr(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileTy = ty(parcelFileDescriptorOpenFileDescriptor);
                if (fileTy == null || !fileTy.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceO = super.O(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceO = Typeface.createFromFile(fileTy);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceO;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private static void HI() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (J2) {
            return;
        }
        J2 = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f36423t = constructor;
        rl = cls;
        nr = method2;
        f36422O = method;
    }

    TypefaceCompatApi21Impl() {
    }

    private static Typeface az(Object obj) {
        HI();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) rl, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f36422O.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object ck() {
        HI();
        try {
            return f36423t.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean qie(Object obj, String str, int i2, boolean z2) {
        HI();
        try {
            return ((Boolean) nr.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface rl(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        Object objCk = ck();
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.n()) {
            File fileO = TypefaceCompatUtil.O(context);
            if (fileO == null) {
                return null;
            }
            try {
                if (!TypefaceCompatUtil.t(fileO, resources, fontFileResourceEntry.rl())) {
                    return null;
                }
                if (!qie(objCk, fileO.getPath(), fontFileResourceEntry.O(), fontFileResourceEntry.J2())) {
                    return null;
                }
                fileO.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileO.delete();
            }
        }
        return az(objCk);
    }
}
