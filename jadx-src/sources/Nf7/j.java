package Nf7;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.LifecycleOwner;
import com.alightcreative.app.motion.activities.Al;
import com.google.firebase.auth.FirebaseAuth;
import kgE.fuX;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f7084n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FirebaseAuth f7085t;

    public j(fuX iapManager) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f7084n = iapManager;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        this.f7085t = firebaseAuth;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void M(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.M(owner);
        this.f7085t.t(new Al(this.f7084n));
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void p5(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.p5(owner);
        this.f7085t.ck(new Al(this.f7084n));
    }
}
