package aUP;

import LQ.j;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements ase.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f13067n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: aUP.j$j, reason: collision with other inner class name */
    public static final class C0475j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0475j f13068n = new C0475j();

        C0475j() {
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

    public j(Function0 codecInfoProvider) {
        Intrinsics.checkNotNullParameter(codecInfoProvider, "codecInfoProvider");
        this.f13067n = codecInfoProvider;
    }

    @Override // ase.j
    public LQ.j n(oC.n params) {
        Intrinsics.checkNotNullParameter(params, "params");
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.f13067n.invoke();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            if (w6.J2(mediaCodecInfo, oC.Ml.n(params.nr()), as.qz.n(params.O().rl()), as.eO.n(params.O().t()), null, 8, null)) {
                arrayList.add(mediaCodecInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return new j.n(new fOK.n("No encoder found supporting " + params + " or similar. Encoders supporting " + params.nr() + ':' + qO.j.n(mediaCodecInfoArr, oC.Ml.n(params.nr()))));
        }
        String strN = oC.Ml.n(params.nr());
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Integer num = (Integer) w6.t((MediaCodecInfo) next, strN).clamp(Integer.valueOf(params.t()));
            do {
                Object next2 = it.next();
                Integer num2 = (Integer) w6.t((MediaCodecInfo) next2, strN).clamp(Integer.valueOf(params.t()));
                if (num.compareTo(num2) < 0) {
                    next = next2;
                    num = num2;
                }
            } while (it.hasNext());
        }
        Integer achievableBitRate = (Integer) w6.t((MediaCodecInfo) next, strN).clamp(Integer.valueOf(params.t()));
        Intrinsics.checkNotNullExpressionValue(achievableBitRate, "achievableBitRate");
        return new j.w6(oC.n.rl(params, achievableBitRate.intValue(), null, null, 6, null));
    }

    @Override // ase.j
    public LQ.j rl(oC.n params) {
        Intrinsics.checkNotNullParameter(params, "params");
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.f13067n.invoke();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            if (w6.O(mediaCodecInfo, oC.Ml.n(params.nr()), as.qz.n(params.O().rl()), as.eO.n(params.O().t()), Integer.valueOf(params.t()))) {
                arrayList.add(mediaCodecInfo);
            }
        }
        if (!arrayList.isEmpty()) {
            String name = ((MediaCodecInfo) CollectionsKt.first((List) arrayList)).getName();
            Intrinsics.checkNotNullExpressionValue(name, "acceptableCodecs.first().name");
            return new j.w6(name);
        }
        return new j.n(new fOK.n("No encoder found supporting exactly " + params + ". Encoders supporting " + params.nr() + ':' + qO.j.n(mediaCodecInfoArr, oC.Ml.n(params.nr()))));
    }

    public /* synthetic */ j(Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C0475j.f13068n : function0);
    }
}
