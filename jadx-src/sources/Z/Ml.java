package Z;

import Z.w6;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f12269n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f12269n, ((Ml) obj).f12269n);
    }

    public int hashCode() {
        return this.f12269n.hashCode();
    }

    @Override // Z.Dsr
    public Object n(Continuation continuation) {
        DisplayMetrics displayMetrics = this.f12269n.getResources().getDisplayMetrics();
        w6.j jVarN = j.n(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new fuX(jVarN, jVarN);
    }

    public Ml(Context context) {
        this.f12269n = context;
    }
}
