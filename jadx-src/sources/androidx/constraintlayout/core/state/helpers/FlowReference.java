package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FlowReference extends HelperReference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected HashMap f35470C;
    protected float ER;
    protected int EWS;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    protected HashMap f35471G7;
    protected int GD;
    protected int HV;
    protected float How;
    protected int Jk;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected int f35472K;
    protected HashMap Mx;
    protected int Org;
    protected int Po6;
    protected int Rl;
    protected int UhV;
    protected int eWT;
    protected int fcU;
    protected int hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f35473i;
    protected float lLA;
    protected int mYa;
    protected int n1;
    protected Flow ofS;
    protected int qm;
    protected float tUK;
    protected int ul;

    public void ER(int i2) {
        this.hRu = i2;
    }

    public void EWS(float f3) {
        this.tUK = f3;
    }

    public void GD(float f3) {
        this.lLA = f3;
    }

    public void HV(int i2) {
        this.Jk = i2;
    }

    public void How(int i2) {
        this.Po6 = i2;
    }

    public void Jk(int i2) {
        this.Rl = i2;
    }

    public void K(int i2) {
        this.UhV = i2;
    }

    public void Org(int i2) {
        this.GD = i2;
    }

    public void Po6(int i2) {
        this.qm = i2;
    }

    public void RQ(int i2) {
        this.fcU = i2;
    }

    public void Rl(float f3) {
        this.How = f3;
    }

    public void UhV(int i2) {
        this.f35473i = i2;
    }

    public void W(int i2) {
        this.eWT = i2;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget fcU() {
        if (this.ofS == null) {
            this.ofS = new Flow();
        }
        return this.ofS;
    }

    public void hRu(int i2) {
        this.n1 = i2;
    }

    public void i(int i2) {
        this.f35472K = i2;
    }

    public void kSg(int i2) {
        this.HV = i2;
    }

    public void lLA(int i2) {
        this.mYa = i2;
    }

    public void mYa(int i2) {
        this.Org = i2;
    }

    public void n1(float f3) {
        this.ER = f3;
    }

    public void qm(int i2) {
        this.ul = i2;
    }

    public void tUK(int i2) {
        this.EWS = i2;
    }

    public FlowReference(State state, State.Helper helper) {
        super(state, helper);
        this.fcU = 0;
        this.eWT = -1;
        this.ul = -1;
        this.n1 = -1;
        this.Jk = -1;
        this.Rl = -1;
        this.qm = -1;
        this.mYa = 2;
        this.Org = 2;
        this.HV = 0;
        this.GD = 0;
        this.Po6 = 0;
        this.EWS = 0;
        this.hRu = 0;
        this.UhV = 0;
        this.f35473i = -1;
        this.f35472K = 0;
        this.How = 0.5f;
        this.tUK = 0.5f;
        this.ER = 0.5f;
        this.lLA = 0.5f;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.f35472K = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        fcU();
        rl(this.ofS);
        this.ofS.YiW(this.f35472K);
        this.ofS.XUb(this.fcU);
        int i2 = this.f35473i;
        if (i2 != -1) {
            this.ofS.gxH(i2);
        }
        int i3 = this.Po6;
        if (i3 != 0) {
            this.ofS.SR(i3);
        }
        int i5 = this.hRu;
        if (i5 != 0) {
            this.ofS.tEO(i5);
        }
        int i7 = this.EWS;
        if (i7 != 0) {
            this.ofS.EN(i7);
        }
        int i8 = this.UhV;
        if (i8 != 0) {
            this.ofS.Fp(i8);
        }
        int i9 = this.GD;
        if (i9 != 0) {
            this.ofS.C7B(i9);
        }
        int i10 = this.HV;
        if (i10 != 0) {
            this.ofS.kQ(i10);
        }
        float f3 = this.xMQ;
        if (f3 != 0.5f) {
            this.ofS.fq(f3);
        }
        float f4 = this.ER;
        if (f4 != 0.5f) {
            this.ofS.GH3(f4);
        }
        float f5 = this.lLA;
        if (f5 != 0.5f) {
            this.ofS.TVk(f5);
        }
        float f6 = this.mUb;
        if (f6 != 0.5f) {
            this.ofS.Sax(f6);
        }
        float f7 = this.How;
        if (f7 != 0.5f) {
            this.ofS.HFS(f7);
        }
        float f8 = this.tUK;
        if (f8 != 0.5f) {
            this.ofS.n7u(f8);
        }
        int i11 = this.Org;
        if (i11 != 2) {
            this.ofS.Xli(i11);
        }
        int i12 = this.mYa;
        if (i12 != 2) {
            this.ofS.c(i12);
        }
        int i13 = this.eWT;
        if (i13 != -1) {
            this.ofS.x(i13);
        }
        int i14 = this.ul;
        if (i14 != -1) {
            this.ofS.eb(i14);
        }
        int i15 = this.n1;
        if (i15 != -1) {
            this.ofS.yA(i15);
        }
        int i16 = this.Jk;
        if (i16 != -1) {
            this.ofS.wYi(i16);
        }
        int i17 = this.Rl;
        if (i17 != -1) {
            this.ofS.w(i17);
        }
        int i18 = this.qm;
        if (i18 != -1) {
            this.ofS.lRt(i18);
        }
        G7();
    }

    public void ul(String str, float f3, float f4, float f5) {
        super.Mx(str);
        if (!Float.isNaN(f3)) {
            if (this.f35470C == null) {
                this.f35470C = new HashMap();
            }
            this.f35470C.put(str, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.Mx == null) {
                this.Mx = new HashMap();
            }
            this.Mx.put(str, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            if (this.f35471G7 == null) {
                this.f35471G7 = new HashMap();
            }
            this.f35471G7.put(str, Float.valueOf(f5));
        }
    }
}
