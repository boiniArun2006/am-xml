package FQq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: renamed from: FQq.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class AbstractC1347z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f2586n = new HashMap();
    private static final Set rl = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f2587t = {80, 75, 3, 4};
    private static final byte[] nr = {31, -117, 8};

    private static com.airbnb.lottie.z KN(final String str, Callable callable, Runnable runnable) {
        Dsr dsrN = str == null ? null : ES.CN3.rl().n(str);
        com.airbnb.lottie.z zVar = dsrN != null ? new com.airbnb.lottie.z(dsrN) : null;
        if (str != null) {
            Map map = f2586n;
            if (map.containsKey(str)) {
                zVar = (com.airbnb.lottie.z) map.get(str);
            }
        }
        if (zVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return zVar;
        }
        com.airbnb.lottie.z zVar2 = new com.airbnb.lottie.z(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            zVar2.nr(new Q() { // from class: FQq.Pl
                @Override // FQq.Q
                public final void onResult(Object obj) {
                    AbstractC1347z.Uo(str, atomicBoolean, (Dsr) obj);
                }
            });
            zVar2.t(new Q() { // from class: FQq.Xo
                @Override // FQq.Q
                public final void onResult(Object obj) {
                    AbstractC1347z.n(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f2586n;
                map2.put(str, zVar2);
                if (map2.size() == 1) {
                    N(false);
                }
            }
        }
        return zVar2;
    }

    public static ci ck(InputStream inputStream, String str) {
        return Ik(inputStream, str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x014b A[Catch: IOException -> 0x02af, TryCatch #2 {IOException -> 0x02af, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017c, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0169, B:69:0x0120, B:74:0x016d, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:125:0x000f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ci fD(Context context, ZipInputStream zipInputStream, String str) {
        Dsr dsrN;
        FileOutputStream fileOutputStream;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            dsrN = null;
        } else {
            try {
                dsrN = ES.CN3.rl().n(str);
            } catch (IOException e2) {
                return new ci((Throwable) e2);
            }
        }
        if (dsrN != null) {
            return new ci(dsrN);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        Dsr dsr = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                dsr = (Dsr) Z(Rc.w6.FX(Okio.buffer(Okio.source(zipInputStream))), null, false).rl();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new ci((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    x0.CN3.nr("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i2);
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        fileOutputStream.close();
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            x0.CN3.t("Failed to delete temp font file " + file.getAbsolutePath() + KfLR.EvSqP);
                        }
                        map2.put(str3, typefaceCreateFromFile2);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } finally {
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (dsr == null) {
            return new ci((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            UGc uGcXMQ = xMQ(dsr, (String) entry.getKey());
            if (uGcXMQ != null) {
                uGcXMQ.Uo(x0.eO.az((Bitmap) entry.getValue(), uGcXMQ.J2(), uGcXMQ.nr()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z2 = false;
            for (ES.w6 w6Var : dsr.Uo().values()) {
                if (w6Var.n().equals(entry2.getKey())) {
                    w6Var.O((Typeface) entry2.getValue());
                    z2 = true;
                }
            }
            if (!z2) {
                x0.CN3.t("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it = dsr.mUb().entrySet().iterator();
            while (it.hasNext()) {
                UGc uGc = (UGc) ((Map.Entry) it.next()).getValue();
                if (uGc == null) {
                    return null;
                }
                String strT = uGc.t();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strT.startsWith("data:") && strT.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strT.substring(strT.indexOf(44) + 1), 0);
                        uGc.Uo(x0.eO.az(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), uGc.J2(), uGc.nr()));
                    } catch (IllegalArgumentException e3) {
                        x0.CN3.nr("data URL did not have correct base64 format.", e3);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            ES.CN3.rl().t(str, dsr);
        }
        return new ci(dsr);
    }

    public static ci r(Rc.w6 w6Var, String str) {
        return o(w6Var, str, true);
    }

    public static ci te(Context context, ZipInputStream zipInputStream, String str) {
        return iF(context, zipInputStream, str, true);
    }

    private static Boolean E2(BufferedSource bufferedSource) {
        return T(bufferedSource, nr);
    }

    public static com.airbnb.lottie.z HI(final InputStream inputStream, final String str) {
        return KN(str, new Callable() { // from class: FQq.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1347z.ck(inputStream, str);
            }
        }, new Runnable() { // from class: FQq.o
            @Override // java.lang.Runnable
            public final void run() {
                x0.eO.t(inputStream);
            }
        });
    }

    private static void N(boolean z2) {
        ArrayList arrayList = new ArrayList(rl);
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.j.n(arrayList.get(0));
        throw null;
    }

    public static /* synthetic */ void Uo(String str, AtomicBoolean atomicBoolean, Dsr dsr) {
        Map map = f2586n;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            N(true);
        }
    }

    public static ci ViF(Context context, int i2, String str) {
        Dsr dsrN = str == null ? null : ES.CN3.rl().n(str);
        if (dsrN != null) {
            return new ci(dsrN);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i2)));
            if (X(bufferedSourceBuffer).booleanValue()) {
                return te(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (!E2(bufferedSourceBuffer).booleanValue()) {
                return r(Rc.w6.FX(bufferedSourceBuffer), str);
            }
            try {
                return ck(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
            } catch (IOException e2) {
                return new ci((Throwable) e2);
            }
        } catch (Resources.NotFoundException e3) {
            return new ci((Throwable) e3);
        }
    }

    public static com.airbnb.lottie.z WPU(Context context, final int i2, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return KN(str, new Callable() { // from class: FQq.eO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1347z.t(weakReference, applicationContext, i2, str);
            }
        }, null);
    }

    private static Boolean X(BufferedSource bufferedSource) {
        return T(bufferedSource, f2587t);
    }

    private static ci Z(Rc.w6 w6Var, String str, boolean z2) {
        Dsr dsrN;
        try {
            if (str == null) {
                dsrN = null;
            } else {
                try {
                    dsrN = ES.CN3.rl().n(str);
                } catch (Exception e2) {
                    ci ciVar = new ci((Throwable) e2);
                    if (z2) {
                        x0.eO.t(w6Var);
                    }
                    return ciVar;
                }
            }
            if (dsrN != null) {
                ci ciVar2 = new ci(dsrN);
                if (z2) {
                    x0.eO.t(w6Var);
                }
                return ciVar2;
            }
            Dsr dsrN2 = c.Q.n(w6Var);
            if (str != null) {
                ES.CN3.rl().t(str, dsrN2);
            }
            ci ciVar3 = new ci(dsrN2);
            if (z2) {
                x0.eO.t(w6Var);
            }
            return ciVar3;
        } catch (Throwable th) {
            if (z2) {
                x0.eO.t(w6Var);
            }
            throw th;
        }
    }

    public static ci az(Context context, String str, String str2) {
        Dsr dsrN = str2 == null ? null : ES.CN3.rl().n(str2);
        if (dsrN != null) {
            return new ci(dsrN);
        }
        try {
            return ty(context, context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new ci((Throwable) e2);
        }
    }

    public static com.airbnb.lottie.z g(final Context context, final String str, final String str2) {
        return KN(str2, new Callable() { // from class: FQq.aC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1347z.rl(context, str, str2);
            }
        }, null);
    }

    public static com.airbnb.lottie.z mUb(Context context, String str) {
        return gh(context, str, "asset_" + str);
    }

    public static /* synthetic */ void n(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = f2586n;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            N(true);
        }
    }

    private static String nHg(Context context, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(e(context) ? "_night_" : "_day_");
        sb.append(i2);
        return sb.toString();
    }

    public static com.airbnb.lottie.z nY(Context context, String str) {
        return g(context, str, "url_" + str);
    }

    public static ci qie(Context context, String str) {
        return az(context, str, "asset_" + str);
    }

    public static ci ty(Context context, InputStream inputStream, String str) {
        Dsr dsrN = str == null ? null : ES.CN3.rl().n(str);
        if (dsrN != null) {
            return new ci(dsrN);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
            return X(bufferedSourceBuffer).booleanValue() ? te(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : E2(bufferedSourceBuffer).booleanValue() ? ck(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str) : r(Rc.w6.FX(bufferedSourceBuffer), str);
        } catch (IOException e2) {
            return new ci((Throwable) e2);
        }
    }

    public static ci Ik(InputStream inputStream, String str, boolean z2) {
        return XQ(Okio.source(inputStream), str, z2);
    }

    public static com.airbnb.lottie.z S(Context context, int i2) {
        return WPU(context, i2, nHg(context, i2));
    }

    private static Boolean T(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : bArr) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e2) {
            x0.CN3.rl("Failed to check zip file header", e2);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static ci XQ(Source source, String str, boolean z2) {
        return Z(Rc.w6.FX(Okio.buffer(source)), str, z2);
    }

    public static ci aYN(Context context, int i2) {
        return ViF(context, i2, nHg(context, i2));
    }

    private static boolean e(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static com.airbnb.lottie.z gh(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return KN(str2, new Callable() { // from class: FQq.qz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1347z.az(applicationContext, str, str2);
            }
        }, null);
    }

    public static ci iF(Context context, ZipInputStream zipInputStream, String str, boolean z2) {
        try {
            return fD(context, zipInputStream, str);
        } finally {
            if (z2) {
                x0.eO.t(zipInputStream);
            }
        }
    }

    public static ci o(Rc.w6 w6Var, String str, boolean z2) {
        return Z(w6Var, str, z2);
    }

    public static /* synthetic */ ci rl(Context context, String str, String str2) {
        ci ciVarT = I28.mUb(context).t(context, str, str2);
        if (str2 != null && ciVarT.rl() != null) {
            ES.CN3.rl().t(str2, (Dsr) ciVarT.rl());
        }
        return ciVarT;
    }

    public static /* synthetic */ ci t(WeakReference weakReference, Context context, int i2, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return ViF(context, i2, str);
    }

    private static UGc xMQ(Dsr dsr, String str) {
        for (UGc uGc : dsr.mUb().values()) {
            if (uGc.t().equals(str)) {
                return uGc;
            }
        }
        return null;
    }
}
