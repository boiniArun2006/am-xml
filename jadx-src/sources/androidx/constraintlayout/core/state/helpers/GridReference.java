package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class GridReference extends HelperReference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f35474C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f35475G7;
    private int GD;
    private String HV;
    private float Jk;
    private int Mx;
    private String Org;
    private float Rl;
    private int eWT;
    private int fcU;
    private String mYa;
    private int n1;
    private GridCore ofS;
    private String qm;
    private int ul;

    public void EWS(String str) {
        this.qm = str;
    }

    public void GD(int i2) {
        this.f35474C = i2;
    }

    public void HV(int i2) {
        this.Mx = i2;
    }

    public void Jk(int i2) {
        this.GD = i2;
    }

    public void K(float f3) {
        this.Rl = f3;
    }

    public void Org(int i2) {
        this.fcU = i2;
    }

    public void Po6(int i2) {
        this.f35475G7 = i2;
    }

    public void UhV(String str) {
        this.HV = str;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget fcU() {
        if (this.ofS == null) {
            this.ofS = new GridCore();
        }
        return this.ofS;
    }

    public void i(String str) {
        this.Org = str;
    }

    public void mYa(int i2) {
        this.eWT = i2;
    }

    public void qm(float f3) {
        this.Jk = f3;
    }

    public void ul(String str) {
        this.mYa = str;
    }

    public GridReference(State state, State.Helper helper) {
        super(state, helper);
        this.f35474C = 0;
        this.Mx = 0;
        this.f35475G7 = 0;
        this.fcU = 0;
        if (helper == State.Helper.ROW) {
            this.ul = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.n1 = 1;
        }
    }

    public void Rl(String str) {
        if (!str.isEmpty()) {
            String[] strArrSplit = str.split("\\|");
            this.GD = 0;
            for (String str2 : strArrSplit) {
                String lowerCase = str2.toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals("subgridbycolrow")) {
                    this.GD |= 1;
                } else if (lowerCase.equals("spansrespectwidgetorder")) {
                    this.GD |= 2;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        fcU();
        this.ofS.GH3(this.eWT);
        int i2 = this.ul;
        if (i2 != 0) {
            this.ofS.HFS(i2);
        }
        int i3 = this.n1;
        if (i3 != 0) {
            this.ofS.l2(i3);
        }
        float f3 = this.Jk;
        if (f3 != 0.0f) {
            this.ofS.t1J(f3);
        }
        float f4 = this.Rl;
        if (f4 != 0.0f) {
            this.ofS.fq(f4);
        }
        String str = this.qm;
        if (str != null && !str.isEmpty()) {
            this.ofS.w(this.qm);
        }
        String str2 = this.mYa;
        if (str2 != null && !str2.isEmpty()) {
            this.ofS.c32(this.mYa);
        }
        String str3 = this.Org;
        if (str3 != null && !str3.isEmpty()) {
            this.ofS.Xli(this.Org);
        }
        String str4 = this.HV;
        if (str4 != null && !str4.isEmpty()) {
            this.ofS.eb(this.HV);
        }
        this.ofS.Om(this.GD);
        this.ofS.pS(this.f35474C);
        this.ofS.Ro(this.Mx);
        this.ofS.tEO(this.f35475G7);
        this.ofS.Fp(this.fcU);
        G7();
    }

    public void hRu(int i2) {
        if (super.eWT() == State.Helper.COLUMN) {
            return;
        }
        this.ul = i2;
    }

    public void n1(int i2) {
        if (super.eWT() == State.Helper.ROW) {
            return;
        }
        this.n1 = i2;
    }
}
