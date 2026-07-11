package GV;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y8.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0126j f3552t = new C0126j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f3553n;
    private long rl;

    /* JADX INFO: renamed from: GV.j$j, reason: collision with other inner class name */
    public static final class C0126j {
        public /* synthetic */ C0126j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0126j() {
        }
    }

    public final int t(long j2) {
        int i2 = 0;
        long jGh = 0;
        while (true) {
            jGh += (long) this.f3553n.gh(i2);
            int i3 = i2 + 1;
            if (j2 < jGh) {
                return i2;
            }
            i2 = i3;
        }
    }

    public j(Ml animationInformation) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f3553n = animationInformation;
        this.rl = -1L;
    }

    public boolean O() {
        return this.f3553n.rl() == 0;
    }

    public long nr() {
        long j2 = this.rl;
        if (j2 != -1) {
            return j2;
        }
        this.rl = 0L;
        int iN = this.f3553n.n();
        for (int i2 = 0; i2 < iN; i2++) {
            this.rl += (long) this.f3553n.gh(i2);
        }
        return this.rl;
    }

    @Override // GV.n
    public long n(long j2) {
        long jNr = nr();
        long jGh = 0;
        if (jNr == 0) {
            return -1L;
        }
        if (!O() && j2 / jNr >= this.f3553n.rl()) {
            return -1L;
        }
        long j3 = j2 % jNr;
        int iN = this.f3553n.n();
        for (int i2 = 0; i2 < iN && jGh <= j3; i2++) {
            jGh += (long) this.f3553n.gh(i2);
        }
        return j2 + (jGh - j3);
    }

    @Override // GV.n
    public int rl(long j2, long j3) {
        long jNr = nr();
        if (jNr == 0) {
            return t(0L);
        }
        if (!O() && j2 / jNr >= this.f3553n.rl()) {
            return -1;
        }
        return t(j2 % jNr);
    }
}
