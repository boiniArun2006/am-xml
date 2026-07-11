package UP;

import aUP.fuX;
import fOK.I28;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f10763n = LazyKt.lazy(j.f10764n);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f10764n = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final fuX invoke() {
            return new fuX(null, null, null, null, null, null, 63, null);
        }
    }

    public static final I28 n(I28.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return (I28) f10763n.getValue();
    }
}
