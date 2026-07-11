package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@RestrictTo
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    protected final Constructor KN;
    protected final Class Uo;
    protected final Method az;
    protected final Method gh;
    protected final Method mUb;
    protected final Method qie;
    protected final Method xMQ;

    private boolean Z(Object obj) {
        try {
            return ((Boolean) this.gh.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Context context, Object obj, String str, int i2, int i3, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.xMQ.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Method S(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method ViF(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Typeface az(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.Uo, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.az.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Constructor g(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface t(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface typefaceAz;
        Object obj;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (XQ()) {
            Map mapKN = TypefaceCompatUtil.KN(context, fontInfoArr, cancellationSignal);
            Object objCk = ck();
            if (objCk == null) {
                return null;
            }
            int length = fontInfoArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                FontsContractCompat.FontInfo fontInfo = fontInfoArr[i3];
                ByteBuffer byteBuffer = (ByteBuffer) mapKN.get(fontInfo.nr());
                if (byteBuffer == null) {
                    obj = objCk;
                } else {
                    boolean zO = o(objCk, byteBuffer, fontInfo.t(), fontInfo.O(), fontInfo.J2() ? 1 : 0);
                    obj = objCk;
                    if (!zO) {
                        Ik(obj);
                        return null;
                    }
                    z2 = true;
                }
                i3++;
                objCk = obj;
                z2 = z2;
            }
            Object obj2 = objCk;
            if (!z2) {
                Ik(obj2);
                return null;
            }
            if (Z(obj2) && (typefaceAz = az(obj2)) != null) {
                return Typeface.create(typefaceAz, i2);
            }
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
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontInfoMUb.O()).setItalic(fontInfoMUb.J2()).build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    protected Method te(Class cls) {
        return cls.getMethod(V8ValueBuiltInObject.FUNCTION_FREEZE, new Class[0]);
    }

    private void Ik(Object obj) {
        try {
            this.qie.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean XQ() {
        if (this.xMQ == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.xMQ != null;
    }

    private Object ck() {
        try {
            return this.KN.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i5) {
        try {
            return ((Boolean) this.mUb.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Method WPU(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method aYN(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Class nY() {
        return Class.forName("android.graphics.FontFamily");
    }

    public TypefaceCompatApi26Impl() {
        Class clsNY;
        Constructor constructorG;
        Method methodWPU;
        Method methodAYN;
        Method methodTe;
        Method methodS;
        Method methodViF;
        try {
            clsNY = nY();
            constructorG = g(clsNY);
            methodWPU = WPU(clsNY);
            methodAYN = aYN(clsNY);
            methodTe = te(clsNY);
            methodS = S(clsNY);
            methodViF = ViF(clsNY);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            clsNY = null;
            constructorG = null;
            methodWPU = null;
            methodAYN = null;
            methodTe = null;
            methodS = null;
            methodViF = null;
        }
        this.Uo = clsNY;
        this.KN = constructorG;
        this.xMQ = methodWPU;
        this.mUb = methodAYN;
        this.gh = methodTe;
        this.qie = methodS;
        this.az = methodViF;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface J2(Context context, Resources resources, int i2, String str, int i3) {
        if (!XQ()) {
            return super.J2(context, resources, i2, str, i3);
        }
        Object objCk = ck();
        if (objCk == null) {
            return null;
        }
        if (!r(context, objCk, str, 0, -1, -1, null)) {
            Ik(objCk);
            return null;
        }
        if (!Z(objCk)) {
            return null;
        }
        return az(objCk);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public /* bridge */ /* synthetic */ Typeface nr(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        return super.nr(context, cancellationSignal, list, i2);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface rl(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        if (!XQ()) {
            return super.rl(context, fontFamilyFilesResourceEntry, resources, i2);
        }
        Object objCk = ck();
        if (objCk == null) {
            return null;
        }
        FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArrN = fontFamilyFilesResourceEntry.n();
        int length = fontFileResourceEntryArrN.length;
        int i3 = 0;
        while (i3 < length) {
            FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = fontFileResourceEntryArrN[i3];
            Context context2 = context;
            if (!r(context2, objCk, fontFileResourceEntry.n(), fontFileResourceEntry.t(), fontFileResourceEntry.O(), fontFileResourceEntry.J2() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.nr()))) {
                Ik(objCk);
                return null;
            }
            i3++;
            context = context2;
        }
        if (!Z(objCk)) {
            return null;
        }
        return az(objCk);
    }
}
