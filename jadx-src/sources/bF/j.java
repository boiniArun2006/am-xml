package bF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f43219n;
    private final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f43220t;

    @Override // bF.w6
    public Wre O() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w6) {
            w6 w6Var = (w6) obj;
            Integer num = this.f43219n;
            if (num != null ? num.equals(w6Var.n()) : w6Var.n() == null) {
                if (this.rl.equals(w6Var.t()) && this.f43220t.equals(w6Var.nr())) {
                    w6Var.O();
                    w6Var.rl();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bF.w6
    public Ml rl() {
        return null;
    }

    public int hashCode() {
        Integer num = this.f43219n;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f43220t.hashCode()) * (-721379959);
    }

    @Override // bF.w6
    public Integer n() {
        return this.f43219n;
    }

    @Override // bF.w6
    public I28 nr() {
        return this.f43220t;
    }

    @Override // bF.w6
    public Object t() {
        return this.rl;
    }

    public String toString() {
        return "Event{code=" + this.f43219n + ", payload=" + this.rl + ", priority=" + this.f43220t + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }

    j(Integer num, Object obj, I28 i28, Wre wre, Ml ml) {
        this.f43219n = num;
        if (obj != null) {
            this.rl = obj;
            if (i28 != null) {
                this.f43220t = i28;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }
}
