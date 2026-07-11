package androidx.content.core.okio;

import androidx.content.core.InterProcessCoordinator;
import androidx.content.core.InterProcessCoordinatorKt;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Path;", JavetError.PARAMETER_PATH, "Landroidx/datastore/core/InterProcessCoordinator;", c.f62177j, "(Lokio/Path;)Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageKt {
    public static final InterProcessCoordinator n(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return InterProcessCoordinatorKt.n(path.normalized().toString());
    }
}
