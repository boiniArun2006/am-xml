package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", "nr", "(Ljava/util/List;II)V", "Landroidx/collection/MutableIntList;", "t", "(Landroidx/collection/MutableIntList;II)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RememberEventDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(List list, int i2, int i3) {
        Object obj = list.get(i2);
        list.set(i2, list.get(i3));
        list.set(i3, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableIntList mutableIntList, int i2, int i3) {
        int iO = mutableIntList.O(i2);
        mutableIntList.Ik(i2, mutableIntList.O(i3));
        mutableIntList.Ik(i3, iO);
    }
}
