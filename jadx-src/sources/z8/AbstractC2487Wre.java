package z8;

import HI0.afx;
import XoT.C;
import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: z8.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC2487Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C2490j f76365n;
    private static final Lazy rl = LazyKt.lazy(new Function0() { // from class: z8.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(AbstractC2487Wre.KN());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KN() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context applicationContext = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        afx.nr(applicationContext).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(Ref.IntRef intRef, Ref.IntRef intRef2) {
        return "CodecInfo: maxImportSize=" + intRef.element + " maxExportSize=" + intRef2.element;
    }

    public static final long gh() {
        return ((Number) rl.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6 A[PHI: r0 r1
      0x01f6: PHI (r0v11 java.util.List) = (r0v10 java.util.List), (r0v10 java.util.List), (r0v13 java.util.List), (r0v10 java.util.List) binds: [B:45:0x0152, B:47:0x015e, B:122:0x01f6, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r1v10 java.util.List) = (r1v9 java.util.List), (r1v9 java.util.List), (r1v12 java.util.List), (r1v9 java.util.List) binds: [B:45:0x0152, B:47:0x015e, B:122:0x01f6, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2490j mUb() {
        String str;
        String str2;
        List list;
        List list2;
        if (f76365n == null) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"avc", "h264", "h.264"});
            List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{540, 720, 1080, 1440, 2160});
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            Iterator it = ArrayIteratorKt.iterator(Hr.aC.qie().getCodecInfos());
            while (true) {
                int i2 = 2;
                boolean z2 = false;
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                final MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
                Iterator it2 = ArrayIteratorKt.iterator(mediaCodecInfo.getSupportedTypes());
                while (it2.hasNext()) {
                    final MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType((String) it2.next());
                    String mimeType = capabilitiesForType.getMimeType();
                    if (capabilitiesForType.getVideoCapabilities() != null) {
                        Intrinsics.checkNotNull(mimeType);
                        if (StringsKt.contains$default(mimeType, "video", z2, i2, obj)) {
                            if (listListOf == null || !listListOf.isEmpty()) {
                                Iterator it3 = listListOf.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (StringsKt.contains$default(mimeType, (String) it3.next(), z2, i2, obj)) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listListOf2) {
                                            int iIntValue = ((Number) obj2).intValue();
                                            if (capabilitiesForType.getVideoCapabilities().isSizeSupported((iIntValue * 16) / 9, iIntValue)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        final Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
                                        if (num != null) {
                                            if (mediaCodecInfo.isEncoder()) {
                                                intRef2.element = Math.max(intRef2.element, num.intValue());
                                            } else {
                                                intRef.element = Math.max(intRef.element, num.intValue());
                                            }
                                        }
                                        C.KN("DeviceCaps", new Function0() { // from class: z8.n
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AbstractC2487Wre.O(mediaCodecInfo, capabilitiesForType, num);
                                            }
                                        });
                                    }
                                }
                            }
                            i2 = 2;
                            z2 = false;
                            obj = null;
                        }
                    }
                }
            }
            Set setEmptySet = SetsKt.emptySet();
            Set setEmptySet2 = SetsKt.emptySet();
            Iterator it4 = ArrayIteratorKt.iterator(Hr.aC.qie().getCodecInfos());
            Set setPlus = setEmptySet;
            Set setPlus2 = setEmptySet2;
            while (it4.hasNext()) {
                final MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) it4.next();
                Iterator it5 = ArrayIteratorKt.iterator(mediaCodecInfo2.getSupportedTypes());
                while (it5.hasNext()) {
                    final MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo2.getCapabilitiesForType((String) it5.next());
                    String mimeType2 = capabilitiesForType2.getMimeType();
                    if (capabilitiesForType2.getVideoCapabilities() != null) {
                        Intrinsics.checkNotNull(mimeType2);
                        if (!StringsKt.contains$default((CharSequence) mimeType2, (CharSequence) "video", false, 2, (Object) null) || (listListOf != null && listListOf.isEmpty())) {
                            list = listListOf;
                            list2 = listListOf2;
                        } else {
                            Iterator it6 = listListOf.iterator();
                            while (it6.hasNext()) {
                                list = listListOf;
                                list2 = listListOf2;
                                if (StringsKt.contains$default((CharSequence) mimeType2, (CharSequence) it6.next(), false, 2, (Object) null)) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : list2) {
                                        int iIntValue2 = ((Number) obj3).intValue();
                                        if (capabilitiesForType2.getVideoCapabilities().isSizeSupported((iIntValue2 * 16) / 9, iIntValue2)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    final Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
                                    if (num2 != null) {
                                        if (mediaCodecInfo2.isEncoder()) {
                                            if (intRef2.element == num2.intValue()) {
                                                setPlus = SetsKt.plus((Set<? extends String>) setPlus, mediaCodecInfo2.getName());
                                            }
                                        } else if (intRef.element == num2.intValue()) {
                                            setPlus2 = SetsKt.plus((Set<? extends String>) setPlus2, mediaCodecInfo2.getName());
                                        }
                                    }
                                    C.KN("DeviceCaps", new Function0() { // from class: z8.w6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AbstractC2487Wre.J2(mediaCodecInfo2, capabilitiesForType2, num2);
                                        }
                                    });
                                } else {
                                    listListOf = list;
                                    listListOf2 = list2;
                                }
                            }
                            list = listListOf;
                            list2 = listListOf2;
                        }
                    }
                    listListOf = list;
                    listListOf2 = list2;
                }
            }
            C.KN("DeviceCaps", new Function0() { // from class: z8.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC2487Wre.Uo(intRef, intRef2);
                }
            });
            String strXMQ = xMQ(AbstractC2488aC.n("ro.board.platform"));
            String strXMQ2 = xMQ(AbstractC2488aC.n("ro.hardware"));
            String strXMQ3 = xMQ(AbstractC2488aC.n("ro.arch"));
            String strXMQ4 = xMQ(AbstractC2488aC.n("ro.mediatek.platform"));
            if (strXMQ4 != null) {
                str = null;
                if (StringsKt.startsWith$default(strXMQ4, "mt", false, 2, (Object) null) || StringsKt.startsWith$default(strXMQ4, "MT", false, 2, (Object) null)) {
                    str2 = strXMQ4;
                }
                String strXMQ5 = xMQ(AbstractC2488aC.n("ro.chipname"));
                String str3 = Build.BOARD;
                String str4 = Build.HARDWARE;
                int i3 = intRef.element;
                int i5 = intRef2.element;
                int iMin = Math.min(i3, i5);
                String str5 = str2 != null ? strXMQ3 == null ? strXMQ5 == null ? strXMQ2 == null ? strXMQ == null ? str3 == null ? str4 : str3 : strXMQ : strXMQ2 : strXMQ5 : strXMQ3 : str2;
                Intrinsics.checkNotNull(str5);
                f76365n = new C2490j(i3, i5, iMin, setPlus, setPlus2, str5);
            } else {
                str = null;
            }
            str2 = str;
            String strXMQ52 = xMQ(AbstractC2488aC.n("ro.chipname"));
            String str32 = Build.BOARD;
            String str42 = Build.HARDWARE;
            int i32 = intRef.element;
            int i52 = intRef2.element;
            int iMin2 = Math.min(i32, i52);
            if (str2 != null) {
            }
            Intrinsics.checkNotNull(str5);
            f76365n = new C2490j(i32, i52, iMin2, setPlus, setPlus2, str5);
        }
        C2490j c2490j = f76365n;
        Intrinsics.checkNotNull(c2490j);
        return c2490j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(MediaCodecInfo mediaCodecInfo, MediaCodecInfo.CodecCapabilities codecCapabilities, Integer num) {
        return "CodecInfo: " + mediaCodecInfo.getName() + ": enc=" + mediaCodecInfo.isEncoder() + " mime=" + codecCapabilities.getMimeType() + " maxVideoSize=" + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(MediaCodecInfo mediaCodecInfo, MediaCodecInfo.CodecCapabilities codecCapabilities, Integer num) {
        return "CodecInfo: " + mediaCodecInfo.getName() + ": enc=" + mediaCodecInfo.isEncoder() + " mime=" + codecCapabilities.getMimeType() + " maxVideoSize=" + num;
    }

    private static final String xMQ(String str) {
        if (!StringsKt.isBlank(str) && str.length() != 0 && !Intrinsics.areEqual(str, "qcom")) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.areEqual(lowerCase, "unknown")) {
                return str;
            }
            return null;
        }
        return null;
    }
}
