package PJ;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements CO9.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f7664n;

    public n(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f7664n = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rl(n nVar) {
        Context context = nVar.f7664n;
        return context.getString(context.getApplicationInfo().labelRes);
    }

    @Override // CO9.n
    public String invoke() {
        return (String) x0X.w6.nr(x0X.w6.n(new Function0() { // from class: PJ.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.rl(this.f7663n);
            }
        }));
    }
}
