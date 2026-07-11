package com.facebook.datasource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n implements I28 {
    protected abstract void J2(w6 w6Var);

    protected abstract void O(w6 w6Var);

    @Override // com.facebook.datasource.I28
    public void n(w6 w6Var) {
    }

    @Override // com.facebook.datasource.I28
    public void rl(w6 w6Var) {
        try {
            O(w6Var);
        } finally {
            w6Var.close();
        }
    }

    @Override // com.facebook.datasource.I28
    public void t(w6 w6Var) {
        boolean zRl = w6Var.rl();
        try {
            J2(w6Var);
        } finally {
            if (zRl) {
                w6Var.close();
            }
        }
    }
}
