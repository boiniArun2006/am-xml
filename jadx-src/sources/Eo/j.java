package Eo;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements lN.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0085j f2364t = new C0085j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2365n;
    private final String rl;

    /* JADX INFO: renamed from: Eo.j$j, reason: collision with other inner class name */
    public static final class C0085j {
        public /* synthetic */ C0085j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0085j() {
        }
    }

    @Override // lN.Ml
    public boolean rl() {
        return false;
    }

    @Override // lN.Ml
    public boolean equals(Object obj) {
        if (!this.f2365n) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(j.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.rl, ((j) obj).rl);
    }

    @Override // lN.Ml
    public int hashCode() {
        return !this.f2365n ? super.hashCode() : this.rl.hashCode();
    }

    @Override // lN.Ml
    public String n() {
        return this.rl;
    }

    public j(int i2, boolean z2) {
        this.f2365n = z2;
        this.rl = "anim://" + i2;
    }
}
