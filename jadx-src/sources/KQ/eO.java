package KQ;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO {
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f5338O;
    private final Integer Uo;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5339n;
    private final List nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f5340t;
    private final int xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eO)) {
            return false;
        }
        eO eOVar = (eO) obj;
        return Intrinsics.areEqual(this.f5339n, eOVar.f5339n) && Intrinsics.areEqual(this.rl, eOVar.rl) && Intrinsics.areEqual(this.f5340t, eOVar.f5340t) && Intrinsics.areEqual(this.nr, eOVar.nr) && Intrinsics.areEqual(this.f5338O, eOVar.f5338O) && this.J2 == eOVar.J2 && Intrinsics.areEqual(this.Uo, eOVar.Uo) && this.KN == eOVar.KN && this.xMQ == eOVar.xMQ && this.mUb == eOVar.mUb;
    }

    public eO(String id, String title, String str, List answers, String str2, int i2, Integer num, int i3, int i5, int i7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f5339n = id;
        this.rl = title;
        this.f5340t = str;
        this.nr = answers;
        this.f5338O = str2;
        this.J2 = i2;
        this.Uo = num;
        this.KN = i3;
        this.xMQ = i5;
        this.mUb = i7;
    }

    public final int J2() {
        return this.KN;
    }

    public final Integer KN() {
        return this.Uo;
    }

    public final int O() {
        return this.J2;
    }

    public final int Uo() {
        return this.xMQ;
    }

    public int hashCode() {
        int iHashCode = ((this.f5339n.hashCode() * 31) + this.rl.hashCode()) * 31;
        String str = this.f5340t;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nr.hashCode()) * 31;
        String str2 = this.f5338O;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.J2)) * 31;
        Integer num = this.Uo;
        return ((((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ)) * 31) + Integer.hashCode(this.mUb);
    }

    public final String mUb() {
        return this.rl;
    }

    public final List n() {
        return this.nr;
    }

    public final String nr() {
        return this.f5339n;
    }

    public final int rl() {
        return this.mUb;
    }

    public final String t() {
        return this.f5340t;
    }

    public String toString() {
        return "SurveyPageUIModel(id=" + this.f5339n + ", title=" + this.rl + ", description=" + this.f5340t + ", answers=" + this.nr + ", subtitle=" + this.f5338O + ", imageResId=" + this.J2 + ", selectedAnswerIndex=" + this.Uo + ", questionCount=" + this.KN + ", questionIndex=" + this.xMQ + ", depth=" + this.mUb + ")";
    }

    public final String xMQ() {
        return this.f5338O;
    }
}
