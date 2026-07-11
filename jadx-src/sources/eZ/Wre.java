package eZ;

import eZ.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Wre extends aC {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f63763O;

    @Override // eZ.fuX
    public boolean n() {
        return false;
    }

    @Override // eZ.aC
    void Z(fuX fux) {
        if (this.f63763O != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.Z(fux);
    }

    @Override // eZ.aC
    protected fuX.j az() {
        return fuX.j.BLACK;
    }

    @Override // eZ.aC
    protected aC gh(Object obj, Object obj2, fuX fux, fuX fux2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (fux == null) {
            fux = t();
        }
        if (fux2 == null) {
            fux2 = nr();
        }
        return new Wre(obj, obj2, fux, fux2);
    }

    @Override // eZ.fuX
    public int size() {
        if (this.f63763O == -1) {
            this.f63763O = t().size() + 1 + nr().size();
        }
        return this.f63763O;
    }

    Wre(Object obj, Object obj2, fuX fux, fuX fux2) {
        super(obj, obj2, fux, fux2);
        this.f63763O = -1;
    }
}
