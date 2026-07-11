package pUk;

import java.util.List;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class j extends eO {
    private final eO.n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f72020O;
    private final String nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f72021t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eO) {
            eO eOVar = (eO) obj;
            if (this.f72021t == eOVar.J2() && this.nr.equals(eOVar.nr()) && this.f72020O.equals(eOVar.KN()) && this.J2.equals(eOVar.Uo())) {
                return true;
            }
        }
        return false;
    }

    @Override // pUk.eO
    public int J2() {
        return this.f72021t;
    }

    @Override // pUk.eO
    public List KN() {
        return this.f72020O;
    }

    @Override // pUk.eO
    public eO.n Uo() {
        return this.J2;
    }

    public int hashCode() {
        return ((((((this.f72021t ^ 1000003) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f72020O.hashCode()) * 1000003) ^ this.J2.hashCode();
    }

    @Override // pUk.eO
    public String nr() {
        return this.nr;
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f72021t + ", collectionGroup=" + this.nr + ", segments=" + this.f72020O + ", indexState=" + this.J2 + "}";
    }

    j(int i2, String str, List list, eO.n nVar) {
        this.f72021t = i2;
        if (str != null) {
            this.nr = str;
            if (list != null) {
                this.f72020O = list;
                if (nVar != null) {
                    this.J2 = nVar;
                    return;
                }
                throw new NullPointerException("Null indexState");
            }
            throw new NullPointerException("Null segments");
        }
        throw new NullPointerException("Null collectionGroup");
    }
}
