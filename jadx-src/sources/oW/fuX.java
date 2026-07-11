package oW;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaf;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX extends com.google.firebase.auth.C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzaf f71495n;

    @Override // com.google.firebase.auth.C
    public final List n() {
        return this.f71495n.g6();
    }

    public fuX(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        this.f71495n = zzafVar;
    }
}
