package wa;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C extends j8.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f75012n;
    private final String rl;

    public C(Context context, String themeColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(themeColor, "themeColor");
        this.f75012n = context;
        this.rl = themeColor;
    }

    @Override // j8.Wre
    public Object nr(Continuation continuation) {
        return new n.w6((this.f75012n.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light");
    }

    @Override // j8.Wre
    public Object t(Continuation continuation) {
        return new n.w6(this.rl);
    }
}
