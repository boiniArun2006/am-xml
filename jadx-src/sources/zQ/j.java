package zQ;

import com.bendingspoons.oracle.models.IdentityTokenAdapter;
import com.squareup.moshi.Moshi;
import et.w6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Moshi f76459n;

    static {
        Moshi.Builder builderAdd = new Moshi.Builder().add(new IdentityTokenAdapter());
        Intrinsics.checkNotNullExpressionValue(builderAdd, "add(...)");
        Moshi moshiBuild = w6.n(builderAdd).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        f76459n = moshiBuild;
    }

    public static final Moshi n() {
        return f76459n;
    }
}
