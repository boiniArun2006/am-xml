package LF5;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    public static Object n(int i2, Object obj, j jVar, w6 w6Var) {
        Object objApply;
        if (i2 < 1) {
            return jVar.apply(obj);
        }
        do {
            objApply = jVar.apply(obj);
            obj = w6Var.n(obj, objApply);
            if (obj == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return objApply;
    }
}
