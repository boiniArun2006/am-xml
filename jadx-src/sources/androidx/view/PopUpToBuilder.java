package androidx.view;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/navigation/PopUpToBuilder;", "", "<init>", "()V", "", c.f62177j, "Z", "()Z", "setInclusive", "(Z)V", "inclusive", "<set-?>", "rl", "t", "saveState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavOptionsDsl
public final class PopUpToBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean saveState;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getInclusive() {
        return this.inclusive;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getSaveState() {
        return this.saveState;
    }

    public final void t(boolean z2) {
        this.saveState = z2;
    }
}
