package eZ;

import eZ.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Dsr extends aC {
    Dsr(Object obj, Object obj2) {
        super(obj, obj2, CN3.xMQ(), CN3.xMQ());
    }

    @Override // eZ.fuX
    public boolean n() {
        return true;
    }

    Dsr(Object obj, Object obj2, fuX fux, fuX fux2) {
        super(obj, obj2, fux, fux2);
    }

    @Override // eZ.aC
    protected fuX.j az() {
        return fuX.j.RED;
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
        return new Dsr(obj, obj2, fux, fux2);
    }

    @Override // eZ.fuX
    public int size() {
        return t().size() + 1 + nr().size();
    }
}
