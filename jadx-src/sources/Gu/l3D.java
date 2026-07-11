package Gu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l3D {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f3777O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3778n;
    private final Integer nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f3779t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f3778n, l3d.f3778n) && Intrinsics.areEqual(this.rl, l3d.rl) && Intrinsics.areEqual(this.f3779t, l3d.f3779t) && Intrinsics.areEqual(this.nr, l3d.nr) && Intrinsics.areEqual(this.f3777O, l3d.f3777O);
    }

    public l3D(String str, String desc, Integer num, Integer num2, String str2) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f3778n = str;
        this.rl = desc;
        this.f3779t = num;
        this.nr = num2;
        this.f3777O = str2;
    }

    public final String O() {
        return this.f3778n;
    }

    public int hashCode() {
        String str = this.f3778n;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31;
        Integer num = this.f3779t;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nr;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f3777O;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer n() {
        return this.nr;
    }

    public final Integer nr() {
        return this.f3779t;
    }

    public final String rl() {
        return this.f3777O;
    }

    public final String t() {
        return this.rl;
    }

    public String toString() {
        return "TutorialCommonGuideItem(title=" + this.f3778n + ", desc=" + this.rl + ", imgName=" + this.f3779t + ", bgColor=" + this.nr + ", bottomDesc=" + this.f3777O + ")";
    }
}
