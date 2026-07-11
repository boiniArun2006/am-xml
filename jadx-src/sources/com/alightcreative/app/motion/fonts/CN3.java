package com.alightcreative.app.motion.fonts;

import HI0.Lu;
import HI0.afx;
import Sa.AbstractC1468n;
import XoT.C;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.squareup.moshi.JsonAdapter;
import gP.C2121j;
import gP.EnumC2123w6;
import gP.Pl;
import gP.Xo;
import gP.eO;
import gP.o;
import gP.qz;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CN3 {
    private static List J2;
    private static final Handler KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static List f45780O;
    private static final Handler xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f45781n = new AtomicBoolean(false);
    private static final CountDownLatch rl = new CountDownLatch(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f45782t = new LinkedHashMap();
    private static final WeakHashMap nr = new WeakHashMap();
    private static final Lazy Uo = LazyKt.lazy(new Function0() { // from class: gP.CN3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return com.alightcreative.app.motion.fonts.CN3.xMQ();
        }
    });

    public static final class j extends FontsContractCompat.FontRequestCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f45783n;

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void n(int i2) {
            AMTypefaceError aMTypefaceErrorAz = i2 != -3 ? i2 != -2 ? i2 != -1 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? AMTypefaceError.INSTANCE.az(i2) : AMTypefaceError.INSTANCE.nr() : AMTypefaceError.INSTANCE.t() : AMTypefaceError.INSTANCE.rl() : AMTypefaceError.INSTANCE.O() : AMTypefaceError.INSTANCE.J2() : AMTypefaceError.INSTANCE.n();
            Function1 function1 = this.f45783n;
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(aMTypefaceErrorAz))));
        }

        j(Function1 function1) {
            this.f45783n = function1;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void rl(Typeface typeface) {
            if (typeface != null) {
                this.f45783n.invoke(Result.m312boximpl(Result.m313constructorimpl(typeface)));
                return;
            }
            Function1 function1 = this.f45783n;
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.Uo()))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Typeface S(w6 w6Var, long j2) {
        Typeface typeface;
        if (w6Var == null) {
            return null;
        }
        WeakHashMap weakHashMap = nr;
        synchronized (weakHashMap) {
            WeakReference weakReference = (WeakReference) weakHashMap.get(w6Var);
            typeface = weakReference != null ? (Typeface) weakReference.get() : null;
        }
        if (typeface != null) {
            return typeface;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Z(w6Var, new Function1() { // from class: gP.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.app.motion.fonts.CN3.WPU(objectRef, countDownLatch, (Result) obj);
            }
        });
        if (!countDownLatch.await(j2, TimeUnit.MILLISECONDS)) {
            C.HI(w6Var, new Function0() { // from class: gP.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.app.motion.fonts.CN3.aYN();
                }
            });
        }
        if (objectRef.element == 0) {
            C.HI(w6Var, new Function0() { // from class: gP.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.app.motion.fonts.CN3.ViF();
                }
            });
        }
        return (Typeface) objectRef.element;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("Typeface Loader");
        handlerThread.start();
        KN = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("Typeface Loader");
        handlerThread2.start();
        xMQ = new Handler(handlerThread2.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit E2(File file, Function1 function1, byte[] bArr, VolleyError volleyError) {
        Typeface typeface;
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                Map map = f45782t;
                WeakReference weakReference = (WeakReference) map.get(file);
                if (weakReference != null && (typeface = (Typeface) weakReference.get()) != null) {
                    function1.invoke(Result.m312boximpl(Result.m313constructorimpl(typeface)));
                    return Unit.INSTANCE;
                }
                if (file.exists()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    map.put(file, new WeakReference(typefaceCreateFromFile));
                    function1.invoke(Result.m312boximpl(Result.m313constructorimpl(typefaceCreateFromFile)));
                    return Unit.INSTANCE;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    map.put(file, new WeakReference(typefaceCreateFromFile2));
                    function1.invoke(Result.m312boximpl(Result.m313constructorimpl(typefaceCreateFromFile2)));
                } finally {
                }
            }
        } else if (volleyError != null) {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(volleyError))));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.mUb()))));
        }
        return Unit.INSTANCE;
    }

    public static final String HI(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return gh(w6Var.n(), w6Var.rl());
    }

    public static final List Ik() throws InterruptedException {
        if (f45780O == null) {
            nY();
            rl.await();
        }
        List list = J2;
        Intrinsics.checkNotNull(list);
        List list2 = f45780O;
        Intrinsics.checkNotNull(list2);
        return CollectionsKt.plus((Collection) list, (Iterable) list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ViF() {
        return "TextElementTypeface: Failed to get typeface";
    }

    public static final void X() {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"ttf", "otf"});
        Context applicationContext = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        File[] fileArrListFiles = afx.xMQ(applicationContext).listFiles();
        ArrayList arrayList = null;
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    Intrinsics.checkNotNull(file);
                    if (listListOf.contains(FilesKt.getExtension(file))) {
                        arrayList2.add(file);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (File file2 : arrayList2) {
                Intrinsics.checkNotNull(file2);
                String nameWithoutExtension = FilesKt.getNameWithoutExtension(file2);
                EnumC2123w6 enumC2123w6 = EnumC2123w6.f67559S;
                List listEmptyList = CollectionsKt.emptyList();
                List listListOf2 = CollectionsKt.listOf(new eO(0, false, null));
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                arrayList3.add(new C2121j(nameWithoutExtension, enumC2123w6, listEmptyList, listListOf2, new Pl(name)));
            }
            arrayList = arrayList3;
        }
        J2 = arrayList;
    }

    public static final void Z(final w6 w6Var, final Function1 onComplete) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (w6Var == null) {
            Result.Companion companion = Result.INSTANCE;
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.qie()))));
            return;
        }
        WeakHashMap weakHashMap = nr;
        synchronized (weakHashMap) {
            WeakReference weakReference = (WeakReference) weakHashMap.get(w6Var);
            typeface = weakReference != null ? (Typeface) weakReference.get() : null;
        }
        if (typeface != null) {
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(typeface)));
        } else {
            fD(w6Var.n(), w6Var.rl(), new Function1() { // from class: gP.Dsr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.alightcreative.app.motion.fonts.CN3.XQ(onComplete, w6Var, (Result) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aYN() {
        return "TextElementTypeface: Timeout getting typeface";
    }

    public static final String az(String family, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(family, "family");
        return family + " " + (i2 != 0 ? i2 != 100 ? i2 != 200 ? i2 != 300 ? i2 != 400 ? i2 != 500 ? i2 != 600 ? i2 != 700 ? i2 != 800 ? i2 != 900 ? String.valueOf(i2) : "Black" : "Extra Bold" : "Bold" : "Semi Bold" : "Medium" : "Regular" : "Light" : "Extra Light" : "Thin" : "") + (z2 ? " Italic" : "");
    }

    public static final w6 ck() {
        return (w6) Uo.getValue();
    }

    public static final void fD(C2121j c2121j, eO variant, final Function1 onComplete) {
        Typeface typefaceCreateFromFile;
        Typeface typeface;
        Typeface typeface2;
        Intrinsics.checkNotNullParameter(c2121j, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Uri uriN = variant.n();
        if (uriN != null) {
            String str = StringsKt.replace$default(gh(c2121j, variant), " ", "_", false, 4, (Object) null) + ".ttf";
            Context applicationContext = IvA.n.rl().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            final File fileResolve = FilesKt.resolve(afx.KN(applicationContext), str);
            Map map = f45782t;
            WeakReference weakReference = (WeakReference) map.get(fileResolve);
            if (weakReference != null && (typeface2 = (Typeface) weakReference.get()) != null) {
                onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(typeface2)));
                return;
            } else {
                if (!fileResolve.exists()) {
                    r().add(new Wre(uriN, new Function2() { // from class: gP.aC
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return com.alightcreative.app.motion.fonts.CN3.E2(fileResolve, onComplete, (byte[]) obj, (VolleyError) obj2);
                        }
                    }));
                    return;
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(fileResolve);
                map.put(fileResolve, new WeakReference(typefaceCreateFromFile2));
                onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(typefaceCreateFromFile2)));
                return;
            }
        }
        if (!(c2121j.t() instanceof Pl)) {
            final FontRequest fontRequestIF = iF(c2121j, variant);
            if (fontRequestIF != null) {
                final j jVar = new j(onComplete);
                xMQ.post(new Runnable() { // from class: gP.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.alightcreative.app.motion.fonts.CN3.e(fontRequestIF, jVar);
                    }
                });
                return;
            } else {
                Result.Companion companion = Result.INSTANCE;
                onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.gh()))));
                return;
            }
        }
        Context applicationContext2 = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        File fileResolve2 = FilesKt.resolve(afx.xMQ(applicationContext2), ((Pl) c2121j.t()).n());
        WeakReference weakReference2 = (WeakReference) f45782t.get(fileResolve2);
        if (weakReference2 != null && (typeface = (Typeface) weakReference2.get()) != null) {
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(typeface)));
            return;
        }
        if (!fileResolve2.exists()) {
            Result.Companion companion2 = Result.INSTANCE;
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.xMQ()))));
            return;
        }
        try {
            typefaceCreateFromFile = Typeface.createFromFile(fileResolve2);
        } catch (RuntimeException unused) {
            typefaceCreateFromFile = null;
        }
        if (typefaceCreateFromFile != null) {
            f45782t.put(fileResolve2, new WeakReference(typefaceCreateFromFile));
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(typefaceCreateFromFile)));
        } else {
            Result.Companion companion3 = Result.INSTANCE;
            onComplete.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(AMTypefaceError.INSTANCE.KN()))));
        }
    }

    public static final String gh(C2121j c2121j, eO variant) {
        Intrinsics.checkNotNullParameter(c2121j, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return az(c2121j.rl(), variant.t(), variant.rl());
    }

    public static final FontRequest iF(C2121j c2121j, eO variant) {
        String strTy;
        String strTe;
        Integer numQie;
        Intrinsics.checkNotNullParameter(c2121j, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        String strMUb = mUb(c2121j);
        if (strMUb == null || (strTy = ty(strMUb)) == null || (strTe = te(c2121j, variant)) == null || (numQie = qie(strMUb)) == null) {
            return null;
        }
        return new FontRequest(strMUb, strTy, strTe, numQie.intValue());
    }

    public static final String mUb(C2121j c2121j) {
        Intrinsics.checkNotNullParameter(c2121j, "<this>");
        o oVarT = c2121j.t();
        if (Intrinsics.areEqual(oVarT, qz.f67557n)) {
            return "com.google.android.gms.fonts";
        }
        if (oVarT instanceof Pl) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void nY() {
        if (f45781n.compareAndSet(false, true)) {
            ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: gP.fuX
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.app.motion.fonts.CN3.g();
                }
            }, 31, null);
        }
    }

    public static final int o() throws InterruptedException {
        if (J2 == null) {
            nY();
            rl.await();
        }
        List list = J2;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static final Integer qie(String authority) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        return Intrinsics.areEqual(authority, "com.google.android.gms.fonts") ? 2130903047 : null;
    }

    public static final String te(C2121j c2121j, eO variant) {
        Intrinsics.checkNotNullParameter(c2121j, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        o oVarT = c2121j.t();
        if (!Intrinsics.areEqual(oVarT, qz.f67557n)) {
            if (oVarT instanceof Pl) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return "name=" + c2121j.rl() + "&weight=" + variant.t() + (variant.rl() ? "&italic=1" : "") + "&besteffort=true";
    }

    public static final String ty(String authority) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        if (Intrinsics.areEqual(authority, "com.google.android.gms.fonts")) {
            return "com.google.android.gms";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit WPU(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, Result result) {
        Object value = result.getValue();
        boolean zM319isFailureimpl = Result.m319isFailureimpl(value);
        T t3 = value;
        if (zM319isFailureimpl) {
            t3 = 0;
        }
        objectRef.element = t3;
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(Function1 function1, w6 w6Var, Result result) {
        Object value = result.getValue();
        if (Result.m319isFailureimpl(value)) {
            value = null;
        }
        Typeface typeface = (Typeface) value;
        if (typeface != null) {
            WeakHashMap weakHashMap = nr;
            synchronized (weakHashMap) {
            }
        }
        function1.invoke(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FontRequest fontRequest, j jVar) {
        FontsContractCompat.nr(IvA.n.rl().getApplicationContext(), fontRequest, jVar, KN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        boolean z2;
        Uri uri;
        String str;
        JsonAdapter jsonAdapterAdapter = Lu.n().adapter(n.class);
        Intrinsics.checkNotNull(jsonAdapterAdapter);
        InputStream inputStreamOpenRawResource = IvA.n.rl().getApplicationContext().getResources().openRawResource(2131951627);
        try {
            Intrinsics.checkNotNull(inputStreamOpenRawResource);
            Source source = Okio.source(inputStreamOpenRawResource);
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(source);
                try {
                    n nVar = (n) jsonAdapterAdapter.fromJson(bufferedSourceBuffer);
                    EnumC2123w6 enumC2123w6 = null;
                    CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    CloseableKt.closeFinally(source, null);
                    CloseableKt.closeFinally(inputStreamOpenRawResource, null);
                    Intrinsics.checkNotNull(nVar);
                    Set<Map.Entry<String, com.alightcreative.app.motion.fonts.j>> setEntrySet = nVar.getFonts().entrySet();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        com.alightcreative.app.motion.fonts.j jVar = (com.alightcreative.app.motion.fonts.j) entry.getValue();
                        boolean z3 = false;
                        int i2 = 0;
                        EnumC2123w6 enumC2123w62 = enumC2123w6;
                        for (EnumC2123w6 enumC2123w63 : EnumC2123w6.values()) {
                            if (enumC2123w63.rl() == jVar.getC()) {
                                if (!z3) {
                                    enumC2123w62 = enumC2123w63;
                                    z3 = true;
                                } else {
                                    throw new IllegalArgumentException("Array contains more than one matching element.");
                                }
                            }
                        }
                        if (z3) {
                            List<Integer> s2 = jVar.getS();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(s2, 10));
                            Iterator<T> it2 = s2.iterator();
                            while (it2.hasNext()) {
                                int iIntValue = ((Number) it2.next()).intValue();
                                Xo[] xoArrValues = Xo.values();
                                int length = xoArrValues.length;
                                int i3 = i2;
                                int i5 = i3;
                                Xo xo = null;
                                while (i3 < length) {
                                    Xo xo2 = xoArrValues[i3];
                                    if (xo2.rl() == iIntValue) {
                                        if (i5 == 0) {
                                            xo = xo2;
                                            i5 = 1;
                                        } else {
                                            throw new IllegalArgumentException("Array contains more than one matching element.");
                                        }
                                    }
                                    i3++;
                                }
                                if (i5 != 0) {
                                    arrayList2.add(xo);
                                    i2 = 0;
                                } else {
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                            List<Integer> v2 = jVar.getV();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(v2, 10));
                            Iterator<T> it3 = v2.iterator();
                            while (it3.hasNext()) {
                                int iIntValue2 = ((Number) it3.next()).intValue();
                                int i7 = (iIntValue2 % 10) * 100;
                                if (iIntValue2 > 9) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Map<Integer, String> f3 = jVar.getF();
                                if (f3 != null && (str = f3.get(Integer.valueOf(iIntValue2))) != null) {
                                    uri = Uri.parse(str);
                                } else {
                                    uri = null;
                                }
                                arrayList3.add(new eO(i7, z2, uri));
                            }
                            arrayList.add(new C2121j(str2, enumC2123w62, arrayList2, arrayList3, qz.f67557n));
                            enumC2123w6 = null;
                        } else {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    f45780O = arrayList;
                    X();
                    rl.countDown();
                    return Unit.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private static final RequestQueue r() {
        return AbstractC1468n.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w6 xMQ() {
        for (C2121j c2121j : Ik()) {
            if (Intrinsics.areEqual(c2121j.rl(), "Roboto") && c2121j.n() != EnumC2123w6.f67559S) {
                Object obj = null;
                boolean z2 = false;
                for (Object obj2 : c2121j.O()) {
                    eO eOVar = (eO) obj2;
                    if (eOVar.t() == 400 && !eOVar.rl()) {
                        if (!z2) {
                            z2 = true;
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                    }
                }
                if (z2) {
                    return new w6(c2121j, (eO) obj);
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
