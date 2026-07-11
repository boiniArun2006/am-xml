package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 {
    private boolean HI;
    private DGv.Ml Ik;
    private String J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f70260O;
    private boolean Uo;
    private boolean az;
    private boolean ck;
    private boolean gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f70261n;
    private boolean nr;
    private boolean qie;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f70262t;
    private boolean ty;
    private j xMQ;

    public I28(n json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f70261n = json.O().xMQ();
        this.rl = json.O().mUb();
        this.f70262t = json.O().gh();
        this.nr = json.O().Ik();
        this.f70260O = json.O().az();
        this.J2 = json.O().ty();
        this.Uo = json.O().Uo();
        this.KN = json.O().O();
        this.xMQ = json.O().J2();
        this.mUb = json.O().HI();
        json.O().qie();
        this.gh = json.O().KN();
        this.qie = json.O().nr();
        this.az = json.O().n();
        this.ty = json.O().rl();
        this.HI = json.O().t();
        this.ck = json.O().ck();
        this.Ik = json.n();
    }

    public final void J2(boolean z2) {
        this.f70262t = z2;
    }

    public final void O(boolean z2) {
        this.rl = z2;
    }

    public final void Uo(boolean z2) {
        this.f70260O = z2;
    }

    public final CN3 n() {
        if (this.ck) {
            if (!Intrinsics.areEqual(this.KN, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.xMQ != j.f70271O) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f70260O) {
            if (!Intrinsics.areEqual(this.J2, "    ")) {
                String str = this.J2;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.J2).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.J2, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new CN3(this.f70261n, this.f70262t, this.nr, this.HI, this.f70260O, this.rl, this.J2, this.Uo, this.ck, this.KN, this.ty, this.mUb, null, this.gh, this.qie, this.az, this.xMQ);
    }

    public final void nr(boolean z2) {
        this.f70261n = z2;
    }

    public final DGv.Ml rl() {
        return this.Ik;
    }

    public final void t(boolean z2) {
        this.HI = z2;
    }
}
