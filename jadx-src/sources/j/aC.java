package j;

import C6.UGc;
import C6.afx;
import C6.l3D;
import C6.r;
import C6.s4;
import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Activity f69249n;
    private final Handler nr;
    private final ProgressDialog rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f69250t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f69248O = new j(null);
    public static final int J2 = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements Runnable {
        final /* synthetic */ int E2;
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f69251O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f69252S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f69253Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f69254e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f69255g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f69256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ aC f69257o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f69258r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f69259t;

        n(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.LongRef longRef, int i2, Ref.IntRef intRef3, aC aCVar, Ref.IntRef intRef4, int i3, Ref.IntRef intRef5, int i5, Ref.BooleanRef booleanRef) {
            this.f69256n = intRef;
            this.f69259t = intRef2;
            this.f69251O = longRef;
            this.J2 = i2;
            this.f69258r = intRef3;
            this.f69257o = aCVar;
            this.f69253Z = intRef4;
            this.f69252S = i3;
            this.f69255g = intRef5;
            this.E2 = i5;
            this.f69254e = booleanRef;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jNanoTime = System.nanoTime();
            Ref.IntRef intRef = this.f69256n;
            int i2 = intRef.element;
            int i3 = this.f69259t.element;
            if (i2 != i3) {
                intRef.element = i3;
                this.f69251O.element = jNanoTime;
            }
            if ((jNanoTime - this.f69251O.element) / ((long) 1000000) > 15) {
                int iMax = Math.max(1, ((this.J2 - this.f69258r.element) / 1200) + 2);
                Ref.IntRef intRef2 = this.f69258r;
                intRef2.element = Math.min(intRef2.element + iMax, this.J2);
                this.f69251O.element = jNanoTime;
            }
            this.f69257o.nr.removeCallbacks(this);
            this.f69253Z.element = this.f69252S + this.J2;
            this.f69255g.element = (this.E2 * 1000) + this.f69259t.element + this.f69258r.element;
            this.f69257o.KN().setMax(this.f69253Z.element);
            this.f69257o.KN().setProgress(this.f69255g.element);
            if (this.f69254e.element) {
                this.f69257o.nr.postDelayed(this, 15L);
            }
        }
    }

    public aC(Activity activity, ProgressDialog dialog, iF eventLogger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f69249n = activity;
        this.rl = dialog;
        this.f69250t = eventLogger;
        this.nr = new Handler();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String Uo() throws IOException {
        int i2;
        int i3;
        File file = new File("/proc/cpuinfo");
        if (!file.exists()) {
            return "unknown";
        }
        ArrayList arrayList = new ArrayList();
        String str = null;
        List lines$default = FilesKt.readLines$default(file, null, 1, null);
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = lines$default.iterator();
        while (true) {
            i2 = 2;
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) next, (CharSequence) ":", false, 2, (Object) null)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        String strRemovePrefix = null;
        String strRemovePrefix2 = null;
        String strRemovePrefix3 = null;
        int i5 = 0;
        for (String str2 : arrayList2) {
            String strSubstringBefore$default = StringsKt.substringBefore$default(str2, ':', str, i2, (Object) str);
            StringBuilder sb = new StringBuilder();
            int length = strSubstringBefore$default.length();
            while (i3 < length) {
                char cCharAt = strSubstringBefore$default.charAt(i3);
                if (Character.isLetterOrDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
                i3++;
            }
            String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String strSubstringAfter$default = StringsKt.substringAfter$default(str2, ':', (String) null, i2, (Object) null);
            StringBuilder sb2 = new StringBuilder();
            int length2 = strSubstringAfter$default.length();
            for (int i7 = 0; i7 < length2; i7++) {
                char cCharAt2 = strSubstringAfter$default.charAt(i7);
                if (Character.isLetterOrDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            String lowerCase2 = sb2.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1696398744:
                    if (lowerCase.equals("cpuimplementer")) {
                        strRemovePrefix = StringsKt.removePrefix(lowerCase2, (CharSequence) "0x");
                    }
                    break;
                case -1094759278:
                    if (lowerCase.equals("processor")) {
                        i5++;
                        if (strRemovePrefix != null || strRemovePrefix2 != null || strRemovePrefix3 != null) {
                            if (strRemovePrefix == null) {
                                strRemovePrefix = "-";
                            }
                            if (strRemovePrefix2 == null) {
                                strRemovePrefix2 = "-";
                            }
                            if (strRemovePrefix3 == null) {
                                strRemovePrefix3 = "-";
                            }
                            arrayList.add(strRemovePrefix + "." + strRemovePrefix2 + "." + strRemovePrefix3);
                        }
                        strRemovePrefix = null;
                        strRemovePrefix2 = null;
                        strRemovePrefix3 = null;
                    }
                    break;
                case -564272675:
                    if (lowerCase.equals("cpuvariant")) {
                        strRemovePrefix2 = StringsKt.removePrefix(lowerCase2, (CharSequence) "0x");
                    }
                    break;
                case 986501531:
                    if (lowerCase.equals("cpupart")) {
                        strRemovePrefix3 = StringsKt.removePrefix(lowerCase2, (CharSequence) "0x");
                    }
                    break;
            }
            arrayList3.add(Unit.INSTANCE);
            str = null;
            i2 = 2;
            i3 = 0;
        }
        return i5 + ":" + CollectionsKt.joinToString$default(CollectionsKt.toSortedSet(arrayList), ":", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(final aC aCVar, final Function0 function0) {
        ProgressDialog progressDialog = aCVar.rl;
        progressDialog.setProgress(progressDialog.getMax());
        aCVar.nr.postDelayed(new Runnable() { // from class: j.fuX
            @Override // java.lang.Runnable
            public final void run() {
                aC.ty(this.f69260n, function0);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(Ref.IntRef intRef, int i2, n nVar) {
        intRef.element = i2;
        nVar.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(aC aCVar, final Ref.IntRef intRef, final n nVar, int i2, int i3) {
        final int i5 = (i2 * 1000) / i3;
        aCVar.nr.post(new Runnable() { // from class: j.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                aC.gh(intRef, i5, nVar);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(aC aCVar, int i2) {
        aCVar.rl.setProgress(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(aC aCVar, Function0 function0) {
        if (!aCVar.f69249n.isDestroyed()) {
            aCVar.rl.dismiss();
        }
        function0.invoke();
    }

    public final ProgressDialog KN() {
        return this.rl;
    }

    public final void xMQ(final Function0 onComplete) {
        List list;
        boolean z2 = true;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        MediaCodecInfo[] codecInfos = Hr.aC.qie().getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            } else {
                arrayList2.add(mediaCodecInfo);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            String[] supportedTypes = ((MediaCodecInfo) obj).getSupportedTypes();
            Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
            if (ArraysKt.contains(supportedTypes, "video/avc")) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            String[] supportedTypes2 = ((MediaCodecInfo) obj2).getSupportedTypes();
            Intrinsics.checkNotNullExpressionValue(supportedTypes2, "getSupportedTypes(...)");
            if (ArraysKt.contains(supportedTypes2, "video/hevc")) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list3) {
            String[] supportedTypes3 = ((MediaCodecInfo) obj3).getSupportedTypes();
            Intrinsics.checkNotNullExpressionValue(supportedTypes3, "getSupportedTypes(...)");
            if (ArraysKt.contains(supportedTypes3, "video/avc")) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : list3) {
            String[] supportedTypes4 = ((MediaCodecInfo) obj4).getSupportedTypes();
            Intrinsics.checkNotNullExpressionValue(supportedTypes4, "getSupportedTypes(...)");
            if (ArraysKt.contains(supportedTypes4, "video/hevc")) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((MediaCodecInfo) it.next()).getCapabilitiesForType("video/avc").getVideoCapabilities().getSupportedHeights().getUpper();
            if (num != null) {
                arrayList7.add(num);
            }
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList7);
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            Integer num3 = (Integer) ((MediaCodecInfo) it2.next()).getCapabilitiesForType("video/avc").getVideoCapabilities().getSupportedHeights().getUpper();
            if (num3 != null) {
                arrayList8.add(num3);
            }
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList8);
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Integer num5 = (Integer) ((MediaCodecInfo) it3.next()).getCapabilitiesForType("video/hevc").getVideoCapabilities().getSupportedHeights().getUpper();
            if (num5 != null) {
                arrayList9.add(num5);
            }
        }
        Integer num6 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList9);
        ArrayList arrayList10 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Integer num7 = (Integer) ((MediaCodecInfo) it4.next()).getCapabilitiesForType("video/hevc").getVideoCapabilities().getSupportedHeights().getUpper();
            if (num7 != null) {
                arrayList10.add(num7);
            }
        }
        Integer num8 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList10);
        String str = "CapabilityCheck";
        Log.d("CapabilityCheck", "maxAvcEncHeight=" + num2 + " maxAvcDecHeight=" + num4 + " maxHevcEncHeight=" + num6 + " maxHevcDecHeight=" + num8);
        List listListOf = CollectionsKt.listOf((Object[]) new s4[]{UGc.rl(1280, 720, 1000, 4, 0, 0, 0, 112, null), UGc.rl(1920, 1080, 1000, 4, 0, 0, 0, 112, null), UGc.rl(2560, 1440, 1000, 4, 0, 0, 0, 112, null), UGc.rl(3840, 2160, 1000, 4, 0, 0, 0, 112, null)});
        Integer num9 = (Integer) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new Integer[]{(Integer) CollectionsKt.minOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new Integer[]{num2, num4})), (Integer) CollectionsKt.minOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new Integer[]{num6, num8}))}));
        if (num9 != null) {
            ArrayList arrayList11 = new ArrayList();
            for (Object obj5 : listListOf) {
                if (((s4) obj5).t() <= num9.intValue()) {
                    arrayList11.add(obj5);
                }
            }
            list = arrayList11;
        } else {
            list = listListOf;
        }
        long jNanoTime = System.nanoTime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ref.IntRef intRef = new Ref.IntRef();
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.nanoTime();
        Ref.IntRef intRef2 = new Ref.IntRef();
        Ref.IntRef intRef3 = new Ref.IntRef();
        Iterator it5 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next = it5.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            s4 s4Var = (s4) next;
            int size = list.size() * 1000;
            Integer num10 = num8;
            final Ref.IntRef intRef4 = new Ref.IntRef();
            Integer num11 = num6;
            Ref.IntRef intRef5 = new Ref.IntRef();
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = z2;
            Integer num12 = num4;
            String str2 = str;
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            final n nVar = new n(intRef5, intRef4, longRef, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, intRef, this, intRef3, size, intRef2, i2, booleanRef);
            Context applicationContext = IvA.n.rl().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            r rVarR = new l3D(s4Var, applicationContext).r(new Function2() { // from class: j.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return aC.mUb(this.f69241n, intRef4, nVar, ((Integer) obj6).intValue(), ((Integer) obj7).intValue());
                }
            });
            booleanRef.element = false;
            this.nr.removeCallbacks(nVar);
            Integer numValueOf = Integer.valueOf(s4Var.t());
            if (rVarR.t() > 0) {
                iT = rVarR.t();
            } else if (rVarR.nr() > 0) {
                iT = 0;
            }
            linkedHashMap3.put(numValueOf, Integer.valueOf(iT));
            Log.d(str2, "CodecTestResult: " + afx.nr(rVarR));
            linkedHashMap2 = linkedHashMap3;
            num4 = num12;
            i2 = i3;
            num8 = num10;
            z2 = true;
            str = str2;
            num6 = num11;
        }
        Integer num13 = num4;
        Integer num14 = num6;
        Integer num15 = num8;
        String str3 = str;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000000;
        Log.d(str3, "CodecTestResult: elapsed=" + jNanoTime2 + " seconds (avc=" + num2 + "/" + num13 + " hevc=" + num14 + "/" + num15 + ")");
        for (Iterator it6 = linkedHashMap4.entrySet().iterator(); it6.hasNext(); it6 = it6) {
            Map.Entry entry = (Map.Entry) it6.next();
            Log.d(str3, "CodecTestResult:         " + ((Number) entry.getKey()).intValue() + "p : " + ((Number) entry.getValue()).intValue() + " layers");
        }
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        Integer num16 = (Integer) linkedHashMap4.get(720);
        jVar.setMaxLayers720(num16 != null ? num16.intValue() : -1);
        Integer num17 = (Integer) linkedHashMap4.get(1080);
        jVar.setMaxLayers1080(num17 != null ? num17.intValue() : -1);
        Integer num18 = (Integer) linkedHashMap4.get(1440);
        jVar.setMaxLayers1440(num18 != null ? num18.intValue() : -1);
        Integer num19 = (Integer) linkedHashMap4.get(2160);
        jVar.setMaxLayers2160(num19 != null ? num19.intValue() : -1);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
            if (((Number) entry2.getValue()).intValue() >= 0) {
                linkedHashMap5.put(entry2.getKey(), entry2.getValue());
            }
        }
        Integer num20 = (Integer) CollectionsKt.maxOrNull((Iterable) linkedHashMap5.keySet());
        jVar.setMaxRes(num20 != null ? num20.intValue() : 540);
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
            if (((Number) entry3.getValue()).intValue() > 0) {
                linkedHashMap6.put(entry3.getKey(), entry3.getValue());
            }
        }
        Integer num21 = (Integer) CollectionsKt.maxOrNull((Iterable) linkedHashMap6.keySet());
        jVar2.setMaxResWithVideo(num21 != null ? num21.intValue() : 540);
        com.alightcreative.app.motion.persist.j jVar3 = com.alightcreative.app.motion.persist.j.INSTANCE;
        String str4 = Build.PRODUCT;
        jVar3.setDeviceCapsCheckProd(str4);
        jVar3.setDeviceCapsCheckBypassed(false);
        jVar3.setDeviceCapsCheckSuccess(true);
        jVar3.setDeviceCapsCheckSource("Capability Check");
        C.n();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        HI0.afx.nr(this.f69249n).getMemoryInfo(memoryInfo);
        int i5 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i7 = Resources.getSystem().getDisplayMetrics().heightPixels;
        String str5 = Math.max(i5, i7) + "," + Math.min(i5, i7);
        String strUo = Uo();
        iF iFVar = this.f69250t;
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinEventTypes.USER_VIEWED_PRODUCT, str4);
        bundle.putString("model", Build.MODEL);
        bundle.putString("manufacturer", Build.MANUFACTURER);
        bundle.putString("chipset", AbstractC2487Wre.mUb().n());
        bundle.putString("board", Build.BOARD);
        bundle.putInt("attempts", jVar3.getDeviceCapsCheckAttempts());
        bundle.putInt("maxLayers720", jVar3.getMaxLayers720());
        bundle.putInt("maxLayers1080", jVar3.getMaxLayers1080());
        bundle.putInt("maxLayers1440", jVar3.getMaxLayers1440());
        bundle.putInt("maxLayers2160", jVar3.getMaxLayers2160());
        bundle.putInt("maxRes", jVar3.getMaxRes());
        bundle.putInt("testVer", 4);
        bundle.putLong("elapsed", jNanoTime2);
        bundle.putLong("availMem", memoryInfo.availMem);
        bundle.putLong("totalMem", memoryInfo.totalMem);
        bundle.putLong("uptimeMillis", SystemClock.uptimeMillis());
        bundle.putString("screenSize", str5);
        bundle.putString("cpuInfo", strUo);
        bundle.putInt("maxAvcEncHeight", num2 != null ? num2.intValue() : 0);
        bundle.putInt("maxAvcDecHeight", num13 != null ? num13.intValue() : 0);
        bundle.putInt("maxHevcEncHeight", num14 != null ? num14.intValue() : 0);
        bundle.putInt("maxHevcDecHeight", num15 != null ? num15.intValue() : 0);
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("device_caps_check_result", bundle));
        int iMax = Math.max(1, (intRef3.element - intRef2.element) / 50);
        Random random = new Random();
        while (intRef2.element < intRef3.element) {
            Thread.sleep(15L);
            int i8 = iMax / 2;
            final int iCoerceAtMost = RangesKt.coerceAtMost(intRef2.element + i8 + random.nextInt(i8 + 1) + 1, intRef3.element);
            intRef2.element = iCoerceAtMost;
            this.nr.post(new Runnable() { // from class: j.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    aC.qie(this.f69245n, iCoerceAtMost);
                }
            });
        }
        this.nr.post(new Runnable() { // from class: j.CN3
            @Override // java.lang.Runnable
            public final void run() {
                aC.az(this.f69235n, onComplete);
            }
        });
    }
}
