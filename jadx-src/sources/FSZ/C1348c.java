package FSZ;

/* JADX INFO: renamed from: FSZ.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C1348c implements Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q f2609n;
    private final SPz rl;

    @Override // FSZ.Q
    public Pj0.j O(Object obj, Pj0.j jVar) {
        this.rl.t(obj);
        return this.f2609n.O(obj, jVar);
    }

    @Override // FSZ.Q
    public Pj0.j get(Object obj) {
        Pj0.j jVar = this.f2609n.get(obj);
        if (jVar == null) {
            this.rl.rl(obj);
            return jVar;
        }
        this.rl.n(obj);
        return jVar;
    }

    @Override // FSZ.Q
    public void rl(Object obj) {
        this.f2609n.rl(obj);
    }

    public C1348c(Q q2, SPz sPz) {
        this.f2609n = q2;
        this.rl = sPz;
    }
}
