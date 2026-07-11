package androidx.view.result;

import androidx.view.result.contract.ActivityResultContracts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR*\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0006\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<set-?>", c.f62177j, "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "nr", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "gh", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "mediaType", "", "rl", "I", "t", "()I", "mUb", "(I)V", "maxItems", "", "Z", "J2", "()Z", "qie", "(Z)V", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "xMQ", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V", "defaultTab", "O", "KN", "isCustomAccentColorApplied", "", "J", "()J", "Uo", "(J)V", "accentColor", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PickVisualMediaRequest {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long accentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isCustomAccentColorApplied;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isOrderedSelection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.f13379n;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.n();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.f13378n;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "nr", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "maxItems", "t", "(I)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "isOrderedSelection", "O", "(Z)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "rl", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/PickVisualMediaRequest;", c.f62177j, "()Landroidx/activity/result/PickVisualMediaRequest;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "I", "Z", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "isCustomAccentColorApplied", "", "J2", "J", "accentColor", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private long accentColor;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private boolean isCustomAccentColorApplied;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean isOrderedSelection;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.f13379n;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.n();

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.f13378n;

        public final Builder O(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }

        public final PickVisualMediaRequest n() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.gh(this.mediaType);
            pickVisualMediaRequest.mUb(this.maxItems);
            pickVisualMediaRequest.qie(this.isOrderedSelection);
            pickVisualMediaRequest.xMQ(this.defaultTab);
            pickVisualMediaRequest.KN(this.isCustomAccentColorApplied);
            pickVisualMediaRequest.Uo(this.accentColor);
            return pickVisualMediaRequest;
        }

        public final Builder nr(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        public final Builder rl(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final Builder t(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void KN(boolean z2) {
        this.isCustomAccentColorApplied = z2;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final void Uo(long j2) {
        this.accentColor = j2;
    }

    public final void gh(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        Intrinsics.checkNotNullParameter(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }

    public final void mUb(int i2) {
        this.maxItems = i2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final void qie(boolean z2) {
        this.isOrderedSelection = z2;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getMaxItems() {
        return this.maxItems;
    }

    public final void xMQ(ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
        this.defaultTab = defaultTab;
    }
}
