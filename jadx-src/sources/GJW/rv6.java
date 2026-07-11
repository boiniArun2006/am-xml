package GJW;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class rv6 extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f3506t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3507n;

    public static final class j implements CoroutineContext.Key {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv6) && Intrinsics.areEqual(this.f3507n, ((rv6) obj).f3507n);
    }

    public rv6(String str) {
        super(f3506t);
        this.f3507n = str;
    }

    public final String getName() {
        return this.f3507n;
    }

    public int hashCode() {
        return this.f3507n.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f3507n + ')';
    }
}
