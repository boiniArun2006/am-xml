package Sbr;

import B7.AbstractC1307c;
import B7.C1308z;
import F6.Ml;
import Fw3.Dsr;
import GJW.vd;
import Z4.I28;
import android.content.Context;
import as.CN3;
import as.Pl;
import as.z;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Dsr f9791n = new Dsr(256000000, 3);

    public static final j n(vd scope, Context context, int i2, mF.n compositor, w6.n resourceProvider, VD.j logger) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(compositor, "compositor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new C1308z(compositor, i2, logger, I28.rl(context, resourceProvider, f9791n, logger, false, 16, null), AbstractC1307c.n(Ml.rl(context, logger, false, 4, null), new CN3(Pl.n(2), z.n(48000), null), scope), null, scope, null, 160, null);
    }
}
