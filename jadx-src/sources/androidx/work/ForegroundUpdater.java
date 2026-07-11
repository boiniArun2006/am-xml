package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.Xo;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface ForegroundUpdater {
    Xo n(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
