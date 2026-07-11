package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.List;
import t1.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CueGroup {

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(nKK.r(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public final nKK cues;

    @UnstableApi
    public final long presentationTimeUs;

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? nKK.r() : BundleCollectionUtil.fromBundleList(new j(), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new CN3() { // from class: androidx.media3.common.text.n
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return ((Cue) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }

    @UnstableApi
    public CueGroup(List<Cue> list, long j2) {
        this.cues = nKK.ty(list);
        this.presentationTimeUs = j2;
    }

    private static nKK filterOutBitmapCues(List<Cue> list) {
        nKK.j jVarGh = nKK.gh();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).bitmap == null) {
                jVarGh.n(list.get(i2));
            }
        }
        return jVarGh.gh();
    }
}
