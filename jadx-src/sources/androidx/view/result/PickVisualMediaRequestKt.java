package androidx.view.result;

import androidx.view.result.PickVisualMediaRequest;
import androidx.view.result.contract.ActivityResultContracts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "", "maxItems", "", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "Landroidx/activity/result/PickVisualMediaRequest;", c.f62177j, "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PickVisualMediaRequestKt {
    public static final PickVisualMediaRequest n(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, int i2, boolean z2, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().nr(mediaType).t(i2).O(z2).rl(defaultTab).n();
    }

    public static /* synthetic */ PickVisualMediaRequest rl(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i2, boolean z2, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.f13379n;
        }
        if ((i3 & 2) != 0) {
            i2 = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.n();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.f13378n;
        }
        return n(visualMediaType, i2, z2, defaultTab);
    }
}
