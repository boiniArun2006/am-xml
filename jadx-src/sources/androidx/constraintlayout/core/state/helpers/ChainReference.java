package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ChainReference extends HelperReference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected HashMap f35468C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    protected HashMap f35469G7;
    protected HashMap Mx;
    private HashMap eWT;
    private HashMap fcU;
    protected float ofS;
    protected State.Chain ul;

    public ChainReference HV(State.Chain chain) {
        this.ul = chain;
        return this;
    }

    float Jk(String str) {
        HashMap map = this.eWT;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.eWT.get(str)).floatValue();
    }

    protected float Org(String str) {
        if (this.f35468C.containsKey(str)) {
            return ((Float) this.f35468C.get(str)).floatValue();
        }
        return -1.0f;
    }

    protected float Rl(String str) {
        if (this.f35469G7.containsKey(str)) {
            return ((Float) this.f35469G7.get(str)).floatValue();
        }
        return 0.0f;
    }

    protected float mYa(String str) {
        if (this.Mx.containsKey(str)) {
            return ((Float) this.Mx.get(str)).floatValue();
        }
        return 0.0f;
    }

    public ChainReference n1(float f3) {
        this.ofS = f3;
        return this;
    }

    float qm(String str) {
        HashMap map = this.fcU;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.fcU.get(str)).floatValue();
    }

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
        this.ofS = 0.5f;
        this.f35468C = new HashMap();
        this.Mx = new HashMap();
        this.f35469G7 = new HashMap();
        this.ul = State.Chain.SPREAD;
    }

    public void ul(Object obj, float f3, float f4, float f5, float f6, float f7) {
        super.Mx(obj);
        String string = obj.toString();
        if (!Float.isNaN(f3)) {
            this.f35468C.put(string, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            this.Mx.put(string, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            this.f35469G7.put(string, Float.valueOf(f5));
        }
        if (!Float.isNaN(f6)) {
            if (this.fcU == null) {
                this.fcU = new HashMap();
            }
            this.fcU.put(string, Float.valueOf(f6));
        }
        if (!Float.isNaN(f7)) {
            if (this.eWT == null) {
                this.eWT = new HashMap();
            }
            this.eWT.put(string, Float.valueOf(f7));
        }
    }
}
