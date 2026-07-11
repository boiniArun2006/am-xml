package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CueGroup implements Bundleable {
    private static final int FIELD_CUES = 0;
    public final nKK cues;
    public static final CueGroup EMPTY = new CueGroup(nKK.r());
    public static final Bundleable.Creator<CueGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.n
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return CueGroup.fromBundle(bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new CueGroup(parcelableArrayList == null ? nKK.r() : BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList));
    }

    private static String keyForField(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        return bundle;
    }

    public CueGroup(List<Cue> list) {
        this.cues = nKK.ty(list);
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
