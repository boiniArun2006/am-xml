package aO;

import HI0.Q;
import HI0.gnv;
import Hr.Dsr;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f12850O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f12851n;
    private final int nr;
    private final Q rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final File f12852t;

    public Pl(Context context, Q q2, File file, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(q2, jhotmBbwMbr.EFsgiama);
        this.f12851n = context;
        this.rl = q2;
        this.f12852t = file;
        this.nr = i2;
        this.f12850O = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Function1 function1, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == z.Uo) {
            function1.invoke(null);
        } else {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void S(Ref.ObjectRef objectRef, w6 w6Var) {
        ((File) objectRef.element).mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(new File((File) objectRef.element, w6Var.t() + "_" + w6Var.rl()));
        try {
            w6Var.n().compress(Bitmap.CompressFormat.WEBP, 70, fileOutputStream);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(w6 w6Var) {
        return "getThumbnailInternal ADD TO CACHE : " + w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z(Uri uri, int i2, int i3) {
        return "getThumbnailInternal uri=" + uri + " timeMs=" + i2 + " adjustedTimeMs=" + i3;
    }

    public static /* synthetic */ Bitmap aYN(Pl pl, Uri uri, int i2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return pl.WPU(uri, i2, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) != 0 ? true : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(Uri uri, int i2) {
        return "extractThumbnailSyncInternal uri=" + uri + " timeMs=" + i2 + " OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(Uri uri, int i2) {
        return "extractThumbnailSyncInternal uri=" + uri + " timeMs=" + i2 + " IN";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.io.File] */
    private final Bitmap o(final Uri uri, final int i2, boolean z2, boolean z3, boolean z4) throws InterruptedException {
        final w6 w6VarXMQ;
        Bitmap bitmapDecodeStream;
        w6 w6Var;
        final int i3 = (i2 - (i2 % 1000)) + 500;
        Pair pair = new Pair(uri, Integer.valueOf(i3));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        XoT.C.Uo(this, new Function0() { // from class: aO.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.Z(uri, i2, i3);
            }
        });
        if (z2) {
            w6 w6Var2 = (w6) z.nr.get(pair);
            if (w6Var2 != null) {
                return w6Var2.n();
            }
            synchronized (s4.f12872n) {
                List[] listArr = (List[]) z.f12875O.get(uri);
                if (listArr != null) {
                    Iterator it = listArr[(i3 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) % listArr.length].iterator();
                    while (it.hasNext()) {
                        w6Var = (w6) ((WeakReference) it.next()).get();
                        if (w6Var != null && Intrinsics.areEqual(w6Var.nr(), uri) && i3 >= w6Var.t() && i3 < w6Var.rl()) {
                            break;
                        }
                    }
                    w6Var = null;
                } else {
                    w6Var = null;
                }
            }
            if (w6Var != null) {
                z.qie(pair, w6Var);
                return w6Var.n();
            }
        }
        if (z3 && z.rl && this.f12852t != null) {
            for (Pair pair2 : qie(uri)) {
                int iIntValue = ((Number) pair2.component1()).intValue();
                int iIntValue2 = ((Number) pair2.component2()).intValue();
                if (i3 >= iIntValue && i3 < iIntValue2) {
                    try {
                        if (objectRef.element == 0) {
                            File file = this.f12852t;
                            String string = uri.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            byte[] bArrAz = gnv.az(string);
                            Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
                            objectRef.element = new File(file, gnv.o(bArrAz));
                        }
                        FileInputStream fileInputStream = new FileInputStream(new File((File) objectRef.element, iIntValue + "_" + iIntValue2));
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                            CloseableKt.closeFinally(fileInputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        z.qie(pair, new w6(bitmapDecodeStream, uri, iIntValue, iIntValue2));
                        return bitmapDecodeStream;
                    }
                }
            }
        }
        if (!z4 || (w6VarXMQ = xMQ(uri, i3)) == null) {
            return null;
        }
        XoT.C.Uo(this, new Function0() { // from class: aO.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.XQ(w6VarXMQ);
            }
        });
        z.qie(pair, w6VarXMQ);
        if (this.f12852t != null && z.rl && z.f12877t && z3) {
            if (objectRef.element == 0) {
                File file2 = this.f12852t;
                String string2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                byte[] bArrAz2 = gnv.az(string2);
                Intrinsics.checkNotNullExpressionValue(bArrAz2, "sha1(...)");
                objectRef.element = new File(file2, gnv.o(bArrAz2));
            }
            qie(uri).add(new Pair(Integer.valueOf(w6VarXMQ.t()), Integer.valueOf(w6VarXMQ.rl())));
            n.f12867n.t().transfer(new Runnable() { // from class: aO.C
                @Override // java.lang.Runnable
                public final void run() {
                    Pl.S(objectRef, w6VarXMQ);
                }
            });
        }
        return w6VarXMQ.n();
    }

    public static /* synthetic */ Bitmap r(Pl pl, Uri uri, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        if ((i3 & 8) != 0) {
            z3 = false;
        }
        return pl.Ik(uri, i2, z2, z3);
    }

    public static /* synthetic */ void ty(Pl pl, Uri uri, int i2, boolean z2, boolean z3, boolean z4, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        pl.az(uri, i2, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) != 0 ? true : z4, function1);
    }

    private final w6 xMQ(final Uri uri, final int i2) {
        boolean zN;
        I28 i28 = I28.f12846n;
        synchronized (i28) {
            i28.nr(i28.n());
            zN = i28.n();
        }
        if (!zN) {
            return null;
        }
        try {
            try {
                XoT.C.Uo(this, new Function0() { // from class: aO.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.mUb(uri, i2);
                    }
                });
                try {
                    AssetFileDescriptor assetFileDescriptorNr = this.rl.nr(uri, "r");
                    Hr.Wre wre = new Hr.Wre();
                    try {
                        FileDescriptor fileDescriptor = assetFileDescriptorNr.getFileDescriptor();
                        Intrinsics.checkNotNullExpressionValue(fileDescriptor, "getFileDescriptor(...)");
                        wre.B(fileDescriptor, assetFileDescriptorNr.getStartOffset(), assetFileDescriptorNr.getLength());
                        Dsr.n.Ml mlUo = Hr.CN3.Uo(wre);
                        if (mlUo == null) {
                            Cp.n.n(wre, null);
                            synchronized (i28) {
                                i28.nr(false);
                                Unit unit = Unit.INSTANCE;
                            }
                            return null;
                        }
                        Integer numO = mlUo.O();
                        Dsr.j jVarIk = wre.Ik(mlUo, Math.max(numO != null ? numO.intValue() : 0, (mlUo.Uo() * mlUo.nr()) / 2));
                        long j2 = ((long) i2) * 1000;
                        int iE = (int) (wre.E(j2) / 1000);
                        int iTe = (int) (wre.te(j2) / 1000);
                        Bitmap bitmapIk = z.Ik(jVarIk, mlUo, this.nr, this.f12850O, this.f12851n);
                        XoT.C.Uo(this, new Function0() { // from class: aO.qz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Pl.gh(uri, i2);
                            }
                        });
                        w6 w6Var = bitmapIk != null ? new w6(bitmapIk, uri, iTe, iE) : null;
                        Cp.n.n(wre, null);
                        synchronized (i28) {
                            i28.nr(false);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        return w6Var;
                    } finally {
                    }
                } catch (IOException e2) {
                    XoT.C.ty(this, "IOException Loading Thumbnails", e2);
                    I28 i282 = I28.f12846n;
                    synchronized (i282) {
                        i282.nr(false);
                        Unit unit3 = Unit.INSTANCE;
                        return null;
                    }
                } catch (SecurityException e3) {
                    XoT.C.ty(this, "SecurityException Loading Thumbnails", e3);
                    I28 i283 = I28.f12846n;
                    synchronized (i283) {
                        i283.nr(false);
                        Unit unit4 = Unit.INSTANCE;
                        return null;
                    }
                }
            } catch (IOException e4) {
                FirebaseCrashlytics.getInstance().recordException(e4);
                I28 i284 = I28.f12846n;
                synchronized (i284) {
                    i284.nr(false);
                    Unit unit5 = Unit.INSTANCE;
                    return null;
                }
            }
        } catch (Throwable th) {
            I28 i285 = I28.f12846n;
            synchronized (i285) {
                i285.nr(false);
                Unit unit6 = Unit.INSTANCE;
                throw th;
            }
        }
    }

    public final Bitmap Ik(Uri videoUri, int i2, boolean z2, boolean z3) {
        Bitmap bitmapDecodeStream;
        w6 w6Var;
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        int i3 = (i2 - (i2 % 1000)) + 500;
        Pair pair = new Pair(videoUri, Integer.valueOf(i3));
        if (z2) {
            w6 w6Var2 = (w6) z.nr.get(pair);
            if (w6Var2 != null) {
                return w6Var2.n();
            }
            synchronized (s4.f12872n) {
                List[] listArr = (List[]) z.f12875O.get(videoUri);
                if (listArr != null) {
                    Iterator it = listArr[(i3 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) % listArr.length].iterator();
                    while (it.hasNext()) {
                        w6Var = (w6) ((WeakReference) it.next()).get();
                        if (w6Var != null && Intrinsics.areEqual(w6Var.nr(), videoUri) && i3 >= w6Var.t() && i3 < w6Var.rl()) {
                            break;
                        }
                    }
                    w6Var = null;
                } else {
                    w6Var = null;
                }
            }
            if (w6Var != null) {
                z.qie(pair, w6Var);
                return w6Var.n();
            }
        }
        if (z3 && z.rl && this.f12852t != null) {
            for (Pair pair2 : qie(videoUri)) {
                int iIntValue = ((Number) pair2.component1()).intValue();
                int iIntValue2 = ((Number) pair2.component2()).intValue();
                if (i3 >= iIntValue && i3 < iIntValue2) {
                    try {
                        File file = this.f12852t;
                        String string = videoUri.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        byte[] bArrAz = gnv.az(string);
                        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
                        FileInputStream fileInputStream = new FileInputStream(new File(new File(file, gnv.o(bArrAz)), iIntValue + "_" + iIntValue2));
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                            CloseableKt.closeFinally(fileInputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        z.qie(pair, new w6(bitmapDecodeStream, videoUri, iIntValue, iIntValue2));
                        return bitmapDecodeStream;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap WPU(final Uri videoUri, final int i2, final boolean z2, final boolean z3, final boolean z4) throws InterruptedException {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HI0.qz.t(z.f12876n, new Function0() { // from class: aO.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.ViF(objectRef, this, videoUri, i2, z2, z3, z4, countDownLatch);
            }
        });
        countDownLatch.await();
        return (Bitmap) objectRef.element;
    }

    public final void az(final Uri videoUri, final int i2, final boolean z2, final boolean z3, final boolean z4, final Function1 handleResult) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(handleResult, "handleResult");
        HI0.qz.t(z.f12876n, new Function0() { // from class: aO.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.ck(this.f12839n, videoUri, i2, z2, z3, z4);
            }
        }).Uo(new Function1() { // from class: aO.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pl.HI(handleResult, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.Bitmap] */
    public static final Unit ViF(Ref.ObjectRef objectRef, Pl pl, Uri uri, int i2, boolean z2, boolean z3, boolean z4, CountDownLatch countDownLatch) {
        objectRef.element = pl.o(uri, i2, z2, z3, z4);
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap ck(Pl pl, Uri uri, int i2, boolean z2, boolean z3, boolean z4) throws InterruptedException {
        try {
            Bitmap bitmapO = pl.o(uri, i2, z2, z3, z4);
            if (bitmapO == null) {
                return z.Uo;
            }
            return bitmapO;
        } catch (IOException unused) {
            return z.Uo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List qie(Uri uri) {
        int iIntValue;
        Map map = z.KN;
        Object arrayList = map.get(uri);
        if (arrayList == null) {
            File file = this.f12852t;
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bArrAz = gnv.az(string);
            Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
            File[] fileArrListFiles = new File(file, gnv.o(bArrAz)).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList2 = new ArrayList(fileArrListFiles.length);
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    List listSplit$default = StringsKt.split$default((CharSequence) name, new String[]{"_"}, false, 0, 6, (Object) null);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                        if (intOrNull != null) {
                            iIntValue = intOrNull.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        arrayList3.add(Integer.valueOf(iIntValue));
                    }
                    arrayList2.add(new Pair(Integer.valueOf(((Number) arrayList3.get(0)).intValue()), Integer.valueOf(((Number) arrayList3.get(1)).intValue())));
                }
                arrayList = CollectionsKt.toMutableList((Collection) arrayList2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                map.put(uri, arrayList);
            }
        }
        return (List) arrayList;
    }

    public /* synthetic */ Pl(Context context, Q q2, File file, int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, q2, (i5 & 4) != 0 ? null : file, (i5 & 8) != 0 ? 160 : i2, (i5 & 16) != 0 ? 160 : i3);
    }
}
