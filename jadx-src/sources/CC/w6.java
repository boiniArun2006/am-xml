package CC;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DataSpec rl(Uri uri, long j2) {
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(uri).setPosition(j2).build();
        Intrinsics.checkNotNullExpressionValue(dataSpecBuild, "Builder().setUri(this).s…osition(position).build()");
        return dataSpecBuild;
    }
}
