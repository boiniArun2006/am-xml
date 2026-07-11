package QVk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    private String HI;
    private Integer Ik;
    private String J2;
    private String[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Long f8212O;
    private String Uo;
    private Long az;
    private String ck;
    private String gh;
    private String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f8213n;
    private Long nr;
    private String qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f8214r;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8215t;
    private String ty;
    private String xMQ;

    public fuX(C infra) {
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f8213n = infra;
        this.rl = new ArrayList();
    }

    public final String HI() {
        return this.Uo;
    }

    public final String Ik() {
        return this.qie;
    }

    public final Long J2() {
        return this.nr;
    }

    public final String KN() {
        return this.HI;
    }

    public final Integer O() {
        return this.f8214r;
    }

    public final void S(Long l2) {
        this.f8212O = l2;
    }

    public final Integer Uo() {
        return this.Ik;
    }

    public final void XQ(boolean z2) {
        this.f8215t = z2;
    }

    public final void Z(Long l2) {
        this.nr = l2;
    }

    public final boolean az() {
        return this.f8215t;
    }

    public final String ck() {
        return this.ty;
    }

    public final List gh() {
        return this.rl;
    }

    public final C mUb() {
        return this.f8213n;
    }

    public final String n() {
        return this.J2;
    }

    public final String nr() {
        return this.xMQ;
    }

    public final void o() {
        this.rl.clear();
        this.f8215t = false;
        this.nr = null;
        this.f8212O = null;
        this.J2 = null;
        this.Uo = null;
        this.KN = null;
        this.xMQ = null;
        this.mUb = null;
        this.gh = null;
        this.qie = null;
        this.az = null;
        this.ty = null;
        this.HI = null;
        this.ck = null;
        this.Ik = null;
        this.f8214r = null;
    }

    public final Long qie() {
        return this.az;
    }

    public final String r() {
        return this.gh;
    }

    public final String rl() {
        return this.mUb;
    }

    public final String[] t() {
        return this.KN;
    }

    public final Long ty() {
        return this.f8212O;
    }

    public final String xMQ() {
        return this.ck;
    }
}
