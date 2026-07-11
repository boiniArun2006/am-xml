package aUP;

import LQ.j;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Xo implements ase.I28 {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f13012n;

    static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f13014n = new Ml();

        Ml() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MediaCodecInfo.CodecCapabilities codecCapabilities) {
            int[] iArr = codecCapabilities.colorFormats;
            Intrinsics.checkNotNullExpressionValue(iArr, "it.colorFormats");
            return Boolean.valueOf(ArraysKt.contains(iArr, 2130708361));
        }
    }

    static final class Wre extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ oC.Wre f13015n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(oC.Wre wre) {
            super(1);
            this.f13015n = wre;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MediaCodecInfo.VideoCapabilities videoCapabilities) {
            int iNr = eO.nr(eO.J2(this.f13015n), videoCapabilities.getWidthAlignment());
            int iNr2 = eO.nr(eO.O(this.f13015n), videoCapabilities.getHeightAlignment());
            return Boolean.valueOf(Math.abs(eO.J2(this.f13015n) - iNr) <= 8 && Math.abs(eO.O(this.f13015n) - iNr2) <= 8 && videoCapabilities.areSizeAndRateSupported(iNr, iNr2, (double) this.f13015n.O()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f13016n = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MediaCodecInfo[] invoke() {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "MediaCodecList(MediaCode…EGULAR_CODECS).codecInfos");
            return codecInfos;
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f13017n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str) {
            super(1);
            this.f13017n = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MediaCodecInfo.CodecCapabilities invoke(MediaCodecInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCapabilitiesForType(this.f13017n);
        }
    }

    public Xo(Function0 codecInfoProvider) {
        Intrinsics.checkNotNullParameter(codecInfoProvider, "codecInfoProvider");
        this.f13012n = codecInfoProvider;
    }

    static final class I28 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f13013n = new I28();

        I28() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MediaCodecInfo.VideoCapabilities invoke(MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.getVideoCapabilities();
        }
    }

    @Override // ase.I28
    public LQ.j n(oC.Wre params) {
        Intrinsics.checkNotNullParameter(params, "params");
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.f13012n.invoke();
        String strRl = oC.Ml.rl(params.Uo());
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            if (mediaCodecInfo.isEncoder() && qO.j.rl(mediaCodecInfo, strRl)) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = ((MediaCodecInfo) obj).getCapabilitiesForType(strRl);
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            double dO = params.O();
            int[] iArr = capabilitiesForType.colorFormats;
            Intrinsics.checkNotNullExpressionValue(iArr, "capabilities.colorFormats");
            if (ArraysKt.contains(iArr, 2130708361) && videoCapabilities.getBitrateRange().contains(Integer.valueOf(params.t())) && videoCapabilities.areSizeAndRateSupported(eO.J2(params), eO.O(params), dO)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((MediaCodecInfo) it.next()).getName());
            }
            return new j.w6(arrayList3);
        }
        return new j.n(new fOK.n("No encoder found supporting exactly " + params + ".\nEncoders supporting " + params.Uo() + ":\n" + qO.j.n(mediaCodecInfoArr, oC.Ml.rl(params.Uo()))));
    }

    @Override // ase.I28
    public LQ.j rl(oC.I28 mime) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.f13012n.invoke();
        String strRl = oC.Ml.rl(mime);
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            if (mediaCodecInfo.isEncoder() && qO.j.rl(mediaCodecInfo, strRl)) {
                arrayList.add(mediaCodecInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return new j.n(new fOK.n("No encoder found supporting " + mime + '.'));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MediaCodecInfo) it.next()).getName());
        }
        return new j.w6(arrayList2);
    }

    @Override // ase.I28
    public LQ.j t(oC.Wre params) {
        Object obj;
        Intrinsics.checkNotNullParameter(params, "params");
        String strRl = oC.Ml.rl(params.Uo());
        Object[] objArr = (Object[]) this.f13012n.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : objArr) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj2;
            if (mediaCodecInfo.isEncoder() && qO.j.rl(mediaCodecInfo, strRl)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = SequencesKt.filter(SequencesKt.map(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(arrayList), new w6(strRl)), Ml.f13014n), I28.f13013n), new Wre(params)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                MediaCodecInfo.VideoCapabilities videoCapabilities = (MediaCodecInfo.VideoCapabilities) next;
                Intrinsics.checkNotNullExpressionValue(videoCapabilities, "videoCapabilities");
                aUP.Wre wre = new aUP.Wre(params, videoCapabilities);
                do {
                    Object next2 = it.next();
                    MediaCodecInfo.VideoCapabilities videoCapabilities2 = (MediaCodecInfo.VideoCapabilities) next2;
                    Intrinsics.checkNotNullExpressionValue(videoCapabilities2, "videoCapabilities");
                    aUP.Wre wre2 = new aUP.Wre(params, videoCapabilities2);
                    if (wre.compareTo(wre2) < 0) {
                        next = next2;
                        wre = wre2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities3 = (MediaCodecInfo.VideoCapabilities) obj;
        if (videoCapabilities3 != null) {
            Integer achievableBitRate = (Integer) videoCapabilities3.getBitrateRange().clamp(Integer.valueOf(params.t()));
            Oe.j jVarN = Oe.j.f7482t.n(new Oe.w6(eO.nr(eO.J2(params), videoCapabilities3.getWidthAlignment()), eO.nr(eO.O(params), videoCapabilities3.getHeightAlignment())), params.nr().n());
            Intrinsics.checkNotNullExpressionValue(achievableBitRate, "achievableBitRate");
            return new j.w6(oC.Wre.rl(params, jVarN, achievableBitRate.intValue(), 0.0f, 0, null, 28, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No encoder found for ");
        sb.append(params);
        sb.append(" or similar. Available encoders for ");
        sb.append(strRl);
        sb.append(":\n");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(qO.j.nr((MediaCodecInfo) it2.next(), strRl, Oe.n.rl(params.nr()), false, 4, null));
        }
        sb.append(arrayList2);
        return new j.n(new fOK.n(sb.toString()));
    }

    public /* synthetic */ Xo(Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? j.f13016n : function0);
    }
}
