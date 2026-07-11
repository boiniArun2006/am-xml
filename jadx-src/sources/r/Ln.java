package r;

import LdY.Ml;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ln implements Function1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f72638n;

    public Ln(Ref.ObjectRef objectRef) {
        this.f72638n = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void n(boolean z2) {
        Ml.j jVar = (Ml.j) this.f72638n.element;
        if (jVar != null) {
            jVar.n();
        }
    }
}
