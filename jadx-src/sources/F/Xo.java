package F;

import MO.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Xo {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final z f2475O;
    private final z Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2476n;
    private final String nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f2477t;
    private final z xMQ;

    public Xo(boolean z2, boolean z3, boolean z4, String currentTiktokUsername, z zVar, String currentInstagramUsername, z zVar2, String currentYoutubeUsername, z zVar3) {
        Intrinsics.checkNotNullParameter(currentTiktokUsername, "currentTiktokUsername");
        Intrinsics.checkNotNullParameter(currentInstagramUsername, "currentInstagramUsername");
        Intrinsics.checkNotNullParameter(currentYoutubeUsername, "currentYoutubeUsername");
        this.f2476n = z2;
        this.rl = z3;
        this.f2477t = z4;
        this.nr = currentTiktokUsername;
        this.f2475O = zVar;
        this.J2 = currentInstagramUsername;
        this.Uo = zVar2;
        this.KN = currentYoutubeUsername;
        this.xMQ = zVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return this.f2476n == xo.f2476n && this.rl == xo.rl && this.f2477t == xo.f2477t && Intrinsics.areEqual(this.nr, xo.nr) && this.f2475O == xo.f2475O && Intrinsics.areEqual(this.J2, xo.J2) && this.Uo == xo.Uo && Intrinsics.areEqual(this.KN, xo.KN) && this.xMQ == xo.xMQ;
    }

    public static /* synthetic */ Xo rl(Xo xo, boolean z2, boolean z3, boolean z4, String str, z zVar, String str2, z zVar2, String str3, z zVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = xo.f2476n;
        }
        if ((i2 & 2) != 0) {
            z3 = xo.rl;
        }
        if ((i2 & 4) != 0) {
            z4 = xo.f2477t;
        }
        if ((i2 & 8) != 0) {
            str = xo.nr;
        }
        if ((i2 & 16) != 0) {
            zVar = xo.f2475O;
        }
        if ((i2 & 32) != 0) {
            str2 = xo.J2;
        }
        if ((i2 & 64) != 0) {
            zVar2 = xo.Uo;
        }
        if ((i2 & 128) != 0) {
            str3 = xo.KN;
        }
        if ((i2 & 256) != 0) {
            zVar3 = xo.xMQ;
        }
        String str4 = str3;
        z zVar4 = zVar3;
        String str5 = str2;
        z zVar5 = zVar2;
        z zVar6 = zVar;
        boolean z5 = z4;
        return xo.n(z2, z3, z5, str, zVar6, str5, zVar5, str4, zVar4);
    }

    public final z J2() {
        return this.Uo;
    }

    public final z KN() {
        return this.xMQ;
    }

    public final String O() {
        return this.KN;
    }

    public final z Uo() {
        return this.f2475O;
    }

    public final boolean gh() {
        return this.f2477t;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f2476n) * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f2477t)) * 31) + this.nr.hashCode()) * 31;
        z zVar = this.f2475O;
        int iHashCode2 = (((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31) + this.J2.hashCode()) * 31;
        z zVar2 = this.Uo;
        int iHashCode3 = (((iHashCode2 + (zVar2 == null ? 0 : zVar2.hashCode())) * 31) + this.KN.hashCode()) * 31;
        z zVar3 = this.xMQ;
        return iHashCode3 + (zVar3 != null ? zVar3.hashCode() : 0);
    }

    public final boolean mUb() {
        return this.f2476n;
    }

    public final Xo n(boolean z2, boolean z3, boolean z4, String currentTiktokUsername, z zVar, String currentInstagramUsername, z zVar2, String currentYoutubeUsername, z zVar3) {
        Intrinsics.checkNotNullParameter(currentTiktokUsername, "currentTiktokUsername");
        Intrinsics.checkNotNullParameter(currentInstagramUsername, "currentInstagramUsername");
        Intrinsics.checkNotNullParameter(currentYoutubeUsername, "currentYoutubeUsername");
        return new Xo(z2, z3, z4, currentTiktokUsername, zVar, currentInstagramUsername, zVar2, currentYoutubeUsername, zVar3);
    }

    public final String nr() {
        return this.nr;
    }

    public final String t() {
        return this.J2;
    }

    public String toString() {
        return "EditProfileViewState(isNewUser=" + this.f2476n + ", isLoading=" + this.rl + ", isSuccessPopupShown=" + this.f2477t + ", currentTiktokUsername=" + this.nr + ", tiktokUsernameError=" + this.f2475O + ", currentInstagramUsername=" + this.J2 + ", instagramUsernameError=" + this.Uo + ", currentYoutubeUsername=" + this.KN + ", youtubeUsernameError=" + this.xMQ + ")";
    }

    public final boolean xMQ() {
        return this.rl;
    }

    public /* synthetic */ Xo(boolean z2, boolean z3, boolean z4, String str, z zVar, String str2, z zVar2, String str3, z zVar3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : zVar, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? null : zVar2, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? null : zVar3);
    }
}
