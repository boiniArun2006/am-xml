package xr;

import a.C1498j;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl {
    private final boolean J2;
    private final Uri KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f75484O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f75485n;
    private final boolean nr;
    private final Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1498j f75486t;
    private final a.w6 xMQ;

    public Pl(List projectMedia, Integer num, C1498j templateTimelineRowState, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, a.w6 w6Var) {
        Intrinsics.checkNotNullParameter(projectMedia, "projectMedia");
        Intrinsics.checkNotNullParameter(templateTimelineRowState, "templateTimelineRowState");
        this.f75485n = projectMedia;
        this.rl = num;
        this.f75486t = templateTimelineRowState;
        this.nr = z2;
        this.f75484O = z3;
        this.J2 = z4;
        this.Uo = z5;
        this.KN = uri;
        this.xMQ = w6Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return Intrinsics.areEqual(this.f75485n, pl.f75485n) && Intrinsics.areEqual(this.rl, pl.rl) && Intrinsics.areEqual(this.f75486t, pl.f75486t) && this.nr == pl.nr && this.f75484O == pl.f75484O && this.J2 == pl.J2 && this.Uo == pl.Uo && Intrinsics.areEqual(this.KN, pl.KN) && Intrinsics.areEqual(this.xMQ, pl.xMQ);
    }

    public static /* synthetic */ Pl rl(Pl pl, List list, Integer num, C1498j c1498j, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, a.w6 w6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = pl.f75485n;
        }
        if ((i2 & 2) != 0) {
            num = pl.rl;
        }
        if ((i2 & 4) != 0) {
            c1498j = pl.f75486t;
        }
        if ((i2 & 8) != 0) {
            z2 = pl.nr;
        }
        if ((i2 & 16) != 0) {
            z3 = pl.f75484O;
        }
        if ((i2 & 32) != 0) {
            z4 = pl.J2;
        }
        if ((i2 & 64) != 0) {
            z5 = pl.Uo;
        }
        if ((i2 & 128) != 0) {
            uri = pl.KN;
        }
        if ((i2 & 256) != 0) {
            w6Var = pl.xMQ;
        }
        Uri uri2 = uri;
        a.w6 w6Var2 = w6Var;
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z9 = z3;
        C1498j c1498j2 = c1498j;
        return pl.n(list, num, c1498j2, z2, z9, z6, z7, uri2, w6Var2);
    }

    public final boolean J2() {
        return this.f75484O;
    }

    public final boolean KN() {
        return this.nr;
    }

    public final boolean O() {
        return this.Uo;
    }

    public final boolean Uo() {
        return this.J2;
    }

    public final a.w6 gh() {
        return this.xMQ;
    }

    public int hashCode() {
        int iHashCode = this.f75485n.hashCode() * 31;
        Integer num = this.rl;
        int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f75486t.hashCode()) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f75484O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31;
        Uri uri = this.KN;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        a.w6 w6Var = this.xMQ;
        return iHashCode3 + (w6Var != null ? w6Var.hashCode() : 0);
    }

    public final Uri mUb() {
        return this.KN;
    }

    public final Pl n(List projectMedia, Integer num, C1498j templateTimelineRowState, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, a.w6 w6Var) {
        Intrinsics.checkNotNullParameter(projectMedia, "projectMedia");
        Intrinsics.checkNotNullParameter(templateTimelineRowState, "templateTimelineRowState");
        return new Pl(projectMedia, num, templateTimelineRowState, z2, z3, z4, z5, uri, w6Var);
    }

    public final Integer nr() {
        return this.rl;
    }

    public final List t() {
        return this.f75485n;
    }

    public String toString() {
        return "TemplateImportPreviewViewModelState(projectMedia=" + this.f75485n + ", selectedMediaIndex=" + this.rl + ", templateTimelineRowState=" + this.f75486t + ", showReplaceMediaTooltip=" + this.nr + ", showExitConfirmationDialog=" + this.f75484O + ", showNextConfirmationDialog=" + this.J2 + ", showCropTooltip=" + this.Uo + ", trimmingUri=" + this.KN + ", videoTrimState=" + this.xMQ + ")";
    }

    public final C1498j xMQ() {
        return this.f75486t;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Pl(java.util.List r13, java.lang.Integer r14, a.C1498j r15, boolean r16, boolean r17, boolean r18, boolean r19, android.net.Uri r20, a.w6 r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L9
            r1 = 0
            r9 = r1
            goto Lb
        L9:
            r9 = r19
        Lb:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r20
        L14:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L24
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2 = r12
            goto L30
        L24:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L30:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.Pl.<init>(java.util.List, java.lang.Integer, a.j, boolean, boolean, boolean, boolean, android.net.Uri, a.w6, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
