package WK;

import QmE.iF;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import ga6.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f11463n;
    private final iF rl;

    public n(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f11463n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri t(n nVar, int i2) {
        Resources resources = nVar.f11463n.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return Uri.parse("android.resource://" + resources.getResourcePackageName(i2) + "/" + resources.getResourceTypeName(i2) + "/" + resources.getResourceEntryName(i2));
    }

    public final x0X.n rl(final int i2) {
        return M3.j.rl(M3.n.n(x0X.w6.n(new Function0() { // from class: WK.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.t(this.f11461n, i2);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67619t, j.n.f67621O, "Uri from resource not found."), this.rl);
    }
}
