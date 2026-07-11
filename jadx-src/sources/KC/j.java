package KC;

import Hr.CQ.USEaHtCMH;
import android.widget.ImageButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageButton f5194n;
    private final List nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5195t;

    public j(ImageButton imageButton, int i2, int i3, List delegates) {
        Intrinsics.checkNotNullParameter(imageButton, USEaHtCMH.HZMhlP);
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f5194n = imageButton;
        this.rl = i2;
        this.f5195t = i3;
        this.nr = delegates;
    }

    public final List n() {
        return this.nr;
    }

    public final int nr() {
        return this.rl;
    }

    public final int rl() {
        return this.f5195t;
    }

    public final ImageButton t() {
        return this.f5194n;
    }
}
