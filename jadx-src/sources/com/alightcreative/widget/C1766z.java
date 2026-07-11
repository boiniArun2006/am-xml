package com.alightcreative.widget;

import android.graphics.drawable.Drawable;
import com.alightcreative.app.motion.scene.SolidColor;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.alightcreative.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C1766z {
    private final Set HI;
    private final boolean Ik;
    private final boolean J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f47516O;
    private final boolean Uo;
    private final int az;
    private final SolidColor ck;
    private final Function1 gh;
    private final Function0 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f47517n;
    private final boolean nr;
    private final int qie;
    private final Drawable rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f47518t;
    private final List ty;
    private final boolean xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.alightcreative.widget.z$j */
    public static final class j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47521o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ j[] f47522r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f47520n = new j("Normal", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f47523t = new j("Inline", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f47519O = new j("Dropdown", 2);
        public static final j J2 = new j("Radio", 3);

        private static final /* synthetic */ j[] n() {
            return new j[]{f47520n, f47523t, f47519O, J2};
        }

        static {
            j[] jVarArrN = n();
            f47522r = jVarArrN;
            f47521o = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f47522r.clone();
        }

        private j(String str, int i2) {
        }
    }

    public C1766z(j type, Drawable drawable, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String label, boolean z7, Function0 function0, Function1 function1, int i2, int i3, List children, Set requiredBenefits, SolidColor solidColor, boolean z9) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
        this.f47517n = type;
        this.rl = drawable;
        this.f47518t = z2;
        this.nr = z3;
        this.f47516O = z4;
        this.J2 = z5;
        this.Uo = z6;
        this.KN = label;
        this.xMQ = z7;
        this.mUb = function0;
        this.gh = function1;
        this.qie = i2;
        this.az = i3;
        this.ty = children;
        this.HI = requiredBenefits;
        this.ck = solidColor;
        this.Ik = z9;
    }

    public static /* synthetic */ C1766z rl(C1766z c1766z, j jVar, Drawable drawable, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, Function0 function0, Function1 function1, int i2, int i3, List list, Set set, SolidColor solidColor, boolean z9, int i5, Object obj) {
        boolean z10;
        SolidColor solidColor2;
        j jVar2;
        C1766z c1766z2;
        Set set2;
        Drawable drawable2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str2;
        boolean z16;
        Function0 function02;
        Function1 function12;
        int i7;
        int i8;
        List list2;
        j jVar3 = (i5 & 1) != 0 ? c1766z.f47517n : jVar;
        Drawable drawable3 = (i5 & 2) != 0 ? c1766z.rl : drawable;
        boolean z17 = (i5 & 4) != 0 ? c1766z.f47518t : z2;
        boolean z18 = (i5 & 8) != 0 ? c1766z.nr : z3;
        boolean z19 = (i5 & 16) != 0 ? c1766z.f47516O : z4;
        boolean z20 = (i5 & 32) != 0 ? c1766z.J2 : z5;
        boolean z21 = (i5 & 64) != 0 ? c1766z.Uo : z6;
        String str3 = (i5 & 128) != 0 ? c1766z.KN : str;
        boolean z22 = (i5 & 256) != 0 ? c1766z.xMQ : z7;
        Function0 function03 = (i5 & 512) != 0 ? c1766z.mUb : function0;
        Function1 function13 = (i5 & 1024) != 0 ? c1766z.gh : function1;
        int i9 = (i5 & 2048) != 0 ? c1766z.qie : i2;
        int i10 = (i5 & 4096) != 0 ? c1766z.az : i3;
        List list3 = (i5 & 8192) != 0 ? c1766z.ty : list;
        j jVar4 = jVar3;
        Set set3 = (i5 & 16384) != 0 ? c1766z.HI : set;
        SolidColor solidColor3 = (i5 & 32768) != 0 ? c1766z.ck : solidColor;
        if ((i5 & 65536) != 0) {
            solidColor2 = solidColor3;
            z10 = c1766z.Ik;
            set2 = set3;
            drawable2 = drawable3;
            z11 = z17;
            z12 = z18;
            z13 = z19;
            z14 = z20;
            z15 = z21;
            str2 = str3;
            z16 = z22;
            function02 = function03;
            function12 = function13;
            i7 = i9;
            i8 = i10;
            list2 = list3;
            jVar2 = jVar4;
            c1766z2 = c1766z;
        } else {
            z10 = z9;
            solidColor2 = solidColor3;
            jVar2 = jVar4;
            c1766z2 = c1766z;
            set2 = set3;
            drawable2 = drawable3;
            z11 = z17;
            z12 = z18;
            z13 = z19;
            z14 = z20;
            z15 = z21;
            str2 = str3;
            z16 = z22;
            function02 = function03;
            function12 = function13;
            i7 = i9;
            i8 = i10;
            list2 = list3;
        }
        return c1766z2.n(jVar2, drawable2, z11, z12, z13, z14, z15, str2, z16, function02, function12, i7, i8, list2, set2, solidColor2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1766z)) {
            return false;
        }
        C1766z c1766z = (C1766z) obj;
        return this.f47517n == c1766z.f47517n && Intrinsics.areEqual(this.rl, c1766z.rl) && this.f47518t == c1766z.f47518t && this.nr == c1766z.nr && this.f47516O == c1766z.f47516O && this.J2 == c1766z.J2 && this.Uo == c1766z.Uo && Intrinsics.areEqual(this.KN, c1766z.KN) && this.xMQ == c1766z.xMQ && Intrinsics.areEqual(this.mUb, c1766z.mUb) && Intrinsics.areEqual(this.gh, c1766z.gh) && this.qie == c1766z.qie && this.az == c1766z.az && Intrinsics.areEqual(this.ty, c1766z.ty) && Intrinsics.areEqual(this.HI, c1766z.HI) && Intrinsics.areEqual(this.ck, c1766z.ck) && this.Ik == c1766z.Ik;
    }

    public int hashCode() {
        int iHashCode = this.f47517n.hashCode() * 31;
        Drawable drawable = this.rl;
        int iHashCode2 = (((((((((((((((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Boolean.hashCode(this.f47518t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f47516O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + this.KN.hashCode()) * 31) + Boolean.hashCode(this.xMQ)) * 31;
        Function0 function0 = this.mUb;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1 function1 = this.gh;
        int iHashCode4 = (((((((((iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31) + Integer.hashCode(this.qie)) * 31) + Integer.hashCode(this.az)) * 31) + this.ty.hashCode()) * 31) + this.HI.hashCode()) * 31;
        SolidColor solidColor = this.ck;
        return ((iHashCode4 + (solidColor != null ? solidColor.hashCode() : 0)) * 31) + Boolean.hashCode(this.Ik);
    }

    public final C1766z n(j type, Drawable drawable, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String label, boolean z7, Function0 function0, Function1 function1, int i2, int i3, List children, Set requiredBenefits, SolidColor solidColor, boolean z9) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
        return new C1766z(type, drawable, z2, z3, z4, z5, z6, label, z7, function0, function1, i2, i3, children, requiredBenefits, solidColor, z9);
    }

    public String toString() {
        return "AlightMenuItem(type=" + this.f47517n + ", icon=" + this.rl + ", addTopDivider=" + this.f47518t + ", selectionBar=" + this.nr + ", centered=" + this.f47516O + ", separateBackground=" + this.J2 + ", enabled=" + this.Uo + ", label=" + this.KN + ", checked=" + this.xMQ + ", action=" + this.mUb + ", onChildSelected=" + this.gh + ", actionId=" + this.qie + ", selectedOption=" + this.az + ", children=" + this.ty + ", requiredBenefits=" + this.HI + ", swatch=" + this.ck + ", selected=" + this.Ik + ")";
    }

    public final int HI() {
        return this.az;
    }

    public final boolean Ik() {
        return this.J2;
    }

    public final boolean J2() {
        return this.f47516O;
    }

    public final List KN() {
        return this.ty;
    }

    public final boolean O() {
        return this.f47518t;
    }

    public final boolean Uo() {
        return this.xMQ;
    }

    public final Set az() {
        return this.HI;
    }

    public final boolean ck() {
        return this.nr;
    }

    public final String gh() {
        return this.KN;
    }

    public final Drawable mUb() {
        return this.rl;
    }

    public final int nr() {
        return this.qie;
    }

    public final j o() {
        return this.f47517n;
    }

    public final Function1 qie() {
        return this.gh;
    }

    public final SolidColor r() {
        return this.ck;
    }

    public final Function0 t() {
        return this.mUb;
    }

    public final boolean ty() {
        return this.Ik;
    }

    public final boolean xMQ() {
        return this.Uo;
    }

    public /* synthetic */ C1766z(j jVar, Drawable drawable, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, Function0 function0, Function1 function1, int i2, int i3, List list, Set set, SolidColor solidColor, boolean z9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? j.f47520n : jVar, (i5 & 2) != 0 ? null : drawable, (i5 & 4) != 0 ? false : z2, (i5 & 8) != 0 ? false : z3, (i5 & 16) != 0 ? false : z4, (i5 & 32) != 0 ? false : z5, (i5 & 64) != 0 ? true : z6, (i5 & 128) != 0 ? "" : str, (i5 & 256) != 0 ? false : z7, (i5 & 512) != 0 ? null : function0, (i5 & 1024) != 0 ? null : function1, (i5 & 2048) != 0 ? 0 : i2, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? CollectionsKt.emptyList() : list, (i5 & 16384) != 0 ? SetsKt.emptySet() : set, (i5 & 32768) != 0 ? null : solidColor, (i5 & 65536) != 0 ? false : z9);
    }
}
