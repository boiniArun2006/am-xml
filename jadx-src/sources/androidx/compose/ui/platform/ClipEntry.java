package androidx.compose.ui.platform;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "", "Landroid/content/ClipData;", "clipData", "<init>", "(Landroid/content/ClipData;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/content/ClipData;", "()Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipMetadata;", "rl", "()Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ClipEntry {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ClipData clipData;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ClipData getClipData() {
        return this.clipData;
    }

    public final ClipMetadata rl() {
        return AndroidClipboardManager_androidKt.rl(this.clipData.getDescription());
    }

    public ClipEntry(ClipData clipData) {
        this.clipData = clipData;
    }
}
